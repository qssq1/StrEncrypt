package newencrypt;

class C0184ooMy extends oOMyAbstract {
    private static final int[] oO = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] oo = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private int OO;
    private final int[] Oo;
    private int o0;

    public  C0184ooMy(int i, byte[] bArr) {
        this.o = bArr;
        this.Oo = (i & 8) == 0 ? oO : oo;
        this.o0 = 0;
        this.OO = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o(byte[] bArr, int i, int i2, boolean z) {
        if (this.o0 == 6) {
            return false;
        }
        int i3 = i2 + i;
        int i4 = this.o0;
        int i5 = this.OO;
        int i6 = 0;
        byte[] bArr2 = this.o;
        int[] iArr = this.Oo;
        int i7 = i;
        while (i7 < i3) {
            if (i4 == 0) {
             current:   while (i7 + 4 <= i3) {
                    i5 = (((iArr[bArr[i7] & 255] << 18) | (iArr[bArr[i7 + 1] & 255] << 12)) | (iArr[bArr[i7 + 2] & 255] << 6)) | iArr[bArr[i7 + 3] & 255];
                    if (i5 >= 0) {
                        bArr2[i6 + 2] = (byte) i5;
                        bArr2[i6 + 1] = (byte) (i5 >> 8);
                        bArr2[i6] = (byte) (i5 >> 16);
                        i6 += 3;
                        i7 += 4;
                    } else if (i7 >= i3) {//i5��ѭ���ˡ�
                        i7 = i5;
                        if (z) {
                            switch (i4) {
                                case 1:
                                    this.o0 = 6;
                                    return false;
                                case 2:
                                    i5 = i6 + 1;
                                    bArr2[i6] = (byte) (i7 >> 4);
                                    i6 = i5;
                                    break;
                                case 3:
                                    i5 = i6 + 1;
                                    bArr2[i6] = (byte) (i7 >> 10);
                                    i6 = i5 + 1;
                                    bArr2[i5] = (byte) (i7 >> 2);
                                    break;
                                case 4:
                                    this.o0 = 6;
                                    return false;
                            }
                            this.o0 = i4;
                            this.sb0 = i6;
                            return true;
                        }
                        this.o0 = i4;
                        this.OO = i7;
                        this.sb0 = i6;
                        return true;
                    }else{
                    	
                    }
                }
                if (i7 >= i3) {
                    i7 = i5;
                    if (z) {
                        switch (i4) {
                            case 1:
                                this.o0 = 6;
                                return false;
                            case 2:
                                i5 = i6 + 1;
                                bArr2[i6] = (byte) (i7 >> 4);
                                i6 = i5;
                                break;
                            case 3:
                                i5 = i6 + 1;
                                bArr2[i6] = (byte) (i7 >> 10);
                                i6 = i5 + 1;
                                bArr2[i5] = (byte) (i7 >> 2);
                                break;
                            case 4:
                                this.o0 = 6;
                                return false;
                        }
                        this.o0 = i4;
                        this.sb0 = i6;
                        return true;
                    }
                    this.o0 = i4;
                    this.OO = i7;
                    this.sb0 = i6;
                    return true;
                }
            }
            i = i7 + 1;
            i7 = iArr[bArr[i7] & 255];
            int i8;
            switch (i4) {
                case 0:
                    if (i7 >= 0) {
                        i8 = i7;
                        i7 = i4 + 1;
                        i5 = i8;
                        continue;
                    } else if (i7 != -1) {
                        this.o0 = 6;
                        return false;
                    }
                case 1:
                    if (i7 >= 0) {
                        i5 = (i5 << 6) | i7;
                        i7 = i4 + 1;
                        continue;
                    } else if (i7 != -1) {
                        this.o0 = 6;
                        return false;
                    }
                case 2:
                    if (i7 >= 0) {
                        i5 = (i5 << 6) | i7;
                        i7 = i4 + 1;
                        continue;
                    } else if (i7 == -2) {
                        i7 = i6 + 1;
                        bArr2[i6] = (byte) (i5 >> 4);
                        i8 = i7;
                        i7 = 4;
                        i6 = i8;
                        break;
                    } else if (i7 != -1) {
                        this.o0 = 6;
                        return false;
                    }
                case 3:
                    if (i7 >= 0) {
                        i5 = (i5 << 6) | i7;
                        bArr2[i6 + 2] = (byte) i5;
                        bArr2[i6 + 1] = (byte) (i5 >> 8);
                        bArr2[i6] = (byte) (i5 >> 16);
                        i6 += 3;
                        i7 = 0;
                        continue;
                    } else if (i7 == -2) {
                        bArr2[i6 + 1] = (byte) (i5 >> 2);
                        bArr2[i6] = (byte) (i5 >> 10);
                        i6 += 2;
                        i7 = 5;
                        break;
                    } else if (i7 != -1) {
                        this.o0 = 6;
                        return false;
                    }
                case 4:
                    if (i7 == -2) {
                        i7 = i4 + 1;
                        continue;
                    } else if (i7 != -1) {
                        this.o0 = 6;
                        return false;
                    }
                case 5:
                    if (i7 != -1) {
                        this.o0 = 6;
                        return false;
                    }
                    i7 = i4;
                    break;
            }
            i7 = i4;
            i4 = i7;
            i7 = i;
        }
        i7 = i5;
        if (z) {
            this.o0 = i4;
            this.OO = i7;
            this.sb0 = i6;
            return true;
        }
        switch (i4) {
            case 1:
                this.o0 = 6;
                return false;
            case 2:
                i5 = i6 + 1;
                bArr2[i6] = (byte) (i7 >> 4);
                i6 = i5;
                break;
            case 3:
                i5 = i6 + 1;
                bArr2[i6] = (byte) (i7 >> 10);
                i6 = i5 + 1;
                bArr2[i5] = (byte) (i7 >> 2);
                break;
            case 4:
                this.o0 = 6;
                return false;
        }
        this.o0 = i4;
        this.sb0 = i6;
        return true;
    }
}
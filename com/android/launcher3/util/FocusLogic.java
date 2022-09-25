package com.android.launcher3.util;

import android.view.View;
import com.android.launcher3.CellLayout;
import com.android.launcher3.ShortcutAndWidgetContainer;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: PG */
public final class FocusLogic {
    private static int[][] createFullMatrix(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        for (int i3 = 0; i3 < i; i3++) {
            Arrays.fill(iArr2[i3], -1);
        }
        return iArr2;
    }

    public static int[][] createSparseMatrix(CellLayout cellLayout) {
        ShortcutAndWidgetContainer shortcutAndWidgetContainer = cellLayout.mShortcutsAndWidgets;
        int i = cellLayout.mCountX;
        int i2 = cellLayout.mCountY;
        boolean invertLayoutHorizontally = shortcutAndWidgetContainer.invertLayoutHorizontally();
        int[][] createFullMatrix = createFullMatrix(i, i2);
        for (int i3 = 0; i3 < shortcutAndWidgetContainer.getChildCount(); i3++) {
            View childAt = shortcutAndWidgetContainer.getChildAt(i3);
            if (childAt.isFocusable()) {
                int i4 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellX;
                int i5 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellY;
                if (invertLayoutHorizontally) {
                    i4 = (i - i4) - 1;
                }
                createFullMatrix[i4][i5] = i3;
            }
        }
        return createFullMatrix;
    }

    public static int[][] createSparseMatrixWithHotseat(CellLayout cellLayout, CellLayout cellLayout2, boolean z, int i) {
        int i2;
        int i3;
        ShortcutAndWidgetContainer shortcutAndWidgetContainer = cellLayout.mShortcutsAndWidgets;
        ShortcutAndWidgetContainer shortcutAndWidgetContainer2 = cellLayout2.mShortcutsAndWidgets;
        boolean z2 = true;
        if (!z ? cellLayout2.mCountY <= cellLayout.mCountY : cellLayout2.mCountX <= cellLayout.mCountX) {
            z2 = false;
        }
        if (z) {
            i3 = cellLayout2.mCountX;
            i2 = cellLayout.mCountY + cellLayout2.mCountY;
        } else {
            i3 = cellLayout.mCountX + cellLayout2.mCountX;
            i2 = cellLayout2.mCountY;
        }
        int[][] createFullMatrix = createFullMatrix(i3, i2);
        if (z2) {
            if (z) {
                for (int i4 = 0; i4 < i2; i4++) {
                    createFullMatrix[i][i4] = -11;
                }
            } else {
                for (int i5 = 0; i5 < i3; i5++) {
                    createFullMatrix[i5][i] = -11;
                }
            }
        }
        for (int i6 = 0; i6 < shortcutAndWidgetContainer.getChildCount(); i6++) {
            View childAt = shortcutAndWidgetContainer.getChildAt(i6);
            if (childAt.isFocusable()) {
                int i7 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellX;
                int i8 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellY;
                if (z2) {
                    if (z && i7 >= i) {
                        i7++;
                    }
                    if (!z && i8 >= i) {
                        i8++;
                    }
                }
                createFullMatrix[i7][i8] = i6;
            }
        }
        int childCount = shortcutAndWidgetContainer2.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return createFullMatrix;
            }
            if (z) {
                createFullMatrix[((CellLayout.LayoutParams) shortcutAndWidgetContainer2.getChildAt(childCount).getLayoutParams()).cellX][cellLayout.mCountY] = shortcutAndWidgetContainer.getChildCount() + childCount;
            } else {
                createFullMatrix[cellLayout.mCountX][((CellLayout.LayoutParams) shortcutAndWidgetContainer2.getChildAt(childCount).getLayoutParams()).cellY] = shortcutAndWidgetContainer.getChildCount() + childCount;
            }
        }
    }

    public static int[][] createSparseMatrixWithPivotColumn(CellLayout cellLayout, int i, int i2) {
        ShortcutAndWidgetContainer shortcutAndWidgetContainer = cellLayout.mShortcutsAndWidgets;
        int[][] createFullMatrix = createFullMatrix(cellLayout.mCountX + 1, cellLayout.mCountY);
        for (int i3 = 0; i3 < shortcutAndWidgetContainer.getChildCount(); i3++) {
            View childAt = shortcutAndWidgetContainer.getChildAt(i3);
            if (childAt.isFocusable()) {
                int i4 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellX;
                int i5 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellY;
                if (i < 0) {
                    createFullMatrix[i4 - i][i5] = i3;
                } else {
                    createFullMatrix[i4][i5] = i3;
                }
            }
        }
        if (i < 0) {
            createFullMatrix[0][i2] = 100;
        } else {
            createFullMatrix[i][i2] = 100;
        }
        return createFullMatrix;
    }

    private static int handleDpadHorizontal(int i, int i2, int i3, int[][] iArr, int i4, boolean z) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int[][] iArr2 = iArr;
        int i8 = i4;
        if (iArr2 != null) {
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < i6; i11++) {
                for (int i12 = 0; i12 < i7; i12++) {
                    int i13 = iArr2[i11][i12];
                    if (i13 == i5) {
                        i10 = i12;
                    }
                    if (i13 == i5) {
                        i9 = i11;
                    }
                }
            }
            int i14 = i9 + i8;
            int i15 = -1;
            while (i14 >= 0 && i14 < i6) {
                i15 = inspectMatrix(i14, i10, i6, i7, iArr2);
                if (i15 != -1 && i15 != -11) {
                    return i15;
                }
                i14 += i8;
            }
            boolean z2 = false;
            boolean z3 = false;
            for (int i16 = 1; i16 < i7; i16++) {
                int i17 = i16 * i8;
                int i18 = i10 + i17;
                int i19 = i10 - i17;
                int i20 = i17 + i9;
                z2 = (!(inspectMatrix(i20, i18, i6, i7, iArr2) != -11)) | z2;
                if (inspectMatrix(i20, i19, i6, i7, iArr2) == -11) {
                    z3 = true;
                }
                while (i20 >= 0 && i20 < i6) {
                    int inspectMatrix = inspectMatrix(i20, ((!z2 || i20 >= i6 + -1) ? 0 : i8) + i18, i6, i7, iArr2);
                    if (inspectMatrix != -1) {
                        return inspectMatrix;
                    }
                    i15 = inspectMatrix(i20, ((!z3 || i20 >= i6 + -1) ? 0 : -i8) + i19, i6, i7, iArr2);
                    if (i15 != -1) {
                        return i15;
                    }
                    i20 += i8;
                }
            }
            if (i5 == 100) {
                return z ? i8 < 0 ? -8 : -4 : i8 < 0 ? -4 : -8;
            }
            return i15;
        }
        throw new IllegalStateException("Dpad navigation requires a matrix.");
    }

    private static int handleDpadVertical(int i, int i2, int i3, int[][] iArr, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int[][] iArr2 = iArr;
        int i8 = i4;
        if (iArr2 != null) {
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < i6; i11++) {
                for (int i12 = 0; i12 < i7; i12++) {
                    int i13 = iArr2[i11][i12];
                    if (i13 == i5) {
                        i9 = i12;
                    }
                    if (i13 == i5) {
                        i10 = i11;
                    }
                }
            }
            int i14 = i9 + i8;
            int i15 = -1;
            while (i14 >= 0 && i14 < i7) {
                i15 = inspectMatrix(i10, i14, i6, i7, iArr2);
                if (i15 != -1 && i15 != -11) {
                    return i15;
                }
                i14 += i8;
            }
            boolean z = false;
            boolean z2 = false;
            for (int i16 = 1; i16 < i6; i16++) {
                int i17 = i16 * i8;
                int i18 = i10 + i17;
                int i19 = i10 - i17;
                int i20 = i17 + i9;
                z |= !(inspectMatrix(i18, i20, i6, i7, iArr2) != -11);
                if (inspectMatrix(i19, i20, i6, i7, iArr2) == -11) {
                    z2 = true;
                }
                while (i20 >= 0 && i20 < i7) {
                    int inspectMatrix = inspectMatrix(((!z || i20 >= i7 + -1) ? 0 : i8) + i18, i20, i6, i7, iArr2);
                    if (inspectMatrix != -1) {
                        return inspectMatrix;
                    }
                    i15 = inspectMatrix(((!z2 || i20 >= i7 + -1) ? 0 : -i8) + i19, i20, i6, i7, iArr2);
                    if (i15 != -1) {
                        return i15;
                    }
                    i20 += i8;
                }
            }
            return i15;
        }
        throw new IllegalStateException("Dpad navigation requires a matrix.");
    }

    public static int handleKeyEvent(int i, int[][] iArr, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int length = iArr == null ? -1 : iArr.length;
        int length2 = iArr == null ? -1 : iArr[0].length;
        if (i != 92) {
            if (i != 93) {
                if (i == 122) {
                    return -6;
                }
                if (i == 123) {
                    return -7;
                }
                switch (i) {
                    case 19:
                        return handleDpadVertical(i2, length, length2, iArr, -1);
                    case 20:
                        return handleDpadVertical(i2, length, length2, iArr, 1);
                    case 21:
                        i5 = handleDpadHorizontal(i2, length, length2, iArr, -1, z);
                        if (z || i5 != -1) {
                            i6 = i5;
                        } else if (i3 > 0) {
                            return -2;
                        } else {
                            i6 = -1;
                        }
                        if (z && i6 == -1 && i3 < i4 - 1) {
                            return -10;
                        }
                    case 22:
                        i5 = handleDpadHorizontal(i2, length, length2, iArr, 1, z);
                        if (z || i5 != -1) {
                            i7 = i5;
                        } else if (i3 < i4 - 1) {
                            return -9;
                        } else {
                            i7 = -1;
                        }
                        if (z && i7 == -1 && i3 > 0) {
                            return -5;
                        }
                    default:
                        return -1;
                }
                return i5;
            } else if (i3 < i4 - 1) {
                return -8;
            } else {
                return -7;
            }
        } else if (i3 > 0) {
            return -3;
        } else {
            return -6;
        }
    }

    private static int inspectMatrix(int i, int i2, int i3, int i4, int[][] iArr) {
        int i5;
        if (i < 0 || i >= i3 || i2 < 0 || i2 >= i4 || (i5 = iArr[i][i2]) == -1) {
            return -1;
        }
        return i5;
    }

    public static boolean shouldConsume(int i) {
        return i == 21 || i == 22 || i == 19 || i == 20 || i == 122 || i == 123 || i == 92 || i == 93 || i == 67 || i == 112;
    }
}

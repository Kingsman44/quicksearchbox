package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C1761t;

/* renamed from: androidx.constraintlayout.motion.widget.d */
/* compiled from: PG */
final class C1719d {

    /* renamed from: a */
    private static final SparseIntArray f5018a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5018a = sparseIntArray;
        int[] iArr = C1761t.f5459a;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(11, 2);
        sparseIntArray.append(7, 4);
        sparseIntArray.append(8, 5);
        sparseIntArray.append(9, 6);
        sparseIntArray.append(1, 19);
        sparseIntArray.append(2, 20);
        sparseIntArray.append(5, 7);
        sparseIntArray.append(18, 8);
        sparseIntArray.append(17, 9);
        sparseIntArray.append(15, 10);
        sparseIntArray.append(13, 12);
        sparseIntArray.append(12, 13);
        sparseIntArray.append(6, 14);
        sparseIntArray.append(3, 15);
        sparseIntArray.append(4, 16);
        sparseIntArray.append(10, 17);
        sparseIntArray.append(14, 18);
    }

    /* renamed from: a */
    public static void m4670a(C1720e eVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f5018a;
            switch (sparseIntArray.get(index)) {
                case 1:
                    eVar.f5020g = typedArray.getFloat(index, eVar.f5020g);
                    break;
                case 2:
                    eVar.f5021h = typedArray.getDimension(index, eVar.f5021h);
                    break;
                case 4:
                    eVar.f5022i = typedArray.getFloat(index, eVar.f5022i);
                    break;
                case 5:
                    eVar.f5023j = typedArray.getFloat(index, eVar.f5023j);
                    break;
                case 6:
                    eVar.f5024k = typedArray.getFloat(index, eVar.f5024k);
                    break;
                case 7:
                    eVar.f5028o = typedArray.getFloat(index, eVar.f5028o);
                    break;
                case 8:
                    eVar.f5027n = typedArray.getFloat(index, eVar.f5027n);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (!MotionLayout.f4817a) {
                        if (typedArray.peekValue(index).type != 3) {
                            eVar.f5014b = typedArray.getResourceId(index, eVar.f5014b);
                            break;
                        } else {
                            eVar.f5015c = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = typedArray.getResourceId(index, eVar.f5014b);
                        eVar.f5014b = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            eVar.f5015c = typedArray.getString(index);
                            break;
                        }
                    }
                case 12:
                    eVar.f5013a = typedArray.getInt(index, eVar.f5013a);
                    break;
                case 13:
                    eVar.f5019f = typedArray.getInteger(index, eVar.f5019f);
                    break;
                case 14:
                    eVar.f5029p = typedArray.getFloat(index, eVar.f5029p);
                    break;
                case 15:
                    eVar.f5030q = typedArray.getDimension(index, eVar.f5030q);
                    break;
                case 16:
                    eVar.f5031r = typedArray.getDimension(index, eVar.f5031r);
                    break;
                case 17:
                    eVar.f5032s = typedArray.getDimension(index, eVar.f5032s);
                    break;
                case 18:
                    eVar.f5033t = typedArray.getFloat(index, eVar.f5033t);
                    break;
                case 19:
                    eVar.f5025l = typedArray.getDimension(index, eVar.f5025l);
                    break;
                case 20:
                    eVar.f5026m = typedArray.getDimension(index, eVar.f5026m);
                    break;
                default:
                    String hexString = Integer.toHexString(index);
                    int i2 = sparseIntArray.get(index);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                    sb.append("unused attribute 0x");
                    sb.append(hexString);
                    sb.append("   ");
                    sb.append(i2);
                    Log.e("KeyAttribute", sb.toString());
                    break;
            }
        }
    }
}

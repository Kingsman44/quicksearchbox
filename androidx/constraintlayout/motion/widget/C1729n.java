package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C1761t;

/* renamed from: androidx.constraintlayout.motion.widget.n */
/* compiled from: PG */
final class C1729n {

    /* renamed from: a */
    private static final SparseIntArray f5089a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5089a = sparseIntArray;
        int[] iArr = C1761t.f5459a;
        sparseIntArray.append(0, 8);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 1);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(7, 6);
        sparseIntArray.append(9, 5);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(2, 10);
        sparseIntArray.append(8, 11);
        sparseIntArray.append(10, 12);
        sparseIntArray.append(11, 13);
        sparseIntArray.append(12, 14);
    }

    /* renamed from: a */
    public static void m4692a(C1730o oVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f5089a;
            switch (sparseIntArray.get(index)) {
                case 1:
                    oVar.f5092h = typedArray.getString(index);
                    break;
                case 2:
                    oVar.f5093i = typedArray.getString(index);
                    break;
                case 4:
                    oVar.f5090f = typedArray.getString(index);
                    break;
                case 5:
                    oVar.f5096l = typedArray.getFloat(index, oVar.f5096l);
                    break;
                case 6:
                    oVar.f5094j = typedArray.getResourceId(index, oVar.f5094j);
                    break;
                case 7:
                    if (!MotionLayout.f4817a) {
                        if (typedArray.peekValue(index).type != 3) {
                            oVar.f5014b = typedArray.getResourceId(index, oVar.f5014b);
                            break;
                        } else {
                            oVar.f5015c = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = typedArray.getResourceId(index, oVar.f5014b);
                        oVar.f5014b = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            oVar.f5015c = typedArray.getString(index);
                            break;
                        }
                    }
                case 8:
                    int integer = typedArray.getInteger(index, oVar.f5013a);
                    oVar.f5013a = integer;
                    oVar.f5097m = (((float) integer) + 0.5f) / 100.0f;
                    break;
                case 9:
                    oVar.f5095k = typedArray.getResourceId(index, oVar.f5095k);
                    break;
                case 10:
                    oVar.f5098n = typedArray.getBoolean(index, oVar.f5098n);
                    break;
                case 11:
                    oVar.f5091g = typedArray.getResourceId(index, oVar.f5091g);
                    break;
                case 12:
                    oVar.f5101q = typedArray.getResourceId(index, oVar.f5101q);
                    break;
                case 13:
                    oVar.f5099o = typedArray.getResourceId(index, oVar.f5099o);
                    break;
                case 14:
                    oVar.f5100p = typedArray.getResourceId(index, oVar.f5100p);
                    break;
                default:
                    String hexString = Integer.toHexString(index);
                    int i2 = sparseIntArray.get(index);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                    sb.append("unused attribute 0x");
                    sb.append(hexString);
                    sb.append("   ");
                    sb.append(i2);
                    Log.e("KeyTrigger", sb.toString());
                    break;
            }
        }
    }
}

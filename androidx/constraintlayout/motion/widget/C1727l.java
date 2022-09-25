package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C1761t;

/* renamed from: androidx.constraintlayout.motion.widget.l */
/* compiled from: PG */
final class C1727l {

    /* renamed from: a */
    private static final SparseIntArray f5071a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5071a = sparseIntArray;
        int[] iArr = C1761t.f5459a;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(9, 2);
        sparseIntArray.append(5, 4);
        sparseIntArray.append(6, 5);
        sparseIntArray.append(7, 6);
        sparseIntArray.append(3, 7);
        sparseIntArray.append(15, 8);
        sparseIntArray.append(14, 9);
        sparseIntArray.append(13, 10);
        sparseIntArray.append(11, 12);
        sparseIntArray.append(10, 13);
        sparseIntArray.append(4, 14);
        sparseIntArray.append(1, 15);
        sparseIntArray.append(2, 16);
        sparseIntArray.append(8, 17);
        sparseIntArray.append(12, 18);
        sparseIntArray.append(18, 20);
        sparseIntArray.append(17, 21);
        sparseIntArray.append(20, 19);
    }

    /* renamed from: a */
    public static void m4686a(C1728m mVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f5071a;
            switch (sparseIntArray.get(index)) {
                case 1:
                    mVar.f5074h = typedArray.getFloat(index, mVar.f5074h);
                    break;
                case 2:
                    mVar.f5075i = typedArray.getDimension(index, mVar.f5075i);
                    break;
                case 4:
                    mVar.f5076j = typedArray.getFloat(index, mVar.f5076j);
                    break;
                case 5:
                    mVar.f5077k = typedArray.getFloat(index, mVar.f5077k);
                    break;
                case 6:
                    mVar.f5078l = typedArray.getFloat(index, mVar.f5078l);
                    break;
                case 7:
                    mVar.f5080n = typedArray.getFloat(index, mVar.f5080n);
                    break;
                case 8:
                    mVar.f5079m = typedArray.getFloat(index, mVar.f5079m);
                    break;
                case 9:
                    mVar.f5072f = typedArray.getString(index);
                    break;
                case 10:
                    if (!MotionLayout.f4817a) {
                        if (typedArray.peekValue(index).type != 3) {
                            mVar.f5014b = typedArray.getResourceId(index, mVar.f5014b);
                            break;
                        } else {
                            mVar.f5015c = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = typedArray.getResourceId(index, mVar.f5014b);
                        mVar.f5014b = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            mVar.f5015c = typedArray.getString(index);
                            break;
                        }
                    }
                case 12:
                    mVar.f5013a = typedArray.getInt(index, mVar.f5013a);
                    break;
                case 13:
                    mVar.f5073g = typedArray.getInteger(index, mVar.f5073g);
                    break;
                case 14:
                    mVar.f5081o = typedArray.getFloat(index, mVar.f5081o);
                    break;
                case 15:
                    mVar.f5082p = typedArray.getDimension(index, mVar.f5082p);
                    break;
                case 16:
                    mVar.f5083q = typedArray.getDimension(index, mVar.f5083q);
                    break;
                case 17:
                    mVar.f5084r = typedArray.getDimension(index, mVar.f5084r);
                    break;
                case 18:
                    mVar.f5085s = typedArray.getFloat(index, mVar.f5085s);
                    break;
                case 19:
                    if (typedArray.peekValue(index).type != 3) {
                        mVar.f5086t = typedArray.getInt(index, mVar.f5086t);
                        break;
                    } else {
                        typedArray.getString(index);
                        mVar.f5086t = 7;
                        break;
                    }
                case 20:
                    mVar.f5087u = typedArray.getFloat(index, mVar.f5087u);
                    break;
                case 21:
                    if (typedArray.peekValue(index).type != 5) {
                        mVar.f5088v = typedArray.getFloat(index, mVar.f5088v);
                        break;
                    } else {
                        mVar.f5088v = typedArray.getDimension(index, mVar.f5088v);
                        break;
                    }
                default:
                    String hexString = Integer.toHexString(index);
                    int i2 = sparseIntArray.get(index);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                    sb.append("unused attribute 0x");
                    sb.append(hexString);
                    sb.append("   ");
                    sb.append(i2);
                    Log.e("KeyTimeCycle", sb.toString());
                    break;
            }
        }
    }
}

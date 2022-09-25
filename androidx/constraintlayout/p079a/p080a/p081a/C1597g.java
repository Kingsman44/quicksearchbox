package androidx.constraintlayout.p079a.p080a.p081a;

import java.util.HashMap;

/* renamed from: androidx.constraintlayout.a.a.a.g */
/* compiled from: PG */
public final class C1597g {

    /* renamed from: a */
    public final HashMap f4401a = new HashMap();

    /* renamed from: a */
    public final float mo4524a(Object obj, String str) {
        HashMap hashMap;
        float[] fArr;
        if (this.f4401a.containsKey(obj) && (hashMap = (HashMap) this.f4401a.get(obj)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}

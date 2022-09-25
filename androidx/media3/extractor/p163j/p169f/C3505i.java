package androidx.media3.extractor.p163j.p169f;

import java.util.Map;

/* renamed from: androidx.media3.extractor.j.f.i */
/* compiled from: PG */
final class C3505i {
    /* renamed from: a */
    public static C3506j m10130a(C3506j jVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (jVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (C3506j) map.get(strArr[0]);
            }
            if (length2 > 1) {
                C3506j jVar2 = new C3506j();
                while (i < length2) {
                    jVar2.mo7444b((C3506j) map.get(strArr[i]));
                    i++;
                }
                return jVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            jVar.mo7444b((C3506j) map.get(strArr[0]));
            return jVar;
        } else if (strArr != null && (length = strArr.length) > 1) {
            while (i < length) {
                jVar.mo7444b((C3506j) map.get(strArr[i]));
                i++;
            }
        }
        return jVar;
    }
}

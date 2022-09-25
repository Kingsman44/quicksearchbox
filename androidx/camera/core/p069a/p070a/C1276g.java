package androidx.camera.core.p069a.p070a;

import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: androidx.camera.core.a.a.g */
/* compiled from: PG */
final class C1276g implements Enumeration {

    /* renamed from: a */
    int f3687a = 0;

    public final boolean hasMoreElements() {
        int i = this.f3687a;
        int i2 = C1280k.f3700e;
        return i < 4;
    }

    public final /* bridge */ /* synthetic */ Object nextElement() {
        HashMap hashMap = new HashMap();
        for (C1282m mVar : C1280k.f3698b[this.f3687a]) {
            hashMap.put(mVar.f3715b, mVar);
        }
        this.f3687a++;
        return hashMap;
    }
}

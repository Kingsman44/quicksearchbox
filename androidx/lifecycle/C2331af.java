package androidx.lifecycle;

import androidx.p054b.p055a.p057b.C0894h;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.lifecycle.af */
/* compiled from: PG */
public class C2331af extends C2332ag {

    /* renamed from: h */
    public final C0894h f6530h = new C0894h();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo5677g() {
        Iterator it = this.f6530h.iterator();
        while (it.hasNext()) {
            C2330ae aeVar = (C2330ae) ((Map.Entry) it.next()).getValue();
            aeVar.f6527a.mo5705f(aeVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo5678h() {
        Iterator it = this.f6530h.iterator();
        while (it.hasNext()) {
            C2330ae aeVar = (C2330ae) ((Map.Entry) it.next()).getValue();
            aeVar.f6527a.mo5679j(aeVar);
        }
    }

    /* renamed from: n */
    public final void mo5727n(LiveData liveData, C2333ah ahVar) {
        if (liveData != null) {
            C2330ae aeVar = new C2330ae(liveData, ahVar);
            C2330ae aeVar2 = (C2330ae) this.f6530h.mo3515e(liveData, aeVar);
            if (aeVar2 != null && aeVar2.f6528b != ahVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (aeVar2 == null && mo5709m()) {
                aeVar.f6527a.mo5705f(aeVar);
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }
}

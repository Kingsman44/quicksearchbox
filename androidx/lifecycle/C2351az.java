package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C4087c;
import androidx.savedstate.C4088d;
import java.util.Map;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.az */
/* compiled from: PG */
public final class C2351az implements C4087c {

    /* renamed from: a */
    public Bundle f6554a;

    /* renamed from: b */
    private final C4088d f6555b;

    /* renamed from: c */
    private boolean f6556c;

    /* renamed from: d */
    private final C69613f f6557d;

    public C2351az(C4088d dVar, C2371bs bsVar) {
        C69664n.m101061g(dVar, "savedStateRegistry");
        this.f6555b = dVar;
        this.f6557d = new C69747m(new C2350ay(bsVar));
    }

    /* renamed from: c */
    private final C2353ba m6341c() {
        return (C2353ba) this.f6557d.mo5768a();
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6554a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m6341c().f6559a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = C2344as.m6330a(((C2341ap) ((C2344as) entry.getValue()).f6545c).f6542a);
            if (!C69664n.m101066l(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f6556c = false;
        return bundle;
    }

    /* renamed from: b */
    public final void mo5762b() {
        if (!this.f6556c) {
            this.f6554a = this.f6555b.mo8584a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f6556c = true;
            m6341c();
        }
    }
}

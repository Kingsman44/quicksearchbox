package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29110x;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.d.kl */
/* compiled from: PG */
public final class C29259kl implements C29293ls {

    /* renamed from: a */
    public final Context f79270a;

    /* renamed from: b */
    public final C29658ia f79271b;

    /* renamed from: c */
    private final C42876ab f79272c;

    /* renamed from: d */
    private final Executor f79273d;

    /* renamed from: e */
    private final C28787cb f79274e;

    public C29259kl(Context context, C29658ia iaVar, C42876ab abVar, Executor executor, C28787cb cbVar) {
        this.f79270a = context;
        this.f79271b = iaVar;
        this.f79272c = abVar;
        this.f79273d = executor;
        this.f79274e = cbVar;
    }

    /* renamed from: a */
    public final C60870cx mo34616a() {
        return this.f79272c.mo46039a(C29249kb.f79259a, this.f79273d);
    }

    /* renamed from: b */
    public final C60870cx mo34635b(C29172hf hfVar, int i) {
        C60870cx cxVar;
        if (i > hfVar.f79119d) {
            return C60856cj.m92900i(true);
        }
        C29172hf a = C29172hf.m54126a(i);
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            cxVar = C29670b.m54719g(this.f79272c.mo46039a(new C29251kd(this), this.f79273d)).mo34821h(C29252ke.f79262a, this.f79273d).mo34819e(IOException.class, new C29253kf(this), this.f79273d);
        } else if (ordinal != 2) {
            String name = a.name();
            cxVar = C60856cj.m92899h(new UnsupportedOperationException("Upgrade to version " + name + "not supported!"));
        } else {
            cxVar = C29670b.m54719g(this.f79272c.mo46039a(new C29258kk(this), this.f79273d)).mo34821h(C29240jt.f79243a, this.f79273d).mo34819e(IOException.class, new C29241ju(this), this.f79273d);
        }
        C29248ka kaVar = new C29248ka(this, i, hfVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(kaVar), this.f79273d);
    }

    /* renamed from: c */
    public final C60870cx mo34618c() {
        AtomicReference atomicReference = new AtomicReference(new ArrayList());
        C60870cx a = this.f79272c.mo46039a(new C29239js(this, atomicReference), this.f79273d);
        C29250kc kcVar = new C29250kc(atomicReference);
        return C60922j.m93044g(a, C47810es.m84963c(kcVar), this.f79273d);
    }

    /* renamed from: d */
    public final C60870cx mo34619d() {
        if (C29173hg.m54129c(this.f79270a)) {
            C29172hf a = C29172hf.m54126a(this.f79274e.mo34427g());
            C29172hf a2 = C29173hg.m54127a(this.f79270a, this.f79271b);
            int i = a.f79119d;
            int i2 = a2.f79119d;
            if (i == i2) {
                return C60856cj.m92900i(true);
            }
            if (i < i2) {
                C29045l.m53937i("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", a2, a);
                C29658ia iaVar = this.f79271b;
                String valueOf = String.valueOf(a2);
                String valueOf2 = String.valueOf(a);
                iaVar.mo34497a(new Exception("Downgraded file key from " + valueOf + " to " + valueOf2 + "."), "FileKey migrations unexpected downgrade.", new Object[0]);
                C29173hg.m54130d(this.f79270a, a);
                return C60856cj.m92900i(false);
            }
            return C29670b.m54719g(mo34635b(a, i2 + 1)).mo34820f(Exception.class, new C29245jy(this, a), this.f79273d).mo34822i(new C29246jz(this, a), this.f79273d);
        }
        C29045l.m53930b("%s Device isn't migrated to new file key, clear and set migration.", "ProtoDataStoreSharedFilesMetadata");
        C29173hg.m54131e(this.f79270a);
        C29173hg.m54130d(this.f79270a, C29172hf.m54126a(this.f79274e.mo34427g()));
        return C60856cj.m92900i(false);
    }

    /* renamed from: e */
    public final C60870cx mo34620e(C29398ev evVar) {
        String b = C29110x.m54034b(evVar, this.f79270a, this.f79271b);
        C60870cx d = this.f79272c.mo46042d();
        C29257kj kjVar = new C29257kj(b);
        return C60922j.m93044g(d, C47810es.m84963c(kjVar), this.f79273d);
    }

    /* renamed from: f */
    public final C60870cx mo34621f(C29398ev evVar) {
        return C29670b.m54719g(this.f79272c.mo46039a(new C29242jv(C29110x.m54034b(evVar, this.f79270a, this.f79271b)), this.f79273d)).mo34821h(C29243jw.f79246a, this.f79273d).mo34819e(IOException.class, C29244jx.f79247a, this.f79273d);
    }

    /* renamed from: g */
    public final C60870cx mo34622g(C29398ev evVar, C29402ez ezVar) {
        return C29670b.m54719g(this.f79272c.mo46039a(new C29254kg(C29110x.m54034b(evVar, this.f79270a, this.f79271b), ezVar), this.f79273d)).mo34821h(C29255kh.f79266a, this.f79273d).mo34819e(IOException.class, C29256ki.f79267a, this.f79273d);
    }

    /* renamed from: h */
    public final void mo34636h(C29172hf hfVar) {
        if (C29173hg.m54127a(this.f79270a, this.f79271b).f79119d != hfVar.f79119d && !C29173hg.m54130d(this.f79270a, hfVar)) {
            String valueOf = String.valueOf(hfVar);
            C29045l.m53934f("Failed to commit migration version to disk. Fail to set target version to " + valueOf + ".");
            C29658ia iaVar = this.f79271b;
            String valueOf2 = String.valueOf(hfVar);
            iaVar.mo34497a(new Exception("Fail to set target version " + valueOf2 + "."), "Failed to commit migration version to disk.", new Object[0]);
        }
    }
}

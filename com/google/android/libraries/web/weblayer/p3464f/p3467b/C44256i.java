package com.google.android.libraries.web.weblayer.p3464f.p3467b;

import android.content.Intent;
import com.google.android.libraries.web.profile.C44071f;
import com.google.android.libraries.web.profile.C44072g;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.f.b.i */
/* compiled from: PG */
public final class C44256i implements C44071f {

    /* renamed from: a */
    public final Profile f115102a;

    /* renamed from: b */
    public final C44315a f115103b;

    /* renamed from: c */
    private final C71422aw f115104c;

    /* renamed from: d */
    private final C69585o f115105d;

    /* renamed from: e */
    private final C44266s f115106e;

    public C44256i(Profile profile, C44315a aVar, C71422aw awVar, C69585o oVar, C44267t tVar) {
        this.f115102a = profile;
        this.f115103b = aVar;
        this.f115104c = awVar;
        this.f115105d = oVar;
        Executor executor = (Executor) tVar.f115126a.mo17428b();
        executor.getClass();
        C44315a aVar2 = (C44315a) tVar.f115127b.mo17428b();
        aVar2.getClass();
        this.f115106e = new C44266s(profile, executor, aVar2);
    }

    /* renamed from: a */
    public final Intent mo47028a() {
        if (this.f115103b.mo47210a() < 100) {
            return null;
        }
        C44315a aVar = this.f115103b;
        Profile profile = this.f115102a;
        return aVar.mo47211b(profile.f114483a, profile.f114485c);
    }

    /* renamed from: b */
    public final Intent mo47029b() {
        C44315a aVar = this.f115103b;
        Profile profile = this.f115102a;
        return aVar.mo47212c(profile.f114483a, profile.f114485c);
    }

    /* renamed from: c */
    public final /* synthetic */ C44072g mo47030c() {
        return this.f115106e;
    }

    /* renamed from: d */
    public final C60870cx mo47031d(Set set) {
        C69664n.m101061g(set, "persistenceIds");
        return C71663i.m104692e(this.f115104c, (C71424ay) null, new C44253f(this, set, (C69577g) null), 3);
    }

    /* renamed from: e */
    public final Object mo47032e(C44082a aVar, Set set, C69577g gVar) {
        if (aVar != null) {
            Object a = C71803m.m105040a(this.f115105d, new C44248a(this, set, (C69577g) null), gVar);
            return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* renamed from: f */
    public final Object mo47163f(C69630p pVar, C69577g gVar) {
        return C71803m.m105040a(this.f115105d, new C44255h(pVar, this, (C69577g) null), gVar);
    }
}

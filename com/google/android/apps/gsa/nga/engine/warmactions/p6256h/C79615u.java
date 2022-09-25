package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.apps.gsa.nga.engine.p5956ar.C75034bz;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.u */
/* compiled from: PG */
public final class C79615u implements C90991b, C79607m {

    /* renamed from: b */
    public static final /* synthetic */ int f218413b = 0;

    /* renamed from: c */
    private static final C58974d f218414c = C58974d.m91136j();

    /* renamed from: d */
    private static final C58528ij f218415d = C58476gl.m89803b(EnumSet.of(C80627v.WARMACTIONS, new C80627v[0]));

    /* renamed from: e */
    private static final C58528ij f218416e = C58528ij.m90011K(C79606l.CONFIG_FILE, C79606l.HOTWORD_DATA);

    /* renamed from: a */
    public final C42813k f218417a;

    /* renamed from: f */
    private final AtomicReference f218418f = new AtomicReference((C58495hd) Collection.EL.stream(f218416e).collect(C58370cn.m89403c(Function.CC.identity(), C79609o.f218409a, C79610p.f218410a)));

    /* renamed from: g */
    private final C81013d f218419g;

    public C79615u(C42813k kVar, C81013d dVar) {
        this.f218417a = kVar;
        this.f218419g = dVar;
    }

    /* renamed from: a */
    public final Optional mo74151a(C79606l lVar, C42797g gVar) {
        Optional optional;
        C79614t tVar = (C79614t) ((C58495hd) this.f218418f.get()).get(lVar);
        tVar.getClass();
        Optional c = tVar.mo74145c();
        String str = lVar.f218407c;
        this.f218419g.mo74786b(str, c.isPresent());
        if (c.isEmpty()) {
            ((C58970a) ((C58970a) f218414c.mo56226d()).mo56372aa(5695)).mo56389s("#MWW Missing uri for resource: %s", str);
            return Optional.empty();
        }
        Uri uri = (Uri) c.get();
        try {
            optional = Optional.m71637of(this.f218417a.mo45889c(uri, gVar));
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) f218414c.mo56226d()).mo56382g(e)).mo56372aa(5696)).mo56389s("#MWW Failed to open uri: %s", uri);
            optional = Optional.empty();
        }
        this.f218419g.mo74785a(str, optional.isPresent());
        return optional;
    }

    /* renamed from: b */
    public final C89849ae mo74153b() {
        return C89849ae.NGA_WARMACTIONS_RESOURCE_INITIALIZATION_FAILURE;
    }

    /* renamed from: c */
    public final C89849ae mo74154c() {
        return C89849ae.NGA_WARMACTIONS_RESOURCE_INITIALIZATION_START;
    }

    /* renamed from: d */
    public final C89849ae mo74155d() {
        return C89849ae.NGA_WARMACTIONS_RESOURCE_INITIALIZATION_SUCCESS;
    }

    /* renamed from: e */
    public final C58528ij mo74156e() {
        return f218415d;
    }

    /* renamed from: f */
    public final /* synthetic */ C60870cx mo74157f() {
        return C118826c.f331423b;
    }

    /* renamed from: g */
    public final C60870cx mo74158g(C58495hd hdVar) {
        C58800sl lA = f218415d.iterator();
        while (lA.hasNext()) {
            Optional b = cu.b(hdVar, (C80627v) lA.next());
            if (!b.isEmpty()) {
                DesugarAtomicReference.getAndUpdate(this.f218418f, new C79608n(b));
            }
        }
        return C118826c.f331423b;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MWW MDD resources presence");
        C58800sl lA = ((C58495hd) this.f218418f.get()).values().iterator();
        while (lA.hasNext()) {
            C79614t tVar = (C79614t) lA.next();
            fVar.mo85278b(tVar.mo74143a().f218407c).mo85276a(C90752i.m148231e(tVar.mo74145c()));
        }
    }

    /* renamed from: h */
    public final /* synthetic */ String mo74159h() {
        return C75034bz.m121290a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ EnumSet mo74160i() {
        return EnumSet.noneOf(C80627v.class);
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo74161j() {
        return true;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo74162k(C58528ij ijVar) {
        return false;
    }

    /* renamed from: l */
    public final boolean mo74152l(C79606l lVar) {
        C79614t tVar = (C79614t) ((C58495hd) this.f218418f.get()).get(lVar);
        tVar.getClass();
        return ((Boolean) tVar.mo74145c().map(new C79612r(this)).orElse(false)).booleanValue();
    }
}

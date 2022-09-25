package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.android.apps.gsa.nga.engine.ar.ca;
import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.apps.gsa.nga.engine.p5956ar.C75034bz;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.EnumSet;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.ah */
/* compiled from: PG */
public final class C78674ah implements ca {

    /* renamed from: a */
    public static final C59071e f216589a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.l.e.ah");

    /* renamed from: b */
    public final C22871g f216590b;

    /* renamed from: c */
    public final C42813k f216591c;

    /* renamed from: d */
    public final C78678e f216592d;

    public C78674ah(C22871g gVar, C78678e eVar, C42813k kVar) {
        this.f216590b = gVar;
        this.f216592d = eVar;
        this.f216591c = kVar;
    }

    /* renamed from: b */
    public final C89849ae mo73566b() {
        return C89849ae.NGA_TACTILE_INITIALIZATION_FAILURE;
    }

    /* renamed from: c */
    public final C89849ae mo73567c() {
        return C89849ae.NGA_TACTILE_INITIALIZATION_START;
    }

    /* renamed from: d */
    public final C89849ae mo73568d() {
        return C89849ae.NGA_TACTILE_INITIALIZATION_SUCCESS;
    }

    /* renamed from: e */
    public final C58528ij mo73569e() {
        return new C58759qy(C80627v.TACTILE);
    }

    /* renamed from: f */
    public final /* synthetic */ C60870cx mo73570f() {
        return C118826c.f331423b;
    }

    /* renamed from: g */
    public final C60870cx mo73571g(C58495hd hdVar) {
        return (C60870cx) cu.b(hdVar, C80627v.TACTILE).map(new C78672af(this)).orElse(C118826c.f331423b);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo73572h() {
        return C75034bz.m121290a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ EnumSet mo73573i() {
        return EnumSet.noneOf(C80627v.class);
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo73574j() {
        return true;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo73575k(C58528ij ijVar) {
        return false;
    }
}

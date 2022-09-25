package com.google.android.apps.gsa.nga.engine.geniefm;

import com.google.android.apps.gsa.nga.engine.ak.a.c;
import com.google.android.apps.gsa.nga.engine.ar.ca;
import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.apps.gsa.nga.engine.p5956ar.C75034bz;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.geniefm.i */
/* compiled from: PG */
public final class C76103i implements ca {

    /* renamed from: a */
    public static final C58974d f210989a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f210990b;

    /* renamed from: c */
    public final GenieFmWrapper f210991c;

    /* renamed from: d */
    public final C42813k f210992d;

    /* renamed from: e */
    public final C79851ai f210993e;

    /* renamed from: f */
    public final AtomicBoolean f210994f = new AtomicBoolean(false);

    /* renamed from: g */
    public final c f210995g;

    public C76103i(C22871g gVar, GenieFmWrapper genieFmWrapper, C42813k kVar, C79851ai aiVar, c cVar) {
        this.f210990b = gVar;
        this.f210991c = genieFmWrapper;
        this.f210992d = kVar;
        this.f210993e = aiVar;
        this.f210995g = cVar;
    }

    /* renamed from: b */
    public final C89849ae mo72056b() {
        return C89849ae.NGA_GENIE_FM_INITIALIZATION_FAILURE;
    }

    /* renamed from: c */
    public final C89849ae mo72057c() {
        return C89849ae.NGA_GENIE_FM_INITIALIZATION_START;
    }

    /* renamed from: d */
    public final C89849ae mo72058d() {
        return C89849ae.NGA_GENIE_FM_INITIALIZATION_SUCCESS;
    }

    /* renamed from: e */
    public final C58528ij mo72059e() {
        return C58528ij.m90011K(C80627v.GENIE_FM, C80627v.SAFT_SEGMENTER);
    }

    /* renamed from: f */
    public final C60870cx mo72060f() {
        if (!this.f210994f.get()) {
            return C118826c.f331423b;
        }
        this.f210994f.set(false);
        return this.f210990b.mo28201a("[NGA] GenieFmResourcesManager.destroy", new C76099e(this));
    }

    /* renamed from: g */
    public final C60870cx mo72061g(C58495hd hdVar) {
        Optional b = cu.b(hdVar, C80627v.GENIE_FM);
        return this.f210990b.mo28210j((C60870cx) cu.b(hdVar, C80627v.SAFT_SEGMENTER).map(new C76101g(this)).orElse(C118826c.f331423b), "[NGA] GenieFmResourcesManager.onResourceGroupUpdate", new C76102h(this, b));
    }

    /* renamed from: h */
    public final /* synthetic */ String mo72062h() {
        return C75034bz.m121290a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ EnumSet mo72063i() {
        return EnumSet.noneOf(C80627v.class);
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo72064j() {
        return true;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo72065k(C58528ij ijVar) {
        return false;
    }
}

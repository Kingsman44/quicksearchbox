package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import com.google.android.apps.gsa.nga.engine.ar.ca;
import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.apps.gsa.nga.engine.p5956ar.C75034bz;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60870cx;
import java.util.EnumSet;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.n */
/* compiled from: PG */
public final class C75995n implements ca {

    /* renamed from: a */
    public final C76005x f210817a;

    /* renamed from: b */
    public final C42813k f210818b;

    /* renamed from: c */
    private final C22871g f210819c;

    public C75995n(C76005x xVar, C22871g gVar, C42813k kVar) {
        this.f210817a = xVar;
        this.f210819c = gVar;
        this.f210818b = kVar;
    }

    /* renamed from: b */
    public final C89849ae mo71996b() {
        return C89849ae.NGA_BLACKLIST_INITIALIZATION_FAILURE;
    }

    /* renamed from: c */
    public final C89849ae mo71997c() {
        return C89849ae.NGA_BLACKLIST_INITIALIZATION_START;
    }

    /* renamed from: d */
    public final C89849ae mo71998d() {
        return C89849ae.NGA_BLACKLIST_INITIALIZATION_SUCCESS;
    }

    /* renamed from: e */
    public final C58528ij mo71999e() {
        return new C58759qy(C80627v.SKIP_COMPONENT_LIST);
    }

    /* renamed from: f */
    public final /* synthetic */ C60870cx mo72000f() {
        return C118826c.f331423b;
    }

    /* renamed from: g */
    public final C60870cx mo72001g(C58495hd hdVar) {
        Optional b = cu.b(hdVar, C80627v.SKIP_COMPONENT_LIST);
        if (b.isEmpty()) {
            return C118826c.f331423b;
        }
        return this.f210819c.mo28201a("[NGA] blacklist.BlacklistRulesMddProvider.onResourceGroupUpdate", new C75994m(this, cu.a((C29690f) b.get())));
    }

    /* renamed from: h */
    public final /* synthetic */ String mo72002h() {
        return C75034bz.m121290a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ EnumSet mo72003i() {
        return EnumSet.noneOf(C80627v.class);
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo72004j() {
        return true;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo72005k(C58528ij ijVar) {
        return false;
    }
}

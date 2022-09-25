package com.google.android.apps.gsa.nga.engine.p6040k.p6041a;

import com.google.android.apps.gsa.nga.engine.ar.ca;
import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.apps.gsa.nga.engine.p5956ar.C75034bz;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.assistant.verticals.p10050e.p10051a.C132094h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.EnumSet;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.k.a.m */
/* compiled from: PG */
public final class C76225m implements ca {

    /* renamed from: a */
    public static final C58974d f211234a = C58974d.m91136j();

    /* renamed from: b */
    public final C76455a f211235b;

    /* renamed from: c */
    public final C76231s f211236c;

    /* renamed from: d */
    public final C22871g f211237d;

    /* renamed from: e */
    private final C132094h f211238e;

    public C76225m(C132094h hVar, C76455a aVar, C76231s sVar, C22871g gVar) {
        this.f211238e = hVar;
        this.f211235b = aVar;
        this.f211236c = sVar;
        this.f211237d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo72132a(C58485gu guVar, Locale locale) {
        return this.f211237d.mo28209i(this.f211237d.mo28209i(this.f211238e.mo110404a((C58485gu) Collection.EL.stream(guVar).map(new C76217e(locale)).collect(C58370cn.f155946a)), "[NGA] DeepLinkExecutionHelper.extractQueriesData", C76218f.f211227a), "[NGA] DeepLinkExecutionHelper.getDeepLinkIntentForQueries", new C76219g(this));
    }

    /* renamed from: b */
    public final C89849ae mo72133b() {
        return C89849ae.NGA_DEEP_LINK_INITIALIZATION_FAILURE;
    }

    /* renamed from: c */
    public final C89849ae mo72134c() {
        return C89849ae.NGA_DEEP_LINK_INITIALIZATION_START;
    }

    /* renamed from: d */
    public final C89849ae mo72135d() {
        return C89849ae.NGA_DEEP_LINK_INITIALIZATION_SUCCESS;
    }

    /* renamed from: e */
    public final C58528ij mo72136e() {
        return new C58759qy(C80627v.QUERY_DEEP_LINKS);
    }

    /* renamed from: f */
    public final /* synthetic */ C60870cx mo72137f() {
        return C118826c.f331423b;
    }

    /* renamed from: g */
    public final C60870cx mo72138g(C58495hd hdVar) {
        return (C60870cx) cu.b(hdVar, C80627v.QUERY_DEEP_LINKS).map(new C76213a(this)).orElse(C118826c.f331423b);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo72139h() {
        return C75034bz.m121290a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ EnumSet mo72140i() {
        return EnumSet.noneOf(C80627v.class);
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo72141j() {
        return true;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo72142k(C58528ij ijVar) {
        return false;
    }

    /* renamed from: l */
    public final C60870cx mo72143l(String str) {
        return this.f211237d.mo28209i(this.f211237d.mo28209i(this.f211238e.mo110404a(C58485gu.m89846n(str.toLowerCase(Locale.US).trim())), "[NGA] DeepLinkExecutionHelper.extractQueryData", C76220h.f211229a), "[NGA] DeepLinkExecutionHelper.getDeepLinkIntentForQuery", new C76221i(this));
    }
}

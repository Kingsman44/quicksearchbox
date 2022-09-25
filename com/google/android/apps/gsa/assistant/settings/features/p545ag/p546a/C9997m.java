package com.google.android.apps.gsa.assistant.settings.features.p545ag.p546a;

import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10024a;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10027d;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10033j;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10034k;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10035l;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10036m;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.C121155h;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9723b.C128464c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.a.m */
/* compiled from: PG */
public final class C9997m implements C9985a, C10001p, C10000o {

    /* renamed from: a */
    public static final C58974d f34181a = C58974d.m91136j();

    /* renamed from: b */
    static final C10026c f34182b;

    /* renamed from: c */
    public static final C58528ij f34183c = C58528ij.m90011K(C79570b.ALARM, C79570b.TIMER);

    /* renamed from: d */
    public final Context f34184d;

    /* renamed from: e */
    public final C10027d f34185e;

    /* renamed from: f */
    public final C128464c f34186f;

    /* renamed from: g */
    public final C10036m f34187g;

    /* renamed from: h */
    private final C86034c f34188h;

    /* renamed from: i */
    private final C90021c f34189i;

    /* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.a.m$a */
    /* compiled from: PG */
    public interface C9998a {
        /* renamed from: f */
        C121155h mo18180f();
    }

    static {
        C10024a aVar = (C10024a) C10026c.f34231b.createBuilder();
        aVar.mo18195b(1);
        aVar.mo18195b(2);
        f34182b = (C10026c) aVar.build();
    }

    public C9997m(C86034c cVar, Context context, C90021c cVar2, C10027d dVar, C10036m mVar, C128464c cVar3) {
        this.f34188h = cVar;
        this.f34184d = context;
        this.f34189i = cVar2;
        this.f34185e = dVar;
        this.f34187g = mVar;
        this.f34186f = cVar3;
    }

    /* renamed from: f */
    private final C60870cx m24779f() {
        return C60922j.m93044g(this.f34188h.mo79697b(), C47810es.m84963c(new C9994j(this)), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo18175a(C58528ij ijVar, boolean z) {
        String str;
        String str2 = "disable";
        if (this.f34189i.mo79746e(C90126fx.f251789pt)) {
            C60870cx f = m24779f();
            C60931s f2 = C47810es.m84966f(new C9988d(ijVar, z));
            C60870cx h = C60922j.m93045h(f, C47810es.m84966f(f2), C60826bg.f164896a);
            Object[] objArr = new Object[2];
            if (true != z) {
                str = str2;
            } else {
                str = "enable";
            }
            objArr[0] = str;
            objArr[1] = Collection.EL.stream(ijVar).map(C9989e.f34174a).collect(Collectors.toCollection(C9990f.f34175a));
            C46459k.m82829b(h, "#MWW: Failed to %s context %s in TNG PDS and notify", objArr);
        }
        C47633f g = C47633f.m84733g(this.f34187g.f34245a.mo46039a(new C10034k(new C10033j(ijVar, z)), C60826bg.f164896a));
        C9991g gVar = new C9991g(this);
        C60870cx h2 = C60922j.m93045h(g, C47810es.m84966f(gVar), C60826bg.f164896a);
        Object[] objArr2 = new Object[2];
        if (true == z) {
            str2 = "enable";
        }
        objArr2[0] = str2;
        objArr2[1] = Collection.EL.stream(ijVar).map(C9989e.f34174a).collect(Collectors.toCollection(C9990f.f34175a));
        C46459k.m82829b(h2, "#MWW: Failed to %s context %s and notify", objArr2);
    }

    /* renamed from: b */
    public final C60870cx mo18176b() {
        C60870cx d = this.f34187g.f34245a.mo46042d();
        C9993i iVar = C9993i.f34178a;
        return C60922j.m93044g(d, C47810es.m84963c(iVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo18177c() {
        C60870cx b = mo18176b();
        C9992h hVar = C9992h.f34177a;
        return C60922j.m93044g(b, C47810es.m84963c(hVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo18178d(C10026c cVar) {
        if (this.f34189i.mo79746e(C90126fx.f251789pt)) {
            C46459k.m82829b(C60922j.m93045h(m24779f(), C47810es.m84966f(new C9995k(cVar)), C60826bg.f164896a), "#MWW: Failed to write settings data to TNG PDS", new Object[0]);
        }
        C46459k.m82829b(this.f34187g.f34245a.mo46039a(new C10035l(cVar), C60826bg.f164896a), "#MWW: Failed to set settings data", new Object[0]);
    }

    /* renamed from: e */
    public final void mo18179e(boolean z) {
        if (z) {
            mo18178d(f34182b);
        } else {
            mo18178d(C10026c.f34231b);
        }
    }
}

package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media;

import android.content.Context;
import android.support.p031v4.media.session.C0320v;
import android.text.TextUtils;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a.C111624n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113178ci;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113194cy;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113293br;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113294bs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8582f.C113417a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class TapasMediaSource extends C113409et {

    /* renamed from: d */
    public static final /* synthetic */ int f310338d = 0;

    /* renamed from: a */
    public final Context f310339a;

    /* renamed from: b */
    public final C113178ci f310340b;

    /* renamed from: c */
    public final C58485gu f310341c;

    /* renamed from: e */
    private final C22871g f310342e;

    /* renamed from: f */
    private final C113417a f310343f;

    /* renamed from: g */
    private final C60870cx f310344g;

    public TapasMediaSource(Context context, C2391v vVar, C111624n nVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C113417a aVar, C86124t tVar, C113178ci ciVar) {
        this.f310339a = context;
        this.f310342e = gVar2;
        this.f310343f = aVar;
        this.f310340b = ciVar;
        C58480gp gpVar = new C58480gp(4);
        gpVar.mo55395g("com.google.android.music");
        gpVar.mo55395g("com.spotify.music");
        if (tVar.mo79746e(C90063do.f249414dA)) {
            gpVar.mo55395g("com.google.android.apps.youtube.music");
        }
        this.f310341c = gpVar.mo55394f();
        this.f310344g = gVar.mo28209i(gVar3.mo28201a("getLastUsedMediaApp()", new C111637b(this)), "obtain media browser for last used media app", new C111638c(nVar));
        gVar.mo28212l("clean up onDestroy", new C111639d(vVar, nVar));
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.MEDIA;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        Optional empty;
        epVar.mo100033p();
        if (!TextUtils.isEmpty(C113190cu.m187215c(epVar.mo100033p()))) {
            return this.f310342e.mo28210j(this.f310344g, "fetch suggestions from preferred media app", new C111603a(epVar));
        }
        C58480gp e = C58485gu.m89837e();
        Iterator it = this.f310343f.mo100228b().iterator();
        while (true) {
            if (!it.hasNext()) {
                empty = Optional.empty();
                break;
            }
            C0320v vVar = (C0320v) it.next();
            if (vVar.mo1036d() != null && vVar.mo1036d().mo819d().f933b != null) {
                C113293br d = C113294bs.m187440d();
                d.mo99968c(vVar.f1045b);
                d.mo99967b(vVar.mo1036d().mo819d());
                d.mo99969d(true);
                empty = Optional.m71637of(C113194cy.m187225a(d.mo99966a(), 15031));
                break;
            }
        }
        if (empty.isPresent()) {
            e.mo55395g((C113415ez) empty.get());
        }
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(e.mo55394f())));
        return C60856cj.m92900i(p.mo100091a());
    }
}

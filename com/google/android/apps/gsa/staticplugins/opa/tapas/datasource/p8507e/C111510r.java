package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.r */
/* compiled from: PG */
public final class C111510r extends C111495c {

    /* renamed from: b */
    public static final C121537f f310174b;

    /* renamed from: c */
    public static final C121511c f310175c;

    /* renamed from: d */
    public final C111506n f310176d;

    /* renamed from: e */
    public final C86124t f310177e;

    /* renamed from: f */
    public final C68214a f310178f;

    /* renamed from: g */
    private final C22871g f310179g;

    static {
        C121537f b = C121537f.m200840b("TapasAnswerSuggestSource", C113409et.f314037l);
        f310174b = b;
        f310175c = b.f337270a;
    }

    public C111510r(C22871g gVar, C111485al alVar, C111506n nVar, C86124t tVar, C68214a aVar) {
        super(gVar, alVar, tVar);
        this.f310179g = gVar;
        this.f310176d = nVar;
        this.f310177e = tVar;
        this.f310178f = aVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.ANSWER;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        if (TextUtils.isEmpty(epVar.mo100033p())) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        C60870cx cxVar = (C60870cx) map.get(C48672ag.COMPLETE_SERVER);
        if (cxVar != null) {
            return this.f310179g.mo28209i(cxVar, "parse answer response", new C111508p(this, epVar));
        }
        C111506n nVar = this.f310176d;
        Objects.requireNonNull(nVar);
        return mo99159b(epVar, new C111507o(nVar), f310174b);
    }
}

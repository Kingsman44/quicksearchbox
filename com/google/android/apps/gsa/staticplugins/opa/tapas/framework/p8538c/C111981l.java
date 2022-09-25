package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111885bw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5295b.C68283d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.l */
/* compiled from: PG */
public final /* synthetic */ class C111981l implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f311086a;

    /* renamed from: b */
    public final /* synthetic */ C21370a f311087b;

    /* renamed from: c */
    public final /* synthetic */ C68214a f311088c;

    /* renamed from: d */
    public final /* synthetic */ C113405ep f311089d;

    /* renamed from: e */
    public final /* synthetic */ C22871g f311090e;

    /* renamed from: f */
    public final /* synthetic */ C111948ap f311091f;

    public /* synthetic */ C111981l(Map map, C21370a aVar, C68214a aVar2, C113405ep epVar, C22871g gVar, C111948ap apVar) {
        this.f311086a = map;
        this.f311087b = aVar;
        this.f311088c = aVar2;
        this.f311089d = epVar;
        this.f311090e = gVar;
        this.f311091f = apVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = this.f311086a;
        C21370a aVar = this.f311087b;
        C68214a aVar2 = this.f311088c;
        C113405ep epVar = this.f311089d;
        C22871g gVar = this.f311090e;
        C111948ap apVar = this.f311091f;
        C48672ag agVar = (C48672ag) obj;
        C68283d dVar = (C68283d) map.get(agVar);
        if (dVar != null) {
            long c = aVar.mo26871c();
            C60870cx e = C90877ak.m148471e(dVar.mo60297gq(), ((C111885bw) aVar2.mo27525b()).mo99274b(epVar.mo100033p(), C111885bw.m185717c(epVar)), TimeUnit.MILLISECONDS, gVar);
            apVar.mo99308b(c, e, epVar, agVar);
            return e;
        }
        throw new IllegalStateException("Source type should be in the map");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

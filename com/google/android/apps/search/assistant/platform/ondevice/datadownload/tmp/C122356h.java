package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17004ai;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17019p;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17027x;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17028y;
import com.google.android.libraries.assistant.p1363c.p1371b.p1377e.p1378a.C17104i;
import com.google.android.libraries.assistant.p1363c.p1371b.p1377e.p1378a.C17106k;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10878f;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Collection;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.h */
/* compiled from: PG */
public final class C122356h implements C122334a {

    /* renamed from: a */
    public final C68214a f339243a;

    /* renamed from: b */
    public final C60887da f339244b;

    /* renamed from: c */
    private final C17019p f339245c;

    /* renamed from: d */
    private final C17027x f339246d;

    /* renamed from: e */
    private final C17028y f339247e;

    /* renamed from: f */
    private final C17004ai f339248f;

    /* renamed from: g */
    private final C17106k f339249g;

    public C122356h(C68214a aVar, C17019p pVar, C17027x xVar, C17028y yVar, C17004ai aiVar, C60887da daVar, C17106k kVar) {
        this.f339243a = aVar;
        this.f339245c = pVar;
        this.f339246d = xVar;
        this.f339247e = yVar;
        this.f339248f = aiVar;
        this.f339244b = daVar;
        this.f339249g = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo105598a(Locale locale) {
        Collection collection;
        if (locale.equals(Locale.US)) {
            collection = C58528ij.m90013M(this.f339247e, this.f339248f, this.f339246d, this.f339245c);
        } else {
            collection = C58733pz.f156496a;
        }
        C60870cx e = C60856cj.m92896e((Iterable) Collection.EL.stream(collection).map(new C122352d(this, locale)).collect(C58370cn.f155946a));
        C122353e eVar = C122353e.f339240a;
        return C60922j.m93044g(e, C47810es.m84963c(eVar), this.f339244b);
    }

    /* renamed from: b */
    public final C60870cx mo105599b(Locale locale) {
        if (!locale.equals(Locale.US)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C17106k kVar = this.f339249g;
        Optional of = Optional.m71637of(3008);
        C10878f fVar = (C10878f) C10879g.f35958g.createBuilder();
        String languageTag = locale.toLanguageTag();
        fVar.copyOnWrite();
        C10879g gVar = (C10879g) fVar.instance;
        languageTag.getClass();
        gVar.f35960a |= 1;
        gVar.f35961b = languageTag;
        C10879g gVar2 = (C10879g) fVar.build();
        C60870cx d = kVar.f49778b.f49765a.mo19302d(gVar2);
        return C60922j.m93044g(C60922j.m93045h(kVar.f49778b.f49765a.mo19303e(gVar2), C47810es.m84966f(new C17104i(kVar, d, of)), kVar.f49777a), C47810es.m84963c(C122354f.f339241a), this.f339244b);
    }
}

package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.p590as.p593b.p596b.C10812ap;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10878f;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.n.g.a.d */
/* compiled from: PG */
public final /* synthetic */ class C39733d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39751v f104549a;

    /* renamed from: b */
    public final /* synthetic */ Locale f104550b;

    public /* synthetic */ C39733d(C39751v vVar, Locale locale) {
        this.f104549a = vVar;
        this.f104550b = locale;
    }

    public final C60870cx apply(Object obj) {
        C39751v vVar = this.f104549a;
        Locale locale = this.f104550b;
        if (Collection.EL.stream((C58485gu) obj).noneMatch(new C39744o(locale))) {
            ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53833)).mo56386p("LanguagePack download is requested because pack is unavailable.");
            C10878f fVar = (C10878f) C10879g.f35958g.createBuilder();
            String languageTag = locale.toLanguageTag();
            fVar.copyOnWrite();
            C10879g gVar = (C10879g) fVar.instance;
            languageTag.getClass();
            gVar.f35960a |= 1;
            gVar.f35961b = languageTag;
            return C47633f.m84733g(((C10812ap) vVar.f104572b.get()).mo19303e((C10879g) fVar.build())).mo51516i(new C39737h(vVar, locale), vVar.f104578h).mo51516i(C39738i.f104556a, vVar.f104578h).mo51515h(C39739j.f104557a, vVar.f104578h);
        }
        ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53832)).mo56386p("LanguagePack download was skipped because pack is available.");
        return C60856cj.m92900i(false);
    }
}

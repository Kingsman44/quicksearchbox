package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.apps.gsa.nga.engine.education.p6017b.C75706ac;
import com.google.android.apps.gsa.nga.engine.education.p6017b.C75736v;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ae */
/* compiled from: PG */
public final /* synthetic */ class C75680ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C75688am f210079a;

    /* renamed from: b */
    public final /* synthetic */ Optional f210080b;

    /* renamed from: c */
    public final /* synthetic */ C48468h f210081c;

    /* renamed from: d */
    public final /* synthetic */ Locale f210082d;

    public /* synthetic */ C75680ae(C75688am amVar, Optional optional, C48468h hVar, Locale locale) {
        this.f210079a = amVar;
        this.f210080b = optional;
        this.f210081c = hVar;
        this.f210082d = locale;
    }

    public final Object apply(Object obj) {
        C75688am amVar = this.f210079a;
        Optional optional = this.f210080b;
        C48468h hVar = this.f210081c;
        Locale locale = this.f210082d;
        Optional optional2 = (Optional) obj;
        optional2.ifPresent(new C75979y(amVar, (String) optional.get()));
        if (optional2.isPresent()) {
            return amVar.mo71830f(optional2, hVar, locale);
        }
        C75706ac acVar = amVar.f210104g;
        C58485gu h = acVar.mo71859h(locale, optional, true);
        if (h.isEmpty() && acVar.f210154e.mo85405j(C90037cp.f248565cn)) {
            h = acVar.mo71859h(locale, optional, false);
            C80905at.m128763g(acVar.f210153d.mo74905u((String) optional.orElse("CURRENT_APPLICATION_UNKNOWN")), C75736v.f210208a);
        }
        Optional findFirst = Collection.EL.stream(h).findFirst();
        amVar.mo71834j(findFirst, optional, locale);
        return amVar.mo71830f(findFirst, hVar, locale);
    }
}

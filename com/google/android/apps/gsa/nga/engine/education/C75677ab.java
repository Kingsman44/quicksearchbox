package com.google.android.apps.gsa.nga.engine.education;

import android.util.Pair;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75665p;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75666q;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75672w;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75674y;
import com.google.android.apps.gsa.nga.engine.education.p6017b.C75706ac;
import com.google.android.apps.gsa.nga.engine.education.p6017b.C75738x;
import com.google.android.apps.gsa.nga.engine.p5994c.p5999c.C75322a;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80985e;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80987g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.assistant.p3781ad.p3789d.p3791b.C48730l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ab */
/* compiled from: PG */
public final /* synthetic */ class C75677ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C75688am f210070a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210071b;

    /* renamed from: c */
    public final /* synthetic */ long f210072c;

    /* renamed from: d */
    public final /* synthetic */ C75686ak f210073d;

    public /* synthetic */ C75677ab(C75688am amVar, Locale locale, long j, C75686ak akVar) {
        this.f210070a = amVar;
        this.f210071b = locale;
        this.f210072c = j;
        this.f210073d = akVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C75688am amVar = this.f210070a;
        Locale locale = this.f210071b;
        long j = this.f210072c;
        C75686ak akVar = this.f210073d;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return C60856cj.m92900i(new Pair(optional, C75746c.HANDS_FREE));
        }
        if (((C80987g) amVar.f210107j.mo27525b()).mo74766b().equals(C80985e.IN_FOREGROUND)) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(new Pair(amVar.mo71829e(locale), C75746c.HOMESCREEN));
        }
        C58976aa aaVar2 = C58975e.f156826a;
        Optional h = amVar.mo71832h();
        Optional map = C80987g.m128859c(((C80987g) amVar.f210107j.mo27525b()).mo74768e()).map(C75977w.f210783a);
        C48468h c = amVar.f210104g.mo71855c(locale, h);
        amVar.mo71833i(c);
        C60870cx i = C60856cj.m92900i(Optional.empty());
        if (c != C48468h.UNKNOWN_MODE) {
            Optional flatMap = h.flatMap(new C75672w((C75674y) amVar.f210104g.f210152c.mo27525b()));
            amVar.mo71834j(flatMap, h, locale);
            if (flatMap.isPresent()) {
                cxVar = C60856cj.m92900i(amVar.mo71830f(flatMap, c, locale));
                return C60922j.m93045h(cxVar, new C75676aa(akVar), C60826bg.f164896a);
            } else if (amVar.f210106i.mo85405j(C90126fx.f251034bG) && h.isPresent() && map.isPresent()) {
                C75706ac acVar = amVar.f210104g;
                String str = (String) h.get();
                String str2 = (String) map.get();
                if (!acVar.mo71860i(str, locale)) {
                    i = C60856cj.m92900i(Optional.empty());
                } else {
                    C48730l f = C75706ac.m122021f(str, str2, locale);
                    C75674y yVar = (C75674y) acVar.f210152c.mo27525b();
                    if (!yVar.mo71821g() || yVar.f210052i.isEmpty()) {
                        cxVar2 = C60856cj.m92900i(Optional.empty());
                    } else {
                        yVar.f210054k.mo74271b(C89849ae.FRE_ASYNC_FETCH_APP_CONTROL_DISCOVERY_SUGGESTIONS_REQUESTED);
                        C60870cx b = ((C75322a) yVar.f210052i.get()).mo71669b(f);
                        C75665p pVar = new C75665p(yVar);
                        cxVar2 = C60846c.m92878g(C60856cj.m92908q(C60922j.m93044g(b, C47810es.m84963c(pVar), C60826bg.f164896a), j, TimeUnit.MILLISECONDS, yVar.f210053j), Throwable.class, new C75666q(yVar, f), C60826bg.f164896a);
                    }
                    C75738x xVar = new C75738x(acVar, str, locale);
                    i = C60922j.m93044g(cxVar2, C47810es.m84963c(xVar), C60826bg.f164896a);
                }
            }
        }
        C75680ae aeVar = new C75680ae(amVar, h, c, locale);
        cxVar = C60922j.m93044g(i, C47810es.m84963c(aeVar), C60826bg.f164896a);
        return C60922j.m93045h(cxVar, new C75676aa(akVar), C60826bg.f164896a);
    }
}

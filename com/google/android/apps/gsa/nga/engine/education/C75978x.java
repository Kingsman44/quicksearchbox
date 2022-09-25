package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.assistant.p3775ac.p3779d.C48462b;
import com.google.assistant.p3775ac.p3779d.C48470j;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.x */
/* compiled from: PG */
public final /* synthetic */ class C75978x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C75688am f210784a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210785b;

    /* renamed from: c */
    public final /* synthetic */ Optional f210786c;

    public /* synthetic */ C75978x(C75688am amVar, Locale locale, Optional optional) {
        this.f210784a = amVar;
        this.f210785b = locale;
        this.f210786c = optional;
    }

    public final void accept(Object obj) {
        int a;
        C75688am amVar = this.f210784a;
        Locale locale = this.f210785b;
        Optional optional = this.f210786c;
        C75650ai aiVar = (C75650ai) obj;
        amVar.f210103f.mo74271b(C89849ae.FRE_SELECTED_MODE_SUGGESTION_FETCH_SUCCESS);
        if (amVar.f210106i.mo85405j(C90037cp.f248459an)) {
            Optional m = aiVar.mo71808m(locale);
            if (m.isPresent() && (a = C48470j.m85229a(((C48462b) m.get()).f125194d)) != 0 && a == 19) {
                return;
            }
        }
        C80905at.m128763g(amVar.f210108k.mo74853A((String) optional.orElse("CURRENT_APPLICATION_UNKNOWN"), aiVar.mo71806j()), C75974t.f210778a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

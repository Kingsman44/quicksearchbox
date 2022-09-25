package com.google.android.apps.gsa.nga.engine.education;

import android.util.Pair;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.assistant.p4008y.p4009a.C53577bj;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.af */
/* compiled from: PG */
public final /* synthetic */ class C75681af implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C75683ah f210083a;

    /* renamed from: b */
    public final /* synthetic */ C53577bj f210084b;

    /* renamed from: c */
    public final /* synthetic */ Locale f210085c;

    /* renamed from: d */
    public final /* synthetic */ C48468h f210086d;

    public /* synthetic */ C75681af(C75683ah ahVar, C53577bj bjVar, Locale locale, C48468h hVar) {
        this.f210083a = ahVar;
        this.f210084b = bjVar;
        this.f210085c = locale;
        this.f210086d = hVar;
    }

    public final Object apply(Object obj) {
        C75683ah ahVar = this.f210083a;
        C53577bj bjVar = this.f210084b;
        Locale locale = this.f210085c;
        C48468h hVar = this.f210086d;
        Pair pair = (Pair) obj;
        if (!((C53577bj) pair.second).equals(bjVar)) {
            return Optional.empty();
        }
        C58974d dVar = C75688am.f210098a;
        C58976aa aaVar = C58975e.f156826a;
        ahVar.f210091d.f210103f.mo74271b(C89849ae.FRE_SELECTED_MODE_SUGGESTION_FETCH_SUCCESS);
        C80905at.m128763g(ahVar.f210091d.f210108k.mo74909y(((C75650ai) pair.first).mo71806j(), ahVar.f210091d.f210100c.mo57444a()), C75682ag.f210087a);
        return Optional.m71637of(ahVar.f210091d.mo71825a(locale, (C75650ai) pair.first, hVar));
    }
}

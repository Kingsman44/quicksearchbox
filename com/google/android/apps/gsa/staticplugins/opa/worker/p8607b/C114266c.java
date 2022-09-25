package com.google.android.apps.gsa.staticplugins.opa.worker.p8607b;

import com.google.android.apps.gsa.assistant.shared.appactions.b.u;
import com.google.android.apps.gsa.assistant.shared.appactions.g.f;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.assistant.p3825an.p3830c.p3831a.C49277aw;
import com.google.assistant.p3825an.p3830c.p3831a.C49279ay;
import com.google.assistant.p3861at.C49814aa;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49843ba;
import com.google.assistant.p3861at.acz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.b.c */
/* compiled from: PG */
public final /* synthetic */ class C114266c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114274k f316854a;

    /* renamed from: b */
    public final /* synthetic */ C73812a f316855b;

    /* renamed from: c */
    public final /* synthetic */ C36265d f316856c;

    public /* synthetic */ C114266c(C114274k kVar, C73812a aVar, C36265d dVar) {
        this.f316854a = kVar;
        this.f316855b = aVar;
        this.f316856c = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Optional optional;
        C114274k kVar = this.f316854a;
        C73812a aVar = this.f316855b;
        C36265d dVar = this.f316856c;
        acz acz = (acz) obj;
        C49814aa aaVar = acz.f129023l;
        if (aaVar == null) {
            aaVar = C49814aa.f128669f;
        }
        if (!aaVar.f128671a) {
            aVar.mo65294a(C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_SAVE_RESPONSE_SERVER_ERROR);
            kVar.mo101294k(dVar, true);
            return;
        }
        aVar.mo65295b(C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_SAVE_RESPONSE_RECEIVED);
        kVar.mo101294k(dVar, false);
        u uVar = kVar.f316873f;
        C49826ak akVar = dVar.f94716b;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        String str = akVar.f129471h;
        C49826ak akVar2 = dVar.f94716b;
        if (akVar2 == null) {
            akVar2 = C49826ak.f129462q;
        }
        if (akVar2.f129476m.isEmpty()) {
            optional = Optional.empty();
        } else {
            C49826ak akVar3 = dVar.f94716b;
            if (akVar3 == null) {
                akVar3 = C49826ak.f129462q;
            }
            optional = Optional.m71637of(akVar3.f129476m);
        }
        kVar.mo101293j(uVar.e(str, optional), "appActionsUsageController#onShortcutSaved fails.");
        f fVar = kVar.f316877j;
        String str2 = dVar.f94717c;
        C49826ak akVar4 = dVar.f94716b;
        if (akVar4 == null) {
            akVar4 = C49826ak.f129462q;
        }
        C49843ba baVar = akVar4.f129479p;
        if (baVar == null) {
            baVar = C49843ba.f129533d;
        }
        int b = C49279ay.m85402b(baVar.f129536b);
        int i = b == 0 ? 2 : b;
        C49826ak akVar5 = dVar.f94716b;
        C49843ba baVar2 = (akVar5 == null ? C49826ak.f129462q : akVar5).f129479p;
        if (baVar2 == null) {
            baVar2 = C49843ba.f129533d;
        }
        int b2 = C49277aw.m85400b(baVar2.f129537c);
        int i2 = b2 == 0 ? 2 : b2;
        if (akVar5 == null) {
            akVar5 = C49826ak.f129462q;
        }
        String str3 = akVar5.f129476m;
        C49814aa aaVar2 = acz.f129023l;
        if (aaVar2 == null) {
            aaVar2 = C49814aa.f128669f;
        }
        fVar.a(str2, i, i2, str3, aaVar2.f128674d);
    }
}

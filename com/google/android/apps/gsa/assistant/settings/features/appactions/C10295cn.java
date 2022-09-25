package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.shared.p5794e.C73744i;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49865bw;
import com.google.assistant.p3861at.C50355u;
import com.google.assistant.p3861at.act;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cn */
/* compiled from: PG */
public final /* synthetic */ class C10295cn implements C73744i {

    /* renamed from: a */
    public final /* synthetic */ C10301ct f34884a;

    public /* synthetic */ C10295cn(C10301ct ctVar) {
        this.f34884a = ctVar;
    }

    /* renamed from: a */
    public final int mo18098a(act act) {
        C49865bw bwVar;
        C10301ct ctVar = this.f34884a;
        C50355u uVar = act.f128882I;
        if (uVar == null) {
            uVar = C50355u.f131056c;
        }
        if (uVar.f131058a == 3) {
            bwVar = (C49865bw) uVar.f131059b;
        } else {
            bwVar = C49865bw.f129579c;
        }
        if (bwVar.equals(C49865bw.f129579c)) {
            return 1;
        }
        C49826ak akVar = bwVar.f129581a;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        ctVar.mo18399b(akVar, true);
        return 0;
    }
}

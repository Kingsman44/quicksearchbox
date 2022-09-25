package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9872c.p9873a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119898q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119899r;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9872c.C130190b;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.c.a.b */
/* compiled from: PG */
public final class C130188b implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C130189c f356936a;

    public C130188b(C130189c cVar) {
        this.f356936a = cVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        C46690ah ahVar = C127120a.f350020b;
        C69664n.m101060f(ahVar, "STATE_KEY");
        return ahVar;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C119903v vVar;
        C130190b bVar;
        C119903v vVar2;
        C119899r rVar;
        C119904w a = this.f356936a.f356939c.mo107985a();
        int i = a.f333911a;
        if (i == 1) {
            return C60856cj.m92900i(C130190b.STABLE_TRANSCRIPTION);
        }
        if (i != 2) {
            return C60856cj.m92900i(C130190b.NOT_SET);
        }
        C69664n.m101060f(a, "assistantState");
        if (a.f333911a == 2) {
            vVar = (C119903v) a.f333912b;
        } else {
            vVar = C119903v.f333904d;
        }
        int a2 = C119902u.m198776a(vVar.f333906a);
        int i2 = a2 - 1;
        if (a2 != 0) {
            if (i2 == 0) {
                if (a.f333911a == 2) {
                    vVar2 = (C119903v) a.f333912b;
                } else {
                    vVar2 = C119903v.f333904d;
                }
                if (vVar2.f333906a == 1) {
                    rVar = (C119899r) vVar2.f333907b;
                } else {
                    rVar = C119899r.f333900c;
                }
                int a3 = C119898q.m198773a(rVar.f333902a);
                int i3 = a3 - 1;
                if (a3 == 0) {
                    throw null;
                } else if (i3 == 0 || i3 == 1 || i3 == 2) {
                    bVar = C130190b.LIVE_TRANSCRIPTION;
                } else {
                    bVar = C130190b.NOT_SET;
                }
            } else if (i2 == 1) {
                bVar = C130190b.LIVE_TRANSCRIPTION;
            } else if (i2 != 2) {
                bVar = C130190b.NOT_SET;
            } else {
                bVar = C130190b.STABLE_TRANSCRIPTION;
            }
            return C60856cj.m92900i(bVar);
        }
        throw null;
    }
}

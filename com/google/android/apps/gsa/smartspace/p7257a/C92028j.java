package com.google.android.apps.gsa.smartspace.p7257a;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.assistant.p3886c.C50695ag;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.smartspace.a.j */
/* compiled from: PG */
public final /* synthetic */ class C92028j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92030l f256559a;

    public /* synthetic */ C92028j(C92030l lVar) {
        this.f256559a = lVar;
    }

    public final Object apply(Object obj) {
        C92030l lVar = this.f256559a;
        C50695ag agVar = (C50695ag) obj;
        Instant ofEpochMilli = Instant.ofEpochMilli(agVar.f131900b);
        long a = lVar.mo86681a(Instant.ofEpochMilli(agVar.f131900b), agVar.f131901c);
        if (a == 0) {
            if (lVar.f256567d.mo79746e(C90017bw.f247895aJ)) {
                lVar.f256568e.mo41682P((double) Duration.between(ofEpochMilli, lVar.f256566c.mo57444a()).toHours());
            }
            a = 0;
        }
        boolean z = false;
        if (!lVar.f256567d.mo79746e(C90017bw.f247893aH)) {
            ((C58970a) ((C58970a) lVar.f256565b.mo56224b()).mo56372aa(11987)).mo56386p("Media negative targeting is disabled. Skipping...");
        } else if (a <= 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

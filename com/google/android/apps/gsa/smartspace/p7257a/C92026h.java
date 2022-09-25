package com.google.android.apps.gsa.smartspace.p7257a;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.libraries.p1635au.C19567d;
import com.google.assistant.p3886c.C50694af;
import com.google.assistant.p3886c.C50695ag;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.smartspace.a.h */
/* compiled from: PG */
public final /* synthetic */ class C92026h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92030l f256556a;

    /* renamed from: b */
    public final /* synthetic */ C92029k f256557b;

    public /* synthetic */ C92026h(C92030l lVar, C92029k kVar) {
        this.f256556a = lVar;
        this.f256557b = kVar;
    }

    public final Object apply(Object obj) {
        C92030l lVar = this.f256556a;
        C92029k kVar = this.f256557b;
        C50695ag agVar = (C50695ag) obj;
        if (C92030l.m151039c(agVar)) {
            ((C58970a) ((C58970a) lVar.f256565b.mo56224b()).mo56372aa(11983)).mo56386p("Reset happens on empty push record. Skipping...");
            return agVar;
        } else if (lVar.f256567d.mo79746e(C90017bw.f247893aH) || lVar.f256567d.mo79746e(C90017bw.f247895aJ)) {
            if (lVar.f256567d.mo79746e(C90017bw.f247895aJ)) {
                long a = lVar.mo86681a(Instant.ofEpochMilli(agVar.f131900b), agVar.f131901c);
                ((C19567d) lVar.f256568e.f102886bQ.mo6453a()).mo24822a(1, Integer.valueOf((int) a), kVar.f256563c);
            }
            if (!kVar.equals(C92029k.RESUME) || lVar.f256567d.mo79746e(C90017bw.f247894aI)) {
                ((C58970a) ((C58970a) lVar.f256565b.mo56224b()).mo56372aa(11980)).mo56386p("Reset");
                C50694af afVar = (C50694af) C50695ag.f131897e.createBuilder();
                boolean z = agVar.f131902d;
                afVar.copyOnWrite();
                C50695ag agVar2 = (C50695ag) afVar.instance;
                agVar2.f131899a |= 4;
                agVar2.f131902d = z;
                return (C50695ag) afVar.build();
            }
            ((C58970a) ((C58970a) lVar.f256565b.mo56224b()).mo56372aa(11981)).mo56386p("Reset on resumable click is disabled. Skipping reset quota...");
            return agVar;
        } else {
            ((C58970a) ((C58970a) lVar.f256565b.mo56224b()).mo56372aa(11982)).mo56386p("Media negative targeting is disabled. Skipping...");
            return agVar;
        }
    }
}

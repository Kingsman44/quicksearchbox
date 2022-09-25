package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.i */
/* compiled from: PG */
public final class C123972i implements C123977n {

    /* renamed from: a */
    private final C123978o f342437a;

    /* renamed from: b */
    private final C130603a f342438b;

    /* renamed from: c */
    private final C123968e f342439c;

    /* renamed from: d */
    private final C58974d f342440d;

    /* renamed from: e */
    private final boolean f342441e;

    /* renamed from: f */
    private final boolean f342442f;

    public C123972i(C123978o oVar, C123968e eVar, C130603a aVar, boolean z, boolean z2) {
        this.f342437a = oVar;
        this.f342438b = aVar;
        this.f342440d = aVar.mo109740b(this);
        this.f342439c = eVar;
        this.f342441e = z;
        this.f342442f = z2;
    }

    /* renamed from: a */
    public final Optional mo106216a(C52560wg wgVar, C50690ab abVar) {
        C52560wg wgVar2;
        C51058ev evVar;
        if (!this.f342439c.mo106220b(wgVar, abVar)) {
            return Optional.empty();
        }
        if (this.f342441e) {
            ((C58970a) ((C58970a) this.f342440d.mo56224b()).mo56372aa(35308)).mo56389s("#create: Using %s for rendering.", "com.google.android.apps.podcasts");
            C52559wf wfVar = (C52559wf) wgVar.toBuilder();
            C51098gh ghVar = wgVar.f137949e;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            C51097gg ggVar = (C51097gg) ghVar.toBuilder();
            C51098gh ghVar2 = wgVar.f137949e;
            if (ghVar2 == null) {
                ghVar2 = C51098gh.f133009e;
            }
            if (ghVar2.f133012b == 1) {
                evVar = (C51058ev) ghVar2.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            C51055es esVar = (C51055es) evVar.toBuilder();
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            evVar2.f132943a |= 1;
            evVar2.f132944b = "com.google.android.apps.podcasts";
            ggVar.copyOnWrite();
            C51098gh ghVar3 = (C51098gh) ggVar.instance;
            C51058ev evVar3 = (C51058ev) esVar.build();
            evVar3.getClass();
            ghVar3.f133013c = evVar3;
            ghVar3.f133012b = 1;
            wfVar.copyOnWrite();
            C52560wg wgVar3 = (C52560wg) wfVar.instance;
            C51098gh ghVar4 = (C51098gh) ggVar.build();
            ghVar4.getClass();
            wgVar3.f137949e = ghVar4;
            wgVar3.f137945a |= 4;
            wgVar2 = (C52560wg) wfVar.build();
        } else if (this.f342442f) {
            ((C58970a) ((C58970a) this.f342440d.mo56224b()).mo56372aa(35307)).mo56389s("#create: %s not found. No media item created.", "com.google.android.apps.podcasts");
            return Optional.empty();
        } else {
            ((C58970a) ((C58970a) this.f342440d.mo56224b()).mo56372aa(35306)).mo56389s("#create: %s not found. AGSA will be used for rendering.", "com.google.android.apps.podcasts");
            wgVar2 = wgVar;
        }
        return Optional.m71637of(new C123970g(wgVar2, wgVar, abVar, this.f342437a, this.f342438b));
    }
}

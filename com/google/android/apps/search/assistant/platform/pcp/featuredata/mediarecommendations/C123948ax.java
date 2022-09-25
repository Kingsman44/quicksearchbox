package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ax */
/* compiled from: PG */
public final class C123948ax implements C123977n {

    /* renamed from: a */
    private final C123968e f342350a;

    /* renamed from: b */
    private final C14626qe f342351b;

    /* renamed from: c */
    private final C123978o f342352c;

    /* renamed from: d */
    private final C130603a f342353d;

    /* renamed from: e */
    private final C58974d f342354e;

    public C123948ax(C14626qe qeVar, C123968e eVar, C123978o oVar, C130603a aVar) {
        this.f342351b = qeVar;
        this.f342350a = eVar;
        this.f342352c = oVar;
        this.f342353d = aVar;
        this.f342354e = aVar.mo109740b(this);
    }

    /* renamed from: a */
    public final Optional mo106216a(C52560wg wgVar, C50690ab abVar) {
        if (!C14626qe.YOUTUBE_PREMIUM_USER.equals(this.f342351b) || !C50690ab.POTTER.equals(abVar)) {
            if (!C14626qe.YOUTUBE_PREMIUM_USER.equals(this.f342351b) && C50690ab.MBS.equals(abVar)) {
                C58970a aVar = (C58970a) ((C58970a) this.f342354e.mo56226d()).mo56372aa(35325);
                C52568wo woVar = wgVar.f137950f;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                aVar.mo56389s("Non-premium user should not have MBS result: %s", woVar.f137998e);
            }
            if (!this.f342350a.mo106220b(wgVar, abVar)) {
                return Optional.empty();
            }
            return Optional.m71637of(new C123946av(wgVar, abVar, this.f342351b, this.f342352c, this.f342353d));
        }
        C58970a aVar2 = (C58970a) ((C58970a) this.f342354e.mo56224b()).mo56372aa(35326);
        C52568wo woVar2 = wgVar.f137950f;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        aVar2.mo56389s("Potter result %s ignored for YTM premium user", woVar2.f137998e);
        return Optional.empty();
    }
}

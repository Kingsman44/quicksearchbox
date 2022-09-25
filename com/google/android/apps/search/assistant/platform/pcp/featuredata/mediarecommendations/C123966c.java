package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3921j.C52560wg;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.c */
/* compiled from: PG */
public final class C123966c implements C123977n {

    /* renamed from: a */
    private final C123968e f342415a;

    /* renamed from: b */
    private final C123978o f342416b;

    /* renamed from: c */
    private final C130603a f342417c;

    public C123966c(C123968e eVar, C123978o oVar, C130603a aVar) {
        this.f342415a = eVar;
        this.f342416b = oVar;
        this.f342417c = aVar;
    }

    /* renamed from: a */
    public final Optional mo106216a(C52560wg wgVar, C50690ab abVar) {
        if (this.f342415a.mo106220b(wgVar, abVar)) {
            return Optional.m71637of(new C123949b(wgVar, abVar, this.f342416b, this.f342417c));
        }
        return Optional.empty();
    }
}

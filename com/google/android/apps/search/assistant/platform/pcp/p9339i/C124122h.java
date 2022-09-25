package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.h */
/* compiled from: PG */
public final /* synthetic */ class C124122h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f342809a;

    /* renamed from: b */
    public final /* synthetic */ Optional f342810b;

    public /* synthetic */ C124122h(C58480gp gpVar, Optional optional) {
        this.f342809a = gpVar;
        this.f342810b = optional;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C58480gp gpVar = this.f342809a;
        Optional optional = this.f342810b;
        C58485gu f = gpVar.mo55394f();
        if (!f.isEmpty() && optional.isPresent()) {
            ((C124167p) optional.get()).mo106311e(C58485gu.m89845m(), f);
        }
        return C60866ct.f164955a;
    }
}

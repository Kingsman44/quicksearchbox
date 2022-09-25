package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.ak */
/* compiled from: PG */
public final /* synthetic */ class C130747ak implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C130748al f357941a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f357942b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f357943c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f357944d;

    public /* synthetic */ C130747ak(C130748al alVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f357941a = alVar;
        this.f357942b = cxVar;
        this.f357943c = cxVar2;
        this.f357944d = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        try {
            return C60856cj.m92900i(this.f357941a.mo109810c((Optional) C60856cj.m92909r(this.f357942b), ((Boolean) C60856cj.m92909r(this.f357943c)).booleanValue(), ((Boolean) C60856cj.m92909r(this.f357944d)).booleanValue()));
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) C130748al.f357945a.mo56225c()).mo56382g(e)).mo56372aa(38969)).mo56386p("future failure");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
    }
}

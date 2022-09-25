package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.ac */
/* compiled from: PG */
public final /* synthetic */ class C117344ac implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C117350ai f325719a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f325720b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f325721c;

    public /* synthetic */ C117344ac(C117350ai aiVar, C58480gp gpVar, C58485gu guVar) {
        this.f325719a = aiVar;
        this.f325720b = gpVar;
        this.f325721c = guVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C117350ai aiVar = this.f325719a;
        C58480gp gpVar = this.f325720b;
        C58485gu guVar = this.f325721c;
        if (gpVar.mo55394f().isEmpty() || !aiVar.f325765o.mo56113h()) {
            return aiVar.f325763m.mo106055b(guVar, 1, (Instant) null);
        }
        return ((C124167p) aiVar.f325765o.mo56107c()).mo106310d(gpVar.mo55394f());
    }
}

package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.ac */
/* compiled from: PG */
public final /* synthetic */ class C114256ac implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C114261ah f316821a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f316822b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f316823c;

    public /* synthetic */ C114256ac(C114261ah ahVar, C58480gp gpVar, C58480gp gpVar2) {
        this.f316821a = ahVar;
        this.f316822b = gpVar;
        this.f316823c = gpVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C114261ah ahVar = this.f316821a;
        C58480gp gpVar = this.f316822b;
        C58480gp gpVar2 = this.f316823c;
        if (!ahVar.f316841k.isPresent() || gpVar.mo55394f().isEmpty()) {
            return ahVar.f316839i.mo106055b(gpVar2.mo55394f(), 1, (Instant) null);
        }
        return ((C124167p) ahVar.f316841k.get()).mo106310d(gpVar.mo55394f());
    }
}

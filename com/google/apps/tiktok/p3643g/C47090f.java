package com.google.apps.tiktok.p3643g;

import android.content.Intent;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.g.f */
/* compiled from: PG */
public final /* synthetic */ class C47090f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C47098n f122687a;

    /* renamed from: b */
    public final /* synthetic */ Intent f122688b;

    /* renamed from: c */
    public final /* synthetic */ int f122689c;

    public /* synthetic */ C47090f(C47098n nVar, Intent intent, int i) {
        this.f122687a = nVar;
        this.f122688b = intent;
        this.f122689c = i;
    }

    public final C60870cx apply(Object obj) {
        C47098n nVar = this.f122687a;
        Intent intent = this.f122688b;
        int i = this.f122689c;
        C47102r c = nVar.mo20091c(obj);
        if (c == null) {
            ((C59052c) ((C59052c) C47098n.f122698a.mo56225c()).mo56372aa(54755)).mo56386p("Ordered receiver got unordered broadcast.");
            return C60866ct.f164955a;
        }
        C60870cx b = c.mo20087b(intent, i);
        C58838bb.m90866a(b, "onReceive must return a ListenableFuture.");
        return b;
    }
}

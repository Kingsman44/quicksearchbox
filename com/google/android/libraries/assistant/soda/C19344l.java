package com.google.android.libraries.assistant.soda;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.soda.l */
/* compiled from: PG */
public final /* synthetic */ class C19344l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19346n f54135a;

    /* renamed from: b */
    public final /* synthetic */ InputStream f54136b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f54137c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f54138d;

    public /* synthetic */ C19344l(C19346n nVar, InputStream inputStream, C58833ax axVar, C58833ax axVar2) {
        this.f54135a = nVar;
        this.f54136b = inputStream;
        this.f54137c = axVar;
        this.f54138d = axVar2;
    }

    public final Object call() {
        int i;
        int i2;
        C19346n nVar = this.f54135a;
        InputStream inputStream = this.f54136b;
        C58833ax axVar = this.f54137c;
        C58833ax axVar2 = this.f54138d;
        Soda soda = nVar.f54142c;
        SettableFuture settableFuture = nVar.f54145f;
        int i3 = nVar.f54143d;
        if (i3 == 0 || (i2 = nVar.f54144e) < 8000 || i2 > 384000) {
            ((C59052c) ((C59052c) C19346n.f54140a.mo56225c()).mo56372aa(47630)).mo56386p("Incorrect Format set");
            i = 0;
        } else {
            i = (i3 + i3) * (i2 / 1000) * 10;
        }
        C19346n.m36847b(soda, inputStream, axVar, axVar2, settableFuture, i);
        return null;
    }
}

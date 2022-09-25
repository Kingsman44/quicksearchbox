package com.google.android.apps.search.faceviewer;

import com.google.p363ad.p364a.C6669aa;
import com.google.p363ad.p364a.C6677ai;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.faceviewer.k */
/* compiled from: PG */
public final /* synthetic */ class C132687k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C6669aa f362071a;

    public /* synthetic */ C132687k(C6669aa aaVar) {
        this.f362071a = aaVar;
    }

    public final void accept(Object obj) {
        C6669aa aaVar = this.f362071a;
        String str = (String) obj;
        aaVar.copyOnWrite();
        C6677ai aiVar = (C6677ai) aaVar.instance;
        C6677ai aiVar2 = C6677ai.f19940j;
        str.getClass();
        aiVar.f19942a |= 128;
        aiVar.f19949h = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

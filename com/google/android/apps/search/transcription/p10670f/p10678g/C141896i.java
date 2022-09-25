package com.google.android.apps.search.transcription.p10670f.p10678g;

import android.content.Intent;
import com.google.android.apps.search.transcription.p10670f.C141786ae;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.transcription.f.g.i */
/* compiled from: PG */
public final /* synthetic */ class C141896i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C141909v f385013a;

    /* renamed from: b */
    public final /* synthetic */ int f385014b;

    /* renamed from: c */
    public final /* synthetic */ Intent f385015c;

    public /* synthetic */ C141896i(C141909v vVar, int i, Intent intent) {
        this.f385013a = vVar;
        this.f385014b = i;
        this.f385015c = intent;
    }

    public final void accept(Object obj) {
        C141909v vVar = this.f385013a;
        int i = this.f385014b;
        Intent intent = this.f385015c;
        vVar.f385032b.mo116879c(intent, i);
        C141786ae.m230051e(intent);
        ((C141912y) obj).mo116882c();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

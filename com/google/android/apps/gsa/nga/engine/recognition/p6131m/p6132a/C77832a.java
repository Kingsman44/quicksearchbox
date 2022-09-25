package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.recognition.C77549ab;
import com.google.speech.recognizer.p5233a.C67464l;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.a.a */
/* compiled from: PG */
public final /* synthetic */ class C77832a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C67464l f214403a;

    /* renamed from: b */
    public final /* synthetic */ ac f214404b;

    /* renamed from: c */
    public final /* synthetic */ boolean f214405c;

    public /* synthetic */ C77832a(C67464l lVar, ac acVar, boolean z) {
        this.f214403a = lVar;
        this.f214404b = acVar;
        this.f214405c = z;
    }

    public final void accept(Object obj) {
        ((C77549ab) obj).mo72601a(this.f214403a, this.f214404b, this.f214405c);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

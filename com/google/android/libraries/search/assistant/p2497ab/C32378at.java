package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.ab.at */
/* compiled from: PG */
public final /* synthetic */ class C32378at implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C32364af f86801a;

    public /* synthetic */ C32378at(C32364af afVar) {
        this.f86801a = afVar;
    }

    public final void accept(Object obj) {
        C32364af afVar = this.f86801a;
        C59071e eVar = C32389bd.f86813a;
        boolean z = true;
        if (((Integer) obj).intValue() != 1) {
            z = false;
        }
        afVar.copyOnWrite();
        C32365ag agVar = (C32365ag) afVar.instance;
        C32365ag agVar2 = C32365ag.f86758h;
        agVar.f86760a |= 4;
        agVar.f86763d = z;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

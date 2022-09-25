package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.libraries.logging.C28292j;
import com.google.assistant.p3745ab.C48304dc;
import com.google.assistant.p3745ab.C48305dd;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ii */
/* compiled from: PG */
public final /* synthetic */ class C108428ii implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C108430ik f301587a;

    public /* synthetic */ C108428ii(C108430ik ikVar) {
        this.f301587a = ikVar;
    }

    public final void accept(Object obj) {
        C108430ik ikVar = this.f301587a;
        C48304dc dcVar = (C48304dc) C48305dd.f124927d.createBuilder();
        long longValue = ((Long) obj).longValue();
        dcVar.copyOnWrite();
        C48305dd ddVar = (C48305dd) dcVar.instance;
        ddVar.f124930a |= 1;
        ddVar.f124931b = longValue;
        C28292j jVar = ikVar.f301597d;
        jVar.f76974b.mo58885m(C48305dd.f124928e, (C48305dd) dcVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

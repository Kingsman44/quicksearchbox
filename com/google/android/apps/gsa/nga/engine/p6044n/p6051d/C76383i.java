package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.nga.engine.ae.a.aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.i */
/* compiled from: PG */
public final /* synthetic */ class C76383i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76390p f211516a;

    public /* synthetic */ C76383i(C76390p pVar) {
        this.f211516a = pVar;
    }

    public final void accept(Object obj) {
        aa aaVar = this.f211516a.f211526d;
        C51406gn gnVar = ((C51460in) obj).f134055b;
        if (gnVar == null) {
            gnVar = C51406gn.f133887s;
        }
        C51401gi a = C51401gi.m86175a(gnVar.f133894f);
        if (a == null) {
            a = C51401gi.CONTROLLER_STATE_UNKNOWN;
        }
        aaVar.a.c.set(a == C51401gi.SET_MESSAGE);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

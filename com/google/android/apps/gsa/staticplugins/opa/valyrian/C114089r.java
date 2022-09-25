package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.r */
/* compiled from: PG */
public final /* synthetic */ class C114089r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f316096a;

    public /* synthetic */ C114089r(C113926aa aaVar) {
        this.f316096a = aaVar;
    }

    public final void accept(Object obj) {
        C113926aa aaVar = this.f316096a;
        C114034q.m188817m((ViewGroup) obj, (Animator) aaVar.f315534w.get(), (Animator) aaVar.f315535x.get());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108324em;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.l */
/* compiled from: PG */
public final /* synthetic */ class C114083l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f316088a;

    /* renamed from: b */
    public final /* synthetic */ C108324em f316089b;

    public /* synthetic */ C114083l(C113926aa aaVar, C108324em emVar) {
        this.f316088a = aaVar;
        this.f316089b = emVar;
    }

    public final void accept(Object obj) {
        C113926aa aaVar = this.f316088a;
        C108324em emVar = this.f316089b;
        ImageView imageView = (ImageView) obj;
        C28292j jVar = new C28292j(127419);
        jVar.mo33795i(5);
        C28295m.m52919e(imageView, jVar);
        imageView.setOnClickListener(new C113952b(aaVar, emVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

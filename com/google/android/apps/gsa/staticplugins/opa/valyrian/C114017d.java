package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d */
/* compiled from: PG */
public final /* synthetic */ class C114017d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f315661a;

    public /* synthetic */ C114017d(C113926aa aaVar) {
        this.f315661a = aaVar;
    }

    public final void accept(Object obj) {
        C113926aa aaVar = this.f315661a;
        TextView textView = (TextView) obj;
        String x = aaVar.f315514c.mo79758x(C90037cp.f248630z);
        if (!x.isEmpty()) {
            textView.setOnClickListener(new C89943l(new C113922a(aaVar, x)));
            C28292j jVar = new C28292j(111042);
            jVar.mo33795i(5);
            C28295m.m52919e(textView, jVar);
            textView.setVisibility(0);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

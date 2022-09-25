package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import android.net.Uri;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.p4853b.C63367k;
import com.google.protos.p4850an.p4853b.C63380x;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.f */
/* compiled from: PG */
public final /* synthetic */ class C111669f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Uri.Builder f310447a;

    public /* synthetic */ C111669f(Uri.Builder builder) {
        this.f310447a = builder;
    }

    public final void accept(Object obj) {
        C63367k kVar;
        Uri.Builder builder = this.f310447a;
        C61748j jVar = (C61748j) obj;
        int i = C111671h.f310452c;
        if (jVar.f166802a == 8) {
            kVar = (C63367k) jVar.f166803b;
        } else {
            kVar = C63367k.f171252c;
        }
        C63380x xVar = kVar.f171255b;
        if (xVar == null) {
            xVar = C63380x.f171276d;
        }
        builder.appendQueryParameter("length_millis", String.valueOf((long) xVar.f171279b));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.gms.appdatasearch.C142796al;
import com.google.android.gms.search.p10865b.C145861a;
import com.google.android.gms.search.p10865b.C145864b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58506ho;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.aw */
/* compiled from: PG */
public final /* synthetic */ class C103230aw implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58506ho f287998a;

    public /* synthetic */ C103230aw(C58506ho hoVar) {
        this.f287998a = hoVar;
    }

    public final void accept(Object obj) {
        C58506ho hoVar = this.f287998a;
        C142796al alVar = (C142796al) obj;
        String h = alVar.mo117712h("name");
        String g = alVar.mo117711g();
        if (h != null && g != null) {
            hoVar.mo55456j(new C103276e(h, ((C145861a) C145864b.m237624b(g, C58837ba.m90858g(alVar.mo117713i()))).f394402a), Double.valueOf(alVar.mo117705a()));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

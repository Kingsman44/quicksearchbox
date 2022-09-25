package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.gms.appdatasearch.C142796al;
import com.google.common.p4522b.C58526ih;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.ao */
/* compiled from: PG */
public final /* synthetic */ class C103222ao implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58526ih f287987a;

    public /* synthetic */ C103222ao(C58526ih ihVar) {
        this.f287987a = ihVar;
    }

    public final void accept(Object obj) {
        C58526ih ihVar = this.f287987a;
        String h = ((C142796al) obj).mo117712h("name");
        if (h != null) {
            ihVar.mo55373c(h);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

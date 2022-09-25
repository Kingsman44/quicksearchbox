package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import android.widget.TextView;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C81528c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f222974a;

    public /* synthetic */ C81528c(String str) {
        this.f222974a = str;
    }

    public final void accept(Object obj) {
        String str = this.f222974a;
        C59071e eVar = C81525ae.f222944a;
        ((TextView) obj).setText(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

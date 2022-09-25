package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.p6396b;

import android.widget.TextView;
import androidx.core.app.C1827n;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.b.m */
/* compiled from: PG */
public final /* synthetic */ class C81944m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81948q f224045a;

    public /* synthetic */ C81944m(C81948q qVar) {
        this.f224045a = qVar;
    }

    public final void accept(Object obj) {
        ((TextView) C1827n.m5006a(this.f224045a, R.id.sed_panthera_greeting)).setText((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

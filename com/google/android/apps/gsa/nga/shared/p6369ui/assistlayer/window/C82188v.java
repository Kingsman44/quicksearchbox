package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.C82037d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.v */
/* compiled from: PG */
public final /* synthetic */ class C82188v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82192z f224620a;

    public /* synthetic */ C82188v(C82192z zVar) {
        this.f224620a = zVar;
    }

    public final void accept(Object obj) {
        C82192z zVar = this.f224620a;
        C82037d dVar = (C82037d) obj;
        ViewParent parent = zVar.f224633f.getParent();
        if (parent != null) {
            View view = (View) parent;
            view.setSystemUiVisibility(dVar.mo75476c() | 134217728);
            zVar.f224638k.mo28213m("[NGA] setUiFlags", 8, new C82171e(view, dVar));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

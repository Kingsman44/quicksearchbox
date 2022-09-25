package com.google.android.libraries.web.contrib.favicon;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.contrib.favicon.internal.C43556c;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.favicon.f */
/* compiled from: PG */
public final /* synthetic */ class C43547f implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C43547f f113705a = new C43547f();

    private /* synthetic */ C43547f() {
    }

    public final void accept(Object obj) {
        new WebModelProvider((Fragment) obj).mo47072a(C43556c.class);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

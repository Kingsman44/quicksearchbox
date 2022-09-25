package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.Call;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.u */
/* compiled from: PG */
public final class C79534u {

    /* renamed from: a */
    public Optional f218249a = Optional.empty();

    /* renamed from: b */
    public final Call.Callback f218250b = new C79533t(this);

    /* renamed from: a */
    public static void m127611a(Optional optional, Call call, int i) {
        optional.ifPresent(new C79527n(call, i));
    }
}

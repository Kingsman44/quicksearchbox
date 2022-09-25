package com.google.android.apps.search.podcasts.p10550b.p10554d;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.podcasts.b.d.e */
/* compiled from: PG */
public final class C140055e {

    /* renamed from: a */
    private final Context f380632a;

    /* renamed from: b */
    private final Executor f380633b;

    /* renamed from: c */
    private final Executor f380634c;

    public C140055e(Context context, Executor executor, Executor executor2) {
        this.f380634c = executor2;
        this.f380632a = context;
        this.f380633b = executor;
    }

    /* renamed from: a */
    public final C140057g mo115420a(String str, boolean z) {
        return new C140057g(this.f380632a, this.f380633b, this.f380634c, str, true != z ? "podcasts/local_proto_storage" : "velour/feature_data/wernicke_player");
    }
}

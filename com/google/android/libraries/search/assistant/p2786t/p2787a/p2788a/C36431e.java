package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a;

import android.content.Context;
import com.google.android.apps.gsa.notificationlistener.C83387d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.e */
/* compiled from: PG */
public final class C36431e {

    /* renamed from: a */
    public static final C59071e f95128a = C59071e.m91332i("com.google.android.libraries.search.assistant.t.a.a.e");

    /* renamed from: b */
    static final long f95129b = Duration.ofSeconds(5).toMillis();

    /* renamed from: c */
    public final C83387d f95130c;

    /* renamed from: d */
    public final Context f95131d;

    /* renamed from: e */
    public final C60888db f95132e;

    public C36431e(C83387d dVar, Context context, C60888db dbVar) {
        this.f95130c = dVar;
        this.f95131d = context;
        this.f95132e = dbVar;
    }

    /* renamed from: a */
    public final Optional mo40165a(Optional optional) {
        return Optional.ofNullable(C83387d.m132715e(optional)).map(C36429c.f95124a);
    }
}

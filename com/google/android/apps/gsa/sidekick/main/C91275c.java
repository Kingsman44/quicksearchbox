package com.google.android.apps.gsa.sidekick.main;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.c */
/* compiled from: PG */
public final class C91275c {

    /* renamed from: a */
    public static final C59071e f254741a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.c");

    /* renamed from: b */
    public final String f254742b;

    /* renamed from: c */
    public final C69464a f254743c;

    /* renamed from: d */
    public final AtomicBoolean f254744d = new AtomicBoolean(false);

    /* renamed from: e */
    public final CountDownLatch f254745e = new CountDownLatch(1);

    /* renamed from: f */
    public final Object f254746f = new Object();

    /* renamed from: g */
    public volatile long f254747g;

    public C91275c(Context context, C69464a aVar) {
        this.f254743c = aVar;
        this.f254742b = context.getString(R.string.user_client_id);
    }
}

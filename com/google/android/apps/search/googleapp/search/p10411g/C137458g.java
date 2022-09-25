package com.google.android.apps.search.googleapp.search.p10411g;

import android.content.Context;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.search.g.g */
/* compiled from: PG */
public final class C137458g {

    /* renamed from: a */
    public final Context f373860a;

    /* renamed from: b */
    public final C60887da f373861b;

    /* renamed from: c */
    public final Executor f373862c;

    /* renamed from: d */
    public final C46180e f373863d;

    public C137458g(Context context, C60887da daVar, Executor executor, C46180e eVar) {
        this.f373860a = context;
        this.f373861b = daVar;
        this.f373862c = executor;
        this.f373863d = eVar;
    }

    /* renamed from: a */
    public final boolean mo113748a(String str) {
        return this.f373860a.checkSelfPermission(str) == 0;
    }
}

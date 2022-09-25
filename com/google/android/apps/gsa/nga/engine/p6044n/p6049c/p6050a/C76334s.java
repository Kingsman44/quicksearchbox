package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.googlequicksearchbox.R;
import java.util.Locale;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.s */
/* compiled from: PG */
public final /* synthetic */ class C76334s implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C76337v f211413a;

    /* renamed from: b */
    public final /* synthetic */ Locale f211414b;

    /* renamed from: c */
    public final /* synthetic */ String f211415c;

    public /* synthetic */ C76334s(C76337v vVar, Locale locale, String str) {
        this.f211413a = vVar;
        this.f211414b = locale;
        this.f211415c = str;
    }

    public final Object get() {
        C76337v vVar = this.f211413a;
        Locale locale = this.f211414b;
        String str = this.f211415c;
        return vVar.f211421c.mo75121a(locale).getString(R.string.nga_executors_reply_to_notification_replied, new Object[]{str});
    }
}

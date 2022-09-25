package com.google.android.gms.cast.framework;

import android.content.Context;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.cast.framework.av */
/* compiled from: PG */
public abstract class C143414av {

    /* renamed from: a */
    public final Context f388912a;

    /* renamed from: b */
    public final String f388913b;

    /* renamed from: c */
    public final C143413au f388914c = new C143413au(this);

    protected C143414av(Context context, String str) {
        C143919bh.m233958a(context);
        this.f388912a = context.getApplicationContext();
        C143919bh.m233969l(str);
        this.f388913b = str;
    }

    /* renamed from: a */
    public abstract C143409aq mo118626a(String str);

    /* renamed from: b */
    public abstract boolean mo118627b();
}

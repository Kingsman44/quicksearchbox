package com.google.android.apps.search.googleapp.activity.p10137b;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.activity.b.i */
/* compiled from: PG */
public final class C133412i {

    /* renamed from: a */
    private final Context f363533a;

    /* renamed from: b */
    private final boolean f363534b;

    public C133412i(Context context, boolean z) {
        C69664n.m101061g(context, "context");
        this.f363533a = context;
        this.f363534b = z;
    }

    /* renamed from: a */
    public final boolean mo111133a() {
        return this.f363534b && this.f363533a.getResources().getBoolean(R.bool.googleapp_is_large_screen);
    }
}

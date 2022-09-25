package com.google.android.libraries.assistant.ampactions;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.p103b.C2150h;

/* renamed from: com.google.android.libraries.assistant.ampactions.q */
/* compiled from: PG */
public final class C11044q {

    /* renamed from: a */
    public final float f36276a;

    /* renamed from: b */
    public final float f36277b;

    /* renamed from: c */
    public final ViewGroup f36278c;

    /* renamed from: d */
    public final C2150h f36279d;

    /* renamed from: e */
    public View f36280e;

    /* renamed from: f */
    public int f36281f;

    /* renamed from: g */
    public final C11036i f36282g;

    public C11044q(ViewGroup viewGroup, C11036i iVar) {
        this.f36278c = viewGroup;
        this.f36282g = iVar;
        this.f36279d = C2150h.m5964m(viewGroup, new C11043p(this));
        this.f36277b = m26133a(viewGroup.getContext());
        this.f36276a = m26133a(viewGroup.getContext());
    }

    /* renamed from: a */
    private static float m26133a(Context context) {
        return (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 150.0f;
    }
}

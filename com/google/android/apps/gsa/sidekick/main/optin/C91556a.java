package com.google.android.apps.gsa.sidekick.main.optin;

import com.google.android.apps.gsa.search.core.C85640ay;
import com.google.android.apps.gsa.shared.p7148ui.C90705q;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.common.p4552o.C60547ty;
import com.google.p375ai.p378b.C7891nu;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.a */
/* compiled from: PG */
public abstract class C91556a extends C90705q {

    /* renamed from: j */
    public C91376f f255394j;

    protected C91556a() {
        super("BaseOptInActivity", C60547ty.NOW_OPTIN_ACTIVITY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract C7891nu mo85939w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo85941x() {
        return this.f255394j.mo85697b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract int mo85940y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo85942z(int i) {
        C85640ay.m137425b(i, mo85939w(), mo85940y(), 1);
    }
}

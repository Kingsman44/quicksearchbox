package com.google.android.libraries.onegoogle.actions;

import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.actions.g */
/* compiled from: PG */
public abstract class C30806g {
    /* renamed from: a */
    public abstract int mo36488a();

    /* renamed from: b */
    public abstract int mo36489b();

    /* renamed from: c */
    public abstract C30807h mo36490c();

    /* renamed from: d */
    public abstract void mo36491d(int i);

    /* renamed from: e */
    public abstract void mo36492e(String str);

    /* renamed from: f */
    public abstract void mo36493f(int i);

    /* renamed from: g */
    public final C30807h mo36510g() {
        boolean z = true;
        C58838bb.m90884s(mo36488a() != R.id.og_ai_not_set, "Did you forget to setId()?");
        if (mo36489b() == -1) {
            z = false;
        }
        C58838bb.m90884s(z, "Did you forget to setVeId()?");
        return mo36490c();
    }
}

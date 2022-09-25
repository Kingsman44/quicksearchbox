package com.google.android.apps.gsa.soundsearchwidget;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;

/* renamed from: com.google.android.apps.gsa.soundsearchwidget.a */
/* compiled from: PG */
public final class C92132a implements C86091a {

    /* renamed from: a */
    private final Context f256864a;

    public C92132a(Context context) {
        this.f256864a = context;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (C90771bo.m148273b(this.f256864a, UserHandleCompat.m148154a())) {
            this.f256864a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f256864a, "com.google.android.apps.gsa.soundsearchwidget.AliasAddShortcutActivity"), 2, 1);
        }
    }
}

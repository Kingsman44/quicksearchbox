package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.support.p033v7.app.C0358as;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bl */
/* compiled from: PG */
class C30741bl extends C0358as {

    /* renamed from: a */
    final ViewGroup f82975a;

    public C30741bl(Context context) {
        super(context, 2132151096);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.account_menu_popover_dialog, (ViewGroup) null);
        this.f82975a = viewGroup;
        C2043bi.m5526T(viewGroup, new C30740bk(this));
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getEventType() == 32 || super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
}

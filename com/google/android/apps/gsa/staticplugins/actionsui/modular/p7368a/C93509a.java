package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.a */
/* compiled from: PG */
public final class C93509a extends C93518j {

    /* renamed from: a */
    public final Context f261122a;

    /* renamed from: b */
    public boolean f261123b;

    public C93509a(Context context) {
        this.f261122a = context;
        context.getContentResolver();
        this.f261123b = C90772bp.m148280G(context);
    }

    /* renamed from: a */
    public final int mo87923a() {
        return this.f261123b ? R.drawable.ic_airplane_mode_on_action_card_material : R.drawable.ic_airplane_mode_off_action_card_material;
    }

    /* renamed from: b */
    public final int mo87924b() {
        return this.f261123b ? R.string.airplanemode_on : R.string.airplanemode_off;
    }

    /* renamed from: c */
    public final int mo87925c() {
        return -1;
    }

    /* renamed from: d */
    public final IntentFilter mo87926d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        return intentFilter;
    }

    /* renamed from: e */
    public final CharSequence mo87927e(Resources resources) {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public final void mo87928f() {
        this.f261123b = C90772bp.m148280G(this.f261122a);
    }

    /* renamed from: g */
    public final boolean mo87929g() {
        return this.f261123b;
    }
}

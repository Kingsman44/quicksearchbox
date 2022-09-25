package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.PowerManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.b */
/* compiled from: PG */
public final class C93510b extends C93518j {

    /* renamed from: a */
    private final PowerManager f261124a;

    /* renamed from: b */
    private boolean f261125b;

    public C93510b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        this.f261124a = powerManager;
        this.f261125b = powerManager.isPowerSaveMode();
    }

    /* renamed from: a */
    public final int mo87923a() {
        return this.f261125b ? R.drawable.ic_battery_saver_on_action_card_material : R.drawable.ic_battery_saver_off_action_card_material;
    }

    /* renamed from: b */
    public final int mo87924b() {
        return this.f261125b ? R.string.batterysaver_on : R.string.batterysaver_off;
    }

    /* renamed from: c */
    public final int mo87925c() {
        return -1;
    }

    /* renamed from: d */
    public final IntentFilter mo87926d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    /* renamed from: e */
    public final CharSequence mo87927e(Resources resources) {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public final void mo87928f() {
        this.f261125b = this.f261124a.isPowerSaveMode();
    }

    /* renamed from: g */
    public final boolean mo87929g() {
        return this.f261125b;
    }
}

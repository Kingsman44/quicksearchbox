package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93543au;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.e */
/* compiled from: PG */
public final class C93513e implements C93514f {

    /* renamed from: a */
    private final ContentResolver f261130a;

    /* renamed from: b */
    private ContentObserver f261131b;

    /* renamed from: c */
    private int f261132c;

    public C93513e(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        this.f261130a = contentResolver;
        this.f261132c = m154204i(contentResolver);
    }

    /* renamed from: i */
    private static int m154204i(ContentResolver contentResolver) {
        try {
            return (Settings.System.getInt(contentResolver, "screen_brightness") * 100) / PrivateKeyType.INVALID;
        } catch (Settings.SettingNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final int mo87923a() {
        return R.drawable.quantum_ic_brightness_high_grey600_48;
    }

    /* renamed from: b */
    public final int mo87924b() {
        return R.string.brightness;
    }

    /* renamed from: c */
    public final int mo87925c() {
        return this.f261132c;
    }

    /* renamed from: e */
    public final CharSequence mo87927e(Resources resources) {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public final void mo87928f() {
        this.f261132c = m154204i(this.f261130a);
    }

    /* renamed from: g */
    public final boolean mo87929g() {
        return false;
    }

    /* renamed from: h */
    public final void mo87932h(C93543au auVar, Context context) {
        Uri uriFor = Settings.System.getUriFor("screen_brightness");
        C93512d dVar = new C93512d(auVar);
        this.f261131b = dVar;
        this.f261130a.registerContentObserver(uriFor, false, dVar);
    }

    /* renamed from: j */
    public final void mo87933j(Context context) {
        ContentObserver contentObserver = this.f261131b;
        if (contentObserver != null) {
            this.f261130a.unregisterContentObserver(contentObserver);
            this.f261131b = null;
        }
    }
}

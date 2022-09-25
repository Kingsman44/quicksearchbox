package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93543au;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.l */
/* compiled from: PG */
public final class C93520l implements C93514f {

    /* renamed from: a */
    public int f261143a;

    /* renamed from: b */
    private final ContentResolver f261144b;

    /* renamed from: c */
    private final AudioManager f261145c;

    /* renamed from: d */
    private final int f261146d;

    /* renamed from: e */
    private ContentObserver f261147e;

    public C93520l(AudioManager audioManager, ContentResolver contentResolver, int i) {
        this.f261145c = audioManager;
        this.f261144b = contentResolver;
        this.f261146d = i;
    }

    /* renamed from: a */
    public final int mo87923a() {
        return R.drawable.quantum_ic_volume_up_grey600_48;
    }

    /* renamed from: b */
    public final int mo87924b() {
        return R.string.volume;
    }

    /* renamed from: c */
    public final int mo87925c() {
        return this.f261143a;
    }

    /* renamed from: e */
    public final CharSequence mo87927e(Resources resources) {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public final void mo87928f() {
        this.f261143a = mo87936i();
    }

    /* renamed from: g */
    public final boolean mo87929g() {
        return false;
    }

    /* renamed from: h */
    public final void mo87932h(C93543au auVar, Context context) {
        this.f261147e = new C93519k(this, new Handler(), auVar);
        this.f261144b.registerContentObserver(Settings.System.CONTENT_URI, true, this.f261147e);
    }

    /* renamed from: i */
    public final int mo87936i() {
        return (this.f261145c.getStreamVolume(this.f261146d) * 100) / this.f261145c.getStreamMaxVolume(this.f261146d);
    }

    /* renamed from: j */
    public final void mo87933j(Context context) {
        ContentObserver contentObserver = this.f261147e;
        if (contentObserver != null) {
            this.f261144b.unregisterContentObserver(contentObserver);
            this.f261147e = null;
        }
    }
}

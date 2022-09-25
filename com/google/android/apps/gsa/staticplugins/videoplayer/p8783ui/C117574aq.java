package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.apps.gsa.shared.util.C90779c;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.aq */
/* compiled from: PG */
final class C117574aq extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C117578au f326356a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117574aq(C117578au auVar, Handler handler) {
        super(handler);
        this.f326356a = auVar;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        C117578au auVar = this.f326356a;
        boolean z2 = false;
        if (Settings.System.getInt(auVar.f326369g, "accelerometer_rotation", 0) == 1) {
            z2 = true;
        }
        auVar.f326371i = z2;
        C90779c.m148334a(this.f326356a.f326365c, -1);
    }
}

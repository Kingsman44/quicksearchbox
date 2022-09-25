package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.apps.gsa.shared.util.C90779c;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.r */
/* compiled from: PG */
final class C117596r extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C117598t f326420a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117596r(C117598t tVar, Handler handler) {
        super(handler);
        this.f326420a = tVar;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        C117598t tVar = this.f326420a;
        boolean z2 = false;
        if (Settings.System.getInt(tVar.f326432h, "accelerometer_rotation", 0) == 1) {
            z2 = true;
        }
        tVar.f326434j = z2;
        C90779c.m148334a(this.f326420a.f326430f, -1);
    }
}

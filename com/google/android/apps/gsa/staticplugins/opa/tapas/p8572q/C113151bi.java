package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.app.NotificationManager;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.provider.Settings;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.bi */
/* compiled from: PG */
public final class C113151bi {
    /* renamed from: a */
    public static Optional m187163a(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return Optional.empty();
        }
        return Optional.m71637of(Integer.valueOf(notificationManager.getCurrentInterruptionFilter()));
    }

    /* renamed from: b */
    public static Optional m187164b(Context context) {
        int i = Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode", -1);
        if (i == 0) {
            return Optional.m71637of(false);
        }
        if (i != 1) {
            return Optional.empty();
        }
        return Optional.m71637of(true);
    }

    /* renamed from: c */
    public static Optional m187165c(Context context) {
        return m187163a(context).flatMap(C113150bh.f313466a);
    }

    /* renamed from: d */
    public static Optional m187166d(Context context) {
        return Optional.ofNullable(NfcAdapter.getDefaultAdapter(context)).map(C113149bg.f313465a);
    }

    /* renamed from: e */
    public static Optional m187167e(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            return Optional.m71637of(false);
        }
        if (i != 32) {
            return Optional.empty();
        }
        return Optional.m71637of(true);
    }

    /* renamed from: f */
    public static boolean m187168f(Context context) {
        if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            return true;
        }
        return false;
    }
}

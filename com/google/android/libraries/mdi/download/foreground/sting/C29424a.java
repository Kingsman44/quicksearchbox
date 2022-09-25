package com.google.android.libraries.mdi.download.foreground.sting;

import android.app.Service;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.libraries.mdi.download.C29409fd;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.mdi.download.foreground.sting.a */
/* compiled from: PG */
abstract class C29424a extends Service implements C68288b {

    /* renamed from: a */
    private volatile C68326i f79768a;

    /* renamed from: b */
    private final Object f79769b = new Object();

    /* renamed from: c */
    private boolean f79770c = false;

    /* renamed from: a */
    public final C68326i mo34733a() {
        if (this.f79768a == null) {
            synchronized (this.f79769b) {
                if (this.f79768a == null) {
                    this.f79768a = new C68326i(this);
                }
            }
        }
        return this.f79768a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo34733a().mo17653jN();
    }

    public final void onCreate() {
        if (!this.f79770c) {
            this.f79770c = true;
            ((ForegroundDownloadService) this).f79767a = (C29409fd) ((amb) mo34733a().mo17653jN()).f197807b.a.f202798dq.mo17428b();
        }
        super.onCreate();
    }
}

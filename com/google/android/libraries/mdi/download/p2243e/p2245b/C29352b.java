package com.google.android.libraries.mdi.download.p2243e.p2245b;

import android.app.Service;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.libraries.mdi.download.p2243e.C29361k;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.mdi.download.e.b.b */
/* compiled from: PG */
abstract class C29352b extends Service implements C68288b {

    /* renamed from: a */
    private volatile C68326i f79571a;

    /* renamed from: b */
    private final Object f79572b = new Object();

    /* renamed from: c */
    private boolean f79573c = false;

    /* renamed from: a */
    public final C68326i mo34684a() {
        if (this.f79571a == null) {
            synchronized (this.f79572b) {
                if (this.f79571a == null) {
                    this.f79571a = new C68326i(this);
                }
            }
        }
        return this.f79571a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo34684a().mo17653jN();
    }

    public final void onCreate() {
        if (!this.f79573c) {
            this.f79573c = true;
            ((C29351a) this).f79570a = (C29361k) ((amb) mo34684a().mo17653jN()).f197807b.d.f201552bK.mo17428b();
        }
        super.onCreate();
    }
}

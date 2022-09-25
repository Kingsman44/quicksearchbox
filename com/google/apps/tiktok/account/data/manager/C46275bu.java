package com.google.apps.tiktok.account.data.manager;

import android.app.Service;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.apps.tiktok.account.data.manager.bu */
/* compiled from: PG */
abstract class C46275bu extends Service implements C68288b {

    /* renamed from: a */
    private volatile C68326i f121262a;

    /* renamed from: b */
    private final Object f121263b = new Object();

    /* renamed from: c */
    private boolean f121264c = false;

    /* renamed from: b */
    public final C68326i mo50310b() {
        if (this.f121262a == null) {
            synchronized (this.f121263b) {
                if (this.f121262a == null) {
                    this.f121262a = new C68326i(this);
                }
            }
        }
        return this.f121262a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo50310b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f121264c) {
            this.f121264c = true;
            mo50310b().mo17653jN();
            AccountSyncService accountSyncService = (AccountSyncService) this;
        }
        super.onCreate();
    }
}

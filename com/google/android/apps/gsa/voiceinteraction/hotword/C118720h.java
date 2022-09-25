package com.google.android.apps.gsa.voiceinteraction.hotword;

import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.h */
/* compiled from: PG */
public final class C118720h {

    /* renamed from: a */
    public static final C59071e f331160a = C59071e.m91332i("com.google.android.apps.gsa.voiceinteraction.hotword.h");

    /* renamed from: b */
    public final C68214a f331161b;

    /* renamed from: c */
    public boolean f331162c;

    /* renamed from: d */
    public boolean f331163d;

    /* renamed from: e */
    public boolean f331164e;

    /* renamed from: f */
    public boolean f331165f;

    /* renamed from: g */
    public boolean f331166g;

    /* renamed from: h */
    public boolean f331167h;

    public C118720h(C68214a aVar) {
        this.f331161b = aVar;
    }

    /* renamed from: a */
    public final synchronized void mo103922a() {
        this.f331162c = true;
    }

    /* renamed from: b */
    public final synchronized void mo103923b() {
        this.f331162c = false;
    }

    /* renamed from: c */
    public final synchronized boolean mo103924c() {
        return this.f331162c;
    }

    /* renamed from: d */
    public final boolean mo103925d() {
        if (!this.f331165f) {
            return false;
        }
        this.f331165f = false;
        return true;
    }

    /* renamed from: e */
    public final boolean mo103926e() {
        if (this.f331165f) {
            return false;
        }
        this.f331165f = true;
        return true;
    }
}

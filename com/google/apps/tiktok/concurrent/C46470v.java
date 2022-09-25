package com.google.apps.tiktok.concurrent;

import android.app.Notification;

/* renamed from: com.google.apps.tiktok.concurrent.v */
/* compiled from: PG */
public final class C46470v {

    /* renamed from: a */
    public final Notification f121597a;

    /* renamed from: b */
    public final int f121598b;

    /* renamed from: c */
    final String f121599c;

    public C46470v(Notification notification, int i, String str) {
        this.f121597a = notification;
        this.f121598b = i;
        this.f121599c = str;
    }

    public final String toString() {
        return "Trace=[" + this.f121599c + "], importance=[" + this.f121598b + "]" + (", notification=[" + this.f121597a.getChannelId() + "]");
    }
}

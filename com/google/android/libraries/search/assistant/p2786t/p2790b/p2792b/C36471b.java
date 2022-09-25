package com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b;

import android.service.notification.StatusBarNotification;

/* renamed from: com.google.android.libraries.search.assistant.t.b.b.b */
/* compiled from: PG */
final class C36471b extends C36473d {

    /* renamed from: a */
    private final StatusBarNotification f95216a;

    public C36471b(StatusBarNotification statusBarNotification) {
        this.f95216a = statusBarNotification;
    }

    /* renamed from: b */
    public final int mo40179b() {
        return 1;
    }

    /* renamed from: c */
    public final StatusBarNotification mo40183c() {
        return this.f95216a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36476g) {
            C36476g gVar = (C36476g) obj;
            if (gVar.mo40179b() != 1 || !this.f95216a.equals(gVar.mo40183c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f95216a.hashCode();
    }

    public final String toString() {
        String obj = this.f95216a.toString();
        return "SystemNotification{rawNotification=" + obj + "}";
    }
}

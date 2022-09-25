package com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b;

import com.google.android.libraries.search.assistant.notification.data.StandardNotification;

/* renamed from: com.google.android.libraries.search.assistant.t.b.b.c */
/* compiled from: PG */
final class C36472c extends C36473d {

    /* renamed from: a */
    private final StandardNotification f95217a;

    public C36472c(StandardNotification standardNotification) {
        this.f95217a = standardNotification;
    }

    /* renamed from: b */
    public final int mo40179b() {
        return 3;
    }

    /* renamed from: d */
    public final StandardNotification mo40187d() {
        return this.f95217a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36476g) {
            C36476g gVar = (C36476g) obj;
            if (gVar.mo40179b() != 3 || !this.f95217a.equals(gVar.mo40187d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f95217a.hashCode();
    }

    public final String toString() {
        String obj = this.f95217a.toString();
        return "SystemNotification{standardNotification=" + obj + "}";
    }
}

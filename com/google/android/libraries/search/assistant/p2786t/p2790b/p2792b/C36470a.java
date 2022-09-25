package com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;

/* renamed from: com.google.android.libraries.search.assistant.t.b.b.a */
/* compiled from: PG */
final class C36470a extends C36473d {

    /* renamed from: a */
    private final BundledMessageNotification f95215a;

    public C36470a(BundledMessageNotification bundledMessageNotification) {
        this.f95215a = bundledMessageNotification;
    }

    /* renamed from: a */
    public final BundledMessageNotification mo40178a() {
        return this.f95215a;
    }

    /* renamed from: b */
    public final int mo40179b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36476g) {
            C36476g gVar = (C36476g) obj;
            if (gVar.mo40179b() != 2 || !this.f95215a.equals(gVar.mo40178a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f95215a.hashCode();
    }

    public final String toString() {
        String obj = this.f95215a.toString();
        return "SystemNotification{messageNotification=" + obj + "}";
    }
}

package com.google.android.apps.search.podcasts.settings.p10613b;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;

/* renamed from: com.google.android.apps.search.podcasts.settings.b.b */
/* compiled from: PG */
public final class C141078b implements C47388b {

    /* renamed from: a */
    public final boolean f383018a;

    public C141078b(boolean z) {
        this.f383018a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C141078b) && this.f383018a == ((C141078b) obj).f383018a;
    }

    public final int hashCode() {
        return this.f383018a ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.f383018a;
        return "UpdateNewEpisodeNotificationsForAllShowsEvent(enableNewEpisodeNotifications=" + z + ")";
    }
}

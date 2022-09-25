package com.google.android.apps.search.podcasts.settings.p10613b;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;

/* renamed from: com.google.android.apps.search.podcasts.settings.b.a */
/* compiled from: PG */
public final class C141077a implements C47388b {

    /* renamed from: a */
    public final boolean f383017a;

    public C141077a(boolean z) {
        this.f383017a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C141077a) && this.f383017a == ((C141077a) obj).f383017a;
    }

    public final int hashCode() {
        return this.f383017a ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.f383017a;
        return "UpdateAutoDownloadingForAllShowsEvent(enableAutoDownloading=" + z + ")";
    }
}

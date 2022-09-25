package com.google.android.libraries.search.assistant.appactions.p2501a;

import android.widget.RemoteViews;
import com.google.assistant.p3931f.p3940d.p3941a.C52860aj;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.aa */
/* compiled from: PG */
public final class C32434aa {

    /* renamed from: a */
    public final RemoteViews f86903a;

    /* renamed from: b */
    public final C52860aj f86904b;

    public C32434aa(RemoteViews remoteViews, C52860aj ajVar) {
        C69664n.m101061g(ajVar, "remoteViewsInfo");
        this.f86903a = remoteViews;
        this.f86904b = ajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32434aa)) {
            return false;
        }
        C32434aa aaVar = (C32434aa) obj;
        return C69664n.m101066l(this.f86903a, aaVar.f86903a) && C69664n.m101066l(this.f86904b, aaVar.f86904b);
    }

    public final int hashCode() {
        return (this.f86903a.hashCode() * 31) + this.f86904b.hashCode();
    }

    public final String toString() {
        RemoteViews remoteViews = this.f86903a;
        C52860aj ajVar = this.f86904b;
        return "RemoteViewsResponse(remoteViews=" + remoteViews + ", remoteViewsInfo=" + ajVar + ")";
    }
}

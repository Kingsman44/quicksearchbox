package com.google.android.apps.search.googleapp.discover.p10166a.p10171c.p10172a;

import android.view.View;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.a.a */
/* compiled from: PG */
public final class C133976a {

    /* renamed from: a */
    public final View f364925a;

    /* renamed from: b */
    public final String f364926b;

    /* renamed from: c */
    public final boolean f364927c;

    /* renamed from: d */
    public final Duration f364928d;

    /* renamed from: e */
    private final boolean f364929e;

    public C133976a(View view, String str, boolean z, Duration duration, boolean z2) {
        C69664n.m101061g(view, "view");
        C69664n.m101061g(str, "contentKey");
        C69664n.m101061g(duration, "viewDuration");
        this.f364925a = view;
        this.f364926b = str;
        this.f364927c = z;
        this.f364928d = duration;
        this.f364929e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C133976a)) {
            return false;
        }
        C133976a aVar = (C133976a) obj;
        return C69664n.m101066l(this.f364925a, aVar.f364925a) && C69664n.m101066l(this.f364926b, aVar.f364926b) && this.f364927c == aVar.f364927c && C69664n.m101066l(this.f364928d, aVar.f364928d) && this.f364929e == aVar.f364929e;
    }

    public final int hashCode() {
        return (((((((this.f364925a.hashCode() * 31) + this.f364926b.hashCode()) * 31) + (this.f364927c ? 1 : 0)) * 31) + this.f364928d.hashCode()) * 31) + (this.f364929e ? 1 : 0);
    }

    public final String toString() {
        View view = this.f364925a;
        String str = this.f364926b;
        boolean z = this.f364927c;
        Duration duration = this.f364928d;
        boolean z2 = this.f364929e;
        return "TrackedView(view=" + view + ", contentKey=" + str + ", visibilityConditionsMet=" + z + ", viewDuration=" + duration + ", durationConditionMet=" + z2 + ")";
    }
}

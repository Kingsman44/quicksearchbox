package com.google.android.apps.search.assistant.surfaces.p9485e.p9487b;

import com.google.android.libraries.search.assistant.p2513e.p2515b.C32575a;
import com.google.android.libraries.search.assistant.p2513e.p2515b.C32591b;
import com.google.android.libraries.search.assistant.p2513e.p2515b.C32592c;
import com.google.android.libraries.search.assistant.p2513e.p2515b.C32593d;
import p3186j$.time.Duration;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b.e */
/* compiled from: PG */
public final class C126416e implements C126414c {

    /* renamed from: a */
    private final C32591b f348171a;

    public C126416e(C32591b bVar) {
        C69664n.m101061g(bVar, "event");
        this.f348171a = bVar;
    }

    /* renamed from: a */
    public final Duration mo107585a() {
        return this.f348171a.mo38153a();
    }

    /* renamed from: b */
    public final int mo107586b() {
        C32591b bVar = this.f348171a;
        if (bVar instanceof C32592c) {
            return 1;
        }
        if (bVar instanceof C32593d) {
            return 2;
        }
        if (bVar instanceof C32575a) {
            return 3;
        }
        throw new C69677g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C126416e) && C69664n.m101066l(this.f348171a, ((C126416e) obj).f348171a);
    }

    public final int hashCode() {
        return this.f348171a.hashCode();
    }

    public final String toString() {
        C32591b bVar = this.f348171a;
        return "OfflineEvent(event=" + bVar + ")";
    }
}

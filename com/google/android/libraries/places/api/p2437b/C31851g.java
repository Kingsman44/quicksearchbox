package com.google.android.libraries.places.api.p2437b;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.g */
/* compiled from: PG */
final class C31851g extends C31860p {

    /* renamed from: a */
    private List f85499a;

    /* renamed from: a */
    public final C31861q mo37437a() {
        List list = this.f85499a;
        if (list != null) {
            return new C31852h(list);
        }
        throw new IllegalStateException("Missing required properties: placeFields");
    }

    /* renamed from: b */
    public final void mo37438b(List list) {
        if (list != null) {
            this.f85499a = list;
            return;
        }
        throw new NullPointerException("Null placeFields");
    }
}

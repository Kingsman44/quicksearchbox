package com.google.android.libraries.search.assistant.invocation.p2598c.p2599a;

import android.support.p031v4.app.Fragment;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.c.a.b */
/* compiled from: PG */
public final class C33561b {

    /* renamed from: a */
    public final Fragment f89743a;

    /* renamed from: b */
    public final C33563d f89744b;

    public C33561b(Fragment fragment, C33563d dVar) {
        this.f89743a = fragment;
        this.f89744b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33561b)) {
            return false;
        }
        C33561b bVar = (C33561b) obj;
        return C69664n.m101066l(this.f89743a, bVar.f89743a) && C69664n.m101066l(this.f89744b, bVar.f89744b);
    }

    public final int hashCode() {
        return (this.f89743a.hashCode() * 31) + this.f89744b.hashCode();
    }

    public final String toString() {
        Fragment fragment = this.f89743a;
        C33563d dVar = this.f89744b;
        return "AssistLayerFragment(fragment=" + fragment + ", initialConfig=" + dVar + ")";
    }
}

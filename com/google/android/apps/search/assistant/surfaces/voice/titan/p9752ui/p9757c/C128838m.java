package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.c.m */
/* compiled from: PG */
public final class C128838m implements C128831f {

    /* renamed from: a */
    public final String f354128a;

    public C128838m(String str) {
        C69664n.m101061g(str, "text");
        this.f354128a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C128838m) && C69664n.m101066l(this.f354128a, ((C128838m) obj).f354128a);
    }

    public final int hashCode() {
        return this.f354128a.hashCode();
    }

    public final String toString() {
        String str = this.f354128a;
        return "TranscriptionContentState(text=" + str + ")";
    }
}

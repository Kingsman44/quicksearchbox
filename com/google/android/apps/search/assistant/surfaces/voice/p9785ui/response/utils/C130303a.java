package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.utils.a */
/* compiled from: PG */
public final class C130303a implements C47388b {

    /* renamed from: a */
    public final String f357175a;

    public C130303a(String str) {
        C69664n.m101061g(str, "text");
        this.f357175a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C130303a) && C69664n.m101066l(this.f357175a, ((C130303a) obj).f357175a);
    }

    public final int hashCode() {
        return this.f357175a.hashCode();
    }

    public final String toString() {
        String str = this.f357175a;
        return "InitiateKeyboardInputEvent(text=" + str + ")";
    }
}

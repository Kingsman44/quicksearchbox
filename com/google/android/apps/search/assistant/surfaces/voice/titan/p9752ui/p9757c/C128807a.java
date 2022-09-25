package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c;

import com.google.apps.tiktok.account.data.C46215j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.c.a */
/* compiled from: PG */
public final class C128807a implements C128827b {

    /* renamed from: a */
    public final C46215j f354070a;

    public C128807a(C46215j jVar) {
        C69664n.m101061g(jVar, "accountInfo");
        this.f354070a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C128807a) && C69664n.m101066l(this.f354070a, ((C128807a) obj).f354070a);
    }

    public final int hashCode() {
        return this.f354070a.hashCode();
    }

    public final String toString() {
        C46215j jVar = this.f354070a;
        return "AvailableAvatarState(accountInfo=" + jVar + ")";
    }
}

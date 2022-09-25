package com.google.android.apps.search.googleapp.settingsui;

import com.google.android.apps.search.googleapp.p10536x.C139873i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.al */
/* compiled from: PG */
public final class C139158al implements C139161ao {

    /* renamed from: a */
    public final C139873i f378474a;

    public C139158al(C139873i iVar) {
        C69664n.m101061g(iVar, "settingsEnum");
        this.f378474a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C139158al) && this.f378474a == ((C139158al) obj).f378474a;
    }

    public final int hashCode() {
        return this.f378474a.hashCode();
    }

    public final String toString() {
        C139873i iVar = this.f378474a;
        return "HostedFragment(settingsEnum=" + iVar + ")";
    }
}

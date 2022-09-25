package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80758ef;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.y */
/* compiled from: PG */
final class C78570y extends C78526ai {

    /* renamed from: b */
    private final String f216324b;

    /* renamed from: c */
    private final String f216325c;

    /* renamed from: d */
    private final C80831aj f216326d;

    /* renamed from: e */
    private final C80758ef f216327e;

    /* renamed from: f */
    private final int f216328f;

    public C78570y(String str, String str2, int i, C80831aj ajVar, C80758ef efVar) {
        this.f216324b = str;
        this.f216325c = str2;
        this.f216328f = i;
        this.f216326d = ajVar;
        this.f216327e = efVar;
    }

    /* renamed from: a */
    public final C80758ef mo73458a() {
        return this.f216327e;
    }

    /* renamed from: b */
    public final C80831aj mo73459b() {
        return this.f216326d;
    }

    /* renamed from: c */
    public final String mo73460c() {
        return this.f216325c;
    }

    /* renamed from: d */
    public final String mo73461d() {
        return this.f216324b;
    }

    /* renamed from: e */
    public final int mo73462e() {
        return this.f216328f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78526ai) {
            C78526ai aiVar = (C78526ai) obj;
            return this.f216324b.equals(aiVar.mo73461d()) && this.f216325c.equals(aiVar.mo73460c()) && this.f216328f == aiVar.mo73462e() && this.f216326d.equals(aiVar.mo73459b()) && this.f216327e.equals(aiVar.mo73458a());
        }
    }

    public final int hashCode() {
        return ((((((((this.f216324b.hashCode() ^ 1000003) * 1000003) ^ this.f216325c.hashCode()) * 1000003) ^ this.f216328f) * 1000003) ^ this.f216326d.hashCode()) * 1000003) ^ this.f216327e.hashCode();
    }

    public final String toString() {
        String str = this.f216324b;
        String str2 = this.f216325c;
        int i = this.f216328f;
        String obj = this.f216326d.toString();
        String obj2 = this.f216327e.toString();
        return "Greeting{text=" + str + ", bottomText=" + str2 + ", type=" + C78524ag.m126140a(i) + ", clickAction=" + obj + ", privacyInputUi=" + obj2 + "}";
    }
}

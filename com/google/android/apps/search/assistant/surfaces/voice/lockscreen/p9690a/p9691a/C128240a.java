package com.google.android.apps.search.assistant.surfaces.voice.lockscreen.p9690a.p9691a;

import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.lockscreen.a.a.a */
/* compiled from: PG */
public final class C128240a extends C128241b {

    /* renamed from: a */
    public final C51331dt f352741a;

    /* renamed from: b */
    public final Duration f352742b;

    public C128240a(C51331dt dtVar, Duration duration) {
        this.f352741a = dtVar;
        this.f352742b = duration;
    }

    /* renamed from: a */
    public final C51331dt mo108378a() {
        return this.f352741a;
    }

    /* renamed from: b */
    public final Duration mo108379b() {
        return this.f352742b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C128241b) {
            C128241b bVar = (C128241b) obj;
            return this.f352741a.equals(bVar.mo108378a()) && this.f352742b.equals(bVar.mo108379b());
        }
    }

    public final int hashCode() {
        return ((this.f352741a.hashCode() ^ 1000003) * 1000003) ^ this.f352742b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f352741a.f133647e);
        String obj = this.f352742b.toString();
        return "SavedTriggerTrustLevel{triggerTrustLevel=" + num + ", triggerTrustLevelTime=" + obj + "}";
    }
}

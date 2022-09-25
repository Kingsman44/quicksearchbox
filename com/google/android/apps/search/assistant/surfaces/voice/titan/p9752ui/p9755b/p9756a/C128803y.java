package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.assistant.p3897e.p3921j.C51809dy;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.y */
/* compiled from: PG */
final class C128803y {

    /* renamed from: a */
    public final C128802x f354066a;

    /* renamed from: b */
    public final C51809dy f354067b;

    /* renamed from: c */
    public final C128788j f354068c;

    /* renamed from: d */
    public final boolean f354069d;

    public C128803y(C128802x xVar, C51809dy dyVar, C128788j jVar, boolean z) {
        C69664n.m101061g(xVar, "voicePlateConnectionState");
        C69664n.m101061g(dyVar, "intentPlateClientOp");
        C69664n.m101061g(jVar, "escapeHatchState");
        this.f354066a = xVar;
        this.f354067b = dyVar;
        this.f354068c = jVar;
        this.f354069d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128803y)) {
            return false;
        }
        C128803y yVar = (C128803y) obj;
        return C69664n.m101066l(this.f354066a, yVar.f354066a) && C69664n.m101066l(this.f354067b, yVar.f354067b) && C69664n.m101066l(this.f354068c, yVar.f354068c) && this.f354069d == yVar.f354069d;
    }

    public final int hashCode() {
        return (((((this.f354066a.hashCode() * 31) + this.f354067b.hashCode()) * 31) + this.f354068c.hashCode()) * 31) + (this.f354069d ? 1 : 0);
    }

    public final String toString() {
        C128802x xVar = this.f354066a;
        C51809dy dyVar = this.f354067b;
        C128788j jVar = this.f354068c;
        boolean z = this.f354069d;
        return "voicePlateConnectionState: " + xVar + "\nintentPlateClientOp: " + dyVar + "\nescapeHatchState: " + jVar + "\nisOAuthErrorActive: " + z;
    }
}

package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import com.google.android.apps.gsa.nga.api.a.af;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.w */
/* compiled from: PG */
public final class C125934w {

    /* renamed from: a */
    public static final C125934w f347146a;

    /* renamed from: b */
    public final boolean f347147b;

    /* renamed from: c */
    public final af f347148c;

    static {
        af afVar = af.w;
        C69664n.m101060f(afVar, "getDefaultInstance()");
        f347146a = new C125934w(false, afVar);
    }

    public C125934w(boolean z, af afVar) {
        C69664n.m101061g(afVar, "keyboardConfiguration");
        this.f347147b = z;
        this.f347148c = afVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125934w)) {
            return false;
        }
        C125934w wVar = (C125934w) obj;
        return this.f347147b == wVar.f347147b && C69664n.m101066l(this.f347148c, wVar.f347148c);
    }

    public final int hashCode() {
        return ((this.f347147b ? 1 : 0) * true) + this.f347148c.hashCode();
    }

    public final String toString() {
        boolean z = this.f347147b;
        af afVar = this.f347148c;
        return "KeyboardState(isKeyboardVisible=" + z + ", keyboardConfiguration=" + afVar + ")";
    }
}

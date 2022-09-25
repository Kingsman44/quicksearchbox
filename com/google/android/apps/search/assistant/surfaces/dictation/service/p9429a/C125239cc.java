package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.cc */
/* compiled from: PG */
public final class C125239cc {

    /* renamed from: a */
    public final C125238cb f345486a;

    /* renamed from: b */
    public final Set f345487b;

    /* renamed from: c */
    public final Set f345488c;

    /* renamed from: d */
    public final Set f345489d;

    public C125239cc(C125238cb cbVar, Set set, Set set2, Set set3) {
        C69664n.m101061g(cbVar, "serviceStatus");
        C69664n.m101061g(set, "installedLanguageTags");
        C69664n.m101061g(set2, "pendingLanguageTags");
        C69664n.m101061g(set3, "availableLanguageTags");
        this.f345486a = cbVar;
        this.f345487b = set;
        this.f345488c = set2;
        this.f345489d = set3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125239cc)) {
            return false;
        }
        C125239cc ccVar = (C125239cc) obj;
        return this.f345486a == ccVar.f345486a && C69664n.m101066l(this.f345487b, ccVar.f345487b) && C69664n.m101066l(this.f345488c, ccVar.f345488c) && C69664n.m101066l(this.f345489d, ccVar.f345489d);
    }

    public final int hashCode() {
        return (((((this.f345486a.hashCode() * 31) + this.f345487b.hashCode()) * 31) + this.f345488c.hashCode()) * 31) + this.f345489d.hashCode();
    }

    public final String toString() {
        C125238cb cbVar = this.f345486a;
        Set set = this.f345487b;
        Set set2 = this.f345488c;
        Set set3 = this.f345489d;
        return "AiAiStatus(serviceStatus=" + cbVar + ", installedLanguageTags=" + set + ", pendingLanguageTags=" + set2 + ", availableLanguageTags=" + set3 + ")";
    }
}

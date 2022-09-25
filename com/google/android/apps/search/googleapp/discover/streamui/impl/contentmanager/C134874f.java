package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.f */
/* compiled from: PG */
public final class C134874f {

    /* renamed from: a */
    public final String f367177a;

    /* renamed from: b */
    public final int f367178b;

    public C134874f(String str, int i) {
        C69664n.m101061g(str, "contentId");
        this.f367177a = str;
        this.f367178b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134874f)) {
            return false;
        }
        C134874f fVar = (C134874f) obj;
        return C69664n.m101066l(this.f367177a, fVar.f367177a) && this.f367178b == fVar.f367178b;
    }

    public final int hashCode() {
        return (this.f367177a.hashCode() * 31) + this.f367178b;
    }

    public final String toString() {
        String str = this.f367177a;
        int i = this.f367178b;
        return "DebugContentIdAndIndex(contentId=" + str + ", index=" + i + ")";
    }
}

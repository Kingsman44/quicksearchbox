package com.google.android.apps.search.googleapp.discover.streamui.p10227c;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57155l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.c.d */
/* compiled from: PG */
public final class C134706d implements C47388b {

    /* renamed from: a */
    public final String f366824a;

    /* renamed from: b */
    public final C57155l f366825b;

    public C134706d(String str, C57155l lVar) {
        C69664n.m101061g(str, "contentId");
        C69664n.m101061g(lVar, "animationTimings");
        this.f366824a = str;
        this.f366825b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134706d)) {
            return false;
        }
        C134706d dVar = (C134706d) obj;
        return C69664n.m101066l(this.f366824a, dVar.f366824a) && C69664n.m101066l(this.f366825b, dVar.f366825b);
    }

    public final int hashCode() {
        return (this.f366824a.hashCode() * 31) + this.f366825b.hashCode();
    }

    public final String toString() {
        String str = this.f366824a;
        C57155l lVar = this.f366825b;
        return "FeedItemChangeEvent(contentId=" + str + ", animationTimings=" + lVar + ")";
    }
}

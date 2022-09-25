package com.google.android.apps.search.podcasts.p10565f;

import android.os.Bundle;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.aj */
/* compiled from: PG */
public final class C140289aj implements C47388b {

    /* renamed from: a */
    public final C140288ai f381139a;

    /* renamed from: b */
    public final Integer f381140b;

    /* renamed from: c */
    private final Bundle f381141c;

    public C140289aj(C140288ai aiVar, Integer num) {
        C69664n.m101061g(aiVar, "tab");
        this.f381139a = aiVar;
        this.f381140b = num;
        this.f381141c = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C140289aj(C140288ai aiVar, Integer num, int i) {
        this(aiVar, (i & 2) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140289aj)) {
            return false;
        }
        C140289aj ajVar = (C140289aj) obj;
        if (this.f381139a != ajVar.f381139a || !C69664n.m101066l(this.f381140b, ajVar.f381140b)) {
            return false;
        }
        Bundle bundle = ajVar.f381141c;
        return C69664n.m101066l((Object) null, (Object) null);
    }

    public final int hashCode() {
        int hashCode = this.f381139a.hashCode() * 31;
        Integer num = this.f381140b;
        return (hashCode + (num == null ? 0 : num.hashCode())) * 31;
    }

    public final String toString() {
        C140288ai aiVar = this.f381139a;
        Integer num = this.f381140b;
        return "NavigateUnderTabEvent(tab=" + aiVar + ", actionResId=" + num + ", args=null)";
    }
}

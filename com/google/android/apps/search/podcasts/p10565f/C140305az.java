package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.az */
/* compiled from: PG */
public final class C140305az implements C47388b {

    /* renamed from: a */
    public final C140646b f381158a;

    /* renamed from: b */
    public final C54397cw f381159b;

    public C140305az(C140646b bVar, C54397cw cwVar) {
        C69664n.m101061g(bVar, "showItem");
        C69664n.m101061g(cwVar, "reactionType");
        this.f381158a = bVar;
        this.f381159b = cwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140305az)) {
            return false;
        }
        C140305az azVar = (C140305az) obj;
        return C69664n.m101066l(this.f381158a, azVar.f381158a) && this.f381159b == azVar.f381159b;
    }

    public final int hashCode() {
        return (this.f381158a.hashCode() * 31) + this.f381159b.hashCode();
    }

    public final String toString() {
        C140646b bVar = this.f381158a;
        C54397cw cwVar = this.f381159b;
        return "UpdateShowReactionEvent(showItem=" + bVar + ", reactionType=" + cwVar + ")";
    }
}

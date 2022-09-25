package com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b;

import com.google.android.apps.search.googleapp.discover.p10249z.C135359p;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import java.util.UUID;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.b.g */
/* compiled from: PG */
public final class C134840g implements C47388b {

    /* renamed from: a */
    public final C135359p f367092a;

    /* renamed from: b */
    public final UUID f367093b;

    public C134840g(C135359p pVar, UUID uuid) {
        C69664n.m101061g(pVar, "token");
        C69664n.m101061g(uuid, "nextPageAppFlowUuid");
        this.f367092a = pVar;
        this.f367093b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134840g)) {
            return false;
        }
        C134840g gVar = (C134840g) obj;
        return C69664n.m101066l(this.f367092a, gVar.f367092a) && C69664n.m101066l(this.f367093b, gVar.f367093b);
    }

    public final int hashCode() {
        return (this.f367092a.hashCode() * 31) + this.f367093b.hashCode();
    }

    public final String toString() {
        C135359p pVar = this.f367092a;
        UUID uuid = this.f367093b;
        return "TokenViewedEvent(token=" + pVar + ", nextPageAppFlowUuid=" + uuid + ")";
    }
}

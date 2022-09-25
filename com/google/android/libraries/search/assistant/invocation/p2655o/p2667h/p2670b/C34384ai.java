package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import java.util.List;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.ai */
/* compiled from: PG */
final class C34384ai {

    /* renamed from: a */
    public final String f91408a;

    /* renamed from: b */
    public final C34119a f91409b;

    /* renamed from: c */
    public final Instant f91410c;

    /* renamed from: d */
    public final Instant f91411d;

    /* renamed from: e */
    public final List f91412e;

    public C34384ai(String str, C34119a aVar, Instant instant, Instant instant2, List list) {
        C69664n.m101061g(str, "id");
        C69664n.m101061g(aVar, "client");
        C69664n.m101061g(instant, "connected");
        C69664n.m101061g(list, "events");
        this.f91408a = str;
        this.f91409b = aVar;
        this.f91410c = instant;
        this.f91411d = instant2;
        this.f91412e = list;
    }

    /* renamed from: a */
    public static /* synthetic */ C34384ai m63067a(C34384ai aiVar, C34119a aVar, Instant instant, List list, int i) {
        Instant instant2 = null;
        String str = (i & 1) != 0 ? aiVar.f91408a : null;
        if ((i & 2) != 0) {
            aVar = aiVar.f91409b;
        }
        C34119a aVar2 = aVar;
        if ((i & 4) != 0) {
            instant2 = aiVar.f91410c;
        }
        Instant instant3 = instant2;
        if ((i & 8) != 0) {
            instant = aiVar.f91411d;
        }
        Instant instant4 = instant;
        if ((i & 16) != 0) {
            list = aiVar.f91412e;
        }
        List list2 = list;
        C69664n.m101061g(str, "id");
        C69664n.m101061g(aVar2, "client");
        C69664n.m101061g(instant3, "connected");
        C69664n.m101061g(list2, "events");
        return new C34384ai(str, aVar2, instant3, instant4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34384ai)) {
            return false;
        }
        C34384ai aiVar = (C34384ai) obj;
        return C69664n.m101066l(this.f91408a, aiVar.f91408a) && C69664n.m101066l(this.f91409b, aiVar.f91409b) && C69664n.m101066l(this.f91410c, aiVar.f91410c) && C69664n.m101066l(this.f91411d, aiVar.f91411d) && C69664n.m101066l(this.f91412e, aiVar.f91412e);
    }

    public final int hashCode() {
        int hashCode = ((((this.f91408a.hashCode() * 31) + this.f91409b.hashCode()) * 31) + this.f91410c.hashCode()) * 31;
        Instant instant = this.f91411d;
        return ((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f91412e.hashCode();
    }

    public final String toString() {
        String str = this.f91408a;
        C34119a aVar = this.f91409b;
        Instant instant = this.f91410c;
        Instant instant2 = this.f91411d;
        List list = this.f91412e;
        return "TriggeringConnectionDebugData(id=" + str + ", client=" + aVar + ", connected=" + instant + ", disconnected=" + instant2 + ", events=" + list + ")";
    }
}

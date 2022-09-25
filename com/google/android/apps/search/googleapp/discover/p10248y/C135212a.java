package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134270b;
import com.google.android.apps.search.googleapp.discover.p10249z.C135327ba;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.a */
/* compiled from: PG */
public final class C135212a implements C134270b {

    /* renamed from: a */
    public final String f368307a;

    /* renamed from: b */
    public final String f368308b;

    /* renamed from: c */
    public final C135327ba f368309c;

    public C135212a(String str, String str2, C135327ba baVar) {
        C69664n.m101061g(str, "anchorContentId");
        C69664n.m101061g(str2, "sessionId");
        C69664n.m101061g(baVar, "direction");
        this.f368307a = str;
        this.f368308b = str2;
        this.f368309c = baVar;
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        C134284d dVar = new C134284d();
        List list = dVar.f365788a;
        C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar, "sensitivity");
        ArrayList arrayList = new ArrayList();
        C134297q.m217880d("Anchor Content ID", this.f368307a, pVar, arrayList);
        C134297q.m217879c("Direction", this.f368309c, pVar, arrayList);
        C69540x.m100811r(list, arrayList);
        List list2 = dVar.f365788a;
        C134296p pVar2 = C134296p.PII;
        C69664n.m101061g(pVar2, "sensitivity");
        ArrayList arrayList2 = new ArrayList();
        C134297q.m217880d("SessionId", this.f368308b, pVar2, arrayList2);
        C69540x.m100811r(list2, arrayList2);
        return C134268c.m217846a("Anchored Range", dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135212a)) {
            return false;
        }
        C135212a aVar = (C135212a) obj;
        return C69664n.m101066l(this.f368307a, aVar.f368307a) && C69664n.m101066l(this.f368308b, aVar.f368308b) && this.f368309c == aVar.f368309c;
    }

    public final int hashCode() {
        return (((this.f368307a.hashCode() * 31) + this.f368308b.hashCode()) * 31) + this.f368309c.hashCode();
    }

    public final String toString() {
        String str = this.f368307a;
        String str2 = this.f368308b;
        C135327ba baVar = this.f368309c;
        return "AnchoredRange(anchorContentId=" + str + ", sessionId=" + str2 + ", direction=" + baVar + ")";
    }
}

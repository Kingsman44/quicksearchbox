package com.google.android.libraries.home.p1958f.p1959a;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18511b;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18512c;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.home.f.a.ad */
/* compiled from: PG */
final class C23778ad extends C69665o implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C23782ah f65157a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23778ad(C23782ah ahVar) {
        super(2);
        this.f65157a = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        Bundle bundle = (Bundle) obj2;
        C69664n.m101061g((String) obj, "<anonymous parameter 0>");
        C69664n.m101061g(bundle, "result");
        C18512c cVar = this.f65157a.f65164g;
        if (cVar == null) {
            C69664n.m101065k("accountLinkingFlow");
            cVar = null;
        }
        if (C18511b.m35979a(cVar.f52466a) == 3) {
            this.f65157a.mo29134t(0, C23787b.m44306a(bundle));
        } else {
            this.f65157a.mo29138x();
        }
        return C69788q.f186170a;
    }
}

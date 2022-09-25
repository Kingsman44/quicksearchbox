package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33676d;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33677e;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33696x;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.f */
/* compiled from: PG */
final class C33702f extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C69644aa f90031a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f90032b;

    /* renamed from: c */
    final /* synthetic */ C69648ae f90033c;

    /* renamed from: d */
    final /* synthetic */ C33706j f90034d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33702f(C69644aa aaVar, C69648ae aeVar, C69648ae aeVar2, C33706j jVar) {
        super(0);
        this.f90031a = aaVar;
        this.f90032b = aeVar;
        this.f90033c = aeVar2;
        this.f90034d = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        if (!this.f90031a.f186023a) {
            Object obj = this.f90032b.f186027a;
            if (obj == null || this.f90033c.f186027a == null) {
                C59052c cVar = (C59052c) C33706j.f90049a.mo56226d();
                cVar.mo56379ah(new C59094n(51264));
                cVar.mo56386p("Audio input streaming call completed, but no token or session is available.");
            } else {
                C59052c cVar2 = (C59052c) C33706j.f90049a.mo56226d();
                C61301b a = C34711b.m63445a((C34053bp) obj);
                cVar2.mo56379ah(new C59094n(51265));
                cVar2.mo56389s("Closing the abandoned audio session (%s).", a);
                C69648ae aeVar = this.f90032b;
                C69648ae aeVar2 = this.f90033c;
                C33676d dVar = (C33676d) C33677e.f89987c.createBuilder();
                C69664n.m101060f(dVar, "newBuilder()");
                C33696x a2 = C69664n.m101061g(dVar, "builder");
                Object obj2 = aeVar.f186027a;
                if (obj2 != null) {
                    a2.mo39030b((C34053bp) obj2);
                    Object obj3 = aeVar2.f186027a;
                    if (obj3 != null) {
                        a2.mo39031c((C37454cc) obj3);
                        C33677e a3 = a2.mo39029a();
                        C33706j jVar = this.f90034d;
                        C61301b bVar = null;
                        C60870cx e = C71663i.m104692e(jVar.f90050b, (C71424ay) null, new C33701e(jVar, a3, (C69577g) null), 3);
                        Object[] objArr = new Object[1];
                        C34053bp bpVar = (C34053bp) this.f90032b.f186027a;
                        if (bpVar != null) {
                            bVar = C34711b.m63445a(bpVar);
                        }
                        objArr[0] = bVar;
                        C46459k.m82829b(e, "Attempt to close the abandoned audio session (%s) has failed.", objArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        return C69788q.f186170a;
    }
}

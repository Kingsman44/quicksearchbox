package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.bf */
/* compiled from: PG */
final class C34562bf extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ String f91823a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34562bf(String str) {
        super(1);
        this.f91823a = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Duration duration = (Duration) obj;
        C69664n.m101061g(duration, "duration");
        C59052c cVar = (C59052c) C34563bg.f91824a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordFrontend");
        String format = String.format(this.f91823a, Arrays.copyOf(new Object[]{duration}, 1));
        C69664n.m101060f(format, "format(this, *args)");
        cVar.mo56379ah(new C59094n(51371));
        cVar.mo56389s("%s", format);
        return C69788q.f186170a;
    }
}

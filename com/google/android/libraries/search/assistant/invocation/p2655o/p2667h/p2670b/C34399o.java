package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import java.util.List;
import p3186j$.time.Instant;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.o */
/* compiled from: PG */
final class C34399o extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C34120b f91441a;

    /* renamed from: b */
    final /* synthetic */ C34354a f91442b;

    /* renamed from: c */
    final /* synthetic */ C34382ag f91443c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34399o(C34120b bVar, C34354a aVar, C34382ag agVar) {
        super(1);
        this.f91441a = bVar;
        this.f91442b = aVar;
        this.f91443c = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C34384ai aiVar = (C34384ai) obj;
        if (aiVar != null) {
            return C34384ai.m63067a(aiVar, this.f91441a.f90872a, (Instant) null, (List) null, 29);
        }
        C34354a aVar = this.f91442b;
        C34382ag agVar = this.f91443c;
        C34119a aVar2 = this.f91441a.f90872a;
        String c = aVar.mo39322c();
        Instant d = C34382ag.m63064d(agVar.f91398a);
        C69664n.m101060f(d, "clock.instant()");
        return new C34384ai(c, aVar2, d, (Instant) null, C69496am.f185918a);
    }
}

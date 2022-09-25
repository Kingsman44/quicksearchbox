package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12967c;
import com.google.android.libraries.search.assistant.notification.p2712c.C34868b;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ae */
/* compiled from: PG */
final class C11756ae extends C69665o implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C11760ai f37849a;

    /* renamed from: b */
    final /* synthetic */ boolean f37850b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11756ae(C11760ai aiVar, boolean z) {
        super(2);
        this.f37849a = aiVar;
        this.f37850b = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        aco aco = (aco) obj;
        C69664n.m101061g(aco, "notification");
        C69664n.m101061g((C58485gu) obj2, "<anonymous parameter 1>");
        C12989g gVar = C12989g.AUTO_PROJECTED;
        String str = this.f37849a.f37870n;
        if (str == null) {
            C69664n.m101065k("requestSource");
            str = null;
        }
        C51805du b = C34868b.m63633b(aco, this.f37850b);
        C12985c a = C12967c.m29204a(gVar, str, this.f37849a.f37862f.mo26871c());
        C12967c.m29207d(a, b);
        return a;
    }
}

package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import androidx.p104d.p105a.C2169h;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.C11742m;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11696b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11697ba;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11698bb;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11699bc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70148al;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.b */
/* compiled from: PG */
final class C11495b implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C11697ba f37358a;

    /* renamed from: b */
    final /* synthetic */ C70148al f37359b;

    /* renamed from: c */
    final /* synthetic */ C69626l f37360c;

    /* renamed from: d */
    final /* synthetic */ C11497d f37361d;

    public C11495b(C11697ba baVar, C70148al alVar, C69626l lVar, C11497d dVar) {
        this.f37358a = baVar;
        this.f37359b = alVar;
        this.f37360c = lVar;
        this.f37361d = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Object obj;
        C11696b bVar = this.f37358a.f37716c;
        if (bVar == null) {
            bVar = C11696b.f37707d;
        }
        MessagingInfo messagingInfo = bVar.f37710b ? (MessagingInfo) C61543g.m94275b(C11742m.f37809a, this.f37359b) : null;
        if (messagingInfo != null) {
            C11696b bVar2 = this.f37358a.f37716c;
            if (bVar2 == null) {
                bVar2 = C11696b.f37707d;
            }
            if ((bVar2.f37709a & 2) != 0) {
                C11497d dVar = this.f37361d;
                C58480gp e = C58485gu.m89837e();
                e.mo55395g(messagingInfo);
                dVar.f37367b = e;
                return C2169h.m6027a(new C11478a(this.f37361d, this.f37360c, this.f37358a));
            }
        }
        C69626l lVar = this.f37360c;
        C11698bb bbVar = (C11698bb) C11699bc.f37719c.createBuilder();
        C69664n.m101060f(bbVar, "newBuilder()");
        lVar.mo5761a(C69664n.m101061g(bbVar, "builder").mo20108a());
        if (messagingInfo == null || (obj = C69540x.m100944b(messagingInfo)) == null) {
            obj = C69496am.f185918a;
        }
        return C60856cj.m92900i(obj);
    }
}

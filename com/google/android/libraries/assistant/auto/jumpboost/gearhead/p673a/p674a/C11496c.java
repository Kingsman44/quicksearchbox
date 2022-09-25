package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import androidx.p104d.p105a.C2164c;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.C11742m;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11676ag;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11677ah;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11679aj;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11681al;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11696b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70148al;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.c */
/* compiled from: PG */
final class C11496c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C11497d f37362a;

    /* renamed from: b */
    final /* synthetic */ C69626l f37363b;

    /* renamed from: c */
    final /* synthetic */ C11696b f37364c;

    /* renamed from: d */
    final /* synthetic */ C70148al f37365d;

    public C11496c(C11497d dVar, C69626l lVar, C11696b bVar, C70148al alVar) {
        this.f37362a = dVar;
        this.f37363b = lVar;
        this.f37364c = bVar;
        this.f37365d = alVar;
    }

    public final void run() {
        C11497d dVar = this.f37362a;
        C58480gp gpVar = dVar.f37367b;
        C2164c cVar = dVar.f37368c;
        if (gpVar == null || cVar == null) {
            ((C58970a) C11497d.f37366a.mo56226d()).mo56386p("Active notification received unexpectedly");
            C69626l lVar = this.f37363b;
            C11676ag agVar = (C11676ag) C11677ah.f37668c.createBuilder();
            C69664n.m101060f(agVar, "newBuilder()");
            lVar.mo5761a(C69664n.m101061g(agVar, "builder").mo20106a());
            return;
        }
        MessagingInfo messagingInfo = this.f37364c.f37710b ? (MessagingInfo) C61543g.m94275b(C11742m.f37809a, this.f37365d) : null;
        if (messagingInfo != null) {
            gpVar.mo55395g(messagingInfo);
        }
        if (messagingInfo != null) {
            C11696b bVar = this.f37364c;
            if ((bVar.f37709a & 2) != 0) {
                this.f37362a.f37367b = gpVar;
                C69626l lVar2 = this.f37363b;
                C11676ag agVar2 = (C11676ag) C11677ah.f37668c.createBuilder();
                C69664n.m101060f(agVar2, "newBuilder()");
                C11679aj a = C69664n.m101061g(agVar2, "builder");
                C11681al alVar = bVar.f37711c;
                if (alVar == null) {
                    alVar = C11681al.f37673a;
                }
                C69664n.m101060f(alVar, "notification.notificationRequestToken");
                C69664n.m101061g(alVar, "value");
                C11676ag agVar3 = a.f37672a;
                agVar3.copyOnWrite();
                C11677ah ahVar = (C11677ah) agVar3.instance;
                alVar.getClass();
                ahVar.f37671b = alVar;
                ahVar.f37670a |= 1;
                lVar2.mo5761a(a.mo20106a());
                return;
            }
        }
        C69626l lVar3 = this.f37363b;
        C11676ag agVar4 = (C11676ag) C11677ah.f37668c.createBuilder();
        C69664n.m101060f(agVar4, "newBuilder()");
        lVar3.mo5761a(C69664n.m101061g(agVar4, "builder").mo20106a());
        cVar.mo5437b(gpVar.mo55394f());
        C11497d dVar2 = this.f37362a;
        dVar2.f37368c = null;
        dVar2.f37367b = null;
    }
}

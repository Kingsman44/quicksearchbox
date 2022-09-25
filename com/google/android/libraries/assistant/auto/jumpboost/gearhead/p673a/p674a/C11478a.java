package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11681al;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11696b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11697ba;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11698bb;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11699bc;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11701be;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.a */
/* compiled from: PG */
final class C11478a implements C2166e {

    /* renamed from: a */
    final /* synthetic */ C11497d f37281a;

    /* renamed from: b */
    final /* synthetic */ C69626l f37282b;

    /* renamed from: c */
    final /* synthetic */ C11697ba f37283c;

    public C11478a(C11497d dVar, C69626l lVar, C11697ba baVar) {
        this.f37281a = dVar;
        this.f37282b = lVar;
        this.f37283c = baVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        this.f37281a.f37368c = cVar;
        C69626l lVar = this.f37282b;
        C11697ba baVar = this.f37283c;
        C11698bb bbVar = (C11698bb) C11699bc.f37719c.createBuilder();
        C69664n.m101060f(bbVar, "newBuilder()");
        C11701be a = C69664n.m101061g(bbVar, "builder");
        C11696b bVar = baVar.f37716c;
        if (bVar == null) {
            bVar = C11696b.f37707d;
        }
        C11681al alVar = bVar.f37711c;
        if (alVar == null) {
            alVar = C11681al.f37673a;
        }
        C69664n.m101060f(alVar, "request.activeNotificati….notificationRequestToken");
        C69664n.m101061g(alVar, "value");
        C11698bb bbVar2 = a.f37723a;
        bbVar2.copyOnWrite();
        C11699bc bcVar = (C11699bc) bbVar2.instance;
        alVar.getClass();
        bcVar.f37722b = alVar;
        bcVar.f37721a |= 1;
        lVar.mo5761a(a.mo20108a());
        return "getNotifications";
    }
}

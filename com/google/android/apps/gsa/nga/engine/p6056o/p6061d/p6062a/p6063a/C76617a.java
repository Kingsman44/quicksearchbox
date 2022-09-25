package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6062a.p6063a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122381a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122408b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122451f;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122452g;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C76617a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122381a f211864a;

    public /* synthetic */ C76617a(C122381a aVar) {
        this.f211864a = aVar;
    }

    public final void accept(Object obj) {
        C122381a aVar = this.f211864a;
        C58528ij<C80080z> ijVar = (C58528ij) obj;
        C122451f fVar = (C122451f) C122452g.f339469c.createBuilder();
        fVar.copyOnWrite();
        C122452g gVar = (C122452g) fVar.instance;
        C62961ch chVar = gVar.f339471a;
        if (!chVar.mo58948c()) {
            gVar.f339471a = C62942bv.mutableCopy(chVar);
        }
        for (C80080z number : ijVar) {
            gVar.f339471a.mo58916g(number.getNumber());
        }
        aVar.copyOnWrite();
        C122452g gVar2 = (C122452g) fVar.build();
        C122408b bVar = C122408b.f339356h;
        gVar2.getClass();
        ((C122408b) aVar.instance).f339364g = gVar2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

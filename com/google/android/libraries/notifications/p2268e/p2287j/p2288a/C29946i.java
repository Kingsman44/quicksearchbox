package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import android.os.Bundle;
import androidx.core.app.C1806aw;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2265b.C29780d;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2287j.C29958i;
import com.google.android.libraries.notifications.p2268e.p2287j.C29959j;
import com.google.android.libraries.notifications.p2292g.C30003k;
import com.google.android.libraries.notifications.p2292g.C30004l;
import com.google.android.libraries.notifications.p2293h.C30014g;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.e.j.a.i */
/* compiled from: PG */
public final class C29946i implements C29958i {

    /* renamed from: a */
    private final C29959j f81091a;

    /* renamed from: b */
    private final C58833ax f81092b;

    /* renamed from: c */
    private final C29835a f81093c;

    public C29946i(C29959j jVar, C58833ax axVar, C29835a aVar) {
        this.f81091a = jVar;
        this.f81092b = axVar;
        this.f81093c = aVar;
    }

    /* renamed from: a */
    public final void mo35229a(C29780d dVar) {
        C30004l lVar;
        if (dVar.mo34968h().isEmpty()) {
            C30058b.m55791c("ReplyActionEventHandler", "No threads associated with this event.", new Object[0]);
            return;
        }
        Bundle b = C1806aw.m4968b(dVar.mo34961b());
        if (b == null) {
            C30058b.m55791c("ReplyActionEventHandler", "Reply action text could not be retrieved from intent.", new Object[0]);
            return;
        }
        CharSequence charSequence = b.getCharSequence("com.google.android.libraries.notifications.REPLY_TEXT_KEY");
        if (charSequence != null) {
            C29834a a = this.f81093c.mo35159a(C55489bz.ACTION_CLICK);
            a.mo35157v();
            a.mo35156u();
            a.mo35145j(dVar.mo34962c());
            a.mo35139d((C29827r) dVar.mo34968h().get(0));
            a.mo35136a();
            C30014g gVar = (C30014g) ((C58847bk) this.f81092b).f156646a;
            dVar.mo34962c();
            C29827r rVar = (C29827r) dVar.mo34968h().get(0);
            charSequence.toString();
            C29959j jVar = this.f81091a;
            C29820k c = dVar.mo34962c();
            C29827r rVar2 = (C29827r) dVar.mo34968h().get(0);
            C30007h d = C30007h.m55637d();
            String obj = charSequence.toString();
            C30004l d2 = dVar.mo34963d();
            if (d2.f81218a.size() == 0) {
                C30003k kVar = (C30003k) C30004l.f81216b.createBuilder();
                kVar.mo35307a(obj);
                lVar = (C30004l) kVar.build();
            } else {
                C62971cq cqVar = d2.f81218a;
                C30003k kVar2 = (C30003k) d2.toBuilder();
                kVar2.copyOnWrite();
                ((C30004l) kVar2.instance).f81218a = C62942bv.emptyProtobufList();
                kVar2.mo35307a(obj);
                kVar2.copyOnWrite();
                C30004l lVar2 = (C30004l) kVar2.instance;
                lVar2.mo35308a();
                C62947c.addAll((Iterable) cqVar, (List) lVar2.f81218a);
                lVar = (C30004l) kVar2.build();
            }
            jVar.mo35246a(c, rVar2, true, true, d, lVar, (C29839c) null);
        }
    }
}

package com.google.android.apps.search.googleapp.discover.channels;

import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57096k;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57097l;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57098m;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57099n;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.v */
/* compiled from: PG */
public final /* synthetic */ class C134190v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C134112ac f365534a;

    public /* synthetic */ C134190v(C134112ac acVar) {
        this.f365534a = acVar;
    }

    public final void accept(Object obj) {
        C134112ac acVar = this.f365534a;
        C134744f fVar = (C134744f) obj;
        fVar.mo111956j(C134720e.OVERFLOW_FEEDBACK_TAPPED);
        C57096k kVar = (C57096k) C57097l.f152427b.createBuilder();
        C57098m mVar = (C57098m) C57099n.f152430d.createBuilder();
        mVar.copyOnWrite();
        C57099n nVar = (C57099n) mVar.instance;
        nVar.f152432a |= 1;
        nVar.f152433b = "channel_id";
        C53842b bVar = acVar.f365323a.f365529b;
        if (bVar == null) {
            bVar = C53842b.f141313k;
        }
        String str = bVar.f141317c;
        mVar.copyOnWrite();
        C57099n nVar2 = (C57099n) mVar.instance;
        str.getClass();
        nVar2.f152432a |= 2;
        nVar2.f152434c = str;
        kVar.mo54444a(mVar);
        C57098m mVar2 = (C57098m) C57099n.f152430d.createBuilder();
        mVar2.copyOnWrite();
        C57099n nVar3 = (C57099n) mVar2.instance;
        nVar3.f152432a |= 1;
        nVar3.f152433b = "channel_feed_title";
        C53842b bVar2 = acVar.f365323a.f365529b;
        if (bVar2 == null) {
            bVar2 = C53842b.f141313k;
        }
        String str2 = bVar2.f141318d;
        mVar2.copyOnWrite();
        C57099n nVar4 = (C57099n) mVar2.instance;
        str2.getClass();
        nVar4.f152432a |= 2;
        nVar4.f152434c = str2;
        kVar.mo54444a(mVar2);
        C57098m mVar3 = (C57098m) C57099n.f152430d.createBuilder();
        mVar3.copyOnWrite();
        C57099n nVar5 = (C57099n) mVar3.instance;
        nVar5.f152432a |= 1;
        nVar5.f152433b = "channel_feed_entry_point";
        C57252bg bgVar = acVar.f365323a.f365530c;
        if (bgVar == null) {
            bgVar = C57252bg.f152831d;
        }
        String num = Integer.toString(bgVar.f152834b);
        mVar3.copyOnWrite();
        C57099n nVar6 = (C57099n) mVar3.instance;
        num.getClass();
        nVar6.f152432a |= 2;
        nVar6.f152434c = num;
        kVar.mo54444a(mVar3);
        fVar.mo111951e((C57097l) kVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

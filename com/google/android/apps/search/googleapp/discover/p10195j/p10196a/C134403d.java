package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import android.content.Intent;
import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.secondscreen.C134613d;
import com.google.android.apps.search.googleapp.discover.secondscreen.C134614e;
import com.google.android.apps.search.googleapp.discover.secondscreen.C134625p;
import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134767i;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134708f;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134710h;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134724d;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134757h;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134765p;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57059aa;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57060ab;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64215f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.d */
/* compiled from: PG */
final class C134403d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C134404e f366116a;

    /* renamed from: b */
    final /* synthetic */ C64215f f366117b;

    public C134403d(C134404e eVar, C64215f fVar) {
        this.f366116a = eVar;
        this.f366117b = fVar;
    }

    public final void run() {
        Intent intent;
        C53842b bVar;
        C53842b bVar2;
        C53842b bVar3;
        int a;
        C133939b bVar4 = this.f366116a.f366118a;
        C57060ab abVar = this.f366117b.f173630a;
        if (abVar == null) {
            abVar = C57060ab.f152318h;
        }
        C69664n.m101060f(abVar, "command.openChannelData");
        C69664n.m101061g(abVar, "data");
        if (!bVar4.f364813v || (a = C57059aa.m88256a(abVar.f152324e)) == 0 || a != 2) {
            int a2 = C57059aa.m88256a(abVar.f152324e);
            if (a2 != 0 && a2 == 2) {
                C69664n.m101061g(abVar, "openChannelData");
                int a3 = C57059aa.m88256a(abVar.f152324e);
                C134765p pVar = null;
                if (a3 != 0 && a3 == 2) {
                    if (abVar.f152321b == 3) {
                        bVar2 = (C53842b) abVar.f152322c;
                    } else {
                        bVar2 = C53842b.f141313k;
                    }
                    if (bVar2.f141321g != null) {
                        if (abVar.f152321b == 3) {
                            bVar3 = (C53842b) abVar.f152322c;
                        } else {
                            bVar3 = C53842b.f141313k;
                        }
                        C57315dp dpVar = bVar3.f141321g;
                        if (dpVar == null) {
                            dpVar = C57315dp.f152986c;
                        }
                        C69664n.m101060f(dpVar, "openChannelData.channel.tngToken");
                        pVar = new C134765p(dpVar, C134767i.m218603a(abVar));
                    }
                }
                if (pVar != null) {
                    bVar4.f364810s.mo111908d(C134720e.MORE_STORIES_TAPPED);
                    bVar4.f364798g.mo111913a(pVar);
                }
                C134625p pVar2 = bVar4.f364803l;
                C69664n.m101061g(abVar, "openChannelData");
                C134613d dVar = (C134613d) C134614e.f366576d.createBuilder();
                C69664n.m101060f(dVar, "newBuilder()");
                C69664n.m101061g(dVar, "builder");
                C69664n.m101061g(abVar, "value");
                dVar.copyOnWrite();
                C134614e eVar = (C134614e) dVar.instance;
                abVar.getClass();
                eVar.f366579b = abVar;
                eVar.f366578a |= 1;
                boolean a4 = C133933a.m217248a(pVar2.f366610a.getContext());
                dVar.copyOnWrite();
                C134614e eVar2 = (C134614e) dVar.instance;
                eVar2.f366578a = 2 | eVar2.f366578a;
                eVar2.f366580c = a4;
                C62942bv build = dVar.build();
                C69664n.m101060f(build, "_builder.build()");
                intent = pVar2.f366612c.mo51344a((C134614e) build);
                C45963aa.m82131a(intent, pVar2.f366611b);
                C69664n.m101060f(intent, "navigationIntents.create…tAccount(it, accountId) }");
            } else if (bVar4.f364808q) {
                bVar4.f364810s.mo111908d(C134720e.CHANNEL_CHIP_TAPPED);
                C134724d dVar2 = bVar4.f364798g;
                if (abVar.f152321b == 3) {
                    bVar = (C53842b) abVar.f152322c;
                } else {
                    bVar = C53842b.f141313k;
                }
                C57315dp dpVar2 = bVar.f141321g;
                if (dpVar2 == null) {
                    dpVar2 = C57315dp.f152986c;
                }
                C69664n.m101060f(dpVar2, "data.channel.tngToken");
                dVar2.mo111914b(new C134757h(dpVar2, C134699b.CHANNEL));
                intent = bVar4.f364807p.mo111575a(abVar);
                if (bVar4.f364794c.getActivity() == null) {
                    intent.setFlags(67108864);
                }
            } else {
                return;
            }
            if (bVar4.f364794c.getActivity() == null) {
                intent.putExtra("source", "and.gsa.tng.minus1");
            }
            C47709i.m84861a(bVar4.f364794c, intent);
            return;
        }
        C47393f.m84236g(C134710h.f366829a, bVar4.f364794c);
        C47393f.m84236g(C134708f.m218539a(), bVar4.f364794c);
    }
}

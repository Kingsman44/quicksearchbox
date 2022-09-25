package com.google.android.libraries.lens.view.gallery.p2111d;

import com.google.android.libraries.lens.view.p2096f.C25804g;
import com.google.android.libraries.lens.view.p2096f.C25805h;
import com.google.android.libraries.lens.view.p2096f.C25806i;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.p4552o.p4563i.C59964n;
import com.google.common.p4552o.p4563i.C59965o;
import com.google.common.p4552o.p4563i.C59968r;
import com.google.common.p4552o.p4563i.C59969s;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.ao */
/* compiled from: PG */
public final class C26353ao {

    /* renamed from: a */
    public final C37215b f71632a;

    /* renamed from: b */
    public boolean f71633b = false;

    /* renamed from: c */
    public boolean f71634c = false;

    /* renamed from: d */
    public boolean f71635d = false;

    /* renamed from: e */
    public int f71636e;

    /* renamed from: f */
    public int f71637f;

    /* renamed from: g */
    public int f71638g;

    /* renamed from: h */
    public int f71639h;

    /* renamed from: i */
    public int f71640i;

    /* renamed from: j */
    public int f71641j;

    /* renamed from: k */
    public int f71642k;

    /* renamed from: l */
    private final Executor f71643l;

    public C26353ao(C37215b bVar, Executor executor) {
        this.f71632a = bVar;
        this.f71643l = C25806i.m47612a(executor);
    }

    /* renamed from: a */
    public final void mo31546a() {
        if (!this.f71635d) {
            int i = this.f71636e - 1;
            this.f71636e = i;
            if (i == 0) {
                this.f71635d = true;
                C62722b bVar = this.f71633b ? C62722b.CANCELLED : C62722b.OK;
                C59964n nVar = (C59964n) C59965o.f162064h.createBuilder();
                int i2 = this.f71637f;
                nVar.copyOnWrite();
                C59965o oVar = (C59965o) nVar.instance;
                oVar.f162066a |= 1;
                oVar.f162067b = i2;
                int i3 = this.f71638g;
                nVar.copyOnWrite();
                C59965o oVar2 = (C59965o) nVar.instance;
                oVar2.f162066a |= 4;
                oVar2.f162069d = i3;
                int i4 = this.f71639h;
                nVar.copyOnWrite();
                C59965o oVar3 = (C59965o) nVar.instance;
                oVar3.f162066a |= 8;
                oVar3.f162070e = i4;
                int i5 = this.f71640i;
                nVar.copyOnWrite();
                C59965o oVar4 = (C59965o) nVar.instance;
                oVar4.f162066a |= 16;
                oVar4.f162071f = i5;
                int i6 = this.f71641j;
                nVar.copyOnWrite();
                C59965o oVar5 = (C59965o) nVar.instance;
                oVar5.f162066a |= 32;
                oVar5.f162072g = i6;
                int i7 = this.f71642k;
                nVar.copyOnWrite();
                C59965o oVar6 = (C59965o) nVar.instance;
                oVar6.f162066a |= 2;
                oVar6.f162068c = i7;
                C59965o oVar7 = (C59965o) nVar.build();
                C37215b bVar2 = this.f71632a;
                C37252a i8 = C37194a.f98433W.mo40815i(bVar);
                C62940bt btVar = C59898bg.f161867w;
                C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
                C59968r rVar = (C59968r) C59969s.f162075d.createBuilder();
                rVar.copyOnWrite();
                C59969s sVar = (C59969s) rVar.instance;
                oVar7.getClass();
                sVar.f162078b = oVar7;
                sVar.f162077a = 1 | sVar.f162077a;
                afVar.copyOnWrite();
                C59898bg bgVar = (C59898bg) afVar.instance;
                C59969s sVar2 = (C59969s) rVar.build();
                sVar2.getClass();
                bgVar.f161875g = sVar2;
                bgVar.f161869a |= 32;
                ((C37253b) i8).mo40792p(btVar, (C59898bg) afVar.build());
                bVar2.mo19974a(i8);
            }
        }
    }

    /* renamed from: b */
    public final void mo31547b() {
        mo31548c(new C26348aj(this));
    }

    /* renamed from: c */
    public final void mo31548c(Runnable runnable) {
        Executor executor = this.f71643l;
        ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(runnable))));
    }
}

package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.view.p2133i.p2134a.C26898c;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26899d;
import com.google.android.libraries.lens.view.p2133i.p2137d.C26918a;
import com.google.android.libraries.lens.view.p2133i.p2137d.C26919b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60845bz;
import com.google.lens.p4707j.C62575i;
import com.google.lens.p4707j.C62584r;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54032cm;
import com.google.p4017at.p4056g.p4057a.p4058a.C54034co;
import com.google.p4017at.p4056g.p4057a.p4058a.C54070v;
import com.google.p4017at.p4056g.p4057a.p4058a.C54071w;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.lens.view.main.bd */
/* compiled from: PG */
public final class C27314bd implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C62584r f74728a;

    /* renamed from: b */
    final /* synthetic */ C54032cm f74729b;

    /* renamed from: c */
    final /* synthetic */ C27327bq f74730c;

    public C27314bd(C27327bq bqVar, C62584r rVar, C54032cm cmVar) {
        this.f74730c = bqVar;
        this.f74728a = rVar;
        this.f74729b = cmVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C27327bq bqVar = this.f74730c;
        String str = this.f74728a.f168968a;
        C54071w wVar = this.f74729b.f141765b;
        if (wVar == null) {
            wVar = C54071w.f141876c;
        }
        bqVar.mo32873F(str, C26918a.m49869a(C54070v.m87141a(wVar.f141878a)), C26919b.m49870a(th));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar;
        C54034co coVar = (C54034co) obj;
        int i = coVar.f141771c;
        int i2 = 2;
        int i3 = 1;
        if (i != 0) {
            i2 = i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        Status.Code code = Status.Code.OK;
        int i4 = i2 - 2;
        if (i4 == 0) {
            axVar = C58836b.f156633a;
        } else if (i4 != 1) {
            axVar = C58833ax.m90834k(C26898c.INTERNAL);
        } else {
            axVar = C58833ax.m90834k(C26898c.TIMEOUT);
        }
        if (axVar.mo56113h()) {
            C27327bq bqVar = this.f74730c;
            String str = this.f74728a.f168968a;
            C54071w wVar = this.f74729b.f141765b;
            if (wVar == null) {
                wVar = C54071w.f141876c;
            }
            bqVar.mo32873F(str, C26918a.m49869a(C54070v.m87141a(wVar.f141878a)), (C26898c) axVar.mo56107c());
            return;
        }
        C27327bq bqVar2 = this.f74730c;
        if (bqVar2.f74765K) {
            C62584r rVar = coVar.f141769a;
            if (rVar == null) {
                rVar = C62584r.f168966g;
            }
            C37215b bVar = bqVar2.f74809n;
            C37252a i5 = C37194a.f98460aW.mo40815i(C62722b.OK);
            ((C37253b) i5).mo40795s("cloud_copy_target_device_guid", rVar.f168968a);
            bVar.mo19974a(i5);
            C26899d dVar = bqVar2.f74781aa;
            String str2 = rVar.f168968a;
            String str3 = rVar.f168969b;
            int b = C62575i.m94799b(coVar.f141770b);
            if (b != 0) {
                i3 = b;
            }
            dVar.mo32277h(str2, str3, i3);
        }
    }
}

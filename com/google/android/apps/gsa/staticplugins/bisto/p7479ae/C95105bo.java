package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.p10712d.C142413ek;
import com.google.android.p10712d.C142477gu;
import com.google.android.p10712d.C142478gv;
import com.google.android.p10712d.C142479gw;
import com.google.android.p10712d.C142480gx;
import com.google.android.p10712d.C142481gy;
import com.google.android.p10712d.C142482gz;
import com.google.android.p10712d.C142490hg;
import com.google.android.p10712d.C142491hh;
import com.google.android.p10712d.C142494hk;
import com.google.android.p10712d.C142495hl;
import com.google.android.p10712d.C142498ho;
import com.google.android.p10712d.C142499hp;
import com.google.android.p10712d.C142503ht;
import com.google.android.p10712d.C142504hu;
import com.google.android.p10712d.C142506hw;
import com.google.android.p10712d.C142508hy;
import com.google.android.p10712d.C142520l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bo */
/* compiled from: PG */
public final class C95105bo extends C95110c {

    /* renamed from: d */
    public static final C59071e f266068d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.bo");

    /* renamed from: e */
    private final String f266069e;

    /* renamed from: f */
    private final long f266070f;

    /* renamed from: g */
    private final String f266071g;

    /* renamed from: h */
    private final String f266072h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95105bo(android.content.Context r2, com.google.android.p10712d.C142470gn r3, com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95028a r4, java.lang.String r5, java.lang.String r6) {
        /*
            r1 = this;
            int r0 = r3.f386638d
            com.google.android.d.hq r0 = com.google.android.p10712d.C142500hq.m231092a(r0)
            if (r0 != 0) goto L_0x000a
            com.google.android.d.hq r0 = com.google.android.p10712d.C142500hq.UNRECOGNIZED
        L_0x000a:
            r1.<init>(r2, r0, r4)
            java.lang.String r2 = r3.f386637c
            r1.f266069e = r2
            long r2 = r3.f386639e
            r1.f266070f = r2
            r1.f266071g = r5
            r1.f266072h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95105bo.<init>(android.content.Context, com.google.android.d.gn, com.google.android.apps.gsa.staticplugins.bisto.ae.a, java.lang.String, java.lang.String):void");
    }

    /* renamed from: j */
    private final C142490hg m157123j() {
        C142490hg hgVar = (C142490hg) C142491hh.f386677d.createBuilder();
        String str = this.f266069e;
        hgVar.copyOnWrite();
        str.getClass();
        ((C142491hh) hgVar.instance).f386681c = str;
        return hgVar;
    }

    /* renamed from: k */
    private final void m157124k(C142491hh hhVar, boolean z) {
        Messenger messenger = this.f266102c;
        if (messenger == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        Message obtain = Message.obtain((Handler) null, 0, 0, 0);
        if (z) {
            obtain.replyTo = new Messenger(new C95104bn(this));
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("bisto_sdk_payload", hhVar.toByteArray());
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (RemoteException e) {
            C59104x c = f266068d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SdkConnnection");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(18065)).mo56386p("could not send message");
        }
    }

    /* renamed from: a */
    public final void mo89028a() {
        C142481gy gyVar = (C142481gy) C142482gz.f386657c.createBuilder();
        String str = this.f266071g;
        gyVar.copyOnWrite();
        str.getClass();
        ((C142482gz) gyVar.instance).f386659a = str;
        String str2 = this.f266072h;
        gyVar.copyOnWrite();
        str2.getClass();
        ((C142482gz) gyVar.instance).f386660b = str2;
        C142482gz gzVar = (C142482gz) gyVar.build();
        C142490hg j = m157123j();
        C142477gu guVar = (C142477gu) C142478gv.f386650c.createBuilder();
        guVar.copyOnWrite();
        gzVar.getClass();
        ((C142478gv) guVar.instance).f386652a = gzVar;
        long j2 = this.f266070f;
        guVar.copyOnWrite();
        ((C142478gv) guVar.instance).f386653b = j2;
        j.copyOnWrite();
        C142491hh hhVar = (C142491hh) j.instance;
        C142478gv gvVar = (C142478gv) guVar.build();
        C142491hh hhVar2 = C142491hh.f386677d;
        gvVar.getClass();
        hhVar.f386680b = gvVar;
        hhVar.f386679a = 2;
        m157124k((C142491hh) j.build(), true);
    }

    /* renamed from: b */
    public final void mo89029b(C142520l lVar) {
        C58976aa aaVar = C58975e.f156826a;
        C142490hg j = m157123j();
        C142498ho hoVar = (C142498ho) C142499hp.f386692b.createBuilder();
        hoVar.copyOnWrite();
        lVar.getClass();
        ((C142499hp) hoVar.instance).f386694a = lVar;
        j.copyOnWrite();
        C142491hh hhVar = (C142491hh) j.instance;
        C142499hp hpVar = (C142499hp) hoVar.build();
        C142491hh hhVar2 = C142491hh.f386677d;
        hpVar.getClass();
        hhVar.f386680b = hpVar;
        hhVar.f386679a = 6;
        m157124k((C142491hh) j.build(), false);
    }

    /* renamed from: c */
    public final void mo89030c(C124548d dVar) {
        C58976aa aaVar = C58975e.f156826a;
        C142494hk hkVar = (C142494hk) C142495hl.f386686c.createBuilder();
        boolean z = dVar.mo106526x().f386150c;
        hkVar.copyOnWrite();
        ((C142495hl) hkVar.instance).f386689b = z;
        C142413ek ekVar = C142413ek.UNKNOWN;
        switch (dVar.mo106461B().ordinal()) {
            case 0:
            case 1:
            case 2:
            case 8:
                hkVar.copyOnWrite();
                ((C142495hl) hkVar.instance).f386688a = 0;
                break;
            case 3:
                hkVar.copyOnWrite();
                ((C142495hl) hkVar.instance).f386688a = 4;
                break;
            case 4:
                hkVar.copyOnWrite();
                ((C142495hl) hkVar.instance).f386688a = 1;
                break;
            case 5:
                hkVar.copyOnWrite();
                ((C142495hl) hkVar.instance).f386688a = 2;
                break;
            case 6:
            case 7:
                hkVar.copyOnWrite();
                ((C142495hl) hkVar.instance).f386688a = 3;
                break;
        }
        C142495hl hlVar = (C142495hl) hkVar.build();
        C142490hg j = m157123j();
        j.copyOnWrite();
        C142491hh hhVar = (C142491hh) j.instance;
        C142491hh hhVar2 = C142491hh.f386677d;
        hlVar.getClass();
        hhVar.f386680b = hlVar;
        hhVar.f386679a = 8;
        m157124k((C142491hh) j.build(), false);
    }

    /* renamed from: d */
    public final void mo89031d(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        C142490hg j = m157123j();
        C142503ht htVar = (C142503ht) C142504hu.f386707b.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        htVar.copyOnWrite();
        ((C142504hu) htVar.instance).f386709a = A;
        C142504hu huVar = (C142504hu) htVar.build();
        j.copyOnWrite();
        C142491hh hhVar = (C142491hh) j.instance;
        C142491hh hhVar2 = C142491hh.f386677d;
        huVar.getClass();
        hhVar.f386680b = huVar;
        hhVar.f386679a = 4;
        m157124k((C142491hh) j.build(), false);
    }

    /* renamed from: e */
    public final void mo89032e() {
        C58976aa aaVar = C58975e.f156826a;
        C142490hg j = m157123j();
        C142508hy hyVar = C142508hy.f386712a;
        j.copyOnWrite();
        C142491hh hhVar = (C142491hh) j.instance;
        C142491hh hhVar2 = C142491hh.f386677d;
        hyVar.getClass();
        hhVar.f386680b = hyVar;
        hhVar.f386679a = 3;
        m157124k((C142491hh) j.build(), false);
    }

    /* renamed from: f */
    public final void mo89033f() {
        C58976aa aaVar = C58975e.f156826a;
        C142490hg j = m157123j();
        C142506hw hwVar = C142506hw.f386710a;
        j.copyOnWrite();
        C142491hh hhVar = (C142491hh) j.instance;
        C142491hh hhVar2 = C142491hh.f386677d;
        hwVar.getClass();
        hhVar.f386680b = hwVar;
        hhVar.f386679a = 5;
        m157124k((C142491hh) j.build(), false);
    }

    /* renamed from: i */
    public final boolean mo89034i(Intent intent, int i) {
        C142479gw gwVar = (C142479gw) C142480gx.f386654b.createBuilder();
        gwVar.copyOnWrite();
        ((C142480gx) gwVar.instance).f386656a = i - 2;
        C142480gx gxVar = (C142480gx) gwVar.build();
        C142490hg j = m157123j();
        j.copyOnWrite();
        C142491hh hhVar = (C142491hh) j.instance;
        C142491hh hhVar2 = C142491hh.f386677d;
        gxVar.getClass();
        hhVar.f386680b = gxVar;
        hhVar.f386679a = 7;
        m157124k((C142491hh) j.build(), false);
        return super.mo89034i(intent, i);
    }
}

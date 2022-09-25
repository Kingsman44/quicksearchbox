package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9398d.C124599a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124649bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.r */
/* compiled from: PG */
final class C95948r implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f268653a;

    /* renamed from: b */
    final /* synthetic */ boolean f268654b;

    /* renamed from: c */
    final /* synthetic */ boolean f268655c;

    /* renamed from: d */
    final /* synthetic */ Intent f268656d;

    /* renamed from: e */
    final /* synthetic */ C95950t f268657e;

    public C95948r(C95950t tVar, boolean z, boolean z2, boolean z3, Intent intent) {
        this.f268657e = tVar;
        this.f268653a = z;
        this.f268654b = z2;
        this.f268655c = z3;
        this.f268656d = intent;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95950t.f268659c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15776)).mo56386p("DCI failure during ACTION_OTA Action (Manual OTA not started)");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list;
        C124599a aVar = (C124599a) obj;
        try {
            boolean z = this.f268653a;
            boolean z2 = this.f268654b;
            boolean z3 = this.f268655c;
            Intent intent = this.f268656d;
            HashSet hashSet = new HashSet();
            String e = C58837ba.m90856e(intent.getStringExtra("device_indexes"));
            String e2 = C58837ba.m90856e(intent.getStringExtra("dfu_url"));
            String e3 = C58837ba.m90856e(intent.getStringExtra("build_label"));
            if (e2 != null) {
                if (e3 != null) {
                    if (e != null) {
                        list = C58869cf.m90936b(new C58903m(',')).mo56155i(e);
                    } else {
                        list = C58597ky.m90212c("0");
                    }
                    List i = C58869cf.m90936b(new C58903m(',')).mo56155i(e2);
                    List i2 = C58869cf.m90936b(new C58903m(',')).mo56155i(e3);
                    if (list.size() == i.size()) {
                        if (list.size() == i2.size()) {
                            for (int i3 = 0; i3 < list.size(); i3++) {
                                C124649bo boVar = (C124649bo) C124650bp.f343890p.createBuilder();
                                int parseInt = Integer.parseInt((String) list.get(i3));
                                boVar.copyOnWrite();
                                C124650bp bpVar = (C124650bp) boVar.instance;
                                bpVar.f343892a |= 1;
                                bpVar.f343893b = parseInt;
                                String str = (String) i.get(i3);
                                boVar.copyOnWrite();
                                C124650bp bpVar2 = (C124650bp) boVar.instance;
                                str.getClass();
                                bpVar2.f343892a |= 8;
                                bpVar2.f343896e = str;
                                String str2 = (String) i2.get(i3);
                                boVar.copyOnWrite();
                                C124650bp bpVar3 = (C124650bp) boVar.instance;
                                str2.getClass();
                                bpVar3.f343892a |= 2;
                                bpVar3.f343894c = str2;
                                C124627at atVar = C124627at.FIRMWARE_OTA_TYPE;
                                boVar.copyOnWrite();
                                C124650bp bpVar4 = (C124650bp) boVar.instance;
                                bpVar4.f343906o = atVar.f343811f;
                                bpVar4.f343892a |= 4096;
                                hashSet.add((C124650bp) boVar.build());
                            }
                            aVar.mo90220h(z, z2, z3, hashSet);
                        }
                    }
                    C59104x c = C95950t.f268659c.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
                    ((C59052c) ((C59052c) c).mo56372aa(15784)).mo56386p("Incorrect OTA params");
                    aVar.mo90220h(z, z2, z3, hashSet);
                }
            }
            C59104x c2 = C95950t.f268659c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
            ((C59052c) ((C59052c) c2).mo56372aa(15783)).mo56386p("OTA params not specified");
            aVar.mo90220h(z, z2, z3, hashSet);
        } catch (IllegalArgumentException e4) {
            C59104x c3 = C95950t.f268659c.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e4)).mo56372aa(15777)).mo56389s("No session available for %s", this.f268657e.f268660d.mo89270k());
        } catch (IllegalStateException e5) {
            C59104x c4 = C95950t.f268659c.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
            ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e5)).mo56372aa(15778)).mo56386p("Wrong state to apply OTA");
        }
    }
}

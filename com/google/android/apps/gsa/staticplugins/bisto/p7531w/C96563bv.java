package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124628au;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124649bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.p10712d.C142468gl;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bv */
/* compiled from: PG */
public final /* synthetic */ class C96563bv implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96565bx f270154a;

    /* renamed from: b */
    public final /* synthetic */ Collection f270155b;

    /* renamed from: c */
    public final /* synthetic */ boolean f270156c;

    /* renamed from: d */
    public final /* synthetic */ boolean f270157d;

    /* renamed from: e */
    public final /* synthetic */ boolean f270158e;

    public /* synthetic */ C96563bv(C96565bx bxVar, Collection collection, boolean z, boolean z2, boolean z3) {
        this.f270154a = bxVar;
        this.f270155b = collection;
        this.f270156c = z;
        this.f270157d = z2;
        this.f270158e = z3;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96565bx bxVar = this.f270154a;
        Collection<C124650bp> collection = this.f270155b;
        boolean z = this.f270156c;
        boolean z2 = this.f270157d;
        boolean z3 = this.f270158e;
        Map map = (Map) obj;
        if (C96565bx.m159974s(map)) {
            C59104x c = C96565bx.f270160a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OtaStateIdle");
            ((C59052c) ((C59052c) c).mo56372aa(16658)).mo56386p("Device in busy state. Not running OTA");
            return;
        }
        HashSet hashSet = new HashSet();
        for (C124650bp bpVar : collection) {
            C142468gl glVar = (C142468gl) map.get(Integer.valueOf(bpVar.f343893b));
            if (glVar == null) {
                C59104x c2 = C96565bx.f270160a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "OtaStateIdle");
                ((C59052c) ((C59052c) c2).mo56372aa(16657)).mo56387q("Not found state for device %d", bpVar.f343893b);
                hashSet.add(bpVar);
            } else if ((glVar.f386622a & 16) != 0) {
                C124649bo boVar = (C124649bo) bpVar.toBuilder();
                String str = glVar.f386627f;
                boVar.copyOnWrite();
                C124650bp bpVar2 = (C124650bp) boVar.instance;
                str.getClass();
                bpVar2.f343892a |= 4;
                bpVar2.f343895d = str;
                hashSet.add((C124650bp) boVar.build());
            } else {
                C59104x c3 = C96565bx.f270160a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "OtaStateIdle");
                ((C59052c) ((C59052c) c3).mo56372aa(16656)).mo56387q("No current build label for device %d", bpVar.f343893b);
                hashSet.add(bpVar);
            }
        }
        C124628au auVar = (C124628au) C124629av.f343812r.createBuilder();
        auVar.mo106567b(hashSet);
        int e = bxVar.f270134l.mo106505e();
        auVar.copyOnWrite();
        C124629av avVar = (C124629av) auVar.instance;
        avVar.f343814a |= 32768;
        avVar.f343829p = e;
        C124625ar arVar = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        auVar.copyOnWrite();
        C124629av avVar2 = (C124629av) auVar.instance;
        avVar2.f343821h = arVar.f343803i;
        avVar2.f343814a |= 256;
        int i = 3;
        int i2 = true != z ? 3 : 2;
        auVar.copyOnWrite();
        C124629av avVar3 = (C124629av) auVar.instance;
        avVar3.f343817d = i2 - 1;
        avVar3.f343814a |= 4;
        int i3 = true != z2 ? 3 : 2;
        auVar.copyOnWrite();
        C124629av avVar4 = (C124629av) auVar.instance;
        avVar4.f343818e = i3 - 1;
        avVar4.f343814a |= 8;
        if (true == z3) {
            i = 2;
        }
        auVar.copyOnWrite();
        C124629av avVar5 = (C124629av) auVar.instance;
        avVar5.f343824k = i - 1;
        avVar5.f343814a |= 2048;
        auVar.copyOnWrite();
        C124629av avVar6 = (C124629av) auVar.instance;
        avVar6.f343814a |= 16384;
        avVar6.f343827n = true;
        String g = C58837ba.m90858g(bxVar.f270161b.mo83457c());
        auVar.copyOnWrite();
        C124629av avVar7 = (C124629av) auVar.instance;
        avVar7.f343814a |= 65536;
        avVar7.f343830q = g;
        bxVar.mo90243r(auVar);
        bxVar.mo90240o(C124625ar.DOWNLOAD_SCHEDULED);
    }
}

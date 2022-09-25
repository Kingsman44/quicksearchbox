package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import com.google.android.apps.search.googleapp.p10357n.p10358a.C136694b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54122u;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.f */
/* compiled from: PG */
public final /* synthetic */ class C135763f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C135763f f369790a = new C135763f();

    private /* synthetic */ C135763f() {
    }

    public final Object apply(Object obj) {
        C54120s sVar = (C54120s) obj;
        C135775r rVar = (C135775r) C135776s.f369838d.createBuilder();
        rVar.copyOnWrite();
        C135776s sVar2 = (C135776s) rVar.instance;
        sVar.getClass();
        sVar2.f369842c = sVar;
        sVar2.f369840a |= 2;
        boolean z = false;
        if ((sVar.f142010a & 2) != 0) {
            C54098av avVar = sVar.f142012c;
            if (avVar == null) {
                avVar = C54098av.f141935j;
            }
            C54122u uVar = avVar.f141942f;
            if (uVar == null) {
                uVar = C54122u.f142014h;
            }
            if ((uVar.f142016a & 32) != 0) {
                C54122u uVar2 = avVar.f141942f;
                if (uVar2 == null) {
                    uVar2 = C54122u.f142014h;
                }
                C60214n nVar = uVar2.f142022g;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                if ((nVar.f162916a & 2048) == 0) {
                    ((C59052c) ((C59052c) C136694b.f372087a.mo56226d()).mo56372aa(40680)).mo56386p("Received response without logging info - ve event id.");
                } else if ((avVar.f141937a & 8) != 0) {
                    C57784p pVar = avVar.f141943g;
                    if (pVar == null) {
                        pVar = C57784p.f154382f;
                    }
                    if ((pVar.f154384a & 1) != 0) {
                        z = true;
                    }
                } else {
                    ((C59052c) ((C59052c) C136694b.f372087a.mo56226d()).mo56372aa(40679)).mo56386p("Received response without peek text.");
                }
            } else {
                ((C59052c) ((C59052c) C136694b.f372087a.mo56226d()).mo56372aa(40681)).mo56386p("Received response without logging info - graft cgi.");
            }
        } else {
            ((C59052c) ((C59052c) C136694b.f372087a.mo56226d()).mo56372aa(40682)).mo56386p("Received response without pivots.");
        }
        rVar.copyOnWrite();
        C135776s sVar3 = (C135776s) rVar.instance;
        sVar3.f369840a |= 1;
        sVar3.f369841b = z;
        return (C135776s) rVar.build();
    }
}

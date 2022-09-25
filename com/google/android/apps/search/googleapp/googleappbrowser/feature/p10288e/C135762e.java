package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import android.net.Uri;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10263d.C135569b;
import com.google.android.apps.search.googleapp.p10357n.p10358a.C136693a;
import com.google.android.apps.search.googleapp.p10357n.p10358a.C136697e;
import com.google.android.apps.search.googleapp.p10357n.p10358a.C136702j;
import com.google.android.apps.search.googleapp.p10357n.p10358a.C136706n;
import com.google.android.apps.search.googleapp.p10357n.p10358a.C136707o;
import com.google.android.apps.search.googleapp.p10357n.p10358a.C136709q;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54112k;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54118q;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.net.URLDecoder;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.e */
/* compiled from: PG */
public final /* synthetic */ class C135762e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C135766i f369788a;

    /* renamed from: b */
    public final /* synthetic */ String f369789b;

    public /* synthetic */ C135762e(C135766i iVar, String str) {
        this.f369788a = iVar;
        this.f369789b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C43323b bVar;
        Object obj;
        C135461g gVar;
        int i;
        C135766i iVar = this.f369788a;
        String str = this.f369789b;
        try {
            URLDecoder.decode(str, "UTF-8");
        } catch (Exception unused) {
        }
        C136697e eVar = iVar.f369798b;
        C136706n nVar = (C136706n) C136707o.f372118f.createBuilder();
        nVar.copyOnWrite();
        C136707o oVar = (C136707o) nVar.instance;
        str.getClass();
        int i2 = 1;
        oVar.f372120a |= 1;
        oVar.f372121b = str;
        nVar.copyOnWrite();
        C136707o oVar2 = (C136707o) nVar.instance;
        oVar2.f372120a |= 2;
        oVar2.f372122c = 0;
        C43377v vVar = iVar.f369801e;
        if ((vVar.mo46468a().f113328a & 64) != 0) {
            C43367l lVar = vVar.mo46468a().f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            bVar = lVar.f113300f;
            if (bVar == null) {
                bVar = C43323b.f113174a;
            }
        } else {
            bVar = vVar.mo46468a().f113336i;
            if (bVar == null) {
                bVar = C43323b.f113174a;
            }
        }
        C62940bt r1 = C62942bv.checkIsLite(C135569b.f369276g);
        bVar.mo58887l(r1);
        Object l = bVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C135569b bVar2 = (C135569b) obj;
        if (bVar2 == null || (bVar2.f369278a & 1) == 0) {
            gVar = C135461g.GAB;
        } else {
            gVar = C135461g.m219650a(bVar2.f369279b);
            if (gVar == null) {
                gVar = C135461g.UNKNOWN;
            }
        }
        switch (gVar.ordinal()) {
            case 1:
            case 3:
                i = 2;
                break;
            case 2:
            case 4:
                i = 3;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 4;
                break;
            default:
                i = 1;
                break;
        }
        nVar.copyOnWrite();
        C136707o oVar3 = (C136707o) nVar.instance;
        oVar3.f372123d = i - 1;
        oVar3.f372120a |= 4;
        nVar.copyOnWrite();
        C136707o oVar4 = (C136707o) nVar.instance;
        oVar4.f372124e = 2;
        oVar4.f372120a |= 8;
        C136707o oVar5 = (C136707o) nVar.build();
        C136693a aVar = eVar.f372095b;
        Uri parse = Uri.parse(oVar5.f372121b);
        long j = oVar5.f372122c;
        int a = C54112k.m87142a(oVar5.f372123d);
        int i3 = a == 0 ? 1 : a;
        int a2 = C136709q.m222285a(oVar5.f372124e);
        C54118q a3 = aVar.mo113330a(parse, j, i3, a2 == 0 ? 1 : a2);
        C136702j jVar = eVar.f372094a;
        int a4 = C136709q.m222285a(oVar5.f372124e);
        if (a4 != 0) {
            i2 = a4;
        }
        return jVar.mo113333a(a3, i2);
    }
}

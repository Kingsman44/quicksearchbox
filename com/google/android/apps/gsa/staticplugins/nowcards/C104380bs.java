package com.google.android.apps.gsa.staticplugins.nowcards;

import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.C91704s;
import com.google.android.apps.gsa.sidekick.shared.overlay.NowStreamConfig;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.staticplugins.nowcards.applauncher.C104274e;
import com.google.android.apps.gsa.staticplugins.nowcards.applauncher.C104275f;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104298a;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104325b;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104336bk;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104388aa;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104389ab;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104413x;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104414y;
import com.google.android.apps.gsa.staticplugins.nowcards.p8101b.C104288a;
import com.google.android.apps.gsa.staticplugins.nowcards.p8101b.C104289b;
import com.google.android.apps.gsa.staticplugins.nowcards.p8116f.C104879e;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104912aj;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7713he;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7834lr;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.bs */
/* compiled from: PG */
public final class C104380bs extends C91704s {

    /* renamed from: a */
    private final Map f290438a;

    /* renamed from: b */
    private final Map f290439b;

    /* renamed from: c */
    private final C104388aa f290440c;

    /* renamed from: d */
    private final C104413x f290441d;

    /* renamed from: e */
    private final C104274e f290442e;

    /* renamed from: f */
    private final C104288a f290443f;

    /* renamed from: g */
    private final C104912aj f290444g;

    public C104380bs(Map map, Map map2, C104388aa aaVar, C104413x xVar, C104274e eVar, C104288a aVar, C104912aj ajVar) {
        this.f290438a = map;
        this.f290439b = map2;
        this.f290440c = aaVar;
        this.f290441d = xVar;
        this.f290442e = eVar;
        this.f290443f = aVar;
        this.f290444g = ajVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo85585d(C7718hj hjVar, List list, Object obj) {
        int a = C7713he.m22812a(hjVar.f26985z);
        if (a != 0 && a == 4) {
            return null;
        }
        Map map = this.f290439b;
        C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
        if (a2 == null) {
            a2 = C7746ik.UNKNOWN;
        }
        C104325b bVar = (C104325b) map.get(a2);
        C7718hj[] hjVarArr = (C7718hj[]) list.toArray(new C7718hj[0]);
        if (bVar != null) {
            return bVar.mo94009a(hjVar, hjVarArr, (CardRenderingContext) obj);
        }
        C7746ik a3 = C7746ik.m22834a(hjVar.f26966g);
        if (a3 == null) {
            a3 = C7746ik.UNKNOWN;
        }
        int ordinal = a3.ordinal();
        if (ordinal == 17) {
            C104388aa aaVar = this.f290440c;
            return new C104389ab(hjVar, hjVarArr, (CardRenderingContext) obj, aaVar.f290473c, aaVar.f290472b, this, aaVar.f290471a);
        } else if (ordinal == 18) {
            C104274e eVar = this.f290442e;
            return new C104275f(hjVar, hjVarArr, (CardRenderingContext) obj, eVar.f290046b, eVar.f290047c, this, eVar.f290045a, eVar.f290048d);
        } else if (ordinal != 33) {
            return null;
        } else {
            C104413x xVar = this.f290441d;
            C105048f fVar = xVar.f290546c;
            C89291a aVar = xVar.f290545b;
            C104308aj ajVar = xVar.f290544a;
            C104879e eVar2 = xVar.f290547d;
            return new C104414y(hjVar, hjVarArr, (CardRenderingContext) obj, fVar, aVar, this, ajVar);
        }
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo86202h(C7718hj hjVar, List list) {
        int a;
        if (hjVar != null && (a = C7713he.m22812a(hjVar.f26985z)) != 0 && a == 4) {
            return null;
        }
        C104288a aVar = this.f290443f;
        C89291a aVar2 = aVar.f290067a;
        C104336bk bkVar = aVar.f290069c;
        CardRenderingContext cardRenderingContext = (CardRenderingContext) aVar.f290070d.mo6453a();
        C91643a aVar3 = aVar.f290071e;
        NowStreamConfig nowStreamConfig = aVar.f290068b;
        return new C104289b(hjVar, list, aVar2);
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo85588l(C7718hj hjVar, Object obj) {
        int a = C7713he.m22812a(hjVar.f26985z);
        if (a != 0 && a == 4) {
            return null;
        }
        Map map = this.f290438a;
        C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
        if (a2 == null) {
            a2 = C7746ik.UNKNOWN;
        }
        C104298a aVar = (C104298a) map.get(a2);
        C58976aa aaVar = C58975e.f156826a;
        if (aVar != null) {
            return aVar.mo94021a(hjVar, (CardRenderingContext) obj);
        }
        int a3 = C7713he.m22812a(hjVar.f26985z);
        if (a3 == 0 || a3 != 2 || (hjVar.f26955a & 1048576) == 0) {
            return null;
        }
        C104912aj ajVar = this.f290444g;
        C7834lr lrVar = hjVar.f26984y;
        if (lrVar == null) {
            lrVar = C7834lr.f27467c;
        }
        return ajVar.mo94392a(hjVar, lrVar, (CardRenderingContext) obj);
    }
}

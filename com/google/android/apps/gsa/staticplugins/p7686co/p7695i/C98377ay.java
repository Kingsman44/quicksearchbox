package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import android.accounts.Account;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.p375ai.p378b.C7643ep;
import com.google.p375ai.p378b.C7644eq;
import com.google.p375ai.p378b.C7661fg;
import com.google.p375ai.p378b.C7704gw;
import com.google.p375ai.p378b.C7719hk;
import com.google.p375ai.p378b.C7720hl;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7796kg;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C8098vl;
import com.google.p4283bv.p4354e.C57051b;
import com.google.p4283bv.p4354e.C57347c;
import com.google.p4283bv.p4354e.C57520e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.ay */
/* compiled from: PG */
public final /* synthetic */ class C98377ay implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98378az f274600a;

    /* renamed from: b */
    public final /* synthetic */ C7704gw[] f274601b;

    public /* synthetic */ C98377ay(C98378az azVar, C7704gw[] gwVarArr) {
        this.f274600a = azVar;
        this.f274601b = gwVarArr;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        String str;
        C98378az azVar = this.f274600a;
        C7704gw[] gwVarArr = this.f274601b;
        C98380ba baVar = azVar.f274605d;
        C98414ch chVar = azVar.f274604c;
        Account account = azVar.f274603b;
        C7719hk hkVar = (C7719hk) C7720hl.f26986e.createBuilder();
        C7643ep epVar = (C7643ep) C7644eq.f26534e.createBuilder();
        if (account != null) {
            C7661fg j = baVar.f274639q.mo79149j(account.name);
            if (j == null || (j.f26587a & 8) == 0) {
                str = BuildConfig.FLAVOR;
            } else {
                C8098vl vlVar = j.f26591e;
                if (vlVar == null) {
                    vlVar = C8098vl.f28472k;
                }
                str = vlVar.f28476c;
            }
            epVar.copyOnWrite();
            C7644eq eqVar = (C7644eq) epVar.instance;
            eqVar.f26536a |= 1;
            eqVar.f26537b = (String) ((C58847bk) C58833ax.m90834k(str)).f156646a;
        }
        List asList = Arrays.asList(gwVarArr);
        C58976aa aaVar = C58975e.f156826a;
        C62971cq cqVar = chVar.f274747n;
        epVar.mo16932a(asList);
        epVar.mo16932a(chVar.f274747n);
        if (baVar.f274636n != null) {
            long millis = TimeUnit.HOURS.toMillis(baVar.f274637o.mo79743a(C90010bp.f246935aD));
            long millis2 = TimeUnit.HOURS.toMillis(baVar.f274637o.mo79743a(C90010bp.f246936aE));
            baVar.f274636n.mo86247e(millis);
            baVar.f274636n.mo86248f(millis2);
            C58833ax a = baVar.f274636n.mo86243a();
            if (a.mo56113h()) {
                C7704gw gwVar = (C7704gw) a.mo56107c();
                epVar.copyOnWrite();
                C7644eq eqVar2 = (C7644eq) epVar.instance;
                gwVar.getClass();
                eqVar2.mo16933a();
                eqVar2.f26539d.add(gwVar);
            }
        }
        C7644eq eqVar3 = (C7644eq) epVar.build();
        hkVar.copyOnWrite();
        C7720hl hlVar = (C7720hl) hkVar.instance;
        eqVar3.getClass();
        hlVar.f26989b = eqVar3;
        hlVar.f26988a |= 1;
        C7796kg kgVar = (C7796kg) C7799kj.f27263h.createBuilder();
        C98413cg cgVar = C98413cg.REQUEST_TYPE_INVALID;
        C98413cg a2 = C98413cg.m162977a(chVar.f274736b);
        if (a2 == null) {
            a2 = C98413cg.REQUEST_TYPE_INVALID;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 2) {
            C62963cj<C7746ik> cjVar = new C62963cj(chVar.f274741g, C98414ch.f274732h);
            kgVar.copyOnWrite();
            C7799kj kjVar = (C7799kj) kgVar.instance;
            C62961ch chVar2 = kjVar.f27267c;
            if (!chVar2.mo58948c()) {
                kjVar.f27267c = C62942bv.mutableCopy(chVar2);
            }
            for (C7746ik ikVar : cjVar) {
                kjVar.f27267c.mo58916g(ikVar.f27108J);
            }
        } else if (ordinal == 3) {
            C62971cq cqVar2 = chVar.f274742i;
            kgVar.copyOnWrite();
            C7799kj kjVar2 = (C7799kj) kgVar.instance;
            C62971cq cqVar3 = kjVar2.f27268e;
            if (!cqVar3.mo58948c()) {
                kjVar2.f27268e = C62942bv.mutableCopy(cqVar3);
            }
            C62947c.addAll((Iterable) cqVar2, (List) kjVar2.f27268e);
        }
        if ((chVar.f274735a & 64) != 0) {
            kgVar.copyOnWrite();
            C7799kj kjVar3 = (C7799kj) kgVar.instance;
            kjVar3.f27265a |= 256;
            kjVar3.f27270g = true;
        }
        hkVar.mo16939a((C7799kj) kgVar.build());
        if (baVar.f274637o.mo79746e(C90010bp.f246952aU) && !baVar.f274646x.mo78056A()) {
            C57347c cVar = (C57347c) C57520e.f153640d.createBuilder();
            C58833ax axVar = (C58833ax) C60856cj.m92910s(baVar.f274632j.mo85615e());
            if (axVar.mo56113h()) {
                cVar.copyOnWrite();
                C57520e eVar = (C57520e) cVar.instance;
                eVar.f153643b = 2;
                eVar.f153642a |= 1;
                C57051b bVar = (C57051b) axVar.mo56107c();
                cVar.copyOnWrite();
                C57520e eVar2 = (C57520e) cVar.instance;
                bVar.getClass();
                C62971cq cqVar4 = eVar2.f153644c;
                if (!cqVar4.mo58948c()) {
                    eVar2.f153644c = C62942bv.mutableCopy(cqVar4);
                }
                eVar2.f153644c.add(bVar);
            }
            hkVar.copyOnWrite();
            C7720hl hlVar2 = (C7720hl) hkVar.instance;
            C57520e eVar3 = (C57520e) cVar.build();
            eVar3.getClass();
            hlVar2.f26991d = eVar3;
            hlVar2.f26988a |= 2;
        }
        return (C7720hl) hkVar.build();
    }
}

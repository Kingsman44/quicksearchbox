package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Messenger;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C86581s;
import com.google.android.apps.gsa.search.core.C87172t;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.sidekick.main.notifications.C91486aa;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91375e;
import com.google.android.apps.gsa.sidekick.main.p7225q.C91598e;
import com.google.android.apps.gsa.sidekick.shared.util.C91966aq;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.p489g.p493c.C9131d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7661fg;
import com.google.p375ai.p378b.C7722hn;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C7906oi;
import com.google.p375ai.p378b.C7963ql;
import com.google.p375ai.p378b.C8098vl;
import com.google.p375ai.p378b.C8164xx;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.ah */
/* compiled from: PG */
public final /* synthetic */ class C98360ah implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98380ba f274571a;

    /* renamed from: b */
    public final /* synthetic */ C7963ql f274572b;

    /* renamed from: c */
    public final /* synthetic */ Iterable f274573c;

    /* renamed from: d */
    public final /* synthetic */ C91375e f274574d;

    /* renamed from: e */
    public final /* synthetic */ C98414ch f274575e;

    /* renamed from: f */
    public final /* synthetic */ C98427cu f274576f;

    public /* synthetic */ C98360ah(C98380ba baVar, C7963ql qlVar, Iterable iterable, C91375e eVar, C98414ch chVar, C98427cu cuVar) {
        this.f274571a = baVar;
        this.f274572b = qlVar;
        this.f274573c = iterable;
        this.f274574d = eVar;
        this.f274575e = chVar;
        this.f274576f = cuVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98380ba baVar = this.f274571a;
        C7963ql qlVar = this.f274572b;
        Iterable iterable = this.f274573c;
        C91375e eVar = this.f274574d;
        C98414ch chVar = this.f274575e;
        C98427cu cuVar = this.f274576f;
        C118826c cVar = (C118826c) obj;
        baVar.f274633k.mo85626l();
        C7722hn hnVar = qlVar.f27972b;
        if (hnVar == null) {
            hnVar = C7722hn.f26993i;
        }
        if ((qlVar.f27971a & 8) != 0) {
            C91598e eVar2 = baVar.f274645w;
            C8164xx xxVar = qlVar.f27975e;
            if (xxVar == null) {
                xxVar = C8164xx.f28688f;
            }
            eVar2.mo85964f(xxVar, iterable);
        } else {
            C91598e eVar3 = baVar.f274645w;
            C90748e.m148224b();
            eVar3.mo85964f(C8164xx.f28688f, iterable);
        }
        Iterator it = hnVar.f26998d.iterator();
        while (true) {
            C58485gu guVar = null;
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            C7906oi oiVar = (C7906oi) it.next();
            if ((oiVar.f27783a & 1) != 0) {
                C7805kp kpVar = oiVar.f27784b;
                if (kpVar == null) {
                    kpVar = C7805kp.f27284h;
                }
                guVar = C58485gu.m89846n(C91966aq.m150921a(kpVar));
            } else if (oiVar.f27785c.size() == 2) {
                guVar = C58485gu.m89847o(C91966aq.m150921a((C7805kp) oiVar.f27785c.get(0)), C91966aq.m150921a((C7805kp) oiVar.f27785c.get(1)));
            }
            if (guVar != null) {
                C87172t tVar = baVar.f274635m;
                Context context = baVar.f274628f;
                StringBuilder sb = new StringBuilder();
                C58801sm G = guVar.listIterator(0);
                while (G.hasNext()) {
                    Location location = (Location) G.next();
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(location.getLatitude());
                    sb.append(",");
                    sb.append(location.getLongitude());
                    context = context;
                    z = false;
                }
                Context context2 = context;
                String sb2 = sb.toString();
                tVar.f235572a = PendingIntent.getActivity(context2.getApplicationContext(), 0, new Intent(), 67108864);
                Intent intent = new Intent("com.google.android.apps.maps.PREFETCH");
                intent.setPackage("com.google.android.apps.maps");
                intent.setFlags(268435456);
                intent.putExtra("messenger", new Messenger(new C86581s(tVar)));
                intent.putExtra("sender", tVar.f235572a);
                intent.putExtra("locations", sb2);
                Context context3 = context2;
                try {
                    if (context3.startService(intent) == null) {
                        context3.sendBroadcast(intent);
                    }
                } catch (SecurityException unused) {
                }
            }
        }
        if (hnVar.f26996b.size() != 0) {
            baVar.f274643u.mo28212l("offlineCacher", new C98371as(baVar, hnVar));
        }
        if (hnVar.f26996b.size() > 0 && ((C7744ii) hnVar.f26996b.get(0)).f27060e.size() > 0) {
            C58976aa aaVar = C58975e.f156826a;
            ((C7744ii) hnVar.f26996b.get(0)).f27060e.size();
            C91486aa aaVar2 = baVar.f274638p;
            byte[] bArr = eVar.f254948c;
            C62971cq cqVar = ((C7744ii) hnVar.f26996b.get(0)).f27060e;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
            ajVar.mo58885m(C9131d.f31427d, cqVar);
            if (bArr != null) {
                ajVar.mo58885m(C9131d.f31426c, C63088z.m96139A(bArr));
            }
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            C118476ak akVar = (C118476ak) ajVar.build();
            akVar.getClass();
            agVar.f328827g = akVar;
            agVar.f328821a |= 32;
            aaVar2.f255195a.mo103754e(C118522by.NOW_NOTIFICATION_SCHEDULE_REFRESH, (C118472ag) afVar.build());
        }
        C7661fg fgVar = hnVar.f26997c;
        if (fgVar == null) {
            fgVar = C7661fg.f26585n;
        }
        if ((fgVar.f26587a & 8) != 0) {
            C58976aa aaVar3 = C58975e.f156826a;
            C7661fg fgVar2 = hnVar.f26997c;
            if (fgVar2 == null) {
                fgVar2 = C7661fg.f26585n;
            }
            C8098vl vlVar = fgVar2.f26591e;
            if (vlVar == null) {
                vlVar = C8098vl.f28472k;
            }
            String str = vlVar.f28476c;
            C91486aa aaVar4 = baVar.f274638p;
            byte[] bArr2 = eVar.f254948c;
            C118471af afVar2 = (C118471af) C118472ag.f328819i.createBuilder();
            C118475aj ajVar2 = (C118475aj) C118476ak.f328838a.createBuilder();
            if (bArr2 != null) {
                ajVar2.mo58885m(C9131d.f31426c, C63088z.m96139A(bArr2));
            }
            afVar2.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar2.instance;
            C118476ak akVar2 = (C118476ak) ajVar2.build();
            akVar2.getClass();
            agVar2.f328827g = akVar2;
            agVar2.f328821a |= 32;
            aaVar4.f255195a.mo103754e(C118522by.NOW_NOTIFICATION_SCHEDULE_REFRESH_ALL, (C118472ag) afVar2.build());
        }
        C98413cg a = C98413cg.m162977a(chVar.f274736b);
        if (a == null) {
            a = C98413cg.REQUEST_TYPE_INVALID;
        }
        if (a == C98413cg.REQUEST_TYPE_FULL) {
            baVar.f274630h.mo85663b(true);
        }
        cuVar.f274794b.mo104025g(TimeUnit.NANOSECONDS.toMillis(cuVar.f274794b.mo104019a() - cuVar.f274793a));
        return C91375e.m149412d(qlVar, (byte[]) null);
    }
}

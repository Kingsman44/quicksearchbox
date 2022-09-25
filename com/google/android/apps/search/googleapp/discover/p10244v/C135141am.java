package com.google.android.apps.search.googleapp.discover.p10244v;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f;
import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n;
import com.google.android.apps.search.googleapp.discover.p10214s.C134548am;
import com.google.android.apps.search.googleapp.discover.p10214s.C134553ar;
import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.android.apps.search.googleapp.discover.p10214s.C134556au;
import com.google.android.apps.search.googleapp.discover.p10214s.C134557av;
import com.google.android.apps.search.googleapp.discover.p10214s.C134558aw;
import com.google.android.apps.search.googleapp.discover.p10214s.C134603u;
import com.google.android.apps.search.googleapp.discover.p10214s.C134605w;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.storage.p3315b.C42838ax;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57051b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.C69685i;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5472e.C69598b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.am */
/* compiled from: PG */
final class C135141am implements C135202v {

    /* renamed from: a */
    final /* synthetic */ List f368078a;

    /* renamed from: b */
    final /* synthetic */ C135157bb f368079b;

    /* renamed from: c */
    final /* synthetic */ String f368080c;

    /* renamed from: d */
    final /* synthetic */ C60218r f368081d;

    /* renamed from: e */
    final /* synthetic */ C57051b f368082e;

    /* renamed from: f */
    final /* synthetic */ C134548am f368083f;

    /* renamed from: g */
    final /* synthetic */ C134555at f368084g;

    /* renamed from: h */
    final /* synthetic */ C134500f f368085h;

    public C135141am(List list, C135157bb bbVar, String str, C60218r rVar, C57051b bVar, C134548am amVar, C134555at atVar, C134500f fVar) {
        this.f368078a = list;
        this.f368079b = bbVar;
        this.f368080c = str;
        this.f368081d = rVar;
        this.f368082e = bVar;
        this.f368083f = amVar;
        this.f368084g = atVar;
        this.f368085h = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo112131a(C135205y yVar) {
        Throwable th;
        C135205y yVar2 = yVar;
        C135177bv a = C135176bu.m219240a(this.f368078a);
        List list = a.f368200a;
        List list2 = a.f368201b;
        C135157bb bbVar = this.f368079b;
        String str = this.f368080c;
        C60218r rVar = this.f368081d;
        C57051b bVar = this.f368082e;
        C134548am amVar = this.f368083f;
        C134555at atVar = this.f368084g;
        C134553ar arVar = (C134553ar) C134556au.f366435f.createBuilder();
        C69664n.m101060f(arVar, "newBuilder()");
        C134603u a2 = C69664n.m101061g(arVar, "builder");
        Instant a3 = bbVar.f368138d.mo57444a();
        C69664n.m101060f(a3, "timeSource.now()");
        C63042fg b = C62949a.m95467b(a3);
        C134557av avVar = (C134557av) C134558aw.f366443h.createBuilder();
        C69664n.m101060f(avVar, "newBuilder()");
        C134605w a4 = C69664n.m101061g(avVar, "builder");
        C69664n.m101061g(b, "value");
        C134557av avVar2 = a4.f366558a;
        avVar2.copyOnWrite();
        C134558aw awVar = (C134558aw) avVar2.instance;
        b.getClass();
        awVar.f366446b = b;
        List list3 = list2;
        String str2 = "newBuilder()";
        awVar.f366445a |= 1;
        a4.mo111837b(b);
        C69664n.m101061g(str, "value");
        C134557av avVar3 = a4.f366558a;
        avVar3.copyOnWrite();
        C134558aw awVar2 = (C134558aw) avVar3.instance;
        str.getClass();
        awVar2.f366445a |= 4;
        awVar2.f366448d = str;
        C69664n.m101061g(rVar, "value");
        C134557av avVar4 = a4.f366558a;
        avVar4.copyOnWrite();
        C134558aw awVar3 = (C134558aw) avVar4.instance;
        rVar.getClass();
        awVar3.f366450f = rVar;
        awVar3.f366445a |= 8;
        C69664n.m101061g(bVar, "value");
        C134557av avVar5 = a4.f366558a;
        avVar5.copyOnWrite();
        C134558aw awVar4 = (C134558aw) avVar5.instance;
        bVar.getClass();
        awVar4.f366451g = bVar;
        awVar4.f366445a |= 16;
        a4.mo111839d();
        a4.mo111838c(list);
        a2.mo111835e(a4.mo111836a());
        a2.mo111834d(atVar);
        a2.mo111833c(b);
        C69664n.m101061g(amVar, "value");
        C134553ar arVar2 = a2.f366557a;
        arVar2.copyOnWrite();
        C134556au auVar = (C134556au) arVar2.instance;
        amVar.getClass();
        auVar.f366441e = amVar;
        auVar.f366437a |= 32;
        C134556au a5 = a2.mo111831a();
        C134755f fVar = this.f368079b.f368141g;
        C69664n.m101061g(a5, "sessionState");
        Instant a6 = yVar2.f368297b.f368050b.mo57444a();
        C69664n.m101060f(a6, "timeSource.now()");
        ArrayList arrayList = new ArrayList();
        C42847bf bfVar = yVar2.f368296a;
        C42840az azVar = new C42840az();
        azVar.f112130a.append("select * from feed_table");
        Cursor d = bfVar.mo45932d(azVar.mo45920a());
        while (d.moveToNext()) {
            try {
                String string = d.getString(0);
                C69664n.m101060f(string, "cursor.getString(0)");
                C134556au auVar2 = (C134556au) C62942bv.parseFrom((C62942bv) C134556au.f366435f, d.getBlob(1), C62921ba.m95368a());
                C69664n.m101060f(auVar2, "parseFrom(\n             …istry()\n                )");
                arrayList.add(new C135201u(string, auVar2));
            } catch (Throwable th2) {
                Throwable th3 = th2;
                C69598b.m101013a(d, th);
                throw th3;
            }
        }
        C69598b.m101013a(d, (Throwable) null);
        List S = C69540x.m100837S(arrayList, new C135203w());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : S) {
            if (C69664n.m101066l(((C135201u) next).f368293a, C134752c.f366921a.f366925c)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        C69685i iVar = new C69685i(arrayList2, arrayList3);
        List list4 = (List) iVar.f186052a;
        List list5 = (List) iVar.f186053b;
        C135130ab abVar = yVar2.f368297b;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (Object next2 : list5) {
            C134558aw awVar5 = ((C135201u) next2).f368294b.f366438b;
            if (awVar5 == null) {
                awVar5 = C134558aw.f366443h;
            }
            C63042fg fgVar = awVar5.f366446b;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            C69664n.m101060f(fgVar, "it.sessionState.structure.creationTime");
            if (Duration.between(C62949a.m95469d(fgVar), a6).compareTo(abVar.f368054f) > 0) {
                arrayList4.add(next2);
            } else {
                arrayList5.add(next2);
            }
        }
        C69685i iVar2 = new C69685i(arrayList4, arrayList5);
        List list6 = (List) iVar2.f186052a;
        List list7 = (List) iVar2.f186053b;
        int size = (((int) yVar2.f368297b.f368051c) - list4.size()) - 1;
        List T = list7.size() > size ? C69540x.m100838T(list7, list7.size() - size) : C69496am.f185918a;
        List M = C69540x.m100831M(list6, T);
        List K = C69540x.m100829K(list5, M);
        if (!M.isEmpty()) {
            C42838ax axVar = new C42838ax("feed_table");
            axVar.f112125a.append("feed_id IN (?");
            axVar.f112126b.add(((C135201u) M.get(0)).f368293a);
            int i = 1;
            for (int size2 = M.size(); i < size2; size2 = size2) {
                axVar.f112125a.append(",?");
                axVar.f112126b.add(((C135201u) M.get(i)).f368293a);
                i++;
            }
            axVar.f112125a.append(")");
            yVar2.f368296a.mo45929a(axVar.mo45919a());
        }
        ((C19569f) yVar2.f368297b.f368055g.f103056a.f103109r.mo6453a()).mo24824b((double) (list4.size() + K.size() + 1), new Object[0]);
        yVar2.f368297b.f368055g.mo41726o(list6.size(), 1);
        yVar2.f368297b.f368055g.mo41726o(T.size(), 2);
        C135130ab abVar2 = yVar2.f368297b;
        C135134af afVar = (C135134af) C135135ag.f368062g.createBuilder();
        C69664n.m101060f(afVar, str2);
        C69664n.m101061g(afVar, "builder");
        Instant a7 = abVar2.f368050b.mo57444a();
        C69664n.m101060f(a7, "timeSource.now()");
        C63042fg b2 = C62949a.m95467b(a7);
        C69664n.m101061g(b2, "value");
        afVar.copyOnWrite();
        C135135ag agVar = (C135135ag) afVar.instance;
        b2.getClass();
        agVar.f368065b = b2;
        agVar.f368064a |= 1;
        String str3 = fVar.f366924b;
        afVar.copyOnWrite();
        C135135ag agVar2 = (C135135ag) afVar.instance;
        agVar2.f368064a = 2 | agVar2.f368064a;
        agVar2.f368066c = str3;
        int size3 = list6.size();
        afVar.copyOnWrite();
        C135135ag agVar3 = (C135135ag) afVar.instance;
        agVar3.f368064a |= 4;
        agVar3.f368067d = size3;
        int size4 = T.size();
        afVar.copyOnWrite();
        C135135ag agVar4 = (C135135ag) afVar.instance;
        agVar4.f368064a |= 8;
        agVar4.f368068e = size4;
        int size5 = list4.size();
        int size6 = K.size();
        afVar.copyOnWrite();
        C135135ag agVar5 = (C135135ag) afVar.instance;
        agVar5.f368064a |= 16;
        agVar5.f368069f = size5 + size6 + 1;
        C62942bv build = afVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C135130ab abVar3 = yVar2.f368297b;
        C46459k.m82829b(abVar3.f368053e.mo46039a(new C135204x((C135135ag) build), abVar3.f368052d), "Failed to write FeedStoreDebuggableData", new Object[0]);
        ContentValues contentValues = new ContentValues();
        contentValues.put("feed_id", fVar.f366925c);
        contentValues.put("session_state", a5.toByteArray());
        yVar2.f368296a.mo45931c("feed_table", contentValues, 5);
        yVar2.mo112166d(this.f368079b.f368141g, C135138aj.m219167a(list3));
        C134500f fVar2 = this.f368085h;
        if (fVar2 != null) {
            C62971cq<C134508n> cqVar = fVar2.f366286a;
            C69664n.m101060f(cqVar, "onDeviceContent.watchCollectionList");
            ArrayList arrayList6 = new ArrayList(C69540x.m100804k(cqVar, 10));
            for (C134508n nVar : cqVar) {
                arrayList6.add(new C69685i("Session::OnDeviceMediaContent::".concat(String.valueOf(nVar.f366305c)), nVar.toByteString()));
            }
            yVar2.mo112166d(this.f368079b.f368141g, C69505av.m100874p(arrayList6));
        }
        return C69788q.f186170a;
    }
}

package com.google.android.apps.search.podcasts.episode.p10563a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.podcasts.episode.C140237p;
import com.google.android.apps.search.podcasts.episode.C140239r;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.p395al.p398b.p399a.p400a.C8415a;
import com.google.p395al.p398b.p399a.p400a.C8419c;
import com.google.p395al.p417d.p418a.C8534an;
import com.google.p395al.p417d.p418a.C8535ao;
import com.google.p4017at.p4060h.p4061a.p4062a.C54075a;
import com.google.p4017at.p4060h.p4061a.p4062a.C54128b;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54157i;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54158j;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54159k;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54160l;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54161m;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54162n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p5462h.C69778n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.episode.a.a */
/* compiled from: PG */
public final class C140214a {
    /* renamed from: a */
    public static final C69778n m227909a(C140237p pVar) {
        String str;
        String str2;
        String str3;
        C140239r rVar;
        C140239r rVar2;
        C140641b bVar;
        C140641b bVar2;
        int i = pVar.f380982a;
        if (i == 2) {
            C140646b bVar3 = ((C140641b) pVar.f380983b).f381974a;
            if (bVar3 == null) {
                bVar3 = C140646b.f381993r;
            }
            str3 = bVar3.f381995a;
            C69664n.m101060f(str3, "episodeArgs.episodeItem.show.feedUrl");
            if (pVar.f380982a == 2) {
                bVar = (C140641b) pVar.f380983b;
            } else {
                bVar = C140641b.f381972o;
            }
            C140646b bVar4 = bVar.f381974a;
            if (bVar4 == null) {
                bVar4 = C140646b.f381993r;
            }
            str2 = bVar4.f382001g;
            C69664n.m101060f(str2, "episodeArgs.episodeItem.show.clusterId");
            if (pVar.f380982a == 2) {
                bVar2 = (C140641b) pVar.f380983b;
            } else {
                bVar2 = C140641b.f381972o;
            }
            str = bVar2.f381975b;
            C69664n.m101060f(str, "episodeArgs.episodeItem.guid");
        } else {
            if (i == 1) {
                rVar = (C140239r) pVar.f380983b;
            } else {
                rVar = C140239r.f380984c;
            }
            str3 = rVar.f380987b;
            C69664n.m101060f(str3, "episodeArgs.deeplink.feedUrl");
            if (pVar.f380982a == 1) {
                rVar2 = (C140239r) pVar.f380983b;
            } else {
                rVar2 = C140239r.f380984c;
            }
            str = rVar2.f380986a;
            C69664n.m101060f(str, "episodeArgs.deeplink.guid");
            str2 = BuildConfig.FLAVOR;
        }
        return new C69778n(str3, str2, str);
    }

    /* renamed from: b */
    public static final C54162n m227910b(C140237p pVar, int i) {
        C69778n a = m227909a(pVar);
        Object obj = a.f186153a;
        Object obj2 = a.f186154b;
        Object obj3 = a.f186155c;
        C54161m mVar = (C54161m) C54162n.f142138d.createBuilder();
        C54075a aVar = (C54075a) C54128b.f142037d.createBuilder();
        C8534an anVar = (C8534an) C8535ao.f29615c.createBuilder();
        C8415a aVar2 = (C8415a) C8419c.f29284d.createBuilder();
        String valueOf = String.valueOf(i);
        aVar2.copyOnWrite();
        C8419c cVar = (C8419c) aVar2.instance;
        valueOf.getClass();
        cVar.f29286a |= 2;
        cVar.f29288c = valueOf;
        aVar2.copyOnWrite();
        C8419c cVar2 = (C8419c) aVar2.instance;
        cVar2.f29287b = 6;
        cVar2.f29286a |= 1;
        anVar.copyOnWrite();
        C8535ao aoVar = (C8535ao) anVar.instance;
        C8419c cVar3 = (C8419c) aVar2.build();
        cVar3.getClass();
        aoVar.f29618b = cVar3;
        aoVar.f29617a |= 1;
        aVar.copyOnWrite();
        C54128b bVar = (C54128b) aVar.instance;
        C8535ao aoVar2 = (C8535ao) anVar.build();
        aoVar2.getClass();
        bVar.f142040b = aoVar2;
        bVar.f142039a |= 1;
        mVar.copyOnWrite();
        C54162n nVar = (C54162n) mVar.instance;
        C54128b bVar2 = (C54128b) aVar.build();
        bVar2.getClass();
        nVar.f142141b = bVar2;
        nVar.f142140a |= 1;
        C54157i iVar = (C54157i) C54160l.f142135b.createBuilder();
        C54158j jVar = (C54158j) C54159k.f142128f.createBuilder();
        jVar.copyOnWrite();
        C54159k kVar = (C54159k) jVar.instance;
        obj.getClass();
        kVar.f142130a |= 1;
        kVar.f142131b = (String) obj;
        jVar.copyOnWrite();
        C54159k kVar2 = (C54159k) jVar.instance;
        obj2.getClass();
        kVar2.f142130a |= 2;
        kVar2.f142132c = (String) obj2;
        jVar.copyOnWrite();
        C54159k kVar3 = (C54159k) jVar.instance;
        obj3.getClass();
        kVar3.f142130a |= 4;
        kVar3.f142133d = (String) obj3;
        jVar.copyOnWrite();
        C54159k kVar4 = (C54159k) jVar.instance;
        kVar4.f142130a |= 16;
        kVar4.f142134e = true;
        iVar.copyOnWrite();
        C54160l lVar = (C54160l) iVar.instance;
        C54159k kVar5 = (C54159k) jVar.build();
        kVar5.getClass();
        C62971cq cqVar = lVar.f142137a;
        if (!cqVar.mo58948c()) {
            lVar.f142137a = C62942bv.mutableCopy(cqVar);
        }
        lVar.f142137a.add(kVar5);
        mVar.copyOnWrite();
        C54162n nVar2 = (C54162n) mVar.instance;
        C54160l lVar2 = (C54160l) iVar.build();
        lVar2.getClass();
        nVar2.f142142c = lVar2;
        nVar2.f142140a |= 2;
        C62942bv build = mVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…       )\n        .build()");
        return (C54162n) build;
    }
}

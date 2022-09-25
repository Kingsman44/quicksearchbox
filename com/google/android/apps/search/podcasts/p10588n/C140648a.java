package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140021an;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140028f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4757ac.p4758a.C63110i;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63112k;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.ArrayList;
import java.util.Collections;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.n.a */
/* compiled from: PG */
public final class C140648a {

    /* renamed from: a */
    private final C140022ao f382015a;

    /* renamed from: b */
    private final C139958c f382016b;

    public C140648a(C140022ao aoVar, C139958c cVar) {
        C69664n.m101061g(aoVar, "episodeDownloadManager");
        this.f382015a = aoVar;
        this.f382016b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo115814a() {
        C58485gu guVar;
        C139958c cVar = this.f382016b;
        C140022ao aoVar = this.f382015a;
        C140021an anVar = aoVar.f380560c;
        if (!anVar.f380556a) {
            guVar = C58485gu.m89845m();
        } else {
            ArrayList arrayList = new ArrayList(anVar.mo115391b());
            Collections.sort(arrayList, C140028f.f380586a);
            C58480gp e = C58485gu.m89837e();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C97918h hVar = ((C97914d) ((C97874a) arrayList.get(i)).instance).f273397c;
                if (hVar == null) {
                    hVar = C97918h.f273412m;
                }
                if ((hVar.f273414a & 8) != 0) {
                    C63111j jVar = hVar.f273418e;
                    if (jVar == null) {
                        jVar = C63111j.f170348p;
                    }
                    C63111j jVar2 = hVar.f273418e;
                    if (jVar2 == null) {
                        jVar2 = C63111j.f170348p;
                    }
                    C63113l lVar = jVar2.f170360k;
                    if (lVar == null) {
                        lVar = C63113l.f170365p;
                    }
                    if ((lVar.f170367a & 64) != 0) {
                        e.mo55395g(jVar);
                    } else {
                        C63110i iVar = (C63110i) jVar.toBuilder();
                        C63112k kVar = (C63112k) C63113l.f170365p.createBuilder();
                        String str = hVar.f273421h;
                        kVar.copyOnWrite();
                        C63113l lVar2 = (C63113l) kVar.instance;
                        str.getClass();
                        lVar2.f170367a |= 2;
                        lVar2.f170369c = str;
                        String str2 = hVar.f273422i;
                        kVar.copyOnWrite();
                        C63113l lVar3 = (C63113l) kVar.instance;
                        str2.getClass();
                        lVar3.f170367a |= 1;
                        lVar3.f170368b = str2;
                        String str3 = hVar.f273419f;
                        kVar.copyOnWrite();
                        C63113l lVar4 = (C63113l) kVar.instance;
                        str3.getClass();
                        lVar4.f170367a |= 8;
                        lVar4.f170371e = str3;
                        String str4 = hVar.f273420g;
                        kVar.copyOnWrite();
                        C63113l lVar5 = (C63113l) kVar.instance;
                        str4.getClass();
                        lVar5.f170367a |= 4096;
                        lVar5.f170377k = str4;
                        C97920j jVar3 = hVar.f273423j;
                        if (jVar3 == null) {
                            jVar3 = C97920j.f273426e;
                        }
                        String str5 = jVar3.f273429b;
                        kVar.copyOnWrite();
                        C63113l lVar6 = (C63113l) kVar.instance;
                        str5.getClass();
                        lVar6.f170367a |= 64;
                        lVar6.f170373g = str5;
                        C97920j jVar4 = hVar.f273423j;
                        if (jVar4 == null) {
                            jVar4 = C97920j.f273426e;
                        }
                        String str6 = jVar4.f273430c;
                        kVar.copyOnWrite();
                        C63113l lVar7 = (C63113l) kVar.instance;
                        str6.getClass();
                        lVar7.f170367a |= 512;
                        lVar7.f170375i = str6;
                        iVar.copyOnWrite();
                        C63111j jVar5 = (C63111j) iVar.instance;
                        C63113l lVar8 = (C63113l) kVar.build();
                        lVar8.getClass();
                        jVar5.f170360k = lVar8;
                        jVar5.f170350a |= 512;
                        e.mo55395g((C63111j) iVar.build());
                    }
                } else {
                    C97920j jVar6 = hVar.f273423j;
                    if (jVar6 == null) {
                        jVar6 = C97920j.f273426e;
                    }
                    aoVar.mo115403k(jVar6, (Runnable) null);
                }
            }
            guVar = e.mo55394f();
        }
        C69664n.m101060f(guVar, "episodeDownloadManager.downloadEpisodeList");
        return cVar.mo115362b(guVar);
    }
}

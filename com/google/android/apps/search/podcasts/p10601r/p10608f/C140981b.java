package com.google.android.apps.search.podcasts.p10601r.p10608f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10601r.C140968d;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.common.p4552o.C60428pw;
import com.google.common.p4552o.C60429px;
import com.google.common.p4552o.C60430py;
import com.google.common.p4552o.C60431pz;
import com.google.protobuf.C62940bt;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.f.b */
/* compiled from: PG */
public final class C140981b {
    /* renamed from: a */
    public static final C28313c m228939a(C28306ab abVar, C140641b bVar, C97925o oVar, int i) {
        C69664n.m101061g(bVar, "episodeItem");
        C69664n.m101061g(oVar, "episodeItemVe");
        C97920j a = C140968d.m228923a(bVar);
        C28313c a2 = abVar.f76990a.mo33805a(C28427h.m53115a(oVar.f273443c));
        a2.mo33858f(C28449s.m53155a(i));
        a2.mo33858f(C28375ak.m53059a((long) a.hashCode()));
        if (oVar.f273445e) {
            C69664n.m101061g(a, "episodeId");
            C62940bt btVar = C140980a.f382762a;
            C60430py pyVar = (C60430py) C60431pz.f163541h.createBuilder();
            C60428pw pwVar = (C60428pw) C60429px.f163535e.createBuilder();
            String str = a.f273431d;
            pwVar.copyOnWrite();
            C60429px pxVar = (C60429px) pwVar.instance;
            str.getClass();
            pxVar.f163537a |= 4;
            pxVar.f163540d = str;
            String str2 = a.f273429b;
            pwVar.copyOnWrite();
            C60429px pxVar2 = (C60429px) pwVar.instance;
            str2.getClass();
            pxVar2.f163537a |= 2;
            pxVar2.f163539c = str2;
            String str3 = a.f273430c;
            pwVar.copyOnWrite();
            C60429px pxVar3 = (C60429px) pwVar.instance;
            str3.getClass();
            pxVar3.f163537a |= 1;
            pxVar3.f163538b = str3;
            pyVar.copyOnWrite();
            C60431pz pzVar = (C60431pz) pyVar.instance;
            C60429px pxVar4 = (C60429px) pwVar.build();
            pxVar4.getClass();
            pzVar.f163546d = pxVar4;
            pzVar.f163543a |= 4;
            a2.mo33858f(new C28353e(btVar, pyVar.build()));
        }
        return a2;
    }
}

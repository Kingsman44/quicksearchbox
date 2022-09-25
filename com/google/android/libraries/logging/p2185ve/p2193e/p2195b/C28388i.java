package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.gms.clearcut.C143623ad;
import com.google.android.libraries.logging.p2182b.C28282m;
import com.google.android.libraries.logging.p2182b.p2183a.p2184a.C28262a;
import com.google.android.libraries.logging.p2182b.p2183a.p2184a.C28264c;
import com.google.android.libraries.logging.p2182b.p2183a.p2184a.C28265d;
import com.google.android.libraries.logging.p2185ve.p2192d.C28351d;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.MessageLite;
import java.util.Set;

/* renamed from: com.google.android.libraries.logging.ve.e.b.i */
/* compiled from: PG */
public final /* synthetic */ class C28388i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C28389j f77128a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f77129b;

    /* renamed from: c */
    public final /* synthetic */ Set f77130c;

    /* renamed from: d */
    public final /* synthetic */ String f77131d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f77132e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f77133f;

    /* renamed from: g */
    public final /* synthetic */ C58833ax f77134g;

    /* renamed from: h */
    public final /* synthetic */ C60870cx f77135h;

    /* renamed from: i */
    public final /* synthetic */ C28351d f77136i;

    /* renamed from: j */
    public final /* synthetic */ C28282m f77137j;

    public /* synthetic */ C28388i(C28389j jVar, C60870cx cxVar, Set set, String str, C60870cx cxVar2, C60870cx cxVar3, C58833ax axVar, C60870cx cxVar4, C28351d dVar, C28282m mVar) {
        this.f77128a = jVar;
        this.f77129b = cxVar;
        this.f77130c = set;
        this.f77131d = str;
        this.f77132e = cxVar2;
        this.f77133f = cxVar3;
        this.f77134g = axVar;
        this.f77135h = cxVar4;
        this.f77136i = dVar;
        this.f77137j = mVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C28389j jVar = this.f77128a;
        C60870cx cxVar = this.f77129b;
        Set set = this.f77130c;
        String str = this.f77131d;
        C60870cx cxVar2 = this.f77132e;
        C60870cx cxVar3 = this.f77133f;
        C58833ax axVar = this.f77134g;
        C60870cx cxVar4 = this.f77135h;
        C28351d dVar = this.f77136i;
        C28282m mVar = this.f77137j;
        int[] iArr = (int[]) C60856cj.m92909r(cxVar);
        if (iArr != null) {
            set.addAll(C60757n.m92749j(iArr));
        }
        C28264c k = C28265d.m52844k();
        k.mo33755b(str);
        k.mo33756c((MessageLite) C60856cj.m92909r(cxVar2));
        C28262a aVar = (C28262a) k;
        aVar.f76916a = (C60321oe) C60856cj.m92909r(cxVar3);
        aVar.f76917b = (Integer) axVar.mo56111f();
        aVar.f76919d = (int[]) C60856cj.m92909r(cxVar4);
        k.mo33757d(jVar.f77138a.mo33874f(dVar));
        aVar.f76918c = (C143623ad) jVar.f77138a.mo33870b(dVar).mo56111f();
        if (!set.isEmpty()) {
            aVar.f76920e = C60757n.m92752m(set);
        }
        C47558bi a = C47831fm.m85006a("GIL:ClearcutTransmitter");
        try {
            C60870cx a2 = jVar.f77139b.mo33771a(k.mo33754a(), mVar.f76964b);
            a.mo51417a(a2);
            a.close();
            return a2;
        } catch (Throwable th) {
            C28386g.m53066a(th, th);
        }
        throw th;
    }
}

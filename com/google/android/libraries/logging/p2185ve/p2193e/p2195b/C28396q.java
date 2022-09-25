package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.gms.clearcut.C143623ad;
import com.google.android.libraries.logging.p2182b.C28282m;
import com.google.android.libraries.logging.p2182b.p2183a.p2184a.C28262a;
import com.google.android.libraries.logging.p2182b.p2183a.p2184a.C28264c;
import com.google.android.libraries.logging.p2182b.p2183a.p2184a.C28265d;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2192d.C28348a;
import com.google.android.libraries.logging.p2185ve.p2192d.C28352e;
import com.google.android.libraries.logging.p2185ve.p2200g.C28425b;
import com.google.android.libraries.logging.p2185ve.p2200g.C28426c;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;
import java.util.HashSet;

/* renamed from: com.google.android.libraries.logging.ve.e.b.q */
/* compiled from: PG */
public final /* synthetic */ class C28396q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C28397r f77150a;

    /* renamed from: b */
    public final /* synthetic */ String f77151b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f77152c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f77153d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f77154e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f77155f;

    /* renamed from: g */
    public final /* synthetic */ C28352e f77156g;

    /* renamed from: h */
    public final /* synthetic */ C60870cx f77157h;

    /* renamed from: i */
    public final /* synthetic */ C28282m f77158i;

    public /* synthetic */ C28396q(C28397r rVar, String str, C60870cx cxVar, C60870cx cxVar2, C58833ax axVar, C60870cx cxVar3, C28352e eVar, C60870cx cxVar4, C28282m mVar) {
        this.f77150a = rVar;
        this.f77151b = str;
        this.f77152c = cxVar;
        this.f77153d = cxVar2;
        this.f77154e = axVar;
        this.f77155f = cxVar3;
        this.f77156g = eVar;
        this.f77157h = cxVar4;
        this.f77158i = mVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Object obj;
        C28397r rVar = this.f77150a;
        String str = this.f77151b;
        C60870cx cxVar = this.f77152c;
        C60870cx cxVar2 = this.f77153d;
        C58833ax axVar = this.f77154e;
        C60870cx cxVar3 = this.f77155f;
        C28352e eVar = this.f77156g;
        C60870cx cxVar4 = this.f77157h;
        C28282m mVar = this.f77158i;
        C28264c k = C28265d.m52844k();
        k.mo33755b(str);
        k.mo33756c((MessageLite) C60856cj.m92909r(cxVar));
        C28262a aVar = (C28262a) k;
        aVar.f76916a = (C60321oe) C60856cj.m92909r(cxVar2);
        aVar.f76917b = (Integer) axVar.mo56111f();
        aVar.f76919d = (int[]) C60856cj.m92909r(cxVar3);
        k.mo33757d(rVar.f77159a.mo33874f(eVar));
        aVar.f76918c = (C143623ad) rVar.f77159a.mo33870b(eVar).mo56111f();
        int[] iArr = (int[]) C60856cj.m92909r(cxVar4);
        C28481u b = C28348a.m53029b(eVar);
        C62940bt r4 = C62942bv.checkIsLite(C28426c.f77197a);
        b.mo58887l(r4);
        if (b.f169962ag.mo58857o(r4.f169971d) || iArr != null) {
            C28481u b2 = C28348a.m53029b(eVar);
            C62940bt r5 = C62942bv.checkIsLite(C28426c.f77197a);
            b2.mo58887l(r5);
            Object l = b2.f169962ag.mo58854l(r5.f169971d);
            if (l == null) {
                obj = r5.f169969b;
            } else {
                obj = r5.mo58889c(l);
            }
            HashSet hashSet = new HashSet(((C28425b) obj).f77196a);
            if (iArr != null) {
                hashSet.addAll(C60757n.m92749j(iArr));
            }
            aVar.f76920e = C60757n.m92752m(hashSet);
        }
        return rVar.f77160b.mo33771a(k.mo33754a(), mVar.f76964b);
    }
}

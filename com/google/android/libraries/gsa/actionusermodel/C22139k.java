package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55084fg;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64708r;
import com.google.protos.p4985f.p4986a.C64710t;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.k */
/* compiled from: PG */
public final /* synthetic */ class C22139k implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C22153y f61039a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f61040b;

    /* renamed from: c */
    public final /* synthetic */ C55084fg f61041c;

    /* renamed from: d */
    public final /* synthetic */ List f61042d;

    /* renamed from: e */
    public final /* synthetic */ C55421x f61043e;

    /* renamed from: f */
    public final /* synthetic */ String f61044f;

    /* renamed from: g */
    public final /* synthetic */ String f61045g;

    /* renamed from: h */
    public final /* synthetic */ String f61046h;

    /* renamed from: i */
    public final /* synthetic */ String f61047i;

    /* renamed from: j */
    public final /* synthetic */ Optional f61048j;

    /* renamed from: k */
    public final /* synthetic */ C63088z f61049k;

    /* renamed from: l */
    public final /* synthetic */ boolean f61050l;

    /* renamed from: m */
    public final /* synthetic */ C64708r f61051m;

    /* renamed from: n */
    public final /* synthetic */ boolean f61052n;

    /* renamed from: o */
    public final /* synthetic */ C60870cx f61053o;

    /* renamed from: p */
    public final /* synthetic */ boolean f61054p;

    public /* synthetic */ C22139k(C22153y yVar, C60870cx cxVar, C55084fg fgVar, List list, C55421x xVar, String str, String str2, String str3, String str4, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2, C60870cx cxVar2, boolean z3) {
        this.f61039a = yVar;
        this.f61040b = cxVar;
        this.f61041c = fgVar;
        this.f61042d = list;
        this.f61043e = xVar;
        this.f61044f = str;
        this.f61045g = str2;
        this.f61046h = str3;
        this.f61047i = str4;
        this.f61048j = optional;
        this.f61049k = zVar;
        this.f61050l = z;
        this.f61051m = rVar;
        this.f61052n = z2;
        this.f61053o = cxVar2;
        this.f61054p = z3;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C22153y yVar = this.f61039a;
        C60870cx cxVar = this.f61040b;
        C55084fg fgVar = this.f61041c;
        List list = this.f61042d;
        C55421x xVar = this.f61043e;
        String str = this.f61044f;
        String str2 = this.f61045g;
        String str3 = this.f61046h;
        String str4 = this.f61047i;
        Optional optional = this.f61048j;
        C63088z zVar = this.f61049k;
        boolean z = this.f61050l;
        C64708r rVar = this.f61051m;
        boolean z2 = this.f61052n;
        C60870cx cxVar2 = this.f61053o;
        C64708r rVar2 = rVar;
        boolean z3 = this.f61054p;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        C58485gu d = fgVar == C55084fg.PHONE_NUMBER ? C22063au.m41301d(guVar, C22063au.m41299b(list)) : guVar;
        C22068az azVar = yVar.f61119b;
        C64710t f = C22063au.m41303f(zVar);
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        AumNativeResolverImpl aumNativeResolverImpl = (AumNativeResolverImpl) azVar;
        C22104g a = AumNativeResolverImpl.m41269a(aumNativeResolverImpl.nativeResolveInstance(C22063au.m41306i(xVar, str, str2, str3, str4, list, optional, d, f, z, rVar2, z2, booleanValue, z3).toByteArray()));
        yVar.mo27367i(optional, a);
        return a;
    }
}

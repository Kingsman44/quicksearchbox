package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protos.p4985f.p4986a.C64708r;
import com.google.protos.p4985f.p4986a.C64710t;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.g */
/* compiled from: PG */
public final /* synthetic */ class C22135g implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C22153y f60995a;

    /* renamed from: b */
    public final /* synthetic */ C55421x f60996b;

    /* renamed from: c */
    public final /* synthetic */ String f60997c;

    /* renamed from: d */
    public final /* synthetic */ List f60998d;

    /* renamed from: e */
    public final /* synthetic */ Optional f60999e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f61000f;

    /* renamed from: g */
    public final /* synthetic */ C60870cx f61001g;

    /* renamed from: h */
    public final /* synthetic */ boolean f61002h;

    /* renamed from: i */
    public final /* synthetic */ C64708r f61003i;

    /* renamed from: j */
    public final /* synthetic */ boolean f61004j;

    /* renamed from: k */
    public final /* synthetic */ C60870cx f61005k;

    public /* synthetic */ C22135g(C22153y yVar, C55421x xVar, String str, List list, Optional optional, C60870cx cxVar, C60870cx cxVar2, boolean z, C64708r rVar, boolean z2, C60870cx cxVar3) {
        this.f60995a = yVar;
        this.f60996b = xVar;
        this.f60997c = str;
        this.f60998d = list;
        this.f60999e = optional;
        this.f61000f = cxVar;
        this.f61001g = cxVar2;
        this.f61002h = z;
        this.f61003i = rVar;
        this.f61004j = z2;
        this.f61005k = cxVar3;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C22153y yVar = this.f60995a;
        C55421x xVar = this.f60996b;
        String str = this.f60997c;
        List list = this.f60998d;
        Optional optional = this.f60999e;
        C60870cx cxVar = this.f61000f;
        C60870cx cxVar2 = this.f61001g;
        boolean z = this.f61002h;
        C64708r rVar = this.f61003i;
        boolean z2 = this.f61004j;
        C60870cx cxVar3 = this.f61005k;
        C22068az azVar = yVar.f61119b;
        AumNativeResolverImpl aumNativeResolverImpl = (AumNativeResolverImpl) azVar;
        C22104g a = AumNativeResolverImpl.m41269a(aumNativeResolverImpl.nativeResolveContact(C22063au.m41315r(xVar, str, list, optional, (List) C60856cj.m92909r(cxVar), (C64710t) C60856cj.m92909r(cxVar2), z, rVar, z2, ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue()).toByteArray()));
        yVar.mo27367i(optional, a);
        return a;
    }
}

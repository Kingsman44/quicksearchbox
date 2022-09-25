package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64708r;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.b */
/* compiled from: PG */
public final /* synthetic */ class C22069b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C22153y f60807a;

    /* renamed from: b */
    public final /* synthetic */ C55421x f60808b;

    /* renamed from: c */
    public final /* synthetic */ String f60809c;

    /* renamed from: d */
    public final /* synthetic */ String f60810d;

    /* renamed from: e */
    public final /* synthetic */ List f60811e;

    /* renamed from: f */
    public final /* synthetic */ Optional f60812f;

    /* renamed from: g */
    public final /* synthetic */ C60870cx f60813g;

    /* renamed from: h */
    public final /* synthetic */ C63088z f60814h;

    /* renamed from: i */
    public final /* synthetic */ boolean f60815i;

    /* renamed from: j */
    public final /* synthetic */ C64708r f60816j;

    /* renamed from: k */
    public final /* synthetic */ boolean f60817k;

    /* renamed from: l */
    public final /* synthetic */ C60870cx f60818l;

    public /* synthetic */ C22069b(C22153y yVar, C55421x xVar, String str, String str2, List list, Optional optional, C60870cx cxVar, C63088z zVar, boolean z, C64708r rVar, boolean z2, C60870cx cxVar2) {
        this.f60807a = yVar;
        this.f60808b = xVar;
        this.f60809c = str;
        this.f60810d = str2;
        this.f60811e = list;
        this.f60812f = optional;
        this.f60813g = cxVar;
        this.f60814h = zVar;
        this.f60815i = z;
        this.f60816j = rVar;
        this.f60817k = z2;
        this.f60818l = cxVar2;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C22153y yVar = this.f60807a;
        C55421x xVar = this.f60808b;
        String str = this.f60809c;
        String str2 = this.f60810d;
        List list = this.f60811e;
        Optional optional = this.f60812f;
        C60870cx cxVar = this.f60813g;
        C63088z zVar = this.f60814h;
        boolean z = this.f60815i;
        C64708r rVar = this.f60816j;
        boolean z2 = this.f60817k;
        C60870cx cxVar2 = this.f60818l;
        C22068az azVar = yVar.f61119b;
        AumNativeResolverImpl aumNativeResolverImpl = (AumNativeResolverImpl) azVar;
        C22104g a = AumNativeResolverImpl.m41269a(aumNativeResolverImpl.nativeResolveProvider(C22063au.m41313p(xVar, str, str2, list, optional, (List) C60856cj.m92909r(cxVar), C22063au.m41303f(zVar), z, rVar, z2, ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()).toByteArray()));
        yVar.mo27367i(optional, a);
        return a;
    }
}

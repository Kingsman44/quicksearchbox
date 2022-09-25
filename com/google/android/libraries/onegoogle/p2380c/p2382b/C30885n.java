package com.google.android.libraries.onegoogle.p2380c.p2382b;

import android.content.Context;
import com.google.android.libraries.logging.p2182b.C28280k;
import com.google.android.libraries.logging.p2185ve.p2193e.p2194a.C28354a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import com.google.protos.p4868ao.p4869a.p4870a.C63645c;
import com.google.protos.p4868ao.p4869a.p4870a.C63646d;

/* renamed from: com.google.android.libraries.onegoogle.c.b.n */
/* compiled from: PG */
public final class C30885n implements C28354a {

    /* renamed from: a */
    final /* synthetic */ Context f83284a;

    public C30885n(Context context) {
        this.f83284a = context;
    }

    /* renamed from: a */
    public final /* synthetic */ C58833ax mo33869a(C28280k kVar) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final /* synthetic */ C58833ax mo33870b(C28280k kVar) {
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final C60870cx mo33871c(C28280k kVar, C60870cx cxVar) {
        C63645c cVar = (C63645c) C63646d.f172127c.createBuilder();
        C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
        String packageName = this.f83284a.getPackageName();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        packageName.getClass();
        bVar.f172121a |= 64;
        bVar.f172126f = packageName;
        cVar.copyOnWrite();
        C63646d dVar = (C63646d) cVar.instance;
        C63644b bVar2 = (C63644b) aVar.build();
        bVar2.getClass();
        dVar.f172130b = bVar2;
        dVar.f172129a |= 1;
        return C60856cj.m92900i(cVar.build());
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo33872d(C28280k kVar, C60870cx cxVar) {
        return C60866ct.f164955a;
    }

    /* renamed from: e */
    public final String mo33873e(C28280k kVar) {
        return "ONEGOOGLE_MOBILE";
    }

    /* renamed from: f */
    public final int mo33874f(C28280k kVar) {
        return 1;
    }

    /* renamed from: g */
    public final /* synthetic */ C60870cx mo33875g() {
        throw null;
    }
}

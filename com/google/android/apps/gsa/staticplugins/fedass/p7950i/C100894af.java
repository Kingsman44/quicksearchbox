package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.af */
/* compiled from: PG */
public final /* synthetic */ class C100894af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100898aj f281892a;

    /* renamed from: b */
    public final /* synthetic */ String f281893b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f281894c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f281895d;

    public /* synthetic */ C100894af(C100898aj ajVar, String str, byte[] bArr, byte[] bArr2) {
        this.f281892a = ajVar;
        this.f281893b = str;
        this.f281894c = bArr;
        this.f281895d = bArr2;
    }

    public final C60870cx apply(Object obj) {
        C100898aj ajVar = this.f281892a;
        String str = this.f281893b;
        byte[] bArr = this.f281894c;
        byte[] bArr2 = this.f281895d;
        C58833ax axVar = (C58833ax) obj;
        ajVar.f281912f.set((Object) null);
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) C100898aj.f281907a.mo56225c()).mo56372aa(19691)).mo56386p("Failed to get accountName");
            return C60856cj.m92900i(false);
        }
        C47633f i = C47633f.m84733g(ajVar.f281909c.mo92071b()).mo51516i(new C100895ag(ajVar, (String) axVar.mo56107c()), ajVar.f281908b);
        C60870cx a = ajVar.f281911e.mo92047a((String) axVar.mo56107c());
        C60870cx b = ((C100719ab) ajVar.f281913g.f281967a.mo27525b()).mo92018b();
        C100924g gVar = C100924g.f281966a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(gVar), C60826bg.f164896a);
        return C47638k.m84753d(i, a, g).mo51520a(new C100896ah(ajVar, i, a, g, str, bArr, bArr2), ajVar.f281908b);
    }
}

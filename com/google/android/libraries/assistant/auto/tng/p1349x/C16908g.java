package com.google.android.libraries.assistant.auto.tng.p1349x;

import android.util.Base64;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4486ci.p4487a.C58100e;
import com.google.p4486ci.p4487a.C58113r;
import com.google.p4486ci.p4487a.C58114s;
import com.google.p4486ci.p4487a.C58119x;
import com.google.protobuf.C63088z;
import p001a.p007b.p008a.p009a.p010a.C0024t;

/* renamed from: com.google.android.libraries.assistant.auto.tng.x.g */
/* compiled from: PG */
public final /* synthetic */ class C16908g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16911j f49430a;

    /* renamed from: b */
    public final /* synthetic */ String f49431b;

    /* renamed from: c */
    public final /* synthetic */ C63088z f49432c;

    public /* synthetic */ C16908g(C16911j jVar, String str, C63088z zVar) {
        this.f49430a = jVar;
        this.f49431b = str;
        this.f49432c = zVar;
    }

    public final C60870cx apply(Object obj) {
        C16911j jVar = this.f49430a;
        String str = this.f49431b;
        C63088z zVar = this.f49432c;
        int d = zVar.mo59031d();
        C58100e eVar = new C58100e();
        eVar.mo54653d("Authorization", "Bearer ".concat(String.valueOf(str)));
        eVar.mo54653d("X-Goog-Upload-Header-Content-Length", String.valueOf(d));
        C58114s a = C58119x.m88920a(jVar.f49440b, eVar, new C58113r(zVar.mo59174N()), Base64.encodeToString(((C0024t) obj).toByteArray(), 11));
        jVar.f49453o = new C16910i();
        a.mo54663f(jVar.f49453o, 1048576);
        return a.mo54658a();
    }
}

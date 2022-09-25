package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113611x;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.n */
/* compiled from: PG */
public final /* synthetic */ class C113635n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ OfflineSubController f314677a;

    /* renamed from: b */
    public final /* synthetic */ boolean f314678b;

    /* renamed from: c */
    public final /* synthetic */ String f314679c;

    /* renamed from: d */
    public final /* synthetic */ String f314680d;

    /* renamed from: e */
    public final /* synthetic */ String f314681e;

    /* renamed from: f */
    public final /* synthetic */ C113611x f314682f;

    public /* synthetic */ C113635n(OfflineSubController offlineSubController, boolean z, String str, C113611x xVar, String str2, String str3) {
        this.f314677a = offlineSubController;
        this.f314678b = z;
        this.f314679c = str;
        this.f314682f = xVar;
        this.f314680d = str2;
        this.f314681e = str3;
    }

    public final Object apply(Object obj) {
        String str;
        OfflineSubController offlineSubController = this.f314677a;
        boolean z = this.f314678b;
        String str2 = this.f314679c;
        C113611x xVar = this.f314682f;
        String str3 = this.f314680d;
        String str4 = this.f314681e;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            axVar.mo56107c();
            if (z) {
                str = str2;
            } else {
                str = (String) axVar.mo56107c();
            }
            offlineSubController.f314602f.mo28212l("RenderOfflineInterpreterResponse", new C113633l(offlineSubController, xVar, str, z ? (String) axVar.mo56107c() : str2, str3, str4, z, axVar));
            offlineSubController.f314606j.mo104025g(1);
            return null;
        }
        offlineSubController.f314602f.mo28212l("RenderOfflineInterpreterErrorMsg", new C113634m(offlineSubController, xVar));
        offlineSubController.f314606j.mo104025g(0);
        return null;
    }
}

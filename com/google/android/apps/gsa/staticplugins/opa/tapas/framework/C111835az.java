package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112145l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.az */
/* compiled from: PG */
public final /* synthetic */ class C111835az implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C111877bo f310799a;

    /* renamed from: b */
    public final /* synthetic */ C112145l f310800b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f310801c;

    /* renamed from: d */
    public final /* synthetic */ Map f310802d;

    public /* synthetic */ C111835az(C111877bo boVar, C112145l lVar, C113405ep epVar, Map map) {
        this.f310799a = boVar;
        this.f310800b = lVar;
        this.f310801c = epVar;
        this.f310802d = map;
    }

    public final C60870cx apply(Object obj) {
        C111877bo boVar = this.f310799a;
        Void voidR = (Void) obj;
        return C90877ak.m148471e(this.f310800b.mo99416i(this.f310801c, this.f310802d), boVar.f310875c.mo79743a(C90063do.f249480eN), TimeUnit.MILLISECONDS, boVar.f310878f);
    }
}

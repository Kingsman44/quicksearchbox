package com.google.android.apps.gsa.staticplugins.customtabs;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.p1703d.C20645ai;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.ad */
/* compiled from: PG */
public final /* synthetic */ class C98578ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98583ai f275322a;

    /* renamed from: b */
    public final /* synthetic */ C20645ai f275323b;

    public /* synthetic */ C98578ad(C98583ai aiVar, C20645ai aiVar2) {
        this.f275322a = aiVar;
        this.f275323b = aiVar2;
    }

    public final C60870cx apply(Object obj) {
        C98583ai aiVar = this.f275322a;
        C20645ai aiVar2 = this.f275323b;
        if (!((Boolean) obj).booleanValue()) {
            return aiVar.mo91198v(new C98690j(aiVar, aiVar2));
        }
        Uri a = aiVar2.mo25597a();
        if (a == null) {
            ((C59052c) ((C59052c) C98583ai.f275327a.mo56226d()).mo56372aa(19091)).mo56386p("Invalid URL to preload");
            return C118826c.f331423b;
        }
        int aD = aiVar.f275332h.mo78086aD();
        int i = aD - 1;
        if (aD == 0) {
            throw null;
        } else if (i == 0 || i == 1) {
            return C118826c.f331423b;
        } else {
            if (i == 2) {
                return C47633f.m84733g(aiVar.f275338n.mo79697b()).mo51516i(new C98698r(aiVar), aiVar.f275335k).mo51516i(new C98700t(aiVar, a), aiVar.f275334j).mo51514f(Exception.class, C98701u.f275690a, aiVar.f275335k);
            }
            if (i == 3) {
                return C60856cj.m92899h(new UnsupportedOperationException("Web Prerenderer is not supported"));
            }
            throw new AssertionError("Unhandled preload strategy: " + i);
        }
    }
}

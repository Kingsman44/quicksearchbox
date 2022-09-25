package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8559d;

import com.google.android.apps.gsa.shared.p7066m.C90036co;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.assistant.p3781ad.p3787c.p3788a.C48492ak;
import com.google.common.p4526f.C59052c;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.f */
/* compiled from: PG */
public final class C112255f implements C68220f {
    /* renamed from: a */
    public static C48492ak m186114a(C112250a aVar) {
        C121509q l = C112250a.f311546b.mo105243l("loadModelConfigFromFlags");
        try {
            C48492ak akVar = (C48492ak) aVar.f311547c.mo79754t(C90036co.f248392a, C48492ak.f125266c.getParserForType());
            if (akVar == null) {
                ((C59052c) ((C59052c) C112250a.f311545a.mo56226d()).mo56372aa(27645)).mo56386p("AgsaOpaGeminiNg3__ng3_model_config is not available");
                akVar = C48492ak.f125266c;
            }
            l.close();
            C68225k.m98532d(akVar);
            return akVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}

package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7180q.C91081a;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.libraries.assistant.trainingcache.agsa.C19425c;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerImpl;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoTraining;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67274ae;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.s */
/* compiled from: PG */
public final class C100788s {

    /* renamed from: a */
    public static final C59071e f281704a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.b.s");

    /* renamed from: b */
    public final C100784o f281705b;

    /* renamed from: c */
    private final Context f281706c;

    public C100788s(Context context, C100784o oVar) {
        this.f281706c = context;
        this.f281705b = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo92054a(String str, String str2, byte[] bArr, byte[] bArr2) {
        C100742h e = C100742h.m166944c(this.f281705b.mo92047a(str)).mo92035e(new C100786q(this, str2, bArr, bArr2));
        e.mo92038i(C100787r.f281703a);
        return e.f281631a;
    }

    /* renamed from: b */
    public final boolean mo92055b() {
        C91084c a = C91081a.m148802a();
        if (a == C91084c.TRAIN) {
            return true;
        }
        C59104x c = f281704a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "EkhoTrainingWrp");
        ((C59052c) ((C59052c) c).mo56372aa(19543)).mo56354G("EchoTraining cannot be initialized in %s process, only %s", a, C91084c.TRAIN);
        return false;
    }

    /* renamed from: c */
    public final EkhoMaterializerImpl mo92056c(C67270aa aaVar, C67274ae aeVar, String str, byte[] bArr, byte[] bArr2) {
        Throwable th;
        C100761a.m166954a(this.f281706c);
        File file = new File(aaVar.f182859b);
        if (!file.exists()) {
            C59104x d = C19425c.f54327a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EkhoTrainingWrp");
            ((C59052c) ((C59052c) d).mo56372aa(47834)).mo56389s("Training cache %s doesn't exist. Ignoring.", file.getAbsoluteFile());
            return null;
        }
        EkhoTraining ekhoTraining = new EkhoTraining();
        try {
            EkhoTraining.nativeInit(ekhoTraining.f54362a.get(), aaVar.toByteArray(), aeVar.toByteArray());
            long nativeCreateMaterializer = EkhoTraining.nativeCreateMaterializer(ekhoTraining.f54362a.get(), str);
            if (nativeCreateMaterializer != 0) {
                EkhoMaterializerImpl ekhoMaterializerImpl = new EkhoMaterializerImpl(nativeCreateMaterializer);
                C58838bb.m90884s(ekhoMaterializerImpl.f54360b != 2, "Already started.");
                C58838bb.m90884s(ekhoMaterializerImpl.f54360b != 3, "Already closed.");
                ekhoMaterializerImpl.nativeStart(ekhoMaterializerImpl.f54359a, str, bArr, bArr2);
                ekhoMaterializerImpl.f54360b = 2;
                ekhoTraining.close();
                return ekhoMaterializerImpl;
            }
            throw new AssertionError();
        } catch (Throwable th2) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}

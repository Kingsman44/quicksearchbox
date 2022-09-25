package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.gsa.assist.p507f.C9411a;
import com.google.android.apps.gsa.assistant.shared.s;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.v */
/* compiled from: PG */
public final /* synthetic */ class C93050v implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259562a;

    public /* synthetic */ C93050v(ChatPerformer chatPerformer) {
        this.f259562a = chatPerformer;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        ChatPerformer chatPerformer = this.f259562a;
        C9411a a = chatPerformer.f259393e.mo17665a();
        if (a != null) {
            return C58833ax.m90834k(new s(a.f32698a, "image/png"));
        }
        new Handler(Looper.getMainLooper()).post(new C92992ac(chatPerformer));
        ((C89859i) chatPerformer.f259394f.mo27525b()).mo83702b(C89849ae.OPA_CHAT_PERFORMER_SCREENSHOT_FAILED);
        throw new RuntimeException("Failed to take screenshot. UNKNOWN ERROR.");
    }
}

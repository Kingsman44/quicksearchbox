package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.n */
/* compiled from: PG */
public final /* synthetic */ class C35960n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35981t f94134a;

    /* renamed from: b */
    public final /* synthetic */ Intent f94135b;

    public /* synthetic */ C35960n(C35981t tVar, Intent intent) {
        this.f94134a = tVar;
        this.f94135b = intent;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C35981t tVar = this.f94134a;
        Intent intent = this.f94135b;
        Void voidR = (Void) obj;
        if (!tVar.mo39915c(intent)) {
            if (intent.hasCategory("android.intent.category.VOICE")) {
                intent.removeCategory("android.intent.category.VOICE");
            }
            if (!tVar.mo39915c(intent)) {
                ((C59052c) ((C59052c) C35981t.f94162a.mo56226d()).mo56372aa(51802)).mo56386p("No camera app is installed.");
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.ABORTED, "No camera app is installed."));
            }
        }
        if (intent.hasCategory("android.intent.category.VOICE")) {
            cxVar = tVar.f94164c.mo20099a(intent);
        } else {
            cxVar = C60856cj.m92900i(false);
        }
        C35957k kVar = new C35957k(tVar, intent);
        return C60922j.m93045h(cxVar, C47810es.m84966f(kVar), tVar.f94165d);
    }
}

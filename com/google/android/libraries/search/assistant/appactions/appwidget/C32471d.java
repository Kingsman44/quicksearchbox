package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.assistant.p3931f.p3942e.C52920a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.d */
/* compiled from: PG */
final class C32471d extends C52920a {

    /* renamed from: a */
    final /* synthetic */ C32473f f87020a;

    public C32471d(C32473f fVar) {
        this.f87020a = fVar;
    }

    /* renamed from: a */
    public final void mo22098a(Bundle bundle) {
        Consumer d = this.f87020a.mo38096d();
        if (d != null) {
            String string = bundle.getString("appActionsSpeechLanguage");
            String string2 = bundle.getString("appActionsSpeechResponse");
            String string3 = bundle.getString("appActionsTextResponse");
            C32475h hVar = (C32475h) C32476i.f87025e.createBuilder();
            if (!TextUtils.isEmpty(string)) {
                hVar.copyOnWrite();
                C32476i iVar = (C32476i) hVar.instance;
                string.getClass();
                iVar.f87027a |= 1;
                iVar.f87028b = string;
            }
            if (!TextUtils.isEmpty(string2)) {
                hVar.copyOnWrite();
                C32476i iVar2 = (C32476i) hVar.instance;
                string2.getClass();
                iVar2.f87027a |= 4;
                iVar2.f87030d = string2;
            }
            if (!TextUtils.isEmpty(string3)) {
                hVar.copyOnWrite();
                C32476i iVar3 = (C32476i) hVar.instance;
                string3.getClass();
                iVar3.f87027a |= 2;
                iVar3.f87029c = string3;
            }
            d.accept((C32476i) hVar.build());
        }
    }
}

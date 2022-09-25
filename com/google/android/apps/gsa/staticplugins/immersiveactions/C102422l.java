package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.p6941ui.C88531k;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.l */
/* compiled from: PG */
final class C102422l extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ VoiceAction f285848a;

    /* renamed from: b */
    final /* synthetic */ C102424n f285849b;

    public C102422l(C102424n nVar, VoiceAction voiceAction) {
        this.f285849b = nVar;
        this.f285848a = voiceAction;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        C88531k kVar;
        String hw = this.f285848a.mo81070hw();
        if (!TextUtils.isEmpty(hw) && (kVar = this.f285849b.f285855d) != null) {
            kVar.mo82168b(hw, C28295m.m52915a(view));
        }
    }
}

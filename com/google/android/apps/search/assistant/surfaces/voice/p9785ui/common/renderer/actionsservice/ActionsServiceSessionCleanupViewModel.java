package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import androidx.lifecycle.C2358bf;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.ActionsServiceSessionCleanupViewModel */
/* compiled from: PG */
public final class ActionsServiceSessionCleanupViewModel extends C2358bf {

    /* renamed from: a */
    public String f354560a = BuildConfig.FLAVOR;

    /* renamed from: b */
    private final C129076i f354561b;

    public ActionsServiceSessionCleanupViewModel(C129076i iVar) {
        this.f354561b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        C32433a a = this.f354561b.mo108834a(this.f354560a);
        if (a != null) {
            a.mo38063e();
        }
        C129076i iVar = this.f354561b;
        String str = this.f354560a;
        C69664n.m101061g(str, "key");
        iVar.f354589c.f86990a.remove(str);
    }
}

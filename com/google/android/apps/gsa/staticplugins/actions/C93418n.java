package com.google.android.apps.gsa.staticplugins.actions;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.n */
/* compiled from: PG */
final class C93418n extends C90880an {

    /* renamed from: a */
    final /* synthetic */ VoiceAction f260556a;

    /* renamed from: b */
    final /* synthetic */ boolean f260557b;

    /* renamed from: c */
    final /* synthetic */ C93421q f260558c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93418n(C93421q qVar, String str, VoiceAction voiceAction, boolean z) {
        super(str, 1, 0);
        this.f260558c = qVar;
        this.f260556a = voiceAction;
        this.f260557b = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C93421q qVar = this.f260558c;
        return qVar.f260580h.mo87621a(this.f260556a, this.f260557b);
    }
}

package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ba */
/* compiled from: PG */
final class C80672ba extends C80730de {

    /* renamed from: a */
    public String f221486a;

    /* renamed from: b */
    private String f221487b;

    /* renamed from: c */
    private C80831aj f221488c;

    /* renamed from: d */
    private C80758ef f221489d;

    /* renamed from: a */
    public final C80731df mo74523a() {
        String str;
        C80831aj ajVar;
        C80758ef efVar;
        String str2 = this.f221487b;
        if (str2 != null && (str = this.f221486a) != null && (ajVar = this.f221488c) != null && (efVar = this.f221489d) != null) {
            return new C80673bb(str2, str, ajVar, efVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221487b == null) {
            sb.append(" text");
        }
        if (this.f221486a == null) {
            sb.append(" bottomText");
        }
        if (this.f221488c == null) {
            sb.append(" clickAssistantUiOutputAction");
        }
        if (this.f221489d == null) {
            sb.append(" privacyInputUi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74524b(String str) {
        if (str != null) {
            this.f221486a = str;
            return;
        }
        throw new NullPointerException("Null bottomText");
    }

    /* renamed from: c */
    public final void mo74525c(C80831aj ajVar) {
        if (ajVar != null) {
            this.f221488c = ajVar;
            return;
        }
        throw new NullPointerException("Null clickAssistantUiOutputAction");
    }

    /* renamed from: d */
    public final void mo74526d(C80758ef efVar) {
        if (efVar != null) {
            this.f221489d = efVar;
            return;
        }
        throw new NullPointerException("Null privacyInputUi");
    }

    /* renamed from: e */
    public final void mo74527e(String str) {
        if (str != null) {
            this.f221487b = str;
            return;
        }
        throw new NullPointerException("Null text");
    }
}

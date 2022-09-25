package com.google.android.apps.gsa.p6482q.p6483a;

import com.google.assistant.p3861at.C50163mx;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.q.a.a */
/* compiled from: PG */
final class C84228a extends C84230c {

    /* renamed from: a */
    private C58485gu f229228a;

    /* renamed from: b */
    private C50163mx f229229b;

    public C84228a() {
    }

    public C84228a(C84231d dVar) {
        C84229b bVar = (C84229b) dVar;
        this.f229228a = bVar.f229230a;
        this.f229229b = bVar.f229231b;
    }

    /* renamed from: a */
    public final C84231d mo77683a() {
        C50163mx mxVar;
        C58485gu guVar = this.f229228a;
        if (guVar != null && (mxVar = this.f229229b) != null) {
            return new C84229b(guVar, mxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f229228a == null) {
            sb.append(" devices");
        }
        if (this.f229229b == null) {
            sb.append(" helpImproveAssistantSettingsUi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77684b(C58485gu guVar) {
        if (guVar != null) {
            this.f229228a = guVar;
            return;
        }
        throw new NullPointerException("Null devices");
    }

    /* renamed from: c */
    public final void mo77685c(C50163mx mxVar) {
        if (mxVar != null) {
            this.f229229b = mxVar;
            return;
        }
        throw new NullPointerException("Null helpImproveAssistantSettingsUi");
    }
}

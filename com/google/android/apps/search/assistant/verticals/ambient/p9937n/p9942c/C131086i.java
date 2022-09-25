package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.c.i */
/* compiled from: PG */
final class C131086i extends C131089l {

    /* renamed from: a */
    private C58485gu f358552a;

    /* renamed from: b */
    private int f358553b;

    /* renamed from: c */
    private byte f358554c;

    /* renamed from: a */
    public final C131090m mo110063a() {
        C58485gu guVar;
        if (this.f358554c == 1 && (guVar = this.f358552a) != null) {
            return new C131087j(guVar, this.f358553b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f358552a == null) {
            sb.append(" topRankedApps");
        }
        if (this.f358554c == 0) {
            sb.append(" modelsCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo110064b(int i) {
        this.f358553b = i;
        this.f358554c = 1;
    }

    /* renamed from: c */
    public final void mo110065c(C58485gu guVar) {
        if (guVar != null) {
            this.f358552a = guVar;
            return;
        }
        throw new NullPointerException("Null topRankedApps");
    }
}

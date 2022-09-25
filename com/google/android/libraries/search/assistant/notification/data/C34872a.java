package com.google.android.libraries.search.assistant.notification.data;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.a */
/* compiled from: PG */
public final class C34872a extends C34889j {

    /* renamed from: a */
    private C58485gu f92506a;

    /* renamed from: a */
    public final BundledMessageNotification mo39587a() {
        C58485gu guVar = this.f92506a;
        if (guVar != null) {
            return new AutoValue_BundledMessageNotification(guVar);
        }
        throw new IllegalStateException("Missing required properties: notifications");
    }

    /* renamed from: b */
    public final void mo39588b(C58485gu guVar) {
        if (guVar != null) {
            this.f92506a = guVar;
            return;
        }
        throw new NullPointerException("Null notifications");
    }
}

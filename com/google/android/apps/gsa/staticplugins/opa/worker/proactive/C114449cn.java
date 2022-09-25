package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.assistant.p3803ag.p3809c.C49060ez;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cn */
/* compiled from: PG */
public final /* synthetic */ class C114449cn implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C114449cn f317338a = new C114449cn();

    private /* synthetic */ C114449cn() {
    }

    public final Object apply(Object obj) {
        C49060ez ezVar = (C49060ez) obj;
        boolean z = true;
        if (!ezVar.equals(C49060ez.DISMISSED) && !ezVar.equals(C49060ez.TAPPED)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

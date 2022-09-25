package com.google.android.apps.gsa.staticplugins.p7645cd;

import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.cd.a */
/* compiled from: PG */
public final /* synthetic */ class C97534a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C97540e f272443a;

    /* renamed from: b */
    public final /* synthetic */ String f272444b;

    public /* synthetic */ C97534a(C97540e eVar, String str) {
        this.f272443a = eVar;
        this.f272444b = str;
    }

    public final C60870cx apply(Object obj) {
        C97540e eVar = this.f272443a;
        String str = this.f272444b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92899h(new RuntimeException("XmsNotification: Cannot find notification in notification cache. Can't reply."));
        }
        return eVar.mo78570m((BundledMessageNotification) axVar.mo56107c(), str);
    }
}

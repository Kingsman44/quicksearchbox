package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.notifications.p2305m.C30054a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.ah */
/* compiled from: PG */
public final class C97665ah {

    /* renamed from: a */
    public static final C59071e f272753a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.ah");

    /* renamed from: b */
    public final C30054a f272754b;

    /* renamed from: c */
    private final Executor f272755c;

    public C97665ah(C90851k kVar, C30054a aVar) {
        this.f272755c = kVar.mo85208a("NotificationRemovalExecutor");
        this.f272754b = aVar;
    }

    /* renamed from: a */
    public final void mo90784a(String str, List list, C58833ax axVar) {
        if (!list.isEmpty()) {
            this.f272755c.execute(new C97664ag(this, str, list, axVar));
        }
    }
}

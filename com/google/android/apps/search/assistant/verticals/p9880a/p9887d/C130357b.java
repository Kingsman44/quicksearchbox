package com.google.android.apps.search.assistant.verticals.p9880a.p9887d;

import android.app.DirectAction;
import android.content.ComponentName;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9886b.C130352d;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.d.b */
/* compiled from: PG */
final class C130357b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f357271a;

    /* renamed from: b */
    final /* synthetic */ C130358c f357272b;

    public C130357b(C130358c cVar, String str) {
        this.f357272b = cVar;
        this.f357271a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f357272b.f357273a.mo5439d(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C130352d.m212807d((DirectAction) guVar.get(i)).ifPresent(new C130356a(this, this.f357271a));
        }
        for (Map.Entry entry : this.f357272b.f357276d.entrySet()) {
            if (((ComponentName) entry.getValue()).getPackageName().equals(this.f357272b.f357274b) && ((ComponentName) entry.getValue()).getClassName().equals(this.f357272b.f357275c)) {
                this.f357272b.f357273a.mo5437b((String) entry.getKey());
            }
        }
    }
}

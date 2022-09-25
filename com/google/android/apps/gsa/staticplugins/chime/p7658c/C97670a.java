package com.google.android.apps.gsa.staticplugins.chime.p7658c;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.chime.C97735q;
import com.google.android.libraries.notifications.data.C29824o;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2293h.C30011d;
import com.google.android.libraries.notifications.p2293h.C30012e;
import com.google.common.p4522b.C58485gu;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56973i;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.c.a */
/* compiled from: PG */
public final class C97670a implements C30012e {

    /* renamed from: a */
    private final Map f272761a;

    public C97670a(Map map) {
        this.f272761a = map;
    }

    /* renamed from: e */
    private final C30011d m161912e(C29827r rVar, C56975k kVar) {
        C97671b bVar = (C97671b) this.f272761a.get(C56973i.m88245a(kVar.f152093b));
        if (bVar == null) {
            return C30011d.m55652e();
        }
        Intent a = bVar.mo90789a(rVar, kVar);
        if (a.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", -1) == -1) {
            a.putExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 1);
        }
        return C30011d.m55651d(C58485gu.m89846n(a));
    }

    /* renamed from: a */
    public final C30011d mo35327a(C29827r rVar, C29824o oVar) {
        C56975k kVar = C97735q.m162006c(oVar).f152117b;
        if (kVar == null) {
            kVar = C56975k.f152090f;
        }
        return m161912e(rVar, kVar);
    }

    /* renamed from: b */
    public final C30011d mo35328b(List list) {
        C29827r rVar = (C29827r) list.get(0);
        C56975k kVar = C97735q.m162005b(rVar).f152042e;
        if (kVar == null) {
            kVar = C56975k.f152090f;
        }
        return m161912e(rVar, kVar);
    }

    /* renamed from: c */
    public final /* synthetic */ Bundle mo35329c() {
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ Bundle mo35330d() {
        return null;
    }
}

package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.p9387a.C124520a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124692dd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.w */
/* compiled from: PG */
public final /* synthetic */ class C124595w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124571aq f343707a;

    /* renamed from: b */
    public final /* synthetic */ C124692dd f343708b;

    /* renamed from: c */
    public final /* synthetic */ String f343709c;

    public /* synthetic */ C124595w(C124571aq aqVar, C124692dd ddVar, String str) {
        this.f343707a = aqVar;
        this.f343708b = ddVar;
        this.f343709c = str;
    }

    public final C60870cx apply(Object obj) {
        C124571aq aqVar = this.f343707a;
        C124692dd ddVar = this.f343708b;
        String str = this.f343709c;
        C124570ap apVar = (C124570ap) obj;
        C124548d a = apVar.mo106534a();
        boolean z = ddVar.f344003f;
        if (a.mo106485Z() || (z && (a.mo106512j() == C124715m.FULLY_CONNECTED || a.mo106512j() == C124715m.GATT_CONNECTED))) {
            return C60856cj.m92900i(apVar);
        }
        String b = apVar.mo106535b();
        C124520a aVar = aqVar.f343669k;
        String str2 = ddVar.f344001d;
        byte[] N = ddVar.f344002e.mo59174N();
        Intent intent = new Intent("action_perform_initial_gacs_connection");
        intent.putExtra("extra_device", aVar.f343590b.getAdapter().getRemoteDevice(str));
        intent.putExtra("device_model_id", str2);
        intent.putExtra("gacs_device_encryption_key", N);
        intent.putExtra("account_name", b);
        C124520a.m203976b(intent);
        C124519a.m203974a(aVar.f343589a, intent);
        C60870cx q = aqVar.f343665g.mo83411q(str, C124593u.f343705a, aqVar.f343664f);
        C124594v vVar = new C124594v(b);
        return C60922j.m93044g(q, C47810es.m84963c(vVar), C60826bg.f164896a);
    }
}

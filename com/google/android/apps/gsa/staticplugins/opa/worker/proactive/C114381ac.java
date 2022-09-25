package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C1806aw;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109458d;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ac */
/* compiled from: PG */
public final /* synthetic */ class C114381ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f317126a;

    /* renamed from: b */
    public final /* synthetic */ C84370p f317127b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f317128c;

    /* renamed from: d */
    public final /* synthetic */ int f317129d;

    public /* synthetic */ C114381ac(Intent intent, C84370p pVar, byte[] bArr, int i) {
        this.f317126a = intent;
        this.f317127b = pVar;
        this.f317128c = bArr;
        this.f317129d = i;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f317126a;
        C84370p pVar = this.f317127b;
        byte[] bArr = this.f317128c;
        int i = this.f317129d;
        C114417bi biVar = (C114417bi) obj;
        Bundle b = C1806aw.m4968b(intent);
        if (b == null) {
            C59104x c = C114384af.f317139a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotificationActions");
            ((C59052c) ((C59052c) c).mo56372aa(28966)).mo56386p("Failed to get the remote input from notification intent of inline input button.");
            return C118826c.f331422a;
        }
        pVar.mo77919a(C109458d.m182155c(bArr, i, biVar.f317254b, C58833ax.m90834k(b.getCharSequence("remote_input_key").toString())));
        return C118826c.f331422a;
    }
}

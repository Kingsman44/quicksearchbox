package com.google.android.apps.gsa.shared.bisto.p7029b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.C1806aw;
import androidx.core.app.C1811ba;
import androidx.core.app.C1832s;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.c */
/* compiled from: PG */
public final class C89632c {

    /* renamed from: a */
    private static final C59071e f242709a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.b.c");

    /* renamed from: a */
    public static boolean m145883a(C1832s sVar) {
        C1811ba[] baVarArr = sVar.f5655b;
        if (baVarArr != null) {
            for (C1811ba baVar : baVarArr) {
                if (baVar.f5639d) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m145884b(Context context, C1832s sVar, String str, C89631b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        C1811ba[] baVarArr = sVar.f5655b;
        if (baVarArr != null) {
            Collections.addAll(arrayList, baVarArr);
        }
        Bundle bundle = new Bundle();
        new Bundle();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1811ba baVar = (C1811ba) arrayList.get(i);
            if (baVar.f5639d && str != null) {
                bundle.putCharSequence(baVar.f5636a, str);
            }
        }
        C1806aw.m4969c(C1811ba.m4980a((C1811ba[]) arrayList.toArray(new C1811ba[arrayList.size()])), intent, bundle);
        try {
            sVar.f5662i.send(context, 0, intent, new C89630a(bVar), (Handler) null);
        } catch (PendingIntent.CanceledException e) {
            C59104x c = f242709a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ActionHandlingUtil");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10502)).mo56386p("Exception executing action");
            bVar.mo76702b();
        }
    }

    /* renamed from: c */
    public static void m145885c(C1832s sVar) {
        C1811ba[] baVarArr = sVar.f5655b;
        if (baVarArr != null) {
            for (C1811ba baVar : baVarArr) {
            }
        }
    }
}

package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3825an.p3830c.p3831a.C49263ai;
import com.google.assistant.p3861at.C49870ca;
import com.google.assistant.p3861at.C50355u;
import com.google.assistant.p3861at.act;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.a */
/* compiled from: PG */
public final /* synthetic */ class C10313a implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C10313a f34959a = new C10313a();

    private /* synthetic */ C10313a() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C49870ca caVar;
        C50355u uVar = ((act) obj).f128882I;
        if (uVar == null) {
            uVar = C50355u.f131056c;
        }
        if (uVar.f131058a == 5) {
            caVar = (C49870ca) uVar.f131059b;
        } else {
            caVar = C49870ca.f129588c;
        }
        if (caVar.f129590a) {
            return DataType$UpdateResult.m25245e(C63088z.f170246b);
        }
        int b = C49263ai.m85396b(caVar.f129591b);
        if (b == 0) {
            b = 2;
        }
        return DataType$UpdateResult.m25246f(b);
    }
}

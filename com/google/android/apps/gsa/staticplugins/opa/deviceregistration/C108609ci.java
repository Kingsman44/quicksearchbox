package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p7195y.C91188at;
import com.google.assistant.p3861at.C50305sd;
import com.google.assistant.p3861at.C50307sf;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ci */
/* compiled from: PG */
public final /* synthetic */ class C108609ci implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C108617cq f302126a;

    public /* synthetic */ C108609ci(C108617cq cqVar) {
        this.f302126a = cqVar;
    }

    public final C60870cx apply(Object obj) {
        C108617cq cqVar = this.f302126a;
        act act = (act) obj;
        C50307sf sfVar = act.f128897d;
        if (sfVar == null) {
            sfVar = C50307sf.f130929e;
        }
        String str = sfVar.f130933c;
        ArrayList arrayList = new ArrayList();
        C50307sf sfVar2 = act.f128897d;
        if (sfVar2 == null) {
            sfVar2 = C50307sf.f130929e;
        }
        for (C50305sd sdVar : sfVar2.f130932b) {
            arrayList.add(C60922j.m93045h(((C91188at) cqVar.f302139d).mo85425m(Uri.parse(sdVar.f130923d), C58836b.f156633a, 7), new C108615co(sdVar, str), C60826bg.f164896a));
        }
        return C60856cj.m92906o(arrayList);
    }
}

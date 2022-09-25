package com.google.android.libraries.p11024al.p11025a;

import android.util.Log;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.reminders.C145779h;
import com.google.android.gms.reminders.model.C145822ab;
import com.google.android.gms.reminders.model.Task;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.al.a.d */
/* compiled from: PG */
public final class C147748d implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C145779h f398692a;

    /* renamed from: b */
    final /* synthetic */ C143851w f398693b;

    public C147748d(C145779h hVar, C143851w wVar) {
        this.f398692a = hVar;
        this.f398693b = wVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        List<Task> list = (List) obj;
        if (list == null || list.isEmpty()) {
            Log.e("CommonRemindersUtils", "No existing reminders found to archive.");
            return C60866ct.f164955a;
        }
        ArrayList arrayList = new ArrayList();
        for (Task abVar : list) {
            C145822ab abVar2 = new C145822ab(abVar);
            abVar2.f394343c = true;
            abVar2.f394346f = false;
            abVar2.f394345e = false;
            arrayList.add(abVar2.mo122169a());
        }
        return C147753i.m240809d(this.f398692a.mo121948a(this.f398693b, arrayList));
    }
}

package com.google.android.apps.gsa.staticplugins.opa.samson.p8438l;

import android.service.notification.StatusBarNotification;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.l.b */
/* compiled from: PG */
public final /* synthetic */ class C110239b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C110248f f307203a;

    /* renamed from: b */
    public final /* synthetic */ List f307204b;

    public /* synthetic */ C110239b(C110248f fVar, List list) {
        this.f307203a = fVar;
        this.f307204b = list;
    }

    public final void run() {
        C110248f fVar = this.f307203a;
        StatusBarNotification statusBarNotification = (StatusBarNotification) this.f307204b.get(0);
        List list = (List) fVar.f307219c.mo3842a();
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            for (int i = 0; i < arrayList.size(); i++) {
                if (((StatusBarNotification) arrayList.get(i)).getGroupKey().equals(statusBarNotification.getGroupKey())) {
                    arrayList.remove(i);
                }
            }
            fVar.f307219c.mo98462n(arrayList);
        }
    }
}

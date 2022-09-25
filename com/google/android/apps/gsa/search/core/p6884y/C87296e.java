package com.google.android.apps.gsa.search.core.p6884y;

import android.text.TextUtils;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23054e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.search.core.y.e */
/* compiled from: PG */
final class C87296e implements C23054e {

    /* renamed from: a */
    final /* synthetic */ String f235765a;

    /* renamed from: b */
    final /* synthetic */ C87379h f235766b;

    public C87296e(C87379h hVar, String str) {
        this.f235766b = hVar;
        this.f235765a = str;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo28489b(C23028x xVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28490c() {
    }

    /* renamed from: g */
    public final void mo28491g() {
        C87379h hVar = this.f235766b;
        String str = this.f235765a;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < hVar.f235956d.size(); i++) {
            if (TextUtils.equals(((C87377g) hVar.f235956d.valueAt(i)).f235951b, str)) {
                arrayList.add(Integer.valueOf(hVar.f235956d.keyAt(i)));
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hVar.f235956d.remove(((Integer) arrayList.get(i2)).intValue());
        }
    }
}

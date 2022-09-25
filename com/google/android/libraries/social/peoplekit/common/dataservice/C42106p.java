package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.p */
/* compiled from: PG */
public final class C42106p {

    /* renamed from: a */
    public static final long f110063a = TimeUnit.HOURS.toMillis(12);

    /* renamed from: d */
    private static final long f110064d = TimeUnit.DAYS.toMillis(14);

    /* renamed from: e */
    private static final C42105o f110065e = new C42105o();

    /* renamed from: b */
    public List f110066b = new ArrayList();

    /* renamed from: c */
    public long f110067c;

    private C42106p() {
    }

    /* renamed from: a */
    public static C42106p m73813a(PeopleKitConfig peopleKitConfig) {
        C42105o oVar = f110065e;
        if (!TextUtils.equals(oVar.f110062b, peopleKitConfig.mo44758c())) {
            oVar.f110061a = new SparseArray();
            oVar.f110062b = peopleKitConfig.mo44758c();
        }
        SparseArray sparseArray = oVar.f110061a;
        int j = peopleKitConfig.mo44765j();
        int i = j - 1;
        if (j != 0) {
            C42106p pVar = (C42106p) sparseArray.get(i);
            if (pVar != null) {
                return pVar;
            }
            C42106p pVar2 = new C42106p();
            SparseArray sparseArray2 = oVar.f110061a;
            int j2 = peopleKitConfig.mo44765j();
            int i2 = j2 - 1;
            if (j2 != 0) {
                sparseArray2.put(i2, pVar2);
                return pVar2;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: b */
    public final List mo44695b() {
        if (mo44696c()) {
            this.f110066b = new ArrayList();
        }
        return this.f110066b;
    }

    /* renamed from: c */
    public final boolean mo44696c() {
        return this.f110066b.isEmpty() || System.currentTimeMillis() - this.f110067c >= f110064d;
    }
}

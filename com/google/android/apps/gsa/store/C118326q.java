package com.google.android.apps.gsa.store;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.store.q */
/* compiled from: PG */
public final class C118326q {
    /* renamed from: a */
    public static final C118327r m196505a(ArrayList arrayList, int i) {
        boolean z = false;
        if (i == 4) {
            if (arrayList.size() == 1) {
                z = true;
            }
            C58838bb.m90883r(z);
        } else if (i == 13) {
            C58838bb.m90883r(arrayList.size() == 2);
            if (((C118336y) arrayList.get(0)).mo103659c() == 6) {
                if (((C118336y) arrayList.get(1)).mo103659c() == 7) {
                    z = true;
                }
                C58838bb.m90883r(z);
            } else if (((C118336y) arrayList.get(0)).mo103659c() == 8) {
                if (((C118336y) arrayList.get(1)).mo103659c() == 9) {
                    z = true;
                }
                C58838bb.m90883r(z);
            } else if (((C118336y) arrayList.get(0)).mo103659c() == 10) {
                if (((C118336y) arrayList.get(1)).mo103659c() == 11) {
                    z = true;
                }
                C58838bb.m90883r(z);
            } else if (((C118336y) arrayList.get(0)).mo103659c() == 4) {
                if (((C118336y) arrayList.get(1)).mo103659c() == 5) {
                    z = true;
                }
                C58838bb.m90883r(z);
            }
        } else if (i == 12) {
            C58838bb.m90883r(arrayList.size() == 2);
            C58838bb.m90883r(((C118336y) arrayList.get(1)).mo103659c() == 17);
            if (((C118327r) arrayList.get(1)).f328454b == 11) {
                z = true;
            }
            C58838bb.m90883r(z);
        } else if (i != 11) {
            C58838bb.m90883r(arrayList.size() == 2);
            if (((C118336y) arrayList.get(0)).mo103659c() == 6) {
                if (((C118336y) arrayList.get(1)).mo103659c() == 19) {
                    z = true;
                }
                C58838bb.m90883r(z);
            } else if (((C118336y) arrayList.get(0)).mo103659c() == 8) {
                if (((C118336y) arrayList.get(1)).mo103659c() == 20) {
                    z = true;
                }
                C58838bb.m90883r(z);
            } else if (((C118336y) arrayList.get(0)).mo103659c() == 10) {
                if (((C118336y) arrayList.get(1)).mo103659c() == 21 || ((C118336y) arrayList.get(1)).mo103659c() == 22) {
                    z = true;
                }
                C58838bb.m90883r(z);
            } else if (((C118336y) arrayList.get(0)).mo103659c() == 4) {
                if (((C118336y) arrayList.get(1)).mo103659c() == 18) {
                    z = true;
                }
                C58838bb.m90883r(z);
            }
        }
        return new C118327r(i, C58485gu.m89842j(arrayList));
    }
}

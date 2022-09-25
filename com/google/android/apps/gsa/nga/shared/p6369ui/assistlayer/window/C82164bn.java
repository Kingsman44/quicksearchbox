package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80712cn;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.bn */
/* compiled from: PG */
public final /* synthetic */ class C82164bn implements C83343ad {

    /* renamed from: a */
    public static final /* synthetic */ C82164bn f224584a = new C82164bn();

    private /* synthetic */ C82164bn() {
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        C82165bo boVar = (C82165bo) obj;
        C82166bp bpVar = (C82166bp) obj2;
        if (((C80712cn) obj3).f221589b) {
            return false;
        }
        C82166bp bpVar2 = C82166bp.FOCUSABLE;
        C82165bo boVar2 = C82165bo.NONE;
        int ordinal = boVar.ordinal();
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2 || bpVar.ordinal() == 0) {
            return true;
        }
        return false;
    }
}

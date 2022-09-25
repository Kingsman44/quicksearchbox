package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.f */
/* compiled from: PG */
final class C101524f implements C58839bc {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        C101527i iVar = (C101527i) obj;
        boolean z = false;
        if (iVar.mo92380b().mo56113h() && ((Boolean) iVar.mo92380b().mo56107c()).booleanValue()) {
            z = true;
        }
        ((C59052c) ((C59052c) C101525g.f283343a.mo56224b()).mo56372aa(20284)).mo56389s("Should retry multi device cloud enrollment (if more retries available): %b", Boolean.valueOf(z));
        return z;
    }
}

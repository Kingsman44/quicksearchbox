package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92367e;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.m */
/* compiled from: PG */
final class C101559m implements C58839bc {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        C92367e eVar = (C92367e) obj;
        boolean z = true;
        if ((!eVar.mo87013e().mo56113h() || ((Boolean) eVar.mo87013e().mo56107c()).booleanValue()) && (!eVar.mo87012d().mo56113h() || ((String) eVar.mo87012d().mo56107c()).isEmpty())) {
            z = false;
        }
        ((C59052c) ((C59052c) C101560n.f283404a.mo56224b()).mo56372aa(20334)).mo56389s("authTokenCheckPredicate should retry is %b", Boolean.valueOf(z));
        return z;
    }
}

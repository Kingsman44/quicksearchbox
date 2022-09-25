package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C50133lu;
import com.google.assistant.p3861at.C50155mp;
import com.google.assistant.p3861at.C50157mr;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.s */
/* compiled from: PG */
public final /* synthetic */ class C96433s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C96439y f269777a;

    /* renamed from: b */
    public final /* synthetic */ String f269778b;

    public /* synthetic */ C96433s(C96439y yVar, String str) {
        this.f269777a = yVar;
        this.f269778b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String e;
        C96439y yVar = this.f269777a;
        String str = this.f269778b;
        C96438x xVar = new C96438x();
        C50157mr mrVar = ((act) obj).f128883J;
        if (mrVar == null) {
            mrVar = C50157mr.f130395b;
        }
        for (C50155mp mpVar : mrVar.f130397a) {
            int i = mpVar.f130393c;
            char c = 2;
            if (i != 0) {
                c = i != 1 ? i != 2 ? i != 3 ? (char) 0 : 5 : 4 : 3;
            }
            if (c != 0 && c == 4) {
                xVar.f269789a = true;
                C50133lu luVar = mpVar.f130394d;
                if (luVar == null) {
                    luVar = C50133lu.f130326e;
                }
                if (luVar.f130328a.equals(str)) {
                    xVar.f269790b = true;
                }
            }
            C50133lu luVar2 = mpVar.f130394d;
            if (luVar2 == null) {
                luVar2 = C50133lu.f130326e;
            }
            if (luVar2.f130328a.equals(str)) {
                xVar.f269791c = mpVar.f130392b;
                xVar.f269792d = mpVar.f130391a;
            }
        }
        if (C58837ba.m90859h(xVar.f269791c) && (e = yVar.mo90121e()) != null) {
            xVar.f269791c = e;
        }
        return xVar;
    }
}

package com.google.android.apps.gsa.staticplugins.p7653ch;

import com.google.android.apps.gsa.search.core.C85653bd;
import com.google.common.base.C58817ah;
import com.google.p375ai.p378b.C7661fg;

/* renamed from: com.google.android.apps.gsa.staticplugins.ch.g */
/* compiled from: PG */
public final /* synthetic */ class C97637g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C97641k f272693a;

    /* renamed from: b */
    public final /* synthetic */ String f272694b;

    public /* synthetic */ C97637g(C97641k kVar, String str) {
        this.f272693a = kVar;
        this.f272694b = str;
    }

    public final Object apply(Object obj) {
        C97641k kVar = this.f272693a;
        C7661fg fgVar = (C7661fg) obj;
        int a = ((C85653bd) kVar.f272709f.mo27525b()).mo79164a(this.f272694b);
        if (a == 0) {
            a = 3;
        }
        return Integer.valueOf(a);
    }
}

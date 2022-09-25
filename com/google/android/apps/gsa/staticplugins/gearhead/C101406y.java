package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.y */
/* compiled from: PG */
public final /* synthetic */ class C101406y implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282940a;

    /* renamed from: b */
    public final /* synthetic */ String f282941b;

    /* renamed from: c */
    public final /* synthetic */ C22869e f282942c;

    public /* synthetic */ C101406y(C101325be beVar, String str, C22869e eVar) {
        this.f282940a = beVar;
        this.f282941b = str;
        this.f282942c = eVar;
    }

    public final void run() {
        C101325be beVar = this.f282940a;
        String str = this.f282941b;
        C22869e eVar = this.f282942c;
        if (!beVar.f282749F) {
            ((C58970a) ((C58970a) C101325be.f282743a.mo56225c()).mo56372aa(19997)).mo56389s("Calling %s when car assistant is inactive", str);
        } else {
            eVar.run();
        }
    }
}

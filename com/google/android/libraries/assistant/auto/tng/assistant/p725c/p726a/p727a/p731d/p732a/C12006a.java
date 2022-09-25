package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.p732a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p730c.C12004a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C12006a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C12008c f38531a;

    /* renamed from: b */
    public final /* synthetic */ C11989b f38532b;

    public /* synthetic */ C12006a(C12008c cVar, C11989b bVar) {
        this.f38531a = cVar;
        this.f38532b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C12008c cVar = this.f38531a;
        if (cVar.f38536c.mo20360a(this.f38532b).isPresent()) {
            ((C59052c) ((C59052c) C12008c.f38534a.mo56224b()).mo56372aa(43964)).mo56386p("Timeout passed, removing session token from manager.");
            if (cVar.f38537d.isPresent()) {
                ((C12004a) cVar.f38537d.get()).mo20362a();
            }
            cVar.f38535b.mo20352a();
            cVar.mo20365d();
        }
        return C60866ct.f164955a;
    }
}

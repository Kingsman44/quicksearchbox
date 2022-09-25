package com.google.android.libraries.assistant.assistantactions.p621c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.c */
/* compiled from: PG */
public final /* synthetic */ class C11223c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ List f36634a;

    public /* synthetic */ C11223c(List list) {
        this.f36634a = list;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        for (C60870cx cxVar : this.f36634a) {
            if (((C58833ax) C60856cj.m92909r(cxVar)).mo56113h()) {
                return cxVar;
            }
        }
        ((C59052c) ((C59052c) C11227d.f36635a.mo56224b()).mo56372aa(42853)).mo56386p("fallback to server");
        return C60856cj.m92900i(C58836b.f156633a);
    }
}

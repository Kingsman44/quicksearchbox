package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11242c;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11244e;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11245f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.n */
/* compiled from: PG */
public final /* synthetic */ class C11123n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11129t f36458a;

    /* renamed from: b */
    public final /* synthetic */ C11242c f36459b;

    public /* synthetic */ C11123n(C11129t tVar, C11242c cVar) {
        this.f36458a = tVar;
        this.f36459b = cVar;
    }

    public final Object apply(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        C11129t tVar = this.f36458a;
        C11242c cVar = this.f36459b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            tVar.f36472c.mo19641k();
            return C58836b.f156633a;
        }
        String str5 = (String) axVar.mo56107c();
        if (str5 != null) {
            C11244e eVar = (C11244e) cVar;
            eVar.f36656e = str5;
            C58976aa aaVar = C58975e.f156826a;
            String str6 = eVar.f36652a;
            if (str6 != null && (str = eVar.f36653b) != null && (str2 = eVar.f36654c) != null && (str3 = eVar.f36655d) != null && (str4 = eVar.f36656e) != null) {
                return C58833ax.m90834k(new C11245f(str6, str, str2, str3, str4));
            }
            StringBuilder sb = new StringBuilder();
            if (eVar.f36652a == null) {
                sb.append(" sessionId");
            }
            if (eVar.f36653b == null) {
                sb.append(" resolvedContactName");
            }
            if (eVar.f36654c == null) {
                sb.append(" resolvedProvider");
            }
            if (eVar.f36655d == null) {
                sb.append(" resolvedInstanceLabel");
            }
            if (eVar.f36656e == null) {
                sb.append(" resolvedInstance");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null resolvedInstance");
    }
}

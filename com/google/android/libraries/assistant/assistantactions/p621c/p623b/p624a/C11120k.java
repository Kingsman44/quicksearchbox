package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11242c;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11244e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C11120k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11129t f36442a;

    /* renamed from: b */
    public final /* synthetic */ C11242c f36443b;

    /* renamed from: c */
    public final /* synthetic */ String f36444c;

    /* renamed from: d */
    public final /* synthetic */ List f36445d;

    /* renamed from: e */
    public final /* synthetic */ String f36446e;

    public /* synthetic */ C11120k(C11129t tVar, C11242c cVar, String str, List list, String str2) {
        this.f36442a = tVar;
        this.f36443b = cVar;
        this.f36444c = str;
        this.f36445d = list;
        this.f36446e = str2;
    }

    public final C60870cx apply(Object obj) {
        C11129t tVar = this.f36442a;
        C11242c cVar = this.f36443b;
        String str = this.f36444c;
        List list = this.f36445d;
        String str2 = this.f36446e;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            tVar.f36472c.mo19640j();
            return C60856cj.m92900i(C58836b.f156633a);
        }
        String str3 = (String) axVar.mo56107c();
        if (str3 != null) {
            ((C11244e) cVar).f36653b = str3;
            C58976aa aaVar = C58975e.f156826a;
            return tVar.f36471b.mo19660d(str, tVar.f36473d, str3, list, str2);
        }
        throw new NullPointerException("Null resolvedContactName");
    }
}

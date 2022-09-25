package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C16012ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47425a;

    /* renamed from: b */
    public final /* synthetic */ String f47426b;

    public /* synthetic */ C16012ai(C16027ax axVar, String str) {
        this.f47425a = axVar;
        this.f47426b = str;
    }

    public final C60870cx apply(Object obj) {
        C16027ax axVar = this.f47425a;
        String str = this.f47426b;
        List list = (List) obj;
        if (!list.isEmpty() || str.length() < 2) {
            return C60856cj.m92900i(list);
        }
        C58976aa aaVar = C58975e.f156826a;
        str.substring(0, 2);
        return axVar.f47454e.mo22684d(str.substring(0, 2));
    }
}

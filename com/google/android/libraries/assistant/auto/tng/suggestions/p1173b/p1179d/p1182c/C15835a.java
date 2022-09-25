package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.p1182c;

import com.google.android.apps.auto.p450a.p451a.C8876au;
import com.google.android.apps.auto.p450a.p451a.C8877av;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15803m;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.C15832a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15936f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15944b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.d.c.a */
/* compiled from: PG */
public final class C15835a implements C15832a {

    /* renamed from: a */
    private final C15944b f47075a;

    public C15835a(C15944b bVar) {
        this.f47075a = bVar;
    }

    /* renamed from: a */
    public final C15785a mo22582a() {
        return C15803m.f47033c;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22583b(C58833ax axVar, MessageLite messageLite) {
        int a;
        int a2;
        C8877av avVar = (C8877av) messageLite;
        if (axVar.mo56113h()) {
            int a3 = C8876au.m23504a(((C8877av) axVar.mo56107c()).f30817b);
            if ((a3 != 0 && a3 == 2) || ((a2 = C8876au.m23504a(((C8877av) axVar.mo56107c()).f30817b)) != 0 && a2 == 4)) {
                int i = avVar.f30817b;
                int a4 = C8876au.m23504a(i);
                if (a4 == 0 || a4 == 1 || ((a = C8876au.m23504a(i)) != 0 && a == 3)) {
                    C15944b bVar = this.f47075a;
                    C15924c cVar = C15924c.SUGGESTION_GENERATION;
                    C15936f d = C15938h.m32735d();
                    d.mo22603b(true);
                    d.mo22604c(C15937g.IMMEDIATE_ONEOFF_SUGGESTION_GENERATION);
                    C46459k.m82829b(bVar.mo22621b(cVar, d.mo22602a()), "Failed to trigger PCP fetch.", new Object[0]);
                }
            }
        }
    }
}

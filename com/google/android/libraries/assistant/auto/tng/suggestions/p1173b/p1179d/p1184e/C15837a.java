package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.p1184e;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15813w;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.C15832a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15936f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15944b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16366bm;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.d.e.a */
/* compiled from: PG */
public final class C15837a implements C15832a {

    /* renamed from: a */
    private final C15944b f47078a;

    public C15837a(C15944b bVar) {
        this.f47078a = bVar;
    }

    /* renamed from: c */
    private final void m32628c() {
        C15944b bVar = this.f47078a;
        C15924c cVar = C15924c.SUGGESTION_GENERATION;
        C15936f d = C15938h.m32735d();
        d.mo22604c(C15937g.ONEOFF_SUGGESTION_GENERATION);
        C46459k.m82829b(bVar.mo22621b(cVar, d.mo22602a()), "Failed to trigger generation.", new Object[0]);
    }

    /* renamed from: a */
    public final C15785a mo22582a() {
        return C15813w.f47040c;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22583b(C58833ax axVar, MessageLite messageLite) {
        C16366bm bmVar = (C16366bm) messageLite;
        C16366bm bmVar2 = (C16366bm) axVar.mo56109e(C16366bm.f48176c);
        boolean z = bmVar2.f48178a;
        boolean z2 = bmVar.f48178a;
        if (z == z2 || !z2) {
            boolean z3 = bmVar2.f48179b;
            boolean z4 = bmVar.f48179b;
            if (z3 != z4 && z4) {
                m32628c();
                return;
            }
            return;
        }
        m32628c();
    }
}

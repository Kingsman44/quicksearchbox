package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.p1180a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15799i;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.C15832a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15936f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15944b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16389y;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3994s.p3995a.C53090b;
import com.google.common.base.C58833ax;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.d.a.a */
/* compiled from: PG */
public final class C15833a implements C15832a {

    /* renamed from: a */
    private final C15944b f47071a;

    public C15833a(C15944b bVar) {
        this.f47071a = bVar;
    }

    /* renamed from: a */
    public final C15785a mo22582a() {
        return C15799i.f47030a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22583b(C58833ax axVar, MessageLite messageLite) {
        C53090b bVar = (C53090b) messageLite;
        C16389y a = C16389y.m33345a(((C53090b) axVar.mo56109e(C53090b.f139119c)).f139122b);
        if (a == null) {
            a = C16389y.DRIVE_STATUS_UNKNOWN;
        }
        C16389y a2 = C16389y.m33345a(bVar.f139122b);
        if (a2 == null) {
            a2 = C16389y.DRIVE_STATUS_UNKNOWN;
        }
        if (!a.equals(a2)) {
            C15944b bVar2 = this.f47071a;
            C15924c cVar = C15924c.SUGGESTION_GENERATION;
            C15936f d = C15938h.m32735d();
            d.mo22604c(C15937g.ONEOFF_SUGGESTION_GENERATION);
            C46459k.m82829b(bVar2.mo22621b(cVar, d.mo22602a()), "Failed to trigger generation.", new Object[0]);
        }
    }
}

package com.google.android.libraries.assistant.auto.tng.p1101o.p1110c.p1111a;

import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.search.p2871b.C37251i;
import com.google.android.libraries.search.p2871b.C37266j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.c.a.d */
/* compiled from: PG */
public final class C15502d {

    /* renamed from: a */
    private final C37266j f46460a;

    public C15502d(C37266j jVar) {
        this.f46460a = jVar;
    }

    /* renamed from: b */
    private final void m32241b(C15488n nVar, Intent intent, String str) {
        byte[] byteArrayExtra;
        if (intent.hasExtra(str) && (byteArrayExtra = intent.getByteArrayExtra(str)) != null) {
            try {
                C37251i a = this.f46460a.mo40826a();
                a.mo40775c(byteArrayExtra);
                a.mo40689a(nVar);
            } catch (C62974ct unused) {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }

    /* renamed from: a */
    public final void mo22369a(C15488n nVar, Intent intent) {
        if (!intent.getBooleanExtra("start_event_already_logged", false)) {
            m32241b(nVar, intent, "assistant_auto_start_event_extra");
        }
        m32241b(nVar, intent, "assistant_auto_additional_events_extra");
    }
}

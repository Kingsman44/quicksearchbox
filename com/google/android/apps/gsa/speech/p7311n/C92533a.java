package com.google.android.apps.gsa.speech.p7311n;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;

/* renamed from: com.google.android.apps.gsa.speech.n.a */
/* compiled from: PG */
public final class C92533a {

    /* renamed from: a */
    private final SharedPreferences f258232a;

    /* renamed from: b */
    private final C89994f f258233b;

    public C92533a(SharedPreferences sharedPreferences, C89994f fVar) {
        this.f258232a = sharedPreferences;
        this.f258233b = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo87307a(int i) {
        mo87308b(i, EventForDump.m147675d(30));
    }

    /* renamed from: b */
    public final void mo87308b(int i, EventForDump eventForDump) {
        this.f258232a.edit().remove("performIncompleteMigration").apply();
        if (i - 1 != 0) {
            this.f258233b.mo83903aw(2, eventForDump);
            return;
        }
        if (this.f258233b.mo83823l()) {
            C89994f fVar = this.f258233b;
            if (!fVar.mo83847J(fVar.mo83882ab())) {
                this.f258233b.mo83903aw(4, eventForDump);
                return;
            }
        }
        this.f258233b.mo83903aw(1, eventForDump);
    }

    /* renamed from: c */
    public final int mo87309c() {
        if (this.f258233b.mo83855R() == 0 && this.f258232a.contains("performIncompleteMigration")) {
            return this.f258232a.getBoolean("performIncompleteMigration", false) ? 2 : 3;
        }
        int R = this.f258233b.mo83855R();
        if (R != 1) {
            if (R == 2) {
                return 3;
            }
            if (R != 4) {
                return 1;
            }
        }
        return 2;
    }
}

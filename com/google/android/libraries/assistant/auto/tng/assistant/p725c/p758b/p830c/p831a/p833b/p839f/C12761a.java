package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p839f;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.f.a */
/* compiled from: PG */
public final class C12761a extends C12766c {

    /* renamed from: a */
    public Optional f39914a = Optional.empty();

    /* renamed from: b */
    private C12093d f39915b;

    /* renamed from: c */
    private C12865i f39916c;

    /* renamed from: d */
    private C12991i f39917d;

    /* renamed from: a */
    public final C12770d mo20774a() {
        C12865i iVar;
        C12991i iVar2;
        C12093d dVar = this.f39915b;
        if (dVar != null && (iVar = this.f39916c) != null && (iVar2 = this.f39917d) != null) {
            return new C12763b(dVar, iVar, iVar2, this.f39914a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f39915b == null) {
            sb.append(" audioClient");
        }
        if (this.f39916c == null) {
            sb.append(" conversationDeltaStateUpdater");
        }
        if (this.f39917d == null) {
            sb.append(" assistantRequestConfig");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo20775b(C12991i iVar) {
        if (iVar != null) {
            this.f39917d = iVar;
            return;
        }
        throw new NullPointerException("Null assistantRequestConfig");
    }

    /* renamed from: c */
    public final void mo20776c(C12093d dVar) {
        if (dVar != null) {
            this.f39915b = dVar;
            return;
        }
        throw new NullPointerException("Null audioClient");
    }

    /* renamed from: d */
    public final void mo20777d(C12865i iVar) {
        if (iVar != null) {
            this.f39916c = iVar;
            return;
        }
        throw new NullPointerException("Null conversationDeltaStateUpdater");
    }
}

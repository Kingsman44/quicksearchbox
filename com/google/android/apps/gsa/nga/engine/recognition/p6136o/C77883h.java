package com.google.android.apps.gsa.nga.engine.recognition.p6136o;

import com.google.android.apps.gsa.nga.engine.recognition.C77562ao;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.speech.p5218j.C67033io;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.o.h */
/* compiled from: PG */
public final class C77883h {

    /* renamed from: a */
    public static final C58974d f214539a = C58974d.m91136j();

    /* renamed from: b */
    public final C91142g f214540b;

    /* renamed from: c */
    public final C81252aq f214541c;

    public C77883h(C91142g gVar, C81252aq aqVar) {
        this.f214540b = gVar;
        this.f214541c = aqVar;
    }

    /* renamed from: a */
    public final boolean mo72855a(C77562ao aoVar, C90102f fVar) {
        C77562ao aoVar2;
        if (aoVar == C77562ao.UNKNOWN) {
            return true;
        }
        C67033io a = C67033io.m97411a((int) this.f214540b.mo85399d(fVar));
        if (a == null) {
            aoVar2 = C77562ao.UNKNOWN;
        } else {
            aoVar2 = C77562ao.m124448a(a);
        }
        if (aoVar.ordinal() >= aoVar2.ordinal()) {
            return true;
        }
        return false;
    }
}

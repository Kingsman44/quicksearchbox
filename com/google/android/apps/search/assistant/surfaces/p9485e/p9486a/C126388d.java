package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.protobuf.C62940bt;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5109b.p5110a.C65568e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.d */
/* compiled from: PG */
public final class C126388d extends Exception implements C34820a {

    /* renamed from: a */
    private final C37348am f348117a;

    public C126388d(C37348am amVar, String str) {
        super(str, (Throwable) null);
        this.f348117a = amVar;
    }

    /* renamed from: a */
    public final C34819a mo23265a() {
        C62940bt btVar = C65568e.f178177c;
        C37344ai a = C37344ai.m66353a(this.f348117a.f99208b);
        if (a == null) {
            a = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        return C34819a.m63580c(btVar, a);
    }
}

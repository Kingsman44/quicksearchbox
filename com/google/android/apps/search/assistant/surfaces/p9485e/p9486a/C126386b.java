package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.protobuf.C62940bt;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5109b.p5110a.C65568e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.b */
/* compiled from: PG */
public final class C126386b extends Exception implements C34820a {

    /* renamed from: a */
    private final C37338ac f348115a;

    public C126386b(C37338ac acVar, String str) {
        super(str, (Throwable) null);
        this.f348115a = acVar;
    }

    /* renamed from: a */
    public final C34819a mo23265a() {
        C62940bt btVar = C65568e.f178176b;
        C37341af a = C37341af.m66350a(this.f348115a.f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        return C34819a.m63580c(btVar, a);
    }
}

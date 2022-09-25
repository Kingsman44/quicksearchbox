package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.android.libraries.search.p2904c.p2952o.p2959e.C37935b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.speech.audio.ac */
/* compiled from: PG */
public final class C92157ac {

    /* renamed from: a */
    private static final C59071e f256930a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.ac");

    /* renamed from: b */
    private final C90758bb f256931b;

    /* renamed from: c */
    private float f256932c = 75.0f;

    /* renamed from: d */
    private boolean f256933d;

    public C92157ac(C90758bb bbVar) {
        this.f256931b = bbVar;
    }

    /* renamed from: a */
    public final void mo86832a(byte[] bArr, int i, int i2) {
        float b = C37935b.m66964b(bArr, i, i2);
        if (!this.f256933d && b == 0.0f) {
            ((C59052c) ((C59052c) f256930a.mo56226d()).mo56372aa(12089)).mo56386p("Really low audio levels detected. The audio input may have issues.");
            this.f256933d = true;
        }
        float a = C37935b.m66963a(this.f256932c, b);
        this.f256932c = a;
        int c = C37935b.m66965c(a, b);
        if (c < 30) {
            c = 0;
        }
        this.f256931b.mo85096c((c / 10) * 10);
    }
}

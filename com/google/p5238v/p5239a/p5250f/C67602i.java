package com.google.p5238v.p5239a.p5250f;

import com.google.p5238v.p5239a.C67910z;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67742dr;

/* renamed from: com.google.v.a.f.i */
/* compiled from: PG */
final class C67602i extends C67910z {

    /* renamed from: a */
    private final String f183540a;

    /* renamed from: b */
    private final C67742dr f183541b;

    public C67602i(String str, C67742dr drVar) {
        this.f183540a = str;
        this.f183541b = drVar;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f183540a;
        C67742dr drVar = this.f183541b;
        C67720cw cwVar = C67720cw.UNKNOWN_KEYMATERIAL;
        C67742dr drVar2 = C67742dr.UNKNOWN_PREFIX;
        int ordinal = drVar.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}

package com.google.p4184bj.p4193c.p4195b.p4196a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bj.c.b.a.b */
/* compiled from: PG */
public enum C55914b implements C62957cd {
    UNKNOWN_ASSISTANT_VAA_EMBEDDED_ENTRY_POINT(0),
    VM_OOBE(1),
    VM_POST_OOBE(2),
    VM_RETRAINING(4),
    BLUE_BAR(3),
    BTW(5),
    SRP_VOICE_SEARCH_PROMO(6),
    VOICE_SEARCH_MIC_TAP(7),
    VAA_ANDROID_GO_OOBE(8);
    

    /* renamed from: j */
    public final int f148838j;

    private C55914b(int i) {
        this.f148838j = i;
    }

    /* renamed from: a */
    public static C55914b m87803a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ASSISTANT_VAA_EMBEDDED_ENTRY_POINT;
            case 1:
                return VM_OOBE;
            case 2:
                return VM_POST_OOBE;
            case 3:
                return BLUE_BAR;
            case 4:
                return VM_RETRAINING;
            case 5:
                return BTW;
            case 6:
                return SRP_VOICE_SEARCH_PROMO;
            case 7:
                return VOICE_SEARCH_MIC_TAP;
            case 8:
                return VAA_ANDROID_GO_OOBE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87804b() {
        return C55913a.f148827a;
    }

    public final int getNumber() {
        return this.f148838j;
    }

    public final String toString() {
        return Integer.toString(this.f148838j);
    }
}

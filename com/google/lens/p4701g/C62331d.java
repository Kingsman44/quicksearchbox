package com.google.lens.p4701g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.lens.g.d */
/* compiled from: PG */
public enum C62331d implements C62957cd {
    UNKNOWN(0),
    DEPRECATED_GALLERY_SHOPPING_CASCADE(1),
    STANDALONE_OCR_CASCADE(2),
    SPLIT_OCR_CASCADE(3),
    HINT_CASCADE(4),
    HINT_WITH_RECONCILIATION_CASCADE(15),
    HINT_WITH_REGION_CASCADE(17),
    PROACTIVE_MOBILE_RAID_CASCADE(5),
    PRIME_CASCADE_M2(6),
    PROACTIVE_CASCADE_SHOPPING_INTENT(7),
    TRANSLATE_OCR_CASCADE(8),
    TRANSLATE_OCR_PAGE_LAYOUT_CASCADE(12),
    TRANSLATE_FULL_CASCADE(9),
    TRANSLATE_FULL_PAGE_LAYOUT_CASCADE(14),
    PAGE_LAYOUT_CASCADE(10),
    PARALLEL_PAGE_LAYOUT_CASCADE(19),
    EMBEDDING_CASCADE(11),
    TRANSLATE_TEXT_CASCADE(13),
    VISUAL_SHOPPING_INTENT_CASCADE(16),
    GANSLATE_CASCADE(18),
    AVS_GLEAM_GENERATION_CASCADE(20);
    

    /* renamed from: v */
    public final int f168273v;

    private C62331d(int i) {
        this.f168273v = i;
    }

    /* renamed from: a */
    public static C62331d m94767a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DEPRECATED_GALLERY_SHOPPING_CASCADE;
            case 2:
                return STANDALONE_OCR_CASCADE;
            case 3:
                return SPLIT_OCR_CASCADE;
            case 4:
                return HINT_CASCADE;
            case 5:
                return PROACTIVE_MOBILE_RAID_CASCADE;
            case 6:
                return PRIME_CASCADE_M2;
            case 7:
                return PROACTIVE_CASCADE_SHOPPING_INTENT;
            case 8:
                return TRANSLATE_OCR_CASCADE;
            case 9:
                return TRANSLATE_FULL_CASCADE;
            case 10:
                return PAGE_LAYOUT_CASCADE;
            case 11:
                return EMBEDDING_CASCADE;
            case 12:
                return TRANSLATE_OCR_PAGE_LAYOUT_CASCADE;
            case 13:
                return TRANSLATE_TEXT_CASCADE;
            case 14:
                return TRANSLATE_FULL_PAGE_LAYOUT_CASCADE;
            case 15:
                return HINT_WITH_RECONCILIATION_CASCADE;
            case 16:
                return VISUAL_SHOPPING_INTENT_CASCADE;
            case 17:
                return HINT_WITH_REGION_CASCADE;
            case 18:
                return GANSLATE_CASCADE;
            case 19:
                return PARALLEL_PAGE_LAYOUT_CASCADE;
            case 20:
                return AVS_GLEAM_GENERATION_CASCADE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m94768b() {
        return C62304c.f168196a;
    }

    public final int getNumber() {
        return this.f168273v;
    }

    public final String toString() {
        return Integer.toString(this.f168273v);
    }
}

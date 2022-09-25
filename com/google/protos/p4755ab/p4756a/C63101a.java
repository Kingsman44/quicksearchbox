package com.google.protos.p4755ab.p4756a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.protos.ab.a.a */
/* compiled from: PG */
public enum C63101a implements C62957cd {
    THUMBNAIL_TYPE_DEFAULT(0),
    THUMBNAIL_TYPE_AREA_50K(1),
    THUMBNAIL_TYPE_400(2),
    THUMBNAIL_TYPE_800(3),
    THUMBNAIL_TYPE_ORIGINAL(4),
    THUMBNAIL_TYPE_ORIGINAL_HQ(5),
    THUMBNAIL_TYPE_FAVICON_16(6),
    THUMBNAIL_TYPE_FAVICON_32(7),
    THUMBNAIL_TYPE_FAVICON_64(13),
    THUMBNAIL_TYPE_FAVICON_ORIGINAL(14),
    THUMBNAIL_TYPE_FAVICON_16_DARK(32),
    THUMBNAIL_TYPE_FAVICON_32_DARK(33),
    THUMBNAIL_TYPE_FAVICON_64_DARK(34),
    THUMBNAIL_TYPE_FAVICON_ORIGINAL_DARK(35),
    THUMBNAIL_TYPE_1080(8),
    THUMBNAIL_TYPE_1600_HQ(9),
    THUMBNAIL_TYPE_AREA_300K(10),
    THUMBNAIL_TYPE_AREA_50K_ALPHA(11),
    THUMBNAIL_TYPE_AREA_50K_SYNTHETIC_ALPHA(12),
    THUMBNAIL_TYPE_AREA_2M(15),
    THUMBNAIL_TYPE_AREA_2M_METADATA(37),
    THUMBNAIL_TYPE_800_ALPHA_WHITE(16),
    THUMBNAIL_TYPE_ORIGINAL_ALPHA_WHITE(17),
    THUMBNAIL_TYPE_ANIMATED_H144(18),
    THUMBNAIL_TYPE_ORIGINAL_HQ_LICENSED(19),
    THUMBNAIL_TYPE_TENOR_250K_GIF(20),
    THUMBNAIL_TYPE_TENOR_100K_OPTIMIZED_GIF(21),
    THUMBNAIL_TYPE_TENOR_30K_OPTIMIZED_THUMBNAIL_GIF(22),
    THUMBNAIL_TYPE_TENOR_45K_OPTIMIZED_90P_GIF(23),
    THUMBNAIL_TYPE_TENOR_50K_OPTIMIZED_100P_GIF(24),
    THUMBNAIL_TYPE_TENOR_100K_OPTIMIZED_200P_GIF(25),
    THUMBNAIL_TYPE_TENOR_50K_OPTIMIZED_100W_GIF(26),
    THUMBNAIL_TYPE_TENOR_100K_OPTIMIZED_200W_GIF(27),
    THUMBNAIL_TYPE_TENOR_45K_PREVIEW_GIF(28),
    THUMBNAIL_TYPE_TENOR_250K_MEDIUM_GIF(29),
    THUMBNAIL_TYPE_AREA_2M_WEBP(30),
    THUMBNAIL_TYPE_AREA_2M_WEBP_METADATA(39),
    THUMBNAIL_TYPE_AREA_2M_AVIF(31),
    THUMBNAIL_TYPE_AREA_2M_AVIF_METADATA(38),
    THUMBNAIL_TYPE_AREA_50K_WEBP(36),
    THUMBNAIL_TYPE_AREA_50K_AVIF(40),
    THUMBNAIL_TYPE_ORIGINAL_HQ_KG(41);
    

    /* renamed from: Q */
    private final int f170331Q;

    private C63101a(int i) {
        this.f170331Q = i;
    }

    /* renamed from: a */
    public static C63101a m96179a(int i) {
        switch (i) {
            case 0:
                return THUMBNAIL_TYPE_DEFAULT;
            case 1:
                return THUMBNAIL_TYPE_AREA_50K;
            case 2:
                return THUMBNAIL_TYPE_400;
            case 3:
                return THUMBNAIL_TYPE_800;
            case 4:
                return THUMBNAIL_TYPE_ORIGINAL;
            case 5:
                return THUMBNAIL_TYPE_ORIGINAL_HQ;
            case 6:
                return THUMBNAIL_TYPE_FAVICON_16;
            case 7:
                return THUMBNAIL_TYPE_FAVICON_32;
            case 8:
                return THUMBNAIL_TYPE_1080;
            case 9:
                return THUMBNAIL_TYPE_1600_HQ;
            case 10:
                return THUMBNAIL_TYPE_AREA_300K;
            case 11:
                return THUMBNAIL_TYPE_AREA_50K_ALPHA;
            case 12:
                return THUMBNAIL_TYPE_AREA_50K_SYNTHETIC_ALPHA;
            case 13:
                return THUMBNAIL_TYPE_FAVICON_64;
            case 14:
                return THUMBNAIL_TYPE_FAVICON_ORIGINAL;
            case 15:
                return THUMBNAIL_TYPE_AREA_2M;
            case 16:
                return THUMBNAIL_TYPE_800_ALPHA_WHITE;
            case 17:
                return THUMBNAIL_TYPE_ORIGINAL_ALPHA_WHITE;
            case 18:
                return THUMBNAIL_TYPE_ANIMATED_H144;
            case 19:
                return THUMBNAIL_TYPE_ORIGINAL_HQ_LICENSED;
            case 20:
                return THUMBNAIL_TYPE_TENOR_250K_GIF;
            case 21:
                return THUMBNAIL_TYPE_TENOR_100K_OPTIMIZED_GIF;
            case 22:
                return THUMBNAIL_TYPE_TENOR_30K_OPTIMIZED_THUMBNAIL_GIF;
            case 23:
                return THUMBNAIL_TYPE_TENOR_45K_OPTIMIZED_90P_GIF;
            case 24:
                return THUMBNAIL_TYPE_TENOR_50K_OPTIMIZED_100P_GIF;
            case 25:
                return THUMBNAIL_TYPE_TENOR_100K_OPTIMIZED_200P_GIF;
            case 26:
                return THUMBNAIL_TYPE_TENOR_50K_OPTIMIZED_100W_GIF;
            case 27:
                return THUMBNAIL_TYPE_TENOR_100K_OPTIMIZED_200W_GIF;
            case 28:
                return THUMBNAIL_TYPE_TENOR_45K_PREVIEW_GIF;
            case 29:
                return THUMBNAIL_TYPE_TENOR_250K_MEDIUM_GIF;
            case 30:
                return THUMBNAIL_TYPE_AREA_2M_WEBP;
            case 31:
                return THUMBNAIL_TYPE_AREA_2M_AVIF;
            case 32:
                return THUMBNAIL_TYPE_FAVICON_16_DARK;
            case 33:
                return THUMBNAIL_TYPE_FAVICON_32_DARK;
            case 34:
                return THUMBNAIL_TYPE_FAVICON_64_DARK;
            case 35:
                return THUMBNAIL_TYPE_FAVICON_ORIGINAL_DARK;
            case 36:
                return THUMBNAIL_TYPE_AREA_50K_WEBP;
            case 37:
                return THUMBNAIL_TYPE_AREA_2M_METADATA;
            case 38:
                return THUMBNAIL_TYPE_AREA_2M_AVIF_METADATA;
            case 39:
                return THUMBNAIL_TYPE_AREA_2M_WEBP_METADATA;
            case 40:
                return THUMBNAIL_TYPE_AREA_50K_AVIF;
            case 41:
                return THUMBNAIL_TYPE_ORIGINAL_HQ_KG;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f170331Q;
    }

    public final String toString() {
        return Integer.toString(this.f170331Q);
    }
}

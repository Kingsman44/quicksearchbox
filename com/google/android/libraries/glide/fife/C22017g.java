package com.google.android.libraries.glide.fife;

import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.p291h.C5632s;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.social.p3267c.p3268a.C41921c;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.libraries.glide.fife.g */
/* compiled from: PG */
public final class C22017g implements C5955n {

    /* renamed from: f */
    public static final /* synthetic */ int f60730f = 0;

    /* renamed from: b */
    public int f60731b;

    /* renamed from: c */
    public final int f60732c = -1;

    /* renamed from: d */
    public final int f60733d = -1;

    /* renamed from: e */
    public final int f60734e = -1;

    /* renamed from: g */
    private int f60735g;

    /* renamed from: h */
    private boolean f60736h;

    /* renamed from: i */
    private Integer f60737i;

    /* renamed from: j */
    private Integer f60738j;

    /* renamed from: k */
    private Integer f60739k;

    /* renamed from: c */
    public static final int m41264c(int i) {
        if (i == Integer.MIN_VALUE) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(21).putInt(this.f60735g).put((byte) 0).putInt(0).putInt(-1).putInt(-1).putInt(-1).array());
    }

    /* renamed from: b */
    public final void mo27321b(int i) {
        this.f60731b |= i;
        this.f60735g = i | this.f60735g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22017g) {
            C22017g gVar = (C22017g) obj;
            if (this.f60735g == gVar.f60735g) {
                boolean z = gVar.f60736h;
                Integer num = gVar.f60737i;
                if (C5632s.m14619l((Object) null, (Object) null)) {
                    int i = gVar.f60732c;
                    int i2 = gVar.f60733d;
                    int i3 = gVar.f60734e;
                    Integer num2 = gVar.f60738j;
                    if (C5632s.m14619l((Object) null, (Object) null)) {
                        Integer num3 = gVar.f60739k;
                        if (C5632s.m14619l((Object) null, (Object) null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return C5632s.m14611d(this.f60735g, C5632s.m14612e((Object) null, C5632s.m14611d(-1, C5632s.m14611d(-1, C5632s.m14611d(-1, C5632s.m14611d(0, 527))))) * 31);
    }

    public final String toString() {
        int i = this.f60731b;
        String str = (i & 16) != 0 ? "kill_animation " : BuildConfig.FLAVOR;
        String str2 = (i & 4) != 0 ? "no_overlay " : BuildConfig.FLAVOR;
        String str3 = (i & 8192) != 0 ? "app_domain " : BuildConfig.FLAVOR;
        int i2 = C41921c.f109365a;
        int i3 = this.f60731b;
        String str4 = 1 != (i3 & 1) ? BuildConfig.FLAVOR : "crop ";
        String str5 = (4194304 & i3) != 0 ? "circlecrop " : BuildConfig.FLAVOR;
        String str6 = (i3 & 8) != 0 ? "smartcrop " : BuildConfig.FLAVOR;
        String str7 = (33554432 & i3) != 0 ? "centercrop " : BuildConfig.FLAVOR;
        String str8 = (i3 & 4096) != 0 ? "loose_face_crop " : BuildConfig.FLAVOR;
        String str9 = (i3 & 512) != 0 ? "exif " : BuildConfig.FLAVOR;
        String str10 = (i3 & 2048) != 0 ? "jpeg " : BuildConfig.FLAVOR;
        String str11 = (i3 & 32) != 0 ? "webp " : BuildConfig.FLAVOR;
        String str12 = (i3 & 16384) != 0 ? "webp_animation " : BuildConfig.FLAVOR;
        String str13 = (32768 & i3) != 0 ? "blur " : BuildConfig.FLAVOR;
        String str14 = (i3 & C89885b.S3REQUEST_VALUE) != 0 ? "mp4 " : BuildConfig.FLAVOR;
        String str15 = (i3 & 65536) != 0 ? "loop " : BuildConfig.FLAVOR;
        String str16 = (i3 & C89885b.HTTP_VALUE) != 0 ? "no_silhouette " : BuildConfig.FLAVOR;
        String str17 = (i3 & 524288) != 0 ? "monogram " : BuildConfig.FLAVOR;
        String str18 = (i3 & 64) != 0 ? "no_upscale " : BuildConfig.FLAVOR;
        String str19 = (i3 & 8388608) != 0 ? "no_google_metadata " : BuildConfig.FLAVOR;
        String str20 = (i3 & 16777216) != 0 ? "google_metadata " : BuildConfig.FLAVOR;
        String str21 = (i3 & 256) != 0 ? "soften-1,null,null " : BuildConfig.FLAVOR;
        return "FifeUrlOptions{ " + str + str2 + str3 + str4 + str5 + str6 + str7 + str8 + str9 + str10 + BuildConfig.FLAVOR + str11 + str12 + str13 + str14 + str15 + str16 + str17 + str18 + str19 + str20 + BuildConfig.FLAVOR + str21 + " }";
    }
}

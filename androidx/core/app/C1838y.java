package androidx.core.app;

import android.media.AudioAttributes;

/* renamed from: androidx.core.app.y */
/* compiled from: PG */
final class C1838y {
    /* renamed from: a */
    static AudioAttributes.Builder m5032a() {
        return new AudioAttributes.Builder();
    }

    /* renamed from: b */
    static AudioAttributes.Builder m5033b(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    /* renamed from: c */
    static AudioAttributes.Builder m5034c(AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    /* renamed from: d */
    static AudioAttributes.Builder m5035d(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }

    /* renamed from: e */
    static AudioAttributes m5036e(AudioAttributes.Builder builder) {
        return builder.build();
    }
}

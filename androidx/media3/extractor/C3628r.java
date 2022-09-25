package androidx.media3.extractor;

import java.lang.reflect.Constructor;

/* renamed from: androidx.media3.extractor.r */
/* compiled from: PG */
public final /* synthetic */ class C3628r implements C3630t {

    /* renamed from: a */
    public static final /* synthetic */ C3628r f11571a = new C3628r();

    private /* synthetic */ C3628r() {
    }

    /* renamed from: a */
    public final Constructor mo7640a() {
        if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
            return null;
        }
        return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(C3326aa.class).getConstructor(new Class[]{Integer.TYPE});
    }
}

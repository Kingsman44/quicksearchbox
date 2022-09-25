package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import android.content.res.AssetFileDescriptor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public final class AnnotatorModel implements AutoCloseable {

    /* renamed from: a */
    public long f167199a;

    /* renamed from: b */
    public LangIdModel f167200b;

    /* renamed from: c */
    private final AtomicBoolean f167201c = new AtomicBoolean(false);

    /* compiled from: PG */
    public final class AnnotatedSpan {
        AnnotatedSpan(int i, int i2, ClassificationResult[] classificationResultArr) {
        }
    }

    /* compiled from: PG */
    public final class AnnotationOptions {
        public int getAnnotateMode() {
            throw null;
        }

        public int getAnnotationUsecase() {
            throw null;
        }

        public String getDetectedTextLanguageTags() {
            throw null;
        }

        public String[] getEntityTypes() {
            throw null;
        }

        public String getLocale() {
            throw null;
        }

        public long getReferenceTimeMsUtc() {
            throw null;
        }

        public String getReferenceTimezone() {
            throw null;
        }

        public boolean getTriggerDictionaryOnBeginnerWords() {
            throw null;
        }

        public boolean getUsePodNer() {
            throw null;
        }

        public boolean getUseVocabAnnotator() {
            throw null;
        }

        public float getUserLocationAccuracyMeters() {
            throw null;
        }

        public double getUserLocationLat() {
            throw null;
        }

        public double getUserLocationLng() {
            throw null;
        }

        public boolean hasLocationPermission() {
            throw null;
        }

        public boolean hasPersonalizationPermission() {
            throw null;
        }

        public boolean isSerializedEntityDataEnabled() {
            throw null;
        }
    }

    /* compiled from: PG */
    public final class Annotations {
        Annotations(AnnotatedSpan[][] annotatedSpanArr, ClassificationResult[] classificationResultArr) {
        }
    }

    /* compiled from: PG */
    public final class ClassificationOptions {
        public int getAnnotationUsecase() {
            throw null;
        }

        public String getDetectedTextLanguageTags() {
            throw null;
        }

        public boolean getEnableAddContactIntent() {
            throw null;
        }

        public boolean getEnableSearchIntent() {
            throw null;
        }

        public String getLocale() {
            throw null;
        }

        public long getReferenceTimeMsUtc() {
            throw null;
        }

        public String getReferenceTimezone() {
            throw null;
        }

        public boolean getTriggerDictionaryOnBeginnerWords() {
            throw null;
        }

        public boolean getUsePodNer() {
            throw null;
        }

        public boolean getUseVocabAnnotator() {
            throw null;
        }

        public String getUserFamiliarLanguageTags() {
            throw null;
        }

        public float getUserLocationAccuracyMeters() {
            throw null;
        }

        public double getUserLocationLat() {
            throw null;
        }

        public double getUserLocationLng() {
            throw null;
        }
    }

    /* compiled from: PG */
    public final class ClassificationResult {
        public ClassificationResult(String str, float f, DatetimeResult datetimeResult, byte[] bArr, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, NamedVariant[] namedVariantArr, byte[] bArr2, RemoteActionTemplate[] remoteActionTemplateArr, long j, long j2, double d) {
        }
    }

    /* compiled from: PG */
    public final class DatetimeResult {
        public DatetimeResult(long j, int i) {
        }
    }

    /* compiled from: PG */
    public final class InputFragment {
        public float getBoundingBoxHeight() {
            throw null;
        }

        public float getBoundingBoxTop() {
            throw null;
        }

        public long getReferenceTimeMsUtc() {
            throw null;
        }

        public String getReferenceTimezone() {
            throw null;
        }

        public String getText() {
            throw null;
        }

        public boolean hasDatetimeOptions() {
            throw null;
        }
    }

    /* compiled from: PG */
    public final class SelectionOptions {
        public int getAnnotationUsecase() {
            throw null;
        }

        public String getDetectedTextLanguageTags() {
            throw null;
        }

        public String getLocales() {
            throw null;
        }

        public boolean getUsePodNer() {
            throw null;
        }

        public boolean getUseVocabAnnotator() {
            throw null;
        }

        public float getUserLocationAccuracyMeters() {
            throw null;
        }

        public double getUserLocationLat() {
            throw null;
        }

        public double getUserLocationLng() {
            throw null;
        }
    }

    static {
        C61860b.m94501a();
    }

    public AnnotatorModel(AssetFileDescriptor assetFileDescriptor) {
        long nativeNewAnnotatorWithOffset = nativeNewAnnotatorWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        this.f167199a = nativeNewAnnotatorWithOffset;
        if (nativeNewAnnotatorWithOffset == 0) {
            throw new IllegalArgumentException("Couldn't initialize TC from asset file descriptor.");
        }
    }

    /* renamed from: a */
    public static int m94495a(AssetFileDescriptor assetFileDescriptor) {
        return nativeGetVersionWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* renamed from: b */
    public static String m94496b(AssetFileDescriptor assetFileDescriptor) {
        return nativeGetLocalesWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    private native AnnotatedSpan[] nativeAnnotate(long j, String str, AnnotationOptions annotationOptions);

    private native Annotations nativeAnnotateStructuredInput(long j, InputFragment[] inputFragmentArr, AnnotationOptions annotationOptions);

    private native ClassificationResult[] nativeClassifyText(long j, String str, int i, int i2, ClassificationOptions classificationOptions, Object obj, String str2);

    private native void nativeCloseAnnotator(long j);

    private static native String nativeGetLocales(int i);

    private static native String nativeGetLocalesWithOffset(int i, long j, long j2);

    private static native String nativeGetName(int i);

    private static native String nativeGetNameWithOffset(int i, long j, long j2);

    private static native int nativeGetVersion(int i);

    private static native int nativeGetVersionWithOffset(int i, long j, long j2);

    private static native long nativeNewAnnotator(int i);

    private static native long nativeNewAnnotatorFromPath(String str);

    private static native long nativeNewAnnotatorWithOffset(int i, long j, long j2);

    private native int[] nativeSuggestSelection(long j, String str, int i, int i2, SelectionOptions selectionOptions);

    public final void close() {
        if (this.f167201c.compareAndSet(false, true)) {
            nativeCloseAnnotator(this.f167199a);
            this.f167199a = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public native long nativeGetNativeModelPtr(long j);

    public native boolean nativeInitializeContactEngine(long j, byte[] bArr);

    public native boolean nativeInitializeInstalledAppEngine(long j, byte[] bArr);

    public native boolean nativeInitializeKnowledgeEngine(long j, byte[] bArr);

    public native boolean nativeInitializePersonNameEngine(long j, int i, long j2, long j3);

    public native byte[] nativeLookUpKnowledgeEntity(long j, String str);

    public native void nativeSetLangId(long j, long j2);
}

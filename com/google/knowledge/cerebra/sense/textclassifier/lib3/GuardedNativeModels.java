package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import java.io.Closeable;

/* compiled from: PG */
public final class GuardedNativeModels implements Closeable {

    /* renamed from: a */
    private long f167204a = nativeNewGuardedModels();

    static {
        C61860b.m94501a();
    }

    private static native void nativeClose(long j);

    private static native long nativeNewGuardedModels();

    private static native void nativeSetActionsSuggestions(long j, long j2);

    private static native void nativeSetAnnotator(long j, long j2);

    private static native void nativeSetLangId(long j, long j2);

    /* renamed from: a */
    public final synchronized long mo58283a() {
        return this.f167204a;
    }

    /* renamed from: b */
    public final synchronized void mo58284b(ActionsSuggestionsModel actionsSuggestionsModel) {
        long j = this.f167204a;
        long j2 = 0;
        if (j != 0) {
            if (actionsSuggestionsModel != null) {
                j2 = actionsSuggestionsModel.nativeGetNativeModelPtr(actionsSuggestionsModel.f167177a);
            }
            nativeSetActionsSuggestions(j, j2);
        }
    }

    /* renamed from: c */
    public final synchronized void mo58285c(AnnotatorModel annotatorModel) {
        long j = this.f167204a;
        if (j != 0) {
            nativeSetAnnotator(j, annotatorModel.nativeGetNativeModelPtr(annotatorModel.f167199a));
        }
    }

    public final synchronized void close() {
        long j = this.f167204a;
        if (j != 0) {
            nativeClose(j);
            this.f167204a = 0;
        }
    }

    /* renamed from: d */
    public final synchronized void mo58287d(LangIdModel langIdModel) {
        long j = this.f167204a;
        long j2 = 0;
        if (j != 0) {
            if (langIdModel != null) {
                j2 = langIdModel.f167205a;
            }
            nativeSetLangId(j, j2);
        }
    }
}

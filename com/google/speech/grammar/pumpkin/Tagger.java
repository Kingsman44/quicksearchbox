package com.google.speech.grammar.pumpkin;

import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
public class Tagger {

    /* renamed from: a */
    private static final Logger f180887a = Logger.getLogger(Tagger.class.getName());

    /* renamed from: b */
    private long f180888b;

    /* renamed from: c */
    private final Object f180889c = new Object();

    protected Tagger(byte[] bArr) {
        this.f180888b = nativeConstruct(bArr);
    }

    private static native long nativeConstruct(byte[] bArr);

    private static native void nativeDelete(long j);

    private static native byte[] nativeTag(long j, long j2, long j3, String str);

    private static native byte[] nativeTagAndGetNBest(long j, long j2, long j3, String str, int i);

    /* renamed from: a */
    public final C66527s mo59651a(String str, ActionFrame actionFrame, UserValidators userValidators, int i) {
        if (userValidators != null) {
            try {
                return (C66527s) C62942bv.parseFrom((C62942bv) C66527s.f180937b, nativeTagAndGetNBest(this.f180888b, actionFrame.f180883a, userValidators.getNativeUserValidators(), str, i));
            } catch (IOException unused) {
                f180887a.logp(Level.SEVERE, "com.google.speech.grammar.pumpkin.Tagger", "tag", "Couldn't parse PumpkinTaggerResults proto from JNI");
                return null;
            }
        } else {
            throw new NullPointerException("Passed null UserValidators to the Pumpkin Tagger");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.f180889c) {
            long j = this.f180888b;
            if (j != 0) {
                nativeDelete(j);
                this.f180888b = 0;
            }
        }
    }
}

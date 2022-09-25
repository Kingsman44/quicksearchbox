package com.google.speech.recognizer;

import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.recognizer.p5233a.C67431a;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67446ao;
import com.google.speech.recognizer.p5233a.C67453av;
import com.google.speech.recognizer.p5233a.C67454b;
import com.google.speech.recognizer.p5233a.C67458f;
import com.google.speech.recognizer.p5233a.C67464l;
import com.google.speech.recognizer.p5233a.C67466n;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
public abstract class AbstractRecognizer {
    private static final Logger logger = Logger.getLogger(AbstractRecognizer.class.getName());
    private List callbacks = new ArrayList(1);
    private long nativeObj = nativeConstruct();
    private InputStream reader;

    /* renamed from: rm */
    private ResourceManager f183249rm;

    private native int nativeCancel(long j);

    private native long nativeConstruct();

    private native void nativeDelete(long j);

    protected static native void nativeInit();

    private native int nativeInitFromProto(long j, long j2, byte[] bArr);

    private native byte[] nativeRun(long j, byte[] bArr);

    private void validate() {
        if (this.nativeObj == 0) {
            throw new IllegalStateException("recognizer is not initialized");
        }
    }

    public C67446ao addCallback(C67430a aVar) {
        this.callbacks.add(aVar);
        return C67446ao.STATUS_SUCCESS;
    }

    public C67446ao cancel() {
        validate();
        return C67446ao.m97470a(nativeCancel(this.nativeObj));
    }

    public synchronized void delete() {
        long j = this.nativeObj;
        if (j != 0) {
            nativeDelete(j);
            this.nativeObj = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    /* access modifiers changed from: protected */
    public void handleAudioLevelEvent(byte[] bArr) {
        C67458f fVar = (C67458f) C62942bv.parseFrom((C62942bv) C67458f.f183345a, bArr, C62921ba.m95368a());
        for (C67430a f : this.callbacks) {
            f.mo59865f(fVar);
        }
    }

    /* access modifiers changed from: protected */
    public void handleEndpointerEvent(byte[] bArr) {
        C67464l lVar = (C67464l) C62942bv.parseFrom((C62942bv) C67464l.f183356e, bArr, C62921ba.m95368a());
        for (C67430a g : this.callbacks) {
            g.mo59866g(lVar);
        }
    }

    /* access modifiers changed from: protected */
    public void handleHotwordEvent(byte[] bArr) {
        C67466n nVar = (C67466n) C62942bv.parseFrom((C62942bv) C67466n.f183362a, bArr, C62921ba.m95368a());
        for (C67430a d : this.callbacks) {
            d.mo59864d();
        }
    }

    /* access modifiers changed from: protected */
    public void handleRecognitionEvent(byte[] bArr) {
        C67438ag agVar = (C67438ag) C62942bv.parseFrom((C62942bv) C67438ag.f183256k, bArr, C62921ba.m95368a());
        for (C67430a h : this.callbacks) {
            h.mo59867h(agVar);
        }
    }

    public C67446ao initFromProto(byte[] bArr, ResourceManager resourceManager) {
        validate();
        this.f183249rm = resourceManager;
        return C67446ao.m97470a(nativeInitFromProto(this.nativeObj, resourceManager.f183250a, bArr));
    }

    /* access modifiers changed from: protected */
    public int read(byte[] bArr) {
        if (bArr.length != 0) {
            int read = this.reader.read(bArr);
            if (read == -1) {
                return 0;
            }
            return read;
        }
        throw new IOException("illegal zero length buffer");
    }

    public C67454b run(C67453av avVar) {
        validate();
        try {
            return (C67454b) C62942bv.parseFrom((C62942bv) C67454b.f183338d, nativeRun(this.nativeObj, avVar.toByteArray()), C62921ba.m95368a());
        } catch (C62974ct unused) {
            logger.logp(Level.SEVERE, "com.google.speech.recognizer.AbstractRecognizer", "run", "bad protocol buffer from recognizer jni");
            C67431a aVar = (C67431a) C67454b.f183338d.createBuilder();
            C67446ao aoVar = C67446ao.STATUS_RECOGNITION_ERROR;
            aVar.copyOnWrite();
            C67454b bVar = (C67454b) aVar.instance;
            bVar.f183341b = aoVar.f183298f;
            bVar.f183340a |= 1;
            return (C67454b) aVar.build();
        }
    }

    public C67446ao setAudioReader(InputStream inputStream) {
        this.reader = inputStream;
        return C67446ao.STATUS_SUCCESS;
    }
}

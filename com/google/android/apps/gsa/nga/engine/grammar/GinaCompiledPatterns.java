package com.google.android.apps.gsa.nga.engine.grammar;

import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82850ct;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82851cu;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82852cv;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82853cw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.nlp.p4735b.p4736a.p4737a.C62815h;
import com.google.nlp.p4735b.p4736a.p4737a.C62816i;
import com.google.nlp.p4735b.p4736a.p4737a.C62817j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
public final class GinaCompiledPatterns implements C76123a {

    /* renamed from: a */
    public static final C59071e f211062a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.grammar.GinaCompiledPatterns");

    /* renamed from: b */
    public final NativeIntentGenerator f211063b;

    /* compiled from: PG */
    public final class NativeIntentGenerator implements AutoCloseable {

        /* renamed from: a */
        public final ReadWriteLock f211064a = new ReentrantReadWriteLock(false);

        /* renamed from: b */
        public final C83334w f211065b;

        /* renamed from: c */
        public long f211066c;

        public NativeIntentGenerator(C83334w wVar) {
            this.f211065b = wVar;
            this.f211066c = nativeInitialize();
        }

        private native boolean nativeDestroy(long j);

        private native long nativeInitialize();

        public final void close() {
            this.f211064a.writeLock().lock();
            try {
                long j = this.f211066c;
                if (j != 0 && !nativeDestroy(j)) {
                    ((C59052c) ((C59052c) GinaCompiledPatterns.f211062a.mo56225c()).mo56372aa(3903)).mo56386p("Failed to destroy native intent generator.");
                }
                this.f211066c = 0;
            } finally {
                this.f211064a.writeLock().unlock();
            }
        }

        public native byte[] nativeBuildCompiledGrammar(long j, byte[] bArr);

        public native byte[] nativeGenerateGrammarMatches(long j, byte[] bArr);

        public native byte[] nativeGenerateInterpretations(long j, byte[] bArr);
    }

    public GinaCompiledPatterns(C78007b bVar, C83334w wVar) {
        bVar.mo72960b();
        this.f211063b = new NativeIntentGenerator(wVar);
    }

    /* renamed from: a */
    public final C76138p mo72068a(C76134l lVar, C83320io ioVar) {
        NativeIntentGenerator nativeIntentGenerator;
        try {
            nativeIntentGenerator = this.f211063b;
            nativeIntentGenerator.f211064a.readLock().lock();
            C76138p pVar = (C76138p) C62942bv.parseFrom((C62942bv) C76138p.f211096c, nativeIntentGenerator.nativeGenerateInterpretations(nativeIntentGenerator.f211066c, lVar.toByteArray()), C62921ba.m95368a());
            C83334w wVar = nativeIntentGenerator.f211065b;
            C82887ec ecVar = C82887ec.PATTERNS_INTERPRETATION_GENERATOR;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            C82850ct ctVar = (C82850ct) C82851cu.f225915d.createBuilder();
            ctVar.copyOnWrite();
            C82851cu cuVar = (C82851cu) ctVar.instance;
            lVar.getClass();
            cuVar.f225918b = lVar;
            cuVar.f225917a |= 1;
            ctVar.copyOnWrite();
            C82851cu cuVar2 = (C82851cu) ctVar.instance;
            pVar.getClass();
            cuVar2.f225919c = pVar;
            cuVar2.f225917a |= 2;
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            C82851cu cuVar3 = (C82851cu) ctVar.build();
            cuVar3.getClass();
            eaVar.f225980b = cuVar3;
            eaVar.f225979a = 58;
            wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ioVar);
            nativeIntentGenerator.f211064a.readLock().unlock();
            return pVar;
        } catch (C62974ct unused) {
            C76135m mVar = (C76135m) C76138p.f211096c.createBuilder();
            mVar.copyOnWrite();
            ((C76138p) mVar.instance).f211098a = "Failed to parse InterpretationGeneratorResponse proto from native byte array.";
            return (C76138p) mVar.build();
        } catch (Throwable th) {
            nativeIntentGenerator.f211064a.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final C62817j mo72069b(C62815h hVar, C83320io ioVar) {
        NativeIntentGenerator nativeIntentGenerator;
        try {
            nativeIntentGenerator = this.f211063b;
            nativeIntentGenerator.f211064a.readLock().lock();
            C62817j jVar = (C62817j) C62942bv.parseFrom((C62942bv) C62817j.f169632d, nativeIntentGenerator.nativeGenerateGrammarMatches(nativeIntentGenerator.f211066c, hVar.toByteArray()), C62921ba.m95368a());
            C83334w wVar = nativeIntentGenerator.f211065b;
            C82887ec ecVar = C82887ec.PATTERNS_INTENT_GENERATOR;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            C82852cv cvVar = (C82852cv) C82853cw.f225921d.createBuilder();
            cvVar.copyOnWrite();
            C82853cw cwVar = (C82853cw) cvVar.instance;
            hVar.getClass();
            cwVar.f225924b = hVar;
            cwVar.f225923a |= 1;
            cvVar.copyOnWrite();
            C82853cw cwVar2 = (C82853cw) cvVar.instance;
            jVar.getClass();
            cwVar2.f225925c = jVar;
            cwVar2.f225923a |= 2;
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            C82853cw cwVar3 = (C82853cw) cvVar.build();
            cwVar3.getClass();
            eaVar.f225980b = cwVar3;
            eaVar.f225979a = 57;
            wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ioVar);
            nativeIntentGenerator.f211064a.readLock().unlock();
            return jVar;
        } catch (C62974ct unused) {
            C62816i iVar = (C62816i) C62817j.f169632d.createBuilder();
            iVar.copyOnWrite();
            C62817j jVar2 = (C62817j) iVar.instance;
            jVar2.f169634a |= 1;
            jVar2.f169635b = "Failed to parse MatchResponse proto from native byte array.";
            return (C62817j) iVar.build();
        } catch (Throwable th) {
            nativeIntentGenerator.f211064a.readLock().unlock();
            throw th;
        }
    }

    public final void close() {
        this.f211063b.close();
    }
}

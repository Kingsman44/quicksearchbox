package com.google.android.libraries.assistant.soda;

import android.content.Context;
import com.google.android.libraries.assistant.soda.data.SodaDataProviderJni;
import com.google.android.libraries.assistant.soda.p1604c.C19260b;
import com.google.android.libraries.assistant.soda.p1604c.C19261c;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37501dh;
import com.google.android.libraries.search.p2904c.C37502di;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60908dv;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4280bt.C56487c;
import com.google.p4280bt.C56488d;
import com.google.protobuf.C62909aq;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62974ct;
import com.google.speech.p5218j.C66915ee;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67045j;
import com.google.speech.p5218j.C67072k;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67137mk;
import com.google.speech.p5218j.C67138ml;
import com.google.speech.p5218j.C67139mm;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67175t;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66743j;
import com.google.speech.p5218j.p5219a.C66745l;
import com.google.speech.p5218j.p5219a.C66750q;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
public class Soda implements C19241ad {

    /* renamed from: a */
    public static final C59071e f53868a = C59071e.m91332i("com.google.android.libraries.assistant.soda.Soda");

    /* renamed from: b */
    public final Object f53869b = new Object();

    /* renamed from: c */
    public final AtomicBoolean f53870c = new AtomicBoolean(false);

    /* renamed from: d */
    public long f53871d;

    /* renamed from: e */
    public C19347o f53872e;

    /* renamed from: f */
    private final AtomicReference f53873f = new AtomicReference();

    /* renamed from: g */
    private final AtomicReference f53874g = new AtomicReference();

    /* renamed from: h */
    private long f53875h;

    /* renamed from: i */
    private boolean f53876i;

    /* renamed from: j */
    private C19346n f53877j;

    /* renamed from: k */
    private SettableFuture f53878k;

    /* renamed from: l */
    private C60887da f53879l;

    /* renamed from: m */
    private C60888db f53880m;

    /* renamed from: n */
    private C58833ax f53881n;

    /* renamed from: o */
    private final AtomicBoolean f53882o = new AtomicBoolean(false);

    public Soda(Context context, C19347o oVar) {
        C19242ae.m36689a(false, context);
        m36615z();
        this.f53872e = oVar;
        this.f53881n = C58836b.f156633a;
    }

    private native void nativeAddAudio(long j, ByteBuffer byteBuffer, long j2);

    private native void nativeAddTimestampedAudio(long j, ByteBuffer byteBuffer, long j2, ByteBuffer byteBuffer2, long j3);

    private native void nativeCancelAsr(long j);

    private native void nativeCollectDebugInfo(long j, boolean z);

    private native long nativeCreateSodaSharedResources();

    private native void nativeDelete(long j);

    private native boolean nativeDeleteDiarizationProcessorFromSharedResources(long j);

    private native long nativeDeleteSharedResources(long j);

    private native long nativeDeleteSharedResourcesIfNoDiarizationProcessor(long j);

    private native byte[] nativeEnrollForVoiceMatch(long j, byte[] bArr);

    private native byte[] nativeGetSpeakerIdEnrollmentInfo(long j);

    private native boolean nativeHasConfigChanged(long j, byte[] bArr);

    private native byte[] nativeInit(long j, byte[] bArr);

    private native void nativeLogEvents(long j, byte[] bArr);

    private native void nativeSetDataProvider(long j, SodaDataProviderJni sodaDataProviderJni);

    private native void nativeSetTransportFactory(long j, SodaTransportFactory sodaTransportFactory);

    private native void nativeStartAsr(long j, int i);

    private native byte[] nativeStartCapture(long j, byte[] bArr);

    private native void nativeStopCapture(long j);

    private native void nativeUpdateRecognitionContext(long j, byte[] bArr);

    /* renamed from: y */
    private static C60888db m36614y(String str, int i) {
        C60908dv dvVar = new C60908dv();
        dvVar.mo57410b(str);
        dvVar.mo57411c(i);
        return C60895di.m92996b(Executors.newSingleThreadScheduledExecutor(C60908dv.m93015a(dvVar)));
    }

    /* renamed from: z */
    private final void m36615z() {
        if (this.f53875h == 0) {
            this.f53875h = nativeCreateSodaSharedResources();
            ((C59052c) ((C59052c) f53868a.mo56224b()).mo56372aa(47594)).mo56386p("Creating new SodaSharedResources");
        } else {
            ((C59052c) ((C59052c) f53868a.mo56224b()).mo56372aa(47593)).mo56386p("Reusing cached SodaSharedResources");
        }
        this.f53871d = nativeConstruct(this.f53875h);
    }

    /* renamed from: a */
    public final synchronized long mo24324a() {
        if (this.f53874g.get() == null) {
            return -1;
        }
        return ((C60872cz) this.f53874g.get()).getDelay(TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public final C60870cx mo24325b(C66752s sVar, InputStream inputStream, C58833ax axVar) {
        return mo24326c(sVar, inputStream, C58836b.f156633a, axVar);
    }

    /* renamed from: c */
    public final C60870cx mo24326c(C66752s sVar, InputStream inputStream, C58833ax axVar, C58833ax axVar2) {
        C66750q qVar;
        C66750q qVar2;
        SettableFuture settableFuture = this.f53878k;
        if (settableFuture == null || settableFuture.isDone() || (this.f53878k.value instanceof C60873d.C60875b)) {
            if (!sVar.f181547b) {
                ((C59052c) ((C59052c) f53868a.mo56225c()).mo56372aa(47582)).mo56386p("Blocking calls to Soda.startCapture with InputStream are deprecated.");
                C66751r rVar = (C66751r) sVar.toBuilder();
                rVar.copyOnWrite();
                C66752s sVar2 = (C66752s) rVar.instance;
                sVar2.f181546a |= 1;
                sVar2.f181547b = true;
                sVar = (C66752s) rVar.build();
                this.f53878k = new SettableFuture();
            } else {
                this.f53878k = null;
            }
            if (this.f53877j == null) {
                C60887da daVar = this.f53879l;
                if (daVar == null) {
                    daVar = m36614y("soda-background-%d", 1);
                }
                C66745l lVar = sVar.f181550e;
                if (lVar == null) {
                    lVar = C66745l.f181530c;
                }
                if (lVar.f181532a == 1) {
                    qVar = (C66750q) lVar.f181533b;
                } else {
                    qVar = C66750q.f181536g;
                }
                C67175t tVar = qVar.f181541d;
                if (tVar == null) {
                    tVar = C67175t.f182588e;
                }
                int i = tVar.f182592c;
                C66745l lVar2 = sVar.f181550e;
                if (lVar2 == null) {
                    lVar2 = C66745l.f181530c;
                }
                if (lVar2.f181532a == 1) {
                    qVar2 = (C66750q) lVar2.f181533b;
                } else {
                    qVar2 = C66750q.f181536g;
                }
                C67175t tVar2 = qVar2.f181541d;
                if (tVar2 == null) {
                    tVar2 = C67175t.f182588e;
                }
                this.f53877j = new C19346n(daVar, this, i, tVar2.f182593d);
            }
            C56488d d = mo24327d(sVar);
            if (d.f150878a != 0) {
                return C60856cj.m92899h(new C19261c(d.f150879b));
            }
            C19346n nVar = this.f53877j;
            nVar.f54145f = new SettableFuture();
            synchronized (nVar.f54146g) {
                nVar.f54147h = nVar.f54141b.mo19399b(new C19344l(nVar, inputStream, axVar, axVar2));
                C60856cj.m92911t(nVar.f54147h, new C19345m(nVar), C60826bg.f164896a);
            }
            SettableFuture settableFuture2 = nVar.f54145f;
            if (this.f53878k != null) {
                try {
                    ((C59052c) ((C59052c) f53868a.mo56226d()).mo56372aa(47580)).mo56386p("Blocking until capture is stopped.");
                    Void voidR = (Void) this.f53878k.get();
                } catch (InterruptedException | ExecutionException e) {
                    ((C59052c) ((C59052c) ((C59052c) f53868a.mo56225c()).mo56382g(e)).mo56372aa(47581)).mo56386p("Exception while waiting for stop capture.");
                }
            }
            return settableFuture2;
        }
        ((C59052c) ((C59052c) f53868a.mo56225c()).mo56372aa(47583)).mo56386p("Another SODA capture session is active. Ignoring startCapture request.");
        return C60856cj.m92899h(new C19260b());
    }

    /* renamed from: d */
    public final C56488d mo24327d(C66752s sVar) {
        C56488d dVar;
        C66743j jVar;
        C66750q qVar;
        mo24353t();
        C56487c cVar = (C56487c) C56488d.f150876d.createBuilder();
        cVar.copyOnWrite();
        int i = 0;
        ((C56488d) cVar.instance).f150878a = 0;
        C56488d dVar2 = (C56488d) cVar.build();
        if (this.f53870c.compareAndSet(false, true)) {
            try {
                dVar = (C56488d) ((C56487c) ((C56487c) C56488d.f150876d.createBuilder()).mergeFrom(nativeStartCapture(this.f53871d, sVar.toByteArray()), C62921ba.m95368a())).build();
            } catch (C62974ct unused) {
                ((C59052c) ((C59052c) f53868a.mo56225c()).mo56372aa(47586)).mo56386p("Failed to deserialize received bytes to com.google.rpc.Status proto");
                C56487c cVar2 = (C56487c) C56488d.f150876d.createBuilder();
                cVar2.copyOnWrite();
                ((C56488d) cVar2.instance).f150878a = 13;
                cVar2.copyOnWrite();
                ((C56488d) cVar2.instance).f150879b = "failed to deserialize received bytes to com.google.rpc.Status proto";
                dVar = (C56488d) cVar2.build();
                mo24349p();
            }
            if (dVar.f150878a != 0) {
                ((C59052c) ((C59052c) f53868a.mo56225c()).mo56372aa(47585)).mo56386p("Failed to start a SODA capture session");
                this.f53870c.set(false);
            }
            if (!this.f53881n.mo56113h()) {
                return dVar;
            }
            C66745l lVar = sVar.f181550e;
            if (lVar == null) {
                lVar = C66745l.f181530c;
            }
            if (lVar.f181532a == 1) {
                C66745l lVar2 = sVar.f181550e;
                if (lVar2 == null) {
                    lVar2 = C66745l.f181530c;
                }
                if (lVar2.f181532a == 1) {
                    qVar = (C66750q) lVar2.f181533b;
                } else {
                    qVar = C66750q.f181536g;
                }
                C67175t tVar = qVar.f181541d;
                if (tVar == null) {
                    tVar = C67175t.f182588e;
                }
                i = tVar.f182593d;
            } else {
                C66745l lVar3 = sVar.f181550e;
                if ((lVar3 == null ? C66745l.f181530c : lVar3).f181532a == 2) {
                    if (lVar3 == null) {
                        lVar3 = C66745l.f181530c;
                    }
                    if (lVar3.f181532a == 2) {
                        jVar = (C66743j) lVar3.f181533b;
                    } else {
                        jVar = C66743j.f181525d;
                    }
                    C67175t tVar2 = jVar.f181528b;
                    if (tVar2 == null) {
                        tVar2 = C67175t.f182588e;
                    }
                    i = tVar2.f182593d;
                }
            }
            if (i <= 0) {
                ((C59052c) ((C59052c) f53868a.mo56225c()).mo56372aa(47597)).mo56387q("Invalid # of channels for SodaAudioAdapter. Got %d", i);
                return dVar;
            }
            ((C19343k) this.f53881n.mo56107c()).mo24478h(i, new C19340h(this));
            return dVar;
        }
        ((C59052c) ((C59052c) f53868a.mo56225c()).mo56372aa(47584)).mo56386p("Another SODA capture session is active. Ignoring startCapture request.");
        C56487c cVar3 = (C56487c) C56488d.f150876d.createBuilder();
        cVar3.copyOnWrite();
        ((C56488d) cVar3.instance).f150878a = 10;
        cVar3.copyOnWrite();
        ((C56488d) cVar3.instance).f150879b = "another SODA capture session is active, ignoring startCapture request";
        return (C56488d) cVar3.build();
    }

    /* renamed from: e */
    public final C67139mm mo24328e(C67137mk mkVar) {
        mo24353t();
        return (C67139mm) ((C67138ml) ((C67138ml) C67139mm.f182496e.createBuilder()).mergeFrom(nativeEnrollForVoiceMatch(this.f53871d, mkVar.toByteArray()), C62921ba.m95368a())).build();
    }

    /* renamed from: f */
    public final synchronized C67150mx mo24329f(C66999hh hhVar) {
        C19258c cVar;
        cVar = new C19258c();
        cVar.mo24390b(hhVar);
        return mo24331g(cVar.mo24391c());
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo24340l();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:44|45|46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0115, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        mo24340l();
        r8 = (com.google.speech.p5218j.C67149mw) com.google.speech.p5218j.C67150mx.f182524d.createBuilder();
        r0 = com.google.speech.p5218j.C67152mz.UNDEFINED_BEHAVIOR;
        r8.copyOnWrite();
        r2 = (com.google.speech.p5218j.C67150mx) r8.instance;
        r2.f182527b = r0.f182542l;
        r2.f182526a |= 1;
        r8.copyOnWrite();
        r0 = (com.google.speech.p5218j.C67150mx) r8.instance;
        r0.f182526a |= 2;
        r0.f182528c = "Unable to parse ConfigResult: InvalidProtocolBufferException";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014b, code lost:
        return (com.google.speech.p5218j.C67150mx) r8.build();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0116 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.speech.p5218j.C67150mx mo24331g(com.google.android.libraries.assistant.soda.C19240ac r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f53876i     // Catch:{ all -> 0x0182 }
            r1 = 1
            if (r0 == 0) goto L_0x0039
            com.google.speech.j.mx r8 = com.google.speech.p5218j.C67150mx.f182524d     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mw r8 = (com.google.speech.p5218j.C67149mw) r8     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.DOUBLE_INIT     // Catch:{ all -> 0x0182 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r2 = (com.google.speech.p5218j.C67150mx) r2     // Catch:{ all -> 0x0182 }
            int r0 = r0.f182542l     // Catch:{ all -> 0x0182 }
            r2.f182527b = r0     // Catch:{ all -> 0x0182 }
            int r0 = r2.f182526a     // Catch:{ all -> 0x0182 }
            r0 = r0 | r1
            r2.f182526a = r0     // Catch:{ all -> 0x0182 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r0 = r8.instance     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r0 = (com.google.speech.p5218j.C67150mx) r0     // Catch:{ all -> 0x0182 }
            int r1 = r0.f182526a     // Catch:{ all -> 0x0182 }
            r1 = r1 | 2
            r0.f182526a = r1     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = "SODA cannot be initialized more than once."
            r0.f182528c = r1     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r8 = (com.google.speech.p5218j.C67150mx) r8     // Catch:{ all -> 0x0182 }
            monitor-exit(r7)
            return r8
        L_0x0039:
            com.google.speech.j.hh r0 = r8.mo24394c()     // Catch:{ all -> 0x0182 }
            com.google.speech.j.hf r2 = r0.f182132d     // Catch:{ all -> 0x0182 }
            if (r2 != 0) goto L_0x0043
            com.google.speech.j.hf r2 = com.google.speech.p5218j.C66997hf.f182099z     // Catch:{ all -> 0x0182 }
        L_0x0043:
            com.google.speech.j.gg r2 = r2.f182123v     // Catch:{ all -> 0x0182 }
            if (r2 != 0) goto L_0x0049
            com.google.speech.j.gg r2 = com.google.speech.p5218j.C66971gg.f182040a     // Catch:{ all -> 0x0182 }
        L_0x0049:
            com.google.protobuf.bt r3 = com.google.speech.p5218j.C66962fy.f182011d     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)     // Catch:{ all -> 0x0182 }
            r2.mo58887l(r3)     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bf r2 = r2.f169962ag     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bs r4 = r3.f169971d     // Catch:{ all -> 0x0182 }
            java.lang.Object r2 = r2.mo58854l(r4)     // Catch:{ all -> 0x0182 }
            if (r2 != 0) goto L_0x005f
            java.lang.Object r2 = r3.f169969b     // Catch:{ all -> 0x0182 }
            goto L_0x0063
        L_0x005f:
            java.lang.Object r2 = r3.mo58889c(r2)     // Catch:{ all -> 0x0182 }
        L_0x0063:
            com.google.speech.j.fy r2 = (com.google.speech.p5218j.C66962fy) r2     // Catch:{ all -> 0x0182 }
            int r2 = r2.f182014b     // Catch:{ all -> 0x0182 }
            int r2 = com.google.speech.p5218j.C66961fx.m97395a(r2)     // Catch:{ all -> 0x0182 }
            if (r2 != 0) goto L_0x006e
            goto L_0x009b
        L_0x006e:
            r3 = 3
            if (r2 != r3) goto L_0x009b
            com.google.common.f.e r2 = f53868a     // Catch:{ all -> 0x0182 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0182 }
            java.lang.String r3 = "Diarization session is being resumed - cancelling timeout."
            r4 = 47588(0xb9e4, float:6.6685E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x0182 }
            com.google.protobuf.ar r2 = com.google.protobuf.C62910ar.f169858c     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0182 }
            com.google.protobuf.aq r2 = (com.google.protobuf.C62909aq) r2     // Catch:{ all -> 0x0182 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0182 }
            com.google.protobuf.ar r3 = (com.google.protobuf.C62910ar) r3     // Catch:{ all -> 0x0182 }
            r4 = -1
            r3.f169860a = r4     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0182 }
            com.google.protobuf.ar r2 = (com.google.protobuf.C62910ar) r2     // Catch:{ all -> 0x0182 }
            r7.mo24352s(r2)     // Catch:{ all -> 0x0182 }
        L_0x009b:
            long r2 = r7.f53871d     // Catch:{ all -> 0x0182 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00a6
            r7.m36615z()     // Catch:{ all -> 0x0182 }
        L_0x00a6:
            r7.mo24353t()     // Catch:{ all -> 0x0182 }
            com.google.common.base.ax r2 = r8.mo24393b()     // Catch:{ all -> 0x0182 }
            boolean r2 = r2.mo56113h()     // Catch:{ all -> 0x0182 }
            if (r2 == 0) goto L_0x00c2
            long r2 = r7.f53871d     // Catch:{ all -> 0x0182 }
            com.google.common.base.ax r4 = r8.mo24393b()     // Catch:{ all -> 0x0182 }
            java.lang.Object r4 = r4.mo56107c()     // Catch:{ all -> 0x0182 }
            com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory r4 = (com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory) r4     // Catch:{ all -> 0x0182 }
            r7.nativeSetTransportFactory(r2, r4)     // Catch:{ all -> 0x0182 }
        L_0x00c2:
            com.google.common.base.ax r2 = r8.mo24392a()     // Catch:{ all -> 0x0182 }
            boolean r2 = r2.mo56113h()     // Catch:{ all -> 0x0182 }
            if (r2 == 0) goto L_0x00e0
            long r2 = r7.f53871d     // Catch:{ all -> 0x0182 }
            com.google.android.libraries.assistant.soda.data.SodaDataProviderJni r4 = new com.google.android.libraries.assistant.soda.data.SodaDataProviderJni     // Catch:{ all -> 0x0182 }
            com.google.common.base.ax r8 = r8.mo24392a()     // Catch:{ all -> 0x0182 }
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ all -> 0x0182 }
            com.google.android.libraries.assistant.soda.data.a r8 = (com.google.android.libraries.assistant.soda.data.C19283a) r8     // Catch:{ all -> 0x0182 }
            r4.<init>(r8)     // Catch:{ all -> 0x0182 }
            r7.nativeSetDataProvider(r2, r4)     // Catch:{ all -> 0x0182 }
        L_0x00e0:
            long r2 = r7.f53871d     // Catch:{ all -> 0x0182 }
            byte[] r8 = r0.toByteArray()     // Catch:{ all -> 0x0182 }
            byte[] r8 = r7.nativeInit(r2, r8)     // Catch:{ all -> 0x0182 }
            if (r8 == 0) goto L_0x014c
            com.google.speech.j.mx r0 = com.google.speech.p5218j.C67150mx.f182524d     // Catch:{ ct -> 0x0116 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ ct -> 0x0116 }
            com.google.speech.j.mw r0 = (com.google.speech.p5218j.C67149mw) r0     // Catch:{ ct -> 0x0116 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0116 }
            com.google.protobuf.b r8 = r0.mergeFrom((byte[]) r8, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x0116 }
            com.google.speech.j.mw r8 = (com.google.speech.p5218j.C67149mw) r8     // Catch:{ ct -> 0x0116 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ ct -> 0x0116 }
            com.google.speech.j.mx r8 = (com.google.speech.p5218j.C67150mx) r8     // Catch:{ ct -> 0x0116 }
            int r0 = r8.f182527b     // Catch:{ ct -> 0x0116 }
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.m97427a(r0)     // Catch:{ ct -> 0x0116 }
            if (r0 != 0) goto L_0x010e
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.NO_ERROR     // Catch:{ ct -> 0x0116 }
        L_0x010e:
            com.google.speech.j.mz r2 = com.google.speech.p5218j.C67152mz.NO_ERROR     // Catch:{ ct -> 0x0116 }
            if (r0 != r2) goto L_0x0114
            r7.f53876i = r1     // Catch:{ ct -> 0x0116 }
        L_0x0114:
            monitor-exit(r7)
            return r8
        L_0x0116:
            r7.mo24340l()     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r8 = com.google.speech.p5218j.C67150mx.f182524d     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mw r8 = (com.google.speech.p5218j.C67149mw) r8     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.UNDEFINED_BEHAVIOR     // Catch:{ all -> 0x0182 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r2 = (com.google.speech.p5218j.C67150mx) r2     // Catch:{ all -> 0x0182 }
            int r0 = r0.f182542l     // Catch:{ all -> 0x0182 }
            r2.f182527b = r0     // Catch:{ all -> 0x0182 }
            int r0 = r2.f182526a     // Catch:{ all -> 0x0182 }
            r0 = r0 | r1
            r2.f182526a = r0     // Catch:{ all -> 0x0182 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r0 = r8.instance     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r0 = (com.google.speech.p5218j.C67150mx) r0     // Catch:{ all -> 0x0182 }
            int r1 = r0.f182526a     // Catch:{ all -> 0x0182 }
            r1 = r1 | 2
            r0.f182526a = r1     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = "Unable to parse ConfigResult: InvalidProtocolBufferException"
            r0.f182528c = r1     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r8 = (com.google.speech.p5218j.C67150mx) r8     // Catch:{ all -> 0x0182 }
            monitor-exit(r7)
            return r8
        L_0x014c:
            r7.mo24340l()     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r8 = com.google.speech.p5218j.C67150mx.f182524d     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mw r8 = (com.google.speech.p5218j.C67149mw) r8     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.UNDEFINED_BEHAVIOR     // Catch:{ all -> 0x0182 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r2 = (com.google.speech.p5218j.C67150mx) r2     // Catch:{ all -> 0x0182 }
            int r0 = r0.f182542l     // Catch:{ all -> 0x0182 }
            r2.f182527b = r0     // Catch:{ all -> 0x0182 }
            int r0 = r2.f182526a     // Catch:{ all -> 0x0182 }
            r0 = r0 | r1
            r2.f182526a = r0     // Catch:{ all -> 0x0182 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r0 = r8.instance     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r0 = (com.google.speech.p5218j.C67150mx) r0     // Catch:{ all -> 0x0182 }
            int r1 = r0.f182526a     // Catch:{ all -> 0x0182 }
            r1 = r1 | 2
            r0.f182526a = r1     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = "Unable to parse ConfigResult:  Serialized ConfigResult is null."
            r0.f182528c = r1     // Catch:{ all -> 0x0182 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x0182 }
            com.google.speech.j.mx r8 = (com.google.speech.p5218j.C67150mx) r8     // Catch:{ all -> 0x0182 }
            monitor-exit(r7)
            return r8
        L_0x0182:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.Soda.mo24331g(com.google.android.libraries.assistant.soda.ac):com.google.speech.j.mx");
    }

    /* renamed from: h */
    public final void mo24332h(ByteBuffer byteBuffer, int i) {
        mo24353t();
        nativeAddAudio(this.f53871d, byteBuffer, (long) i);
    }

    /* access modifiers changed from: protected */
    public void handleShutdown() {
        synchronized (this.f53869b) {
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleSodaEvent(byte[] r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f53869b
            monitor-enter(r0)
            com.google.speech.j.ko r1 = com.google.speech.p5218j.C67087ko.f182366n     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.kn r1 = (com.google.speech.p5218j.C67086kn) r1     // Catch:{ all -> 0x0280 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.b r14 = r1.mergeFrom((byte[]) r14, (com.google.protobuf.C62921ba) r2)     // Catch:{ all -> 0x0280 }
            com.google.speech.j.kn r14 = (com.google.speech.p5218j.C67086kn) r14     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r14 = r14.build()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.ko r14 = (com.google.speech.p5218j.C67087ko) r14     // Catch:{ all -> 0x0280 }
            com.google.common.base.ax r1 = r13.f53881n     // Catch:{ all -> 0x0280 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x0280 }
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x00cc
            int r1 = r14.f182368a     // Catch:{ all -> 0x0280 }
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00b5
            com.google.speech.j.je r1 = r14.f182369b     // Catch:{ all -> 0x0280 }
            if (r1 != 0) goto L_0x0030
            com.google.speech.j.je r1 = com.google.speech.p5218j.C67050je.f182262f     // Catch:{ all -> 0x0280 }
        L_0x0030:
            com.google.speech.j.jc r1 = r1.f182265b     // Catch:{ all -> 0x0280 }
            if (r1 != 0) goto L_0x0036
            com.google.speech.j.jc r1 = com.google.speech.p5218j.C67048jc.f182253h     // Catch:{ all -> 0x0280 }
        L_0x0036:
            java.lang.String r1 = r1.f182256b     // Catch:{ all -> 0x0280 }
            java.lang.String r4 = "hotword"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0280 }
            if (r1 == 0) goto L_0x00b5
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f53882o     // Catch:{ all -> 0x0280 }
            boolean r1 = r1.getAndSet(r3)     // Catch:{ all -> 0x0280 }
            if (r1 == 0) goto L_0x004a
            monitor-exit(r0)     // Catch:{ all -> 0x0280 }
            return
        L_0x004a:
            com.google.common.base.ax r1 = r13.f53881n     // Catch:{ all -> 0x0280 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x0280 }
            com.google.android.libraries.assistant.soda.k r1 = (com.google.android.libraries.assistant.soda.C19343k) r1     // Catch:{ all -> 0x0280 }
            com.google.android.libraries.search.c.dg r1 = r1.mo24471a()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.ko r4 = com.google.speech.p5218j.C67087ko.f182366n     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bn r14 = r4.createBuilder(r14)     // Catch:{ all -> 0x0280 }
            com.google.speech.j.kn r14 = (com.google.speech.p5218j.C67086kn) r14     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bt r4 = com.google.speech.p5218j.C67072k.f182319e     // Catch:{ all -> 0x0280 }
            com.google.speech.j.k r5 = com.google.speech.p5218j.C67072k.f182318d     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.j r5 = (com.google.speech.p5218j.C67045j) r5     // Catch:{ all -> 0x0280 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.k r6 = (com.google.speech.p5218j.C67072k) r6     // Catch:{ all -> 0x0280 }
            r6.f182322b = r3     // Catch:{ all -> 0x0280 }
            int r7 = r6.f182321a     // Catch:{ all -> 0x0280 }
            r7 = r7 | r3
            r6.f182321a = r7     // Catch:{ all -> 0x0280 }
            com.google.android.libraries.search.c.di r6 = com.google.android.libraries.search.p2904c.C37502di.f99561c     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x0280 }
            com.google.android.libraries.search.c.dh r6 = (com.google.android.libraries.search.p2904c.C37501dh) r6     // Catch:{ all -> 0x0280 }
            r6.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x0280 }
            com.google.android.libraries.search.c.di r7 = (com.google.android.libraries.search.p2904c.C37502di) r7     // Catch:{ all -> 0x0280 }
            r1.getClass()     // Catch:{ all -> 0x0280 }
            r7.f99564b = r1     // Catch:{ all -> 0x0280 }
            int r1 = r7.f99563a     // Catch:{ all -> 0x0280 }
            r1 = r1 | r3
            r7.f99563a = r1     // Catch:{ all -> 0x0280 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r1 = r5.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.k r1 = (com.google.speech.p5218j.C67072k) r1     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ all -> 0x0280 }
            com.google.android.libraries.search.c.di r6 = (com.google.android.libraries.search.p2904c.C37502di) r6     // Catch:{ all -> 0x0280 }
            r6.getClass()     // Catch:{ all -> 0x0280 }
            r1.f182323c = r6     // Catch:{ all -> 0x0280 }
            int r6 = r1.f182321a     // Catch:{ all -> 0x0280 }
            r6 = r6 | r2
            r1.f182321a = r6     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r1 = r5.build()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.k r1 = (com.google.speech.p5218j.C67072k) r1     // Catch:{ all -> 0x0280 }
            r14.mo58885m(r4, r1)     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r14 = r14.build()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.ko r14 = (com.google.speech.p5218j.C67087ko) r14     // Catch:{ all -> 0x0280 }
        L_0x00b5:
            int r1 = r14.f182368a     // Catch:{ all -> 0x0280 }
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x00cc
            com.google.common.base.ax r1 = r13.f53881n     // Catch:{ all -> 0x0280 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x0280 }
            com.google.android.libraries.assistant.soda.k r1 = (com.google.android.libraries.assistant.soda.C19343k) r1     // Catch:{ all -> 0x0280 }
            com.google.speech.j.p r4 = r14.f182376i     // Catch:{ all -> 0x0280 }
            if (r4 != 0) goto L_0x00c9
            com.google.speech.j.p r4 = com.google.speech.p5218j.C67171p.f182575e     // Catch:{ all -> 0x0280 }
        L_0x00c9:
            r1.mo24477g(r4)     // Catch:{ all -> 0x0280 }
        L_0x00cc:
            com.google.speech.j.kk r1 = r14.f182370c     // Catch:{ all -> 0x0280 }
            if (r1 != 0) goto L_0x00d2
            com.google.speech.j.kk r1 = com.google.speech.p5218j.C67083kk.f182351g     // Catch:{ all -> 0x0280 }
        L_0x00d2:
            int r1 = r1.f182356d     // Catch:{ all -> 0x0280 }
            int r1 = com.google.speech.p5218j.C67161nh.m97429a(r1)     // Catch:{ all -> 0x0280 }
            if (r1 != 0) goto L_0x00dc
            goto L_0x0277
        L_0x00dc:
            r4 = 4
            if (r1 != r4) goto L_0x0277
            com.google.android.libraries.assistant.soda.o r1 = r13.f53872e     // Catch:{ all -> 0x0280 }
            if (r1 == 0) goto L_0x0277
            com.google.speech.j.fg r5 = com.google.speech.p5218j.C66944fg.f181963e     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.ff r5 = (com.google.speech.p5218j.C66943ff) r5     // Catch:{ all -> 0x0280 }
            com.google.speech.j.kk r6 = r14.f182370c     // Catch:{ all -> 0x0280 }
            if (r6 != 0) goto L_0x00f2
            com.google.speech.j.kk r7 = com.google.speech.p5218j.C67083kk.f182351g     // Catch:{ all -> 0x0280 }
            goto L_0x00f3
        L_0x00f2:
            r7 = r6
        L_0x00f3:
            int r7 = r7.f182354b     // Catch:{ all -> 0x0280 }
            r8 = 0
            r9 = 3
            if (r7 != r3) goto L_0x0149
            if (r6 != 0) goto L_0x00fd
            com.google.speech.j.kk r6 = com.google.speech.p5218j.C67083kk.f182351g     // Catch:{ all -> 0x0280 }
        L_0x00fd:
            int r7 = r6.f182354b     // Catch:{ all -> 0x0280 }
            if (r7 != r3) goto L_0x0106
            java.lang.Object r6 = r6.f182355c     // Catch:{ all -> 0x0280 }
            com.google.speech.j.ix r6 = (com.google.speech.p5218j.C67042ix) r6     // Catch:{ all -> 0x0280 }
            goto L_0x0108
        L_0x0106:
            com.google.speech.j.ix r6 = com.google.speech.p5218j.C67042ix.f182227l     // Catch:{ all -> 0x0280 }
        L_0x0108:
            com.google.protobuf.cq r7 = r6.f182230b     // Catch:{ all -> 0x0280 }
            int r7 = r7.size()     // Catch:{ all -> 0x0280 }
            if (r7 <= 0) goto L_0x0129
            com.google.protobuf.cq r7 = r6.f182230b     // Catch:{ all -> 0x0280 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0280 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0280 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fg r8 = (com.google.speech.p5218j.C66944fg) r8     // Catch:{ all -> 0x0280 }
            r7.getClass()     // Catch:{ all -> 0x0280 }
            int r10 = r8.f181966a     // Catch:{ all -> 0x0280 }
            r10 = r10 | r2
            r8.f181966a = r10     // Catch:{ all -> 0x0280 }
            r8.f181968c = r7     // Catch:{ all -> 0x0280 }
        L_0x0129:
            int r7 = r6.f182229a     // Catch:{ all -> 0x0280 }
            r7 = r7 & 32
            if (r7 == 0) goto L_0x01a3
            com.google.speech.j.ks r6 = r6.f182235g     // Catch:{ all -> 0x0280 }
            if (r6 != 0) goto L_0x0135
            com.google.speech.j.ks r6 = com.google.speech.p5218j.C67091ks.f182386h     // Catch:{ all -> 0x0280 }
        L_0x0135:
            java.lang.String r6 = r6.f182390c     // Catch:{ all -> 0x0280 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fg r7 = (com.google.speech.p5218j.C66944fg) r7     // Catch:{ all -> 0x0280 }
            r6.getClass()     // Catch:{ all -> 0x0280 }
            int r8 = r7.f181966a     // Catch:{ all -> 0x0280 }
            r8 = r8 | r4
            r7.f181966a = r8     // Catch:{ all -> 0x0280 }
            r7.f181969d = r6     // Catch:{ all -> 0x0280 }
            goto L_0x01a3
        L_0x0149:
            if (r6 != 0) goto L_0x014e
            com.google.speech.j.kk r7 = com.google.speech.p5218j.C67083kk.f182351g     // Catch:{ all -> 0x0280 }
            goto L_0x014f
        L_0x014e:
            r7 = r6
        L_0x014f:
            int r7 = r7.f182354b     // Catch:{ all -> 0x0280 }
            if (r7 != r4) goto L_0x01a3
            if (r6 != 0) goto L_0x0157
            com.google.speech.j.kk r6 = com.google.speech.p5218j.C67083kk.f182351g     // Catch:{ all -> 0x0280 }
        L_0x0157:
            int r7 = r6.f182354b     // Catch:{ all -> 0x0280 }
            if (r7 != r4) goto L_0x0160
            java.lang.Object r6 = r6.f182355c     // Catch:{ all -> 0x0280 }
            com.google.speech.j.kg r6 = (com.google.speech.p5218j.C67079kg) r6     // Catch:{ all -> 0x0280 }
            goto L_0x0162
        L_0x0160:
            com.google.speech.j.kg r6 = com.google.speech.p5218j.C67079kg.f182340h     // Catch:{ all -> 0x0280 }
        L_0x0162:
            com.google.protobuf.cq r7 = r6.f182343b     // Catch:{ all -> 0x0280 }
            int r7 = r7.size()     // Catch:{ all -> 0x0280 }
            if (r7 <= 0) goto L_0x0183
            com.google.protobuf.cq r7 = r6.f182343b     // Catch:{ all -> 0x0280 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0280 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0280 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fg r8 = (com.google.speech.p5218j.C66944fg) r8     // Catch:{ all -> 0x0280 }
            r7.getClass()     // Catch:{ all -> 0x0280 }
            int r9 = r8.f181966a     // Catch:{ all -> 0x0280 }
            r9 = r9 | r2
            r8.f181966a = r9     // Catch:{ all -> 0x0280 }
            r8.f181968c = r7     // Catch:{ all -> 0x0280 }
        L_0x0183:
            int r7 = r6.f182342a     // Catch:{ all -> 0x0280 }
            r7 = r7 & 16
            if (r7 == 0) goto L_0x01a2
            com.google.speech.j.ks r6 = r6.f182347f     // Catch:{ all -> 0x0280 }
            if (r6 != 0) goto L_0x018f
            com.google.speech.j.ks r6 = com.google.speech.p5218j.C67091ks.f182386h     // Catch:{ all -> 0x0280 }
        L_0x018f:
            java.lang.String r6 = r6.f182390c     // Catch:{ all -> 0x0280 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fg r7 = (com.google.speech.p5218j.C66944fg) r7     // Catch:{ all -> 0x0280 }
            r6.getClass()     // Catch:{ all -> 0x0280 }
            int r8 = r7.f181966a     // Catch:{ all -> 0x0280 }
            r8 = r8 | r4
            r7.f181966a = r8     // Catch:{ all -> 0x0280 }
            r7.f181969d = r6     // Catch:{ all -> 0x0280 }
        L_0x01a2:
            r9 = 2
        L_0x01a3:
            com.google.speech.j.kk r6 = r14.f182370c     // Catch:{ all -> 0x0280 }
            if (r6 != 0) goto L_0x01a9
            com.google.speech.j.kk r6 = com.google.speech.p5218j.C67083kk.f182351g     // Catch:{ all -> 0x0280 }
        L_0x01a9:
            com.google.protobuf.cq r6 = r6.f182357e     // Catch:{ all -> 0x0280 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0280 }
        L_0x01af:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0280 }
            if (r7 == 0) goto L_0x025b
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.jq r7 = (com.google.speech.p5218j.C67062jq) r7     // Catch:{ all -> 0x0280 }
            com.google.speech.j.nl r8 = com.google.speech.p5218j.C67165nl.f182559d     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.ni r8 = (com.google.speech.p5218j.C67162ni) r8     // Catch:{ all -> 0x0280 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.nl r10 = (com.google.speech.p5218j.C67165nl) r10     // Catch:{ all -> 0x0280 }
            int r11 = r9 + -1
            r10.f182562b = r11     // Catch:{ all -> 0x0280 }
            int r11 = r10.f182561a     // Catch:{ all -> 0x0280 }
            r11 = r11 | r3
            r10.f182561a = r11     // Catch:{ all -> 0x0280 }
            com.google.speech.j.ck r7 = r7.f182296a     // Catch:{ all -> 0x0280 }
            if (r7 != 0) goto L_0x01d9
            com.google.speech.j.ck r7 = com.google.speech.p5218j.C66865ck.f181787h     // Catch:{ all -> 0x0280 }
        L_0x01d9:
            com.google.speech.j.fi r10 = com.google.speech.p5218j.C66946fi.f181970c     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fh r10 = (com.google.speech.p5218j.C66945fh) r10     // Catch:{ all -> 0x0280 }
            int r11 = r7.f181790b     // Catch:{ all -> 0x0280 }
            r12 = 9
            if (r11 != r12) goto L_0x0209
            java.lang.Object r7 = r7.f181791c     // Catch:{ all -> 0x0280 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0280 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fk r7 = com.google.speech.p5218j.C66948fk.m97389a(r7)     // Catch:{ all -> 0x0280 }
            if (r7 != 0) goto L_0x01f7
            com.google.speech.j.fk r7 = com.google.speech.p5218j.C66948fk.QP_UNKNOWN     // Catch:{ all -> 0x0280 }
        L_0x01f7:
            r10.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fi r11 = (com.google.speech.p5218j.C66946fi) r11     // Catch:{ all -> 0x0280 }
            int r7 = r7.f181990o     // Catch:{ all -> 0x0280 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0280 }
            r11.f181973b = r7     // Catch:{ all -> 0x0280 }
            r11.f181972a = r3     // Catch:{ all -> 0x0280 }
            goto L_0x021f
        L_0x0209:
            r12 = 8
            if (r11 != r12) goto L_0x021f
            java.lang.Object r7 = r7.f181791c     // Catch:{ all -> 0x0280 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0280 }
            r10.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fi r11 = (com.google.speech.p5218j.C66946fi) r11     // Catch:{ all -> 0x0280 }
            r7.getClass()     // Catch:{ all -> 0x0280 }
            r11.f181972a = r2     // Catch:{ all -> 0x0280 }
            r11.f181973b = r7     // Catch:{ all -> 0x0280 }
        L_0x021f:
            com.google.protobuf.bv r7 = r10.build()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fi r7 = (com.google.speech.p5218j.C66946fi) r7     // Catch:{ all -> 0x0280 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.nl r10 = (com.google.speech.p5218j.C67165nl) r10     // Catch:{ all -> 0x0280 }
            r7.getClass()     // Catch:{ all -> 0x0280 }
            r10.f182563c = r7     // Catch:{ all -> 0x0280 }
            int r7 = r10.f182561a     // Catch:{ all -> 0x0280 }
            r7 = r7 | r4
            r10.f182561a = r7     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r7 = r8.build()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.nl r7 = (com.google.speech.p5218j.C67165nl) r7     // Catch:{ all -> 0x0280 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fg r8 = (com.google.speech.p5218j.C66944fg) r8     // Catch:{ all -> 0x0280 }
            r7.getClass()     // Catch:{ all -> 0x0280 }
            com.google.protobuf.cq r10 = r8.f181967b     // Catch:{ all -> 0x0280 }
            boolean r11 = r10.mo58948c()     // Catch:{ all -> 0x0280 }
            if (r11 != 0) goto L_0x0254
            com.google.protobuf.cq r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r10)     // Catch:{ all -> 0x0280 }
            r8.f181967b = r10     // Catch:{ all -> 0x0280 }
        L_0x0254:
            com.google.protobuf.cq r8 = r8.f181967b     // Catch:{ all -> 0x0280 }
            r8.add(r7)     // Catch:{ all -> 0x0280 }
            goto L_0x01af
        L_0x025b:
            com.google.speech.j.ko r2 = com.google.speech.p5218j.C67087ko.f182366n     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.kn r2 = (com.google.speech.p5218j.C67086kn) r2     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bt r3 = com.google.speech.p5218j.C66944fg.f181964f     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r4 = r5.build()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.fg r4 = (com.google.speech.p5218j.C66944fg) r4     // Catch:{ all -> 0x0280 }
            r2.mo58885m(r3, r4)     // Catch:{ all -> 0x0280 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0280 }
            com.google.speech.j.ko r2 = (com.google.speech.p5218j.C67087ko) r2     // Catch:{ all -> 0x0280 }
            r1.mo23782t(r2)     // Catch:{ all -> 0x0280 }
        L_0x0277:
            com.google.android.libraries.assistant.soda.o r1 = r13.f53872e     // Catch:{ all -> 0x0280 }
            if (r1 == 0) goto L_0x027e
            r1.mo23782t(r14)     // Catch:{ all -> 0x0280 }
        L_0x027e:
            monitor-exit(r0)     // Catch:{ all -> 0x0280 }
            return
        L_0x0280:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0280 }
            goto L_0x0284
        L_0x0283:
            throw r14
        L_0x0284:
            goto L_0x0283
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.Soda.handleSodaEvent(byte[]):void");
    }

    /* access modifiers changed from: protected */
    public void handleStart() {
        synchronized (this.f53869b) {
            this.f53882o.set(false);
            C19347o oVar = this.f53872e;
            if (oVar != null) {
                oVar.mo23783u();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void handleStop(int i) {
        C19243af afVar;
        this.f53870c.set(false);
        if (this.f53881n.mo56113h()) {
            ((C19343k) this.f53881n.mo56107c()).mo24472b();
        }
        synchronized (this.f53869b) {
            C19347o oVar = this.f53872e;
            if (oVar != null) {
                if (i == 0) {
                    afVar = C19243af.STOP_CALLED;
                } else if (i == 1) {
                    afVar = C19243af.MIC_END_OF_DATA;
                } else if (i == 2) {
                    afVar = C19243af.ERROR;
                } else if (i != 3) {
                    afVar = C19243af.UNKNOWN;
                } else {
                    afVar = C19243af.HOTWORD_TIMEOUT;
                }
                oVar.mo23784v(afVar);
            }
        }
        SettableFuture settableFuture = this.f53878k;
        if (settableFuture != null) {
            settableFuture.mo57356n((Object) null);
        }
    }

    /* renamed from: i */
    public final void mo24337i(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2) {
        mo24353t();
        nativeAddTimestampedAudio(this.f53871d, byteBuffer, (long) i, byteBuffer2, (long) i2);
    }

    /* renamed from: j */
    public final void mo24338j() {
        mo24353t();
        nativeCancelAsr(this.f53871d);
    }

    /* renamed from: k */
    public final synchronized void mo24339k() {
        C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169860a = -1;
        mo24352s((C62910ar) aqVar.build());
        long j = this.f53875h;
        if (j == 0) {
            ((C59052c) ((C59052c) f53868a.mo56226d()).mo56372aa(47592)).mo56386p("SodaSharedResources is already NULL_PTR, nothing to delete.");
        } else if (this.f53871d != 0) {
            if (this.f53873f.get() != null && ((C60872cz) this.f53873f.get()).getDelay(TimeUnit.SECONDS) > 0) {
                C62909aq aqVar2 = (C62909aq) C62910ar.f169858c.createBuilder();
                aqVar2.copyOnWrite();
                ((C62910ar) aqVar2.instance).f169860a = -1;
                mo24350q((C62910ar) aqVar2.build());
                ((C59052c) ((C59052c) f53868a.mo56226d()).mo56372aa(47591)).mo56386p("Deleting soda early to force caching.");
                mo24340l();
            }
            ((C59052c) ((C59052c) f53868a.mo56224b()).mo56372aa(47590)).mo56389s("DiarizationProcessor deleted from resources: %b", Boolean.valueOf(nativeDeleteDiarizationProcessorFromSharedResources(this.f53875h)));
        } else {
            this.f53875h = nativeDeleteSharedResources(j);
            ((C59052c) ((C59052c) f53868a.mo56224b()).mo56372aa(47589)).mo56386p("Deleting SodaSharedResources.");
        }
    }

    /* renamed from: l */
    public final synchronized void mo24340l() {
        long j = this.f53871d;
        if (j != 0) {
            nativeDelete(j);
            this.f53871d = 0;
            long nativeDeleteSharedResourcesIfNoDiarizationProcessor = nativeDeleteSharedResourcesIfNoDiarizationProcessor(this.f53875h);
            this.f53875h = nativeDeleteSharedResourcesIfNoDiarizationProcessor;
            if (nativeDeleteSharedResourcesIfNoDiarizationProcessor != 0 && mo24324a() <= 0) {
                C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
                aqVar.copyOnWrite();
                ((C62910ar) aqVar.instance).f169860a = 3600;
                mo24352s((C62910ar) aqVar.build());
            }
        }
        this.f53876i = false;
    }

    /* renamed from: m */
    public final void mo24341m(C66915ee eeVar) {
        mo24353t();
        nativeLogEvents(this.f53871d, eeVar.toByteArray());
    }

    /* renamed from: n */
    public final synchronized void mo24342n(C58833ax axVar) {
        this.f53881n = axVar;
    }

    public native long nativeConstruct(long j);

    public native void nativeExecuteTasks(long j, byte[] bArr);

    public native byte[] nativeFixRecognition(long j, byte[] bArr, byte[] bArr2);

    public native void nativeUpdateContext(long j, byte[] bArr);

    public native void nativeUpdateRuntime(long j, byte[] bArr);

    /* renamed from: o */
    public final void mo24348o(C19347o oVar) {
        synchronized (this.f53869b) {
            this.f53872e = oVar;
        }
    }

    /* renamed from: p */
    public final void mo24349p() {
        C60870cx cxVar;
        mo24353t();
        nativeStopCapture(this.f53871d);
        C19346n nVar = this.f53877j;
        if (nVar != null) {
            synchronized (nVar.f54146g) {
                if (nVar.f54145f != null && (cxVar = nVar.f54147h) != null && !cxVar.isDone() && !nVar.f54145f.isDone()) {
                    nVar.f54145f.cancel(true);
                    nVar.f54148i = new SettableFuture();
                }
            }
            SettableFuture settableFuture = nVar.f54148i;
            if (settableFuture != null) {
                try {
                    settableFuture.get();
                } catch (InterruptedException | ExecutionException e) {
                    ((C59052c) ((C59052c) ((C59052c) C19346n.f54140a.mo56225c()).mo56382g(e)).mo56372aa(47638)).mo56386p("Exception occurred when trying to stop pushing SODA audio.");
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo24350q(C62910ar arVar) {
        C60872cz czVar;
        if (arVar.f169860a == -1) {
            czVar = (C60872cz) this.f53873f.getAndSet((Object) null);
        } else {
            if (this.f53880m == null) {
                this.f53880m = m36614y("soda-lightweight-%d", 5);
            }
            czVar = (C60872cz) this.f53873f.getAndSet(this.f53880m.mo29164d(new C19319f(this, arVar), arVar.f169860a, TimeUnit.SECONDS));
        }
        if (czVar != null) {
            czVar.cancel(false);
        }
    }

    /* renamed from: r */
    public final void mo24351r(C66722az azVar) {
        mo24353t();
        nativeUpdateRecognitionContext(this.f53871d, azVar.toByteArray());
    }

    /* renamed from: s */
    public final synchronized void mo24352s(C62910ar arVar) {
        C60872cz czVar;
        if (arVar.f169860a == -1) {
            czVar = (C60872cz) this.f53874g.getAndSet((Object) null);
        } else {
            if (this.f53880m == null) {
                this.f53880m = m36614y("soda-lightweight-%d", 5);
            }
            ((C59052c) ((C59052c) f53868a.mo56224b()).mo56372aa(47598)).mo56388r("Starting new shared resources timeout future for %d seconds.", arVar.f169860a);
            czVar = (C60872cz) this.f53874g.getAndSet(this.f53880m.mo29164d(new C19339g(this, arVar), arVar.f169860a, TimeUnit.SECONDS));
        }
        if (czVar != null) {
            czVar.cancel(false);
        }
    }

    /* renamed from: t */
    public final void mo24353t() {
        if (this.f53871d == 0) {
            throw new IllegalStateException("SODA Android is not initialized");
        }
    }

    /* renamed from: u */
    public final synchronized boolean mo24354u(C66999hh hhVar) {
        if (!this.f53876i) {
            return true;
        }
        return nativeHasConfigChanged(this.f53871d, hhVar.toByteArray());
    }

    /* renamed from: v */
    public final synchronized boolean mo24355v() {
        return this.f53876i;
    }

    /* renamed from: w */
    public final boolean mo24356w() {
        return this.f53870c.get();
    }

    /* renamed from: x */
    public final void mo24357x(int i) {
        mo24353t();
        if (!(!this.f53881n.mo56113h() || i == 6 || i == 5)) {
            C37500dg a = ((C19343k) this.f53881n.mo56107c()).mo24471a();
            C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
            C62940bt btVar = C67072k.f182319e;
            C67045j jVar = (C67045j) C67072k.f182318d.createBuilder();
            jVar.copyOnWrite();
            C67072k kVar = (C67072k) jVar.instance;
            kVar.f182322b = i - 1;
            kVar.f182321a |= 1;
            C37501dh dhVar = (C37501dh) C37502di.f99561c.createBuilder();
            dhVar.copyOnWrite();
            C37502di diVar = (C37502di) dhVar.instance;
            a.getClass();
            diVar.f99564b = a;
            diVar.f99563a |= 1;
            jVar.copyOnWrite();
            C67072k kVar2 = (C67072k) jVar.instance;
            C37502di diVar2 = (C37502di) dhVar.build();
            diVar2.getClass();
            kVar2.f182323c = diVar2;
            kVar2.f182321a |= 2;
            knVar.mo58885m(btVar, (C67072k) jVar.build());
            synchronized (this.f53869b) {
                this.f53872e.mo23782t((C67087ko) knVar.build());
            }
        }
        nativeStartAsr(this.f53871d, i - 1);
    }

    public Soda(C19347o oVar, boolean z) {
        C19242ae.m36689a(z, (Context) null);
        m36615z();
        this.f53872e = oVar;
        this.f53881n = C58836b.f156633a;
    }

    public Soda(C60887da daVar, C60888db dbVar) {
        C19242ae.m36689a(false, (Context) null);
        m36615z();
        this.f53879l = daVar;
        this.f53880m = dbVar;
        this.f53881n = C58836b.f156633a;
    }
}

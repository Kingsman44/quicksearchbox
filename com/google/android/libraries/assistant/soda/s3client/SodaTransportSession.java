package com.google.android.libraries.assistant.soda.s3client;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5218j.C67113ln;

/* compiled from: PG */
public class SodaTransportSession {

    /* renamed from: b */
    private static final C59071e f54157b = C59071e.m91332i("com.google.android.libraries.assistant.soda.s3client.SodaTransportSession");

    /* renamed from: a */
    public long f54158a;

    /* renamed from: c */
    private final SodaTransportFactory f54159c;

    /* renamed from: d */
    private C19361j f54160d;

    public SodaTransportSession(SodaTransportFactory sodaTransportFactory) {
        this.f54159c = sodaTransportFactory;
    }

    /* access modifiers changed from: protected */
    public native void nativeHandleError(long j, String str);

    /* access modifiers changed from: protected */
    public native void nativeHandleResponse(long j, byte[] bArr);

    /* access modifiers changed from: protected */
    public native void nativeHandleState(long j, int i);

    public final void sendRequest(byte[] bArr) {
        if (this.f54160d != null) {
            try {
                C62921ba a = C62921ba.m95368a();
                this.f54160d.mo24495f((C66607ce) C62942bv.parseFrom((C62942bv) C66607ce.f181191f, bArr, a));
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f54157b.mo56226d()).mo56382g(e)).mo56372aa(47748)).mo56386p("S3Request parsing failed.");
            }
        }
    }

    public final boolean start(long j, byte[] bArr) {
        if (j == 0) {
            return false;
        }
        this.f54158a = j;
        try {
            C62921ba a = C62921ba.m95368a();
            C19361j a2 = this.f54159c.mo24484a((C67113ln) C62942bv.parseFrom((C62942bv) C67113ln.f182444b, bArr, a));
            this.f54160d = a2;
            if (a2 != null) {
                return a2.mo24497h(this);
            }
            return false;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f54157b.mo56226d()).mo56382g(e)).mo56372aa(47749)).mo56386p("SodaS3TransportConfig parsing failed.");
            return false;
        }
    }

    public final void stop() {
        C19361j jVar = this.f54160d;
        if (jVar == null) {
            this.f54158a = 0;
            return;
        }
        jVar.mo24496g();
        this.f54160d = null;
        this.f54158a = 0;
    }

    /* renamed from: a */
    public final void mo24485a(int i) {
        long j = this.f54158a;
        if (j != 0) {
            nativeHandleState(j, i - 1);
            return;
        }
        throw new IllegalStateException("No native delegate. Was start/stop called?");
    }
}

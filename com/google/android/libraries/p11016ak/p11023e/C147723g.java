package com.google.android.libraries.p11016ak.p11023e;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.concurrent.ScheduledExecutorService;
import p5285d.p5290b.p5291a.p5292a.C68209v;
import p5488io.grpc.C70888j;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.ak.e.g */
/* compiled from: PG */
public final class C147723g extends C70888j {

    /* renamed from: a */
    public static final C59071e f398627a = C59071e.m91332i("com.google.android.libraries.ak.e.g");

    /* renamed from: b */
    public final ScheduledExecutorService f398628b;

    /* renamed from: c */
    public final C62910ar f398629c = C62948a.f169987b;

    /* renamed from: d */
    public C58485gu f398630d = C58485gu.m89845m();

    /* renamed from: e */
    public C68209v f398631e = C68209v.f184561d;

    /* renamed from: f */
    public Status f398632f = Status.f186902OK;

    public C147723g(ScheduledExecutorService scheduledExecutorService) {
        this.f398628b = scheduledExecutorService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p5488io.grpc.C70898m mo39510a(p5488io.grpc.C70338di r4, p5488io.grpc.C70851i r5) {
        /*
            r3 = this;
            java.lang.String r4 = r4.f187497b
            java.lang.String r4 = p5488io.grpc.C70338di.m102601b(r4)
            int r5 = r4.hashCode()
            r0 = -2038511465(0xffffffff867ec897, float:-4.791946E-35)
            r1 = 2
            r2 = 1
            if (r5 == r0) goto L_0x0030
            r0 = -1855500321(0xffffffff91674fdf, float:-1.8247299E-28)
            if (r5 == r0) goto L_0x0026
            r0 = 1534907467(0x5b7cd44b, float:7.1165113E16)
            if (r5 == r0) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r5 = "CheckClientOptions"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x003a
            r4 = 2
            goto L_0x003b
        L_0x0026:
            java.lang.String r5 = "ListVoices"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x003a
            r4 = 1
            goto L_0x003b
        L_0x0030:
            java.lang.String r5 = "GenerateAudioDocStream"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x003a
            r4 = 0
            goto L_0x003b
        L_0x003a:
            r4 = -1
        L_0x003b:
            if (r4 == 0) goto L_0x0057
            if (r4 == r2) goto L_0x0051
            if (r4 != r1) goto L_0x0049
            com.google.android.libraries.ak.e.c r4 = new com.google.android.libraries.ak.e.c
            d.b.a.a.v r5 = r3.f398631e
            r4.<init>(r5)
            return r4
        L_0x0049:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Unrecognized method"
            r4.<init>(r5)
            throw r4
        L_0x0051:
            com.google.android.libraries.ak.e.f r4 = new com.google.android.libraries.ak.e.f
            r4.<init>()
            return r4
        L_0x0057:
            com.google.android.libraries.ak.e.e r4 = new com.google.android.libraries.ak.e.e
            com.google.android.libraries.ak.e.a r5 = new com.google.android.libraries.ak.e.a
            r5.<init>(r3)
            com.google.android.libraries.ak.e.b r0 = new com.google.android.libraries.ak.e.b
            r0.<init>(r3)
            r4.<init>(r3, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p11016ak.p11023e.C147723g.mo39510a(io.grpc.di, io.grpc.i):io.grpc.m");
    }

    /* renamed from: b */
    public final String mo39511b() {
        return BuildConfig.FLAVOR;
    }
}

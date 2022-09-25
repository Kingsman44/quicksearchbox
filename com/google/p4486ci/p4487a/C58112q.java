package com.google.p4486ci.p4487a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60908dv;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.ci.a.q */
/* compiled from: PG */
public final class C58112q implements C58114s {

    /* renamed from: a */
    public String f155341a;

    /* renamed from: b */
    public C58118w f155342b;

    /* renamed from: c */
    private String f155343c;

    /* renamed from: d */
    private String f155344d;

    /* renamed from: e */
    private C58100e f155345e;

    /* renamed from: f */
    private String f155346f;

    /* renamed from: g */
    private final C58097b f155347g;

    /* renamed from: h */
    private double f155348h;

    /* renamed from: i */
    private int f155349i = 1;

    /* renamed from: j */
    private long f155350j;

    /* renamed from: k */
    private final Random f155351k;

    /* renamed from: l */
    private int f155352l;

    public C58112q(String str, String str2, C58100e eVar, C58097b bVar, String str3, boolean z) {
        if (!z) {
            this.f155343c = str;
            this.f155344d = str2;
            this.f155345e = eVar == null ? new C58100e() : eVar;
            this.f155346f = str3;
        } else {
            this.f155341a = str;
        }
        this.f155347g = bVar;
        this.f155348h = C59203do.f157270a;
        this.f155350j = 1;
        this.f155351k = new Random();
    }

    /* renamed from: e */
    private final C58101f m88890e(C58100e eVar, String str, C58097b bVar) {
        C60870cx a;
        C58100e eVar2 = new C58100e();
        eVar2.mo54654e("X-Goog-Upload-Protocol", "resumable");
        eVar2.mo54654e("X-Goog-Upload-Command", str);
        for (String str2 : eVar.mo54652c()) {
            for (String e : eVar.mo54651b(str2)) {
                eVar2.mo54654e(str2, e);
            }
        }
        C58114s a2 = C58104i.m88864a(str.equals("start") ? this.f155343c : this.f155341a, str.contains("start") ? this.f155344d : "PUT", eVar2, bVar);
        if (this.f155342b != null && !str.equals("start")) {
            synchronized (this) {
                a2.mo54663f(new C58111p(this.f155342b), this.f155352l);
            }
        }
        synchronized (this) {
            a = a2.mo54658a();
        }
        try {
            C58117v vVar = (C58117v) a.get();
            if (!vVar.mo54671b()) {
                return vVar.f155366b;
            }
            if (vVar.f155365a.f155364a != C58115t.CANCELED) {
                throw vVar.f155365a;
            }
            throw new C58116u(C58115t.CONNECTION_ERROR, BuildConfig.FLAVOR, (Throwable) null);
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* renamed from: g */
    private final void m88891g(C58116u uVar) {
        if (this.f155348h < 60.0d) {
            double nextDouble = this.f155351k.nextDouble();
            try {
                double d = this.f155348h;
                long j = this.f155350j;
                double d2 = (double) j;
                Double.isNaN(d2);
                this.f155348h = d + (d2 * nextDouble);
                double d3 = (double) (j * 1000);
                Double.isNaN(d3);
                Thread.sleep((long) (d3 * nextDouble));
            } catch (InterruptedException unused) {
            }
            long j2 = this.f155350j;
            this.f155350j = j2 + j2;
            return;
        }
        throw uVar;
    }

    /* renamed from: h */
    private final void m88892h() {
        if (this.f155347g.mo54643d() > this.f155347g.mo54640b()) {
            this.f155347g.mo54646g();
            m88893i();
        }
    }

    /* renamed from: i */
    private final void m88893i() {
        this.f155350j = 1;
        this.f155348h = C59203do.f157270a;
    }

    /* renamed from: j */
    private final boolean m88894j() {
        try {
            return this.f155347g.mo54648i();
        } catch (IOException e) {
            throw new C58116u(C58115t.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    /* renamed from: k */
    private static final boolean m88895k(C58101f fVar) {
        return fVar.f155302a / 100 == 4;
    }

    /* renamed from: l */
    private static final boolean m88896l(C58101f fVar) {
        String a;
        C58100e eVar = fVar.f155303b;
        if (eVar == null || (a = eVar.mo54650a("X-Goog-Upload-Status")) == null || !C58890d.m90990e("final", a)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private static final boolean m88897m(C58101f fVar) {
        String a;
        C58100e eVar = fVar.f155303b;
        if (eVar == null || (a = eVar.mo54650a("X-Goog-Upload-Status")) == null || !C58890d.m90990e("active", a) || fVar.f155302a != 200) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C60870cx mo54658a() {
        C60871cy cyVar = new C60871cy((Callable) new C58110o(this));
        C60908dv dvVar = new C60908dv();
        dvVar.mo57410b("Scotty-Uploader-ResumableTransfer-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C60908dv.m93015a(dvVar));
        newSingleThreadExecutor.submit(cyVar);
        newSingleThreadExecutor.shutdown();
        return cyVar;
    }

    /* renamed from: c */
    public final String mo54660c() {
        return this.f155341a;
    }

    /* renamed from: d */
    public final C58101f mo54669d() {
        synchronized (this) {
        }
        m88893i();
        while (true) {
            try {
                C58101f e = m88890e(this.f155345e, "start", new C58113r(C58837ba.m90858g(this.f155346f)));
                if (m88896l(e)) {
                    return e;
                }
                if (m88897m(e)) {
                    C58100e eVar = e.f155303b;
                    String a = eVar.mo54650a("X-Goog-Upload-URL");
                    try {
                        new URL(a);
                        this.f155341a = a;
                        synchronized (this) {
                        }
                        String a2 = eVar.mo54650a("X-Goog-Upload-Chunk-Granularity");
                        if (a2 != null) {
                            try {
                                this.f155349i = Integer.parseInt(a2);
                            } catch (NumberFormatException e2) {
                                throw new C58116u(C58115t.SERVER_ERROR, "Server returned an invalid chunk granularity.", e2);
                            }
                        }
                        return mo54668b(false);
                    } catch (MalformedURLException e3) {
                        throw new C58116u(C58115t.SERVER_ERROR, "Server returned an invalid upload url.", e3);
                    }
                } else if (m88895k(e)) {
                    return e;
                } else {
                    m88891g(new C58116u(C58115t.SERVER_ERROR, e.mo54656a(), (Throwable) null));
                }
            } catch (C58116u e4) {
                if (e4.f155364a.f155363g) {
                    m88891g(e4);
                } else {
                    throw e4;
                }
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo54663f(C58118w wVar, int i) {
        this.f155342b = wVar;
        this.f155352l = 1048576;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d8 A[EDGE_INSN: B:108:0x01d8->B:90:0x01d8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01dc A[RETURN] */
    /* renamed from: b */
    public final com.google.p4486ci.p4487a.C58101f mo54668b(boolean r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0006
            r10 = r9
            goto L_0x00de
        L_0x0006:
            r10 = r9
        L_0x0007:
            boolean r1 = r10.m88894j()
            r2 = 1
            if (r1 != 0) goto L_0x0015
            com.google.ci.a.b r1 = r10.f155347g
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0066
        L_0x0015:
            com.google.ci.a.b r1 = r10.f155347g
            long r3 = r1.mo54641c()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x002b
            com.google.ci.a.b r1 = r10.f155347g
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0066
        L_0x002b:
            com.google.ci.a.a r1 = new com.google.ci.a.a     // Catch:{ IOException -> 0x01eb }
            com.google.ci.a.b r3 = r10.f155347g     // Catch:{ IOException -> 0x01eb }
            int r4 = r10.f155349i     // Catch:{ IOException -> 0x01eb }
            r1.<init>(r3, r4)     // Catch:{ IOException -> 0x01eb }
            long r3 = r1.mo54644e()
            com.google.ci.a.b r5 = r10.f155347g
            long r5 = r5.mo54641c()
            int r7 = r10.f155349i
            long r7 = (long) r7
            long r5 = r5 / r7
            long r5 = r5 * r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0060
            com.google.ci.a.b r3 = r10.f155347g
            long r3 = r3.mo54643d()
            long r5 = r1.mo54644e()
            long r3 = r3 + r5
            com.google.ci.a.b r5 = r10.f155347g
            long r5 = r5.mo54644e()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r2 = 0
            goto L_0x0062
        L_0x0060:
            com.google.ci.a.b r1 = r10.f155347g
        L_0x0062:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
        L_0x0066:
            boolean r2 = r2.booleanValue()
            boolean r3 = r10.m88894j()
            if (r3 == 0) goto L_0x0078
            if (r2 == 0) goto L_0x0075
            java.lang.String r3 = "upload, finalize"
            goto L_0x007a
        L_0x0075:
            java.lang.String r3 = "upload"
            goto L_0x007a
        L_0x0078:
            java.lang.String r3 = "finalize"
        L_0x007a:
            com.google.ci.a.w r4 = r10.f155342b
            if (r4 == 0) goto L_0x0081
            r4.mo54665c()
        L_0x0081:
            com.google.ci.a.e r4 = new com.google.ci.a.e
            r4.<init>()
            com.google.ci.a.b r5 = r10.f155347g
            long r5 = r5.mo54643d()
            java.lang.String r5 = java.lang.Long.toString(r5)
            java.lang.String r6 = "X-Goog-Upload-Offset"
            r4.mo54654e(r6, r5)
            com.google.ci.a.f r1 = r10.m88890e(r4, r3, r1)     // Catch:{ u -> 0x00d4 }
            boolean r3 = m88896l(r1)
            if (r3 == 0) goto L_0x00a0
            return r1
        L_0x00a0:
            boolean r3 = m88897m(r1)
            if (r3 == 0) goto L_0x00b7
            if (r2 != 0) goto L_0x00ad
            r10.m88892h()
            goto L_0x0007
        L_0x00ad:
            com.google.ci.a.u r10 = new com.google.ci.a.u
            com.google.ci.a.t r1 = com.google.p4486ci.p4487a.C58115t.SERVER_ERROR
            java.lang.String r2 = "Finalize call returned active state."
            r10.<init>(r1, r2, r0)
            throw r10
        L_0x00b7:
            boolean r2 = m88895k(r1)
            if (r2 == 0) goto L_0x00c5
            int r2 = r1.f155302a
            r3 = 400(0x190, float:5.6E-43)
            if (r2 != r3) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            return r1
        L_0x00c5:
            com.google.ci.a.u r2 = new com.google.ci.a.u
            com.google.ci.a.t r3 = com.google.p4486ci.p4487a.C58115t.SERVER_ERROR
            java.lang.String r1 = r1.mo54656a()
            r2.<init>(r3, r1, r0)
            r10.m88891g(r2)
            goto L_0x00de
        L_0x00d4:
            r1 = move-exception
            com.google.ci.a.t r2 = r1.f155364a
            boolean r2 = r2.f155363g
            if (r2 == 0) goto L_0x01ea
            r10.m88891g(r1)
        L_0x00de:
            com.google.ci.a.e r1 = new com.google.ci.a.e     // Catch:{ u -> 0x01dd }
            r1.<init>()     // Catch:{ u -> 0x01dd }
            java.lang.String r2 = "query"
            com.google.ci.a.r r3 = new com.google.ci.a.r     // Catch:{ u -> 0x01dd }
            java.lang.String r4 = ""
            r3.<init>((java.lang.String) r4)     // Catch:{ u -> 0x01dd }
            com.google.ci.a.f r1 = r10.m88890e(r1, r2, r3)     // Catch:{ u -> 0x01dd }
            boolean r2 = m88896l(r1)
            if (r2 != 0) goto L_0x01d8
            boolean r2 = m88897m(r1)
            if (r2 == 0) goto L_0x01c2
            com.google.ci.a.e r2 = r1.f155303b
            java.lang.String r3 = "X-Goog-Upload-Chunk-Granularity"
            java.lang.String r2 = r2.mo54650a(r3)
            if (r2 == 0) goto L_0x0118
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x010d }
            r10.f155349i = r2     // Catch:{ NumberFormatException -> 0x010d }
            goto L_0x0118
        L_0x010d:
            r10 = move-exception
            com.google.ci.a.u r0 = new com.google.ci.a.u
            com.google.ci.a.t r1 = com.google.p4486ci.p4487a.C58115t.SERVER_ERROR
            java.lang.String r2 = "Server returned an invalid chunk granularity."
            r0.<init>(r1, r2, r10)
            throw r0
        L_0x0118:
            com.google.ci.a.e r1 = r1.f155303b     // Catch:{ NumberFormatException -> 0x01b7 }
            java.lang.String r2 = "X-Goog-Upload-Size-Received"
            java.lang.String r1 = r1.mo54650a(r2)     // Catch:{ NumberFormatException -> 0x01b7 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x01b7 }
            com.google.ci.a.b r3 = r10.f155347g
            long r3 = r3.mo54640b()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0193
            com.google.ci.a.b r3 = r10.f155347g
            long r3 = r3.mo54643d()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0139
            goto L_0x013e
        L_0x0139:
            com.google.ci.a.b r3 = r10.f155347g
            r3.mo54647h()
        L_0x013e:
            com.google.ci.a.b r3 = r10.f155347g
            long r3 = r3.mo54643d()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x018e
            boolean r3 = r10.m88894j()
            if (r3 == 0) goto L_0x016a
            com.google.ci.a.b r3 = r10.f155347g     // Catch:{ IOException -> 0x015f }
            long r4 = r3.mo54643d()     // Catch:{ IOException -> 0x015f }
            long r4 = r1 - r4
            r3.mo54645f(r4)     // Catch:{ IOException -> 0x015f }
            com.google.ci.a.b r3 = r10.f155347g     // Catch:{ IOException -> 0x015f }
            r3.mo54646g()     // Catch:{ IOException -> 0x015f }
            goto L_0x013e
        L_0x015f:
            r10 = move-exception
            com.google.ci.a.u r0 = new com.google.ci.a.u
            com.google.ci.a.t r1 = com.google.p4486ci.p4487a.C58115t.REQUEST_BODY_READ_ERROR
            java.lang.String r2 = "Could not skip in the data stream."
            r0.<init>(r1, r2, r10)
            throw r0
        L_0x016a:
            com.google.ci.a.u r3 = new com.google.ci.a.u
            com.google.ci.a.t r4 = com.google.p4486ci.p4487a.C58115t.REQUEST_BODY_READ_ERROR
            com.google.ci.a.b r10 = r10.f155347g
            long r5 = r10.mo54643d()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r7 = "Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: "
            r10.<init>(r7)
            r10.append(r1)
            java.lang.String r1 = " Size: "
            r10.append(r1)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            r3.<init>(r4, r10, r0)
            throw r3
        L_0x018e:
            r10.m88892h()
            r1 = r0
            goto L_0x01d8
        L_0x0193:
            com.google.ci.a.u r3 = new com.google.ci.a.u
            com.google.ci.a.t r4 = com.google.p4486ci.p4487a.C58115t.SERVER_ERROR
            com.google.ci.a.b r10 = r10.f155347g
            long r5 = r10.mo54640b()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r7 = "The server lost bytes that were previously committed. Our offset: "
            r10.<init>(r7)
            r10.append(r5)
            java.lang.String r5 = ", server offset: "
            r10.append(r5)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r3.<init>(r4, r10, r0)
            throw r3
        L_0x01b7:
            r10 = move-exception
            com.google.ci.a.u r0 = new com.google.ci.a.u
            com.google.ci.a.t r1 = com.google.p4486ci.p4487a.C58115t.SERVER_ERROR
            java.lang.String r2 = "Failed to parse X-Goog-Upload-Size-Received header"
            r0.<init>(r1, r2, r10)
            throw r0
        L_0x01c2:
            boolean r2 = m88895k(r1)
            if (r2 != 0) goto L_0x01d8
            com.google.ci.a.u r2 = new com.google.ci.a.u
            com.google.ci.a.t r3 = com.google.p4486ci.p4487a.C58115t.SERVER_ERROR
            java.lang.String r1 = r1.mo54656a()
            r2.<init>(r3, r1, r0)
            r10.m88891g(r2)
            goto L_0x00de
        L_0x01d8:
            if (r1 != 0) goto L_0x01dc
            goto L_0x0007
        L_0x01dc:
            return r1
        L_0x01dd:
            r1 = move-exception
            com.google.ci.a.t r2 = r1.f155364a
            boolean r2 = r2.f155363g
            if (r2 == 0) goto L_0x01e9
            r10.m88891g(r1)
            goto L_0x00de
        L_0x01e9:
            throw r1
        L_0x01ea:
            throw r1
        L_0x01eb:
            r10 = move-exception
            com.google.ci.a.u r0 = new com.google.ci.a.u
            com.google.ci.a.t r1 = com.google.p4486ci.p4487a.C58115t.REQUEST_BODY_READ_ERROR
            java.lang.String r2 = "Could not create chunked data stream."
            r0.<init>(r1, r2, r10)
            goto L_0x01f7
        L_0x01f6:
            throw r0
        L_0x01f7:
            goto L_0x01f6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4486ci.p4487a.C58112q.mo54668b(boolean):com.google.ci.a.f");
    }
}

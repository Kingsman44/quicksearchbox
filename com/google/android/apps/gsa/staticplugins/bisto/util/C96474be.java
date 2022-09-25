package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.net.Uri;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.be */
/* compiled from: PG */
final class C96474be implements Runnable {

    /* renamed from: a */
    final C96473bd f269905a;

    /* renamed from: b */
    final String f269906b;

    /* renamed from: c */
    int f269907c = 0;

    /* renamed from: d */
    final /* synthetic */ StreamedMessageContentProvider f269908d;

    public C96474be(StreamedMessageContentProvider streamedMessageContentProvider, C96473bd bdVar, Uri uri) {
        this.f269908d = streamedMessageContentProvider;
        this.f269905a = bdVar;
        this.f269906b = uri.toString().substring(uri.toString().lastIndexOf(47) + 1);
    }

    /* renamed from: b */
    private final void m159852b(BufferedOutputStream bufferedOutputStream) {
        while (true) {
            int min = Math.min(16000, this.f269905a.f269903g.get() - this.f269907c);
            if (min < this.f269905a.f269901e.remaining()) {
                if (min > 0) {
                    C58976aa aaVar = C58975e.f156826a;
                    this.f269905a.f269901e.capacity();
                    this.f269905a.f269901e.position();
                    if (!this.f269905a.f269901e.hasArray()) {
                        mo90167a();
                        break;
                    }
                    byte[] array = this.f269905a.f269901e.array();
                    try {
                        this.f269905a.f269899c.write(array, this.f269907c, min);
                        if (bufferedOutputStream != null && StreamedMessageContentProvider.f269808c) {
                            try {
                                bufferedOutputStream.write(array, this.f269907c, min);
                            } catch (IOException e) {
                                C59104x c = StreamedMessageContentProvider.f269806a.mo56225c();
                                c.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
                                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17195)).mo56389s("IOException writing to recording file e=%s", e.getMessage());
                            }
                        }
                        this.f269907c += min;
                    } catch (IOException unused) {
                        C59104x d = StreamedMessageContentProvider.f269806a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
                        ((C59052c) ((C59052c) d).mo56372aa(17196)).mo56393w("Error writing to output stream! Buffer capacity = %d and Buffer position = %d", this.f269905a.f269901e.capacity(), this.f269905a.f269901e.position());
                        mo90167a();
                    }
                } else if (this.f269905a.f269897a.get()) {
                    mo90167a();
                } else {
                    this.f269908d.f269812g.mo29164d(this, 10, TimeUnit.MILLISECONDS);
                    return;
                }
            } else {
                C59104x d2 = StreamedMessageContentProvider.f269806a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
                ((C59052c) ((C59052c) d2).mo56372aa(17197)).mo56386p("Leaving run(): Data exceeds buffer size");
                mo90167a();
                break;
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo90167a() {
        this.f269905a.mo90166a();
        this.f269905a.f269904h.set(false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0079 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = "StreamedMessageCP"
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.util.bd r1 = r10.f269905a
            java.nio.ByteBuffer r1 = r1.f269901e
            r1.position()
            boolean r1 = com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider.f269808c     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r2 = 0
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider.f269809d     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            boolean r1 = com.google.common.base.C58837ba.m90859h(r1)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            if (r1 == 0) goto L_0x0036
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider.f269806a     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r1.mo56378ag(r3, r0)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r3 = 17202(0x4332, float:2.4105E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            java.lang.String r3 = "Local recording is set but external recording directory is not set!"
            r1.mo56386p(r3)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r10.m159852b(r2)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            return
        L_0x0036:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            java.io.File r3 = new java.io.File     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            java.lang.String r4 = com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider.f269809d     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            java.lang.String r8 = r10.f269906b     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r9 = 0
            r7[r9] = r8     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            java.lang.String r8 = "%s-search.raw"
            java.lang.String r5 = java.lang.String.format(r5, r8, r7)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r3.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r2.<init>(r3)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r1.<init>(r2)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            r10.m159852b(r1)     // Catch:{ all -> 0x005e }
            r1.close()     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            return
        L_0x005e:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0079
        L_0x0063:
            r1 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0079 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r9] = r4     // Catch:{ Exception -> 0x0079 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x0079 }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0079 }
            r4[r9] = r1     // Catch:{ Exception -> 0x0079 }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            throw r2     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
        L_0x007a:
            r10.m159852b(r2)     // Catch:{ RuntimeException -> 0x0099, IOException -> 0x007e }
            return
        L_0x007e:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider.f269806a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r0)
            java.lang.String r0 = r1.getMessage()
            r3 = 17200(0x4330, float:2.4102E-41)
            java.lang.String r4 = "IOException e=%s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r3)).mo56389s(r4, r0)
            r10.mo90167a()
            return
        L_0x0099:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider.f269806a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r0)
            java.lang.String r0 = "RuntimeException in copying run() loop"
            r3 = 17199(0x432f, float:2.4101E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r3)).mo56386p(r0)
            r10.mo90167a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.util.C96474be.run():void");
    }
}

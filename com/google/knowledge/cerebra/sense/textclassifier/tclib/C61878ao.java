package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.Context;
import com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61846d;
import java.io.Closeable;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.ao */
/* compiled from: PG */
final class C61878ao implements Closeable {

    /* renamed from: a */
    public final Context f167321a;

    /* renamed from: b */
    public final C61925ch f167322b;

    /* renamed from: c */
    public C61846d f167323c;

    /* renamed from: d */
    public boolean f167324d = true;

    /* renamed from: e */
    private final C61914bx f167325e;

    /* renamed from: f */
    private C61877an f167326f;

    /* renamed from: g */
    private final C61909bs f167327g;

    public C61878ao(Context context, C61914bx bxVar, C61925ch chVar, C61909bs bsVar) {
        this.f167321a = context;
        this.f167325e = bxVar;
        this.f167322b = chVar;
        this.f167327g = bsVar;
        mo58321a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58321a() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ch r0 = r5.f167322b     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.mo58378h()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x000c
            goto L_0x0048
        L_0x000c:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bs r0 = r5.f167327g     // Catch:{ all -> 0x004a }
            int r0 = r0.mo58345a()     // Catch:{ all -> 0x004a }
            r1 = 0
            if (r0 != 0) goto L_0x0039
            com.google.knowledge.cerebra.sense.textclassifier.tclib.an r0 = r5.f167326f     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0046
            android.content.Context r0 = r5.f167321a     // Catch:{ all -> 0x004a }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x004a }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bx r2 = r5.f167325e     // Catch:{ all -> 0x004a }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.an r3 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.an     // Catch:{ all -> 0x004a }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x004a }
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SecurityException -> 0x002e }
            r4 = 1
            r0.registerContentObserver(r2, r4, r3)     // Catch:{ SecurityException -> 0x002e }
            r1 = r3
            goto L_0x0035
        L_0x002e:
            java.lang.String r0 = "ContactModelManager"
            java.lang.String r2 = "Observer cannot be registered. Permission to read contacts not granted."
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x004a }
        L_0x0035:
            r5.f167326f = r1     // Catch:{ all -> 0x004a }
            monitor-exit(r5)
            return
        L_0x0039:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.an r0 = r5.f167326f     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0046
            android.content.ContentResolver r2 = r0.f167319a     // Catch:{ all -> 0x004a }
            r2.unregisterContentObserver(r0)     // Catch:{ all -> 0x004a }
            r5.f167326f = r1     // Catch:{ all -> 0x004a }
            monitor-exit(r5)
            return
        L_0x0046:
            monitor-exit(r5)
            return
        L_0x0048:
            monitor-exit(r5)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61878ao.mo58321a():void");
    }

    public final synchronized void close() {
        C61877an anVar = this.f167326f;
        if (anVar != null) {
            anVar.f167319a.unregisterContentObserver(anVar);
            this.f167326f = null;
        }
    }
}

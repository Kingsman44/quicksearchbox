package com.google.android.gms.droidguard.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.droidguard.p10791b.C144118f;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.droidguard.internal.o */
/* compiled from: PG */
public final class C144135o implements Runnable, C143726aa, C143789cj {

    /* renamed from: c */
    private static C144135o f390440c;

    /* renamed from: a */
    public int f390441a = 0;

    /* renamed from: b */
    public final Handler f390442b;

    /* renamed from: d */
    private final LinkedBlockingQueue f390443d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final C143887ac f390444e;

    private C144135o(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        C144861c cVar = new C144861c(handlerThread.getLooper());
        this.f390442b = cVar;
        this.f390444e = new C144129i(context, cVar.getLooper(), this, this);
    }

    /* renamed from: a */
    static synchronized C144135o m234342a(Context context) {
        C144135o oVar;
        synchronized (C144135o.class) {
            if (f390440c == null) {
                f390440c = new C144135o(context);
            }
            oVar = f390440c;
        }
        return oVar;
    }

    /* renamed from: h */
    private final void m234343h(String str) {
        while (true) {
            C144133m mVar = (C144133m) this.f390443d.poll();
            if (mVar != null) {
                mVar.mo119680c(new C144132l(this, str, mVar.f390438f));
            } else {
                return;
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: i */
    private final void m234344i() {
        /*
            r26 = this;
            r7 = r26
        L_0x0002:
            java.util.concurrent.LinkedBlockingQueue r0 = r7.f390443d
            java.lang.Object r0 = r0.poll()
            r8 = r0
            com.google.android.gms.droidguard.internal.m r8 = (com.google.android.gms.droidguard.internal.C144133m) r8
            if (r8 != 0) goto L_0x0011
            r26.mo119684f()
            return
        L_0x0011:
            boolean r0 = r8.f390439g
            if (r0 != 0) goto L_0x0002
            com.google.android.gms.droidguard.b.d r9 = r8.f390438f
            r0 = 3
            com.google.android.gms.droidguard.b.f r1 = com.google.android.gms.droidguard.p10791b.C144118f.FINE
            r9.mo119665c(r0, r1)
            com.google.android.gms.common.internal.ac r0 = r7.f390444e     // Catch:{ Exception -> 0x041c }
            android.os.IInterface r0 = r0.mo119451G()     // Catch:{ Exception -> 0x041c }
            com.google.android.gms.droidguard.internal.q r0 = (com.google.android.gms.droidguard.internal.C144137q) r0     // Catch:{ Exception -> 0x041c }
            android.os.Parcel r1 = r0.mo17260gA()     // Catch:{ Exception -> 0x041c }
            r2 = 2
            android.os.Parcel r0 = r0.mo17261gT(r2, r1)     // Catch:{ Exception -> 0x041c }
            android.os.IBinder r1 = r0.readStrongBinder()     // Catch:{ Exception -> 0x041c }
            if (r1 != 0) goto L_0x0036
            r4 = 0
            goto L_0x0048
        L_0x0036:
            java.lang.String r4 = "com.google.android.gms.droidguard.internal.IDroidGuardHandle"
            android.os.IInterface r4 = r1.queryLocalInterface(r4)     // Catch:{ Exception -> 0x041c }
            boolean r5 = r4 instanceof com.google.android.gms.droidguard.internal.C144136p     // Catch:{ Exception -> 0x041c }
            if (r5 == 0) goto L_0x0043
            com.google.android.gms.droidguard.internal.p r4 = (com.google.android.gms.droidguard.internal.C144136p) r4     // Catch:{ Exception -> 0x041c }
            goto L_0x0048
        L_0x0043:
            com.google.android.gms.droidguard.internal.p r4 = new com.google.android.gms.droidguard.internal.p     // Catch:{ Exception -> 0x041c }
            r4.<init>(r1)     // Catch:{ Exception -> 0x041c }
        L_0x0048:
            r0.recycle()     // Catch:{ Exception -> 0x041c }
            com.google.android.gms.droidguard.b.f r0 = com.google.android.gms.droidguard.p10791b.C144118f.FINE     // Catch:{ Exception -> 0x041c }
            r1 = 4
            r9.mo119665c(r1, r0)     // Catch:{ Exception -> 0x041c }
            com.google.android.gms.droidguard.DroidGuardResultsRequest r0 = r8.f390437e     // Catch:{ Exception -> 0x041c }
            int r1 = r7.f390441a     // Catch:{ Exception -> 0x041c }
            android.os.Bundle r0 = r0.f390377a     // Catch:{ Exception -> 0x041c }
            java.lang.String r5 = "openHandles"
            r0.putInt(r5, r1)     // Catch:{ Exception -> 0x041c }
            java.lang.String r0 = r8.f390436d     // Catch:{ Exception -> 0x041c }
            com.google.android.gms.droidguard.DroidGuardResultsRequest r1 = r8.f390437e     // Catch:{ Exception -> 0x041c }
            android.os.Parcel r5 = r4.mo17260gA()     // Catch:{ Exception -> 0x041c }
            r5.writeString(r0)     // Catch:{ Exception -> 0x041c }
            com.google.android.p445a.C8850c.m23497f(r5, r1)     // Catch:{ Exception -> 0x041c }
            r0 = 5
            android.os.Parcel r1 = r4.mo17261gT(r0, r5)     // Catch:{ Exception -> 0x041c }
            android.os.Parcelable$Creator r5 = com.google.android.gms.droidguard.internal.DroidGuardInitReply.CREATOR     // Catch:{ Exception -> 0x041c }
            android.os.Parcelable r5 = com.google.android.p445a.C8850c.m23492a(r1, r5)     // Catch:{ Exception -> 0x041c }
            com.google.android.gms.droidguard.internal.DroidGuardInitReply r5 = (com.google.android.gms.droidguard.internal.DroidGuardInitReply) r5     // Catch:{ Exception -> 0x041c }
            r1.recycle()     // Catch:{ Exception -> 0x041c }
            r1 = 1
            if (r5 != 0) goto L_0x0089
            java.lang.String r6 = r8.f390436d     // Catch:{ Exception -> 0x041c }
            android.os.Parcel r10 = r4.mo17260gA()     // Catch:{ Exception -> 0x041c }
            r10.writeString(r6)     // Catch:{ Exception -> 0x041c }
            r4.mo17263hf(r1, r10)     // Catch:{ Exception -> 0x041c }
        L_0x0089:
            com.google.android.gms.droidguard.b.f r6 = com.google.android.gms.droidguard.p10791b.C144118f.FINE     // Catch:{ Exception -> 0x041c }
            r9.mo119665c(r0, r6)     // Catch:{ Exception -> 0x041c }
            if (r5 == 0) goto L_0x03f7
            com.google.android.gms.common.internal.ac r0 = r7.f390444e     // Catch:{ Exception -> 0x03f3 }
            android.content.Context r0 = r0.f390156t     // Catch:{ Exception -> 0x03f3 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x03f3 }
            r6.<init>()     // Catch:{ Exception -> 0x03f3 }
            com.google.android.gms.droidguard.a.e r10 = new com.google.android.gms.droidguard.a.e     // Catch:{ Exception -> 0x03f3 }
            r10.<init>()     // Catch:{ Exception -> 0x03f3 }
            com.google.android.gms.droidguard.a.c r11 = com.google.android.gms.droidguard.p10790a.C144110k.f390390a     // Catch:{ Exception -> 0x03f3 }
            android.os.Parcelable r11 = r5.f390403b     // Catch:{ Exception -> 0x03f3 }
            android.os.ParcelFileDescriptor r5 = r5.f390402a     // Catch:{ Exception -> 0x03f3 }
            if (r11 == 0) goto L_0x03e3
            if (r5 != 0) goto L_0x00aa
            goto L_0x03e3
        L_0x00aa:
            r12 = r11
            android.os.Bundle r12 = (android.os.Bundle) r12     // Catch:{ all -> 0x03d3 }
            java.lang.String r13 = "h"
            java.lang.String r12 = r12.getString(r13)     // Catch:{ all -> 0x03d3 }
            if (r12 == 0) goto L_0x03c5
            com.google.android.gms.droidguard.a.i r13 = new com.google.android.gms.droidguard.a.i     // Catch:{ all -> 0x03d3 }
            r13.<init>(r12)     // Catch:{ all -> 0x03d3 }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r12 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ all -> 0x03d3 }
            r12.<init>(r5)     // Catch:{ all -> 0x03d3 }
            com.google.android.gms.droidguard.a.c r14 = com.google.android.gms.droidguard.p10790a.C144110k.f390390a     // Catch:{ all -> 0x03b5 }
            monitor-enter(r14)     // Catch:{ all -> 0x03b5 }
            com.google.android.gms.droidguard.a.c r1 = com.google.android.gms.droidguard.p10790a.C144110k.f390390a     // Catch:{ a -> 0x00e7 }
            java.lang.Object r1 = r1.mo119654a(r13)     // Catch:{ a -> 0x00e7 }
            if (r1 != 0) goto L_0x00d3
            com.google.android.gms.droidguard.a.h r1 = com.google.android.gms.droidguard.p10790a.C144105f.m234308e(r13, r0, r6)     // Catch:{ a -> 0x00e7 }
            if (r1 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r1 = 0
            goto L_0x00d4
        L_0x00d3:
            r1 = 1
        L_0x00d4:
            monitor-exit(r14)     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x00d8
            goto L_0x00e8
        L_0x00d8:
            r17 = r4
            r19 = r5
            r18 = r8
            goto L_0x020d
        L_0x00e0:
            r0 = move-exception
            r19 = r5
            r18 = r8
            goto L_0x03af
        L_0x00e7:
            monitor-exit(r14)     // Catch:{ all -> 0x00e0 }
        L_0x00e8:
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x03b5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03b5 }
            com.google.android.gms.droidguard.a.d r14 = new com.google.android.gms.droidguard.a.d     // Catch:{ all -> 0x03b5 }
            java.io.File r15 = com.google.android.gms.droidguard.p10790a.C144105f.m234304a(r0)     // Catch:{ all -> 0x03b5 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x03b5 }
            java.lang.String r2 = ".apk"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x03b5 }
            r14.<init>(r15, r1)     // Catch:{ all -> 0x03b5 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x039d, all -> 0x0397 }
            java.io.File r2 = r14.f390381b     // Catch:{ Exception -> 0x039d, all -> 0x0397 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x039d, all -> 0x0397 }
            java.nio.channels.FileChannel r2 = p3186j$.wrapper.java.p3189io.FileInputStreamWrapper.getChannel(r12)     // Catch:{ all -> 0x0385 }
            java.nio.channels.FileChannel r15 = r1.getChannel()     // Catch:{ all -> 0x0371 }
            r18 = 0
            long r20 = r2.size()     // Catch:{ all -> 0x035d }
            r16 = r15
            r17 = r2
            r16.transferFrom(r17, r18, r20)     // Catch:{ all -> 0x035d }
            monitor-enter(r6)     // Catch:{ all -> 0x035d }
            com.google.android.gms.droidguard.a.h r3 = com.google.android.gms.droidguard.p10790a.C144105f.m234307d(r0, r6)     // Catch:{ all -> 0x034f }
            r17 = r4
            com.google.android.gms.droidguard.a.d r4 = r3.f390386a     // Catch:{ all -> 0x034f }
            java.io.File r4 = r4.f390380a     // Catch:{ all -> 0x034f }
            r6.add(r4)     // Catch:{ all -> 0x034f }
            com.google.android.gms.droidguard.a.d r4 = r3.f390386a     // Catch:{ all -> 0x034f }
            java.io.File r4 = r4.f390380a     // Catch:{ all -> 0x034f }
            boolean r18 = r4.exists()     // Catch:{ all -> 0x034f }
            if (r18 != 0) goto L_0x0144
            boolean r4 = r4.mkdirs()     // Catch:{ all -> 0x034f }
            if (r4 == 0) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            r19 = r5
            r18 = r8
            goto L_0x032d
        L_0x0144:
            java.io.File r4 = r3.f390387b     // Catch:{ all -> 0x034f }
            boolean r4 = r4.exists()     // Catch:{ all -> 0x034f }
            if (r4 != 0) goto L_0x0154
            java.io.File r4 = r3.f390387b     // Catch:{ all -> 0x034f }
            boolean r4 = r4.mkdirs()     // Catch:{ all -> 0x034f }
            if (r4 == 0) goto L_0x013e
        L_0x0154:
            java.io.File r4 = r3.f390388c     // Catch:{ IOException -> 0x013e }
            boolean r4 = r4.exists()     // Catch:{ IOException -> 0x013e }
            if (r4 != 0) goto L_0x0164
            java.io.File r4 = r3.f390388c     // Catch:{ IOException -> 0x013e }
            boolean r4 = r4.createNewFile()     // Catch:{ IOException -> 0x013e }
            if (r4 == 0) goto L_0x013e
        L_0x0164:
            java.io.File r4 = r14.f390381b     // Catch:{ all -> 0x034f }
            r18 = r8
            com.google.android.gms.droidguard.a.d r8 = r3.f390386a     // Catch:{ all -> 0x0329 }
            java.io.File r8 = r8.f390381b     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.p10790a.C144105f.m234305b(r4, r8)     // Catch:{ all -> 0x0329 }
            java.lang.String r4 = r13.f390389a     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.a.h r4 = com.google.android.gms.droidguard.p10790a.C144105f.m234310g(r4, r0)     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.a.d r8 = r4.f390386a     // Catch:{ all -> 0x0329 }
            java.io.File r8 = r8.f390380a     // Catch:{ all -> 0x0329 }
            boolean r8 = r8.exists()     // Catch:{ all -> 0x0329 }
            if (r8 == 0) goto L_0x0195
            com.google.android.gms.droidguard.a.h r8 = com.google.android.gms.droidguard.p10790a.C144105f.m234307d(r0, r6)     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.a.d r7 = r8.f390386a     // Catch:{ all -> 0x0329 }
            java.io.File r7 = r7.f390380a     // Catch:{ all -> 0x0329 }
            r6.add(r7)     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.a.d r7 = r4.f390386a     // Catch:{ all -> 0x0329 }
            java.io.File r7 = r7.f390380a     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.a.d r8 = r8.f390386a     // Catch:{ all -> 0x0329 }
            java.io.File r8 = r8.f390380a     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.p10790a.C144105f.m234305b(r7, r8)     // Catch:{ all -> 0x0329 }
        L_0x0195:
            com.google.android.gms.droidguard.p10790a.C144105f.m234306c(r3)     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.a.d r3 = r3.f390386a     // Catch:{ all -> 0x0329 }
            java.io.File r3 = r3.f390380a     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.a.d r4 = r4.f390386a     // Catch:{ all -> 0x0329 }
            java.io.File r4 = r4.f390380a     // Catch:{ all -> 0x0329 }
            com.google.android.gms.droidguard.p10790a.C144105f.m234305b(r3, r4)     // Catch:{ all -> 0x0329 }
            java.io.File r3 = com.google.android.gms.droidguard.p10790a.C144105f.m234304a(r0)     // Catch:{ all -> 0x0329 }
            java.lang.String[] r3 = r3.list()     // Catch:{ all -> 0x0329 }
            java.lang.Object r3 = com.google.common.base.C58893dc.m90996a(r3)     // Catch:{ all -> 0x0329 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x0329 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0329 }
            int r4 = r3.length     // Catch:{ all -> 0x0329 }
            r19 = r5
            r5 = 0
        L_0x01b9:
            if (r5 >= r4) goto L_0x01f1
            r20 = r4
            r4 = r3[r5]     // Catch:{ all -> 0x034d }
            com.google.android.gms.droidguard.a.h r4 = com.google.android.gms.droidguard.p10790a.C144105f.m234310g(r4, r0)     // Catch:{ all -> 0x034d }
            boolean r21 = r4.mo119655a()     // Catch:{ all -> 0x034d }
            if (r21 != 0) goto L_0x01cc
            r21 = r3
            goto L_0x01ea
        L_0x01cc:
            r21 = r3
            java.io.File r3 = r4.f390388c     // Catch:{ all -> 0x034d }
            boolean r22 = r3.exists()     // Catch:{ all -> 0x034d }
            if (r22 == 0) goto L_0x01e3
            long r22 = r3.lastModified()     // Catch:{ all -> 0x034d }
            r24 = 1209600000(0x48190800, double:5.97621805E-315)
            long r22 = r22 + r24
            int r3 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r3 < 0) goto L_0x01ea
        L_0x01e3:
            com.google.android.gms.droidguard.a.d r3 = r4.f390386a     // Catch:{ all -> 0x034d }
            java.io.File r3 = r3.f390380a     // Catch:{ all -> 0x034d }
            com.google.android.gms.droidguard.p10791b.C144115c.m234321a(r3)     // Catch:{ all -> 0x034d }
        L_0x01ea:
            int r5 = r5 + 1
            r4 = r20
            r3 = r21
            goto L_0x01b9
        L_0x01f1:
            com.google.android.gms.droidguard.p10790a.C144105f.m234309f(r6)     // Catch:{ all -> 0x0358 }
            monitor-exit(r6)     // Catch:{ all -> 0x0358 }
            if (r15 == 0) goto L_0x01fa
            r15.close()     // Catch:{ all -> 0x036f }
        L_0x01fa:
            if (r2 == 0) goto L_0x01ff
            r2.close()     // Catch:{ all -> 0x0383 }
        L_0x01ff:
            r1.close()     // Catch:{ Exception -> 0x0395 }
            java.io.File r1 = r14.f390381b     // Catch:{ all -> 0x03b1 }
            r1.delete()     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.droidguard.b.f r1 = com.google.android.gms.droidguard.p10791b.C144118f.FINE     // Catch:{ all -> 0x03b1 }
            r2 = 6
            r9.mo119665c(r2, r1)     // Catch:{ all -> 0x03b1 }
        L_0x020d:
            com.google.android.gms.droidguard.a.c r1 = com.google.android.gms.droidguard.p10790a.C144110k.f390390a     // Catch:{ all -> 0x03b1 }
            monitor-enter(r1)     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.droidguard.a.c r2 = com.google.android.gms.droidguard.p10790a.C144110k.f390390a     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.Object r2 = r2.mo119654a(r13)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            if (r2 == 0) goto L_0x0224
            java.lang.String r3 = r13.f390389a     // Catch:{ a -> 0x0266, ClassNotFoundException -> 0x0315 }
            com.google.android.gms.droidguard.a.h r3 = com.google.android.gms.droidguard.p10790a.C144105f.m234310g(r3, r0)     // Catch:{ a -> 0x0266, ClassNotFoundException -> 0x0315 }
            com.google.android.gms.droidguard.p10790a.C144105f.m234306c(r3)     // Catch:{ a -> 0x0266, ClassNotFoundException -> 0x0315 }
            goto L_0x0266
        L_0x0224:
            com.google.android.gms.droidguard.a.h r2 = com.google.android.gms.droidguard.p10790a.C144105f.m234308e(r13, r0, r6)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            if (r2 == 0) goto L_0x02f5
            com.google.android.gms.droidguard.a.d r3 = r2.f390386a     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.io.File r3 = r3.f390381b     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            boolean r3 = com.google.android.gms.droidguard.p10790a.C144110k.m234313a(r3, r10)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            if (r3 == 0) goto L_0x02e6
            com.google.android.gms.droidguard.b.f r3 = com.google.android.gms.droidguard.p10791b.C144118f.FINE     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            r4 = 7
            r9.mo119665c(r4, r3)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            dalvik.system.DexClassLoader r3 = new dalvik.system.DexClassLoader     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            com.google.android.gms.droidguard.a.d r4 = r2.f390386a     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.io.File r4 = r4.f390381b     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.io.File r2 = r2.f390387b     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.ClassLoader r5 = r0.getClassLoader()     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            r6 = 0
            r3.<init>(r4, r2, r6, r5)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            com.google.android.gms.droidguard.b.f r2 = com.google.android.gms.droidguard.p10791b.C144118f.FINE     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            r4 = 8
            r9.mo119665c(r4, r2)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.String r2 = "com.google.ccc.abuse.droidguard.DroidGuard"
            java.lang.Class r2 = r3.loadClass(r2)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            com.google.android.gms.droidguard.a.c r3 = com.google.android.gms.droidguard.p10790a.C144110k.f390390a     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.util.Map r3 = r3.f390379a     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            r3.put(r13, r2)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
        L_0x0266:
            monitor-exit(r1)     // Catch:{ all -> 0x0313 }
            com.google.android.gms.droidguard.b.f r1 = com.google.android.gms.droidguard.p10791b.C144118f.FINE     // Catch:{ all -> 0x03b1 }
            r3 = 9
            r9.mo119665c(r3, r1)     // Catch:{ all -> 0x03b1 }
            r1 = 2
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x02df }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r4 = 0
            r3[r4] = r1     // Catch:{ Exception -> 0x02df }
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            r5 = 1
            r3[r5] = r1     // Catch:{ Exception -> 0x02df }
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x02df }
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02df }
            r2[r4] = r0     // Catch:{ Exception -> 0x02df }
            r2[r5] = r11     // Catch:{ Exception -> 0x02df }
            java.lang.Object r0 = r1.newInstance(r2)     // Catch:{ Exception -> 0x02df }
            com.google.android.gms.droidguard.b.f r1 = com.google.android.gms.droidguard.p10791b.C144118f.FINE     // Catch:{ all -> 0x03b1 }
            r2 = 10
            r9.mo119665c(r2, r1)     // Catch:{ all -> 0x03b1 }
            java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r2 = "init"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x02d8 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{ Exception -> 0x02d8 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x02d8 }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ Exception -> 0x02d8 }
            com.google.common.base.C58893dc.m90996a(r1)     // Catch:{ Exception -> 0x02d8 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x02d8 }
            r1.booleanValue()     // Catch:{ Exception -> 0x02d8 }
            com.google.android.gms.droidguard.b.f r1 = com.google.android.gms.droidguard.p10791b.C144118f.FINE     // Catch:{ all -> 0x03b1 }
            r2 = 11
            r9.mo119665c(r2, r1)     // Catch:{ all -> 0x03b1 }
            java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r2 = "close"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x02d1 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{ Exception -> 0x02d1 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x02d1 }
            r1.invoke(r0, r2)     // Catch:{ Exception -> 0x02d1 }
            com.google.android.gms.droidguard.b.f r0 = com.google.android.gms.droidguard.p10791b.C144118f.FINE     // Catch:{ all -> 0x03b1 }
            r1 = 12
            r9.mo119665c(r1, r0)     // Catch:{ all -> 0x03b1 }
            r12.close()     // Catch:{ all -> 0x03d1 }
            goto L_0x03eb
        L_0x02d1:
            r0 = move-exception
            com.google.android.gms.droidguard.a.g r1 = new com.google.android.gms.droidguard.a.g     // Catch:{ all -> 0x03b1 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x03b1 }
            throw r1     // Catch:{ all -> 0x03b1 }
        L_0x02d8:
            r0 = move-exception
            com.google.android.gms.droidguard.a.g r1 = new com.google.android.gms.droidguard.a.g     // Catch:{ all -> 0x03b1 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x03b1 }
            throw r1     // Catch:{ all -> 0x03b1 }
        L_0x02df:
            r0 = move-exception
            com.google.android.gms.droidguard.a.g r1 = new com.google.android.gms.droidguard.a.g     // Catch:{ all -> 0x03b1 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x03b1 }
            throw r1     // Catch:{ all -> 0x03b1 }
        L_0x02e6:
            com.google.android.gms.droidguard.a.d r0 = r2.f390386a     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.io.File r0 = r0.f390380a     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            com.google.android.gms.droidguard.p10791b.C144115c.m234321a(r0)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.String r2 = "APK signature verification failed"
            r0.<init>(r2)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            throw r0     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
        L_0x02f5:
            com.google.android.gms.droidguard.a.g r0 = new com.google.android.gms.droidguard.a.g     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.String r2 = r13.f390389a     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            r3.<init>()     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.String r4 = "VM key "
            r3.append(r4)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            r3.append(r2)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.String r2 = " not found in the cache"
            r3.append(r2)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            java.lang.String r2 = r3.toString()     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            r0.<init>((java.lang.String) r2)     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
            throw r0     // Catch:{ a -> 0x031e, ClassNotFoundException -> 0x0315 }
        L_0x0313:
            r0 = move-exception
            goto L_0x0327
        L_0x0315:
            r0 = move-exception
            com.google.android.gms.droidguard.a.g r2 = new com.google.android.gms.droidguard.a.g     // Catch:{ all -> 0x0313 }
            java.lang.String r3 = "Couldn't load VM class"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0313 }
            throw r2     // Catch:{ all -> 0x0313 }
        L_0x031e:
            r0 = move-exception
            com.google.android.gms.droidguard.a.g r2 = new com.google.android.gms.droidguard.a.g     // Catch:{ all -> 0x0313 }
            java.lang.String r3 = "Exception in VM cache lookup"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0313 }
            throw r2     // Catch:{ all -> 0x0313 }
        L_0x0327:
            monitor-exit(r1)     // Catch:{ all -> 0x0313 }
            throw r0     // Catch:{ all -> 0x03b1 }
        L_0x0329:
            r0 = move-exception
            r19 = r5
            goto L_0x0354
        L_0x032d:
            com.google.android.gms.droidguard.a.a r0 = new com.google.android.gms.droidguard.a.a     // Catch:{ all -> 0x034d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x034d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x034d }
            r4.<init>()     // Catch:{ all -> 0x034d }
            java.lang.String r5 = "Failed to make directories for "
            r4.append(r5)     // Catch:{ all -> 0x034d }
            r4.append(r3)     // Catch:{ all -> 0x034d }
            java.lang.String r3 = "."
            r4.append(r3)     // Catch:{ all -> 0x034d }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x034d }
            r0.<init>(r3)     // Catch:{ all -> 0x034d }
            throw r0     // Catch:{ all -> 0x034d }
        L_0x034d:
            r0 = move-exception
            goto L_0x0354
        L_0x034f:
            r0 = move-exception
            r19 = r5
            r18 = r8
        L_0x0354:
            com.google.android.gms.droidguard.p10790a.C144105f.m234309f(r6)     // Catch:{ all -> 0x0358 }
            throw r0     // Catch:{ all -> 0x0358 }
        L_0x0358:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0358 }
            throw r0     // Catch:{ all -> 0x035b }
        L_0x035b:
            r0 = move-exception
            goto L_0x0362
        L_0x035d:
            r0 = move-exception
            r19 = r5
            r18 = r8
        L_0x0362:
            r3 = r0
            if (r15 == 0) goto L_0x036e
            r15.close()     // Catch:{ all -> 0x0369 }
            goto L_0x036e
        L_0x0369:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.droidguard.p10790a.C144109j.m234312a(r3, r4)     // Catch:{ all -> 0x036f }
        L_0x036e:
            throw r3     // Catch:{ all -> 0x036f }
        L_0x036f:
            r0 = move-exception
            goto L_0x0376
        L_0x0371:
            r0 = move-exception
            r19 = r5
            r18 = r8
        L_0x0376:
            r3 = r0
            if (r2 == 0) goto L_0x0382
            r2.close()     // Catch:{ all -> 0x037d }
            goto L_0x0382
        L_0x037d:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.droidguard.p10790a.C144109j.m234312a(r3, r2)     // Catch:{ all -> 0x0383 }
        L_0x0382:
            throw r3     // Catch:{ all -> 0x0383 }
        L_0x0383:
            r0 = move-exception
            goto L_0x038a
        L_0x0385:
            r0 = move-exception
            r19 = r5
            r18 = r8
        L_0x038a:
            r2 = r0
            r1.close()     // Catch:{ all -> 0x038f }
            goto L_0x0394
        L_0x038f:
            r0 = move-exception
            r1 = r0
            com.google.android.gms.droidguard.p10790a.C144109j.m234312a(r2, r1)     // Catch:{ Exception -> 0x0395 }
        L_0x0394:
            throw r2     // Catch:{ Exception -> 0x0395 }
        L_0x0395:
            r0 = move-exception
            goto L_0x03a2
        L_0x0397:
            r0 = move-exception
            r19 = r5
            r18 = r8
            goto L_0x03a9
        L_0x039d:
            r0 = move-exception
            r19 = r5
            r18 = r8
        L_0x03a2:
            com.google.android.gms.droidguard.a.l r1 = new com.google.android.gms.droidguard.a.l     // Catch:{ all -> 0x03a8 }
            r1.<init>(r0)     // Catch:{ all -> 0x03a8 }
            throw r1     // Catch:{ all -> 0x03a8 }
        L_0x03a8:
            r0 = move-exception
        L_0x03a9:
            java.io.File r1 = r14.f390381b     // Catch:{ all -> 0x03b1 }
            r1.delete()     // Catch:{ all -> 0x03b1 }
            throw r0     // Catch:{ all -> 0x03b1 }
        L_0x03af:
            monitor-exit(r14)     // Catch:{ all -> 0x03b3 }
            throw r0     // Catch:{ all -> 0x03b1 }
        L_0x03b1:
            r0 = move-exception
            goto L_0x03ba
        L_0x03b3:
            r0 = move-exception
            goto L_0x03af
        L_0x03b5:
            r0 = move-exception
            r19 = r5
            r18 = r8
        L_0x03ba:
            r1 = r0
            r12.close()     // Catch:{ all -> 0x03bf }
            goto L_0x03c4
        L_0x03bf:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.droidguard.internal.C144138r.m234351a(r1, r2)     // Catch:{ all -> 0x03d1 }
        L_0x03c4:
            throw r1     // Catch:{ all -> 0x03d1 }
        L_0x03c5:
            r19 = r5
            r18 = r8
            com.google.android.gms.droidguard.a.g r0 = new com.google.android.gms.droidguard.a.g     // Catch:{ all -> 0x03d1 }
            java.lang.String r1 = "Missing key"
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x03d1 }
            throw r0     // Catch:{ all -> 0x03d1 }
        L_0x03d1:
            r0 = move-exception
            goto L_0x03d8
        L_0x03d3:
            r0 = move-exception
            r19 = r5
            r18 = r8
        L_0x03d8:
            r1 = r0
            r19.close()     // Catch:{ all -> 0x03dd }
            goto L_0x03e2
        L_0x03dd:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.droidguard.internal.C144138r.m234351a(r1, r2)     // Catch:{ Exception -> 0x03ef }
        L_0x03e2:
            throw r1     // Catch:{ Exception -> 0x03ef }
        L_0x03e3:
            r17 = r4
            r19 = r5
            r18 = r8
            if (r19 == 0) goto L_0x03fb
        L_0x03eb:
            r19.close()     // Catch:{ Exception -> 0x03ef }
            goto L_0x03fb
        L_0x03ef:
            r0 = move-exception
            r7 = r26
            goto L_0x0419
        L_0x03f3:
            r0 = move-exception
            r7 = r26
            goto L_0x041d
        L_0x03f7:
            r17 = r4
            r18 = r8
        L_0x03fb:
            r7 = r26
            int r0 = r7.f390441a     // Catch:{ Exception -> 0x0418 }
            r1 = 1
            int r0 = r0 + r1
            r7.f390441a = r0     // Catch:{ Exception -> 0x0418 }
            com.google.android.gms.droidguard.internal.l r0 = new com.google.android.gms.droidguard.internal.l     // Catch:{ Exception -> 0x0418 }
            r8 = r18
            com.google.android.gms.droidguard.DroidGuardResultsRequest r1 = r8.f390437e     // Catch:{ Exception -> 0x041c }
            int r1 = r1.mo119651a()     // Catch:{ Exception -> 0x041c }
            long r4 = (long) r1     // Catch:{ Exception -> 0x041c }
            r1 = r0
            r2 = r26
            r3 = r17
            r6 = r9
            r1.<init>((com.google.android.gms.droidguard.internal.C144135o) r2, (com.google.android.gms.droidguard.internal.C144136p) r3, (long) r4, (com.google.android.gms.droidguard.p10791b.C144116d) r6)     // Catch:{ Exception -> 0x041c }
            goto L_0x042d
        L_0x0418:
            r0 = move-exception
        L_0x0419:
            r8 = r18
            goto L_0x041d
        L_0x041c:
            r0 = move-exception
        L_0x041d:
            com.google.android.gms.droidguard.internal.l r1 = new com.google.android.gms.droidguard.internal.l
            java.lang.String r2 = "Initialization failed: "
            java.lang.String r3 = r0.toString()
            java.lang.String r2 = r2.concat(r3)
            r1.<init>((com.google.android.gms.droidguard.internal.C144135o) r7, (java.lang.String) r2, (com.google.android.gms.droidguard.p10791b.C144116d) r9, (java.lang.Throwable) r0)
            r0 = r1
        L_0x042d:
            com.google.android.gms.droidguard.b.d r1 = r8.f390438f
            r2 = 13
            com.google.android.gms.droidguard.b.f r3 = com.google.android.gms.droidguard.p10791b.C144118f.COARSE
            r1.mo119665c(r2, r3)
            r8.mo119680c(r0)
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.droidguard.internal.C144135o.m234344i():void");
    }

    /* renamed from: b */
    public final void mo119683b(C144133m mVar) {
        mVar.f390438f.mo119665c(2, C144118f.COARSE);
        this.f390443d.offer(mVar);
        this.f390442b.post(this);
    }

    /* renamed from: d */
    public final void mo26993d(ConnectionResult connectionResult) {
        C143919bh.m233962e(this.f390442b);
        m234343h("Connection failed: ".concat(connectionResult.toString()));
    }

    /* renamed from: f */
    public final void mo119684f() {
        if (this.f390443d.isEmpty() && this.f390441a == 0 && this.f390444e.mo119467w()) {
            this.f390444e.mo118925n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo119685g(Runnable runnable) {
        if (Looper.myLooper() == this.f390442b.getLooper()) {
            runnable.run();
        } else {
            this.f390442b.post(runnable);
        }
    }

    /* renamed from: kq */
    public final void mo26991kq(Bundle bundle) {
        C143919bh.m233962e(this.f390442b);
        m234344i();
    }

    /* renamed from: kr */
    public final void mo26992kr(int i) {
        C143919bh.m233962e(this.f390442b);
        m234343h("Disconnected: " + i);
    }

    public final void run() {
        C143919bh.m233962e(this.f390442b);
        if (this.f390444e.mo119467w()) {
            m234344i();
        } else if (!this.f390444e.mo119468x() && !this.f390443d.isEmpty()) {
            this.f390444e.mo119454L();
        }
    }
}

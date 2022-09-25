package com.google.android.ssb.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.ssb.C45350g;
import com.google.android.ssb.C45351h;
import com.google.android.ssb.C45352i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.ssb.service.i */
/* compiled from: PG */
public final class C45363i implements SharedPreferences.OnSharedPreferenceChangeListener, C90991b {

    /* renamed from: a */
    public static final C59071e f118606a = C59071e.m91332i("com.google.android.ssb.service.i");

    /* renamed from: b */
    public static final C45363i f118607b = new C45363i();

    /* renamed from: c */
    final ConcurrentMap f118608c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Object f118609d = new Object();

    /* renamed from: e */
    C45352i f118610e = C45352i.f118549k;

    /* renamed from: f */
    public Context f118611f;

    /* renamed from: g */
    public C68214a f118612g;

    /* renamed from: h */
    public C68214a f118613h;

    /* renamed from: i */
    public final AtomicBoolean f118614i = new AtomicBoolean(false);

    /* renamed from: j */
    public final AtomicBoolean f118615j = new AtomicBoolean(false);

    /* renamed from: k */
    private C86127w f118616k;

    /* renamed from: l */
    private C68214a f118617l;

    /* renamed from: m */
    private C68214a f118618m;

    /* renamed from: n */
    private C68214a f118619n;

    /* renamed from: o */
    private C58833ax f118620o;

    /* renamed from: p */
    private final AtomicBoolean f118621p = new AtomicBoolean(false);

    /* renamed from: c */
    public static void m80871c(C60555uf ufVar, String str) {
        if (str != null) {
            C60548tz tzVar = (C60548tz) ufVar.toBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164199c |= 2048;
            ufVar2.f164127ah = str;
            ufVar = (C60555uf) tzVar.build();
        }
        C89949q.m146525j(ufVar, (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: e */
    public static void m80872e(C45350g gVar) {
        C22872h.m42743c(C86593a.class);
        C45363i iVar = f118607b;
        synchronized (iVar.f118609d) {
            C45350g a = C45350g.m80860a(iVar.f118610e.f118555e);
            if (a == null) {
                a = C45350g.IDLE;
            }
            if (a != gVar) {
                C45351h hVar = (C45351h) iVar.f118610e.toBuilder();
                hVar.copyOnWrite();
                C45352i iVar2 = (C45352i) hVar.instance;
                iVar2.f118555e = gVar.f118548f;
                iVar2.f118551a |= 16;
                iVar.f118610e = (C45352i) hVar.build();
                iVar.mo49380g();
            }
        }
    }

    /* renamed from: l */
    private final String m80873l() {
        C68214a aVar = this.f118617l;
        if (aVar == null) {
            return null;
        }
        return ((C86338r) aVar.mo27525b()).getString(C90507o.f253011a, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Message mo49377a(boolean z) {
        byte[] byteArray;
        Bundle bundle = new Bundle();
        synchronized (this.f118609d) {
            byteArray = this.f118610e.toByteArray();
        }
        bundle.putByteArray("ssb_service:ssb_state", byteArray);
        if (z) {
            bundle.putBoolean("ssb_service:ssb_broadcasts_account_change_to_chrome", true);
        }
        return Message.obtain((Handler) null, 3, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo49378b() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.apps.gsa.search.core.i.w r0 = r5.f118616k     // Catch:{ all -> 0x0065 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a     // Catch:{ all -> 0x0065 }
            r0.mo79725d(r5)     // Catch:{ all -> 0x0065 }
            r5.f118616k = r1     // Catch:{ all -> 0x0065 }
        L_0x000d:
            java.lang.Object r0 = r5.f118609d     // Catch:{ all -> 0x0065 }
            monitor-enter(r0)     // Catch:{ all -> 0x0065 }
            com.google.android.ssb.i r2 = r5.f118610e     // Catch:{ all -> 0x0062 }
            com.google.protobuf.bn r2 = r2.toBuilder()     // Catch:{ all -> 0x0062 }
            com.google.android.ssb.h r2 = (com.google.android.ssb.C45351h) r2     // Catch:{ all -> 0x0062 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0062 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0062 }
            com.google.android.ssb.i r3 = (com.google.android.ssb.C45352i) r3     // Catch:{ all -> 0x0062 }
            int r4 = r3.f118551a     // Catch:{ all -> 0x0062 }
            r4 = r4 & -3
            r3.f118551a = r4     // Catch:{ all -> 0x0062 }
            com.google.android.ssb.i r4 = com.google.android.ssb.C45352i.f118549k     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = r4.f118553c     // Catch:{ all -> 0x0062 }
            r3.f118553c = r4     // Catch:{ all -> 0x0062 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0062 }
            com.google.android.ssb.i r2 = (com.google.android.ssb.C45352i) r2     // Catch:{ all -> 0x0062 }
            r5.f118610e = r2     // Catch:{ all -> 0x0062 }
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            r5.f118617l = r1     // Catch:{ all -> 0x0065 }
            r5.f118612g = r1     // Catch:{ all -> 0x0065 }
            java.util.concurrent.ConcurrentMap r0 = r5.f118608c     // Catch:{ all -> 0x0065 }
            r0.clear()     // Catch:{ all -> 0x0065 }
            dagger.a r0 = r5.f118618m     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0060
            dagger.a r0 = r5.f118618m     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0065 }
            com.google.android.apps.gsa.speech.microdetection.adapter.d r0 = (com.google.android.apps.gsa.speech.microdetection.adapter.C92518d) r0     // Catch:{ all -> 0x0065 }
            boolean r0 = r0.mo87277e()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0060
            dagger.a r0 = r5.f118618m     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0065 }
            com.google.android.apps.gsa.speech.microdetection.adapter.d r0 = (com.google.android.apps.gsa.speech.microdetection.adapter.C92518d) r0     // Catch:{ all -> 0x0065 }
            r0.mo87274b()     // Catch:{ all -> 0x0065 }
            monitor-exit(r5)
            return
        L_0x0060:
            monitor-exit(r5)
            return
        L_0x0062:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ssb.service.C45363i.mo49378b():void");
    }

    /* renamed from: f */
    public final void mo49379f(boolean z) {
        this.f118621p.set(z);
        mo49382i();
    }

    /* renamed from: g */
    public final void mo49380g() {
        Iterator it = this.f118608c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!mo49383j((Messenger) entry.getKey(), mo49377a(((C45362h) entry.getValue()).f118605b))) {
                String str = ((C45362h) entry.getValue()).f118604a;
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 398;
                m80871c((C60555uf) tzVar.build(), str);
                it.remove();
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        synchronized (this.f118609d) {
            fVar.mo85279c("SsbState").mo85276a(C90752i.m148229c(this.f118610e.toString()));
            fVar.mo85279c("HotwordEnabled").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f118610e.f118552b)));
        }
        fVar.mo85279c("Attached Clients").mo85276a(C90752i.m148230d(Integer.valueOf(this.f118608c.size())));
        for (C45362h hVar : this.f118608c.values()) {
            fVar.mo85281e((Object) null).mo85279c("package").mo85276a(C90752i.m148233g(hVar.f118604a));
        }
    }

    /* renamed from: h */
    public final void mo49381h(Runnable runnable) {
        if (this.f118618m.mo27525b() != null) {
            C92518d dVar = (C92518d) this.f118618m.mo27525b();
            dVar.mo87273a(new C45361g(this, dVar, runnable));
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: i */
    public final void mo49382i() {
        boolean z = false;
        boolean z2 = this.f118614i.get() || this.f118621p.get();
        synchronized (this.f118609d) {
            C45352i iVar = this.f118610e;
            if (z2 != iVar.f118552b) {
                C45351h hVar = (C45351h) iVar.toBuilder();
                hVar.copyOnWrite();
                C45352i iVar2 = (C45352i) hVar.instance;
                iVar2.f118551a |= 1;
                iVar2.f118552b = z2;
                this.f118610e = (C45352i) hVar.build();
                z = true;
            }
        }
        if (z) {
            mo49380g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo49383j(Messenger messenger, Message message) {
        try {
            messenger.send(message);
            return true;
        } catch (RemoteException unused) {
            ((C59052c) ((C59052c) f118606a.mo56226d()).mo56372aa(54384)).mo56386p("Remote call sendSsbState failed.");
            return false;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de  */
    /* renamed from: k */
    public final synchronized void mo49384k(android.content.Context r3, com.google.android.apps.gsa.search.core.p6805i.C86127w r4, com.google.android.apps.gsa.search.core.p6805i.C86124t r5, dagger.C68214a r6, dagger.C68214a r7, dagger.C68214a r8, dagger.C68214a r9, dagger.C68214a r10, com.google.common.base.C58833ax r11) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f118611f = r3     // Catch:{ all -> 0x01bc }
            r2.f118617l = r6     // Catch:{ all -> 0x01bc }
            r2.f118612g = r7     // Catch:{ all -> 0x01bc }
            r2.f118616k = r4     // Catch:{ all -> 0x01bc }
            com.google.android.apps.gsa.search.core.i.aa r3 = r4.f232790a     // Catch:{ all -> 0x01bc }
            r3.mo79724c(r2)     // Catch:{ all -> 0x01bc }
            java.lang.String r3 = r2.m80873l()     // Catch:{ all -> 0x01bc }
            java.lang.String r3 = com.google.common.base.C58837ba.m90858g(r3)     // Catch:{ all -> 0x01bc }
            java.lang.Object r4 = r2.f118609d     // Catch:{ all -> 0x01bc }
            monitor-enter(r4)     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.i r6 = r2.f118610e     // Catch:{ all -> 0x01b9 }
            com.google.protobuf.bn r6 = r6.toBuilder()     // Catch:{ all -> 0x01b9 }
            com.google.android.ssb.h r6 = (com.google.android.ssb.C45351h) r6     // Catch:{ all -> 0x01b9 }
            r6.copyOnWrite()     // Catch:{ all -> 0x01b9 }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x01b9 }
            com.google.android.ssb.i r7 = (com.google.android.ssb.C45352i) r7     // Catch:{ all -> 0x01b9 }
            int r0 = r7.f118551a     // Catch:{ all -> 0x01b9 }
            r0 = r0 | 2
            r7.f118551a = r0     // Catch:{ all -> 0x01b9 }
            r7.f118553c = r3     // Catch:{ all -> 0x01b9 }
            r6.copyOnWrite()     // Catch:{ all -> 0x01b9 }
            com.google.protobuf.bv r3 = r6.instance     // Catch:{ all -> 0x01b9 }
            com.google.android.ssb.i r3 = (com.google.android.ssb.C45352i) r3     // Catch:{ all -> 0x01b9 }
            int r7 = r3.f118551a     // Catch:{ all -> 0x01b9 }
            r7 = r7 | 8
            r3.f118551a = r7     // Catch:{ all -> 0x01b9 }
            r7 = 1
            r3.f118554d = r7     // Catch:{ all -> 0x01b9 }
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250607aE     // Catch:{ all -> 0x01b9 }
            long r0 = r5.mo79743a(r3)     // Catch:{ all -> 0x01b9 }
            int r3 = (int) r0     // Catch:{ all -> 0x01b9 }
            r6.copyOnWrite()     // Catch:{ all -> 0x01b9 }
            com.google.protobuf.bv r5 = r6.instance     // Catch:{ all -> 0x01b9 }
            com.google.android.ssb.i r5 = (com.google.android.ssb.C45352i) r5     // Catch:{ all -> 0x01b9 }
            com.google.protobuf.ch r0 = r5.f118560j     // Catch:{ all -> 0x01b9 }
            boolean r1 = r0.mo58948c()     // Catch:{ all -> 0x01b9 }
            if (r1 != 0) goto L_0x005c
            com.google.protobuf.ch r0 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r0)     // Catch:{ all -> 0x01b9 }
            r5.f118560j = r0     // Catch:{ all -> 0x01b9 }
        L_0x005c:
            com.google.protobuf.ch r5 = r5.f118560j     // Catch:{ all -> 0x01b9 }
            r5.mo58916g(r3)     // Catch:{ all -> 0x01b9 }
            com.google.protobuf.bv r3 = r6.build()     // Catch:{ all -> 0x01b9 }
            com.google.android.ssb.i r3 = (com.google.android.ssb.C45352i) r3     // Catch:{ all -> 0x01b9 }
            r2.f118610e = r3     // Catch:{ all -> 0x01b9 }
            monitor-exit(r4)     // Catch:{ all -> 0x01b9 }
            r2.f118618m = r8     // Catch:{ all -> 0x01bc }
            r2.f118613h = r9     // Catch:{ all -> 0x01bc }
            r2.f118619n = r10     // Catch:{ all -> 0x01bc }
            r2.f118620o = r11     // Catch:{ all -> 0x01bc }
            boolean r3 = r11.mo56113h()     // Catch:{ all -> 0x01bc }
            r4 = 0
            if (r3 == 0) goto L_0x0089
            com.google.common.base.ax r3 = r2.f118620o     // Catch:{ all -> 0x01bc }
            java.lang.Object r3 = r3.mo56107c()     // Catch:{ all -> 0x01bc }
            com.google.android.apps.gsa.assistant.shared.be r3 = (com.google.android.apps.gsa.assistant.shared.be) r3     // Catch:{ all -> 0x01bc }
            boolean r3 = r3.f()     // Catch:{ all -> 0x01bc }
            if (r3 == 0) goto L_0x0089
            r3 = 1
            goto L_0x008a
        L_0x0089:
            r3 = 0
        L_0x008a:
            com.google.common.base.ax r5 = r2.f118620o     // Catch:{ all -> 0x01bc }
            boolean r5 = r5.mo56113h()     // Catch:{ all -> 0x01bc }
            if (r5 == 0) goto L_0x00a2
            com.google.common.base.ax r5 = r2.f118620o     // Catch:{ all -> 0x01bc }
            java.lang.Object r5 = r5.mo56107c()     // Catch:{ all -> 0x01bc }
            com.google.android.apps.gsa.assistant.shared.be r5 = (com.google.android.apps.gsa.assistant.shared.be) r5     // Catch:{ all -> 0x01bc }
            boolean r5 = r5.e()     // Catch:{ all -> 0x01bc }
            if (r5 == 0) goto L_0x00a2
            r5 = 1
            goto L_0x00a3
        L_0x00a2:
            r5 = 0
        L_0x00a3:
            com.google.common.base.ax r6 = r2.f118620o     // Catch:{ all -> 0x01bc }
            boolean r6 = r6.mo56113h()     // Catch:{ all -> 0x01bc }
            if (r6 == 0) goto L_0x00bb
            com.google.common.base.ax r6 = r2.f118620o     // Catch:{ all -> 0x01bc }
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ all -> 0x01bc }
            com.google.android.apps.gsa.assistant.shared.be r6 = (com.google.android.apps.gsa.assistant.shared.be) r6     // Catch:{ all -> 0x01bc }
            boolean r6 = r6.d()     // Catch:{ all -> 0x01bc }
            if (r6 == 0) goto L_0x00bb
            r6 = 1
            goto L_0x00bc
        L_0x00bb:
            r6 = 0
        L_0x00bc:
            if (r3 != 0) goto L_0x00c5
            if (r5 != 0) goto L_0x00c5
            if (r6 == 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r6 = 0
            goto L_0x00c6
        L_0x00c5:
            r6 = 1
        L_0x00c6:
            com.google.common.base.ax r8 = r2.f118620o     // Catch:{ all -> 0x01bc }
            boolean r8 = r8.mo56113h()     // Catch:{ all -> 0x01bc }
            if (r8 == 0) goto L_0x00de
            com.google.common.base.ax r8 = r2.f118620o     // Catch:{ all -> 0x01bc }
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ all -> 0x01bc }
            com.google.android.apps.gsa.assistant.shared.be r8 = (com.google.android.apps.gsa.assistant.shared.be) r8     // Catch:{ all -> 0x01bc }
            boolean r8 = r8.k()     // Catch:{ all -> 0x01bc }
            if (r8 == 0) goto L_0x00de
            r8 = 1
            goto L_0x00df
        L_0x00de:
            r8 = 0
        L_0x00df:
            com.google.common.base.ax r9 = r2.f118620o     // Catch:{ all -> 0x01bc }
            boolean r9 = r9.mo56113h()     // Catch:{ all -> 0x01bc }
            if (r9 == 0) goto L_0x00f6
            com.google.common.base.ax r9 = r2.f118620o     // Catch:{ all -> 0x01bc }
            java.lang.Object r9 = r9.mo56107c()     // Catch:{ all -> 0x01bc }
            com.google.android.apps.gsa.assistant.shared.be r9 = (com.google.android.apps.gsa.assistant.shared.be) r9     // Catch:{ all -> 0x01bc }
            boolean r9 = r9.j()     // Catch:{ all -> 0x01bc }
            if (r9 == 0) goto L_0x00f6
            r4 = 1
        L_0x00f6:
            com.google.android.ssb.b r9 = com.google.android.ssb.C45345b.f118523i     // Catch:{ all -> 0x01bc }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.a r9 = (com.google.android.ssb.C45344a) r9     // Catch:{ all -> 0x01bc }
            r9.copyOnWrite()     // Catch:{ all -> 0x01bc }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.b r10 = (com.google.android.ssb.C45345b) r10     // Catch:{ all -> 0x01bc }
            int r11 = r10.f118525a     // Catch:{ all -> 0x01bc }
            r11 = r11 | r7
            r10.f118525a = r11     // Catch:{ all -> 0x01bc }
            r10.f118526b = r6     // Catch:{ all -> 0x01bc }
            r9.copyOnWrite()     // Catch:{ all -> 0x01bc }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.b r10 = (com.google.android.ssb.C45345b) r10     // Catch:{ all -> 0x01bc }
            int r11 = r10.f118525a     // Catch:{ all -> 0x01bc }
            r11 = r11 | 2
            r10.f118525a = r11     // Catch:{ all -> 0x01bc }
            r10.f118527c = r7     // Catch:{ all -> 0x01bc }
            r9.copyOnWrite()     // Catch:{ all -> 0x01bc }
            com.google.protobuf.bv r7 = r9.instance     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.b r7 = (com.google.android.ssb.C45345b) r7     // Catch:{ all -> 0x01bc }
            int r10 = r7.f118525a     // Catch:{ all -> 0x01bc }
            r10 = r10 | 16
            r7.f118525a = r10     // Catch:{ all -> 0x01bc }
            r7.f118529e = r5     // Catch:{ all -> 0x01bc }
            dagger.a r5 = r2.f118619n     // Catch:{ all -> 0x01bc }
            java.lang.Object r5 = r5.mo27525b()     // Catch:{ all -> 0x01bc }
            com.google.android.apps.gsa.assistant.shared.bm r5 = (com.google.android.apps.gsa.assistant.shared.bm) r5     // Catch:{ all -> 0x01bc }
            java.lang.String r5 = r5.b()     // Catch:{ all -> 0x01bc }
            r9.copyOnWrite()     // Catch:{ all -> 0x01bc }
            com.google.protobuf.bv r7 = r9.instance     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.b r7 = (com.google.android.ssb.C45345b) r7     // Catch:{ all -> 0x01bc }
            r5.getClass()     // Catch:{ all -> 0x01bc }
            int r10 = r7.f118525a     // Catch:{ all -> 0x01bc }
            r10 = r10 | 8
            r7.f118525a = r10     // Catch:{ all -> 0x01bc }
            r7.f118528d = r5     // Catch:{ all -> 0x01bc }
            r9.copyOnWrite()     // Catch:{ all -> 0x01bc }
            com.google.protobuf.bv r5 = r9.instance     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.b r5 = (com.google.android.ssb.C45345b) r5     // Catch:{ all -> 0x01bc }
            int r7 = r5.f118525a     // Catch:{ all -> 0x01bc }
            r7 = r7 | 32
            r5.f118525a = r7     // Catch:{ all -> 0x01bc }
            r5.f118530f = r3     // Catch:{ all -> 0x01bc }
            r9.copyOnWrite()     // Catch:{ all -> 0x01bc }
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.b r3 = (com.google.android.ssb.C45345b) r3     // Catch:{ all -> 0x01bc }
            int r5 = r3.f118525a     // Catch:{ all -> 0x01bc }
            r5 = r5 | 64
            r3.f118525a = r5     // Catch:{ all -> 0x01bc }
            r3.f118531g = r8     // Catch:{ all -> 0x01bc }
            r9.copyOnWrite()     // Catch:{ all -> 0x01bc }
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.b r3 = (com.google.android.ssb.C45345b) r3     // Catch:{ all -> 0x01bc }
            int r5 = r3.f118525a     // Catch:{ all -> 0x01bc }
            r5 = r5 | 128(0x80, float:1.794E-43)
            r3.f118525a = r5     // Catch:{ all -> 0x01bc }
            r3.f118532h = r4     // Catch:{ all -> 0x01bc }
            com.google.protobuf.bv r3 = r9.build()     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.b r3 = (com.google.android.ssb.C45345b) r3     // Catch:{ all -> 0x01bc }
            java.lang.Object r4 = r2.f118609d     // Catch:{ all -> 0x01bc }
            monitor-enter(r4)     // Catch:{ all -> 0x01bc }
            com.google.android.ssb.i r5 = r2.f118610e     // Catch:{ all -> 0x01b6 }
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ all -> 0x01b6 }
            com.google.android.ssb.h r5 = (com.google.android.ssb.C45351h) r5     // Catch:{ all -> 0x01b6 }
            r5.copyOnWrite()     // Catch:{ all -> 0x01b6 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x01b6 }
            com.google.android.ssb.i r7 = (com.google.android.ssb.C45352i) r7     // Catch:{ all -> 0x01b6 }
            int r8 = r7.f118551a     // Catch:{ all -> 0x01b6 }
            r8 = r8 | 32
            r7.f118551a = r8     // Catch:{ all -> 0x01b6 }
            r7.f118556f = r6     // Catch:{ all -> 0x01b6 }
            r5.copyOnWrite()     // Catch:{ all -> 0x01b6 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x01b6 }
            com.google.android.ssb.i r6 = (com.google.android.ssb.C45352i) r6     // Catch:{ all -> 0x01b6 }
            r3.getClass()     // Catch:{ all -> 0x01b6 }
            r6.f118559i = r3     // Catch:{ all -> 0x01b6 }
            int r3 = r6.f118551a     // Catch:{ all -> 0x01b6 }
            r3 = r3 | 256(0x100, float:3.59E-43)
            r6.f118551a = r3     // Catch:{ all -> 0x01b6 }
            com.google.protobuf.bv r3 = r5.build()     // Catch:{ all -> 0x01b6 }
            com.google.android.ssb.i r3 = (com.google.android.ssb.C45352i) r3     // Catch:{ all -> 0x01b6 }
            r2.f118610e = r3     // Catch:{ all -> 0x01b6 }
            monitor-exit(r4)     // Catch:{ all -> 0x01b6 }
            r3 = 0
            r2.mo49381h(r3)     // Catch:{ all -> 0x01bc }
            monitor-exit(r2)
            return
        L_0x01b6:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b6 }
            throw r3     // Catch:{ all -> 0x01bc }
        L_0x01b9:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b9 }
            throw r3     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ssb.service.C45363i.mo49384k(android.content.Context, com.google.android.apps.gsa.search.core.i.w, com.google.android.apps.gsa.search.core.i.t, dagger.a, dagger.a, dagger.a, dagger.a, dagger.a, com.google.common.base.ax):void");
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (C90507o.f253011a.equals(str)) {
            String g = C58837ba.m90858g(m80873l());
            synchronized (this.f118609d) {
                C45351h hVar = (C45351h) this.f118610e.toBuilder();
                hVar.copyOnWrite();
                C45352i iVar = (C45352i) hVar.instance;
                iVar.f118551a |= 2;
                iVar.f118553c = g;
                this.f118610e = (C45352i) hVar.build();
            }
            mo49380g();
        }
    }
}

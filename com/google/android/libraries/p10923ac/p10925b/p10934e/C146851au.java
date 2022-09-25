package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147179m;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.libraries.ac.b.e.au */
/* compiled from: PG */
public final class C146851au {

    /* renamed from: a */
    public final C146847aq f396414a;

    /* renamed from: b */
    public final C146844an f396415b;

    /* renamed from: c */
    public final Map f396416c;

    /* renamed from: d */
    public volatile boolean f396417d;

    /* renamed from: e */
    private final C68214a f396418e;

    /* renamed from: f */
    private final Account f396419f;

    /* renamed from: g */
    private final C64098p f396420g;

    /* renamed from: h */
    private final C147179m f396421h;

    /* renamed from: i */
    private final C146850at f396422i;

    /* renamed from: j */
    private final C68214a f396423j;

    public C146851au(C68214a aVar, Account account, C64098p pVar, C146847aq aqVar, C147179m mVar, C146850at atVar, C146844an anVar, C146848ar arVar, C68214a aVar2) {
        this.f396418e = aVar;
        this.f396419f = account;
        this.f396420g = pVar;
        this.f396414a = aqVar;
        this.f396422i = atVar;
        this.f396421h = mVar;
        this.f396415b = anVar;
        this.f396416c = arVar.mo123760a();
        this.f396423j = aVar2;
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final void mo123763a() {
        /*
            r12 = this;
            dagger.a r0 = r12.f396418e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.ac.d.b.b.d.m r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r0
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            android.accounts.Account r3 = r12.f396419f
            r4 = 0
            r2[r4] = r3
            com.google.protos.aw.b.p r3 = r12.f396420g
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "Triggering listeners for %s, %s"
            r0.mo124066i(r3, r2)
            com.google.android.libraries.ac.b.l.m r0 = r12.f396421h     // Catch:{ IOException -> 0x01e0 }
            java.lang.Object r0 = r0.mo124004a()     // Catch:{ IOException -> 0x01e0 }
            com.google.android.libraries.ac.b.e.ao r0 = (com.google.android.libraries.p10923ac.p10925b.p10934e.C146845ao) r0     // Catch:{ IOException -> 0x01e0 }
            java.util.Map r2 = r12.f396416c     // Catch:{ all -> 0x01d2 }
            monitor-enter(r2)     // Catch:{ all -> 0x01d2 }
            java.util.Map r3 = r12.f396416c     // Catch:{ all -> 0x01cf }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x01cf }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x01cf }
        L_0x002f:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x01cf }
            if (r6 == 0) goto L_0x0054
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.e.as r6 = (com.google.android.libraries.p10923ac.p10925b.p10934e.C146849as) r6     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.e.ap r7 = r6.f396409b     // Catch:{ all -> 0x01cf }
            int r7 = r7.mo123754b()     // Catch:{ all -> 0x01cf }
            int r8 = r7 + -1
            if (r7 == 0) goto L_0x0052
            if (r8 == r5) goto L_0x004e
            if (r8 == r1) goto L_0x004a
            goto L_0x002f
        L_0x004a:
            r3.remove()     // Catch:{ all -> 0x01cf }
            goto L_0x002f
        L_0x004e:
            r6.mo123761a()     // Catch:{ all -> 0x01cf }
            goto L_0x002f
        L_0x0052:
            r1 = 0
            throw r1     // Catch:{ all -> 0x01cf }
        L_0x0054:
            com.google.android.libraries.ac.b.i.ar r3 = r0.mo123751d()     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.i.av r3 = r3.mo123903a()     // Catch:{ all -> 0x01cf }
            java.lang.Object r6 = r0.mo123750c(r3)     // Catch:{ all -> 0x01c5 }
            r3.close()     // Catch:{ all -> 0x01cf }
            java.util.Map r3 = r12.f396416c     // Catch:{ all -> 0x01cf }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x01cf }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x01cf }
        L_0x006d:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x01cf }
            if (r7 != 0) goto L_0x0198
        L_0x0073:
            com.google.android.libraries.ac.b.i.ar r3 = r0.mo123751d()     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.i.av r3 = r3.mo123903a()     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.i.m r6 = r0.mo123749b()     // Catch:{ all -> 0x018e }
            com.google.android.libraries.ac.b.i.g r6 = r6.mo123910c(r3)     // Catch:{ all -> 0x018e }
            r3.close()     // Catch:{ all -> 0x01cf }
            com.google.common.b.gu r3 = r6.f397128a     // Catch:{ all -> 0x01cf }
            com.google.common.b.sm r3 = r3.listIterator(r4)     // Catch:{ all -> 0x01cf }
        L_0x008c:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x01cf }
            if (r7 == 0) goto L_0x00d4
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x01cf }
            com.google.protobuf.MessageLite r7 = (com.google.protobuf.MessageLite) r7     // Catch:{ all -> 0x01cf }
            java.util.Map r8 = r12.f396416c     // Catch:{ all -> 0x01cf }
            java.util.Collection r8 = r8.values()     // Catch:{ all -> 0x01cf }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x01cf }
        L_0x00a2:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x01cf }
            if (r9 == 0) goto L_0x008c
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.e.as r9 = (com.google.android.libraries.p10923ac.p10925b.p10934e.C146849as) r9     // Catch:{ all -> 0x01cf }
            int r10 = r9.f396413f     // Catch:{ all -> 0x01cf }
            if (r10 == r5) goto L_0x00a2
            com.google.android.libraries.ac.b.e.au r10 = r9.f396412e     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.e.an r10 = r10.f396415b     // Catch:{ all -> 0x01cf }
            java.lang.Object r11 = r9.f396411d     // Catch:{ all -> 0x01cf }
            boolean r10 = r10.mo123746c(r11, r7)     // Catch:{ all -> 0x01cf }
            if (r10 == 0) goto L_0x00a2
            com.google.android.libraries.ac.b.e.au r10 = r9.f396412e     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.e.an r10 = r10.f396415b     // Catch:{ all -> 0x01cf }
            boolean r10 = r10.mo123747d(r7)     // Catch:{ all -> 0x01cf }
            if (r10 == 0) goto L_0x00a2
            com.google.android.libraries.ac.b.e.ap r10 = r9.f396409b     // Catch:{ all -> 0x01cf }
            int r10 = r10.mo123755c(r7)     // Catch:{ all -> 0x01cf }
            if (r10 == r5) goto L_0x00a2
            r9.mo123761a()     // Catch:{ all -> 0x01cf }
            goto L_0x00a2
        L_0x00d4:
            com.google.android.libraries.ac.b.i.ar r3 = r0.mo123751d()     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.i.aw r3 = r3.mo123904b()     // Catch:{ all -> 0x01cf }
            r6.mo123907a(r3)     // Catch:{ all -> 0x0182 }
            r3.mo123901j()     // Catch:{ all -> 0x0182 }
            if (r3 == 0) goto L_0x00e7
            r3.close()     // Catch:{ all -> 0x01cf }
        L_0x00e7:
            com.google.android.libraries.ac.b.i.ar r3 = r0.mo123751d()     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.i.aw r3 = r3.mo123904b()     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.i.m r6 = r0.mo123749b()     // Catch:{ all -> 0x0176 }
            boolean r6 = r6.mo123909b(r3)     // Catch:{ all -> 0x0176 }
            if (r6 != 0) goto L_0x0100
            if (r3 == 0) goto L_0x0073
            r3.close()     // Catch:{ all -> 0x01cf }
            goto L_0x0073
        L_0x0100:
            java.util.Map r6 = r12.f396416c     // Catch:{ all -> 0x0176 }
            java.util.Collection r6 = r6.values()     // Catch:{ all -> 0x0176 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0176 }
        L_0x010a:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0176 }
            if (r7 == 0) goto L_0x0166
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0176 }
            com.google.android.libraries.ac.b.e.as r7 = (com.google.android.libraries.p10923ac.p10925b.p10934e.C146849as) r7     // Catch:{ all -> 0x0176 }
            com.google.android.libraries.ac.b.e.ap r8 = r7.f396409b     // Catch:{ IOException -> 0x0162 }
            int r8 = r8.mo123754b()     // Catch:{ IOException -> 0x0162 }
            if (r8 != r1) goto L_0x0121
            r7.mo123761a()     // Catch:{ IOException -> 0x0162 }
        L_0x0121:
            int r8 = r7.f396413f     // Catch:{ IOException -> 0x0162 }
            if (r8 == r5) goto L_0x0126
            goto L_0x013b
        L_0x0126:
            r7.f396413f = r1     // Catch:{ IOException -> 0x0162 }
            com.google.android.libraries.ac.b.e.ap r8 = r7.f396409b     // Catch:{ IOException -> 0x0162 }
            java.lang.Object r9 = r7.f396410c     // Catch:{ IOException -> 0x0162 }
            java.lang.Object r10 = r7.f396411d     // Catch:{ IOException -> 0x0162 }
            java.lang.Object r10 = r0.mo123752e(r3, r10)     // Catch:{ IOException -> 0x0162 }
            int r8 = r8.mo123756d(r9, r10)     // Catch:{ IOException -> 0x0162 }
            if (r8 == r5) goto L_0x013b
            r7.mo123761a()     // Catch:{ IOException -> 0x0162 }
        L_0x013b:
            java.lang.Object r8 = r0.mo123750c(r3)     // Catch:{ IOException -> 0x0162 }
            com.google.android.libraries.ac.b.c.a.h r9 = r0.mo123748a(r3)     // Catch:{ IOException -> 0x0162 }
            int r10 = r7.f396413f     // Catch:{ IOException -> 0x0162 }
            if (r10 == r5) goto L_0x010a
            com.google.android.libraries.ac.b.e.au r10 = r7.f396412e     // Catch:{ IOException -> 0x0162 }
            com.google.android.libraries.ac.b.e.an r10 = r10.f396415b     // Catch:{ IOException -> 0x0162 }
            java.lang.Object r11 = r7.f396411d     // Catch:{ IOException -> 0x0162 }
            boolean r8 = r10.mo123745b(r8, r11)     // Catch:{ IOException -> 0x0162 }
            if (r8 == 0) goto L_0x010a
            r8 = 3
            r7.f396413f = r8     // Catch:{ IOException -> 0x0162 }
            com.google.android.libraries.ac.b.e.ap r8 = r7.f396409b     // Catch:{ IOException -> 0x0162 }
            int r8 = r8.mo123757e(r9)     // Catch:{ IOException -> 0x0162 }
            if (r8 == r5) goto L_0x010a
            r7.mo123761a()     // Catch:{ IOException -> 0x0162 }
            goto L_0x010a
        L_0x0162:
            r7.mo123761a()     // Catch:{ all -> 0x0176 }
            goto L_0x010a
        L_0x0166:
            r3.mo123901j()     // Catch:{ all -> 0x0176 }
            if (r3 == 0) goto L_0x016e
            r3.close()     // Catch:{ all -> 0x01cf }
        L_0x016e:
            monitor-exit(r2)     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0216
            r0.close()     // Catch:{ IOException -> 0x01e0 }
            goto L_0x0216
        L_0x0176:
            r1 = move-exception
            if (r3 == 0) goto L_0x0181
            r3.close()     // Catch:{ all -> 0x017d }
            goto L_0x0181
        L_0x017d:
            r3 = move-exception
            com.google.android.libraries.p10923ac.p10925b.p10934e.C146842al.m239295a(r1, r3)     // Catch:{ all -> 0x01cf }
        L_0x0181:
            throw r1     // Catch:{ all -> 0x01cf }
        L_0x0182:
            r1 = move-exception
            if (r3 == 0) goto L_0x018d
            r3.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r3 = move-exception
            com.google.android.libraries.p10923ac.p10925b.p10934e.C146842al.m239295a(r1, r3)     // Catch:{ all -> 0x01cf }
        L_0x018d:
            throw r1     // Catch:{ all -> 0x01cf }
        L_0x018e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0193 }
            goto L_0x0197
        L_0x0193:
            r3 = move-exception
            com.google.android.libraries.p10923ac.p10925b.p10934e.C146842al.m239295a(r1, r3)     // Catch:{ all -> 0x01cf }
        L_0x0197:
            throw r1     // Catch:{ all -> 0x01cf }
        L_0x0198:
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.e.as r7 = (com.google.android.libraries.p10923ac.p10925b.p10934e.C146849as) r7     // Catch:{ all -> 0x01cf }
            java.lang.String r8 = r7.f396408a     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.e.at r9 = r12.f396422i     // Catch:{ all -> 0x01cf }
            java.lang.Object r8 = r9.mo123762a(r8)     // Catch:{ all -> 0x01cf }
            com.google.android.libraries.ac.b.e.an r9 = r12.f396415b     // Catch:{ all -> 0x01cf }
            java.lang.Object r9 = r9.mo123744a(r8, r6)     // Catch:{ all -> 0x01cf }
            java.lang.Object r10 = r7.f396411d     // Catch:{ all -> 0x01cf }
            boolean r10 = r8.equals(r10)     // Catch:{ all -> 0x01cf }
            if (r10 == 0) goto L_0x01bc
            java.lang.Object r10 = r7.f396411d     // Catch:{ all -> 0x01cf }
            boolean r10 = r9.equals(r10)     // Catch:{ all -> 0x01cf }
            if (r10 != 0) goto L_0x006d
        L_0x01bc:
            r7.f396410c = r8     // Catch:{ all -> 0x01cf }
            r7.f396411d = r9     // Catch:{ all -> 0x01cf }
            r7.mo123761a()     // Catch:{ all -> 0x01cf }
            goto L_0x006d
        L_0x01c5:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01ca }
            goto L_0x01ce
        L_0x01ca:
            r3 = move-exception
            com.google.android.libraries.p10923ac.p10925b.p10934e.C146842al.m239295a(r1, r3)     // Catch:{ all -> 0x01cf }
        L_0x01ce:
            throw r1     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01cf }
            throw r1     // Catch:{ all -> 0x01d2 }
        L_0x01d2:
            r1 = move-exception
            if (r0 == 0) goto L_0x01dd
            r0.close()     // Catch:{ all -> 0x01d9 }
            goto L_0x01dd
        L_0x01d9:
            r0 = move-exception
            com.google.android.libraries.p10923ac.p10925b.p10934e.C146842al.m239295a(r1, r0)     // Catch:{ IOException -> 0x01e0 }
        L_0x01dd:
            throw r1     // Catch:{ IOException -> 0x01e0 }
        L_0x01de:
            r0 = move-exception
            goto L_0x022a
        L_0x01e0:
            r0 = move-exception
            dagger.a r1 = r12.f396418e     // Catch:{ all -> 0x01de }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x01de }
            com.google.android.libraries.ac.d.b.b.d.m r1 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r1     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "Trigger listeners failed"
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x01de }
            r1.mo124063f(r2, r0, r3)     // Catch:{ all -> 0x01de }
            dagger.a r0 = r12.f396423j     // Catch:{ all -> 0x01de }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x01de }
            com.google.android.libraries.ac.d.b.b.d.a r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a) r0     // Catch:{ all -> 0x01de }
            java.util.Map r0 = r12.f396416c     // Catch:{ all -> 0x01de }
            monitor-enter(r0)     // Catch:{ all -> 0x01de }
            java.util.Map r1 = r12.f396416c     // Catch:{ all -> 0x0227 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0227 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0227 }
        L_0x0205:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x0215
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0227 }
            com.google.android.libraries.ac.b.e.as r2 = (com.google.android.libraries.p10923ac.p10925b.p10934e.C146849as) r2     // Catch:{ all -> 0x0227 }
            r2.mo123761a()     // Catch:{ all -> 0x0227 }
            goto L_0x0205
        L_0x0215:
            monitor-exit(r0)     // Catch:{ all -> 0x0227 }
        L_0x0216:
            java.util.Map r1 = r12.f396416c
            monitor-enter(r1)
            java.util.Map r0 = r12.f396416c     // Catch:{ all -> 0x0224 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0224 }
            r0 = r0 ^ r5
            r12.f396417d = r0     // Catch:{ all -> 0x0224 }
            monitor-exit(r1)     // Catch:{ all -> 0x0224 }
            return
        L_0x0224:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0224 }
            throw r0
        L_0x0227:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0227 }
            throw r1     // Catch:{ all -> 0x01de }
        L_0x022a:
            java.util.Map r1 = r12.f396416c
            monitor-enter(r1)
            java.util.Map r2 = r12.f396416c     // Catch:{ all -> 0x0238 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0238 }
            r2 = r2 ^ r5
            r12.f396417d = r2     // Catch:{ all -> 0x0238 }
            monitor-exit(r1)     // Catch:{ all -> 0x0238 }
            throw r0
        L_0x0238:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0238 }
            goto L_0x023c
        L_0x023b:
            throw r0
        L_0x023c:
            goto L_0x023b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10934e.C146851au.mo123763a():void");
    }
}

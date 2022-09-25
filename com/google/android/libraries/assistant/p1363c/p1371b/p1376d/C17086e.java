package com.google.android.libraries.assistant.p1363c.p1371b.p1376d;

import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.b.d.e */
/* compiled from: PG */
public final class C17086e implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C17094m f49730a;

    public C17086e(C17094m mVar) {
        this.f49730a = mVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C17093l a;
        synchronized (this.f49730a.f49753f) {
            this.f49730a.f49758k = true;
            a = this.f49730a.mo23184a();
        }
        synchronized (this.f49730a.f49750c) {
            this.f49730a.f49751d.accept(a);
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C17094m.f49748a.mo56226d()).mo56382g(th)).mo56372aa(42601)).mo56386p("Error occurred while downloading groups with updates.");
        synchronized (this.f49730a.f49753f) {
            Status d = Status.m102100d(th);
            if (this.f49730a.f49756i) {
                if (d.getCode().equals(Status.Code.CANCELLED)) {
                    return;
                }
            }
            this.f49730a.f49759l = Optional.m71637of(d);
            this.f49730a.f49755h = Optional.empty();
            C17093l a = this.f49730a.mo23184a();
            synchronized (this.f49730a.f49750c) {
                this.f49730a.f49751d.accept(a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo20123c(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.libraries.assistant.c.b.c.s r12 = (com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17074s) r12
            com.google.android.libraries.assistant.c.b.d.m r0 = r11.f49730a
            java.lang.Object r0 = r0.f49753f
            monitor-enter(r0)
            com.google.android.libraries.assistant.c.b.d.m r1 = r11.f49730a     // Catch:{ all -> 0x00dd }
            boolean r2 = r1.f49757j     // Catch:{ all -> 0x00dd }
            r3 = 1
            if (r2 != 0) goto L_0x002d
            com.google.protobuf.cq r2 = r12.f49711a     // Catch:{ all -> 0x00dd }
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.d.c r4 = com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17084c.f49728a     // Catch:{ all -> 0x00dd }
            j$.util.stream.Stream r2 = r2.map(r4)     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.c.q r4 = com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q.DOWNLOADING     // Catch:{ all -> 0x00dd }
            p3186j$.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.d.d r5 = new com.google.android.libraries.assistant.c.b.d.d     // Catch:{ all -> 0x00dd }
            r5.<init>(r4)     // Catch:{ all -> 0x00dd }
            boolean r2 = r2.anyMatch(r5)     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r2 = 0
            goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            r1.f49757j = r2     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.d.m r1 = r11.f49730a     // Catch:{ all -> 0x00dd }
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r12)     // Catch:{ all -> 0x00dd }
            r1.f49755h = r12     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.d.m r12 = r11.f49730a     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.d.l r12 = r12.mo23184a()     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.d.f r1 = r12.mo23181a()     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.d.f r2 = com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17087f.PREPARING     // Catch:{ all -> 0x00dd }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x00cb
            if (r1 == r3) goto L_0x00cb
            r2 = 2
            if (r1 == r2) goto L_0x00cb
            r2 = 3
            if (r1 == r2) goto L_0x00cb
            r2 = 4
            if (r1 == r2) goto L_0x0068
            r2 = 5
            if (r1 == r2) goto L_0x0059
            goto L_0x0076
        L_0x0059:
            com.google.common.f.e r1 = com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17094m.f49748a     // Catch:{ all -> 0x00dd }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = "Downloading error - logging individual statuses."
            r3 = 42608(0xa670, float:5.9707E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x00dd }
            goto L_0x0076
        L_0x0068:
            com.google.common.f.e r1 = com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17094m.f49748a     // Catch:{ all -> 0x00dd }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = "Downloading cancelled - logging individual statuses."
            r3 = 42607(0xa66f, float:5.9705E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x00dd }
        L_0x0076:
            j$.util.Optional r1 = r12.f49743a     // Catch:{ all -> 0x00dd }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.c.s r1 = (com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17074s) r1     // Catch:{ all -> 0x00dd }
            com.google.protobuf.cq r1 = r1.f49711a     // Catch:{ all -> 0x00dd }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00dd }
        L_0x0084:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x00cb
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.c.r r2 = (com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17073r) r2     // Catch:{ all -> 0x00dd }
            com.google.common.f.e r3 = com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17094m.f49748a     // Catch:{ all -> 0x00dd }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x00dd }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00dd }
            r4 = 42602(0xa66a, float:5.9698E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x00dd }
            r4 = r3
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.c.o r3 = r2.f49703b     // Catch:{ all -> 0x00dd }
            if (r3 != 0) goto L_0x00a8
            com.google.android.libraries.assistant.c.b.c.o r3 = com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17070o.f49685d     // Catch:{ all -> 0x00dd }
        L_0x00a8:
            java.lang.String r6 = r3.f49688b     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.c.o r3 = r2.f49703b     // Catch:{ all -> 0x00dd }
            if (r3 != 0) goto L_0x00b0
            com.google.android.libraries.assistant.c.b.c.o r3 = com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17070o.f49685d     // Catch:{ all -> 0x00dd }
        L_0x00b0:
            java.lang.String r7 = r3.f49689c     // Catch:{ all -> 0x00dd }
            boolean r3 = r2.f49708g     // Catch:{ all -> 0x00dd }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00dd }
            int r3 = r2.f49704c     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.c.q r3 = com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q.m34237a(r3)     // Catch:{ all -> 0x00dd }
            if (r3 != 0) goto L_0x00c2
            com.google.android.libraries.assistant.c.b.c.q r3 = com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q.UNKNOWN     // Catch:{ all -> 0x00dd }
        L_0x00c2:
            r9 = r3
            java.lang.String r5 = "Group (%s, %s, %s) -> %s : %s"
            java.lang.String r10 = r2.f49705d     // Catch:{ all -> 0x00dd }
            r4.mo56361N(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00dd }
            goto L_0x0084
        L_0x00cb:
            monitor-exit(r0)     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.assistant.c.b.d.m r0 = r11.f49730a
            java.lang.Object r1 = r0.f49750c
            monitor-enter(r1)
            com.google.android.libraries.assistant.c.b.d.m r0 = r11.f49730a     // Catch:{ all -> 0x00da }
            j$.util.function.Consumer r0 = r0.f49751d     // Catch:{ all -> 0x00da }
            r0.accept(r12)     // Catch:{ all -> 0x00da }
            monitor-exit(r1)     // Catch:{ all -> 0x00da }
            return
        L_0x00da:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00da }
            throw r12
        L_0x00dd:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00e1
        L_0x00e0:
            throw r12
        L_0x00e1:
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17086e.mo20123c(java.lang.Object):void");
    }
}

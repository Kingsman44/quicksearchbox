package com.google.android.libraries.appdoctor;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.p10747b.p10748a.C142954b;
import com.google.android.gms.p10747b.p10748a.C142969q;
import com.google.android.libraries.appdoctor.p573a.C10444a;
import com.google.android.libraries.appdoctor.p573a.C10448e;
import com.google.android.libraries.appdoctor.p574b.C10463a;
import com.google.android.libraries.appdoctor.p574b.C10464b;
import com.google.android.libraries.appdoctor.p574b.C10466d;
import com.google.android.libraries.appdoctor.p574b.C10467e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.p4566l.C60221u;
import com.google.common.p4552o.p4566l.C60223w;
import com.google.common.p4552o.p4566l.C60226z;
import java.util.Map;

/* renamed from: com.google.android.libraries.appdoctor.d */
/* compiled from: PG */
public final class C10476d {

    /* renamed from: a */
    public final C10444a f35241a;

    /* renamed from: b */
    public final C58528ij f35242b;

    /* renamed from: c */
    private final C58833ax f35243c = C58833ax.m90833j((Object) null);

    public C10476d(C10468c cVar) {
        this.f35241a = cVar.f35223a;
        this.f35242b = cVar.f35224b.mo55486f();
    }

    /* renamed from: a */
    public static C58833ax m25449a(Class cls) {
        try {
            return C58833ax.m90834k((C10448e) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ReflectiveOperationException unused) {
            return C58836b.f156633a;
        }
    }

    /* renamed from: d */
    public final void mo18510d(Context context, C142954b bVar, C60223w wVar) {
        Log.e("AppDoctor", "Failed on fix: " + bVar.getNumber());
        C10444a aVar = this.f35241a;
        C60221u uVar = (C60221u) C60226z.f162945g.createBuilder();
        String packageName = context.getPackageName();
        uVar.copyOnWrite();
        C60226z zVar = (C60226z) uVar.instance;
        packageName.getClass();
        zVar.f162947a |= 1;
        zVar.f162948b = packageName;
        uVar.copyOnWrite();
        C60226z zVar2 = (C60226z) uVar.instance;
        zVar2.f162952f = wVar.f162943d;
        zVar2.f162947a |= 16;
        uVar.copyOnWrite();
        C60226z zVar3 = (C60226z) uVar.instance;
        zVar3.f162951e = 4;
        zVar3.f162947a |= 8;
        uVar.copyOnWrite();
        C60226z zVar4 = (C60226z) uVar.instance;
        zVar4.f162950d = bVar.getNumber();
        zVar4.f162947a |= 4;
        aVar.mo18486a((C60226z) uVar.build());
    }

    /* renamed from: e */
    public final void mo18511e(Context context, C142969q qVar, C60223w wVar) {
        C142954b bVar;
        if (qVar != null) {
            bVar = C142954b.m231901a(qVar.f387922a);
            if (bVar == null) {
                bVar = C142954b.UNRECOGNIZED;
            }
        } else {
            bVar = C142954b.UNSPECIFIED_FIX;
        }
        mo18510d(context, bVar, wVar);
    }

    /* renamed from: f */
    public final void mo18512f(Context context, C142954b bVar, C60223w wVar) {
        C10444a aVar = this.f35241a;
        C60221u uVar = (C60221u) C60226z.f162945g.createBuilder();
        String packageName = context.getPackageName();
        uVar.copyOnWrite();
        C60226z zVar = (C60226z) uVar.instance;
        packageName.getClass();
        zVar.f162947a |= 1;
        zVar.f162948b = packageName;
        uVar.copyOnWrite();
        C60226z zVar2 = (C60226z) uVar.instance;
        zVar2.f162952f = wVar.f162943d;
        zVar2.f162947a |= 16;
        uVar.copyOnWrite();
        C60226z zVar3 = (C60226z) uVar.instance;
        zVar3.f162951e = 3;
        zVar3.f162947a |= 8;
        uVar.copyOnWrite();
        C60226z zVar4 = (C60226z) uVar.instance;
        zVar4.f162950d = bVar.getNumber();
        zVar4.f162947a |= 4;
        aVar.mo18486a((C60226z) uVar.build());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:48|49|50|51) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:52|53|54|55|60|61) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        mo18511e(r2, com.google.android.gms.p10747b.p10748a.C142969q.f387920d, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r6.f35245b.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0119 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18513g(android.content.Context r19, com.google.common.p4552o.p4566l.C60223w r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r0 = com.google.android.libraries.appdoctor.C10477e.m25456b(r19)
            r4 = 0
            if (r0 == 0) goto L_0x011f
            com.google.android.libraries.appdoctor.a.j r0 = new com.google.android.libraries.appdoctor.a.j
            r0.<init>()
            r0.f35196b = r2
            r0.f35195a = r3
            com.google.android.libraries.appdoctor.a.a r5 = r1.f35241a
            r0.f35197c = r5
            com.google.android.libraries.appdoctor.a.k r5 = r0.mo18496a()
            com.google.android.libraries.appdoctor.e r6 = new com.google.android.libraries.appdoctor.e     // Catch:{ RemoteException | RuntimeException -> 0x011a }
            r6.<init>(r2)     // Catch:{ RemoteException | RuntimeException -> 0x011a }
            com.google.android.libraries.appdoctor.a.q r7 = new com.google.android.libraries.appdoctor.a.q     // Catch:{ all -> 0x00fa }
            com.google.android.libraries.appdoctor.b r0 = new com.google.android.libraries.appdoctor.b     // Catch:{ all -> 0x00fa }
            r0.<init>(r1, r6, r5)     // Catch:{ all -> 0x00fa }
            r7.<init>(r0)     // Catch:{ all -> 0x00fa }
            com.google.common.b.hd r8 = r18.mo18509b()     // Catch:{ all -> 0x00fa }
            android.os.Bundle r0 = r6.mo18514a()     // Catch:{ all -> 0x00fa }
            android.content.ContentProviderClient r9 = r6.f35245b     // Catch:{ all -> 0x00fa }
            java.lang.String r10 = "get_fixes"
            r11 = 0
            android.os.Bundle r0 = r9.call(r10, r11, r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r9 = "com.google.android.gms.common.appdoctor.teledoctorconfig"
            byte[] r0 = r0.getByteArray(r9)     // Catch:{ ct -> 0x0051 }
            com.google.protobuf.ba r9 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x0051 }
            com.google.android.gms.b.a.r r10 = com.google.android.gms.p10747b.p10748a.C142970r.f387925b     // Catch:{ ct -> 0x0051 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (byte[]) r0, (com.google.protobuf.C62921ba) r9)     // Catch:{ ct -> 0x0051 }
            com.google.android.gms.b.a.r r0 = (com.google.android.gms.p10747b.p10748a.C142970r) r0     // Catch:{ ct -> 0x0051 }
            com.google.protobuf.cq r0 = r0.f387927a     // Catch:{ ct -> 0x0051 }
            goto L_0x005d
        L_0x0051:
            r0 = move-exception
            java.lang.String r9 = "AppDoctorProviderClient"
            java.lang.String r10 = "Failed to parse TeleDoctorConfig."
            android.util.Log.e(r9, r10, r0)     // Catch:{ all -> 0x00fa }
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x00fa }
        L_0x005d:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00fa }
        L_0x0061:
            boolean r9 = r0.hasNext()     // Catch:{ all -> 0x00fa }
            if (r9 == 0) goto L_0x00de
            java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x00fa }
            com.google.android.gms.b.a.q r9 = (com.google.android.gms.p10747b.p10748a.C142969q) r9     // Catch:{ all -> 0x00fa }
            int r10 = r9.f387922a     // Catch:{ all -> 0x00fa }
            com.google.android.gms.b.a.b r10 = com.google.android.gms.p10747b.p10748a.C142954b.m231901a(r10)     // Catch:{ all -> 0x00fa }
            if (r10 != 0) goto L_0x0077
            com.google.android.gms.b.a.b r10 = com.google.android.gms.p10747b.p10748a.C142954b.UNRECOGNIZED     // Catch:{ all -> 0x00fa }
        L_0x0077:
            boolean r10 = r8.containsKey(r10)     // Catch:{ all -> 0x00fa }
            if (r10 != 0) goto L_0x0094
            android.content.Context r10 = r5.f35203b     // Catch:{ all -> 0x00fa }
            com.google.common.o.l.w r11 = r5.f35202a     // Catch:{ all -> 0x00fa }
            if (r9 == 0) goto L_0x008e
            int r9 = r9.f387922a     // Catch:{ all -> 0x00fa }
            com.google.android.gms.b.a.b r9 = com.google.android.gms.p10747b.p10748a.C142954b.m231901a(r9)     // Catch:{ all -> 0x00fa }
            if (r9 != 0) goto L_0x0090
            com.google.android.gms.b.a.b r9 = com.google.android.gms.p10747b.p10748a.C142954b.UNRECOGNIZED     // Catch:{ all -> 0x00fa }
            goto L_0x0090
        L_0x008e:
            com.google.android.gms.b.a.b r9 = com.google.android.gms.p10747b.p10748a.C142954b.UNSPECIFIED_FIX     // Catch:{ all -> 0x00fa }
        L_0x0090:
            r1.mo18512f(r10, r9, r11)     // Catch:{ all -> 0x00fa }
            goto L_0x0061
        L_0x0094:
            int r10 = r9.f387922a     // Catch:{ all -> 0x00fa }
            com.google.android.gms.b.a.b r10 = com.google.android.gms.p10747b.p10748a.C142954b.m231901a(r10)     // Catch:{ all -> 0x00fa }
            if (r10 != 0) goto L_0x009e
            com.google.android.gms.b.a.b r10 = com.google.android.gms.p10747b.p10748a.C142954b.UNRECOGNIZED     // Catch:{ all -> 0x00fa }
        L_0x009e:
            java.lang.Object r10 = r8.get(r10)     // Catch:{ all -> 0x00fa }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x00fa }
            com.google.common.base.ax r10 = m25449a(r10)     // Catch:{ all -> 0x00fa }
            boolean r11 = r10.mo56113h()     // Catch:{ all -> 0x00fa }
            if (r11 != 0) goto L_0x00b6
            android.content.Context r10 = r5.f35203b     // Catch:{ all -> 0x00fa }
            com.google.common.o.l.w r11 = r5.f35202a     // Catch:{ all -> 0x00fa }
            r1.mo18511e(r10, r9, r11)     // Catch:{ all -> 0x00fa }
            goto L_0x0061
        L_0x00b6:
            com.google.android.libraries.appdoctor.a.i r11 = new com.google.android.libraries.appdoctor.a.i     // Catch:{ all -> 0x00fa }
            java.lang.String r13 = r9.f387924c     // Catch:{ all -> 0x00fa }
            int r12 = r9.f387922a     // Catch:{ all -> 0x00fa }
            com.google.android.gms.b.a.b r12 = com.google.android.gms.p10747b.p10748a.C142954b.m231901a(r12)     // Catch:{ all -> 0x00fa }
            if (r12 != 0) goto L_0x00c4
            com.google.android.gms.b.a.b r12 = com.google.android.gms.p10747b.p10748a.C142954b.UNRECOGNIZED     // Catch:{ all -> 0x00fa }
        L_0x00c4:
            r14 = r12
            com.google.android.gms.b.a.o r9 = r9.f387923b     // Catch:{ all -> 0x00fa }
            if (r9 != 0) goto L_0x00cb
            com.google.android.gms.b.a.o r9 = com.google.android.gms.p10747b.p10748a.C142967o.f387916c     // Catch:{ all -> 0x00fa }
        L_0x00cb:
            r15 = r9
            java.lang.Object r9 = r10.mo56107c()     // Catch:{ all -> 0x00fa }
            r16 = r9
            com.google.android.libraries.appdoctor.a.e r16 = (com.google.android.libraries.appdoctor.p573a.C10448e) r16     // Catch:{ all -> 0x00fa }
            com.google.common.b.ij r17 = com.google.android.libraries.appdoctor.p573a.C10452i.f35186a     // Catch:{ all -> 0x00fa }
            r12 = r11
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00fa }
            r7.mo18504b(r11)     // Catch:{ all -> 0x00fa }
            goto L_0x0061
        L_0x00de:
            com.google.android.libraries.appdoctor.a.p r0 = r7.mo18503a(r5)     // Catch:{ all -> 0x00fa }
            com.google.common.util.concurrent.cx r5 = r0.f35216b     // Catch:{ InterruptedException | RuntimeException | ExecutionException -> 0x00ef }
            r5.get()     // Catch:{ InterruptedException | RuntimeException | ExecutionException -> 0x00ef }
            boolean r0 = r0.f35215a     // Catch:{ InterruptedException | RuntimeException | ExecutionException -> 0x00ef }
            android.content.ContentProviderClient r5 = r6.f35245b     // Catch:{ RemoteException | RuntimeException -> 0x011a }
            r5.close()     // Catch:{ RemoteException | RuntimeException -> 0x011a }
            return r0
        L_0x00ef:
            com.google.android.gms.b.a.q r0 = com.google.android.gms.p10747b.p10748a.C142969q.f387920d     // Catch:{ all -> 0x00fa }
            r1.mo18511e(r2, r0, r3)     // Catch:{ all -> 0x00fa }
            android.content.ContentProviderClient r0 = r6.f35245b     // Catch:{ RemoteException | RuntimeException -> 0x011a }
            r0.close()     // Catch:{ RemoteException | RuntimeException -> 0x011a }
            goto L_0x011f
        L_0x00fa:
            r0 = move-exception
            r5 = r0
            android.content.ContentProviderClient r0 = r6.f35245b     // Catch:{ all -> 0x0102 }
            r0.close()     // Catch:{ all -> 0x0102 }
            goto L_0x0119
        L_0x0102:
            r0 = move-exception
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0119 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r4] = r8     // Catch:{ Exception -> 0x0119 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            java.lang.String r9 = "addSuppressed"
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r9, r7)     // Catch:{ Exception -> 0x0119 }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0119 }
            r6[r4] = r0     // Catch:{ Exception -> 0x0119 }
            r7.invoke(r5, r6)     // Catch:{ Exception -> 0x0119 }
        L_0x0119:
            throw r5     // Catch:{ RemoteException | RuntimeException -> 0x011a }
        L_0x011a:
            com.google.android.gms.b.a.q r0 = com.google.android.gms.p10747b.p10748a.C142969q.f387920d
            r1.mo18511e(r2, r0, r3)
        L_0x011f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appdoctor.C10476d.mo18513g(android.content.Context, com.google.common.o.l.w):boolean");
    }

    /* renamed from: b */
    public final C58495hd mo18509b() {
        if (!this.f35243c.mo56113h()) {
            return C58495hd.m89903q(C142954b.DO_NOTHING, C10463a.class, C142954b.FILE_DELETION, C10466d.class, C142954b.EXEC_SQL_FIX, C10464b.class, C142954b.SEND_BROADCAST, C10467e.class);
        }
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55433l(C58495hd.m89903q(C142954b.DO_NOTHING, C10463a.class, C142954b.FILE_DELETION, C10466d.class, C142954b.EXEC_SQL_FIX, C10464b.class, C142954b.SEND_BROADCAST, C10467e.class));
        gzVar.mo55433l((Map) ((C58881cr) this.f35243c.mo56107c()).mo6453a());
        return gzVar.mo55427f(true);
    }
}

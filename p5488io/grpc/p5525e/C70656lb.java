package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p5488io.grpc.C70152ap;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70173bh;
import p5488io.grpc.C70244bo;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70702eg;
import p5488io.grpc.C70706ek;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70911z;

/* renamed from: io.grpc.e.lb */
/* compiled from: PG */
public final class C70656lb extends C70702eg {

    /* renamed from: o */
    private static final Logger f188363o = Logger.getLogger(C70656lb.class.getName());

    /* renamed from: p */
    private static final C70567hu f188364p = new C70669lo(C70460dv.f187797p);

    /* renamed from: q */
    private static final C70173bh f188365q = new C70655la();

    /* renamed from: r */
    private static final C70156at f188366r = C70156at.f187007b;

    /* renamed from: s */
    private static final C70911z f188367s = C70911z.f189100a;

    /* renamed from: t */
    private static final long f188368t = TimeUnit.SECONDS.toMillis(120);

    /* renamed from: a */
    final C70470ee f188369a = new C70470ee();

    /* renamed from: b */
    final List f188370b = new ArrayList();

    /* renamed from: c */
    final List f188371c = new ArrayList();

    /* renamed from: d */
    C70173bh f188372d = f188365q;

    /* renamed from: e */
    C70567hu f188373e = f188364p;

    /* renamed from: f */
    public C70156at f188374f = f188366r;

    /* renamed from: g */
    public C70911z f188375g = f188367s;

    /* renamed from: h */
    public long f188376h = f188368t;

    /* renamed from: i */
    final C70152ap f188377i = C70153aq.f186997a;

    /* renamed from: j */
    public boolean f188378j = true;

    /* renamed from: k */
    public boolean f188379k = true;

    /* renamed from: l */
    public boolean f188380l = true;

    /* renamed from: m */
    public boolean f188381m = true;

    /* renamed from: n */
    final C70244bo f188382n = C70244bo.f187236b;

    /* renamed from: u */
    private final List f188383u = new ArrayList();

    /* renamed from: v */
    private final C70653kz f188384v;

    public C70656lb(C70653kz kzVar) {
        C58838bb.m90866a(kzVar, "clientTransportServersBuilder");
        this.f188384v = kzVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p5488io.grpc.C70701ef mo61738a() {
        /*
            r13 = this;
            io.grpc.e.ky r0 = new io.grpc.e.ky
            io.grpc.e.kz r1 = r13.f188384v
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r13.f188378j
            java.lang.String r4 = "getServerStreamTracerFactory"
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L_0x0090
            java.lang.String r3 = "io.grpc.b.a"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            r7 = 3
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            r8[r5] = r9     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            r10 = 1
            r8[r10] = r9     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            r11 = 2
            r8[r11] = r9     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r8)     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            boolean r8 = r13.f188379k     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            r7[r5] = r8     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            boolean r8 = r13.f188380l     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            r7[r10] = r8     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            r7[r11] = r8     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            java.lang.Object r3 = r3.invoke(r6, r7)     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            io.grpc.eq r3 = (p5488io.grpc.C70712eq) r3     // Catch:{ ClassNotFoundException -> 0x007b, NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x005b, InvocationTargetException -> 0x004b }
            goto L_0x008b
        L_0x004b:
            r3 = move-exception
            r12 = r3
            java.util.logging.Logger r7 = f188363o
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            java.lang.String r9 = "io.grpc.internal.ServerImplBuilder"
            java.lang.String r10 = "getTracerFactories"
            java.lang.String r11 = "Unable to apply census stats"
            r7.logp(r8, r9, r10, r11, r12)
            goto L_0x008a
        L_0x005b:
            r3 = move-exception
            r12 = r3
            java.util.logging.Logger r7 = f188363o
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            java.lang.String r9 = "io.grpc.internal.ServerImplBuilder"
            java.lang.String r10 = "getTracerFactories"
            java.lang.String r11 = "Unable to apply census stats"
            r7.logp(r8, r9, r10, r11, r12)
            goto L_0x008a
        L_0x006b:
            r3 = move-exception
            r12 = r3
            java.util.logging.Logger r7 = f188363o
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            java.lang.String r9 = "io.grpc.internal.ServerImplBuilder"
            java.lang.String r10 = "getTracerFactories"
            java.lang.String r11 = "Unable to apply census stats"
            r7.logp(r8, r9, r10, r11, r12)
            goto L_0x008a
        L_0x007b:
            r3 = move-exception
            r12 = r3
            java.util.logging.Logger r7 = f188363o
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            java.lang.String r9 = "io.grpc.internal.ServerImplBuilder"
            java.lang.String r10 = "getTracerFactories"
            java.lang.String r11 = "Unable to apply census stats"
            r7.logp(r8, r9, r10, r11, r12)
        L_0x008a:
            r3 = r6
        L_0x008b:
            if (r3 == 0) goto L_0x0090
            r2.add(r3)
        L_0x0090:
            boolean r3 = r13.f188381m
            if (r3 == 0) goto L_0x00ee
            java.lang.String r3 = "io.grpc.b.b"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x00da, NoSuchMethodException -> 0x00ca, IllegalAccessException -> 0x00ba, InvocationTargetException -> 0x00aa }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00da, NoSuchMethodException -> 0x00ca, IllegalAccessException -> 0x00ba, InvocationTargetException -> 0x00aa }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r7)     // Catch:{ ClassNotFoundException -> 0x00da, NoSuchMethodException -> 0x00ca, IllegalAccessException -> 0x00ba, InvocationTargetException -> 0x00aa }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00da, NoSuchMethodException -> 0x00ca, IllegalAccessException -> 0x00ba, InvocationTargetException -> 0x00aa }
            java.lang.Object r3 = r3.invoke(r6, r4)     // Catch:{ ClassNotFoundException -> 0x00da, NoSuchMethodException -> 0x00ca, IllegalAccessException -> 0x00ba, InvocationTargetException -> 0x00aa }
            io.grpc.eq r3 = (p5488io.grpc.C70712eq) r3     // Catch:{ ClassNotFoundException -> 0x00da, NoSuchMethodException -> 0x00ca, IllegalAccessException -> 0x00ba, InvocationTargetException -> 0x00aa }
            r6 = r3
            goto L_0x00e9
        L_0x00aa:
            r3 = move-exception
            r12 = r3
            java.util.logging.Logger r7 = f188363o
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            java.lang.String r9 = "io.grpc.internal.ServerImplBuilder"
            java.lang.String r10 = "getTracerFactories"
            java.lang.String r11 = "Unable to apply census stats"
            r7.logp(r8, r9, r10, r11, r12)
            goto L_0x00e9
        L_0x00ba:
            r3 = move-exception
            r12 = r3
            java.util.logging.Logger r7 = f188363o
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            java.lang.String r9 = "io.grpc.internal.ServerImplBuilder"
            java.lang.String r10 = "getTracerFactories"
            java.lang.String r11 = "Unable to apply census stats"
            r7.logp(r8, r9, r10, r11, r12)
            goto L_0x00e9
        L_0x00ca:
            r3 = move-exception
            r12 = r3
            java.util.logging.Logger r7 = f188363o
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            java.lang.String r9 = "io.grpc.internal.ServerImplBuilder"
            java.lang.String r10 = "getTracerFactories"
            java.lang.String r11 = "Unable to apply census stats"
            r7.logp(r8, r9, r10, r11, r12)
            goto L_0x00e9
        L_0x00da:
            r3 = move-exception
            r12 = r3
            java.util.logging.Logger r7 = f188363o
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            java.lang.String r9 = "io.grpc.internal.ServerImplBuilder"
            java.lang.String r10 = "getTracerFactories"
            java.lang.String r11 = "Unable to apply census stats"
            r7.logp(r8, r9, r10, r11, r12)
        L_0x00e9:
            if (r6 == 0) goto L_0x00ee
            r2.add(r6)
        L_0x00ee:
            java.util.List r3 = r13.f188383u
            r2.addAll(r3)
            r2.trimToSize()
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            io.grpc.e.eg r1 = r1.mo61890a(r2)
            io.grpc.al r2 = p5488io.grpc.C70148al.f186992d
            r0.<init>(r13, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70656lb.mo61738a():io.grpc.ef");
    }

    /* renamed from: b */
    public final void mo62399b(C70298d dVar) {
        C70711ep gs = dVar.mo17222gs();
        C70470ee eeVar = this.f188369a;
        C58838bb.m90866a(gs, "service");
        eeVar.f187820a.put(gs.f188452a.f188456a, gs);
    }

    /* renamed from: c */
    public final void mo62400c(Executor executor) {
        this.f188373e = executor != null ? new C70446dh(executor) : f188364p;
    }

    /* renamed from: d */
    public final void mo62401d(C70173bh bhVar) {
        if (bhVar == null) {
            bhVar = f188365q;
        }
        this.f188372d = bhVar;
    }

    /* renamed from: e */
    public final void mo62402e(C70706ek ekVar) {
        List list = this.f188371c;
        C58838bb.m90866a(ekVar, "interceptor");
        list.add(ekVar);
    }
}

package p5488io.grpc.p5525e;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58838bb;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70244bo;
import p5488io.grpc.C70287cp;
import p5488io.grpc.C70341dl;
import p5488io.grpc.C70349dt;
import p5488io.grpc.C70911z;

/* renamed from: io.grpc.e.hc */
/* compiled from: PG */
public final class C70549hc extends C70287cp {

    /* renamed from: a */
    static final long f188027a = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: b */
    static final long f188028b = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: v */
    private static final Logger f188029v = Logger.getLogger(C70549hc.class.getName());

    /* renamed from: w */
    private static final C70567hu f188030w = new C70669lo(C70460dv.f187797p);

    /* renamed from: x */
    private static final C70156at f188031x = C70156at.f187007b;

    /* renamed from: y */
    private static final C70911z f188032y = C70911z.f189100a;

    /* renamed from: A */
    private final SocketAddress f188033A;

    /* renamed from: B */
    private final C70544gy f188034B;

    /* renamed from: c */
    C70567hu f188035c;

    /* renamed from: d */
    public C70567hu f188036d;

    /* renamed from: e */
    final C70349dt f188037e;

    /* renamed from: f */
    C70341dl f188038f;

    /* renamed from: g */
    final String f188039g;

    /* renamed from: h */
    public String f188040h;

    /* renamed from: i */
    final String f188041i;

    /* renamed from: j */
    C70156at f188042j;

    /* renamed from: k */
    public C70911z f188043k;

    /* renamed from: l */
    long f188044l;

    /* renamed from: m */
    public boolean f188045m;

    /* renamed from: n */
    final C70244bo f188046n;

    /* renamed from: o */
    public Map f188047o;

    /* renamed from: p */
    public boolean f188048p;

    /* renamed from: q */
    public boolean f188049q;

    /* renamed from: r */
    public boolean f188050r;

    /* renamed from: s */
    public boolean f188051s;

    /* renamed from: t */
    public boolean f188052t;

    /* renamed from: u */
    public final C70543gx f188053u;

    /* renamed from: z */
    private final List f188054z = new ArrayList();

    public C70549hc(String str, C70544gy gyVar, C70543gx gxVar) {
        C70567hu huVar = f188030w;
        this.f188035c = huVar;
        this.f188036d = huVar;
        C70349dt a = C70349dt.m102620a();
        this.f188037e = a;
        this.f188038f = a.f187518a;
        this.f188041i = "pick_first";
        this.f188042j = f188031x;
        this.f188043k = f188032y;
        this.f188044l = f188027a;
        this.f188045m = true;
        this.f188046n = C70244bo.f187236b;
        this.f188048p = true;
        this.f188049q = true;
        this.f188050r = true;
        this.f188051s = true;
        this.f188052t = true;
        C58838bb.m90866a(str, "target");
        this.f188039g = str;
        C58838bb.m90866a(gyVar, "clientTransportFactoryBuilder");
        this.f188034B = gyVar;
        this.f188033A = null;
        if (gxVar != null) {
            this.f188053u = gxVar;
        } else {
            this.f188053u = new C70548hb();
        }
    }

    /* renamed from: a */
    static String m103038a(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", BuildConfig.FLAVOR, "/" + socketAddress, (String) null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static Map m103039b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C58838bb.m90873h(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, (Object) null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, m103039b((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, m103040j((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Double) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Boolean) {
                linkedHashMap.put(str, value);
            } else {
                throw new IllegalArgumentException("The value of the map entry '" + entry + "' is of type '" + value.getClass() + "', which is not supported");
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: j */
    private static List m103040j(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object next : list) {
            if (next == null) {
                arrayList.add((Object) null);
            } else if (next instanceof Map) {
                arrayList.add(m103039b((Map) next));
            } else if (next instanceof List) {
                arrayList.add(m103040j((List) next));
            } else if (next instanceof String) {
                arrayList.add(next);
            } else if (next instanceof Double) {
                arrayList.add(next);
            } else if (next instanceof Boolean) {
                arrayList.add(next);
            } else {
                throw new IllegalArgumentException("The entry '" + next + "' is of type '" + next.getClass() + "', which is not supported");
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p5488io.grpc.C70286co mo57963c() {
        /*
            r23 = this;
            r8 = r23
            io.grpc.e.he r9 = new io.grpc.e.he
            io.grpc.e.gw r10 = new io.grpc.e.gw
            io.grpc.e.gy r0 = r8.f188034B
            io.grpc.e.at r3 = r0.mo57959a()
            io.grpc.e.lm r0 = p5488io.grpc.p5525e.C70460dv.f187797p
            io.grpc.e.lo r4 = new io.grpc.e.lo
            r4.<init>(r0)
            com.google.common.base.cr r5 = p5488io.grpc.p5525e.C70460dv.f187799r
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r0 = r8.f188054z
            r6.<init>(r0)
            boolean r0 = r8.f188048p
            java.lang.String r1 = "getClientInterceptor"
            r2 = 0
            r7 = 0
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "io.grpc.b.a"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            r11 = 4
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            r12[r2] = r13     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            r14 = 1
            r12[r14] = r13     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            r15 = 2
            r12[r15] = r13     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            r16 = 3
            r12[r16] = r13     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r12)     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            boolean r12 = r8.f188049q     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            r11[r2] = r12     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            boolean r12 = r8.f188050r     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            r11[r14] = r12     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            r11[r15] = r12     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            boolean r12 = r8.f188051s     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            r11[r16] = r12     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            java.lang.Object r0 = r0.invoke(r7, r11)     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            io.grpc.n r0 = (p5488io.grpc.C70899n) r0     // Catch:{ ClassNotFoundException -> 0x009f, NoSuchMethodException -> 0x008e, IllegalAccessException -> 0x007d, InvocationTargetException -> 0x006c }
            goto L_0x00b0
        L_0x006c:
            r0 = move-exception
            r16 = r0
            java.util.logging.Logger r11 = f188029v
            java.util.logging.Level r12 = java.util.logging.Level.FINE
            java.lang.String r13 = "io.grpc.internal.ManagedChannelImplBuilder"
            java.lang.String r14 = "getEffectiveInterceptors"
            java.lang.String r15 = "Unable to apply census stats"
            r11.logp(r12, r13, r14, r15, r16)
            goto L_0x00af
        L_0x007d:
            r0 = move-exception
            r22 = r0
            java.util.logging.Logger r17 = f188029v
            java.util.logging.Level r18 = java.util.logging.Level.FINE
            java.lang.String r19 = "io.grpc.internal.ManagedChannelImplBuilder"
            java.lang.String r20 = "getEffectiveInterceptors"
            java.lang.String r21 = "Unable to apply census stats"
            r17.logp(r18, r19, r20, r21, r22)
            goto L_0x00af
        L_0x008e:
            r0 = move-exception
            r16 = r0
            java.util.logging.Logger r11 = f188029v
            java.util.logging.Level r12 = java.util.logging.Level.FINE
            java.lang.String r13 = "io.grpc.internal.ManagedChannelImplBuilder"
            java.lang.String r14 = "getEffectiveInterceptors"
            java.lang.String r15 = "Unable to apply census stats"
            r11.logp(r12, r13, r14, r15, r16)
            goto L_0x00af
        L_0x009f:
            r0 = move-exception
            r22 = r0
            java.util.logging.Logger r17 = f188029v
            java.util.logging.Level r18 = java.util.logging.Level.FINE
            java.lang.String r19 = "io.grpc.internal.ManagedChannelImplBuilder"
            java.lang.String r20 = "getEffectiveInterceptors"
            java.lang.String r21 = "Unable to apply census stats"
            r17.logp(r18, r19, r20, r21, r22)
        L_0x00af:
            r0 = r7
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            r6.add(r2, r0)
        L_0x00b5:
            boolean r0 = r8.f188052t
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = "io.grpc.b.b"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0102, NoSuchMethodException -> 0x00f1, IllegalAccessException -> 0x00e0, InvocationTargetException -> 0x00cf }
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0102, NoSuchMethodException -> 0x00f1, IllegalAccessException -> 0x00e0, InvocationTargetException -> 0x00cf }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r11)     // Catch:{ ClassNotFoundException -> 0x0102, NoSuchMethodException -> 0x00f1, IllegalAccessException -> 0x00e0, InvocationTargetException -> 0x00cf }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException -> 0x0102, NoSuchMethodException -> 0x00f1, IllegalAccessException -> 0x00e0, InvocationTargetException -> 0x00cf }
            java.lang.Object r0 = r0.invoke(r7, r1)     // Catch:{ ClassNotFoundException -> 0x0102, NoSuchMethodException -> 0x00f1, IllegalAccessException -> 0x00e0, InvocationTargetException -> 0x00cf }
            io.grpc.n r0 = (p5488io.grpc.C70899n) r0     // Catch:{ ClassNotFoundException -> 0x0102, NoSuchMethodException -> 0x00f1, IllegalAccessException -> 0x00e0, InvocationTargetException -> 0x00cf }
            r7 = r0
            goto L_0x0112
        L_0x00cf:
            r0 = move-exception
            r16 = r0
            java.util.logging.Logger r11 = f188029v
            java.util.logging.Level r12 = java.util.logging.Level.FINE
            java.lang.String r13 = "io.grpc.internal.ManagedChannelImplBuilder"
            java.lang.String r14 = "getEffectiveInterceptors"
            java.lang.String r15 = "Unable to apply census stats"
            r11.logp(r12, r13, r14, r15, r16)
            goto L_0x0112
        L_0x00e0:
            r0 = move-exception
            r22 = r0
            java.util.logging.Logger r17 = f188029v
            java.util.logging.Level r18 = java.util.logging.Level.FINE
            java.lang.String r19 = "io.grpc.internal.ManagedChannelImplBuilder"
            java.lang.String r20 = "getEffectiveInterceptors"
            java.lang.String r21 = "Unable to apply census stats"
            r17.logp(r18, r19, r20, r21, r22)
            goto L_0x0112
        L_0x00f1:
            r0 = move-exception
            r16 = r0
            java.util.logging.Logger r11 = f188029v
            java.util.logging.Level r12 = java.util.logging.Level.FINE
            java.lang.String r13 = "io.grpc.internal.ManagedChannelImplBuilder"
            java.lang.String r14 = "getEffectiveInterceptors"
            java.lang.String r15 = "Unable to apply census stats"
            r11.logp(r12, r13, r14, r15, r16)
            goto L_0x0112
        L_0x0102:
            r0 = move-exception
            r22 = r0
            java.util.logging.Logger r17 = f188029v
            java.util.logging.Level r18 = java.util.logging.Level.FINE
            java.lang.String r19 = "io.grpc.internal.ManagedChannelImplBuilder"
            java.lang.String r20 = "getEffectiveInterceptors"
            java.lang.String r21 = "Unable to apply census stats"
            r17.logp(r18, r19, r20, r21, r22)
        L_0x0112:
            if (r7 == 0) goto L_0x0117
            r6.add(r2, r7)
        L_0x0117:
            io.grpc.e.lu r7 = p5488io.grpc.p5525e.C70675lu.f188403a
            r1 = r10
            r2 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.<init>(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70549hc.mo57963c():io.grpc.co");
    }

    /* renamed from: d */
    public final void mo62289d(C70156at atVar) {
        if (atVar != null) {
            this.f188042j = atVar;
        } else {
            this.f188042j = f188031x;
        }
    }

    /* renamed from: e */
    public final void mo62290e(Executor executor) {
        if (executor != null) {
            this.f188035c = new C70446dh(executor);
        } else {
            this.f188035c = f188030w;
        }
    }

    /* renamed from: f */
    public final void mo62291f(long j, TimeUnit timeUnit) {
        C58838bb.m90872g(j > 0, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            this.f188044l = -1;
        } else {
            this.f188044l = Math.max(timeUnit.toMillis(j), f188028b);
        }
    }

    /* renamed from: g */
    public final void mo62292g(List list) {
        this.f188054z.addAll(list);
    }

    @Deprecated
    /* renamed from: h */
    public final void mo62293h(C70341dl dlVar) {
        SocketAddress socketAddress = this.f188033A;
        C58838bb.m90887v(socketAddress == null, "directServerAddress is set (%s), which forbids the use of NameResolverFactory", socketAddress);
        if (dlVar != null) {
            this.f188038f = dlVar;
        } else {
            this.f188038f = this.f188037e.f187518a;
        }
    }

    /* renamed from: i */
    public final void mo62294i(Executor executor) {
        if (executor != null) {
            this.f188036d = new C70446dh(executor);
        } else {
            this.f188036d = f188030w;
        }
    }

    public C70549hc(SocketAddress socketAddress, String str, C70544gy gyVar) {
        C70567hu huVar = f188030w;
        this.f188035c = huVar;
        this.f188036d = huVar;
        C70349dt a = C70349dt.m102620a();
        this.f188037e = a;
        this.f188038f = a.f187518a;
        this.f188041i = "pick_first";
        this.f188042j = f188031x;
        this.f188043k = f188032y;
        this.f188044l = f188027a;
        this.f188045m = true;
        this.f188046n = C70244bo.f187236b;
        this.f188048p = true;
        this.f188049q = true;
        this.f188050r = true;
        this.f188051s = true;
        this.f188052t = true;
        this.f188039g = m103038a(socketAddress);
        C58838bb.m90866a(gyVar, "clientTransportFactoryBuilder");
        this.f188034B = gyVar;
        this.f188033A = socketAddress;
        this.f188038f = new C70547ha(socketAddress, str);
        this.f188053u = new C70548hb();
    }
}

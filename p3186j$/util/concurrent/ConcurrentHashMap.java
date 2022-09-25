package p3186j$.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import p3186j$.sun.misc.C40953c;
import p3186j$.util.Collection;
import p3186j$.util.Spliterator;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: j$.util.concurrent.ConcurrentHashMap */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {

    /* renamed from: g */
    static final int f107570g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h */
    private static final C40953c f107571h;

    /* renamed from: i */
    private static final long f107572i;

    /* renamed from: j */
    private static final long f107573j;

    /* renamed from: k */
    private static final long f107574k;

    /* renamed from: l */
    private static final long f107575l;

    /* renamed from: m */
    private static final long f107576m;

    /* renamed from: n */
    private static final int f107577n;

    /* renamed from: o */
    private static final int f107578o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a */
    volatile transient C41074k[] f107579a;

    /* renamed from: b */
    private volatile transient C41074k[] f107580b;
    private volatile transient long baseCount;

    /* renamed from: c */
    private volatile transient C41066c[] f107581c;
    private volatile transient int cellsBusy;

    /* renamed from: d */
    private transient KeySetView f107582d;

    /* renamed from: e */
    private transient C41082s f107583e;

    /* renamed from: f */
    private transient C41068e f107584f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    /* renamed from: j$.util.concurrent.ConcurrentHashMap$KeySetView */
    public static class KeySetView<K, V> extends C41065b implements Set<K>, p3186j$.util.Set<K> {

        /* renamed from: b */
        private final Object f107585b;

        KeySetView(ConcurrentHashMap concurrentHashMap, Boolean bool) {
            super(concurrentHashMap);
            this.f107585b = bool;
        }

        public boolean add(K k) {
            Object obj = this.f107585b;
            if (obj != null) {
                return this.f107595a.mo43527g(k, obj, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection) {
            Object obj = this.f107585b;
            if (obj != null) {
                boolean z = false;
                for (Object g : collection) {
                    if (this.f107595a.mo43527g(g, obj, true) == null) {
                        z = true;
                    }
                }
                return z;
            }
            throw new UnsupportedOperationException();
        }

        public final boolean contains(Object obj) {
            return this.f107595a.containsKey(obj);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r2 = (java.util.Set) r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                boolean r0 = r2 instanceof java.util.Set
                if (r0 == 0) goto L_0x0016
                java.util.Set r2 = (java.util.Set) r2
                if (r2 == r1) goto L_0x0014
                boolean r0 = r1.containsAll(r2)
                if (r0 == 0) goto L_0x0016
                boolean r2 = r2.containsAll(r1)
                if (r2 == 0) goto L_0x0016
            L_0x0014:
                r2 = 1
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.ConcurrentHashMap.KeySetView.equals(java.lang.Object):boolean");
        }

        public final void forEach(Consumer consumer) {
            if (consumer != null) {
                C41074k[] kVarArr = this.f107595a.f107579a;
                if (kVarArr != null) {
                    C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
                    while (true) {
                        C41074k c = pVar.mo43572c();
                        if (c != null) {
                            consumer.accept(c.f107606b);
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw null;
            }
        }

        public final int hashCode() {
            Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().hashCode();
            }
            return i;
        }

        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.f107595a;
            C41074k[] kVarArr = concurrentHashMap.f107579a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new C41071h(kVarArr, length, length, concurrentHashMap, 0);
        }

        public final /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        public final boolean remove(Object obj) {
            return this.f107595a.remove(obj) != null;
        }

        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        public final Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.f107595a;
            long k = concurrentHashMap.mo43529k();
            C41074k[] kVarArr = concurrentHashMap.f107579a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            long j = 0;
            if (k >= 0) {
                j = k;
            }
            return new C41072i(kVarArr, length, 0, length, j, 0);
        }

        public final /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C41077n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        C40953c h = C40953c.m71114h();
        f107571h = h;
        Class<ConcurrentHashMap> cls2 = ConcurrentHashMap.class;
        f107572i = h.mo42987j(cls2, "sizeCtl");
        f107573j = h.mo42987j(cls2, "transferIndex");
        f107574k = h.mo42987j(cls2, "baseCount");
        f107575l = h.mo42987j(cls2, "cellsBusy");
        f107576m = h.mo42987j(C41066c.class, "value");
        Class<C41074k[]> cls3 = C41074k[].class;
        f107577n = h.mo42980a(cls3);
        int b = h.mo42981b(cls3);
        if (((b - 1) & b) == 0) {
            f107578o = 31 - Integer.numberOfLeadingZeros(b);
            return;
        }
        throw new ExceptionInInitializerError("array index scale not a power of two");
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i) {
        this(i, 0.75f, 1);
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        double d = (double) (((float) ((long) (i < i2 ? i2 : i))) / f);
        Double.isNaN(d);
        long j = (long) (d + 1.0d);
        this.sizeCtl = j >= 1073741824 ? 1073741824 : m71682m((int) j);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r1.mo42983d(r25, r3, r5, r14) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x013b, code lost:
        if (r9.f107581c != r7) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x013d, code lost:
        r9.f107581c = (p3186j$.util.concurrent.C41066c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x019b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x00ba A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m71674a(long r26, int r28) {
        /*
            r25 = this;
            r9 = r25
            r10 = r26
            r0 = r28
            j$.util.concurrent.c[] r12 = r9.f107581c
            r13 = 2
            if (r12 != 0) goto L_0x001c
            j$.sun.misc.c r1 = f107571h
            long r3 = f107574k
            long r5 = r9.baseCount
            long r14 = r5 + r10
            r2 = r25
            r7 = r14
            boolean r1 = r1.mo42983d(r2, r3, r5, r7)
            if (r1 != 0) goto L_0x0047
        L_0x001c:
            r14 = 1
            if (r12 == 0) goto L_0x00a7
            int r1 = r12.length
            int r1 = r1 - r14
            if (r1 < 0) goto L_0x00a7
            int r2 = p3186j$.util.concurrent.ThreadLocalRandom.m71692b()
            r1 = r1 & r2
            r1 = r12[r1]
            if (r1 == 0) goto L_0x00a7
            j$.sun.misc.c r15 = f107571h
            long r17 = f107576m
            long r2 = r1.value
            long r21 = r2 + r10
            r16 = r1
            r19 = r2
            boolean r1 = r15.mo42983d(r16, r17, r19, r21)
            if (r1 != 0) goto L_0x0040
            goto L_0x00a8
        L_0x0040:
            if (r0 > r14) goto L_0x0043
            return
        L_0x0043:
            long r14 = r25.mo43529k()
        L_0x0047:
            if (r0 < 0) goto L_0x00a6
        L_0x0049:
            int r5 = r9.sizeCtl
            long r0 = (long) r5
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x00a6
            j$.util.concurrent.k[] r0 = r9.f107579a
            if (r0 == 0) goto L_0x00a6
            int r1 = r0.length
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r2) goto L_0x00a6
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            if (r5 >= 0) goto L_0x008c
            int r2 = r5 >>> 16
            if (r2 != r1) goto L_0x00a6
            int r2 = r1 + 1
            if (r5 == r2) goto L_0x00a6
            r2 = 65535(0xffff, float:9.1834E-41)
            int r1 = r1 + r2
            if (r5 == r1) goto L_0x00a6
            j$.util.concurrent.k[] r7 = r9.f107580b
            if (r7 == 0) goto L_0x00a6
            int r1 = r9.transferIndex
            if (r1 > 0) goto L_0x007a
            goto L_0x00a6
        L_0x007a:
            j$.sun.misc.c r1 = f107571h
            long r3 = f107572i
            int r6 = r5 + 1
            r2 = r25
            boolean r1 = r1.mo42982c(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00a1
            r9.m71683n(r0, r7)
            goto L_0x00a1
        L_0x008c:
            j$.sun.misc.c r2 = f107571h
            long r3 = f107572i
            int r1 = r1 << 16
            int r6 = r1 + 2
            r1 = r2
            r2 = r25
            boolean r1 = r1.mo42982c(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00a1
            r1 = 0
            r9.m71683n(r0, r1)
        L_0x00a1:
            long r14 = r25.mo43529k()
            goto L_0x0049
        L_0x00a6:
            return
        L_0x00a7:
            r1 = 1
        L_0x00a8:
            int r0 = p3186j$.util.concurrent.ThreadLocalRandom.m71692b()
            if (r0 != 0) goto L_0x00b6
            p3186j$.util.concurrent.ThreadLocalRandom.m71693c()
            int r0 = p3186j$.util.concurrent.ThreadLocalRandom.m71692b()
            r1 = 1
        L_0x00b6:
            r12 = 0
            r15 = r1
            r16 = 0
        L_0x00ba:
            j$.util.concurrent.c[] r7 = r9.f107581c
            if (r7 == 0) goto L_0x0158
            int r8 = r7.length
            if (r8 <= 0) goto L_0x0158
            int r1 = r8 + -1
            r1 = r1 & r0
            r1 = r7[r1]
            if (r1 != 0) goto L_0x0100
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x0150
            j$.util.concurrent.c r7 = new j$.util.concurrent.c
            r7.<init>(r10)
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x0150
            j$.sun.misc.c r1 = f107571h
            long r3 = f107575l
            r5 = 0
            r6 = 1
            r2 = r25
            boolean r1 = r1.mo42982c(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0150
            j$.util.concurrent.c[] r1 = r9.f107581c     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x00f5
            int r2 = r1.length     // Catch:{ all -> 0x00fc }
            if (r2 <= 0) goto L_0x00f5
            int r2 = r2 + -1
            r2 = r2 & r0
            r3 = r1[r2]     // Catch:{ all -> 0x00fc }
            if (r3 != 0) goto L_0x00f5
            r1[r2] = r7     // Catch:{ all -> 0x00fc }
            r1 = 1
            goto L_0x00f6
        L_0x00f5:
            r1 = 0
        L_0x00f6:
            r9.cellsBusy = r12
            if (r1 == 0) goto L_0x00ba
            goto L_0x019b
        L_0x00fc:
            r0 = move-exception
            r9.cellsBusy = r12
            throw r0
        L_0x0100:
            if (r15 != 0) goto L_0x0104
            r15 = 1
            goto L_0x0152
        L_0x0104:
            j$.sun.misc.c r2 = f107571h
            long r19 = f107576m
            long r3 = r1.value
            long r23 = r3 + r10
            r17 = r2
            r18 = r1
            r21 = r3
            boolean r1 = r17.mo42983d(r18, r19, r21, r23)
            if (r1 == 0) goto L_0x011a
            goto L_0x019b
        L_0x011a:
            j$.util.concurrent.c[] r1 = r9.f107581c
            if (r1 != r7) goto L_0x0150
            int r1 = f107570g
            if (r8 < r1) goto L_0x0123
            goto L_0x0150
        L_0x0123:
            if (r16 != 0) goto L_0x0128
            r16 = 1
            goto L_0x0152
        L_0x0128:
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x0152
            long r3 = f107575l
            r5 = 0
            r6 = 1
            r1 = r2
            r2 = r25
            boolean r1 = r1.mo42982c(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0152
            j$.util.concurrent.c[] r1 = r9.f107581c     // Catch:{ all -> 0x014c }
            if (r1 != r7) goto L_0x0147
            int r1 = r8 << 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r1)     // Catch:{ all -> 0x014c }
            j$.util.concurrent.c[] r1 = (p3186j$.util.concurrent.C41066c[]) r1     // Catch:{ all -> 0x014c }
            r9.f107581c = r1     // Catch:{ all -> 0x014c }
        L_0x0147:
            r9.cellsBusy = r12
            r1 = r15
            goto L_0x00b6
        L_0x014c:
            r0 = move-exception
            r9.cellsBusy = r12
            throw r0
        L_0x0150:
            r16 = 0
        L_0x0152:
            int r0 = p3186j$.util.concurrent.ThreadLocalRandom.m71691a(r0)
            goto L_0x00ba
        L_0x0158:
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x018b
            j$.util.concurrent.c[] r1 = r9.f107581c
            if (r1 != r7) goto L_0x018b
            j$.sun.misc.c r1 = f107571h
            long r3 = f107575l
            r5 = 0
            r6 = 1
            r2 = r25
            boolean r1 = r1.mo42982c(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x018b
            j$.util.concurrent.c[] r1 = r9.f107581c     // Catch:{ all -> 0x0187 }
            if (r1 != r7) goto L_0x0181
            j$.util.concurrent.c[] r1 = new p3186j$.util.concurrent.C41066c[r13]     // Catch:{ all -> 0x0187 }
            r2 = r0 & 1
            j$.util.concurrent.c r3 = new j$.util.concurrent.c     // Catch:{ all -> 0x0187 }
            r3.<init>(r10)     // Catch:{ all -> 0x0187 }
            r1[r2] = r3     // Catch:{ all -> 0x0187 }
            r9.f107581c = r1     // Catch:{ all -> 0x0187 }
            r1 = 1
            goto L_0x0182
        L_0x0181:
            r1 = 0
        L_0x0182:
            r9.cellsBusy = r12
            if (r1 == 0) goto L_0x00ba
            goto L_0x019b
        L_0x0187:
            r0 = move-exception
            r9.cellsBusy = r12
            throw r0
        L_0x018b:
            j$.sun.misc.c r1 = f107571h
            long r3 = f107574k
            long r5 = r9.baseCount
            long r7 = r5 + r10
            r2 = r25
            boolean r1 = r1.mo42983d(r2, r3, r5, r7)
            if (r1 == 0) goto L_0x00ba
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.ConcurrentHashMap.m71674a(long, int):void");
    }

    /* renamed from: b */
    static final boolean m71675b(C41074k[] kVarArr, int i, C41074k kVar) {
        long j = ((long) i) << f107578o;
        return f107571h.mo42984e(kVarArr, ((long) f107577n) + j, kVar);
    }

    /* renamed from: c */
    static Class m71676c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    static int m71677d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    private final C41074k[] m71678f() {
        while (true) {
            C41074k[] kVarArr = this.f107579a;
            if (kVarArr != null && kVarArr.length != 0) {
                return kVarArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else {
                if (f107571h.mo42982c(this, f107572i, i, -1)) {
                    try {
                        C41074k[] kVarArr2 = this.f107579a;
                        if (kVarArr2 == null || kVarArr2.length == 0) {
                            int i2 = i > 0 ? i : 16;
                            C41074k[] kVarArr3 = new C41074k[i2];
                            this.f107579a = kVarArr3;
                            i = i2 - (i2 >>> 2);
                            kVarArr2 = kVarArr3;
                        }
                        this.sizeCtl = i;
                        return kVarArr2;
                    } catch (Throwable th) {
                        this.sizeCtl = i;
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: i */
    static final void m71679i(C41074k[] kVarArr, int i, C41074k kVar) {
        f107571h.mo42989l(kVarArr, (((long) i) << f107578o) + ((long) f107577n), kVar);
    }

    /* renamed from: j */
    static final int m71680j(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    /* renamed from: l */
    static final C41074k m71681l(C41074k[] kVarArr, int i) {
        return (C41074k) f107571h.mo42986g(kVarArr, (((long) i) << f107578o) + ((long) f107577n));
    }

    /* renamed from: m */
    private static final int m71682m(int i) {
        int numberOfLeadingZeros = -1 >>> Integer.numberOfLeadingZeros(i - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: j$.util.concurrent.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: j$.util.concurrent.r} */
    /* JADX WARNING: type inference failed for: r6v12, types: [j$.util.concurrent.k] */
    /* JADX WARNING: type inference failed for: r13v11, types: [j$.util.concurrent.k] */
    /* JADX WARNING: type inference failed for: r6v17, types: [j$.util.concurrent.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m71683n(p3186j$.util.concurrent.C41074k[] r31, p3186j$.util.concurrent.C41074k[] r32) {
        /*
            r30 = this;
            r7 = r30
            r0 = r31
            int r8 = r0.length
            int r1 = f107570g
            r9 = 1
            if (r1 <= r9) goto L_0x000e
            int r2 = r8 >>> 3
            int r2 = r2 / r1
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            r10 = 16
            if (r2 >= r10) goto L_0x0016
            r11 = 16
            goto L_0x0017
        L_0x0016:
            r11 = r2
        L_0x0017:
            if (r32 != 0) goto L_0x0029
            int r1 = r8 << 1
            j$.util.concurrent.k[] r1 = new p3186j$.util.concurrent.C41074k[r1]     // Catch:{ all -> 0x0023 }
            r7.f107580b = r1
            r7.transferIndex = r8
            r12 = r1
            goto L_0x002b
        L_0x0023:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7.sizeCtl = r0
            return
        L_0x0029:
            r12 = r32
        L_0x002b:
            int r13 = r12.length
            j$.util.concurrent.g r14 = new j$.util.concurrent.g
            r14.<init>(r12)
            r4 = r0
            r3 = r7
            r5 = 0
            r6 = 0
            r16 = 1
            r17 = 0
        L_0x0039:
            r1 = -1
            if (r16 == 0) goto L_0x008d
            int r5 = r5 + -1
            if (r5 >= r6) goto L_0x007c
            if (r17 == 0) goto L_0x0043
            goto L_0x007c
        L_0x0043:
            int r2 = r3.transferIndex
            if (r2 > 0) goto L_0x004c
            r22 = r3
            r15 = r4
            r5 = -1
            goto L_0x0087
        L_0x004c:
            j$.sun.misc.c r1 = f107571h
            long r18 = f107573j
            if (r2 <= r11) goto L_0x0055
            int r20 = r2 - r11
            goto L_0x0057
        L_0x0055:
            r20 = 0
        L_0x0057:
            r21 = r2
            r2 = r30
            r22 = r3
            r15 = r4
            r3 = r18
            r18 = r5
            r5 = r21
            r19 = r6
            r6 = r20
            boolean r1 = r1.mo42982c(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0074
            int r2 = r21 + -1
            r5 = r2
            r6 = r20
            goto L_0x0087
        L_0x0074:
            r4 = r15
            r5 = r18
            r6 = r19
            r3 = r22
            goto L_0x0039
        L_0x007c:
            r22 = r3
            r15 = r4
            r18 = r5
            r19 = r6
            r5 = r18
            r6 = r19
        L_0x0087:
            r4 = r15
            r3 = r22
            r16 = 0
            goto L_0x0039
        L_0x008d:
            r22 = r3
            r15 = r4
            r19 = r6
            r2 = 0
            if (r5 < 0) goto L_0x01c3
            if (r5 >= r8) goto L_0x01c3
            int r3 = r5 + r8
            if (r3 < r13) goto L_0x009d
            goto L_0x01c3
        L_0x009d:
            j$.util.concurrent.k r4 = m71681l(r15, r5)
            if (r4 != 0) goto L_0x00b3
            boolean r1 = m71675b(r15, r5, r14)
            r16 = r1
            r21 = r11
            r7 = r14
            r4 = r15
            r3 = r22
            r22 = r13
            goto L_0x01ba
        L_0x00b3:
            int r6 = r4.f107605a
            if (r6 != r1) goto L_0x00c7
            r9 = r7
            r21 = r11
            r7 = r14
            r4 = r15
            r3 = r22
            r2 = 16
            r10 = 1
            r16 = 1
            r22 = r13
            goto L_0x020b
        L_0x00c7:
            monitor-enter(r4)
            j$.util.concurrent.k r1 = m71681l(r15, r5)     // Catch:{ all -> 0x01c0 }
            if (r1 != r4) goto L_0x01b1
            if (r6 < 0) goto L_0x0123
            r1 = r6 & r8
            j$.util.concurrent.k r6 = r4.f107608d     // Catch:{ all -> 0x01c0 }
            r10 = r4
        L_0x00d5:
            if (r6 == 0) goto L_0x00e2
            int r9 = r6.f107605a     // Catch:{ all -> 0x01c0 }
            r9 = r9 & r8
            if (r9 == r1) goto L_0x00de
            r10 = r6
            r1 = r9
        L_0x00de:
            j$.util.concurrent.k r6 = r6.f107608d     // Catch:{ all -> 0x01c0 }
            r9 = 1
            goto L_0x00d5
        L_0x00e2:
            if (r1 != 0) goto L_0x00e6
            r1 = r10
            goto L_0x00e8
        L_0x00e6:
            r1 = r2
            r2 = r10
        L_0x00e8:
            r6 = r4
        L_0x00e9:
            if (r6 == r10) goto L_0x0113
            int r9 = r6.f107605a     // Catch:{ all -> 0x01c0 }
            r16 = r10
            java.lang.Object r10 = r6.f107606b     // Catch:{ all -> 0x01c0 }
            r21 = r11
            java.lang.Object r11 = r6.f107607c     // Catch:{ all -> 0x01c0 }
            r22 = r9 & r8
            if (r22 != 0) goto L_0x0102
            r22 = r13
            j$.util.concurrent.k r13 = new j$.util.concurrent.k     // Catch:{ all -> 0x01c0 }
            r13.<init>(r9, r10, r11, r1)     // Catch:{ all -> 0x01c0 }
            r1 = r13
            goto L_0x010a
        L_0x0102:
            r22 = r13
            j$.util.concurrent.k r13 = new j$.util.concurrent.k     // Catch:{ all -> 0x01c0 }
            r13.<init>(r9, r10, r11, r2)     // Catch:{ all -> 0x01c0 }
            r2 = r13
        L_0x010a:
            j$.util.concurrent.k r6 = r6.f107608d     // Catch:{ all -> 0x01c0 }
            r10 = r16
            r11 = r21
            r13 = r22
            goto L_0x00e9
        L_0x0113:
            r21 = r11
            r22 = r13
            m71679i(r12, r5, r1)     // Catch:{ all -> 0x01c0 }
            m71679i(r12, r3, r2)     // Catch:{ all -> 0x01c0 }
            m71679i(r15, r5, r14)     // Catch:{ all -> 0x01c0 }
            r7 = r14
            goto L_0x01ae
        L_0x0123:
            r21 = r11
            r22 = r13
            boolean r1 = r4 instanceof p3186j$.util.concurrent.C41080q     // Catch:{ all -> 0x01c0 }
            if (r1 == 0) goto L_0x01b5
            r1 = r4
            j$.util.concurrent.q r1 = (p3186j$.util.concurrent.C41080q) r1     // Catch:{ all -> 0x01c0 }
            j$.util.concurrent.r r6 = r1.f107624f     // Catch:{ all -> 0x01c0 }
            r9 = r2
            r10 = r9
            r11 = r6
            r13 = 0
            r15 = 0
            r6 = r10
        L_0x0136:
            if (r11 == 0) goto L_0x0179
            r16 = r1
            int r1 = r11.f107605a     // Catch:{ all -> 0x01c0 }
            j$.util.concurrent.r r7 = new j$.util.concurrent.r     // Catch:{ all -> 0x01c0 }
            java.lang.Object r0 = r11.f107606b     // Catch:{ all -> 0x01c0 }
            r29 = r14
            java.lang.Object r14 = r11.f107607c     // Catch:{ all -> 0x01c0 }
            r27 = 0
            r28 = 0
            r23 = r7
            r24 = r1
            r25 = r0
            r26 = r14
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x01c0 }
            r0 = r1 & r8
            if (r0 != 0) goto L_0x0163
            r7.f107629h = r10     // Catch:{ all -> 0x01c0 }
            if (r10 != 0) goto L_0x015d
            r2 = r7
            goto L_0x015f
        L_0x015d:
            r10.f107608d = r7     // Catch:{ all -> 0x01c0 }
        L_0x015f:
            int r13 = r13 + 1
            r10 = r7
            goto L_0x016e
        L_0x0163:
            r7.f107629h = r9     // Catch:{ all -> 0x01c0 }
            if (r9 != 0) goto L_0x0169
            r6 = r7
            goto L_0x016b
        L_0x0169:
            r9.f107608d = r7     // Catch:{ all -> 0x01c0 }
        L_0x016b:
            int r15 = r15 + 1
            r9 = r7
        L_0x016e:
            j$.util.concurrent.k r11 = r11.f107608d     // Catch:{ all -> 0x01c0 }
            r7 = r30
            r0 = r31
            r1 = r16
            r14 = r29
            goto L_0x0136
        L_0x0179:
            r16 = r1
            r29 = r14
            r0 = 6
            if (r13 > r0) goto L_0x0185
            j$.util.concurrent.k r1 = m71686q(r2)     // Catch:{ all -> 0x01c0 }
            goto L_0x018f
        L_0x0185:
            if (r15 == 0) goto L_0x018d
            j$.util.concurrent.q r1 = new j$.util.concurrent.q     // Catch:{ all -> 0x01c0 }
            r1.<init>(r2)     // Catch:{ all -> 0x01c0 }
            goto L_0x018f
        L_0x018d:
            r1 = r16
        L_0x018f:
            if (r15 > r0) goto L_0x0196
            j$.util.concurrent.k r0 = m71686q(r6)     // Catch:{ all -> 0x01c0 }
            goto L_0x01a0
        L_0x0196:
            if (r13 == 0) goto L_0x019e
            j$.util.concurrent.q r0 = new j$.util.concurrent.q     // Catch:{ all -> 0x01c0 }
            r0.<init>(r6)     // Catch:{ all -> 0x01c0 }
            goto L_0x01a0
        L_0x019e:
            r0 = r16
        L_0x01a0:
            m71679i(r12, r5, r1)     // Catch:{ all -> 0x01c0 }
            m71679i(r12, r3, r0)     // Catch:{ all -> 0x01c0 }
            r0 = r31
            r7 = r29
            m71679i(r0, r5, r7)     // Catch:{ all -> 0x01c0 }
            r15 = r0
        L_0x01ae:
            r16 = 1
            goto L_0x01b6
        L_0x01b1:
            r21 = r11
            r22 = r13
        L_0x01b5:
            r7 = r14
        L_0x01b6:
            monitor-exit(r4)     // Catch:{ all -> 0x01c0 }
            r3 = r30
            r4 = r15
        L_0x01ba:
            r2 = 16
            r10 = 1
            r9 = r30
            goto L_0x020b
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01c0 }
            throw r0
        L_0x01c3:
            r21 = r11
            r22 = r13
            r7 = r14
            if (r17 == 0) goto L_0x01d9
            r9 = r30
            r9.f107580b = r2
            r9.f107579a = r12
            int r0 = r8 << 1
            r10 = 1
            int r1 = r8 >>> 1
            int r0 = r0 - r1
            r9.sizeCtl = r0
            return
        L_0x01d9:
            r10 = 1
            r9 = r30
            j$.sun.misc.c r1 = f107571h
            long r3 = f107572i
            int r11 = r9.sizeCtl
            int r6 = r11 + -1
            r2 = r30
            r13 = r5
            r5 = r11
            boolean r1 = r1.mo42982c(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0206
            int r11 = r11 + -2
            int r1 = java.lang.Integer.numberOfLeadingZeros(r8)
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            r2 = 16
            int r1 = r1 << r2
            if (r11 == r1) goto L_0x01fe
            return
        L_0x01fe:
            r5 = r8
            r3 = r9
            r4 = r15
            r16 = 1
            r17 = 1
            goto L_0x020b
        L_0x0206:
            r2 = 16
            r3 = r9
            r5 = r13
            r4 = r15
        L_0x020b:
            r14 = r7
            r7 = r9
            r6 = r19
            r11 = r21
            r13 = r22
            r9 = 1
            r10 = 16
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.ConcurrentHashMap.m71683n(j$.util.concurrent.k[], j$.util.concurrent.k[]):void");
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
    }

    /* renamed from: o */
    private final void m71684o(C41074k[] kVarArr, int i) {
        int length = kVarArr.length;
        if (length < 64) {
            m71685p(length << 1);
            return;
        }
        C41074k l = m71681l(kVarArr, i);
        if (l != null && l.f107605a >= 0) {
            synchronized (l) {
                if (m71681l(kVarArr, i) == l) {
                    C41081r rVar = null;
                    C41074k kVar = l;
                    C41081r rVar2 = null;
                    while (kVar != null) {
                        C41081r rVar3 = new C41081r(kVar.f107605a, kVar.f107606b, kVar.f107607c, (C41081r) null, (C41081r) null);
                        rVar3.f107629h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f107608d = rVar3;
                        }
                        kVar = kVar.f107608d;
                        rVar2 = rVar3;
                    }
                    m71679i(kVarArr, i, new C41080q(rVar));
                }
            }
        }
    }

    /* renamed from: p */
    private final void m71685p(int i) {
        int i2;
        int i3;
        int length;
        if (i >= 536870912) {
            i2 = 1073741824;
        } else {
            i2 = m71682m(i + (i >>> 1) + 1);
        }
        while (true) {
            int i4 = this.sizeCtl;
            if (i4 >= 0) {
                C41074k[] kVarArr = this.f107579a;
                if (kVarArr == null || (length = kVarArr.length) == 0) {
                    if (i4 > i2) {
                        i3 = i4;
                    } else {
                        i3 = i2;
                    }
                    if (f107571h.mo42982c(this, f107572i, i4, -1)) {
                        try {
                            if (this.f107579a == kVarArr) {
                                this.f107579a = new C41074k[i3];
                                i4 = i3 - (i3 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i4;
                        }
                    }
                } else if (i2 > i4 && length < 1073741824) {
                    if (kVarArr == this.f107579a) {
                        C40953c cVar = f107571h;
                        int numberOfLeadingZeros = ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2;
                        if (cVar.mo42982c(this, f107572i, i4, numberOfLeadingZeros)) {
                            m71683n(kVarArr, (C41074k[]) null);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    static C41074k m71686q(C41081r rVar) {
        C41074k kVar = null;
        C41074k kVar2 = null;
        for (C41074k kVar3 = rVar; kVar3 != null; kVar3 = kVar3.f107608d) {
            C41074k kVar4 = new C41074k(kVar3.f107605a, kVar3.f107606b, kVar3.f107607c);
            if (kVar2 == null) {
                kVar = kVar4;
            } else {
                kVar2.f107608d = kVar4;
            }
            kVar2 = kVar4;
        }
        return kVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j;
        boolean z;
        boolean z2;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        C41074k kVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j = 1;
            if (readObject != null && readObject2 != null) {
                j3++;
                kVar = new C41074k(m71680j(readObject.hashCode()), readObject, readObject2, kVar);
            }
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        double d = (double) (((float) j3) / 0.75f);
        Double.isNaN(d);
        Double.isNaN(d);
        long j4 = (long) (d + 1.0d);
        int m = j4 >= 1073741824 ? 1073741824 : m71682m((int) j4);
        C41074k[] kVarArr = new C41074k[m];
        int i = m - 1;
        while (kVar != null) {
            C41074k kVar2 = kVar.f107608d;
            int i2 = kVar.f107605a;
            int i3 = i2 & i;
            C41074k l = m71681l(kVarArr, i3);
            if (l == null) {
                z = true;
            } else {
                Object obj2 = kVar.f107606b;
                if (l.f107605a >= 0) {
                    C41074k kVar3 = l;
                    int i4 = 0;
                    while (true) {
                        if (kVar3 == null) {
                            z2 = true;
                            break;
                        } else if (kVar3.f107605a != i2 || ((obj = kVar3.f107606b) != obj2 && (obj == null || !obj2.equals(obj)))) {
                            i4++;
                            kVar3 = kVar3.f107608d;
                        }
                    }
                    z2 = false;
                    if (!z2 || i4 < 8) {
                        z = z2;
                    } else {
                        long j5 = j2 + 1;
                        kVar.f107608d = l;
                        C41074k kVar4 = kVar;
                        C41081r rVar = null;
                        C41081r rVar2 = null;
                        while (kVar4 != null) {
                            long j6 = j5;
                            C41081r rVar3 = new C41081r(kVar4.f107605a, kVar4.f107606b, kVar4.f107607c, (C41081r) null, (C41081r) null);
                            rVar3.f107629h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f107608d = rVar3;
                            }
                            kVar4 = kVar4.f107608d;
                            rVar2 = rVar3;
                            j5 = j6;
                        }
                        m71679i(kVarArr, i3, new C41080q(rVar));
                        j2 = j5;
                    }
                } else if (((C41080q) l).mo43573e(i2, obj2, kVar.f107607c) == null) {
                    j2 += j;
                }
                z = false;
            }
            j = 1;
            if (z) {
                j2++;
                kVar.f107608d = l;
                m71679i(kVarArr, i3, kVar);
            }
            kVar = kVar2;
        }
        this.f107579a = kVarArr;
        this.sizeCtl = m - (m >>> 2);
        this.baseCount = j2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = 1;
        int i2 = 0;
        while (i < 16) {
            i2++;
            i <<= 1;
        }
        int i3 = 32 - i2;
        int i4 = i - 1;
        C41077n[] nVarArr = new C41077n[16];
        for (int i5 = 0; i5 < 16; i5++) {
            nVarArr[i5] = new C41077n();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", nVarArr);
        putFields.put("segmentShift", i3);
        putFields.put("segmentMask", i4);
        objectOutputStream.writeFields();
        C41074k[] kVarArr = this.f107579a;
        if (kVarArr != null) {
            C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                C41074k c = pVar.mo43572c();
                if (c == null) {
                    break;
                }
                objectOutputStream.writeObject(c.f107606b);
                objectOutputStream.writeObject(c.f107607c);
            }
        }
        objectOutputStream.writeObject((Object) null);
        objectOutputStream.writeObject((Object) null);
    }

    public void clear() {
        C41074k[] kVarArr = this.f107579a;
        long j = 0;
        loop0:
        while (true) {
            int i = 0;
            while (kVarArr != null && i < kVarArr.length) {
                C41074k l = m71681l(kVarArr, i);
                if (l == null) {
                    i++;
                } else {
                    int i2 = l.f107605a;
                    if (i2 == -1) {
                        kVarArr = mo43525e(kVarArr, l);
                    } else {
                        synchronized (l) {
                            if (m71681l(kVarArr, i) == l) {
                                for (C41074k kVar = i2 >= 0 ? l : l instanceof C41080q ? ((C41080q) l).f107624f : null; kVar != null; kVar = kVar.f107608d) {
                                    j--;
                                }
                                m71679i(kVarArr, i, (C41074k) null);
                                i++;
                            }
                        }
                    }
                }
            }
        }
        if (j != 0) {
            m71674a(j, -1);
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj2;
        Object obj3;
        int i;
        C41074k kVar;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int j = m71680j(obj.hashCode());
        C41074k[] kVarArr = this.f107579a;
        int i2 = 0;
        Object obj4 = null;
        int i3 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & j;
                    C41074k l = m71681l(kVarArr, i4);
                    if (l == null) {
                        C41075l lVar = new C41075l();
                        synchronized (lVar) {
                            if (m71675b(kVarArr, i4, lVar)) {
                                try {
                                    Object apply = biFunction.apply(obj, null);
                                    if (apply != null) {
                                        kVar = new C41074k(j, obj, apply);
                                        i = 1;
                                    } else {
                                        i = i2;
                                        kVar = null;
                                    }
                                    m71679i(kVarArr, i4, kVar);
                                    i2 = i;
                                    obj4 = apply;
                                    i3 = 1;
                                } catch (Throwable th) {
                                    m71679i(kVarArr, i4, (C41074k) null);
                                    throw th;
                                }
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    } else {
                        int i5 = l.f107605a;
                        if (i5 == -1) {
                            kVarArr = mo43525e(kVarArr, l);
                        } else {
                            synchronized (l) {
                                try {
                                    if (m71681l(kVarArr, i4) == l) {
                                        if (i5 >= 0) {
                                            C41074k kVar2 = null;
                                            C41074k kVar3 = l;
                                            int i6 = 1;
                                            while (true) {
                                                if (kVar3.f107605a != j || ((obj3 = kVar3.f107606b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                    C41074k kVar4 = kVar3.f107608d;
                                                    if (kVar4 == null) {
                                                        Object apply2 = biFunction.apply(obj, null);
                                                        if (apply2 == null) {
                                                            obj2 = apply2;
                                                        } else if (kVar3.f107608d == null) {
                                                            kVar3.f107608d = new C41074k(j, obj, apply2);
                                                            obj2 = apply2;
                                                            i2 = 1;
                                                        } else {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                    } else {
                                                        i6++;
                                                        C41074k kVar5 = kVar4;
                                                        kVar2 = kVar3;
                                                        kVar3 = kVar5;
                                                    }
                                                }
                                            }
                                            obj2 = biFunction.apply(obj, kVar3.f107607c);
                                            if (obj2 != null) {
                                                kVar3.f107607c = obj2;
                                            } else {
                                                C41074k kVar6 = kVar3.f107608d;
                                                if (kVar2 != null) {
                                                    kVar2.f107608d = kVar6;
                                                } else {
                                                    m71679i(kVarArr, i4, kVar6);
                                                }
                                                i2 = -1;
                                            }
                                            i3 = i6;
                                            obj4 = obj2;
                                        } else if (l instanceof C41080q) {
                                            C41080q qVar = (C41080q) l;
                                            C41081r rVar = qVar.f107623e;
                                            C41081r b = rVar != null ? rVar.mo43575b(j, obj, (Class) null) : null;
                                            Object apply3 = biFunction.apply(obj, b == null ? null : b.f107607c);
                                            if (apply3 != null) {
                                                if (b != null) {
                                                    b.f107607c = apply3;
                                                } else {
                                                    qVar.mo43573e(j, obj, apply3);
                                                    i2 = 1;
                                                }
                                            } else if (b != null) {
                                                if (qVar.mo43574f(b)) {
                                                    m71679i(kVarArr, i4, m71686q(qVar.f107624f));
                                                }
                                                i2 = -1;
                                            }
                                            obj4 = apply3;
                                            i3 = 1;
                                        } else if (l instanceof C41075l) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (Throwable th2) {
                                    while (true) {
                                        throw th2;
                                    }
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    m71684o(kVarArr, i4);
                                }
                            }
                        }
                    }
                }
            }
            kVarArr = m71678f();
        }
        if (i2 != 0) {
            m71674a((long) i2, i3);
        }
        return obj4;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00f0, code lost:
        if (r5 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x00f2, code lost:
        m71674a(1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x00f7, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, p3186j$.util.function.Function r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x0101
            if (r13 == 0) goto L_0x0101
            int r1 = r12.hashCode()
            int r1 = m71680j(r1)
            j$.util.concurrent.k[] r2 = r11.f107579a
            r3 = 0
            r5 = r0
            r4 = 0
        L_0x0012:
            if (r2 == 0) goto L_0x00fb
            int r6 = r2.length
            if (r6 != 0) goto L_0x0019
            goto L_0x00fb
        L_0x0019:
            int r6 = r6 + -1
            r6 = r6 & r1
            j$.util.concurrent.k r7 = m71681l(r2, r6)
            r8 = 1
            if (r7 != 0) goto L_0x004f
            j$.util.concurrent.l r9 = new j$.util.concurrent.l
            r9.<init>()
            monitor-enter(r9)
            boolean r7 = m71675b(r2, r6, r9)     // Catch:{ all -> 0x004c }
            if (r7 == 0) goto L_0x0047
            java.lang.Object r4 = r13.apply(r12)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x003b
            j$.util.concurrent.k r5 = new j$.util.concurrent.k     // Catch:{ all -> 0x0042 }
            r5.<init>(r1, r12, r4)     // Catch:{ all -> 0x0042 }
            goto L_0x003c
        L_0x003b:
            r5 = r0
        L_0x003c:
            m71679i(r2, r6, r5)     // Catch:{ all -> 0x004c }
            r5 = r4
            r4 = 1
            goto L_0x0047
        L_0x0042:
            r12 = move-exception
            m71679i(r2, r6, r0)     // Catch:{ all -> 0x004c }
            throw r12     // Catch:{ all -> 0x004c }
        L_0x0047:
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0012
            goto L_0x00f0
        L_0x004c:
            r12 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            throw r12
        L_0x004f:
            int r9 = r7.f107605a
            r10 = -1
            if (r9 != r10) goto L_0x0059
            j$.util.concurrent.k[] r2 = r11.mo43525e(r2, r7)
            goto L_0x0012
        L_0x0059:
            if (r9 != r1) goto L_0x006c
            java.lang.Object r10 = r7.f107606b
            if (r10 == r12) goto L_0x0067
            if (r10 == 0) goto L_0x006c
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x006c
        L_0x0067:
            java.lang.Object r10 = r7.f107607c
            if (r10 == 0) goto L_0x006c
            return r10
        L_0x006c:
            monitor-enter(r7)
            j$.util.concurrent.k r10 = m71681l(r2, r6)     // Catch:{ all -> 0x00f8 }
            if (r10 != r7) goto L_0x00e2
            if (r9 < 0) goto L_0x00b2
            r4 = r7
            r5 = 1
        L_0x0077:
            int r9 = r4.f107605a     // Catch:{ all -> 0x00f8 }
            if (r9 != r1) goto L_0x008a
            java.lang.Object r9 = r4.f107606b     // Catch:{ all -> 0x00f8 }
            if (r9 == r12) goto L_0x0087
            if (r9 == 0) goto L_0x008a
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x00f8 }
            if (r9 == 0) goto L_0x008a
        L_0x0087:
            java.lang.Object r4 = r4.f107607c     // Catch:{ all -> 0x00f8 }
            goto L_0x00a9
        L_0x008a:
            j$.util.concurrent.k r9 = r4.f107608d     // Catch:{ all -> 0x00f8 }
            if (r9 != 0) goto L_0x00ae
            java.lang.Object r9 = r13.apply(r12)     // Catch:{ all -> 0x00f8 }
            if (r9 == 0) goto L_0x00a8
            j$.util.concurrent.k r10 = r4.f107608d     // Catch:{ all -> 0x00f8 }
            if (r10 != 0) goto L_0x00a0
            j$.util.concurrent.k r10 = new j$.util.concurrent.k     // Catch:{ all -> 0x00f8 }
            r10.<init>(r1, r12, r9)     // Catch:{ all -> 0x00f8 }
            r4.f107608d = r10     // Catch:{ all -> 0x00f8 }
            goto L_0x00ab
        L_0x00a0:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f8 }
            java.lang.String r13 = "Recursive update"
            r12.<init>(r13)     // Catch:{ all -> 0x00f8 }
            throw r12     // Catch:{ all -> 0x00f8 }
        L_0x00a8:
            r4 = r9
        L_0x00a9:
            r9 = r4
            r8 = 0
        L_0x00ab:
            r4 = r5
            r5 = r9
            goto L_0x00e3
        L_0x00ae:
            int r5 = r5 + 1
            r4 = r9
            goto L_0x0077
        L_0x00b2:
            boolean r9 = r7 instanceof p3186j$.util.concurrent.C41080q     // Catch:{ all -> 0x00f8 }
            if (r9 == 0) goto L_0x00d5
            r4 = r7
            j$.util.concurrent.q r4 = (p3186j$.util.concurrent.C41080q) r4     // Catch:{ all -> 0x00f8 }
            j$.util.concurrent.r r5 = r4.f107623e     // Catch:{ all -> 0x00f8 }
            if (r5 == 0) goto L_0x00c6
            j$.util.concurrent.r r5 = r5.mo43575b(r1, r12, r0)     // Catch:{ all -> 0x00f8 }
            if (r5 == 0) goto L_0x00c6
            java.lang.Object r4 = r5.f107607c     // Catch:{ all -> 0x00f8 }
            goto L_0x00d1
        L_0x00c6:
            java.lang.Object r5 = r13.apply(r12)     // Catch:{ all -> 0x00f8 }
            if (r5 == 0) goto L_0x00d0
            r4.mo43573e(r1, r12, r5)     // Catch:{ all -> 0x00f8 }
            goto L_0x00d3
        L_0x00d0:
            r4 = r5
        L_0x00d1:
            r5 = r4
            r8 = 0
        L_0x00d3:
            r4 = 2
            goto L_0x00e3
        L_0x00d5:
            boolean r8 = r7 instanceof p3186j$.util.concurrent.C41075l     // Catch:{ all -> 0x00f8 }
            if (r8 != 0) goto L_0x00da
            goto L_0x00e2
        L_0x00da:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f8 }
            java.lang.String r13 = "Recursive update"
            r12.<init>(r13)     // Catch:{ all -> 0x00f8 }
            throw r12     // Catch:{ all -> 0x00f8 }
        L_0x00e2:
            r8 = 0
        L_0x00e3:
            monitor-exit(r7)     // Catch:{ all -> 0x00f8 }
            if (r4 == 0) goto L_0x0012
            r12 = 8
            if (r4 < r12) goto L_0x00ed
            r11.m71684o(r2, r6)
        L_0x00ed:
            if (r8 != 0) goto L_0x00f0
            return r5
        L_0x00f0:
            if (r5 == 0) goto L_0x00f7
            r12 = 1
            r11.m71674a(r12, r4)
        L_0x00f7:
            return r5
        L_0x00f8:
            r12 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f8 }
            throw r12
        L_0x00fb:
            j$.util.concurrent.k[] r2 = r11.m71678f()
            goto L_0x0012
        L_0x0101:
            goto L_0x0103
        L_0x0102:
            throw r0
        L_0x0103:
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        C41081r b;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int j = m71680j(obj.hashCode());
        C41074k[] kVarArr = this.f107579a;
        int i = 0;
        Object obj3 = null;
        int i2 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i3 = (length - 1) & j;
                    C41074k l = m71681l(kVarArr, i3);
                    if (l == null) {
                        break;
                    }
                    int i4 = l.f107605a;
                    if (i4 == -1) {
                        kVarArr = mo43525e(kVarArr, l);
                    } else {
                        synchronized (l) {
                            try {
                                if (m71681l(kVarArr, i3) == l) {
                                    if (i4 >= 0) {
                                        i2 = 1;
                                        C41074k kVar = null;
                                        C41074k kVar2 = l;
                                        while (true) {
                                            if (kVar2.f107605a != j || ((obj2 = kVar2.f107606b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                                C41074k kVar3 = kVar2.f107608d;
                                                if (kVar3 == null) {
                                                    break;
                                                }
                                                i2++;
                                                C41074k kVar4 = kVar3;
                                                kVar = kVar2;
                                                kVar2 = kVar4;
                                            }
                                        }
                                        obj3 = biFunction.apply(obj, kVar2.f107607c);
                                        if (obj3 != null) {
                                            kVar2.f107607c = obj3;
                                        } else {
                                            C41074k kVar5 = kVar2.f107608d;
                                            if (kVar != null) {
                                                kVar.f107608d = kVar5;
                                            } else {
                                                m71679i(kVarArr, i3, kVar5);
                                            }
                                            i = -1;
                                        }
                                    } else if (l instanceof C41080q) {
                                        C41080q qVar = (C41080q) l;
                                        C41081r rVar = qVar.f107623e;
                                        if (!(rVar == null || (b = rVar.mo43575b(j, obj, (Class) null)) == null)) {
                                            obj3 = biFunction.apply(obj, b.f107607c);
                                            if (obj3 != null) {
                                                b.f107607c = obj3;
                                            } else {
                                                if (qVar.mo43574f(b)) {
                                                    m71679i(kVarArr, i3, m71686q(qVar.f107624f));
                                                }
                                                i = -1;
                                            }
                                        }
                                        i2 = 2;
                                    } else if (l instanceof C41075l) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
            kVarArr = m71678f();
        }
        if (i != 0) {
            m71674a((long) i, i2);
        }
        return obj3;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        if (obj != null) {
            C41074k[] kVarArr = this.f107579a;
            if (kVarArr != null) {
                C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
                while (true) {
                    C41074k c = pVar.mo43572c();
                    if (c == null) {
                        break;
                    }
                    Object obj2 = c.f107607c;
                    if (obj2 == obj) {
                        return true;
                    }
                    if (obj2 != null && obj.equals(obj2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C41074k[] mo43525e(C41074k[] kVarArr, C41074k kVar) {
        C41074k[] kVarArr2;
        int i;
        if (!(kVar instanceof C41070g) || (kVarArr2 = ((C41070g) kVar).f107598e) == null) {
            return this.f107579a;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(kVarArr.length) | 32768;
        while (true) {
            if (kVarArr2 != this.f107580b || this.f107579a != kVarArr || (i = this.sizeCtl) >= 0 || (i >>> 16) != numberOfLeadingZeros || i == numberOfLeadingZeros + 1 || i == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            }
            if (f107571h.mo42982c(this, f107572i, i, i + 1)) {
                m71683n(kVarArr, kVarArr2);
                break;
            }
        }
        return kVarArr2;
    }

    public Enumeration<V> elements() {
        C41074k[] kVarArr = this.f107579a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new C41071h(kVarArr, length, length, this, 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C41068e eVar = this.f107584f;
        if (eVar != null) {
            return eVar;
        }
        C41068e eVar2 = new C41068e(this);
        this.f107584f = eVar2;
        return eVar2;
    }

    public final boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C41074k[] kVarArr = this.f107579a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        C41079p pVar = new C41079p(kVarArr, length, 0, length);
        while (true) {
            C41074k c = pVar.mo43572c();
            if (c != null) {
                Object obj3 = c.f107607c;
                Object obj4 = map.get(c.f107606b);
                if (obj4 == null || (obj4 != obj3 && !obj4.equals(obj3))) {
                    return false;
                }
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (obj2 = get(key)) == null || (value != obj2 && !value.equals(obj2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer != null) {
            C41074k[] kVarArr = this.f107579a;
            if (kVarArr != null) {
                C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
                while (true) {
                    C41074k c = pVar.mo43572c();
                    if (c != null) {
                        biConsumer.accept(c.f107606b, c.f107607c);
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b1, code lost:
        m71674a(1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b6, code lost:
        return null;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo43527g(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x00c0
            if (r10 == 0) goto L_0x00c0
            int r1 = r9.hashCode()
            int r1 = m71680j(r1)
            j$.util.concurrent.k[] r2 = r8.f107579a
            r3 = 0
        L_0x0010:
            if (r2 == 0) goto L_0x00ba
            int r4 = r2.length
            if (r4 != 0) goto L_0x0017
            goto L_0x00ba
        L_0x0017:
            int r4 = r4 + -1
            r4 = r4 & r1
            j$.util.concurrent.k r5 = m71681l(r2, r4)
            if (r5 != 0) goto L_0x002d
            j$.util.concurrent.k r5 = new j$.util.concurrent.k
            r5.<init>(r1, r9, r10)
            boolean r4 = m71675b(r2, r4, r5)
            if (r4 == 0) goto L_0x0010
            goto L_0x00b1
        L_0x002d:
            int r6 = r5.f107605a
            r7 = -1
            if (r6 != r7) goto L_0x0037
            j$.util.concurrent.k[] r2 = r8.mo43525e(r2, r5)
            goto L_0x0010
        L_0x0037:
            if (r11 == 0) goto L_0x004c
            if (r6 != r1) goto L_0x004c
            java.lang.Object r7 = r5.f107606b
            if (r7 == r9) goto L_0x0047
            if (r7 == 0) goto L_0x004c
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x004c
        L_0x0047:
            java.lang.Object r7 = r5.f107607c
            if (r7 == 0) goto L_0x004c
            return r7
        L_0x004c:
            monitor-enter(r5)
            j$.util.concurrent.k r7 = m71681l(r2, r4)     // Catch:{ all -> 0x00b7 }
            if (r7 != r5) goto L_0x00a3
            if (r6 < 0) goto L_0x007e
            r3 = 1
            r6 = r5
        L_0x0057:
            int r7 = r6.f107605a     // Catch:{ all -> 0x00b7 }
            if (r7 != r1) goto L_0x006e
            java.lang.Object r7 = r6.f107606b     // Catch:{ all -> 0x00b7 }
            if (r7 == r9) goto L_0x0067
            if (r7 == 0) goto L_0x006e
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x00b7 }
            if (r7 == 0) goto L_0x006e
        L_0x0067:
            java.lang.Object r7 = r6.f107607c     // Catch:{ all -> 0x00b7 }
            if (r11 != 0) goto L_0x00a4
            r6.f107607c = r10     // Catch:{ all -> 0x00b7 }
            goto L_0x00a4
        L_0x006e:
            j$.util.concurrent.k r7 = r6.f107608d     // Catch:{ all -> 0x00b7 }
            if (r7 != 0) goto L_0x007a
            j$.util.concurrent.k r7 = new j$.util.concurrent.k     // Catch:{ all -> 0x00b7 }
            r7.<init>(r1, r9, r10)     // Catch:{ all -> 0x00b7 }
            r6.f107608d = r7     // Catch:{ all -> 0x00b7 }
            goto L_0x00a3
        L_0x007a:
            int r3 = r3 + 1
            r6 = r7
            goto L_0x0057
        L_0x007e:
            boolean r6 = r5 instanceof p3186j$.util.concurrent.C41080q     // Catch:{ all -> 0x00b7 }
            if (r6 == 0) goto L_0x0096
            r3 = r5
            j$.util.concurrent.q r3 = (p3186j$.util.concurrent.C41080q) r3     // Catch:{ all -> 0x00b7 }
            j$.util.concurrent.r r3 = r3.mo43573e(r1, r9, r10)     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x0093
            java.lang.Object r6 = r3.f107607c     // Catch:{ all -> 0x00b7 }
            if (r11 != 0) goto L_0x0091
            r3.f107607c = r10     // Catch:{ all -> 0x00b7 }
        L_0x0091:
            r7 = r6
            goto L_0x0094
        L_0x0093:
            r7 = r0
        L_0x0094:
            r3 = 2
            goto L_0x00a4
        L_0x0096:
            boolean r6 = r5 instanceof p3186j$.util.concurrent.C41075l     // Catch:{ all -> 0x00b7 }
            if (r6 != 0) goto L_0x009b
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b7 }
            java.lang.String r10 = "Recursive update"
            r9.<init>(r10)     // Catch:{ all -> 0x00b7 }
            throw r9     // Catch:{ all -> 0x00b7 }
        L_0x00a3:
            r7 = r0
        L_0x00a4:
            monitor-exit(r5)     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x0010
            r9 = 8
            if (r3 < r9) goto L_0x00ae
            r8.m71684o(r2, r4)
        L_0x00ae:
            if (r7 == 0) goto L_0x00b1
            return r7
        L_0x00b1:
            r9 = 1
            r8.m71674a(r9, r3)
            return r0
        L_0x00b7:
            r9 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b7 }
            throw r9
        L_0x00ba:
            j$.util.concurrent.k[] r2 = r8.m71678f()
            goto L_0x0010
        L_0x00c0:
            goto L_0x00c2
        L_0x00c1:
            throw r0
        L_0x00c2:
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.ConcurrentHashMap.mo43527g(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return r1.f107607c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = m71680j(r0)
            j$.util.concurrent.k[] r1 = r4.f107579a
            r2 = 0
            if (r1 == 0) goto L_0x004e
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004e
            int r3 = r3 + -1
            r3 = r3 & r0
            j$.util.concurrent.k r1 = m71681l(r1, r3)
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f107605a
            if (r3 != r0) goto L_0x002c
            java.lang.Object r3 = r1.f107606b
            if (r3 == r5) goto L_0x0029
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x0029:
            java.lang.Object r5 = r1.f107607c
            return r5
        L_0x002c:
            if (r3 >= 0) goto L_0x0037
            j$.util.concurrent.k r5 = r1.mo43558a(r0, r5)
            if (r5 == 0) goto L_0x0036
            java.lang.Object r2 = r5.f107607c
        L_0x0036:
            return r2
        L_0x0037:
            j$.util.concurrent.k r1 = r1.f107608d
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f107605a
            if (r3 != r0) goto L_0x0037
            java.lang.Object r3 = r1.f107606b
            if (r3 == r5) goto L_0x004b
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x004b:
            java.lang.Object r5 = r1.f107607c
            return r5
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Object mo43528h(Object obj, Object obj2, Object obj3) {
        int length;
        int i;
        C41074k l;
        Object obj4;
        boolean z;
        C41074k kVar;
        C41081r b;
        Object obj5;
        int j = m71680j(obj.hashCode());
        C41074k[] kVarArr = this.f107579a;
        while (true) {
            if (kVarArr == null || (length = kVarArr.length) == 0 || (l = m71681l(kVarArr, i)) == null) {
                break;
            }
            int i2 = l.f107605a;
            if (i2 == -1) {
                kVarArr = mo43525e(kVarArr, l);
            } else {
                synchronized (l) {
                    try {
                        if (m71681l(kVarArr, (i = (length - 1) & j)) == l) {
                            z = true;
                            if (i2 >= 0) {
                                C41074k kVar2 = null;
                                C41074k kVar3 = l;
                                while (true) {
                                    if (kVar3.f107605a != j || ((obj5 = kVar3.f107606b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        C41074k kVar4 = kVar3.f107608d;
                                        if (kVar4 == null) {
                                            break;
                                        }
                                        C41074k kVar5 = kVar4;
                                        kVar2 = kVar3;
                                        kVar3 = kVar5;
                                    }
                                }
                                obj4 = kVar3.f107607c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        kVar3.f107607c = obj2;
                                    } else if (kVar2 != null) {
                                        kVar2.f107608d = kVar3.f107608d;
                                    } else {
                                        kVar = kVar3.f107608d;
                                    }
                                }
                                obj4 = null;
                            } else if (l instanceof C41080q) {
                                C41080q qVar = (C41080q) l;
                                C41081r rVar = qVar.f107623e;
                                if (rVar != null && (b = rVar.mo43575b(j, obj, (Class) null)) != null) {
                                    obj4 = b.f107607c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b.f107607c = obj2;
                                        } else if (qVar.mo43574f(b)) {
                                            kVar = m71686q(qVar.f107624f);
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (l instanceof C41075l) {
                                throw new IllegalStateException("Recursive update");
                            }
                            m71679i(kVarArr, i, kVar);
                        }
                        z = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (z) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            m71674a(-1, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    public final int hashCode() {
        C41074k[] kVarArr = this.f107579a;
        int i = 0;
        if (kVarArr != null) {
            C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                C41074k c = pVar.mo43572c();
                if (c == null) {
                    break;
                }
                i += c.f107607c.hashCode() ^ c.f107606b.hashCode();
            }
        }
        return i;
    }

    public boolean isEmpty() {
        return mo43529k() <= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final long mo43529k() {
        C41066c[] cVarArr = this.f107581c;
        long j = this.baseCount;
        if (cVarArr != null) {
            for (C41066c cVar : cVarArr) {
                if (cVar != null) {
                    j += cVar.value;
                }
            }
        }
        return j;
    }

    public Set<K> keySet() {
        KeySetView keySetView = this.f107582d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, (Boolean) null);
        this.f107582d = keySetView2;
        return keySetView2;
    }

    public Enumeration<K> keys() {
        C41074k[] kVarArr = this.f107579a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new C41071h(kVarArr, length, length, this, 0);
    }

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i;
        Object obj3;
        Object obj4;
        Object obj5 = obj;
        Object obj6 = obj2;
        BiFunction biFunction2 = biFunction;
        if (obj5 == null || obj6 == null || biFunction2 == null) {
            throw null;
        }
        int j = m71680j(obj.hashCode());
        C41074k[] kVarArr = this.f107579a;
        int i2 = 0;
        Object obj7 = null;
        int i3 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & j;
                    C41074k l = m71681l(kVarArr, i4);
                    i = 1;
                    if (l != null) {
                        int i5 = l.f107605a;
                        if (i5 == -1) {
                            kVarArr = mo43525e(kVarArr, l);
                        } else {
                            synchronized (l) {
                                try {
                                    if (m71681l(kVarArr, i4) == l) {
                                        if (i5 >= 0) {
                                            C41074k kVar = null;
                                            C41074k kVar2 = l;
                                            int i6 = 1;
                                            while (true) {
                                                if (kVar2.f107605a != j || ((obj4 = kVar2.f107606b) != obj5 && (obj4 == null || !obj5.equals(obj4)))) {
                                                    C41074k kVar3 = kVar2.f107608d;
                                                    if (kVar3 == null) {
                                                        kVar2.f107608d = new C41074k(j, obj5, obj6);
                                                        obj3 = obj6;
                                                        i3 = 1;
                                                        break;
                                                    }
                                                    i6++;
                                                    C41074k kVar4 = kVar3;
                                                    kVar = kVar2;
                                                    kVar2 = kVar4;
                                                }
                                            }
                                            obj3 = biFunction2.apply(kVar2.f107607c, obj6);
                                            if (obj3 != null) {
                                                kVar2.f107607c = obj3;
                                            } else {
                                                C41074k kVar5 = kVar2.f107608d;
                                                if (kVar != null) {
                                                    kVar.f107608d = kVar5;
                                                } else {
                                                    m71679i(kVarArr, i4, kVar5);
                                                }
                                                i3 = -1;
                                            }
                                            i2 = i6;
                                            obj7 = obj3;
                                        } else if (l instanceof C41080q) {
                                            C41080q qVar = (C41080q) l;
                                            C41081r rVar = qVar.f107623e;
                                            C41081r b = rVar == null ? null : rVar.mo43575b(j, obj5, (Class) null);
                                            Object apply = b == null ? obj6 : biFunction2.apply(b.f107607c, obj6);
                                            if (apply != null) {
                                                if (b != null) {
                                                    b.f107607c = apply;
                                                } else {
                                                    qVar.mo43573e(j, obj5, apply);
                                                    i3 = 1;
                                                }
                                            } else if (b != null) {
                                                if (qVar.mo43574f(b)) {
                                                    m71679i(kVarArr, i4, m71686q(qVar.f107624f));
                                                }
                                                i3 = -1;
                                            }
                                            i2 = 2;
                                            obj7 = apply;
                                        } else if (l instanceof C41075l) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (Throwable th) {
                                    while (true) {
                                        throw th;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    m71684o(kVarArr, i4);
                                }
                                i = i3;
                                obj6 = obj7;
                            }
                        }
                    } else if (m71675b(kVarArr, i4, new C41074k(j, obj5, obj6))) {
                        break;
                    }
                }
            }
            kVarArr = m71678f();
        }
        if (i != 0) {
            m71674a((long) i, i2);
        }
        return obj6;
    }

    public V put(K k, V v) {
        return mo43527g(k, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m71685p(map.size());
        for (Map.Entry next : map.entrySet()) {
            mo43527g(next.getKey(), next.getValue(), false);
        }
    }

    public V putIfAbsent(K k, V v) {
        return mo43527g(k, v, true);
    }

    public V remove(Object obj) {
        return mo43528h(obj, (Object) null, (Object) null);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj != null) {
            return (obj2 == null || mo43528h(obj, (Object) null, obj2) == null) ? false : true;
        }
        throw null;
    }

    public final Object replace(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return mo43528h(obj, obj2, (Object) null);
        }
        throw null;
    }

    public boolean replace(K k, V v, V v2) {
        if (k != null && v != null && v2 != null) {
            return mo43528h(k, v2, v) != null;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void replaceAll(p3186j$.util.function.BiFunction r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x002e
            j$.util.concurrent.k[] r1 = r6.f107579a
            if (r1 == 0) goto L_0x002d
            j$.util.concurrent.p r2 = new j$.util.concurrent.p
            int r3 = r1.length
            r4 = 0
            int r5 = r1.length
            r2.<init>(r1, r3, r4, r5)
        L_0x000f:
            j$.util.concurrent.k r1 = r2.mo43572c()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r3 = r1.f107607c
            java.lang.Object r1 = r1.f107606b
        L_0x0019:
            java.lang.Object r4 = r7.apply(r1, r3)
            if (r4 == 0) goto L_0x002c
            java.lang.Object r3 = r6.mo43528h(r1, r4, r3)
            if (r3 != 0) goto L_0x000f
            java.lang.Object r3 = r6.get(r1)
            if (r3 != 0) goto L_0x0019
            goto L_0x000f
        L_0x002c:
            throw r0
        L_0x002d:
            return
        L_0x002e:
            goto L_0x0030
        L_0x002f:
            throw r0
        L_0x0030:
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.ConcurrentHashMap.replaceAll(j$.util.function.BiFunction):void");
    }

    public int size() {
        long k = mo43529k();
        if (k < 0) {
            return 0;
        }
        if (k > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) k;
    }

    public String toString() {
        C41074k[] kVarArr = this.f107579a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        C41079p pVar = new C41079p(kVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C41074k c = pVar.mo43572c();
        if (c != null) {
            while (true) {
                Object obj = c.f107606b;
                Object obj2 = c.f107607c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                c = pVar.mo43572c();
                if (c == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public java.util.Collection<V> values() {
        C41082s sVar = this.f107583e;
        if (sVar != null) {
            return sVar;
        }
        C41082s sVar2 = new C41082s(this);
        this.f107583e = sVar2;
        return sVar2;
    }
}

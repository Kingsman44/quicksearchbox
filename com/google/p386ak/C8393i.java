package com.google.p386ak;

import com.google.p386ak.p388b.C8327aa;
import com.google.p386ak.p388b.C8329ac;
import com.google.p386ak.p388b.C8360e;
import com.google.p386ak.p388b.C8380y;
import com.google.p386ak.p388b.p389a.C8287ap;
import com.google.p386ak.p388b.p389a.C8288aq;
import com.google.p386ak.p388b.p389a.C8298b;
import com.google.p386ak.p388b.p389a.C8302bd;
import com.google.p386ak.p388b.p389a.C8304d;
import com.google.p386ak.p388b.p389a.C8306f;
import com.google.p386ak.p388b.p389a.C8307g;
import com.google.p386ak.p388b.p389a.C8309i;
import com.google.p386ak.p388b.p389a.C8311k;
import com.google.p386ak.p388b.p389a.C8313m;
import com.google.p386ak.p388b.p389a.C8317q;
import com.google.p386ak.p388b.p392c.C8358g;
import com.google.p386ak.p393c.C8383a;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import com.google.p386ak.p394d.C8388d;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.ak.i */
/* compiled from: PG */
public final class C8393i {

    /* renamed from: a */
    static final C8382c f29245a = C8268b.IDENTITY;

    /* renamed from: b */
    public static final C8409y f29246b = C8408x.DOUBLE;

    /* renamed from: c */
    public static final C8409y f29247c = C8408x.LAZILY_PARSED_NUMBER;

    /* renamed from: d */
    final List f29248d;

    /* renamed from: e */
    private final ThreadLocal f29249e;

    /* renamed from: f */
    private final ConcurrentMap f29250f;

    /* renamed from: g */
    private final C8380y f29251g;

    /* renamed from: h */
    private final C8307g f29252h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8393i() {
        /*
            r8 = this;
            com.google.ak.b.aa r1 = com.google.p386ak.p388b.C8327aa.f29138a
            com.google.ak.c r2 = f29245a
            java.util.Map r3 = java.util.Collections.emptyMap()
            java.util.Collections.emptyList()
            java.util.Collections.emptyList()
            java.util.List r4 = java.util.Collections.emptyList()
            com.google.ak.y r5 = f29246b
            com.google.ak.y r6 = f29247c
            java.util.List r7 = java.util.Collections.emptyList()
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.C8393i.<init>():void");
    }

    /* renamed from: f */
    static void m23224f(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: a */
    public final C8266aa mo17143a(C8383a aVar) {
        boolean z;
        Objects.requireNonNull(aVar, "type must not be null");
        C8266aa aaVar = (C8266aa) this.f29250f.get(aVar);
        if (aaVar != null) {
            return aaVar;
        }
        Map map = (Map) this.f29249e.get();
        if (map == null) {
            map = new HashMap();
            this.f29249e.set(map);
            z = true;
        } else {
            z = false;
        }
        C8392h hVar = (C8392h) map.get(aVar);
        if (hVar != null) {
            return hVar;
        }
        try {
            C8392h hVar2 = new C8392h();
            map.put(aVar, hVar2);
            for (C8267ab a : this.f29248d) {
                C8266aa a2 = a.mo17031a(this, aVar);
                if (a2 != null) {
                    C8266aa aaVar2 = (C8266aa) this.f29250f.putIfAbsent(aVar, a2);
                    if (aaVar2 != null) {
                        a2 = aaVar2;
                    }
                    if (hVar2.f29244a == null) {
                        hVar2.f29244a = a2;
                        return a2;
                    }
                    throw new AssertionError();
                }
            }
            String b = C8360e.m23135b(aVar.f29214b);
            throw new IllegalArgumentException("GSON (${project.version}) cannot handle " + b);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f29249e.remove();
            }
        }
    }

    /* renamed from: b */
    public final C8266aa mo17144b(C8267ab abVar, C8383a aVar) {
        if (!this.f29248d.contains(abVar)) {
            abVar = this.f29252h;
        }
        boolean z = false;
        for (C8267ab abVar2 : this.f29248d) {
            if (z) {
                C8266aa a = abVar2.mo17031a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (abVar2 == abVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(C8360e.m23135b(aVar.f29214b)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r7.getMessage();
        r2 = new java.lang.AssertionError("AssertionError (GSON ${project.version}): " + r3);
        r2.initCause(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        throw new com.google.p386ak.C8406v((java.lang.Throwable) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        throw new com.google.p386ak.C8406v((java.lang.Throwable) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r6.f29216a = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        throw new com.google.p386ak.C8406v((java.lang.Throwable) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        r6.f29216a = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[ExcHandler: AssertionError (r7v5 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ EOFException -> 0x001a, IllegalStateException -> 0x0040, IOException -> 0x0039, AssertionError -> 0x001f, all -> 0x001d }, ExcHandler: IOException (r7v4 'e' java.io.IOException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[Catch:{ EOFException -> 0x001a, IllegalStateException -> 0x0040, IOException -> 0x0039, AssertionError -> 0x001f, all -> 0x001d }, ExcHandler: IllegalStateException (r7v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC, Splitter:B:24:0x004e] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17145c(com.google.p386ak.p394d.C8385a r6, java.lang.reflect.Type r7) {
        /*
            r5 = this;
            java.lang.String r0 = "AssertionError (GSON ${project.version}): "
            boolean r1 = r6.f29216a
            r2 = 1
            r6.f29216a = r2
            r6.mo17127r()     // Catch:{ EOFException -> 0x0047, IllegalStateException -> 0x0040, IOException -> 0x0039, AssertionError -> 0x001f }
            com.google.ak.c.a r2 = new com.google.ak.c.a     // Catch:{ EOFException -> 0x001a, IllegalStateException -> 0x0040, IOException -> 0x0039, AssertionError -> 0x001f }
            r2.<init>(r7)     // Catch:{ EOFException -> 0x001a, IllegalStateException -> 0x0040, IOException -> 0x0039, AssertionError -> 0x001f }
            com.google.ak.aa r7 = r5.mo17143a(r2)     // Catch:{ EOFException -> 0x001a, IllegalStateException -> 0x0040, IOException -> 0x0039, AssertionError -> 0x001f }
            java.lang.Object r7 = r7.mo17029a(r6)     // Catch:{ EOFException -> 0x001a, IllegalStateException -> 0x0040, IOException -> 0x0039, AssertionError -> 0x001f }
            r6.f29216a = r1
            return r7
        L_0x001a:
            r7 = move-exception
            r2 = 0
            goto L_0x0048
        L_0x001d:
            r7 = move-exception
            goto L_0x0054
        L_0x001f:
            r7 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ all -> 0x001d }
            java.lang.String r3 = r7.getMessage()     // Catch:{ all -> 0x001d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x001d }
            r4.<init>(r0)     // Catch:{ all -> 0x001d }
            r4.append(r3)     // Catch:{ all -> 0x001d }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x001d }
            r2.<init>(r0)     // Catch:{ all -> 0x001d }
            r2.initCause(r7)     // Catch:{ all -> 0x001d }
            throw r2     // Catch:{ all -> 0x001d }
        L_0x0039:
            r7 = move-exception
            com.google.ak.v r0 = new com.google.ak.v     // Catch:{ all -> 0x001d }
            r0.<init>((java.lang.Throwable) r7)     // Catch:{ all -> 0x001d }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x0040:
            r7 = move-exception
            com.google.ak.v r0 = new com.google.ak.v     // Catch:{ all -> 0x001d }
            r0.<init>((java.lang.Throwable) r7)     // Catch:{ all -> 0x001d }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x0047:
            r7 = move-exception
        L_0x0048:
            if (r2 == 0) goto L_0x004e
            r6.f29216a = r1
            r6 = 0
            return r6
        L_0x004e:
            com.google.ak.v r0 = new com.google.ak.v     // Catch:{ all -> 0x001d }
            r0.<init>((java.lang.Throwable) r7)     // Catch:{ all -> 0x001d }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x0054:
            r6.f29216a = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.C8393i.mo17145c(com.google.ak.d.a, java.lang.reflect.Type):java.lang.Object");
    }

    /* renamed from: d */
    public final Object mo17146d(String str, Class cls) {
        Object e = mo17147e(str, cls);
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(e);
    }

    /* renamed from: e */
    public final Object mo17147e(String str, Type type) {
        if (str == null) {
            return null;
        }
        C8385a aVar = new C8385a(new StringReader(str));
        aVar.f29216a = false;
        Object c = mo17145c(aVar, type);
        if (c != null) {
            try {
                if (aVar.mo17127r() != 10) {
                    throw new C8406v("JSON document was not fully consumed.");
                }
            } catch (C8388d e) {
                throw new C8406v((Throwable) e);
            } catch (IOException e2) {
                throw new C8399o((Throwable) e2);
            }
        }
        return c;
    }

    /* renamed from: g */
    public final void mo17148g(Object obj, Type type, C8387c cVar) {
        C8266aa a = mo17143a(new C8383a(type));
        boolean z = cVar.f29235b;
        cVar.f29235b = true;
        boolean z2 = cVar.f29236c;
        cVar.f29236c = true;
        boolean z3 = cVar.f29237d;
        cVar.f29237d = false;
        try {
            a.mo17030b(cVar, obj);
            cVar.f29235b = z;
            cVar.f29236c = z2;
            cVar.f29237d = z3;
        } catch (IOException e) {
            throw new C8399o((Throwable) e);
        } catch (AssertionError e2) {
            String message = e2.getMessage();
            AssertionError assertionError = new AssertionError("AssertionError (GSON ${project.version}): " + message);
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f29235b = z;
            cVar.f29236c = z2;
            cVar.f29237d = z3;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f29248d + ",instanceCreators:" + this.f29251g + "}";
    }

    public C8393i(C8327aa aaVar, C8382c cVar, Map map, List list, C8409y yVar, C8409y yVar2, List list2) {
        this.f29249e = new ThreadLocal();
        this.f29250f = new ConcurrentHashMap();
        C8380y yVar3 = new C8380y(map, list2);
        this.f29251g = yVar3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8302bd.f29063U);
        arrayList.add(C8313m.m23061c(yVar));
        arrayList.add(aaVar);
        arrayList.addAll(list);
        arrayList.add(C8302bd.f29043A);
        arrayList.add(C8302bd.f29077m);
        arrayList.add(C8302bd.f29071g);
        arrayList.add(C8302bd.f29073i);
        arrayList.add(C8302bd.f29075k);
        C8266aa aaVar2 = C8302bd.f29084t;
        arrayList.add(new C8288aq(Long.TYPE, Long.class, aaVar2));
        arrayList.add(new C8288aq(Double.TYPE, Double.class, new C8384d()));
        arrayList.add(new C8288aq(Float.TYPE, Float.class, new C8389e()));
        arrayList.add(C8311k.m23056c(yVar2));
        arrayList.add(C8302bd.f29079o);
        arrayList.add(C8302bd.f29081q);
        arrayList.add(new C8287ap(AtomicLong.class, new C8410z(new C8390f(aaVar2))));
        arrayList.add(new C8287ap(AtomicLongArray.class, new C8410z(new C8391g(aaVar2))));
        arrayList.add(C8302bd.f29083s);
        arrayList.add(C8302bd.f29086v);
        arrayList.add(C8302bd.f29045C);
        arrayList.add(C8302bd.f29047E);
        arrayList.add(new C8287ap(BigDecimal.class, C8302bd.f29088x));
        arrayList.add(new C8287ap(BigInteger.class, C8302bd.f29089y));
        arrayList.add(new C8287ap(C8329ac.class, C8302bd.f29090z));
        arrayList.add(C8302bd.f29049G);
        arrayList.add(C8302bd.f29051I);
        arrayList.add(C8302bd.f29055M);
        arrayList.add(C8302bd.f29057O);
        arrayList.add(C8302bd.f29061S);
        arrayList.add(C8302bd.f29053K);
        arrayList.add(C8302bd.f29068d);
        arrayList.add(C8306f.f29094a);
        arrayList.add(C8302bd.f29059Q);
        if (C8358g.f29187a) {
            arrayList.add(C8358g.f29189c);
            arrayList.add(C8358g.f29188b);
            arrayList.add(C8358g.f29190d);
        }
        arrayList.add(C8298b.f29036a);
        arrayList.add(C8302bd.f29066b);
        arrayList.add(new C8304d(yVar3));
        arrayList.add(new C8309i(yVar3));
        C8307g gVar = new C8307g(yVar3);
        this.f29252h = gVar;
        arrayList.add(gVar);
        arrayList.add(C8302bd.f29064V);
        arrayList.add(new C8317q(yVar3, cVar, aaVar, list2));
        this.f29248d = Collections.unmodifiableList(arrayList);
    }
}

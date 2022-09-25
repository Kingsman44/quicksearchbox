package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.age */
/* compiled from: PG */
public final class age {

    /* renamed from: a */
    final List f20611a;

    /* renamed from: b */
    final boolean f20612b;

    /* renamed from: c */
    private final ThreadLocal f20613c;

    /* renamed from: d */
    private final Map f20614d;

    /* renamed from: e */
    private final ahp f20615e;

    /* renamed from: f */
    private final aiq f20616f;

    static {
        akz.m18868d(Object.class);
    }

    public age() {
        ahr ahr = ahr.f20662a;
        throw null;
    }

    /* renamed from: a */
    static void m18664a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: j */
    public static final ald m18665j(Writer writer) {
        ald ald = new ald(writer);
        ald.mo14901q(false);
        return ald;
    }

    /* renamed from: b */
    public final agt mo14704b(akz akz) {
        boolean z;
        agt agt = (agt) this.f20614d.get(akz);
        if (agt != null) {
            return agt;
        }
        Map map = (Map) this.f20613c.get();
        if (map == null) {
            map = new HashMap();
            this.f20613c.set(map);
            z = true;
        } else {
            z = false;
        }
        agd agd = (agd) map.get(akz);
        if (agd != null) {
            return agd;
        }
        try {
            agd agd2 = new agd();
            map.put(akz, agd2);
            for (agu a : this.f20611a) {
                agt a2 = a.mo14748a(this, akz);
                if (a2 != null) {
                    agd2.mo14703a(a2);
                    this.f20614d.put(akz, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + akz);
        } finally {
            map.remove(akz);
            if (z) {
                this.f20613c.remove();
            }
        }
    }

    /* renamed from: c */
    public final agt mo14705c(agu agu, akz akz) {
        if (!this.f20611a.contains(agu)) {
            agu = this.f20616f;
        }
        boolean z = false;
        for (agu agu2 : this.f20611a) {
            if (z) {
                agt a = agu2.mo14748a(this, akz);
                if (a != null) {
                    return a;
                }
            } else if (agu2 == agu) {
                z = true;
            }
        }
        new StringBuilder("GSON cannot serialize ").append(akz);
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(akz)));
    }

    /* renamed from: d */
    public final agt mo14706d(Class cls) {
        return mo14704b(akz.m18868d(cls));
    }

    /* renamed from: e */
    public final String mo14707e(Object obj) {
        if (obj == null) {
            agl agl = agl.f20627a;
            StringWriter stringWriter = new StringWriter();
            try {
                mo14709g(agl, m18665j(C6731ax.m18027c(stringWriter)));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new agk((Throwable) e);
            }
        } else {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                mo14708f(obj, cls, m18665j(C6731ax.m18027c(stringWriter2)));
                return stringWriter2.toString();
            } catch (IOException e2) {
                throw new agk((Throwable) e2);
            }
        }
    }

    /* renamed from: f */
    public final void mo14708f(Object obj, Type type, ald ald) {
        agt b = mo14704b(akz.m18867c(type));
        boolean n = ald.mo14898n();
        ald.mo14897m(true);
        boolean p = ald.mo14900p();
        ald.mo14899o(this.f20612b);
        boolean r = ald.mo14902r();
        ald.mo14901q(false);
        try {
            b.write(ald, obj);
            ald.mo14897m(n);
            ald.mo14899o(p);
            ald.mo14901q(r);
        } catch (IOException e) {
            throw new agk((Throwable) e);
        } catch (AssertionError e2) {
            throw age$$ExternalSyntheticBackport0.m18674m("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            ald.mo14897m(n);
            ald.mo14899o(p);
            ald.mo14901q(r);
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo14709g(agj agj, ald ald) {
        boolean n = ald.mo14898n();
        ald.mo14897m(true);
        boolean p = ald.mo14900p();
        ald.mo14899o(this.f20612b);
        boolean r = ald.mo14902r();
        ald.mo14901q(false);
        try {
            C6731ax.m18026b(agj, ald);
            ald.mo14897m(n);
            ald.mo14899o(p);
            ald.mo14901q(r);
        } catch (IOException e) {
            throw new agk((Throwable) e);
        } catch (AssertionError e2) {
            throw age$$ExternalSyntheticBackport0.m18674m("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            ald.mo14897m(n);
            ald.mo14899o(p);
            ald.mo14901q(r);
            throw th;
        }
    }

    /* renamed from: h */
    public final Object mo14710h(Reader reader, Type type) {
        alb alb = new alb(reader);
        alb.mo14893q(false);
        Object i = mo14711i(alb, type);
        if (i != null) {
            try {
                if (alb.mo14838p() != 10) {
                    throw new agk("JSON document was not fully consumed.");
                }
            } catch (ale e) {
                throw new agq((Throwable) e);
            } catch (IOException e2) {
                throw new agk((Throwable) e2);
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        throw com.google.ads.interactivemedia.p367v3.internal.age$$ExternalSyntheticBackport0.m18674m("AssertionError (GSON 2.8.5): " + r5.getMessage(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.agq((java.lang.Throwable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.agq((java.lang.Throwable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r4.mo14893q(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.agq((java.lang.Throwable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        r4.mo14893q(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[ExcHandler: AssertionError (r5v5 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:1:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[Catch:{ EOFException -> 0x001d, IllegalStateException -> 0x003f, IOException -> 0x0038, AssertionError -> 0x0022, all -> 0x0020 }, ExcHandler: IOException (r5v4 'e' java.io.IOException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f A[Catch:{ EOFException -> 0x001d, IllegalStateException -> 0x003f, IOException -> 0x0038, AssertionError -> 0x0022, all -> 0x0020 }, ExcHandler: IllegalStateException (r5v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC, Splitter:B:24:0x004e] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14711i(com.google.ads.interactivemedia.p367v3.internal.alb r4, java.lang.reflect.Type r5) {
        /*
            r3 = this;
            java.lang.String r0 = "AssertionError (GSON 2.8.5): "
            boolean r1 = r4.mo14894r()
            r2 = 1
            r4.mo14893q(r2)
            r4.mo14838p()     // Catch:{ EOFException -> 0x0046, IllegalStateException -> 0x003f, IOException -> 0x0038, AssertionError -> 0x0022 }
            com.google.ads.interactivemedia.v3.internal.akz r5 = com.google.ads.interactivemedia.p367v3.internal.akz.m18867c(r5)     // Catch:{ EOFException -> 0x001d, IllegalStateException -> 0x003f, IOException -> 0x0038, AssertionError -> 0x0022 }
            com.google.ads.interactivemedia.v3.internal.agt r5 = r3.mo14704b(r5)     // Catch:{ EOFException -> 0x001d, IllegalStateException -> 0x003f, IOException -> 0x0038, AssertionError -> 0x0022 }
            java.lang.Object r5 = r5.read(r4)     // Catch:{ EOFException -> 0x001d, IllegalStateException -> 0x003f, IOException -> 0x0038, AssertionError -> 0x0022 }
            r4.mo14893q(r1)
            return r5
        L_0x001d:
            r5 = move-exception
            r2 = 0
            goto L_0x0047
        L_0x0020:
            r5 = move-exception
            goto L_0x0054
        L_0x0022:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0020 }
            r2.<init>(r0)     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x0020 }
            r2.append(r0)     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0020 }
            java.lang.AssertionError r5 = com.google.ads.interactivemedia.p367v3.internal.age$$ExternalSyntheticBackport0.m18674m(r0, r5)     // Catch:{ all -> 0x0020 }
            throw r5     // Catch:{ all -> 0x0020 }
        L_0x0038:
            r5 = move-exception
            com.google.ads.interactivemedia.v3.internal.agq r0 = new com.google.ads.interactivemedia.v3.internal.agq     // Catch:{ all -> 0x0020 }
            r0.<init>((java.lang.Throwable) r5)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x003f:
            r5 = move-exception
            com.google.ads.interactivemedia.v3.internal.agq r0 = new com.google.ads.interactivemedia.v3.internal.agq     // Catch:{ all -> 0x0020 }
            r0.<init>((java.lang.Throwable) r5)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0046:
            r5 = move-exception
        L_0x0047:
            if (r2 == 0) goto L_0x004e
            r4.mo14893q(r1)
            r4 = 0
            return r4
        L_0x004e:
            com.google.ads.interactivemedia.v3.internal.agq r0 = new com.google.ads.interactivemedia.v3.internal.agq     // Catch:{ all -> 0x0020 }
            r0.<init>((java.lang.Throwable) r5)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0054:
            r4.mo14893q(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.age.mo14711i(com.google.ads.interactivemedia.v3.internal.alb, java.lang.reflect.Type):java.lang.Object");
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f20611a + ",instanceCreators:" + this.f20615e + "}";
    }

    public age(ahr ahr, afx afx, Map map, boolean z, int i, List list) {
        agt agt;
        this.f20613c = new ThreadLocal();
        this.f20614d = new ConcurrentHashMap();
        ahp ahp = new ahp(map);
        this.f20615e = ahp;
        this.f20612b = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(aku.f20812W);
        arrayList.add(aiy.f20727a);
        arrayList.add(ahr);
        arrayList.addAll(list);
        arrayList.add(aku.f20791B);
        arrayList.add(aku.f20826m);
        arrayList.add(aku.f20820g);
        arrayList.add(aku.f20822i);
        arrayList.add(aku.f20824k);
        if (i == agr.f20631a) {
            agt = aku.f20833t;
        } else {
            agt = new C6788aga();
        }
        arrayList.add(aku.m18857c(Long.TYPE, Long.class, agt));
        arrayList.add(aku.m18857c(Double.TYPE, Double.class, new afy()));
        arrayList.add(aku.m18857c(Float.TYPE, Float.class, new afz()));
        arrayList.add(aku.f20835v);
        arrayList.add(aku.f20828o);
        arrayList.add(aku.f20830q);
        arrayList.add(aku.m18856b(AtomicLong.class, new agb(agt).nullSafe()));
        arrayList.add(aku.m18856b(AtomicLongArray.class, new agc(agt).nullSafe()));
        arrayList.add(aku.f20832s);
        arrayList.add(aku.f20837x);
        arrayList.add(aku.f20793D);
        arrayList.add(aku.f20795F);
        arrayList.add(aku.m18856b(BigDecimal.class, aku.f20839z));
        arrayList.add(aku.m18856b(BigInteger.class, aku.f20790A));
        arrayList.add(aku.f20797H);
        arrayList.add(aku.f20799J);
        arrayList.add(aku.f20803N);
        arrayList.add(aku.f20805P);
        arrayList.add(aku.f20810U);
        arrayList.add(aku.f20801L);
        arrayList.add(aku.f20817d);
        arrayList.add(aip.f20707a);
        arrayList.add(aku.f20808S);
        arrayList.add(ajf.f20755a);
        arrayList.add(ajd.f20753a);
        arrayList.add(aku.f20806Q);
        arrayList.add(ail.f20701a);
        arrayList.add(aku.f20815b);
        arrayList.add(new ain(ahp));
        arrayList.add(new aiw(ahp));
        aiq aiq = new aiq(ahp);
        this.f20616f = aiq;
        arrayList.add(aiq);
        arrayList.add(aku.f20813X);
        arrayList.add(new ajb(ahp, afx, ahr, aiq));
        this.f20611a = Collections.unmodifiableList(arrayList);
    }
}

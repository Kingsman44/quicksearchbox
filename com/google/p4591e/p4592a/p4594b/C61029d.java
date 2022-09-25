package com.google.p4591e.p4592a.p4594b;

import com.google.common.base.C58838bb;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.e.a.b.d */
/* compiled from: PG */
public abstract class C61029d {

    /* renamed from: a */
    private static final WeakHashMap f165245a = new WeakHashMap();

    /* renamed from: b */
    private static final Lock f165246b = new ReentrantLock();

    /* renamed from: q */
    private final C61033h m93350q() {
        C61033h g = mo57564g();
        if (g == null) {
            g = mo57565h();
        }
        C58838bb.m90869d(g != null, "no JSON input found");
        return g;
    }

    /* renamed from: r */
    private final C61033h m93351r() {
        C61033h q = m93350q();
        C61033h hVar = C61033h.START_ARRAY;
        int ordinal = q.ordinal();
        if (ordinal == 0) {
            return mo57565h();
        }
        if (ordinal == 2) {
            q = mo57565h();
            boolean z = true;
            if (!(q == C61033h.FIELD_NAME || q == C61033h.END_OBJECT)) {
                z = false;
            }
            C58838bb.m90869d(z, q);
        }
        return q;
    }

    /* renamed from: s */
    private final void m93352s(Field field, Map map, Type type, ArrayList arrayList) {
        C61033h r = m93351r();
        while (r == C61033h.FIELD_NAME) {
            String j = mo57567j();
            mo57565h();
            map.put(j, m93353t(field, type, arrayList, true));
            r = mo57565h();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03f8 A[Catch:{ all -> 0x0276, IllegalArgumentException -> 0x0474 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03fe A[ADDED_TO_REGION, Catch:{ all -> 0x0276, IllegalArgumentException -> 0x0474 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x041e A[Catch:{ all -> 0x0276, IllegalArgumentException -> 0x0474 }, LOOP:4: B:252:0x041a->B:254:0x041e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x042c A[Catch:{ all -> 0x0276, IllegalArgumentException -> 0x0474 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0463 A[Catch:{ all -> 0x0276, IllegalArgumentException -> 0x0474 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b0 A[Catch:{ all -> 0x0276, IllegalArgumentException -> 0x0474 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3 A[Catch:{ all -> 0x0276, IllegalArgumentException -> 0x0474 }] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m93353t(java.lang.reflect.Field r18, java.lang.reflect.Type r19, java.util.ArrayList r20, boolean r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r20
            java.lang.String r3 = "expected numeric type but got "
            java.lang.String r4 = "unexpected JSON node type: "
            r5 = r19
            java.lang.reflect.Type r5 = com.google.p4591e.p4592a.p4603d.C61054h.m93410d(r0, r5)
            boolean r6 = r5 instanceof java.lang.Class
            r7 = 0
            if (r6 == 0) goto L_0x0019
            r6 = r5
            java.lang.Class r6 = (java.lang.Class) r6
            goto L_0x001a
        L_0x0019:
            r6 = r7
        L_0x001a:
            boolean r8 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r8 == 0) goto L_0x0025
            r6 = r5
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.Class r6 = com.google.p4591e.p4592a.p4603d.C61046aa.m93385b(r6)
        L_0x0025:
            java.lang.Class<java.lang.Void> r8 = java.lang.Void.class
            if (r6 != r8) goto L_0x002d
            r17.mo57572p()
            return r7
        L_0x002d:
            com.google.e.a.b.h r8 = r17.mo57564g()
            com.google.e.a.b.h r9 = com.google.p4591e.p4592a.p4594b.C61033h.START_ARRAY     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.b.h r9 = r17.mo57564g()     // Catch:{ IllegalArgumentException -> 0x0474 }
            int r9 = r9.ordinal()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r10 = 0
            r11 = 1
            switch(r9) {
                case 0: goto L_0x03d1;
                case 1: goto L_0x03d1;
                case 2: goto L_0x01b8;
                case 3: goto L_0x01b8;
                case 4: goto L_0x01b8;
                case 5: goto L_0x015f;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00b6;
                case 8: goto L_0x008f;
                case 9: goto L_0x008f;
                case 10: goto L_0x0044;
                default: goto L_0x0040;
            }     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x0040:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x0464
        L_0x0044:
            if (r6 == 0) goto L_0x004c
            boolean r3 = r6.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 != 0) goto L_0x004d
        L_0x004c:
            r10 = 1
        L_0x004d:
            java.lang.String r3 = "primitive number field but found a JSON null"
            com.google.common.base.C58838bb.m90869d(r10, r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 == 0) goto L_0x0086
            int r3 = r6.getModifiers()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r3 = r3 & 1536(0x600, float:2.152E-42)
            if (r3 == 0) goto L_0x0086
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = com.google.p4591e.p4592a.p4603d.C61046aa.m93395l(r6, r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x0071
            java.util.Collection r0 = com.google.p4591e.p4592a.p4603d.C61054h.m93411e(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object r0 = com.google.p4591e.p4592a.p4603d.C61054h.m93408b(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x0071:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = com.google.p4591e.p4592a.p4603d.C61046aa.m93395l(r6, r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x0086
            java.util.Map r0 = com.google.p4591e.p4592a.p4603d.C61054h.m93413g(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object r0 = com.google.p4591e.p4592a.p4603d.C61054h.m93408b(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x0086:
            java.lang.Class r0 = com.google.p4591e.p4592a.p4603d.C61046aa.m93384a(r0, r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object r0 = com.google.p4591e.p4592a.p4603d.C61054h.m93408b(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x008f:
            if (r5 == 0) goto L_0x00a2
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 == r0) goto L_0x00a2
            if (r6 == 0) goto L_0x00a0
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r6.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r0 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r0 = 0
            goto L_0x00a3
        L_0x00a2:
            r0 = 1
        L_0x00a3:
            java.lang.String r3 = "expected type Boolean or boolean but got %s"
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ IllegalArgumentException -> 0x0474 }
            r4[r10] = r5     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.common.base.C58838bb.m90874i(r0, r3, r4)     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.b.h r0 = com.google.p4591e.p4592a.p4594b.C61033h.VALUE_TRUE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r8 != r0) goto L_0x00b3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x00b5
        L_0x00b3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x00b5:
            return r0
        L_0x00b6:
            if (r2 == 0) goto L_0x00c0
            java.lang.Class<com.google.e.a.b.g> r0 = com.google.p4591e.p4592a.p4594b.C61032g.class
            java.lang.annotation.Annotation r0 = r2.getAnnotation(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r0 != 0) goto L_0x00c1
        L_0x00c0:
            r10 = 1
        L_0x00c1:
            java.lang.String r0 = "number type formatted as a JSON number cannot use @JsonString annotation"
            com.google.common.base.C58838bb.m90869d(r10, r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 == 0) goto L_0x015a
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            boolean r0 = r6.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r0 == 0) goto L_0x00d2
            goto L_0x015a
        L_0x00d2:
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            if (r6 != r0) goto L_0x00db
            java.math.BigInteger r0 = r17.mo57569l()     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x00db:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r6 == r0) goto L_0x0151
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 != r0) goto L_0x00e5
            goto L_0x0151
        L_0x00e5:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r6 == r0) goto L_0x0148
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 != r0) goto L_0x00ee
            goto L_0x0148
        L_0x00ee:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r6 == r0) goto L_0x013f
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 != r0) goto L_0x00f7
            goto L_0x013f
        L_0x00f7:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r6 == r0) goto L_0x0136
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 != r0) goto L_0x0100
            goto L_0x0136
        L_0x0100:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r6 == r0) goto L_0x012d
            java.lang.Class r0 = java.lang.Short.TYPE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 != r0) goto L_0x0109
            goto L_0x012d
        L_0x0109:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r6 == r0) goto L_0x0124
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 != r0) goto L_0x0112
            goto L_0x0124
        L_0x0112:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0474 }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r4.append(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r3 = r4.toString()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r0.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x0124:
            byte r0 = r17.mo57558a()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x012d:
            short r0 = r17.mo57570m()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x0136:
            int r0 = r17.mo57561d()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x013f:
            float r0 = r17.mo57560c()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x0148:
            long r3 = r17.mo57562e()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x0151:
            double r3 = r17.mo57559b()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Double r0 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x015a:
            java.math.BigDecimal r0 = r17.mo57568k()     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x015f:
            java.lang.String r0 = r17.mo57567j()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r0 = r0.trim()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r0 = r0.toLowerCase(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 == r3) goto L_0x017d
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            if (r6 == r3) goto L_0x017d
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 == r3) goto L_0x017d
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r6 != r3) goto L_0x0195
        L_0x017d:
            java.lang.String r3 = "nan"
            boolean r3 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 != 0) goto L_0x01af
            java.lang.String r3 = "infinity"
            boolean r3 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 != 0) goto L_0x01af
            java.lang.String r3 = "-infinity"
            boolean r0 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r0 != 0) goto L_0x01af
        L_0x0195:
            if (r6 == 0) goto L_0x01a9
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            boolean r0 = r0.isAssignableFrom(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r0 == 0) goto L_0x01a9
            if (r2 == 0) goto L_0x01aa
            java.lang.Class<com.google.e.a.b.g> r0 = com.google.p4591e.p4592a.p4594b.C61032g.class
            java.lang.annotation.Annotation r0 = r2.getAnnotation(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r0 == 0) goto L_0x01aa
        L_0x01a9:
            r10 = 1
        L_0x01aa:
            java.lang.String r0 = "number field formatted as a JSON string must use the @JsonString annotation"
            com.google.common.base.C58838bb.m90869d(r10, r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x01af:
            java.lang.String r0 = r17.mo57567j()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object r0 = com.google.p4591e.p4592a.p4603d.C61054h.m93409c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x01b8:
            boolean r3 = com.google.p4591e.p4592a.p4603d.C61046aa.m93394k(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r3 = r3 ^ r11
            java.lang.String r4 = "expected object or map type but got %s"
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ IllegalArgumentException -> 0x0474 }
            r8[r10] = r5     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.common.base.C58838bb.m90874i(r3, r4, r8)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r21 == 0) goto L_0x027d
            if (r6 != 0) goto L_0x01cd
            r4 = r7
            goto L_0x027e
        L_0x01cd:
            java.util.concurrent.locks.Lock r3 = f165246b     // Catch:{ IllegalArgumentException -> 0x0474 }
            r3.lock()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.util.WeakHashMap r4 = f165245a     // Catch:{ all -> 0x0276 }
            boolean r8 = r4.containsKey(r6)     // Catch:{ all -> 0x0276 }
            if (r8 == 0) goto L_0x01e5
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x0276 }
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch:{ all -> 0x0276 }
        L_0x01e0:
            r3.unlock()     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x027e
        L_0x01e5:
            com.google.e.a.d.g r3 = com.google.p4591e.p4592a.p4603d.C61053g.m93405a(r6, r10)     // Catch:{ all -> 0x0276 }
            java.util.IdentityHashMap r3 = r3.f165295c     // Catch:{ all -> 0x0276 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0276 }
            java.util.Collection r3 = java.util.Collections.unmodifiableCollection(r3)     // Catch:{ all -> 0x0276 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0276 }
            r4 = r7
        L_0x01f8:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x0276 }
            if (r8 == 0) goto L_0x026d
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0276 }
            com.google.e.a.d.n r8 = (com.google.p4591e.p4592a.p4603d.C61060n) r8     // Catch:{ all -> 0x0276 }
            java.lang.reflect.Field r8 = r8.f165330b     // Catch:{ all -> 0x0276 }
            java.lang.Class<com.google.e.a.b.f> r9 = com.google.p4591e.p4592a.p4594b.C61031f.class
            java.lang.annotation.Annotation r9 = r8.getAnnotation(r9)     // Catch:{ all -> 0x0276 }
            com.google.e.a.b.f r9 = (com.google.p4591e.p4592a.p4594b.C61031f) r9     // Catch:{ all -> 0x0276 }
            if (r9 == 0) goto L_0x01f8
            if (r4 != 0) goto L_0x0214
            r4 = 1
            goto L_0x0215
        L_0x0214:
            r4 = 0
        L_0x0215:
            java.lang.String r12 = "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s"
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x0276 }
            r13[r10] = r6     // Catch:{ all -> 0x0276 }
            com.google.common.base.C58838bb.m90874i(r4, r12, r13)     // Catch:{ all -> 0x0276 }
            java.lang.Class r4 = r8.getType()     // Catch:{ all -> 0x0276 }
            boolean r4 = com.google.p4591e.p4592a.p4603d.C61054h.m93416j(r4)     // Catch:{ all -> 0x0276 }
            java.lang.String r12 = "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s"
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0276 }
            r13[r10] = r6     // Catch:{ all -> 0x0276 }
            java.lang.Class r14 = r8.getType()     // Catch:{ all -> 0x0276 }
            r13[r11] = r14     // Catch:{ all -> 0x0276 }
            com.google.common.base.C58838bb.m90874i(r4, r12, r13)     // Catch:{ all -> 0x0276 }
            com.google.e.a.b.e[] r4 = r9.mo57582a()     // Catch:{ all -> 0x0276 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0276 }
            r9.<init>()     // Catch:{ all -> 0x0276 }
            int r12 = r4.length     // Catch:{ all -> 0x0276 }
            if (r12 <= 0) goto L_0x0244
            r13 = 1
            goto L_0x0245
        L_0x0244:
            r13 = 0
        L_0x0245:
            java.lang.String r14 = "@JsonPolymorphicTypeMap must have at least one @TypeDef"
            com.google.common.base.C58838bb.m90869d(r13, r14)     // Catch:{ all -> 0x0276 }
            r13 = 0
        L_0x024b:
            if (r13 >= r12) goto L_0x026b
            r14 = r4[r13]     // Catch:{ all -> 0x0276 }
            java.lang.String r15 = r14.mo57581b()     // Catch:{ all -> 0x0276 }
            boolean r15 = r9.add(r15)     // Catch:{ all -> 0x0276 }
            java.lang.String r7 = "Class contains two @TypeDef annotations with identical key: %s"
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ all -> 0x0276 }
            java.lang.String r14 = r14.mo57581b()     // Catch:{ all -> 0x0276 }
            r16 = 0
            r10[r16] = r14     // Catch:{ all -> 0x0276 }
            com.google.common.base.C58838bb.m90874i(r15, r7, r10)     // Catch:{ all -> 0x0276 }
            int r13 = r13 + 1
            r7 = 0
            r10 = 0
            goto L_0x024b
        L_0x026b:
            r4 = r8
            goto L_0x01f8
        L_0x026d:
            java.util.WeakHashMap r3 = f165245a     // Catch:{ all -> 0x0276 }
            r3.put(r6, r4)     // Catch:{ all -> 0x0276 }
            java.util.concurrent.locks.Lock r3 = f165246b     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x01e0
        L_0x0276:
            r0 = move-exception
            java.util.concurrent.locks.Lock r3 = f165246b     // Catch:{ IllegalArgumentException -> 0x0474 }
            r3.unlock()     // Catch:{ IllegalArgumentException -> 0x0474 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x027d:
            r4 = 0
        L_0x027e:
            if (r6 == 0) goto L_0x028a
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = com.google.p4591e.p4592a.p4603d.C61046aa.m93395l(r6, r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x028a
            r3 = 1
            goto L_0x028b
        L_0x028a:
            r3 = 0
        L_0x028b:
            if (r4 == 0) goto L_0x0293
            com.google.e.a.b.a r7 = new com.google.e.a.b.a     // Catch:{ IllegalArgumentException -> 0x0474 }
            r7.<init>()     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x02a1
        L_0x0293:
            if (r3 != 0) goto L_0x029d
            if (r6 != 0) goto L_0x0298
            goto L_0x029d
        L_0x0298:
            java.lang.Object r7 = com.google.p4591e.p4592a.p4603d.C61046aa.m93387d(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x02a1
        L_0x029d:
            java.util.Map r7 = com.google.p4591e.p4592a.p4603d.C61054h.m93413g(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x02a1:
            int r8 = r20.size()     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r5 == 0) goto L_0x02aa
            r0.add(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x02aa:
            if (r3 == 0) goto L_0x02cb
            java.lang.Class<com.google.e.a.d.r> r3 = com.google.p4591e.p4592a.p4603d.C61064r.class
            boolean r3 = r3.isAssignableFrom(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 != 0) goto L_0x02cb
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x02c1
            java.lang.reflect.Type r3 = com.google.p4591e.p4592a.p4603d.C61046aa.m93392i(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x02c2
        L_0x02c1:
            r3 = 0
        L_0x02c2:
            if (r3 == 0) goto L_0x02cb
            r4 = r7
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ IllegalArgumentException -> 0x0474 }
            r1.m93352s(r2, r4, r3, r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r7
        L_0x02cb:
            boolean r3 = r7 instanceof com.google.p4591e.p4592a.p4594b.C61016a     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x02d8
            r3 = r7
            com.google.e.a.b.a r3 = (com.google.p4591e.p4592a.p4594b.C61016a) r3     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.b.b r6 = r17.mo57563f()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r3.f165233a = r6     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x02d8:
            com.google.e.a.b.h r3 = r17.m93351r()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Class r6 = r7.getClass()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r9 = 0
            com.google.e.a.d.g r10 = com.google.p4591e.p4592a.p4603d.C61053g.m93405a(r6, r9)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Class<com.google.e.a.d.r> r9 = com.google.p4591e.p4592a.p4603d.C61064r.class
            boolean r9 = r9.isAssignableFrom(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r9 != 0) goto L_0x0301
            java.lang.Class<java.util.Map> r12 = java.util.Map.class
            boolean r12 = r12.isAssignableFrom(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r12 == 0) goto L_0x0301
            r3 = r7
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.reflect.Type r6 = com.google.p4591e.p4592a.p4603d.C61046aa.m93392i(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r9 = 0
            r1.m93352s(r9, r3, r6, r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x035d
        L_0x0301:
            com.google.e.a.b.h r6 = com.google.p4591e.p4592a.p4594b.C61033h.FIELD_NAME     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 != r6) goto L_0x035d
            java.lang.String r3 = r17.mo57567j()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r17.mo57565h()     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.d.n r6 = r10.mo57610b(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 == 0) goto L_0x0346
            boolean r3 = r6.mo57632f()     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x0325
            boolean r3 = r6.f165329a     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x031d
            goto L_0x0325
        L_0x031d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r3 = "final array/object fields are not supported"
            r0.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x0325:
            java.lang.reflect.Field r3 = r6.f165330b     // Catch:{ IllegalArgumentException -> 0x0474 }
            int r12 = r20.size()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.reflect.Type r13 = r3.getGenericType()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r0.add(r13)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.reflect.Field r13 = r6.f165330b     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.reflect.Type r13 = r13.getGenericType()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object r3 = r1.m93353t(r3, r13, r0, r11)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r0.remove(r12)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.reflect.Field r6 = r6.f165330b     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.p4591e.p4592a.p4603d.C61060n.m93426e(r6, r7, r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r12 = 0
            goto L_0x0358
        L_0x0346:
            if (r9 == 0) goto L_0x0354
            r6 = r7
            com.google.e.a.d.r r6 = (com.google.p4591e.p4592a.p4603d.C61064r) r6     // Catch:{ IllegalArgumentException -> 0x0474 }
            r12 = 0
            java.lang.Object r13 = r1.m93353t(r12, r12, r0, r11)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r6.mo57535c(r3, r13)     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x0358
        L_0x0354:
            r12 = 0
            r17.mo57572p()     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x0358:
            com.google.e.a.b.h r3 = r17.mo57565h()     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x0301
        L_0x035d:
            r12 = 0
            if (r5 == 0) goto L_0x0363
            r0.remove(r8)     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x0363:
            if (r4 != 0) goto L_0x0366
            return r7
        L_0x0366:
            r3 = r7
            com.google.e.a.b.a r3 = (com.google.p4591e.p4592a.p4594b.C61016a) r3     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r5 = r4.getName()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x0375
            r5 = 1
            goto L_0x0376
        L_0x0375:
            r5 = 0
        L_0x0376:
            java.lang.String r6 = "No value specified for @JsonPolymorphicTypeMap field"
            com.google.common.base.C58838bb.m90869d(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Class<com.google.e.a.b.f> r5 = com.google.p4591e.p4592a.p4594b.C61031f.class
            java.lang.annotation.Annotation r4 = r4.getAnnotation(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.b.f r4 = (com.google.p4591e.p4592a.p4594b.C61031f) r4     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.b.e[] r4 = r4.mo57582a()     // Catch:{ IllegalArgumentException -> 0x0474 }
            int r5 = r4.length     // Catch:{ IllegalArgumentException -> 0x0474 }
            r6 = 0
        L_0x038d:
            if (r6 >= r5) goto L_0x03a4
            r8 = r4[r6]     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r9 = r8.mo57581b()     // Catch:{ IllegalArgumentException -> 0x0474 }
            boolean r9 = r9.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r9 == 0) goto L_0x03a1
            java.lang.Class r4 = r8.mo57580a()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r12 = r4
            goto L_0x03a4
        L_0x03a1:
            int r6 = r6 + 1
            goto L_0x038d
        L_0x03a4:
            if (r12 == 0) goto L_0x03a7
            goto L_0x03a8
        L_0x03a7:
            r11 = 0
        L_0x03a8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0474 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r5 = "No TypeDef annotation found with key: "
            r4.append(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r4.append(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r3 = r4.toString()     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.common.base.C58838bb.m90869d(r11, r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.b.b r3 = r17.mo57563f()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r4 = r3.mo57573d(r7)     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.b.d r3 = r3.mo57541c(r4)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r3.m93350q()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r4 = 0
            java.lang.Object r0 = r3.m93353t(r2, r12, r0, r4)     // Catch:{ IllegalArgumentException -> 0x0474 }
            return r0
        L_0x03d1:
            r12 = r7
            boolean r3 = com.google.p4591e.p4592a.p4603d.C61046aa.m93394k(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r5 == 0) goto L_0x03e7
            if (r3 != 0) goto L_0x03e7
            if (r6 == 0) goto L_0x03e5
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            boolean r4 = com.google.p4591e.p4592a.p4603d.C61046aa.m93395l(r6, r4)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r4 == 0) goto L_0x03e5
            goto L_0x03e7
        L_0x03e5:
            r4 = 0
            goto L_0x03e8
        L_0x03e7:
            r4 = 1
        L_0x03e8:
            java.lang.String r7 = "expected collection or array type but got %s"
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ IllegalArgumentException -> 0x0474 }
            r9 = 0
            r8[r9] = r5     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.common.base.C58838bb.m90874i(r4, r7, r8)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.util.Collection r4 = com.google.p4591e.p4592a.p4603d.C61054h.m93411e(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x03fe
            java.lang.reflect.Type r7 = com.google.p4591e.p4592a.p4603d.C61046aa.m93390g(r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r12 = r7
            goto L_0x0411
        L_0x03fe:
            if (r6 == 0) goto L_0x0411
            java.lang.Class<java.lang.Iterable> r7 = java.lang.Iterable.class
            boolean r6 = r7.isAssignableFrom(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 == 0) goto L_0x0411
            java.lang.Class<java.lang.Iterable> r6 = java.lang.Iterable.class
            r7 = 0
            java.lang.reflect.Type r5 = com.google.p4591e.p4592a.p4603d.C61046aa.m93389f(r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r12 = r5
            goto L_0x0412
        L_0x0411:
            r7 = 0
        L_0x0412:
            java.lang.reflect.Type r5 = com.google.p4591e.p4592a.p4603d.C61054h.m93410d(r0, r12)     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.b.h r6 = r17.m93351r()     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x041a:
            com.google.e.a.b.h r8 = com.google.p4591e.p4592a.p4594b.C61033h.END_ARRAY     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r6 == r8) goto L_0x042a
            java.lang.Object r6 = r1.m93353t(r2, r5, r0, r11)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r4.add(r6)     // Catch:{ IllegalArgumentException -> 0x0474 }
            com.google.e.a.b.h r6 = r17.mo57565h()     // Catch:{ IllegalArgumentException -> 0x0474 }
            goto L_0x041a
        L_0x042a:
            if (r3 == 0) goto L_0x0463
            java.lang.Class r0 = com.google.p4591e.p4592a.p4603d.C61046aa.m93384a(r0, r5)     // Catch:{ IllegalArgumentException -> 0x0474 }
            boolean r3 = r0.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r3 == 0) goto L_0x0454
            int r3 = r4.size()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r10 = 0
        L_0x0443:
            boolean r4 = r3.hasNext()     // Catch:{ IllegalArgumentException -> 0x0474 }
            if (r4 == 0) goto L_0x0462
            java.lang.Object r4 = r3.next()     // Catch:{ IllegalArgumentException -> 0x0474 }
            int r5 = r10 + 1
            java.lang.reflect.Array.set(r0, r10, r4)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r10 = r5
            goto L_0x0443
        L_0x0454:
            int r3 = r4.size()     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.Object[] r0 = r4.toArray(r0)     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x0462:
            return r0
        L_0x0463:
            return r4
        L_0x0464:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0474 }
            r3.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0474 }
            r3.append(r8)     // Catch:{ IllegalArgumentException -> 0x0474 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x0474 }
            r0.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0474 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0474 }
        L_0x0474:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r17.mo57566i()
            if (r4 == 0) goto L_0x0488
            java.lang.String r5 = "key "
            r3.append(r5)
            r3.append(r4)
        L_0x0488:
            if (r2 == 0) goto L_0x0499
            if (r4 == 0) goto L_0x0491
            java.lang.String r4 = ", "
            r3.append(r4)
        L_0x0491:
            java.lang.String r4 = "field "
            r3.append(r4)
            r3.append(r2)
        L_0x0499:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            goto L_0x04a4
        L_0x04a3:
            throw r2
        L_0x04a4:
            goto L_0x04a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4591e.p4592a.p4594b.C61029d.m93353t(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, boolean):java.lang.Object");
    }

    /* renamed from: a */
    public abstract byte mo57558a();

    /* renamed from: b */
    public abstract double mo57559b();

    /* renamed from: c */
    public abstract float mo57560c();

    /* renamed from: d */
    public abstract int mo57561d();

    /* renamed from: e */
    public abstract long mo57562e();

    /* renamed from: f */
    public abstract C61021b mo57563f();

    /* renamed from: g */
    public abstract C61033h mo57564g();

    /* renamed from: h */
    public abstract C61033h mo57565h();

    /* renamed from: i */
    public abstract String mo57566i();

    /* renamed from: j */
    public abstract String mo57567j();

    /* renamed from: k */
    public abstract BigDecimal mo57568k();

    /* renamed from: l */
    public abstract BigInteger mo57569l();

    /* renamed from: m */
    public abstract short mo57570m();

    /* renamed from: n */
    public abstract void mo57571n();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        mo57571n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        throw r4;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo57579o(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x000b
            r3.m93350q()     // Catch:{ all -> 0x001a }
        L_0x000b:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x001a }
            r0.<init>()     // Catch:{ all -> 0x001a }
            r1 = 0
            r2 = 1
            java.lang.Object r4 = r3.m93353t(r1, r4, r0, r2)     // Catch:{ all -> 0x001a }
            r3.mo57571n()
            return r4
        L_0x001a:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x001c }
        L_0x001c:
            r4 = move-exception
            r3.mo57571n()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4591e.p4592a.p4594b.C61029d.mo57579o(java.lang.Class):java.lang.Object");
    }

    /* renamed from: p */
    public abstract void mo57572p();
}

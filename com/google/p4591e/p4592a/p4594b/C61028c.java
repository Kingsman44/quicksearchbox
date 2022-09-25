package com.google.p4591e.p4592a.p4594b;

import com.google.common.base.C58838bb;
import com.google.p4591e.p4592a.p4603d.C61046aa;
import com.google.p4591e.p4592a.p4603d.C61053g;
import com.google.p4591e.p4592a.p4603d.C61054h;
import com.google.p4591e.p4592a.p4603d.C61059m;
import com.google.p4591e.p4592a.p4603d.C61060n;
import com.google.p4591e.p4592a.p4603d.C61064r;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/* renamed from: com.google.e.a.b.c */
/* compiled from: PG */
public abstract class C61028c {
    /* renamed from: a */
    public abstract void mo57543a();

    /* renamed from: b */
    public final void mo57578b(boolean z, Object obj) {
        C61053g gVar;
        boolean z2;
        Field field;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (C61054h.m93415i(obj)) {
                mo57548g();
            } else if (obj instanceof String) {
                mo57557p((String) obj);
            } else {
                boolean z3 = true;
                if (obj instanceof Number) {
                    if (z) {
                        mo57557p(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        mo57553l((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        mo57554m((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        mo57552k(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                            z3 = false;
                        }
                        C58838bb.m90868c(z3);
                        mo57550i(floatValue);
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        mo57551j(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                            z3 = false;
                        }
                        C58838bb.m90868c(z3);
                        mo57549h(doubleValue);
                    }
                } else if (obj instanceof Boolean) {
                    mo57544c(((Boolean) obj).booleanValue());
                } else if (obj instanceof C61059m) {
                    mo57557p(((C61059m) obj).mo57627a());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    mo57555n();
                    for (Object b : C61046aa.m93386c(obj)) {
                        mo57578b(z, b);
                    }
                    mo57545d();
                } else if (cls.isEnum()) {
                    String str = C61060n.m93423a((Enum) obj).f165331c;
                    if (str == null) {
                        mo57548g();
                    } else {
                        mo57557p(str);
                    }
                } else {
                    mo57556o();
                    boolean z4 = (obj instanceof Map) && !(obj instanceof C61064r);
                    if (z4) {
                        gVar = null;
                    } else {
                        gVar = C61053g.m93405a(cls, false);
                    }
                    for (Map.Entry entry : C61054h.m93412f(obj).entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) entry.getKey();
                            if (z4) {
                                z2 = z;
                            } else {
                                C61060n b2 = gVar.mo57610b(str2);
                                if (b2 == null) {
                                    field = null;
                                } else {
                                    field = b2.f165330b;
                                }
                                z2 = (field == null || field.getAnnotation(C61032g.class) == null) ? false : true;
                            }
                            mo57547f(str2);
                            mo57578b(z2, value);
                        }
                    }
                    mo57546e();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract void mo57544c(boolean z);

    /* renamed from: d */
    public abstract void mo57545d();

    /* renamed from: e */
    public abstract void mo57546e();

    /* renamed from: f */
    public abstract void mo57547f(String str);

    /* renamed from: g */
    public abstract void mo57548g();

    /* renamed from: h */
    public abstract void mo57549h(double d);

    /* renamed from: i */
    public abstract void mo57550i(float f);

    /* renamed from: j */
    public abstract void mo57551j(int i);

    /* renamed from: k */
    public abstract void mo57552k(long j);

    /* renamed from: l */
    public abstract void mo57553l(BigDecimal bigDecimal);

    /* renamed from: m */
    public abstract void mo57554m(BigInteger bigInteger);

    /* renamed from: n */
    public abstract void mo57555n();

    /* renamed from: o */
    public abstract void mo57556o();

    /* renamed from: p */
    public abstract void mo57557p(String str);
}

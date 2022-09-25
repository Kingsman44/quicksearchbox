package p5462h.p5466c.p5468b.p5469a;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.b.a.a */
/* compiled from: PG */
public abstract class C69563a implements Serializable, C69577g, C69566d {

    /* renamed from: r */
    public final C69577g f185972r;

    public C69563a(C69577g gVar) {
        this.f185972r = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo5193b(Object obj);

    /* renamed from: c */
    public C69577g mo5194c(Object obj, C69577g gVar) {
        C69664n.m101061g(gVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: d */
    public C69577g mo61334d(C69577g gVar) {
        throw null;
    }

    /* renamed from: eL */
    public StackTraceElement mo61335eL() {
        int i;
        String str;
        C69567e eVar = (C69567e) getClass().getAnnotation(C69567e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int a = eVar.mo61342a();
        if (a <= 1) {
            int i2 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i2 = eVar.mo61346e()[i];
            }
            C69568f fVar = C69569g.f185980b;
            if (fVar == null) {
                try {
                    C69568f fVar2 = new C69568f(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    C69569g.f185980b = fVar2;
                    fVar = fVar2;
                } catch (Exception unused2) {
                    fVar = C69569g.f185979a;
                    C69569g.f185980b = fVar;
                }
            }
            if (fVar != C69569g.f185979a) {
                Method method = fVar.f185976a;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = fVar.f185977b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = fVar.f185978c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.mo61343b();
            } else {
                str = str2 + '/' + eVar.mo61343b();
            }
            return new StackTraceElement(str, eVar.mo61345d(), eVar.mo61344c(), i2);
        }
        throw new IllegalStateException("Debug metadata version mismatch. Expected: 1, got " + a + ". Please update the Kotlin standard library.");
    }

    /* renamed from: eM */
    public C69566d mo61336eM() {
        C69577g gVar = this.f185972r;
        if (gVar instanceof C69566d) {
            return (C69566d) gVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo61337i() {
    }

    /* renamed from: mb */
    public final void mo61338mb(Object obj) {
        C69577g gVar = this;
        while (true) {
            C69664n.m101061g(gVar, "frame");
            C69563a aVar = (C69563a) gVar;
            C69577g gVar2 = aVar.f185972r;
            C69664n.m101058d(gVar2);
            try {
                obj = aVar.mo5193b(obj);
                if (obj == C69554a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = C69714l.m101133a(th);
            }
            aVar.mo61337i();
            if (gVar2 instanceof C69563a) {
                gVar = gVar2;
            } else {
                gVar2.mo61338mb(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object eL = mo61335eL();
        if (eL == null) {
            eL = getClass().getName();
        }
        sb.append(eL);
        return sb.toString();
    }
}

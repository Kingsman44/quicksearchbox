package androidx.lifecycle;

import androidx.lifecycle.p127a.C2321b;
import androidx.lifecycle.p127a.C2322c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.bn */
/* compiled from: PG */
public class C2366bn implements C2363bk {

    /* renamed from: c */
    public static C2366bn f6585c;

    /* renamed from: d */
    public static final C2321b f6586d = C2364bl.f6584a;

    /* renamed from: a */
    public C2358bf mo634a(Class cls) {
        C69664n.m101061g(cls, "modelClass");
        try {
            Object newInstance = cls.newInstance();
            C69664n.m101060f(newInstance, "{\n                modelC…wInstance()\n            }");
            return (C2358bf) newInstance;
        } catch (InstantiationException e) {
            new StringBuilder("Cannot create an instance of ").append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
        } catch (IllegalAccessException e2) {
            new StringBuilder("Cannot create an instance of ").append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C2358bf mo635b(Class cls, C2322c cVar) {
        return C2362bj.m6360a(this, cls);
    }
}

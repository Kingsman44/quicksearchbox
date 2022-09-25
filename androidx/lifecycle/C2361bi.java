package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.p127a.C2321b;
import androidx.lifecycle.p127a.C2322c;
import java.lang.reflect.InvocationTargetException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.bi */
/* compiled from: PG */
public final class C2361bi extends C2366bn {

    /* renamed from: a */
    public static C2361bi f6581a;

    /* renamed from: b */
    public static final C2321b f6582b = C2360bh.f6580a;

    /* renamed from: e */
    private final Application f6583e;

    public C2361bi() {
        this.f6583e = null;
    }

    public C2361bi(Application application) {
        this.f6583e = application;
    }

    public C2361bi(byte[] bArr) {
        this.f6583e = null;
    }

    /* renamed from: c */
    private final C2358bf m6357c(Class cls, Application application) {
        if (!C2352b.class.isAssignableFrom(cls)) {
            return super.mo634a(cls);
        }
        try {
            C2358bf bfVar = (C2358bf) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
            C69664n.m101060f(bfVar, "{\n                try {\n…          }\n            }");
            return bfVar;
        } catch (NoSuchMethodException e) {
            new StringBuilder("Cannot create an instance of ").append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
        } catch (IllegalAccessException e2) {
            new StringBuilder("Cannot create an instance of ").append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
        } catch (InstantiationException e3) {
            new StringBuilder("Cannot create an instance of ").append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
        } catch (InvocationTargetException e4) {
            new StringBuilder("Cannot create an instance of ").append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e4);
        }
    }

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        C69664n.m101061g(cls, "modelClass");
        Application application = this.f6583e;
        if (application != null) {
            return m6357c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* renamed from: b */
    public final C2358bf mo635b(Class cls, C2322c cVar) {
        C69664n.m101061g(cls, "modelClass");
        if (this.f6583e != null) {
            return mo634a(cls);
        }
        Application application = (Application) cVar.mo5723a(f6582b);
        if (application != null) {
            return m6357c(cls, application);
        }
        if (!C2352b.class.isAssignableFrom(cls)) {
            return super.mo634a(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}

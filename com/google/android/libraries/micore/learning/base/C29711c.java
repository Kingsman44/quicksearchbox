package com.google.android.libraries.micore.learning.base;

import android.content.Context;
import com.google.android.gms.learning.C144827n;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.micore.learning.base.c */
/* compiled from: PG */
public final class C29711c implements Closeable {

    /* renamed from: a */
    private static final C29719k f80473a = C29712d.m54801a("AndroidLearningContext");

    /* renamed from: b */
    private static final Map f80474b = new HashMap();

    /* renamed from: c */
    private static C29711c f80475c;

    /* renamed from: d */
    private final Context f80476d;

    /* renamed from: e */
    private final Map f80477e = new HashMap();

    /* renamed from: f */
    private final C144827n f80478f;

    /* renamed from: g */
    private int f80479g;

    private C29711c(Context context) {
        this.f80476d = context;
        this.f80479g++;
        C144827n nVar = (C144827n) mo34852c(C144827n.class);
        this.f80478f = nVar;
        nVar.mo120055g(804);
        nVar.mo120055g(802);
    }

    /* renamed from: a */
    public final Context mo34851a() {
        Context context;
        synchronized (C29711c.class) {
            C58838bb.m90884s(this.f80479g > 0, "#getContext() called after #close()");
            context = this.f80476d;
        }
        return context;
    }

    /* renamed from: c */
    public final Object mo34852c(Class cls) {
        Object cast;
        synchronized (C29711c.class) {
            C58838bb.m90884s(this.f80479g > 0, "#getComponent() called after #close()");
            Object obj = this.f80477e.get(cls);
            if (obj == null) {
                C58817ah ahVar = (C58817ah) f80474b.get(cls);
                if (ahVar != null) {
                    obj = ahVar.apply(this);
                    this.f80477e.put(cls, obj);
                } else {
                    String obj2 = cls.toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("requested component type not registered: " + obj2);
                    f80473a.mo34864f(illegalArgumentException, "cannot retrieve component");
                    throw illegalArgumentException;
                }
            }
            cast = cls.cast(obj);
        }
        return cast;
    }

    public final void close() {
        synchronized (C29711c.class) {
            if (this.f80479g <= 0) {
                f80473a.mo34863e("close() called too many times!");
                this.f80478f.mo120056h(901);
                return;
            }
            this.f80478f.mo120055g(803);
            try {
                if (this.f80479g == 1) {
                    this.f80478f.mo120055g(805);
                    try {
                        for (Object next : this.f80477e.values()) {
                            if (next instanceof AutoCloseable) {
                                ((AutoCloseable) next).close();
                            }
                        }
                        this.f80477e.clear();
                        f80475c = null;
                    } catch (Exception e) {
                        f80473a.mo34864f(e, "Cannot close component instance, ignored.");
                    } catch (Throwable th) {
                        this.f80477e.clear();
                        f80475c = null;
                        throw th;
                    }
                }
            } finally {
                this.f80479g--;
            }
        }
    }

    /* renamed from: d */
    public final void mo34854d() {
        synchronized (C29711c.class) {
            this.f80479g++;
            ((C144827n) mo34852c(C144827n.class)).mo120055g(802);
        }
    }

    /* renamed from: e */
    public static synchronized void m54797e(Class cls, C58817ah ahVar) {
        synchronized (C29711c.class) {
            Map map = f80474b;
            ahVar.getClass();
            map.put(cls, ahVar);
        }
    }

    /* renamed from: b */
    public static synchronized C29711c m54796b(Context context) {
        C29711c cVar;
        synchronized (C29711c.class) {
            context.getClass();
            C29711c cVar2 = f80475c;
            if (cVar2 == null) {
                f80475c = new C29711c(context.getApplicationContext());
            } else {
                cVar2.mo34854d();
            }
            cVar = f80475c;
        }
        return cVar;
    }
}

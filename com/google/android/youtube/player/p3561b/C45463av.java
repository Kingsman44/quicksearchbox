package com.google.android.youtube.player.p3561b;

import com.google.android.youtube.player.C45510f;
import com.google.android.youtube.player.p3560a.C45439a;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.youtube.player.b.av */
public final class C45463av extends C45471bc {

    /* renamed from: a */
    public Object f118874a;

    /* renamed from: b */
    private final HashMap f118875b = new HashMap();

    /* renamed from: c */
    private boolean f118876c;

    /* renamed from: d */
    private final Class f118877d;

    private C45463av(Class cls) {
        this.f118877d = cls;
    }

    /* renamed from: a */
    public static C45463av m81142a() {
        return new C45463av(Boolean.class);
    }

    /* renamed from: b */
    public static C45463av m81143b() {
        return new C45463av(C45510f.class);
    }

    /* renamed from: h */
    private final void m81144h(Object obj) {
        try {
            this.f118874a = this.f118877d.cast(obj);
            this.f118876c = true;
            HashMap hashMap = new HashMap(this.f118875b);
            for (C45439a aVar : hashMap.keySet()) {
                ((Executor) hashMap.get(aVar)).execute(new C45462au(this, aVar));
            }
        } catch (ClassCastException unused) {
        }
    }

    /* renamed from: c */
    public final synchronized void mo49607c(C45439a aVar, Executor executor) {
        if (aVar != null) {
            if (executor != null) {
                this.f118875b.put(aVar, executor);
                if (this.f118876c) {
                    executor.execute(new C45461at(this, aVar));
                    return;
                }
                return;
            }
            throw new NullPointerException("Executor cannot be null");
        }
    }

    /* renamed from: d */
    public final synchronized void mo49608d(Object obj) {
        m81144h(obj);
    }

    /* renamed from: e */
    public final synchronized void mo49609e(boolean z) {
        if (this.f118877d == Boolean.class) {
            m81144h(Boolean.valueOf(z));
        }
    }

    /* renamed from: f */
    public final synchronized void mo49610f(long j) {
        if (this.f118877d == Long.class) {
            m81144h(Long.valueOf(j));
        }
    }

    /* renamed from: g */
    public final synchronized void mo49611g(C45439a aVar) {
        this.f118875b.remove(aVar);
    }
}

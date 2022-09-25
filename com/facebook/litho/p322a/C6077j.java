package com.facebook.litho.p322a;

import android.graphics.drawable.Drawable;
import com.facebook.litho.C6259fb;
import com.facebook.litho.p326e.C6226o;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.facebook.litho.a.j */
/* compiled from: PG */
public final class C6077j extends C6226o {

    /* renamed from: e */
    private final C6076i f17963e;

    /* renamed from: f */
    private final C6259fb f17964f = new C6259fb();

    public C6077j(C6259fb fbVar, C6076i iVar) {
        mo12766b(fbVar);
        this.f17963e = iVar;
    }

    /* renamed from: k */
    private static Object m15775k(WeakReference weakReference) {
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Drawable) || ((Drawable) obj).getCallback() != null) {
            return obj;
        }
        weakReference.clear();
        return null;
    }

    /* renamed from: a */
    public final float mo12765a(long j) {
        boolean z;
        if (mo13184d() <= 1) {
            Map map = this.f18402a;
            if (map == null) {
                z = false;
            } else {
                z = map.containsKey("default_input");
            }
            Object k = m15775k((WeakReference) this.f17964f.mo13250b());
            if (k == null) {
                return z ? mo13185e().f18404c : this.f18404c;
            }
            if (!z) {
                return this.f17963e.mo12760a(k);
            }
            float f = mo13185e().f18404c;
            mo12767c(f);
            return f;
        }
        throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
    }

    /* renamed from: b */
    public final void mo12766b(C6259fb fbVar) {
        C6259fb fbVar2 = this.f17964f;
        for (int i = 0; i < 5; i++) {
            fbVar2.f18497a[i] = null;
        }
        fbVar2.f18498b = 0;
        if (fbVar != null) {
            short s = fbVar.f18498b;
            for (int i2 = 0; i2 < s; i2++) {
                this.f17964f.mo13251c(fbVar.mo13249a(i2), new WeakReference(fbVar.f18497a[fbVar.mo13249a(i2)]));
            }
        }
    }

    /* renamed from: c */
    public final void mo12767c(float f) {
        short s = this.f17964f.f18498b;
        for (int i = 0; i < s; i++) {
            C6259fb fbVar = this.f17964f;
            Object k = m15775k((WeakReference) fbVar.f18497a[fbVar.mo13249a(i)]);
            if (k != null) {
                this.f17963e.mo12763d(k, f);
            }
        }
    }
}

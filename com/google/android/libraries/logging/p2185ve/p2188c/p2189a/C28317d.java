package com.google.android.libraries.logging.p2185ve.p2188c.p2189a;

import android.util.Log;
import com.google.android.libraries.logging.p2185ve.p2193e.p2197d.p2198a.C28409a;
import com.google.common.p4552o.aqr;
import java.util.Set;

/* renamed from: com.google.android.libraries.logging.ve.c.a.d */
/* compiled from: PG */
public final class C28317d {

    /* renamed from: a */
    public final Set f77002a;

    /* renamed from: b */
    public final C28409a f77003b;

    public C28317d(Set set, C28409a aVar) {
        this.f77002a = set;
        this.f77003b = aVar;
    }

    /* renamed from: a */
    public final void mo33833a(Object obj) {
        if (!this.f77002a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Inserted: ".concat(String.valueOf(String.valueOf(obj))));
            }
            for (C28314a b : this.f77002a) {
                b.mo33813b(obj);
            }
        }
    }

    /* renamed from: b */
    public final void mo33834b(Object obj) {
        if (!this.f77002a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Removed: ".concat(String.valueOf(String.valueOf(obj))));
            }
            for (C28314a d : this.f77002a) {
                d.mo33815d(obj);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo33835c() {
        return !this.f77002a.isEmpty();
    }

    /* renamed from: d */
    public final void mo33836d(Object obj, int i, int i2) {
        if (!this.f77002a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                String valueOf = String.valueOf(obj);
                String a = aqr.m92461a(i);
                if (i != 0) {
                    Log.v("GIL", "Visibility: " + valueOf + "; " + a + " -> " + aqr.m92461a(i2));
                } else {
                    throw null;
                }
            }
            for (C28314a g : this.f77002a) {
                g.mo33818g(obj, i2);
            }
        }
    }
}

package com.google.common.p4526f;

import com.google.common.p4526f.p4528b.C59011af;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.Iterator;

/* renamed from: com.google.common.f.aa */
/* compiled from: PG */
public class C58976aa {

    /* renamed from: a */
    public final String f156827a;

    /* renamed from: b */
    public final Class f156828b;

    /* renamed from: c */
    public final boolean f156829c;

    /* renamed from: d */
    public final long f156830d;

    /* renamed from: e */
    private final boolean f156831e;

    public C58976aa(String str, Class cls, boolean z, boolean z2) {
        if (!str.isEmpty()) {
            if (C59081b.m91351c(str.charAt(0))) {
                int i = 1;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    if (C59081b.m91351c(charAt) || ((charAt >= '0' && charAt <= '9') || charAt == '_')) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                    }
                }
                this.f156827a = str;
                this.f156828b = cls;
                this.f156829c = z;
                this.f156831e = z2;
                int identityHashCode = System.identityHashCode(this);
                long j = 0;
                for (int i2 = 0; i2 < 5; i2++) {
                    j |= 1 << (identityHashCode & 63);
                    identityHashCode >>>= 6;
                }
                this.f156830d = j;
                return;
            }
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        throw new IllegalArgumentException("identifier must not be empty");
    }

    /* renamed from: c */
    public static C58976aa m91139c(String str, Class cls) {
        return new C58976aa(str, cls, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56230a(Iterator it, C59106z zVar) {
        while (it.hasNext()) {
            mo56231b(it.next(), zVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo56231b(Object obj, C59106z zVar) {
        zVar.mo56300a(this.f156827a, obj);
    }

    /* renamed from: d */
    public final void mo56232d(Object obj, C59106z zVar) {
        if (!this.f156831e || C59011af.m91223a() <= 20) {
            mo56231b(obj, zVar);
        } else {
            zVar.mo56300a(this.f156827a, obj);
        }
    }

    /* renamed from: e */
    public final void mo56233e(Iterator it, C59106z zVar) {
        if (!this.f156829c) {
            throw new IllegalStateException("non repeating key");
        } else if (!this.f156831e || C59011af.m91223a() <= 20) {
            mo56230a(it, zVar);
        } else {
            while (it.hasNext()) {
                zVar.mo56300a(this.f156827a, it.next());
            }
        }
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.f156827a;
        String name2 = this.f156828b.getName();
        return name + "/" + str + "[" + name2 + "]";
    }
}

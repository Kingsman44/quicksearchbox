package com.google.common.p4574q;

import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58869cf;
import com.google.common.base.C58890d;
import com.google.common.base.C58898h;
import com.google.common.base.C58902l;
import com.google.common.base.C58903m;
import com.google.common.base.C58908r;
import com.google.common.base.C58910t;
import com.google.common.base.C58912v;
import com.google.common.p4522b.C58485gu;
import com.google.p4476cf.p4478b.C58060a;
import com.google.p4476cf.p4478b.C58061b;
import java.util.List;

/* renamed from: com.google.common.q.o */
/* compiled from: PG */
public final class C60736o {

    /* renamed from: b */
    private static final C58912v f164746b = C58912v.m91034k(".。．｡");

    /* renamed from: c */
    private static final C58869cf f164747c = C58869cf.m90936b(new C58903m('.'));

    /* renamed from: d */
    private static final C58827ar f164748d = C58827ar.m90818c('.');

    /* renamed from: e */
    private static final C58912v f164749e;

    /* renamed from: f */
    private static final C58912v f164750f;

    /* renamed from: g */
    private static final C58912v f164751g;

    /* renamed from: h */
    private static final C58912v f164752h;

    /* renamed from: a */
    public final String f164753a;

    /* renamed from: i */
    private final C58485gu f164754i;

    static {
        C58912v k = C58912v.m91034k("-_");
        f164749e = k;
        C58902l lVar = new C58902l('0', '9');
        f164750f = lVar;
        C58910t tVar = new C58910t(new C58902l('a', 'z'), new C58902l('A', 'Z'));
        f164751g = tVar;
        f164752h = new C58910t(new C58910t(lVar, tVar), k);
    }

    public C60736o(String str) {
        String c = C58890d.m90988c(f164746b.mo56183f(str));
        boolean z = false;
        c = c.endsWith(".") ? c.substring(0, c.length() - 1) : c;
        C58838bb.m90873h(c.length() <= 253, "Domain name too long: '%s':", c);
        this.f164753a = c;
        C58485gu i = C58485gu.m89841i(f164747c.mo56153g(c));
        this.f164754i = i;
        C58838bb.m90873h(i.size() <= 127, "Domain has too many parts: '%s'", c);
        int size = i.size() - 1;
        if (m92694b((String) i.get(size), true)) {
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = true;
                    break;
                } else if (!m92694b((String) i.get(i2), false)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        C58838bb.m90873h(z, "Not a valid domain name: '%s'", c);
        m92695c(C58836b.f156633a);
        m92695c(C58833ax.m90834k(C58061b.REGISTRY));
    }

    /* renamed from: a */
    private static boolean m92693a(C58833ax axVar, C58833ax axVar2) {
        return axVar.mo56113h() ? axVar.equals(axVar2) : axVar2.mo56113h();
    }

    /* renamed from: b */
    private static boolean m92694b(String str, boolean z) {
        if (str.length() > 0 && str.length() <= 63) {
            if (!f164752h.mo56188g(new C58908r(C58898h.f156736a).mo56193m(str))) {
                return false;
            }
            C58912v vVar = f164749e;
            if (!vVar.mo56144c(str.charAt(0)) && !vVar.mo56144c(str.charAt(str.length() - 1))) {
                if (!z || !f164750f.mo56144c(str.charAt(0))) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m92695c(C58833ax axVar) {
        int size = this.f164754i.size();
        int i = 0;
        while (i < size) {
            String d = f164748d.mo56097d(this.f164754i.subList(i, size));
            if (!m92693a(axVar, C58833ax.m90833j((C58061b) C58060a.f155200a.get(d))) && !C58060a.f155202c.containsKey(d)) {
                List i2 = f164747c.mo56156j().mo56155i(d);
                if (i2.size() != 2 || !m92693a(axVar, C58833ax.m90833j((C58061b) C58060a.f155201b.get(i2.get(1))))) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C60736o) {
            return this.f164753a.equals(((C60736o) obj).f164753a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f164753a.hashCode();
    }

    public final String toString() {
        return this.f164753a;
    }
}

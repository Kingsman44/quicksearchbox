package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10338l.C136413g;
import com.google.android.apps.search.googleapp.p10338l.C136414h;
import com.google.android.apps.search.googleapp.p10338l.C136415i;
import com.google.android.apps.search.googleapp.p10338l.C136416j;
import com.google.android.apps.search.googleapp.p10338l.C136417k;
import com.google.android.apps.search.googleapp.p10338l.C136419m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p5462h.C69702k;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.l.a.o */
/* compiled from: PG */
public final class C136396o {

    /* renamed from: a */
    public C136419m f371330a;

    /* renamed from: b */
    public StringBuilder f371331b;

    /* renamed from: c */
    public C136419m f371332c;

    /* renamed from: d */
    public final Map f371333d;

    /* renamed from: e */
    private final String f371334e;

    /* renamed from: f */
    private final String f371335f;

    /* renamed from: g */
    private String f371336g;

    /* renamed from: h */
    private boolean f371337h;

    /* renamed from: i */
    private final C136391j f371338i;

    public C136396o() {
        this((String) null);
    }

    /* renamed from: a */
    public final synchronized Object mo112973a(C69615a aVar) {
        return aVar.mo5672a();
    }

    /* renamed from: b */
    public final void mo112974b(Object obj) {
        if (C69702k.m101125b(obj)) {
            C136417k kVar = (C136417k) obj;
            if (kVar == null) {
                mo112975c("<NULL>");
            } else {
                C136391j jVar = this.f371338i;
                Set a = jVar.mo112972a(kVar);
                if (!a.isEmpty()) {
                    C136396o oVar = jVar.f371320a;
                    if (!(a instanceof Collection) || !a.isEmpty()) {
                        Iterator it = a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C136419m) it.next()).compareTo(oVar.f371330a) <= 0) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    mo112975c("<REDACTED>");
                } else if (kVar instanceof C136416j) {
                    C136416j jVar2 = (C136416j) kVar;
                    throw null;
                } else if (kVar instanceof C136413g) {
                    C136413g gVar = (C136413g) kVar;
                    throw null;
                } else if (kVar instanceof C136414h) {
                    C136390i iVar = new C136390i(kVar, this);
                    if (!this.f371337h) {
                        mo112975c(BuildConfig.FLAVOR);
                        mo112977e(iVar);
                    } else {
                        iVar.mo5672a();
                    }
                } else if (kVar instanceof C136415i) {
                    C136415i iVar2 = (C136415i) kVar;
                    throw null;
                }
            }
        }
        Throwable a2 = C69702k.m101124a(obj);
        if (a2 != null) {
            int i = C69649af.f186028a;
            String b = new C69657g(a2.getClass()).mo61379b();
            if (b == null) {
                b = "AnonymousException";
            }
            String str = "[" + b + "_" + this.f371333d.size() + "]";
            this.f371333d.put(str, a2);
            mo112975c(str);
        }
    }

    /* renamed from: c */
    public final void mo112975c(String str) {
        mo112976d(str);
        StringBuilder sb = this.f371331b;
        sb.append(10);
        C69664n.m101060f(sb, "append('\\n')");
        this.f371337h = true;
    }

    /* renamed from: d */
    public final void mo112976d(String str) {
        if (this.f371337h) {
            this.f371331b.append(this.f371336g);
        }
        this.f371331b.append(str);
        this.f371337h = C69764m.m101230i(str, "\n");
    }

    /* renamed from: e */
    public final void mo112977e(C69615a aVar) {
        String str = this.f371336g;
        this.f371336g = String.valueOf(str).concat(this.f371334e);
        try {
            aVar.mo5672a();
        } finally {
            this.f371336g = str;
        }
    }

    /* renamed from: f */
    public final void mo112978f() {
        this.f371330a = C136419m.UNDEFINED;
        this.f371336g = this.f371335f;
        this.f371331b = new StringBuilder();
        this.f371332c = C136419m.SAFE;
        this.f371337h = true;
    }

    public C136396o(String str) {
        this.f371334e = "  ";
        this.f371335f = str;
        this.f371330a = C136419m.UNDEFINED;
        this.f371336g = str;
        this.f371331b = new StringBuilder();
        this.f371332c = C136419m.SAFE;
        this.f371337h = true;
        this.f371333d = new LinkedHashMap();
        this.f371338i = new C136391j(this);
    }
}

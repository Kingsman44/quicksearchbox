package com.google.p4583d.p4584a;

import com.google.p4583d.p4584a.p4588d.C60976c;
import com.google.p4583d.p4584a.p4588d.C60978e;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4589e.C60996c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.d.a.g */
/* compiled from: PG */
public final class C61012g {

    /* renamed from: a */
    public final C61012g f165214a;

    /* renamed from: b */
    public final C60996c f165215b;

    /* renamed from: c */
    final Map f165216c = new HashMap();

    /* renamed from: d */
    final Map f165217d = new HashMap();

    public C61012g(C61012g gVar, C60996c cVar) {
        this.f165214a = gVar;
        this.f165215b = cVar;
    }

    /* renamed from: a */
    public final C61012g mo57525a() {
        return new C61012g(this, this.f165215b);
    }

    /* renamed from: b */
    public final C60987n mo57526b(C60976c cVar) {
        C60987n nVar = C60987n.f165114f;
        Iterator k = cVar.mo57478k();
        while (k.hasNext()) {
            nVar = this.f165215b.mo57519a(this, cVar.mo57469e(((Integer) k.next()).intValue()));
            if (nVar instanceof C60978e) {
                break;
            }
        }
        return nVar;
    }

    /* renamed from: c */
    public final C60987n mo57527c(String str) {
        if (this.f165216c.containsKey(str)) {
            return (C60987n) this.f165216c.get(str);
        }
        C61012g gVar = this.f165214a;
        if (gVar != null) {
            return gVar.mo57527c(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: d */
    public final void mo57528d(String str, C60987n nVar) {
        if (!this.f165217d.containsKey(str)) {
            if (nVar == null) {
                this.f165216c.remove(str);
            } else {
                this.f165216c.put(str, nVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo57529e(String str, C60987n nVar) {
        mo57528d(str, nVar);
        this.f165217d.put(str, true);
    }

    /* renamed from: f */
    public final void mo57530f(String str, C60987n nVar) {
        C61012g gVar;
        if (!this.f165216c.containsKey(str) && (gVar = this.f165214a) != null && gVar.mo57531g(str)) {
            this.f165214a.mo57530f(str, nVar);
        } else if (!this.f165217d.containsKey(str)) {
            if (nVar == null) {
                this.f165216c.remove(str);
            } else {
                this.f165216c.put(str, nVar);
            }
        }
    }

    /* renamed from: g */
    public final boolean mo57531g(String str) {
        if (this.f165216c.containsKey(str)) {
            return true;
        }
        C61012g gVar = this.f165214a;
        if (gVar != null) {
            return gVar.mo57531g(str);
        }
        return false;
    }
}

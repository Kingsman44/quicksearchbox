package com.google.p4583d.p4584a.p4586b;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60987n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.d.a.b.l */
/* compiled from: PG */
public final class C60966l extends C60980g {

    /* renamed from: a */
    final Map f165083a = new HashMap();

    /* renamed from: b */
    private final C60955a f165084b;

    public C60966l(C60955a aVar) {
        super("require");
        this.f165084b = aVar;
    }

    /* renamed from: a */
    public final C60987n mo57451a(C61012g gVar, List list) {
        C60987n nVar;
        C61013h.m93265g("require", 1, list);
        String i = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57475i();
        if (this.f165083a.containsKey(i)) {
            return (C60987n) this.f165083a.get(i);
        }
        C60955a aVar = this.f165084b;
        if (aVar.f165073a.containsKey(i)) {
            try {
                nVar = (C60987n) ((Callable) aVar.f165073a.get(i)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(i)));
            }
        } else {
            nVar = C60987n.f165114f;
        }
        if (nVar instanceof C60980g) {
            this.f165083a.put(i, (C60980g) nVar);
        }
        return nVar;
    }
}

package com.google.android.libraries.gsa.monet.shared;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.shared.b */
/* compiled from: PG */
public abstract class C23086b {

    /* renamed from: a */
    private final Map f63433a = new HashMap();

    /* renamed from: a */
    private final synchronized void m43265a(C23129y yVar) {
        Integer num = (Integer) this.f63433a.get(yVar);
        if (num == null) {
            this.f63433a.put(yVar, 1);
        } else {
            this.f63433a.put(yVar, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: e */
    private final synchronized void m43266e(C23129y yVar) {
        Integer num = (Integer) this.f63433a.get(yVar);
        if (num != null) {
            Integer valueOf = Integer.valueOf(num.intValue() - 1);
            if (valueOf.intValue() == 0) {
                this.f63433a.remove(yVar);
            } else {
                this.f63433a.put(yVar, valueOf);
            }
        }
    }

    /* renamed from: b */
    public abstract C23115k mo28322b(String str);

    /* renamed from: c */
    public final synchronized C23078ai mo28528c(C23129y yVar) {
        C23076ag agVar;
        agVar = new C23076ag(yVar);
        agVar.f63429c = true;
        m43265a(yVar);
        agVar.mo28525b(new C23065a());
        return agVar;
    }

    /* renamed from: d */
    public final synchronized void mo28529d(C23078ai aiVar) {
        m43266e(aiVar.f63427a);
    }
}

package com.android.p261d.p263b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.android.d.b.j */
/* compiled from: PG */
final class C5051j {

    /* renamed from: a */
    public static final int[] f16085a = {0, 1, 2, 3, 4};

    /* renamed from: b */
    public final int f16086b;

    /* renamed from: c */
    public final Map f16087c = new HashMap();

    public C5051j(int i) {
        this.f16086b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10008a() {
        return this.f16087c.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10009b(C5050i iVar) {
        iVar.f16082g = this.f16086b;
        C5050i iVar2 = (C5050i) this.f16087c.put(Short.valueOf(iVar.f16078c), iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C5051j)) {
            C5051j jVar = (C5051j) obj;
            if (jVar.f16086b == this.f16086b && jVar.mo10008a() == mo10008a()) {
                for (C5050i iVar : (C5050i[]) jVar.f16087c.values().toArray(new C5050i[jVar.f16087c.size()])) {
                    if (!C5044c.f16017bp.contains(Short.valueOf(iVar.f16078c)) && !iVar.equals((C5050i) this.f16087c.get(Short.valueOf(iVar.f16078c)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}

package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8393i;
import com.google.p386ak.C8406v;
import com.google.p386ak.p388b.C8338al;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8386b;
import com.google.p386ak.p394d.C8387c;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.google.ak.b.a.h */
/* compiled from: PG */
final class C8308h extends C8266aa {

    /* renamed from: a */
    private final C8266aa f29097a;

    /* renamed from: b */
    private final C8266aa f29098b;

    /* renamed from: c */
    private final C8338al f29099c;

    public C8308h(C8393i iVar, Type type, C8266aa aaVar, Type type2, C8266aa aaVar2, C8338al alVar) {
        this.f29097a = new C8320t(iVar, aaVar, type);
        this.f29098b = new C8320t(iVar, aaVar2, type2);
        this.f29099c = alVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        int i;
        int r = aVar.mo17127r();
        if (r == 9) {
            aVar.mo17123n();
            return null;
        }
        Map map = (Map) this.f29099c.mo17084a();
        if (r == 1) {
            aVar.mo17119j();
            while (aVar.mo17125p()) {
                aVar.mo17119j();
                Object a = ((C8320t) this.f29097a).f29135a.mo17029a(aVar);
                if (map.put(a, ((C8320t) this.f29098b).f29135a.mo17029a(aVar)) == null) {
                    aVar.mo17121l();
                } else {
                    throw new C8406v("duplicate key: ".concat(String.valueOf(String.valueOf(a))));
                }
            }
            aVar.mo17121l();
        } else {
            aVar.mo17120k();
            while (aVar.mo17125p()) {
                int i2 = aVar.f29219d;
                if (i2 == 0) {
                    i2 = aVar.mo17110b();
                }
                if (i2 == 13) {
                    aVar.f29219d = 9;
                } else {
                    if (i2 == 12) {
                        i = 8;
                    } else if (i2 == 14) {
                        i = 10;
                    } else {
                        int r2 = aVar.mo17127r();
                        String e = aVar.mo17114e();
                        throw new IllegalStateException("Expected a name but was " + C8386b.m23197a(r2) + e);
                    }
                    aVar.f29219d = i;
                }
                Object a2 = ((C8320t) this.f29097a).f29135a.mo17029a(aVar);
                if (map.put(a2, ((C8320t) this.f29098b).f29135a.mo17029a(aVar)) != null) {
                    throw new C8406v("duplicate key: ".concat(String.valueOf(String.valueOf(a2))));
                }
            }
            aVar.mo17122m();
        }
        return map;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            cVar.mo17138h();
            return;
        }
        cVar.mo17133d();
        for (Map.Entry entry : map.entrySet()) {
            cVar.mo17137g(String.valueOf(entry.getKey()));
            this.f29098b.mo17030b(cVar, entry.getValue());
        }
        cVar.mo17135f();
    }
}

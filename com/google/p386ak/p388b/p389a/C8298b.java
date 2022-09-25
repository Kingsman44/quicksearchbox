package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.google.ak.b.a.b */
/* compiled from: PG */
public final class C8298b extends C8266aa {

    /* renamed from: a */
    public static final C8267ab f29036a = new C8270a();

    /* renamed from: b */
    private final Class f29037b;

    /* renamed from: c */
    private final C8266aa f29038c;

    public C8298b(C8393i iVar, C8266aa aaVar, Class cls) {
        this.f29038c = new C8320t(iVar, aaVar, cls);
        this.f29037b = cls;
    }

    /* renamed from: a */
    public final Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo17119j();
        while (aVar.mo17125p()) {
            arrayList.add(((C8320t) this.f29038c).f29135a.mo17029a(aVar));
        }
        aVar.mo17121l();
        int size = arrayList.size();
        if (!this.f29037b.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance(this.f29037b, size));
        }
        Object newInstance = Array.newInstance(this.f29037b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: b */
    public final void mo17030b(C8387c cVar, Object obj) {
        if (obj == null) {
            cVar.mo17138h();
            return;
        }
        cVar.mo17131c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f29038c.mo17030b(cVar, Array.get(obj, i));
        }
        cVar.mo17134e();
    }
}

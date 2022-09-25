package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.p387a.C8265b;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ak.b.a.bc */
/* compiled from: PG */
final class C8301bc extends C8266aa {

    /* renamed from: a */
    private final Map f29040a = new HashMap();

    /* renamed from: b */
    private final Map f29041b = new HashMap();

    /* renamed from: c */
    private final Map f29042c = new HashMap();

    public C8301bc(Class cls) {
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C8300bb(cls))) {
                Enum enumR = (Enum) field.get((Object) null);
                String name = enumR.name();
                String str = enumR.toString();
                C8265b bVar = (C8265b) field.getAnnotation(C8265b.class);
                if (bVar != null) {
                    name = bVar.mo17027a();
                    for (String put : bVar.mo17028b()) {
                        this.f29040a.put(put, enumR);
                    }
                }
                this.f29040a.put(name, enumR);
                this.f29041b.put(str, enumR);
                this.f29042c.put(enumR, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        String h = aVar.mo17117h();
        Enum enumR = (Enum) this.f29040a.get(h);
        if (enumR != null) {
            return enumR;
        }
        return (Enum) this.f29041b.get(h);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String str;
        Enum enumR = (Enum) obj;
        if (enumR == null) {
            str = null;
        } else {
            str = (String) this.f29042c.get(enumR);
        }
        cVar.mo17141k(str);
    }
}

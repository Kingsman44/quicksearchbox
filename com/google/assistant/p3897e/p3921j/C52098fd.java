package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import java.util.Map;

/* renamed from: com.google.assistant.e.j.fd */
/* compiled from: PG */
public final class C52098fd extends C62934bn implements C63001dt {
    public C52098fd() {
        super(C52107fm.f136742d);
    }

    /* renamed from: a */
    public final void mo53797a(Map map) {
        copyOnWrite();
        C52107fm fmVar = (C52107fm) this.instance;
        C52107fm fmVar2 = C52107fm.f136742d;
        C62995dn dnVar = fmVar.f136745b;
        if (!dnVar.f170058b) {
            fmVar.f136745b = dnVar.mo58980a();
        }
        fmVar.f136745b.putAll(map);
    }

    /* renamed from: b */
    public final void mo53798b(String str, C52103fi fiVar) {
        str.getClass();
        fiVar.getClass();
        copyOnWrite();
        C52107fm fmVar = (C52107fm) this.instance;
        C52107fm fmVar2 = C52107fm.f136742d;
        C62995dn dnVar = fmVar.f136746c;
        if (!dnVar.f170058b) {
            fmVar.f136746c = dnVar.mo58980a();
        }
        fmVar.f136746c.put(str, fiVar);
    }

    @Deprecated
    /* renamed from: c */
    public final void mo53799c(String str, String str2) {
        copyOnWrite();
        C52107fm fmVar = (C52107fm) this.instance;
        C52107fm fmVar2 = C52107fm.f136742d;
        C62995dn dnVar = fmVar.f136744a;
        if (!dnVar.f170058b) {
            fmVar.f136744a = dnVar.mo58980a();
        }
        fmVar.f136744a.put(str, str2);
    }
}

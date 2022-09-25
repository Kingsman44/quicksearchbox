package com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f;

import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4409c.C57755a;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4409c.C57756b;
import com.google.protos.youtube.elements.C66260r;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.f.n */
/* compiled from: PG */
public final class C40361n extends C21259bb {

    /* renamed from: a */
    private static final C58495hd f106010a;

    /* renamed from: b */
    private static final C58495hd f106011b;

    /* renamed from: c */
    private final C40356i f106012c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C66260r.LOG_TYPE_WIRE_FORMAT_ERROR, C57755a.WIRE_FORMAT_ERROR);
        gzVar.mo55429h(C66260r.LOG_TYPE_CONFIGURATION_ERROR, C57755a.CONFIGURATION_ERROR);
        gzVar.mo55429h(C66260r.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, C57755a.INTERNAL_TEMPLATE_RESOLUTION_ERROR);
        gzVar.mo55429h(C66260r.LOG_TYPE_INTERNAL_ERROR, C57755a.INTERNAL_ERROR);
        gzVar.mo55429h(C66260r.LOG_TYPE_INTERNAL_RESOURCE_ERROR, C57755a.INTERNAL_RESOURCE_ERROR);
        gzVar.mo55429h(C66260r.LOG_TYPE_INTERNAL_UTP_ERROR, C57755a.INTERNAL_UTP_ERROR);
        gzVar.mo55429h(C66260r.ERROR_TYPE_UNKNOWN, C57755a.INTERNAL_RUNTIME_ERROR_UNSPECIFIED);
        f106010a = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C66260r.LOG_TYPE_INVALID_FIELD, C57756b.INVALID_VALUE);
        gzVar2.mo55429h(C66260r.LOG_TYPE_MISSING_FIELD, C57756b.MISSING_FIELD);
        gzVar2.mo55429h(C66260r.LOG_TYPE_UNKNOWN_EXTENSION, C57756b.UNKNOWN_EXTENSION);
        gzVar2.mo55429h(C66260r.LOG_TYPE_MODEL_ERROR, C57756b.MODEL_ERROR);
        gzVar2.mo55429h(C66260r.LOG_TYPE_COMMAND_EXECUTION_ERROR, C57756b.COMMAND_EXECUTION_ERROR);
        gzVar2.mo55429h(C66260r.LOG_TYPE_INTERNAL_MISSING_RESOURCE_ERROR, C57756b.MISSING_TEMPLATE_ERROR);
        gzVar2.mo55429h(C66260r.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, C57756b.PROPERTY_RESOLUTION_ERROR);
        f106011b = gzVar2.mo55427f(false);
    }

    public C40361n(C40356i iVar) {
        this.f106012c = iVar;
    }

    /* renamed from: a */
    public final void mo25782a(C66260r rVar, String str, C21319z zVar, Throwable th) {
        C58495hd hdVar = f106010a;
        if (hdVar.containsKey(rVar)) {
            C40356i iVar = this.f106012c;
            C57755a aVar = (C57755a) hdVar.get(rVar);
            if (iVar.f105996d.mo42421a()) {
                C40351d dVar = iVar.f105993a;
                int i = aVar.f154300h;
                int i2 = iVar.f105995c.f154136O;
                int i3 = iVar.f105997e.f105991a;
                ((C19567d) dVar.f105967c.mo6453a()).mo24822a(1, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), iVar.f105994b);
                return;
            }
            return;
        }
        C58495hd hdVar2 = f106011b;
        if (hdVar2.containsKey(rVar)) {
            C40356i iVar2 = this.f106012c;
            C57756b bVar = (C57756b) hdVar2.get(rVar);
            if (iVar2.f105996d.mo42421a()) {
                C40351d dVar2 = iVar2.f105993a;
                int i4 = bVar.f154310i;
                int i5 = iVar2.f105995c.f154136O;
                int i6 = iVar2.f105997e.f105991a;
                ((C19567d) dVar2.f105966b.mo6453a()).mo24822a(1, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), iVar2.f105994b);
            }
        }
    }
}

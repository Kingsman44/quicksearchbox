package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2037n.C24784aq;
import com.google.android.libraries.lens.ondevice.p2037n.C24787at;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.p4172bg.p4174b.C55721j;
import com.google.p4172bg.p4174b.C55731t;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63242o;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.ondevice.k.en */
/* compiled from: PG */
public final class C24657en {

    /* renamed from: a */
    public static final Map f67463a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C24564bb.class, C63242o.COMBINED_OCR);
        gzVar.mo55429h(C24558aw.class, C63242o.OCR_DETECTION);
        gzVar.mo55429h(C24577bo.class, C63242o.OCR_TRANSCRIPTION);
        gzVar.mo55429h(C24658eo.class, C63242o.REGION_DETECTION);
        gzVar.mo55429h(C24601cl.class, C63242o.PLM_LINE_DETECTION);
        gzVar.mo55429h(C24619dc.class, C63242o.PLM_SCRIPT_DETECTION);
        gzVar.mo55429h(C24606cq.class, C63242o.PLM_LINE_RECOGNITION);
        gzVar.mo55429h(C24596cg.class, C63242o.PLM_LAYOUT_ANALYSIS);
        gzVar.mo55429h(C24591cb.class, C63242o.PLM_DEEP_PARAGRAPHS);
        gzVar.mo55429h(C24674fd.class, C63242o.SCRIPT_LANGUAGE_DETECTION);
        gzVar.mo55429h(C24546ak.class, C63242o.LINEBOX_FILTERING);
        gzVar.mo55429h(C24725ha.class, C63242o.TRANSLATION);
        gzVar.mo55429h(C24538ac.class, C63242o.INPAINTING);
        gzVar.mo55429h(C24692fv.class, C63242o.SERVER_TRANSLATION);
        f67463a = gzVar.mo55427f(true);
    }

    /* renamed from: a */
    public static C24787at m45761a(C55731t tVar) {
        int i = 0;
        int i2 = 0;
        for (C55721j jVar : tVar.f147065c) {
            i2++;
            i += jVar.f147020b.size();
        }
        C24784aq aqVar = (C24784aq) C24787at.f67723g.createBuilder();
        aqVar.copyOnWrite();
        C24787at atVar = (C24787at) aqVar.instance;
        atVar.f67725a |= 2;
        atVar.f67727c = i;
        aqVar.copyOnWrite();
        C24787at atVar2 = (C24787at) aqVar.instance;
        atVar2.f67725a |= 1;
        atVar2.f67726b = i2;
        return (C24787at) aqVar.build();
    }

    /* renamed from: b */
    public static String m45762b(Class cls) {
        C24266a aVar = (C24266a) cls.getAnnotation(C24266a.class);
        C58838bb.m90867b(aVar, "%s does not contain a Primitive annotation", cls);
        return aVar.mo29795a();
    }
}

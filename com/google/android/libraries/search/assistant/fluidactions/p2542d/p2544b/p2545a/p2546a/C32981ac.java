package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51024do;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58557jl;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C32981ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C32985ag f88356a;

    /* renamed from: b */
    public final /* synthetic */ C52623yp f88357b;

    /* renamed from: c */
    public final /* synthetic */ String f88358c;

    /* renamed from: d */
    public final /* synthetic */ Set f88359d;

    public /* synthetic */ C32981ac(C32985ag agVar, C52623yp ypVar, String str, Set set) {
        this.f88356a = agVar;
        this.f88357b = ypVar;
        this.f88358c = str;
        this.f88359d = set;
    }

    public final Object apply(Object obj) {
        C32985ag agVar = this.f88356a;
        C52623yp ypVar = this.f88357b;
        String str = this.f88358c;
        Set<String> set = this.f88359d;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return agVar.mo38442j((String) optional.get());
        }
        if (set.size() == 1) {
            return agVar.mo38442j((String) C58557jl.m90133n(set));
        }
        String h = C33036j.m61317h(agVar.f88371b, str);
        C51021dl dlVar = (C51021dl) C51030du.f132868g.createBuilder();
        for (String str2 : set) {
            C51024do doVar = (C51024do) C51027dr.f132852m.createBuilder();
            doVar.copyOnWrite();
            C51027dr drVar = (C51027dr) doVar.instance;
            str2.getClass();
            drVar.f132855b = 2;
            drVar.f132856c = str2;
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            dcVar.f132815a = 2 | dcVar.f132815a;
            dcVar.f132817c = h;
            doVar.copyOnWrite();
            C51027dr drVar2 = (C51027dr) doVar.instance;
            C51012dc dcVar2 = (C51012dc) dbVar.build();
            dcVar2.getClass();
            drVar2.f132864k = dcVar2;
            drVar2.f132854a |= 128;
            dlVar.mo53503d(doVar);
        }
        agVar.mo38446n(ypVar, (C51030du) dlVar.build(), 7);
        agVar.mo38445m(C51401gi.CONTACT_ENDPOINT_SELECTION);
        return Optional.m71637of(agVar.mo38434a(false));
    }
}

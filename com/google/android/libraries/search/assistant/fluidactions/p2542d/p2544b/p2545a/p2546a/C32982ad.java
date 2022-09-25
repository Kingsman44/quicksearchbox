package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51024do;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58557jl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C32982ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C32985ag f88360a;

    /* renamed from: b */
    public final /* synthetic */ C52623yp f88361b;

    /* renamed from: c */
    public final /* synthetic */ Map f88362c;

    /* renamed from: d */
    public final /* synthetic */ Set f88363d;

    public /* synthetic */ C32982ad(C32985ag agVar, C52623yp ypVar, Map map, Set set) {
        this.f88360a = agVar;
        this.f88361b = ypVar;
        this.f88362c = map;
        this.f88363d = set;
    }

    public final C60870cx apply(Object obj) {
        C32985ag agVar = this.f88360a;
        C52623yp ypVar = this.f88361b;
        Map map = this.f88362c;
        Set<String> set = this.f88363d;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return agVar.mo38436d(ypVar, (String) optional.get());
        }
        if (set.size() == 1) {
            String str = (String) C58557jl.m90133n(set);
            agVar.f88372c.mo38462G(str);
            return agVar.mo38436d(ypVar, str);
        }
        C51021dl dlVar = (C51021dl) C51030du.f132868g.createBuilder();
        for (String str2 : set) {
            String concat = (C58837ba.m90859h(str2) || !str2.matches("^[a-zA-Z ]+$")) ? str2 : String.valueOf(C58890d.m90989d(str2.substring(0, 1))).concat(String.valueOf(str2.substring(1)));
            C51024do doVar = (C51024do) C51027dr.f132852m.createBuilder();
            doVar.copyOnWrite();
            C51027dr drVar = (C51027dr) doVar.instance;
            concat.getClass();
            drVar.f132855b = 2;
            drVar.f132856c = concat;
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            String h = C33036j.m61317h(agVar.f88371b, str2);
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
            if (map.containsKey(str2)) {
                Integer valueOf = Integer.valueOf(((List) map.get(str2)).size());
                if (valueOf.intValue() == 1) {
                    String str3 = (String) ((List) map.get(str2)).get(0);
                    doVar.copyOnWrite();
                    C51027dr drVar3 = (C51027dr) doVar.instance;
                    str3.getClass();
                    drVar3.f132854a |= 16;
                    drVar3.f132861h = str3;
                } else {
                    String quantityString = agVar.f88371b.getResources().getQuantityString(R.plurals.assistantactions_n_emails, valueOf.intValue(), new Object[]{valueOf});
                    doVar.copyOnWrite();
                    C51027dr drVar4 = (C51027dr) doVar.instance;
                    quantityString.getClass();
                    drVar4.f132854a |= 16;
                    drVar4.f132861h = quantityString;
                }
            }
            dlVar.mo53503d(doVar);
        }
        agVar.mo38446n(ypVar, (C51030du) dlVar.build(), 7);
        agVar.mo38445m(C51401gi.CONTACT_ENDPOINT_LABEL_SELECTION);
        return C60856cj.m92900i(Optional.m71637of(agVar.mo38434a(false)));
    }
}

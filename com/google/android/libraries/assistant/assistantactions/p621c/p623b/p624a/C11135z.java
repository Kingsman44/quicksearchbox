package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51024do;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.z */
/* compiled from: PG */
public final /* synthetic */ class C11135z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11070af f36495a;

    /* renamed from: b */
    public final /* synthetic */ C52623yp f36496b;

    /* renamed from: c */
    public final /* synthetic */ String f36497c;

    /* renamed from: d */
    public final /* synthetic */ Set f36498d;

    public /* synthetic */ C11135z(C11070af afVar, C52623yp ypVar, String str, Set set) {
        this.f36495a = afVar;
        this.f36496b = ypVar;
        this.f36497c = str;
        this.f36498d = set;
    }

    public final Object apply(Object obj) {
        C11070af afVar = this.f36495a;
        C52623yp ypVar = this.f36496b;
        String str = this.f36497c;
        Set<String> set = this.f36498d;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return afVar.mo19538e((String) axVar.mo56107c());
        }
        if (set.size() == 1) {
            return afVar.mo19538e((String) C58557jl.m90133n(set));
        }
        String h = C11118i.m26423h(afVar.f36333b, str);
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
        afVar.mo19547n(ypVar, (C51030du) dlVar.build(), 7);
        afVar.mo19546m(C51401gi.CONTACT_ENDPOINT_SELECTION);
        return C58833ax.m90834k(afVar.mo19534a(false));
    }
}

package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.n */
/* compiled from: PG */
public final /* synthetic */ class C106960n implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C106961o f297930a;

    /* renamed from: b */
    public final /* synthetic */ C50690ab f297931b;

    /* renamed from: c */
    public final /* synthetic */ C52560wg f297932c;

    public /* synthetic */ C106960n(C106961o oVar, C50690ab abVar, C52560wg wgVar) {
        this.f297930a = oVar;
        this.f297931b = abVar;
        this.f297932c = wgVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C51058ev evVar;
        C106961o oVar = this.f297930a;
        C50690ab abVar = this.f297931b;
        C52560wg wgVar = this.f297932c;
        if (C50690ab.MEDIA_SESSION.equals(abVar)) {
            C51098gh ghVar = wgVar.f137949e;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            return C58833ax.m90834k(evVar.f132944b);
        }
        List i = C58869cf.m90936b(new C58903m('|')).mo56152f(C58911u.f156751b).mo56151a().mo56155i(wgVar.f137952h);
        if (i.isEmpty()) {
            ((C58970a) ((C58970a) oVar.f297933a.mo56226d()).mo56372aa(23346)).mo56386p("Deezer item has no media id");
            return C58836b.f156633a;
        } else if (i.size() > 2) {
            ((C58970a) ((C58970a) oVar.f297933a.mo56226d()).mo56372aa(23345)).mo56389s("Deezer item invalid format: %s", wgVar.f137952h);
            return C58836b.f156633a;
        } else {
            String str = wgVar.f137952h;
            return C58833ax.m90834k((String) C58557jl.m90131l(i));
        }
    }
}

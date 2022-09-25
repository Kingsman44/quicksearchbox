package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a */
/* compiled from: PG */
public final /* synthetic */ class C123916a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C123949b f342271a;

    /* renamed from: b */
    public final /* synthetic */ C50690ab f342272b;

    /* renamed from: c */
    public final /* synthetic */ C52560wg f342273c;

    public /* synthetic */ C123916a(C123949b bVar, C50690ab abVar, C52560wg wgVar) {
        this.f342271a = bVar;
        this.f342272b = abVar;
        this.f342273c = wgVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C51058ev evVar;
        C123949b bVar = this.f342271a;
        C50690ab abVar = this.f342272b;
        C52560wg wgVar = this.f342273c;
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
            return Optional.m71637of(evVar.f132944b);
        }
        List i = C58869cf.m90936b(new C58903m('|')).mo56152f(C58911u.f156751b).mo56151a().mo56155i(wgVar.f137952h);
        if (i.isEmpty()) {
            ((C58970a) ((C58970a) bVar.f342355a.mo56226d()).mo56372aa(35297)).mo56386p("Deezer item has no media id");
            return Optional.empty();
        } else if (i.size() > 2) {
            ((C58970a) ((C58970a) bVar.f342355a.mo56226d()).mo56372aa(35296)).mo56389s("Deezer item invalid format: %s", wgVar.f137952h);
            return Optional.empty();
        } else {
            String str = wgVar.f137952h;
            return Optional.m71637of((String) C58557jl.m90131l(i));
        }
    }
}

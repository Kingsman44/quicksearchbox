package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.cf */
/* compiled from: PG */
public final class C138458cf implements C138495y {

    /* renamed from: a */
    private static final C58974d f376624a = C58974d.m91136j();

    /* renamed from: b */
    private final String f376625b;

    public C138458cf(String str) {
        this.f376625b = str;
    }

    /* renamed from: a */
    public final void mo114276a(C138133o oVar, Map map) {
        for (String split : C58869cf.m90936b(new C58903m('&')).mo56151a().mo56152f(C58911u.f156751b).mo56155i(this.f376625b)) {
            String[] split2 = split.split("=", 2);
            if (split2.length != 2) {
                ((C58970a) ((C58970a) f376624a.mo56226d()).mo56372aa(41233)).mo56386p("Illegal extra query parameter, please follow the format a=b&c=d");
            } else {
                map.put(split2[0], split2[1]);
            }
        }
    }

    /* renamed from: b */
    public final int mo114277b(C138133o oVar) {
        return oVar.f375825b.length() > 100 ? 2 : 1;
    }
}

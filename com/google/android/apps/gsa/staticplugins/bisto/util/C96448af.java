package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4591e.p4592a.p4594b.p4595a.C61017a;
import com.google.p4591e.p4592a.p4594b.p4596b.C61022a;
import com.google.p4591e.p4592a.p4594b.p4596b.C61023b;
import com.google.p4591e.p4592a.p4594b.p4596b.C61024c;
import com.google.p4591e.p4592a.p4594b.p4596b.C61026e;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.af */
/* compiled from: PG */
public final class C96448af {

    /* renamed from: a */
    public static final C59071e f269824a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.af");

    /* renamed from: a */
    public static C61024c m159802a(String str) {
        try {
            return C61023b.m93323a(str, C61017a.f165234a, C61022a.class, C61026e.class);
        } catch (IOException | IllegalArgumentException e) {
            C59104x c = f269824a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JwtParser");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17148)).mo56386p("Couldn't parse JWT");
            return null;
        }
    }

    /* renamed from: b */
    public static Map m159803b(C61026e eVar, String str) {
        Object obj = eVar.get(str);
        if (obj != null && !C58837ba.m90859h(obj.toString())) {
            try {
                return C90772bp.m148315w(obj.toString());
            } catch (IllegalStateException e) {
                C59104x c = f269824a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "JwtParser");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17149)).mo56389s("Couldn't parse %s", str);
            }
        }
        return null;
    }
}

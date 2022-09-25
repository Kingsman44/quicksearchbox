package com.google.android.apps.gsa.opa.smartspace;

import com.google.assistant.p3886c.C50794cr;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.g */
/* compiled from: PG */
public final class C83788g {

    /* renamed from: a */
    private static final C59071e f228365a = C59071e.m91332i("com.google.android.apps.gsa.opa.smartspace.g");

    /* renamed from: b */
    private final Map f228366b;

    public C83788g(Map map) {
        this.f228366b = map;
    }

    /* renamed from: a */
    public final C58833ax mo77136a(C50794cr crVar) {
        if (this.f228366b.containsKey(crVar)) {
            return C58833ax.m90834k((C83805u) ((C69464a) this.f228366b.get(crVar)).mo17428b());
        }
        ((C59052c) ((C59052c) f228365a.mo56226d()).mo56372aa(6810)).mo56387q("Controller of feature type: %d is not defined", crVar.f132222T);
        return C58836b.f156633a;
    }
}

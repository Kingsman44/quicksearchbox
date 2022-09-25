package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.p7037e.C89720f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ay */
/* compiled from: PG */
public final class C114801ay {

    /* renamed from: a */
    private static final C59071e f318548a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ay");

    /* renamed from: b */
    private final Context f318549b;

    /* renamed from: c */
    private final C89720f f318550c;

    /* renamed from: d */
    private final C87571n f318551d;

    /* renamed from: e */
    private final C86124t f318552e;

    public C114801ay(Context context, C89720f fVar, C87571n nVar, C86124t tVar) {
        this.f318549b = context;
        this.f318550c = fVar;
        this.f318551d = nVar;
        this.f318552e = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo101604a(String str) {
        Intent intent = new Intent();
        if (this.f318552e.mo79746e(C90014bt.f247287eM)) {
            intent = this.f318551d.mo81695b(this.f318549b, str, (C60218r) null);
        } else {
            intent.setAction("android.intent.action.VIEW");
            intent.setClassName(this.f318549b, "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivity");
            intent.setFlags(268468224);
            intent.putExtra("opa_zero_state_deep_link_url", str);
        }
        if (intent != null) {
            return this.f318550c.mo83611a(this.f318549b.getResources().getString(R.string.snapshot_product_name), BitmapFactory.decodeResource(this.f318549b.getResources(), R.drawable.snapshot_app_icon), intent);
        }
        C59104x d = f318548a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ZSHomescreenShortcut");
        ((C59052c) ((C59052c) d).mo56372aa(29567)).mo56386p("#createHomescreenShortcut(): failed to build launch intent");
        return C60856cj.m92900i(false);
    }

    /* renamed from: b */
    public final void mo101605b(C91097g gVar) {
        gVar.mo65089a(new Intent("android.intent.action.MAIN").addFlags(268435456).addCategory("android.intent.category.HOME"));
    }
}

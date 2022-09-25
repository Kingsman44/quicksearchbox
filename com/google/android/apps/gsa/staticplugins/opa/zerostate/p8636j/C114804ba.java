package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.assistant.p3994s.p3995a.C53286ig;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ba */
/* compiled from: PG */
public final class C114804ba {

    /* renamed from: a */
    private static final C59071e f318554a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ba");

    /* renamed from: b */
    private final Context f318555b;

    /* renamed from: c */
    private final Activity f318556c;

    /* renamed from: d */
    private final C86124t f318557d;

    public C114804ba(Context context, Activity activity, C86124t tVar) {
        this.f318555b = context;
        this.f318556c = activity;
        this.f318557d = tVar;
    }

    /* renamed from: a */
    public final void mo101607a(C53287ih ihVar) {
        if (this.f318557d.mo79746e(C90080ee.f249809h)) {
            C58485gu o = this.f318557d.mo79749o(C90080ee.f249804c);
            int b = C53286ig.m86808b(ihVar.f139703i);
            if (b == 0) {
                b = 1;
            }
            if (!o.contains(Integer.valueOf(b - 1))) {
                String x = this.f318557d.mo79758x(C90080ee.f249805d);
                Toast.makeText(this.f318555b, x, 0).show();
                C59104x c = f318554a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ZSEntryPointChecker");
                ((C59052c) ((C59052c) c).mo56372aa(29569)).mo56389s("#checkDeeplinkUseCaseEligibility(): %s", x);
                this.f318556c.finish();
            }
        }
    }
}

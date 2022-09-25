package com.google.android.apps.gsa.staticplugins.nga.p8092ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7129r.C90471m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.FeedbackEmptyActivity */
/* compiled from: PG */
public class FeedbackEmptyActivity extends C104152d implements C90471m {

    /* renamed from: a */
    public C104148b f289685a;

    /* renamed from: b */
    public C90465g f289686b;

    static {
        C58974d.m91134h("FeedbackEmptyActivity");
    }

    /* renamed from: b */
    public static void m172100b(Context context) {
        Intent intent = new Intent(context, FeedbackEmptyActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: e */
    private final void m172101e() {
        C104148b bVar = this.f289685a;
        C90464f a = this.f289686b.mo84210a(this);
        C104151c cVar = (C104151c) bVar.f289702a.mo17428b();
        cVar.getClass();
        C86124t tVar = (C86124t) bVar.f289703b.mo17428b();
        tVar.getClass();
        boolean e = tVar.mo79746e(C90126fx.f251683nT);
        C90461c cVar2 = new C90461c();
        cVar2.f252699k = false;
        cVar2.f252700l = e;
        cVar2.f252693e = tVar.mo79746e(C90014bt.f247382gB) ? tVar.mo79758x(C90014bt.f247383gC) : "com.google.android.googlequicksearchbox.NGA_FEEDBACK_CATEGORY";
        C58485gu guVar = cVar.f289707a;
        cVar.f289707a = C58485gu.m89845m();
        if (!guVar.isEmpty()) {
            cVar2.mo84203iI(guVar);
        }
        a.mo84209b(cVar2, 1);
    }

    /* renamed from: a */
    public final void mo84220a() {
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.af);
        super.onCreate(bundle);
        m172101e();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m172101e();
    }
}

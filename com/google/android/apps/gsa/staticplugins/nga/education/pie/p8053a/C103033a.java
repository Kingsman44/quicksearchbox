package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8053a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80257l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80259n;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui.C103143bf;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui.C103148bk;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui.C103149bl;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui.C103152bo;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui.C103153bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.a.a */
/* compiled from: PG */
public final /* synthetic */ class C103033a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C103035c f287635a;

    /* renamed from: b */
    public final /* synthetic */ C80257l f287636b;

    public /* synthetic */ C103033a(C103035c cVar, C80257l lVar) {
        this.f287635a = cVar;
        this.f287636b = lVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C80244ck ckVar;
        C80244ck ckVar2;
        C80244ck ckVar3;
        C80244ck ckVar4;
        C103035c cVar = this.f287635a;
        C80257l lVar = this.f287636b;
        C83357g gVar = cVar.f287642d;
        if (lVar.f220194a == 1) {
            ckVar = (C80244ck) lVar.f220195b;
        } else {
            ckVar = C80244ck.f220137i;
        }
        gVar.mo76660b(ckVar);
        if (lVar.f220194a == 1) {
            ckVar2 = (C80244ck) lVar.f220195b;
        } else {
            ckVar2 = C80244ck.f220137i;
        }
        C80246cm a = C80246cm.m128102a(ckVar2.f220140b);
        if (a == null) {
            a = C80246cm.NO_UI;
        }
        if (a != C80246cm.MULTISTEP_EDUCATION) {
            if (lVar.f220194a == 1) {
                ckVar3 = (C80244ck) lVar.f220195b;
            } else {
                ckVar3 = C80244ck.f220137i;
            }
            C80246cm a2 = C80246cm.m128102a(ckVar3.f220140b);
            if (a2 == null) {
                a2 = C80246cm.NO_UI;
            }
            if (a2 != C80246cm.NO_UI) {
                C103143bf.m171041h(cVar.f287639a);
            }
            return C80259n.f220196a;
        } else if (cVar.f287640b.mo79746e(C90037cp.f248450ae)) {
            C89949q.m146523g(130226);
            return C80259n.f220196a;
        } else {
            if (cVar.f287640b.mo79746e(C90037cp.f248449ad)) {
                C103153bp bpVar = cVar.f287641c;
                bpVar.f287869h = new C103034b(cVar);
                if (lVar.f220194a == 1) {
                    ckVar4 = (C80244ck) lVar.f220195b;
                } else {
                    ckVar4 = C80244ck.f220137i;
                }
                String str = ckVar4.f220146h;
                bpVar.f287868g = Optional.ofNullable(bpVar.f287863b.mo65338a());
                if (!bpVar.f287868g.isEmpty() && !((String) bpVar.f287868g.get()).equals("com.google.android.apps.nexuslauncher") && !((String) bpVar.f287868g.get()).equals("com.google.android.apps.gsa.staticplugins.nga.vis.AssistUi") && !((String) bpVar.f287868g.get()).equals("com.google.android.googlequicksearchbox") && !((String) bpVar.f287868g.get()).equals(str)) {
                    bpVar.f287867f = Optional.m71637of(((LayoutInflater) bpVar.f287862a.getSystemService("layout_inflater")).inflate(R.layout.nga_pie_multi_step_overlay_window, (ViewGroup) null));
                    if (!bpVar.f287867f.isEmpty()) {
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2038, 263208, -3);
                        C103152bo boVar = new C103152bo(bpVar);
                        layoutParams.gravity = 80;
                        C28292j jVar = new C28292j(126807);
                        jVar.mo33795i(5);
                        C28295m.m52919e((View) bpVar.f287867f.get(), jVar);
                        ((View) bpVar.f287867f.get()).findViewById(R.id.multi_step_overlay_button).setOnClickListener(new C103148bk(bpVar, boVar));
                        ((View) bpVar.f287867f.get()).findViewById(R.id.multi_step_overlay_cancel_button).setOnClickListener(new C103149bl(bpVar, boVar));
                        bpVar.f287864c.addView((View) bpVar.f287867f.get(), layoutParams);
                        ((View) bpVar.f287867f.get()).animate().translationY(0.0f).setDuration(500).alpha(1.0f).start();
                        C89949q.m146521e(C28285c.m52874a((View) bpVar.f287867f.get(), 130226), false);
                        bpVar.f287863b.mo65339b(boVar);
                    }
                }
            }
            return C80259n.f220196a;
        }
    }
}

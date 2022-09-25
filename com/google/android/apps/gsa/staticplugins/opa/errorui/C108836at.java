package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assist.p506e.C9408a;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84027v;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6465b.C83986b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.at */
/* compiled from: PG */
public final class C108836at extends C83907bm {

    /* renamed from: t */
    public static final /* synthetic */ int f302614t = 0;

    /* renamed from: b */
    public boolean f302615b = false;

    /* renamed from: c */
    public C86054o f302616c;

    /* renamed from: d */
    public C86124t f302617d;

    /* renamed from: e */
    public SharedPreferences f302618e;

    /* renamed from: f */
    public l f302619f;

    /* renamed from: g */
    public C9388a f302620g;

    /* renamed from: h */
    public C9408a f302621h;

    /* renamed from: i */
    public ComponentName f302622i;

    /* renamed from: j */
    public C108887cq f302623j;

    /* renamed from: k */
    public C22871g f302624k;

    /* renamed from: l */
    public C108899db f302625l;

    /* renamed from: m */
    public C68214a f302626m;

    /* renamed from: n */
    public C92486a f302627n;

    /* renamed from: o */
    public C89994f f302628o;

    /* renamed from: p */
    public boolean f302629p;

    /* renamed from: q */
    public C58833ax f302630q;

    /* renamed from: r */
    public Boolean f302631r = false;

    /* renamed from: s */
    public C104149a f302632s;

    /* renamed from: e */
    public static C83986b m181034e(Context context, int i, int i2, String str, String str2, C58833ax axVar, boolean z) {
        C83986b bVar = new C83986b(context);
        bVar.setId(i);
        bVar.mo77422a().setImageResource(i2);
        bVar.mo77424c(str);
        bVar.mo77425d(str2, axVar);
        bVar.f228785a.setChecked(z);
        return bVar;
    }

    /* renamed from: i */
    public static void m181035i(C58480gp gpVar, Object obj) {
        if (obj != null) {
            gpVar.mo55395g(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: g */
    public final C83986b mo97210g(int i) {
        return (C83986b) getView().findViewById(i);
    }

    /* renamed from: h */
    public final String mo97211h() {
        if (this.f302628o.mo83834w()) {
            return this.f302627n.mo87231e(Locale.getDefault().toString());
        }
        return this.f302627n.mo87230d();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C60870cx cxVar;
        Context context = LayoutInflater.from(C84027v.m133919a(this.f302632s, layoutInflater.getContext(), this.f302629p)).getContext();
        OpaPageLayout opaPageLayout = new OpaPageLayout(context);
        C28295m.m52919e(opaPageLayout, new C28292j(51527));
        opaPageLayout.mo77370b(R.layout.get_more_content);
        opaPageLayout.findViewById(R.id.opa_error_message).setFocusable(false);
        C9439b a = C9439b.m23955a(((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getInt("enrollment_entry_id", 0));
        C22871g gVar = this.f302624k;
        if (!this.f302617d.mo79746e(C90053de.f248940G) || !this.f302630q.mo56113h()) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = C60922j.m93044g(((C9799ae) this.f302630q.mo56107c()).mo18041a(), C108832ap.f302605a, C60826bg.f164896a);
        }
        gVar.mo28211k(cxVar, "fetch AOL", new C108833aq(this, opaPageLayout, layoutInflater, context, a));
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(1);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C108830an(this)));
        return opaPageLayout;
    }
}

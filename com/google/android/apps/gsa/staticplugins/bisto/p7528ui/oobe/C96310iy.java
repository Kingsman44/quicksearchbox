package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6461c.C83912c;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142338bq;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58831av;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.iy */
/* compiled from: PG */
public final class C96310iy extends C96363kx {

    /* renamed from: b */
    public static final C59071e f269501b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.iy");

    /* renamed from: c */
    public C96325jm f269502c;

    /* renamed from: d */
    public C83912c f269503d;

    /* renamed from: e */
    public String f269504e;

    /* renamed from: f */
    public C68214a f269505f;

    /* renamed from: g */
    public C96094ay f269506g;

    /* renamed from: h */
    public C91090a f269507h;

    /* renamed from: i */
    public Toast f269508i;

    /* renamed from: j */
    public boolean f269509j;

    /* renamed from: k */
    private LegacyOpaStandardPage f269510k;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "NotificationAccessPrimer";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2 = null;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.request_notification_access, (ViewGroup) null);
        this.f269510k = legacyOpaStandardPage;
        if (legacyOpaStandardPage != null) {
            C96097ba baVar = this.f269502c.f269538a;
            C142340bs bsVar = baVar.f269047b.f386119e;
            if (bsVar == null) {
                bsVar = C142340bs.f386174C;
            }
            C142338bq bqVar = bsVar.f386194q;
            if (bqVar == null) {
                bqVar = C142338bq.f386166g;
            }
            C142355cg cgVar = bqVar.f386169b;
            if (cgVar == null) {
                cgVar = C142355cg.f386263b;
            }
            String f = C124525f.m203990f(cgVar.f386265a);
            if (C58837ba.m90859h(f)) {
                f = baVar.f269046a.getResources().getString(R.string.not_access_screen_title);
            }
            HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
            C84018m.m133908c(headerLayout.f228718a, f, TextView.BufferType.NORMAL, headerLayout);
            LegacyOpaStandardPage legacyOpaStandardPage2 = this.f269510k;
            C96097ba baVar2 = this.f269502c.f269538a;
            C142340bs bsVar2 = baVar2.f269047b.f386119e;
            if (bsVar2 == null) {
                bsVar2 = C142340bs.f386174C;
            }
            C142338bq bqVar2 = bsVar2.f386194q;
            if (bqVar2 == null) {
                bqVar2 = C142338bq.f386166g;
            }
            C142355cg cgVar2 = bqVar2.f386171d;
            if (cgVar2 == null) {
                cgVar2 = C142355cg.f386263b;
            }
            String f2 = C124525f.m203990f(cgVar2.f386265a);
            if (C58837ba.m90859h(f2)) {
                f2 = baVar2.f269046a.getResources().getString(R.string.not_access_screen_explanation);
            }
            HeaderLayout headerLayout2 = legacyOpaStandardPage2.f228723b;
            C84018m.m133908c(headerLayout2.f228719b, f2, TextView.BufferType.NORMAL, headerLayout2);
            this.f269510k.f228725d.mo77360a().setOnClickListener(new C96306iu(this));
            this.f269510k.f228725d.mo77361b().setOnClickListener(new C96307iv(this));
            this.f269510k.f228725d.mo77361b().setText(R.string.not_access_screen_cancel_button);
            if ("wired".equals(this.f269506g.f269039a)) {
                str = "https://www.gstatic.com/bisto/oobe/hear_notifs/index.html";
            } else {
                str = this.f269502c.f269538a.mo89957h();
            }
            C96153dc dcVar = new C96153dc(this.f269510k, new C96308iw(this), R.string.not_access_screen_content_description);
            if (!C58837ba.m90859h(str)) {
                dcVar.mo89991a(this.f269510k.f228724c.f228893p, str, C58836b.f156633a);
                this.f269510k.f228724c.f228893p.setBackgroundColor(0);
            }
        }
        Activity activity = getActivity();
        Activity activity2 = getActivity();
        Object[] objArr = new Object[1];
        String packageName = getActivity().getPackageName();
        PackageManager packageManager = getActivity().getPackageManager();
        try {
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0));
            if (applicationLabel != null) {
                str2 = applicationLabel.toString();
            }
        } catch (PackageManager.NameNotFoundException e) {
            C59104x d = f269501b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifAccessFrag");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17051)).mo56389s("no package for app: %s", packageName);
        }
        objArr[0] = C58831av.m90830c(str2, "Google");
        this.f269508i = Toast.makeText(activity, activity2.getString(R.string.not_access_toast, objArr), 1);
        return this.f269510k;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f269503d.mo77328b(new C96305it(this));
        this.f269508i.cancel();
    }

    public final void onResume() {
        super.onResume();
        this.f269503d.mo77328b(new C96305it(this));
        this.f269508i.cancel();
        if (this.f269509j) {
            C58976aa aaVar = C58975e.f156826a;
            ((C95299e) this.f269603D.mo27525b()).f266647b.mo57066b("NotificationAccessPrimerReturn");
            this.f269509j = false;
        }
    }
}

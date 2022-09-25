package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C1831r;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.bisto.C89623au;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89486by;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60094kn;
import com.google.common.p4552o.C60096kp;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.ay */
/* compiled from: PG */
public final class C96467ay implements C89623au {

    /* renamed from: a */
    public static final C59071e f269867a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.ay");

    /* renamed from: b */
    public static final C58528ij f269868b = C58528ij.m90012L("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_LAUNCH_SETTINGS", "com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_NEGATIVE", "com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_DISMISS");

    /* renamed from: c */
    public final Context f269869c;

    /* renamed from: d */
    public final C68214a f269870d;

    /* renamed from: e */
    public final C84516aa f269871e;

    /* renamed from: f */
    public final NotificationManager f269872f;

    /* renamed from: g */
    public final C68214a f269873g;

    /* renamed from: h */
    public final C89656k f269874h;

    /* renamed from: i */
    public C96466ax f269875i;

    /* renamed from: j */
    private final C96470ba f269876j;

    /* renamed from: k */
    private final C95307m f269877k;

    /* renamed from: l */
    private final Executor f269878l;

    /* renamed from: m */
    private final C68214a f269879m;

    public C96467ay(Context context, C68214a aVar, C96470ba baVar, C84516aa aaVar, Executor executor, C68214a aVar2, C68214a aVar3, C89656k kVar, C95307m mVar) {
        this.f269869c = context;
        this.f269870d = aVar;
        this.f269876j = baVar;
        this.f269872f = (NotificationManager) context.getSystemService("notification");
        this.f269877k = mVar;
        this.f269871e = aaVar;
        this.f269878l = executor;
        this.f269879m = aVar2;
        this.f269873g = aVar3;
        this.f269874h = kVar;
    }

    /* renamed from: m */
    private final void m159833m(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C60856cj.m92903l(new C96465aw(this, str), C60826bg.f164896a);
    }

    /* renamed from: n */
    private final void m159834n(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx a = C89486by.m145643a(this.f269878l, (C89496ch) this.f269879m.mo27525b());
        C96463au auVar = new C96463au(this, str);
        C60922j.m93044g(a, C47810es.m84963c(auVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo83494a() {
        int a = this.f269876j.mo90164a(false);
        if (a == 1) {
            C59104x b = f269867a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PRNotifHelper");
            ((C59052c) ((C59052c) b).mo56372aa(17183)).mo56386p("Post PR");
            m159834n("pr_notification");
        } else if (a == 2) {
            C59104x b2 = f269867a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "PRNotifHelper");
            ((C59052c) ((C59052c) b2).mo56372aa(17182)).mo56386p("Post HPR");
            m159834n("hpr_notification");
        } else {
            C59104x b3 = f269867a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "PRNotifHelper");
            ((C59052c) ((C59052c) b3).mo56372aa(17181)).mo56387q("Not posting perm=%d", a);
        }
    }

    /* renamed from: b */
    public final void mo83495b() {
        int a = this.f269876j.mo90164a(false);
        if (a == 1) {
            C59104x b = f269867a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PRNotifHelper");
            ((C59052c) ((C59052c) b).mo56372aa(17186)).mo56386p("Post PR notification for non-Bisto");
            m159833m("pr_notification");
        } else if (a == 2) {
            C59104x b2 = f269867a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "PRNotifHelper");
            ((C59052c) ((C59052c) b2).mo56372aa(17185)).mo56386p("Post HPR notification for non-Bisto");
            m159833m("hpr_notification");
        } else {
            C59104x b3 = f269867a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "PRNotifHelper");
            ((C59052c) ((C59052c) b3).mo56372aa(17184)).mo56387q("Not posting perm=%d for non-Bisto", a);
        }
    }

    /* renamed from: c */
    public final Notification mo90153c(C124548d dVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        Context context = this.f269869c;
        C1839z b = C96460ar.m159822b(context, String.format(context.getString(R.string.gacs_pr_request_notification_title), new Object[]{dVar.mo106476Q()}), this.f269869c.getString(R.string.gacs_pr_request_notification_content), C96460ar.f269856c, C58833ax.m90834k(C124719q.GACS_DEVICE));
        b.f5687g = pendingIntent;
        b.f5679J.deleteIntent = pendingIntent3;
        b.mo5017f(new C1831r(0, this.f269869c.getString(R.string.pr_request_settings_button), pendingIntent).mo5008a());
        b.f5687g = pendingIntent;
        b.mo5017f(new C1831r(0, this.f269869c.getString(R.string.pr_request_no_thanks_button), pendingIntent2).mo5008a());
        b.f5671B = 0;
        b.f5702v = true;
        b.mo5015d(16, true);
        return b.mo5013a();
    }

    /* renamed from: d */
    public final PendingIntent mo90154d(Intent intent, String str) {
        return PendingIntent.getActivity(this.f269869c, str.hashCode(), C147798a.m240896b(intent, 1275068416, 0), 1275068416);
    }

    /* renamed from: e */
    public final PendingIntent mo90155e() {
        Intent intent = new Intent();
        intent.setClassName(this.f269869c, "com.google.android.apps.gsa.staticplugins.bisto.BistoRealService");
        intent.setAction("action_handle_hpr_allow");
        return C147798a.m240897c(this.f269869c, 0, intent, 1140850688);
    }

    /* renamed from: f */
    public final PendingIntent mo90156f(Intent intent) {
        return PendingIntent.getBroadcast(this.f269869c, 0, intent, 201326592);
    }

    /* renamed from: g */
    public final Intent mo90157g(String str, C124548d dVar, String str2) {
        return new Intent().setComponent(new ComponentName(this.f269869c, "com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.PersonalResultsNotificationActivity")).putExtra("extra_notification_type", str).putExtra("extra_action_type", str2).putExtra("extra_model_id", dVar.mo106481V()).addFlags(268468224);
    }

    /* renamed from: h */
    public final Intent mo90158h(String str, String str2) {
        return new Intent().setComponent(new ComponentName(this.f269869c, "com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.PersonalResultsNotificationActivity")).putExtra("extra_notification_type", str).putExtra("extra_action_type", str2).putExtra("extra_is_non_bisto", true).addFlags(268468224);
    }

    /* renamed from: i */
    public final String mo90159i(String str) {
        if (str.equals("pr_notification")) {
            return this.f269869c.getString(R.string.pr_request_settings_button);
        }
        return this.f269869c.getString(R.string.hpr_request_allow_button);
    }

    /* renamed from: j */
    public final String mo90160j(String str) {
        if (str.equals("pr_notification")) {
            return this.f269869c.getString(R.string.pr_request_notification_content);
        }
        return this.f269869c.getString(R.string.hpr_request_notification_content);
    }

    /* renamed from: k */
    public final String mo90161k(String str) {
        if (str.equals("pr_notification")) {
            return this.f269869c.getString(R.string.pr_request_notification_title);
        }
        return this.f269869c.getString(R.string.hpr_request_notification_title);
    }

    /* renamed from: l */
    public final void mo90162l(int i) {
        C60094kn knVar = (C60094kn) C60096kp.f162493d.createBuilder();
        knVar.copyOnWrite();
        C60096kp kpVar = (C60096kp) knVar.instance;
        kpVar.f162497c = 4;
        kpVar.f162495a |= 2;
        knVar.copyOnWrite();
        C60096kp kpVar2 = (C60096kp) knVar.instance;
        kpVar2.f162496b = i - 1;
        kpVar2.f162495a |= 1;
        C60096kp kpVar3 = (C60096kp) knVar.build();
        C95307m mVar = this.f269877k;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        kpVar3.getClass();
        nmVar.f163171y = kpVar3;
        nmVar.f163148b |= 128;
        mVar.mo83545c(nkVar);
    }
}

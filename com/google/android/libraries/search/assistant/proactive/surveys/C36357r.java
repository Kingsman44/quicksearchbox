package com.google.android.libraries.search.assistant.proactive.surveys;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.p104d.p105a.C2169h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.C43025b;
import com.google.android.libraries.surveys.C43171l;
import com.google.android.libraries.surveys.SurveyData;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.r */
/* compiled from: PG */
public final class C36357r implements C36348i {

    /* renamed from: e */
    private static final C59071e f94954e = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.surveys.r");

    /* renamed from: a */
    final Context f94955a;

    /* renamed from: b */
    final C36358s f94956b;

    /* renamed from: c */
    final Executor f94957c;

    /* renamed from: d */
    final Executor f94958d;

    public C36357r(Context context, C36358s sVar, Executor executor, Executor executor2, C69464a aVar) {
        this.f94955a = context;
        this.f94956b = sVar;
        this.f94957c = executor;
        this.f94958d = executor2;
        C43171l.m76145c(context, (CronetEngine) aVar.mo17428b());
    }

    /* renamed from: f */
    private final C60870cx m64871f(Account account, String str) {
        C58976aa aaVar = C58975e.f156826a;
        return C2169h.m6027a(new C36349j(this, str, account));
    }

    /* renamed from: a */
    public final Intent mo40129a(Context context, AccountId accountId, String str, String str2, String str3, byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent(context, SurveyDialogParentActivity.class);
        intent.putExtra("survey-trigger-id", str);
        intent.putExtra("grouping-key", str2);
        intent.putExtra("ved", str3);
        intent.putExtra("notification-logging-metadata", bArr);
        intent.setFlags(268435456);
        if (accountId != null) {
            C45963aa.m82131a(intent, accountId);
        }
        intent.toURI();
        return intent;
    }

    /* renamed from: b */
    public final void mo40130b(Account account, String str) {
        m64871f(account, str);
    }

    /* renamed from: c */
    public final void mo40131c(Account account, String str, Activity activity, List list) {
        Optional optional;
        C58976aa aaVar = C58975e.f156826a;
        if (account != null) {
            String str2 = account.name;
        }
        SurveyData surveyData = (SurveyData) this.f94956b.f94959a.get(str);
        if (surveyData != null) {
            optional = Optional.m71637of(surveyData);
        } else {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            mo40137e(account, activity, (SurveyData) optional.get(), list);
            return;
        }
        C60870cx q = C60856cj.m92908q(m64871f(account, str), 3000, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f94957c);
        C36353n nVar = new C36353n(this, account, activity, list);
        C60856cj.m92911t(q, C47810es.m84974n(nVar), this.f94958d);
    }

    /* renamed from: d */
    public final void mo40136d(Activity activity) {
        Toast makeText = Toast.makeText(this.f94955a, R.string.opa_notifications_feedback_response_message, 0);
        makeText.setGravity(49, 0, 0);
        makeText.show();
        activity.finish();
    }

    /* renamed from: e */
    public final void mo40137e(Account account, Activity activity, SurveyData surveyData, List list) {
        C59104x d = f94954e.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NotificationHatsDlgt");
        ((C59052c) ((C59052c) d).mo56372aa(52307)).mo56389s("presentSurvey, triggerId: %s", surveyData.mo46048a().f112515a);
        C36356q qVar = new C36356q(this, activity);
        C43025b bVar = new C43025b(activity, surveyData);
        bVar.mo46052b(R.id.prompt_parent_sheet, 500);
        bVar.f112520b = account;
        bVar.f112519a = qVar;
        bVar.f112521c = list;
        C43171l.m75929a(bVar.mo46051a());
    }
}

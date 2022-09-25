package com.google.android.apps.search.assistant.verticals.reminders.p10078d;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.assistant.verticals.reminders.p10074a.C132538a;
import com.google.android.apps.search.assistant.verticals.reminders.p10074a.C132539b;
import com.google.android.apps.search.assistant.verticals.reminders.p10074a.C132540c;
import com.google.android.libraries.search.p2476a.p2477a.C32151a;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.d.a */
/* compiled from: PG */
final class C132550a implements C47506l {

    /* renamed from: a */
    private final C132539b f361729a;

    /* renamed from: b */
    private final Uri f361730b;

    public C132550a(Uri uri) {
        this.f361729a = C132539b.SHORTCUT.f361717d.equals(uri.getQueryParameter("source")) ? C132539b.SHORTCUT : C132539b.UNKNOWN;
        this.f361730b = uri;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo20002a() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo20003b() {
        return 0;
    }

    /* renamed from: c */
    public final C58833ax mo20004c() {
        return C32151a.m59928d(C58485gu.m89845m());
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        String path = this.f361730b.getPath();
        path.getClass();
        if (path.startsWith("/reminders/move")) {
            C58833ax axVar = C58836b.f156633a;
            C58833ax k = this.f361730b.getQueryParameter("openDialog") != null ? C58833ax.m90834k(Boolean.valueOf(Boolean.parseBoolean(this.f361730b.getQueryParameter("openDialog")))) : axVar;
            if (this.f361730b.getQueryParameter("consentFlowVariant") != null) {
                String queryParameter = this.f361730b.getQueryParameter("consentFlowVariant");
                queryParameter.getClass();
                axVar = C58833ax.m90834k(queryParameter);
            }
            Intent putExtra = C132540c.m215468a().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.verticals.reminders.home.HomeActivity").putExtra("MOVE_URL", true);
            if (k.mo56113h()) {
                putExtra.putExtra("OPEN_DIALOG_PARAM", Boolean.toString(((Boolean) k.mo56107c()).booleanValue()));
            }
            if (axVar.mo56113h()) {
                putExtra.putExtra("CONSENT_FLOW_VARIANT", (String) axVar.mo56107c());
            }
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(putExtra));
        }
        Intent b = C132540c.m215469b();
        C132538a.m215467b(this.f361729a, b);
        String path2 = this.f361730b.getPath();
        path2.getClass();
        if (path2.startsWith("/reminders/id")) {
            String lastPathSegment = this.f361730b.getLastPathSegment();
            lastPathSegment.getClass();
            if (!TextUtils.isEmpty(lastPathSegment)) {
                b.putExtra("REMINDER_ID", lastPathSegment);
            }
        }
        if (this.f361730b.getQueryParameter("expected_client_id") != null) {
            String queryParameter2 = this.f361730b.getQueryParameter("expected_client_id");
            queryParameter2.getClass();
            if (!TextUtils.isEmpty(queryParameter2)) {
                b.putExtra("EXPECTED_CLIENT_ID", queryParameter2);
            }
        }
        if (this.f361730b.getQueryParameter("hl") != null) {
            String queryParameter3 = this.f361730b.getQueryParameter("hl");
            queryParameter3.getClass();
            C132538a.m215466a(queryParameter3, b);
        }
        if (this.f361730b.getQueryParameter("consentFlowVariant") != null) {
            String queryParameter4 = this.f361730b.getQueryParameter("consentFlowVariant");
            queryParameter4.getClass();
            if (!TextUtils.isEmpty(queryParameter4)) {
                b.putExtra("CONSENT_FLOW_VARIANT", queryParameter4);
            }
        }
        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(b));
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}

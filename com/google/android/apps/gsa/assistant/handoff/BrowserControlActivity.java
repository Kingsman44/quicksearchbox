package com.google.android.apps.gsa.assistant.handoff;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.shared.C73911t;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import java.util.Locale;

/* compiled from: PG */
public class BrowserControlActivity extends C9452ai {

    /* renamed from: a */
    public static final C59071e f32851a = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.BrowserControlActivity");

    /* renamed from: b */
    public C73911t f32852b;

    /* renamed from: c */
    public C86054o f32853c;

    /* renamed from: d */
    public C9449af f32854d;

    /* renamed from: b */
    private final void m23958b() {
        double d;
        try {
            d = (double) Settings.Global.getFloat(getContentResolver(), "transition_animation_scale");
        } catch (Settings.SettingNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f32851a.mo56226d()).mo56382g(e)).mo56372aa(235)).mo56386p("Transition animation scale is not available");
            d = 1.0d;
        }
        double integer = (double) getResources().getInteger(17694722);
        Double.isNaN(integer);
        double d2 = d * integer;
        new Handler().postDelayed(new C9480m(this), (long) (d2 + d2));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        C74504a.m120462a(f.c);
        super.onCreate(bundle);
        C9449af afVar = this.f32854d;
        if (bundle != null) {
            afVar.f32868a = C58833ax.m90833j(bundle.getString("browser_launched_url"));
            afVar.f32869b = bundle.getString("result_message_param", "result_message");
            z = bundle.getBoolean("display_result_message");
        } else {
            afVar.f32868a = C58836b.f156633a;
            afVar.f32869b = "result_message";
            z = false;
        }
        afVar.f32870c = z;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        if (!C9450ag.m23977c(intent.getData())) {
            this.f32854d.mo17695a(new Intent());
        }
        setIntent(intent);
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C58833ax axVar;
        super.onResume();
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (C9450ag.m23978d(data) || (!C9450ag.m23977c(data) && intent.hasExtra("uri"))) {
            if (C9450ag.m23979e(data)) {
                intent.putExtra("uri", data.getQueryParameter(C9450ag.m23976b()));
                String queryParameter = data.getQueryParameter("account_name");
                if (queryParameter != null) {
                    intent.putExtra("account_name", queryParameter);
                }
                String queryParameter2 = data.getQueryParameter("display_result_message");
                if (queryParameter2 != null) {
                    String lowerCase = queryParameter2.toLowerCase(Locale.US);
                    intent.putExtra("assistant_handoff_display_result_message_toast", lowerCase.equals("1") || lowerCase.equals("true"));
                }
            }
            String stringExtra = intent.getStringExtra("uri");
            if (this.f32854d.f32868a.mo56113h()) {
                if (((String) this.f32854d.f32868a.mo56107c()).equals(stringExtra)) {
                    m23958b();
                    return;
                }
                C59104x d = f32851a.mo56226d();
                C90476a aVar = C90754k.f253829b;
                C90476a aVar2 = C90754k.f253829b;
                ((C59052c) ((C59052c) d).mo56372aa(240)).mo56389s("Another URI being launched while one is active: %s", C90753j.m148239a(stringExtra));
            }
            this.f32854d.mo17695a(intent);
            C58833ax j = C58833ax.m90833j(intent.getStringExtra("account_name"));
            C58833ax j2 = C58833ax.m90833j(intent.getStringExtra("return_url_param"));
            if (!stringExtra.startsWith("http")) {
                C59104x d2 = f32851a.mo56226d();
                C90476a aVar3 = C90754k.f253829b;
                C90476a aVar4 = C90754k.f253829b;
                ((C59052c) ((C59052c) d2).mo56372aa(237)).mo56389s("Unsupported URI: %s", C90753j.m148239a(stringExtra));
                return;
            }
            Uri build = Uri.parse(stringExtra).buildUpon().appendQueryParameter((String) j2.mo56109e("return_url"), C9450ag.f32871a).build();
            if (j.mo56113h()) {
                axVar = C58833ax.m90833j(this.f32853c.mo79689w((String) j.mo56107c()));
            } else {
                axVar = C58836b.f156633a;
            }
            if (axVar.mo56113h()) {
                Toast.makeText(this, getString(R.string.assistant_handoff_auto_login_toast_text, new Object[]{j.mo56107c()}), 0).show();
                this.f32853c.mo79677k((Account) axVar.mo56107c(), build, (String) null, new C9479l(this));
            } else if (!this.f32852b.mo65444a(this, build)) {
                finish();
            }
        } else if (!this.f32854d.f32868a.mo56113h() || !C9450ag.m23977c(data)) {
            finish();
        } else {
            Intent data2 = new Intent().setData(data);
            String queryParameter3 = data.getQueryParameter("result_code");
            if (queryParameter3 != null) {
                data2.putExtra("assistant_handoff_result_code", queryParameter3);
                setResult(-1, data2);
            }
            String queryParameter4 = data.getQueryParameter(this.f32854d.f32869b);
            if (queryParameter4 != null) {
                data2.putExtra("assistant_handoff_result_message", queryParameter4);
                if (this.f32854d.f32870c) {
                    Toast.makeText(this, queryParameter4, 0).show();
                }
            }
            AssistantHandoffActivity.f32839b.set(C58833ax.m90834k(data2));
            m23958b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C9449af afVar = this.f32854d;
        if (afVar.f32868a.mo56113h()) {
            bundle.putString("browser_launched_url", (String) afVar.f32868a.mo56107c());
        }
        bundle.putString("result_message_param", afVar.f32869b);
        bundle.putBoolean("display_result_message", afVar.f32870c);
    }
}

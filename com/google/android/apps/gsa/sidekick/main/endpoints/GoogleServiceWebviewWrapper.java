package com.google.android.apps.gsa.sidekick.main.endpoints;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.webkit.WebView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.C90776bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class GoogleServiceWebviewWrapper extends C91294h {

    /* renamed from: a */
    public static final C59071e f254773a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.endpoints.GoogleServiceWebviewWrapper");

    /* renamed from: b */
    static final C58528ij f254774b = C58528ij.m90012L("mailto", "market", "tel");

    /* renamed from: c */
    public C90929bz f254775c;

    /* renamed from: d */
    public C86054o f254776d;

    /* renamed from: e */
    String[] f254777e;

    /* renamed from: f */
    volatile Uri f254778f;

    /* renamed from: g */
    WebView f254779g;

    /* renamed from: h */
    public boolean f254780h;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85562a(Uri uri) {
        C58976aa aaVar = C58975e.f156826a;
        startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    public final void onBackPressed() {
        if (this.f254779g.canGoBack()) {
            this.f254779g.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.J);
        super.onCreate(bundle);
        requestWindowFeature(2);
        setProgressBarVisibility(true);
        Intent intent = getIntent();
        if (intent == null || intent.getData() == null) {
            finish();
            C59104x d = f254773a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GoogleServiceWebviewWra");
            ((C59052c) ((C59052c) d).mo56372aa(11539)).mo56386p("Uri required");
            return;
        }
        String stringExtra = intent.hasExtra("webview_title") ? intent.getStringExtra("webview_title") : BuildConfig.FLAVOR;
        this.f254777e = intent.getStringArrayExtra("webview_url_prefixes");
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayOptions(4, 4);
            actionBar.setTitle(Html.fromHtml(stringExtra));
        }
        WebView b = C90776bt.m148328b(this);
        this.f254779g = b;
        b.getSettings().setSaveFormData(false);
        boolean booleanExtra = intent.getBooleanExtra("enable_javascript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enable_zoom_controls", true);
        this.f254779g.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f254779g.getSettings().setBuiltInZoomControls(booleanExtra2);
        this.f254779g.getSettings().setLoadWithOverviewMode(booleanExtra2);
        this.f254779g.getSettings().setDisplayZoomControls(false);
        this.f254779g.setWebViewClient(new C91291e(this));
        this.f254779g.setWebChromeClient(new C91289c(this));
        setContentView(this.f254779g);
        Uri data = intent.getData();
        String stringExtra2 = intent.hasExtra("webview_service") ? intent.getStringExtra("webview_service") : null;
        C58976aa aaVar = C58975e.f156826a;
        new C91290d(this, this.f254775c, data, stringExtra2).mo85242e(new Void[0]);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.f254780h = true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}

package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96498r;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4552o.C60101ku;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cs */
/* compiled from: PG */
public final class C96142cs extends C96363kx {

    /* renamed from: b */
    public C96089at f269154b;

    /* renamed from: c */
    private View f269155c;

    /* renamed from: g */
    private final String m159453g(String str) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        return arguments.getString(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "EducationalScreen";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f269155c = layoutInflater.inflate(R.layout.educational_screen, (ViewGroup) null);
        String g = m159453g("educational_title");
        if (!C58837ba.m90859h(g)) {
            TextView textView = (TextView) this.f269155c.findViewById(R.id.educational_view_title);
            textView.setText(g);
            textView.setVisibility(0);
        }
        String g2 = m159453g("educational_message");
        TextView textView2 = (TextView) this.f269155c.findViewById(R.id.educational_view_message);
        if (g2 != null) {
            textView2.setText(Html.fromHtml(g2));
        } else {
            textView2.setVisibility(8);
        }
        String g3 = m159453g("educational_url");
        String g4 = m159453g("educational_url_description");
        if (g3 != null) {
            WebView webView = (WebView) this.f269155c.findViewById(R.id.educational_view_webview);
            C96498r.m159874a(webView);
            new C96153dc((LegacyOpaStandardPage) null, (C68214a) null, 0).mo89991a(webView, g3, C58833ax.m90833j(g4));
            webView.setBackgroundColor(0);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
        }
        String g5 = m159453g("educational_extra_message");
        if (!C58837ba.m90859h(g5)) {
            TextView textView3 = (TextView) this.f269155c.findViewById(R.id.educational_view_extra_message);
            textView3.setText(g5);
            textView3.setVisibility(0);
        }
        Intent intent = (Intent) getArguments().getParcelable("educational_view_extra_action");
        String g6 = m159453g("educational_view_extra_action_description");
        int a = C60101ku.m92525a(getArguments().getInt("educational_view_extra_action_logging_event", 0));
        if (!(intent == null || g6 == null)) {
            Button button = (Button) this.f269155c.findViewById(R.id.educational_view_extra_action);
            button.setText(g6);
            button.setOnClickListener(new C89943l(new C96141cr(this, a, intent)));
            button.setVisibility(0);
        }
        return this.f269155c;
    }
}

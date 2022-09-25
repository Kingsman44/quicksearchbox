package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142320az;
import com.google.android.p10712d.C142346by;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.aa */
/* compiled from: PG */
public final class C96070aa extends C96363kx {

    /* renamed from: b */
    public static final C59071e f268978b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.aa");

    /* renamed from: c */
    public C96325jm f268979c;

    /* renamed from: d */
    private String f268980d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "AccountMismatch";
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        String string = arguments.getString("name");
        string.getClass();
        this.f268980d = string;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        opaPageLayout.mo77370b(R.layout.account_mismatch);
        String str = this.f268980d;
        str.getClass();
        ((TextView) opaPageLayout.findViewById(R.id.bisto_account_mismatch_message)).setText(Html.fromHtml(getString(R.string.bisto_account_mismatch_body, new Object[]{str})));
        FooterLayout footerLayout = opaPageLayout.f228726a;
        C142346by byVar = this.f268979c.f269538a.f269047b.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        C142320az azVar = byVar.f386226f;
        if (azVar == null) {
            azVar = C142320az.f386099j;
        }
        int i = azVar.f386101a;
        Intent intent = null;
        if (!((i & 4) == 0 || ((i & 128) == 0 && (i & 256) == 0))) {
            Intent intent2 = new Intent().setPackage(azVar.f386103c);
            if ((azVar.f386101a & 128) != 0) {
                intent2.setData(Uri.parse(azVar.f386106f));
            }
            if ((azVar.f386101a & 256) != 0) {
                intent2.setAction(azVar.f386107g);
            }
            C90476a aVar = C91018d.f254254a;
            if (getContext().getPackageManager().resolveActivity(intent2, 32768) != null) {
                intent = intent2;
            }
        }
        footerLayout.mo77362c(1);
        FooterLayout footerLayout2 = opaPageLayout.f228726a;
        C84018m.m133907b(footerLayout2.mo77360a(), intent == null ? R.string.bisto_button_generic_next : R.string.bisto_account_mismatch_positive_button, footerLayout2);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C96440z(this, intent)));
        return opaPageLayout;
    }
}

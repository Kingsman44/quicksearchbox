package com.google.android.apps.gsa.staticplugins.recently.monet.p8686a;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116128a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.a.n */
/* compiled from: PG */
public final class C116115n {

    /* renamed from: a */
    public static final C59071e f322006a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.monet.a.n");

    /* renamed from: b */
    public final C86054o f322007b;

    /* renamed from: c */
    public final C22871g f322008c;

    /* renamed from: d */
    public C60870cx f322009d;

    public C116115n(C22871g gVar, C86054o oVar) {
        this.f322008c = gVar;
        this.f322007b = oVar;
    }

    /* renamed from: a */
    public final void mo102514a() {
        C60870cx cxVar = this.f322009d;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f322009d = null;
        }
    }

    /* renamed from: b */
    public final void mo102515b(Account account, String str, String str2, C116124w wVar) {
        String str3;
        boolean z = !C58832aw.m90831a(account, this.f322007b.mo79668a());
        if (str == null || z) {
            if (TextUtils.isEmpty(str2)) {
                str3 = BuildConfig.FLAVOR;
            } else {
                str3 = String.format("?q=%s", new Object[]{str2});
            }
            str = "https://myactivity.google.com".concat(String.valueOf(str3));
        }
        C116100aa aaVar = wVar.f322022a;
        ((C23251a) aaVar.f321932c.mo102504c()).mo28730f(C58833ax.m90834k(C116128a.NO_DIALOG), false);
        C116102ac acVar = aaVar.f321942m;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.putExtra("disable_send_navigation_info", true);
        acVar.f321971c.mo65089a(intent);
    }
}

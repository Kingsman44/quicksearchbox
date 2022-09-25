package com.google.android.apps.search.assistant.verticals.p10035b;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.p059a.C0962j;
import androidx.browser.p059a.C0963k;
import androidx.browser.p059a.C0964l;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import java.net.URISyntaxException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.b.d */
/* compiled from: PG */
final class C131928d implements C47506l {

    /* renamed from: a */
    final /* synthetic */ Uri f360214a;

    /* renamed from: b */
    final /* synthetic */ C37215b f360215b;

    /* renamed from: c */
    final /* synthetic */ C47507m f360216c;

    /* renamed from: d */
    final /* synthetic */ C131929e f360217d;

    public C131928d(C131929e eVar, Uri uri, C37215b bVar, C47507m mVar) {
        this.f360217d = eVar;
        this.f360214a = uri;
        this.f360215b = bVar;
        this.f360216c = mVar;
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
        return this.f360217d.f360223e.mo37970a();
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        Optional optional;
        String string;
        String queryParameter = this.f360214a.getQueryParameter("fid");
        Optional findFirst = Collection.EL.stream(this.f360217d.f360225g.f360239a).filter(new C131927c(queryParameter)).findFirst();
        if (findFirst.isEmpty()) {
            ((C59052c) ((C59052c) C131929e.f360219b.mo56226d()).mo56372aa(39450)).mo56389s("Unsupported flow id %s.", queryParameter);
            C131929e.m214392d(this.f360215b, 3);
            this.f360217d.mo110352c(R.string.assistant_autobot_invalid_request);
            return C131929e.f360220c;
        }
        Intent intent = new Intent();
        try {
            intent = Intent.parseUri(((C131933i) findFirst.get()).f360234b.trim(), 1);
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) C131929e.f360219b.mo56225c()).mo56382g(e)).mo56372aa(39449)).mo56386p("Invalid request.");
            C131929e.m214392d(this.f360215b, 4);
        }
        Bundle extras = intent.getExtras();
        if (!(extras == null || extras.getString("browser_fallback_url") == null || (string = extras.getString("browser_fallback_url")) == null)) {
            this.f360216c.f123337a.setData(Uri.parse(string));
        }
        if (((C131933i) findFirst.get()).f360235c) {
            C131929e.m214392d(this.f360215b, 5);
            this.f360217d.mo110352c(R.string.assistant_autobot_unsupported_feature);
            return C131929e.f360220c;
        }
        findFirst.get();
        C131929e eVar = this.f360217d;
        C58485gu guVar = (C58485gu) Collection.EL.stream(C131929e.f360218a).filter(new C131925a(eVar, eVar.f360226h)).collect(C58370cn.f155946a);
        String c = C0962j.m2897c(eVar.f360222d, C58485gu.m89845m(), false);
        if (guVar.contains(c)) {
            optional = Optional.ofNullable(c);
        } else {
            optional = Optional.ofNullable(C0962j.m2897c(eVar.f360222d, guVar, true));
        }
        if (optional == null || optional.isEmpty()) {
            if (this.f360217d.f360227i) {
                C131929e.m214392d(this.f360215b, 7);
                this.f360217d.mo110352c(R.string.assistant_autobot_update_chrome);
            } else {
                C131929e.m214392d(this.f360215b, 6);
                this.f360217d.mo110352c(R.string.assistant_autobot_install_chrome);
            }
            return C131929e.f360220c;
        }
        this.f360215b.mo19974a(C37176a.f97276iW.mo40805c(C62722b.OK));
        Uri uri = this.f360214a;
        C58528ij ijVar = this.f360217d.f360224f;
        String queryParameter2 = uri.getQueryParameter("hl");
        if (!C58837ba.m90859h(queryParameter2)) {
            String replaceAll = queryParameter2.replaceAll("[^-a-zA-Z]", BuildConfig.FLAVOR);
            C58800sl lA = ijVar.iterator();
            while (true) {
                if (!lA.hasNext()) {
                    break;
                }
                String str = (String) lA.next();
                if (str.equals(replaceAll)) {
                    intent.putExtra("org.chromium.chrome.browser.autofill_assistant.UI_LOCALE", str);
                    break;
                }
            }
        }
        C0964l a = new C0963k().mo3582a();
        a.f3074a.putExtras(intent);
        a.f3074a.setFlags(268435456);
        a.f3074a.setPackage((String) optional.get());
        a.f3074a.setData(intent.getData());
        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84516d(a.f3074a));
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}

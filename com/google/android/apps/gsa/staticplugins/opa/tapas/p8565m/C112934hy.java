package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Intent;
import android.net.Uri;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7195y.C91227s;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.android.libraries.searchbox.shared.suggestion.C41689o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.hy */
/* compiled from: PG */
public final class C112934hy implements C113342cm {

    /* renamed from: a */
    public static final C59071e f312973a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.hy");

    /* renamed from: b */
    private final C91097g f312974b;

    /* renamed from: c */
    private final C86124t f312975c;

    /* renamed from: d */
    private final C22871g f312976d;

    /* renamed from: e */
    private final C112794ct f312977e;

    /* renamed from: f */
    private final C91227s f312978f;

    public C112934hy(C91097g gVar, C86124t tVar, C91227s sVar, C22871g gVar2, C112794ct ctVar) {
        this.f312974b = gVar;
        this.f312975c = tVar;
        this.f312978f = sVar;
        this.f312976d = gVar2;
        this.f312977e = ctVar;
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.webpages_suggestion_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 97544;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112933hx(view);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C41689o oVar = ezVar.mo100209i().f109010d;
        if (oVar == null) {
            oVar = C41689o.f109041e;
        }
        String str = oVar.f109044b;
        this.f312977e.mo99739a(14, ezVar, esVar, Optional.empty());
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.putExtra("com.android.browser.application_id", "com.android.chrome");
        this.f312974b.mo65089a(intent);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo99717g(C113415ez ezVar, View view) {
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C59104x b = f312973a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WebpagesSectionItemR");
        ((C59052c) ((C59052c) b).mo56372aa(27842)).mo56386p("#renderView()");
        View view = ghVar.itemView;
        C41689o oVar = ezVar.mo100209i().f109010d;
        if (oVar == null) {
            oVar = C41689o.f109041e;
        }
        String str = oVar.f109044b;
        TextView textView = (TextView) view.findViewById(R.id.web_title_url);
        textView.setText(str);
        textView.setVisibility(0);
        String L = ezVar.mo100199L();
        TextView textView2 = (TextView) view.findViewById(R.id.web_description);
        textView2.setText(L);
        textView2.setVisibility(0);
        ImageView imageView = (ImageView) view.findViewById(R.id.web_title_icon);
        C41663ac acVar = ezVar.mo100209i().f109008b;
        if (acVar == null) {
            acVar = C41663ac.f108934g;
        }
        imageView.setImageResource(acVar.f108937b == 4 ? ((Integer) acVar.f108938c).intValue() : 0);
        imageView.setVisibility(0);
        C90873ag agVar = new C90873ag(this.f312978f.mo85510a("https://www.google.com/s2/favicons?domain_url=".concat(String.valueOf(str)), 18), this.f312976d, "Get Favicon As Webpages Icon", new C112930hu(imageView));
        agVar.mo85224b(TimeoutException.class, C112931hv.f312971a);
        agVar.mo85223a(C112932hw.f312972a);
        if (this.f312975c.mo79746e(C90063do.f249592gT)) {
            ((ImageView) view.findViewById(R.id.web_snapshot)).setVisibility(0);
        }
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}

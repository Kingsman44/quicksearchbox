package com.google.android.apps.gsa.staticplugins.messages;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.languagepack.av;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6590bh.C84842a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C89984aw;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import dagger.C68214a;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.n */
/* compiled from: PG */
public final class C102784n extends C86734a implements C84842a {

    /* renamed from: a */
    static final ComponentName f286918a = new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity");

    /* renamed from: b */
    public final Context f286919b;

    /* renamed from: c */
    private final C68214a f286920c;

    /* renamed from: f */
    private final C68214a f286921f;

    /* renamed from: g */
    private final C68214a f286922g;

    /* renamed from: h */
    private final C91097g f286923h;

    /* renamed from: i */
    private final C89994f f286924i;

    /* renamed from: j */
    private final C90465g f286925j;

    /* renamed from: k */
    private final C22871g f286926k;

    public C102784n(C68214a aVar, C68214a aVar2, C68214a aVar3, Context context, C91097g gVar, C89994f fVar, C90465g gVar2, C22871g gVar3) {
        super(C118575h.WORKER_MESSAGE, "message");
        this.f286920c = aVar;
        this.f286921f = aVar2;
        this.f286922g = aVar3;
        this.f286919b = context;
        this.f286923h = gVar;
        this.f286924i = fVar;
        this.f286925j = gVar2;
        this.f286926k = gVar3;
    }

    /* renamed from: a */
    public final C60870cx mo78524a() {
        C8476as g = ((av) this.f286922g.mo27525b()).g(this.f286924i.mo83885ae());
        if (g == null || (g.f29416a & 2) == 0) {
            return C60856cj.m92900i(false);
        }
        ((av) this.f286922g.mo27525b()).b(g, true);
        return C60856cj.m92900i(true);
    }

    /* renamed from: b */
    public final void mo78525b(Query query) {
        C58833ax axVar;
        String str = "http://maps.google.com/maps?q=%1$s";
        String x = ((C86124t) this.f286920c.mo27525b()).mo79758x(C89984aw.f246643a);
        String str2 = query.f252770i;
        if (TextUtils.isEmpty(x)) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(x);
        }
        try {
            str = String.format(str, new Object[]{URLEncoder.encode(str2, Charset.defaultCharset().displayName())});
        } catch (UnsupportedEncodingException unused) {
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().appendQueryParameter("entry", "gsaos").build());
        if (axVar.mo56113h()) {
            intent.setClassName((String) axVar.mo56107c(), "com.google.android.maps.MapsActivity");
        } else {
            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        }
        this.f286923h.mo65089a(intent);
    }

    /* renamed from: c */
    public final void mo78526c() {
        this.f286923h.mo65089a(new Intent("android.settings.AIRPLANE_MODE_SETTINGS").setFlags(268435456));
    }

    /* renamed from: d */
    public final void mo78527d() {
        this.f286923h.mo65089a(new Intent("android.settings.DATA_ROAMING_SETTINGS").setFlags(268435456));
    }

    /* renamed from: e */
    public final void mo78528e() {
        Intent intent = new Intent();
        intent.setComponent(f286918a);
        if (!this.f286923h.mo65089a(intent)) {
            this.f286926k.mo28212l("Show open mobile data settings failure toast", new C102719m(this));
        }
    }

    /* renamed from: f */
    public final void mo78529f() {
        this.f286923h.mo65089a(new Intent("android.settings.DATE_SETTINGS").setFlags(268435456));
    }

    /* renamed from: g */
    public final void mo78530g() {
        this.f286923h.mo65089a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addCategory("android.intent.category.DEFAULT").setData(Uri.parse("package:com.google.android.googlequicksearchbox")));
    }

    /* renamed from: h */
    public final void mo78531h() {
        this.f286923h.mo65089a(new Intent("android.intent.action.VIEW", Uri.parse(((C86124t) this.f286920c.mo27525b()).mo79758x(C90110fh.f250714t))).setFlags(268435456).addCategory("android.intent.category.BROWSABLE"));
    }

    /* renamed from: i */
    public final void mo78532i() {
        this.f286923h.mo65089a(new Intent("android.settings.WIFI_SETTINGS").setFlags(268435456));
    }

    /* renamed from: j */
    public final void mo78533j() {
        C90461c cVar = new C90461c();
        cVar.f252699k = true;
        cVar.f252689a = null;
        cVar.f252707s = R.string.feedback_entrypoint_message_card;
        cVar.f252697i = null;
        this.f286925j.mo84210a(this.f286919b).mo84209b(cVar, 1);
    }

    /* renamed from: k */
    public final void mo78534k(List list) {
        C88244um umVar;
        C86775r rVar;
        C86775r rVar2 = null;
        if (((C86610af) this.f286921f.mo27525b()).mo80227h() && (rVar = ((C86610af) this.f286921f.mo27525b()).f233977l) != null) {
            rVar2 = rVar;
        }
        if (rVar2 != null) {
            if (list.isEmpty()) {
                umVar = C88244um.HIDE_MESSAGE_UI;
            } else {
                umVar = C88244um.SHOW_MESSAGE_UI;
            }
            rVar2.f234383e.mo80379b(new C87684al(umVar).mo81964a());
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}

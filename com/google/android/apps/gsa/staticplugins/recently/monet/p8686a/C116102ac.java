package com.google.android.apps.gsa.staticplugins.recently.monet.p8686a;

import android.content.Context;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C90720ad;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.gsa.p1875j.C22842m;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.a.ac */
/* compiled from: PG */
public final class C116102ac {

    /* renamed from: a */
    public static final C59071e f321969a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.monet.a.ac");

    /* renamed from: b */
    public final Context f321970b;

    /* renamed from: c */
    public final C91097g f321971c;

    /* renamed from: d */
    public final C68214a f321972d;

    public C116102ac(Context context, C91097g gVar, C68214a aVar) {
        this.f321970b = context;
        this.f321971c = gVar;
        this.f321972d = aVar;
    }

    /* renamed from: a */
    public static Intent m192534a(String str, String str2) {
        Intent putExtra = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH").putExtra("query", str);
        if (str2 != null) {
            putExtra.putExtra("search_within_corpus", str2);
        }
        return putExtra;
    }

    /* renamed from: b */
    public final Intent mo102499b(String str, String str2) {
        String str3 = BuildConfig.FLAVOR;
        if (str2 != null && !str2.equals("web")) {
            if (str2.startsWith("web.")) {
                str3 = str2.substring(4);
            } else {
                ((C59052c) ((C59052c) f321969a.mo56225c()).mo56372aa(30906)).mo56389s("invalid corpus id %s for opening SRP", str2);
            }
        }
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        str.getClass();
        gVar.f373769a |= 1;
        gVar.f373770b = str;
        eVar.copyOnWrite();
        C137418g gVar2 = (C137418g) eVar.instance;
        str3.getClass();
        gVar2.f373769a |= 2;
        gVar2.f373771c = str3;
        l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
        C136127h.m221196a(intent, l.mo112766a());
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
        intent.putExtra("SKIP_EXIT_ANIMATION", true);
        return intent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo102500c(C22845p pVar) {
        C22842m mVar = pVar.f62898g;
        if (mVar == null) {
            mVar = C22842m.f62879d;
        }
        if ((mVar.f62881a & 1) == 0) {
            return null;
        }
        C22842m mVar2 = pVar.f62898g;
        if (mVar2 == null) {
            mVar2 = C22842m.f62879d;
        }
        return mVar2.f62882b;
    }

    /* renamed from: d */
    public final void mo102501d() {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity");
        intent.putExtra("extra_show_setting", C90720ad.RECENTLY);
        this.f321971c.mo65089a(intent);
    }
}

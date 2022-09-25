package com.google.android.apps.gsa.staticplugins.nowstream.shared;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.p7240i.C91743a;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91749e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7767je;
import com.google.p375ai.p378b.C8142xb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.d */
/* compiled from: PG */
public final class C105457d implements C91743a {

    /* renamed from: d */
    private static final C59071e f294073d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.shared.d");

    /* renamed from: a */
    public final boolean f294074a;

    /* renamed from: b */
    public boolean f294075b = false;

    /* renamed from: c */
    public C8142xb f294076c;

    /* renamed from: e */
    private final C86338r f294077e;

    /* renamed from: f */
    private final Context f294078f;

    /* renamed from: g */
    private final C90464f f294079g;

    /* renamed from: h */
    private View f294080h;

    public C105457d(boolean z, C86338r rVar, Context context, C90464f fVar) {
        this.f294077e = rVar;
        this.f294078f = context;
        this.f294079g = fVar;
        this.f294074a = z;
    }

    /* renamed from: a */
    public final void mo85910a() {
        mo85911b((C7718hj) null);
    }

    /* renamed from: b */
    public final void mo85911b(C7718hj hjVar) {
        C90461c cVar = new C90461c();
        cVar.f252699k = true;
        cVar.f252707s = R.string.feedback_entrypoint_now_card;
        cVar.f252697i = null;
        cVar.f252698j = true;
        cVar.f252690b = "now_cards";
        cVar.f252692d = C87562e.m142218a(this.f294078f, "now_cards");
        if (hjVar != null) {
            for (C7767je jeVar : hjVar.f26948T) {
                cVar.mo84200d(jeVar.f27206b, jeVar.f27207c);
            }
        }
        String string = this.f294077e.getString(C90507o.f253011a, BuildConfig.FLAVOR);
        if (!TextUtils.isEmpty(string)) {
            cVar.f252691c = new Account(string, "com.google");
        }
        if (this.f294074a) {
            cVar.f252689a = this.f294080h;
            cVar.f252705q = true != this.f294075b ? -1 : -16777216;
        }
        new C91749e(this.f294076c).mo84197a(cVar);
        this.f294079g.mo84209b(cVar, 1);
    }

    /* renamed from: c */
    public final void mo94785c(View view) {
        if (this.f294074a) {
            this.f294080h = view;
            return;
        }
        ((C59052c) ((C59052c) f294073d.mo56226d()).mo56372aa(22328)).mo56386p("Can't set view to screenshot outside MoMo.");
        int i = C90755l.f253831a;
    }
}

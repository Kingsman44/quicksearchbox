package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95687k;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95692p;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.i */
/* compiled from: PG */
public final /* synthetic */ class C95660i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95662k f267760a;

    /* renamed from: b */
    public final /* synthetic */ C95692p f267761b;

    /* renamed from: c */
    public final /* synthetic */ C95294af f267762c;

    /* renamed from: d */
    public final /* synthetic */ C95288a f267763d;

    public /* synthetic */ C95660i(C95662k kVar, C95692p pVar, C95294af afVar, C95288a aVar) {
        this.f267760a = kVar;
        this.f267761b = pVar;
        this.f267762c = afVar;
        this.f267763d = aVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95662k kVar = this.f267760a;
        C95692p pVar = this.f267761b;
        C95294af afVar = this.f267762c;
        C95288a aVar = this.f267763d;
        C58976aa aaVar = C58975e.f156826a;
        C95687k a = kVar.f267766b.mo89625a(((Boolean) obj).booleanValue() ? kVar.f267768d.getString(R.string.no_notif_permission_fetch_v2) : BuildConfig.FLAVOR, pVar);
        kVar.f267767c.mo89218k(8);
        kVar.mo89629a(a, afVar, aVar);
    }
}

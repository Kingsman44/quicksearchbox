package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94638b;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.g */
/* compiled from: PG */
final class C95658g extends C94650n {

    /* renamed from: e */
    private final C95293ae f267752e;

    /* renamed from: f */
    private final String f267753f;

    /* renamed from: g */
    private final C22869e f267754g;

    /* renamed from: h */
    private final int f267755h;

    /* renamed from: i */
    private boolean f267756i;

    /* renamed from: j */
    private boolean f267757j;

    /* renamed from: k */
    private final C95672u f267758k;

    public C95658g(Context context, C95293ae aeVar, String str, C22869e eVar, C95672u uVar, String str2, int i, C95307m mVar, C21370a aVar) {
        super(context, mVar, aVar, str, (Uri) null);
        this.f267752e = aeVar;
        this.f267754g = eVar;
        this.f267758k = uVar;
        this.f267753f = str2;
        this.f267755h = i;
    }

    /* renamed from: a */
    public final C94638b mo88567a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f267756i = true;
        return new C94638b(true, true, true);
    }

    /* renamed from: d */
    public final String mo88570d() {
        return this.f267753f;
    }

    /* renamed from: j */
    public final boolean mo88576j() {
        return true;
    }

    /* renamed from: l */
    public final boolean mo88578l(C94647k kVar, C94637a aVar) {
        return false;
    }

    /* renamed from: n */
    public final void mo88581n(C95285o oVar, C95284n nVar) {
        C95672u uVar;
        if (this.f267756i) {
            C58976aa aaVar = C58975e.f156826a;
            this.f267754g.run();
            return;
        }
        C95656e eVar = new C95656e(this, oVar, nVar);
        if (!this.f267757j && (uVar = this.f267758k) != null) {
            this.f267757j = true;
            Uri uri = uVar.f267822a;
            boolean z = uVar.f267823b;
            long j = C95651ae.f267709a;
            if (uri != null) {
                C58976aa aaVar2 = C58975e.f156826a;
                oVar.mo89204d(uri, eVar);
                return;
            } else if (z) {
                C58976aa aaVar3 = C58975e.f156826a;
                oVar.mo89202b(4, eVar);
                return;
            }
        }
        C58976aa aaVar4 = C58975e.f156826a;
        CharSequence charSequence = this.f264730c;
        if (charSequence != null) {
            C95311q.m157569c(this.f267752e, this.f264731d, this.f267755h, charSequence.toString());
        }
        super.mo88581n(oVar, nVar);
    }
}

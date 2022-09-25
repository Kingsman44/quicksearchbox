package com.google.android.apps.gsa.sidekick.shared.p7243l;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7146u.C90619c;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.gms.common.api.C143848t;
import com.google.android.gms.reminders.C145778g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.l.d */
/* compiled from: PG */
public final class C91758d extends C90619c {

    /* renamed from: j */
    public static final C59071e f255894j = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.l.d");

    /* renamed from: k */
    public final C68214a f255895k;

    /* renamed from: l */
    private final String f255896l;

    public C91758d(Context context, C90929bz bzVar, String str, C68214a aVar) {
        super("RemindersApiClient", context, bzVar, 30000);
        this.f255896l = str;
        this.f255895k = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo79809b(C143848t tVar) {
        tVar.mo119296c(C145778g.f394145b);
        tVar.mo119299f(this.f255896l);
    }
}

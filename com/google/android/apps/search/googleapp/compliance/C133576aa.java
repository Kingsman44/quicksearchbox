package com.google.android.apps.search.googleapp.compliance;

import android.net.Uri;
import android.support.p033v7.app.C0401v;
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139279a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;

/* renamed from: com.google.android.apps.search.googleapp.compliance.aa */
/* compiled from: PG */
public final class C133576aa {

    /* renamed from: a */
    public final C133657x f363918a;

    /* renamed from: b */
    public final AccountId f363919b;

    /* renamed from: c */
    public final C133586ak f363920c;

    /* renamed from: d */
    public final C133665d f363921d;

    /* renamed from: e */
    public final C46439e f363922e;

    /* renamed from: f */
    public final C133617bc f363923f;

    /* renamed from: g */
    public final C28443m f363924g;

    /* renamed from: h */
    public final C28310af f363925h;

    /* renamed from: i */
    public final C28306ab f363926i;

    /* renamed from: j */
    public final C133148g f363927j;

    /* renamed from: k */
    private final C139272a f363928k;

    /* renamed from: l */
    private final C133933a f363929l;

    public C133576aa(C133657x xVar, AccountId accountId, C133586ak akVar, C133665d dVar, C46439e eVar, C139272a aVar, C133617bc bcVar, C28443m mVar, C28310af afVar, C28306ab abVar, C133933a aVar2, C133148g gVar) {
        this.f363918a = xVar;
        this.f363919b = accountId;
        this.f363920c = akVar;
        this.f363921d = dVar;
        this.f363922e = eVar;
        this.f363928k = aVar;
        this.f363923f = bcVar;
        this.f363924g = mVar;
        this.f363925h = afVar;
        this.f363926i = abVar;
        this.f363929l = aVar2;
        this.f363927j = gVar;
    }

    /* renamed from: a */
    public final void mo111270a(String str) {
        C133933a aVar = this.f363929l;
        int i = C0401v.f1356b;
        if (C133933a.m217248a(aVar.f364779a)) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("color_scheme", "dark").build().toString();
        }
        C139272a aVar2 = this.f363928k;
        C139279a aVar3 = (C139279a) C139280b.f378830g.createBuilder();
        aVar3.copyOnWrite();
        C139280b bVar = (C139280b) aVar3.instance;
        str.getClass();
        bVar.f378832a |= 1;
        bVar.f378833b = str;
        aVar3.copyOnWrite();
        C139280b bVar2 = (C139280b) aVar3.instance;
        bVar2.f378832a |= 2;
        bVar2.f378834c = true;
        C47709i.m84861a(this.f363918a, aVar2.mo114864a((C139280b) aVar3.build(), this.f363919b));
    }
}

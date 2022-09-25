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
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;

/* renamed from: com.google.android.apps.search.googleapp.compliance.ar */
/* compiled from: PG */
public final class C133593ar {

    /* renamed from: a */
    public final C133588am f363946a;

    /* renamed from: b */
    public final C133586ak f363947b;

    /* renamed from: c */
    public final C133665d f363948c;

    /* renamed from: d */
    public final C46439e f363949d;

    /* renamed from: e */
    public final C47770dh f363950e;

    /* renamed from: f */
    public final C133617bc f363951f;

    /* renamed from: g */
    public final C28306ab f363952g;

    /* renamed from: h */
    public final C28310af f363953h;

    /* renamed from: i */
    public final C28443m f363954i;

    /* renamed from: j */
    public final C133148g f363955j;

    /* renamed from: k */
    private final AccountId f363956k;

    /* renamed from: l */
    private final C139272a f363957l;

    /* renamed from: m */
    private final C133933a f363958m;

    public C133593ar(AccountId accountId, C133588am amVar, C133586ak akVar, C133665d dVar, C46439e eVar, C47770dh dhVar, C139272a aVar, C133617bc bcVar, C28306ab abVar, C28310af afVar, C28443m mVar, C133933a aVar2, C133148g gVar) {
        this.f363956k = accountId;
        this.f363946a = amVar;
        this.f363947b = akVar;
        this.f363948c = dVar;
        this.f363949d = eVar;
        this.f363950e = dhVar;
        this.f363957l = aVar;
        this.f363951f = bcVar;
        this.f363952g = abVar;
        this.f363953h = afVar;
        this.f363954i = mVar;
        this.f363958m = aVar2;
        this.f363955j = gVar;
    }

    /* renamed from: a */
    public final void mo111284a(String str) {
        C133933a aVar = this.f363958m;
        int i = C0401v.f1356b;
        if (C133933a.m217248a(aVar.f364779a)) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("color_scheme", "dark").build().toString();
        }
        C139272a aVar2 = this.f363957l;
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
        C47709i.m84861a(this.f363946a, aVar2.mo114864a((C139280b) aVar3.build(), this.f363956k));
    }
}

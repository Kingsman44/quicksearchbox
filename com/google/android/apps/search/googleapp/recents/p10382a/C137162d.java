package com.google.android.apps.search.googleapp.recents.p10382a;

import android.content.Context;
import com.google.android.libraries.gsa.p1875j.C22832c;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.recents.a.d */
/* compiled from: PG */
public final class C137162d {

    /* renamed from: a */
    public static final Duration f373223a = Duration.ofDays(1);

    /* renamed from: h */
    private static final Duration f373224h = Duration.ofDays(7);

    /* renamed from: b */
    public final C42876ab f373225b;

    /* renamed from: c */
    public final C60887da f373226c;

    /* renamed from: d */
    public final boolean f373227d;

    /* renamed from: e */
    public final Context f373228e;

    /* renamed from: f */
    public final AccountId f373229f;

    /* renamed from: g */
    public final C46128f f373230g;

    /* renamed from: i */
    private final C21370a f373231i;

    static {
        C58974d.m91135i("SharedRecentsDataStore");
    }

    public C137162d(C21370a aVar, C60887da daVar, C42876ab abVar, boolean z, Context context, AccountId accountId, C46128f fVar) {
        this.f373231i = aVar;
        this.f373226c = daVar;
        this.f373225b = abVar;
        this.f373227d = z;
        this.f373228e = context;
        this.f373229f = accountId;
        this.f373230g = fVar;
    }

    /* renamed from: a */
    public final C22832c mo113576a(String str, long j) {
        long b = this.f373231i.mo26870b();
        C22832c cVar = (C22832c) C22845p.f62890o.createBuilder();
        cVar.copyOnWrite();
        C22845p pVar = (C22845p) cVar.instance;
        pVar.f62892a |= 1;
        pVar.f62893b = j;
        cVar.copyOnWrite();
        C22845p pVar2 = (C22845p) cVar.instance;
        pVar2.f62892a |= 2048;
        pVar2.f62903l = b;
        cVar.copyOnWrite();
        C22845p pVar3 = (C22845p) cVar.instance;
        pVar3.f62892a |= 4;
        pVar3.f62895d = b;
        cVar.copyOnWrite();
        C22845p pVar4 = (C22845p) cVar.instance;
        str.getClass();
        pVar4.f62892a |= 8;
        pVar4.f62896e = str;
        return cVar;
    }

    /* renamed from: b */
    public final C60870cx mo113577b(C22845p pVar) {
        return this.f373225b.mo46039a(new C137161c(this, pVar), this.f373226c);
    }

    /* renamed from: c */
    public final boolean mo113578c(Instant instant) {
        return instant.isBefore(Instant.ofEpochMilli(this.f373231i.mo26870b()).minus(f373224h));
    }
}

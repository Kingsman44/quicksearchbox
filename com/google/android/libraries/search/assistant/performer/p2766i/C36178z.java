package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3924c.C51745p;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.z */
/* compiled from: PG */
public final class C36178z implements C35472h {

    /* renamed from: a */
    public static final C59071e f94537a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.i.z");

    /* renamed from: b */
    public final AccountId f94538b;

    /* renamed from: c */
    public final C46128f f94539c;

    /* renamed from: d */
    public final C39141kp f94540d;

    /* renamed from: e */
    public final C36129ah f94541e;

    public C36178z(C36129ah ahVar, AccountId accountId, C46128f fVar, C39141kp kpVar) {
        this.f94541e = ahVar;
        this.f94538b = accountId;
        this.f94539c = fVar;
        this.f94540d = kpVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        return C36183e.m64583a(dyVar, "args", C51745p.f135755b.getParserForType(), new C36176x(this));
    }
}

package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.permissions.C36196a;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ct */
/* compiled from: PG */
public final class C35591ct implements C35472h {

    /* renamed from: a */
    public static final C59071e f93419a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.ct");

    /* renamed from: b */
    public static final Duration f93420b = Duration.ofSeconds(10);

    /* renamed from: c */
    public final Context f93421c;

    /* renamed from: d */
    public final C60888db f93422d;

    /* renamed from: e */
    private final C35470f f93423e;

    /* renamed from: f */
    private final C36197b f93424f;

    public C35591ct(Context context, C60888db dbVar, C35470f fVar, C36197b bVar) {
        this.f93421c = context;
        this.f93422d = dbVar;
        this.f93423e = fVar;
        this.f93424f = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C60870cx cxVar;
        ((C59052c) ((C59052c) f93419a.mo56224b()).mo56372aa(51653)).mo56389s("Performing clientOp in IncomingCallPerformer %s", dyVar);
        if (!C36196a.m64596a("android.permission.READ_PHONE_STATE", this.f93421c)) {
            cxVar = this.f93424f.mo20788a(this.f93423e, new String[]{"android.permission.READ_PHONE_STATE"});
        } else {
            cxVar = C60856cj.m92900i(true);
        }
        C35582ck ckVar = new C35582ck(this, dyVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(ckVar), this.f93422d);
    }
}

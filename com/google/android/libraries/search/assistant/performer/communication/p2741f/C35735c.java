package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.search.assistant.performer.permissions.C36196a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.c */
/* compiled from: PG */
public final class C35735c {

    /* renamed from: a */
    private static final C59071e f93659a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.f.c");

    /* renamed from: b */
    private final Context f93660b;

    /* renamed from: c */
    private final C39141kp f93661c;

    /* renamed from: d */
    private final C46877q f93662d;

    public C35735c(C46877q qVar, Context context, C39141kp kpVar) {
        this.f93662d = qVar;
        this.f93660b = context;
        this.f93661c = kpVar;
    }

    /* renamed from: a */
    public final C46463o mo39825a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, C39226b bVar) {
        if (!C36196a.m64596a("android.permission.READ_CONTACTS", this.f93660b)) {
            ((C59052c) ((C59052c) f93659a.mo56224b()).mo56372aa(51780)).mo56386p("query(): READ_CONTACTS permission is not granted.");
            return null;
        }
        this.f93661c.mo41711z(C39227c.m68658b(bVar));
        return this.f93662d.mo50872b(uri, strArr, str, strArr2, str2);
    }
}

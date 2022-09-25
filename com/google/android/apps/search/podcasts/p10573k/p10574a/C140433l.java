package com.google.android.apps.search.podcasts.p10573k.p10574a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.apps.p484e.p485a.C9053c;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.podcasts.k.a.l */
/* compiled from: PG */
public final class C140433l {

    /* renamed from: a */
    public static final C59071e f381459a = C59071e.m91332i("com.google.android.apps.search.podcasts.k.a.l");

    /* renamed from: b */
    public static final long f381460b = Duration.ofSeconds(10).toMillis();

    /* renamed from: c */
    public static final Intent f381461c = new Intent("com.google.android.apps.podcasts.NOTIFICATION_SERVICE").setPackage("com.google.android.apps.podcasts");

    /* renamed from: d */
    public final ArrayList f381462d = new ArrayList();

    /* renamed from: e */
    public long f381463e;

    /* renamed from: f */
    public final ServiceConnection f381464f = new C140431j(this);

    /* renamed from: g */
    public final Context f381465g;

    /* renamed from: h */
    public final PackageManager f381466h;

    /* renamed from: i */
    public final C60888db f381467i;

    /* renamed from: j */
    public final Executor f381468j;

    /* renamed from: k */
    public final C21370a f381469k;

    /* renamed from: l */
    public final C58881cr f381470l;

    /* renamed from: m */
    public C9053c f381471m;

    public C140433l(Context context, PackageManager packageManager, C143701ac acVar, C21370a aVar, C60888db dbVar) {
        this.f381465g = context;
        this.f381466h = packageManager;
        this.f381469k = aVar;
        this.f381470l = C58886cw.m90973a(new C140424c(acVar));
        this.f381468j = new C60904dr(dbVar);
        this.f381467i = dbVar;
    }

    /* renamed from: a */
    public static Bundle m228138a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("account", str);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m228139b(String str, List list) {
        Bundle a = m228138a(str);
        a.putStringArrayList("topic_list", C58597ky.m90211b(list));
        return a;
    }

    /* renamed from: c */
    public final void mo115671c(Runnable runnable) {
        this.f381468j.execute(C47810es.m84977q(new C140423b(this, runnable)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo115672d(String str, List list, List list2) {
        C58976aa aaVar = C58975e.f156826a;
        mo115671c(new C140425d(this, list, str, list2));
    }
}

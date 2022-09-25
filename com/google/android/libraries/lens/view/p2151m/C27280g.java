package com.google.android.libraries.lens.view.p2151m;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.p059a.C0967o;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.srpx.C28045k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.lens.view.m.g */
/* compiled from: PG */
public final class C27280g {

    /* renamed from: a */
    public final Context f74608a;

    /* renamed from: b */
    public final C27276c f74609b;

    /* renamed from: c */
    public final C37215b f74610c;

    /* renamed from: d */
    public final C28045k f74611d;

    /* renamed from: e */
    public C0967o f74612e;

    /* renamed from: f */
    public Uri f74613f = null;

    /* renamed from: g */
    private final C21370a f74614g;

    /* renamed from: h */
    private final C27281h f74615h;

    /* renamed from: i */
    private final Executor f74616i;

    /* renamed from: j */
    private final C27232l f74617j;

    /* renamed from: k */
    private final AtomicBoolean f74618k = new AtomicBoolean(false);

    public C27280g(C21370a aVar, Context context, C27276c cVar, C27281h hVar, Executor executor, C27232l lVar, C37215b bVar, C28045k kVar) {
        this.f74614g = aVar;
        this.f74608a = context;
        this.f74609b = cVar;
        this.f74615h = hVar;
        this.f74616i = executor;
        this.f74617j = lVar;
        this.f74610c = bVar;
        this.f74611d = kVar;
    }

    /* renamed from: c */
    private static boolean m50793c(C21370a aVar, Context context, C27232l lVar, Uri uri, Bundle bundle) {
        String str = (String) lVar.mo32701h().mo56107c();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName(str, "com.google.android.apps.chrome.IntentDispatcher");
        intent.setData(uri);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        if (bundle != null) {
            intent.putExtra("com.android.browser.headers", bundle);
        }
        intent.putExtra("com.google.android.apps.chrome.EXTRA_LENS_CALLER_PACKAGE", str);
        intent.putExtra("com.google.android.apps.chrome.EXTRA_OUTBOUND_INTENT_LAUNCHED_TIMESTAMP", aVar.mo26872d());
        if (lVar.mo32704j().mo56113h()) {
            intent.putExtra("com.google.android.apps.chrome.EXTRA_INBOUND_INTENT_LAUNCHED_TIMESTAMP", ((Long) lVar.mo32704j().mo56107c()).longValue());
        }
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo32809a(C62722b bVar, C59898bg bgVar) {
        if (!this.f74618k.getAndSet(false)) {
            return;
        }
        if (bgVar != null) {
            C37215b bVar2 = this.f74610c;
            C37252a c = C37194a.f98584co.mo40805c(bVar);
            ((C37253b) c).mo40792p(C59898bg.f161867w, bgVar);
            bVar2.mo19974a(c);
            return;
        }
        this.f74610c.mo19974a(C37194a.f98584co.mo40805c(bVar));
    }

    /* renamed from: b */
    public final boolean mo32810b(Uri uri, Bundle bundle) {
        Uri uri2 = uri;
        Bundle bundle2 = bundle;
        if (C27281h.f74621c.contains(this.f74617j.mo32701h().mo56111f())) {
            return m50793c(this.f74614g, this.f74608a, this.f74617j, uri2, bundle2);
        }
        this.f74610c.mo19974a(C37194a.f98518bb);
        this.f74618k.set(true);
        this.f74613f = uri2;
        this.f74610c.mo19974a(C37194a.f98583cn);
        if (!TextUtils.isEmpty(this.f74615h.mo32811a())) {
            C27281h hVar = this.f74615h;
            HashSet hashSet = new HashSet();
            List<ResolveInfo> queryIntentActivities = hVar.f74622d.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri2), 65536);
            if (queryIntentActivities != null) {
                int size = queryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    String str = queryIntentActivities.get(i).activityInfo.packageName;
                    Set set = hVar.f74623e;
                    if (set == null) {
                        hVar.f74623e = new HashSet();
                        List<ResolveInfo> queryIntentActivities2 = hVar.f74622d.getPackageManager().queryIntentActivities(C27281h.f74619a, 65536);
                        int size2 = queryIntentActivities2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            hVar.f74623e.add(queryIntentActivities2.get(i2).activityInfo.packageName);
                        }
                        set = hVar.f74623e;
                    }
                    if (!set.contains(str)) {
                        Set set2 = hVar.f74624f;
                        if (set2 == null) {
                            hVar.f74624f = new HashSet();
                            List<ResolveInfo> queryIntentActivities3 = hVar.f74622d.getPackageManager().queryIntentActivities(C27281h.f74620b, 65536);
                            int size3 = queryIntentActivities3.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                hVar.f74624f.add(queryIntentActivities3.get(i3).activityInfo.packageName);
                            }
                            set2 = hVar.f74624f;
                        }
                        if (!set2.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                C60870cx a = this.f74609b.mo32807a();
                if (a == null) {
                    this.f74610c.mo19974a(C37194a.f98525bi.mo40805c(C62722b.UNKNOWN));
                    mo32809a(C62722b.UNKNOWN, (C59898bg) null);
                    return false;
                }
                C27279f fVar = new C27279f(this, bundle2, uri2, a);
                C60856cj.m92911t(a, C47810es.m84974n(fVar), this.f74616i);
                return true;
            }
        }
        this.f74610c.mo19974a(C37194a.f98525bi.mo40805c(C62722b.UNKNOWN));
        mo32809a(C62722b.UNKNOWN, (C59898bg) null);
        return false;
    }
}

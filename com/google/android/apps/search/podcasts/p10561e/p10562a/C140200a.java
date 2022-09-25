package com.google.android.apps.search.podcasts.p10561e.p10562a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.podcasts.show.C141121af;
import com.google.android.apps.search.podcasts.show.C141122ag;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46501v;
import com.google.apps.tiktok.contrib.p3629c.C46502w;
import com.google.p4225bm.p4229c.C56113b;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.e.a.a */
/* compiled from: PG */
public final class C140200a {

    /* renamed from: a */
    public final C46502w f380905a;

    public C140200a(C46502w wVar) {
        this.f380905a = wVar;
    }

    /* renamed from: b */
    public static final void m227875b(List list, Context context) {
        if (!(context instanceof Activity)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Intent) it.next()).addFlags(268468224);
            }
        }
    }

    /* renamed from: c */
    public static final Intent m227876c(Context context, C56113b bVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(bVar, "entryPointType");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setClassName(context, "com.google.android.apps.search.podcasts.PodcastsActivity");
        return m227878e(intent, bVar);
    }

    /* renamed from: d */
    public static final void m227877d(List list, C56113b bVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m227878e((Intent) it.next(), bVar);
        }
    }

    /* renamed from: e */
    private static final Intent m227878e(Intent intent, C56113b bVar) {
        Intent putExtra = intent.putExtra("entry_point_type_int", bVar.f149497u);
        C69664n.m101060f(putExtra, "this.putExtra(EXTRA_ENTR…tryPointType.getNumber())");
        return putExtra;
    }

    /* renamed from: a */
    public final List mo115496a(Context context, AccountId accountId, String str, C56113b bVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(str, "feedUrl");
        C69664n.m101061g(bVar, "entryPointType");
        C46501v a = this.f380905a.mo50515a(accountId).mo50512a().mo50511a(R.navigation.podcasts_home_tab_nav_graph);
        C141121af afVar = (C141121af) C141122ag.f383149c.createBuilder();
        afVar.copyOnWrite();
        str.getClass();
        ((C141122ag) afVar.instance).f383151a = str;
        a.mo50514b(R.id.podcasts_show_fragment, C46490k.m82868a(afVar.build()).mo50504d());
        List a2 = a.mo50513a();
        C69664n.m101060f(a2, "tiktokNavigationFactory\n…))\n      )\n      .intents");
        m227877d(a2, bVar);
        m227875b(a2, context);
        return a2;
    }
}

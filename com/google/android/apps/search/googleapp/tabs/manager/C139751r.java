package com.google.android.apps.search.googleapp.tabs.manager;

import android.view.MenuItem;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.tabs.manager.p10526c.C139736a;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.r */
/* compiled from: PG */
public final /* synthetic */ class C139751r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C139720ac f379856a;

    public /* synthetic */ C139751r(C139720ac acVar) {
        this.f379856a = acVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C139720ac acVar = this.f379856a;
        C47477n nVar = acVar.f379783p;
        C139736a aVar = acVar.f379784q;
        int itemCount = acVar.f379790w.getItemCount();
        C47474k g = C47475l.m84477g();
        C47465c cVar = (C47465c) g;
        cVar.f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
        g.mo51310d(true);
        cVar.f123252d = true != C133933a.m217248a(aVar.f379825a) ? 2 : 3;
        C46663a aVar2 = new C46663a();
        aVar2.mo50686d(C46667e.KEY_VALUE);
        aVar2.f121916a = C63088z.m96143E("Yes");
        aVar2.mo50684b(false);
        g.mo51333f("from_tabs", aVar2.mo50683a());
        C46663a aVar3 = new C46663a();
        aVar3.mo50686d(C46667e.KEY_VALUE);
        aVar3.f121916a = C63088z.m96143E(String.valueOf(itemCount));
        aVar3.mo50684b(false);
        g.mo51333f("num_open_tabs", aVar3.mo50683a());
        C47475l e = g.mo51332e();
        C69664n.m101060f(e, "builder()\n      .setCate…()\n      )\n      .build()");
        nVar.mo51336a(e);
        return true;
    }
}

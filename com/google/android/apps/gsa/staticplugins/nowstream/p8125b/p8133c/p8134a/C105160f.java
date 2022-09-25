package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8133c.p8134a;

import android.accounts.Account;
import android.os.Bundle;
import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0745iz;
import android.text.TextUtils;
import android.view.MenuItem;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105140a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105141b;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C105160f implements C0745iz {

    /* renamed from: a */
    public final /* synthetic */ C105164j f293158a;

    public /* synthetic */ C105160f(C105164j jVar) {
        this.f293158a = jVar;
    }

    /* renamed from: a */
    public final boolean mo1222a(MenuItem menuItem) {
        C105164j jVar = this.f293158a;
        if (menuItem == jVar.f293167f) {
            jVar.f293166e.mo94565e();
            jVar.f293162a.mo85911b((C7718hj) null);
        } else if (menuItem == jVar.f293168g) {
            jVar.f293166e.mo94565e();
            C90461c cVar = new C90461c();
            cVar.f252690b = "now_cards";
            cVar.f252692d = C87562e.m142218a(jVar.f293165d, "now_cards");
            cVar.f252698j = true;
            cVar.f252707s = R.string.feedback_entrypoint_now;
            cVar.f252697i = null;
            String string = jVar.f293164c.getString(C90507o.f253011a, BuildConfig.FLAVOR);
            if (!TextUtils.isEmpty(string)) {
                cVar.f252691c = new Account(string, "com.google");
            }
            jVar.f293163b.mo84209b(cVar, 0);
        } else {
            C105140a aVar = jVar.f293166e;
            int i = ((C0480t) menuItem).f1682a;
            Bundle bundle = new Bundle();
            bundle.putInt("itemId", Integer.valueOf(i).intValue());
            ((C105141b) aVar).f293108a.mo28345s("onItemClicked_int", "HeaderEventsDispatcher", bundle);
        }
        return true;
    }
}

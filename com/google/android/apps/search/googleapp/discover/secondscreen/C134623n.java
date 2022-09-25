package com.google.android.apps.search.googleapp.discover.secondscreen;

import android.content.Context;
import android.net.Uri;
import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0745iz;
import android.view.MenuItem;
import com.google.android.apps.search.googleapp.discover.p10202n.C134471a;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47486w;
import com.google.apps.tiktok.monitoring.feedback.C47488y;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.googleapp.discover.secondscreen.n */
/* compiled from: PG */
final class C134623n implements C0745iz {

    /* renamed from: a */
    final /* synthetic */ C134624o f366598a;

    public C134623n(C134624o oVar) {
        this.f366598a = oVar;
    }

    /* renamed from: a */
    public final boolean mo1222a(MenuItem menuItem) {
        C134624o oVar = this.f366598a;
        int i = ((C0480t) menuItem).f1682a;
        if (i == 1) {
            C134744f a = oVar.mo111850a();
            if (a != null) {
                a.mo111956j(C134720e.OVERFLOW_SETTINGS_TAPPED);
            }
            oVar.f366606g.mo115320a((C139873i) null, false);
        } else if (i == 2) {
            C134744f a2 = oVar.mo111850a();
            if (a2 != null) {
                a2.mo111956j(C134720e.OVERFLOW_MANAGE_INTERESTS_TAPPED);
            }
            Context context = oVar.f366600a.getContext();
            if (context != null) {
                C47810es.m84979s(context, C134471a.m218228a());
            }
        } else if (i == 3) {
            C134744f a3 = oVar.mo111850a();
            if (a3 != null) {
                a3.mo111956j(C134720e.OVERFLOW_FEEDBACK_TAPPED);
                a3.mo111950d();
            }
        } else if (i == 4) {
            C134744f a4 = oVar.mo111850a();
            if (a4 != null) {
                a4.mo111956j(C134720e.OVERFLOW_HELP_TAPPED);
            }
            C47486w d = C47488y.m84500d();
            d.mo51321b(Uri.parse("https://support.google.com/mobile/?p=gqsb_now_cards"));
            C47488y a5 = d.mo51320a();
            C47474k g = C47475l.m84477g();
            ((C47465c) g).f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
            g.mo51310d(false);
            oVar.f366607h.mo51298a(a5, g.mo51332e());
        }
        return true;
    }
}

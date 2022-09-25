package com.google.android.apps.search.googleapp.discover.fullcoverage;

import android.net.Uri;
import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0745iz;
import android.view.MenuItem;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47486w;
import com.google.apps.tiktok.monitoring.feedback.C47488y;

/* renamed from: com.google.android.apps.search.googleapp.discover.fullcoverage.j */
/* compiled from: PG */
final /* synthetic */ class C134323j implements C0745iz {

    /* renamed from: a */
    final /* synthetic */ C134325l f365867a;

    public C134323j(C134325l lVar) {
        this.f365867a = lVar;
    }

    /* renamed from: a */
    public final boolean mo1222a(MenuItem menuItem) {
        C134325l lVar = this.f365867a;
        int i = ((C0480t) menuItem).f1682a;
        if (i == R.id.googleapp_full_coverage_settings_menu) {
            C134744f a = lVar.mo111733a();
            if (a != null) {
                a.mo111956j(C134720e.OVERFLOW_SETTINGS_TAPPED);
            }
            lVar.f365878h.mo115320a((C139873i) null, false);
        } else if (i == R.id.googleapp_full_coverage_feedback_menu) {
            C134744f a2 = lVar.mo111733a();
            if (a2 != null) {
                a2.mo111956j(C134720e.OVERFLOW_FEEDBACK_TAPPED);
            }
            C134744f a3 = lVar.mo111733a();
            if (a3 != null) {
                a3.mo111950d();
                return true;
            }
        } else if (i != R.id.googleapp_full_coverage_help_menu) {
            return false;
        } else {
            C134744f a4 = lVar.mo111733a();
            if (a4 != null) {
                a4.mo111956j(C134720e.OVERFLOW_HELP_TAPPED);
            }
            C47486w d = C47488y.m84500d();
            d.mo51321b(Uri.parse("https://support.google.com/mobile/?p=gqsb_now_cards"));
            C47488y a5 = d.mo51320a();
            C47474k g = C47475l.m84477g();
            ((C47465c) g).f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
            g.mo51310d(false);
            lVar.f365879i.mo51298a(a5, g.mo51332e());
        }
        return true;
    }
}

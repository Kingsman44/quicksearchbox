package com.google.android.libraries.search.assistant.proactive.p2772d;

import android.widget.RemoteViews;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.p3717aq.p3718a.p3719a.C47883q;
import com.google.p3717aq.p3718a.p3719a.C47884r;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.search.assistant.proactive.d.a */
/* compiled from: PG */
public final class C36255a {

    /* renamed from: a */
    private final C21370a f94705a;

    public C36255a(C21370a aVar) {
        this.f94705a = aVar;
    }

    /* renamed from: a */
    public final RemoteViews mo40074a(aas aas) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r0);
        Object l = aas.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C47887u uVar = ((abc) obj).f134698e;
        if (uVar == null) {
            uVar = C47887u.f123976l;
        }
        int i = uVar.f123985h;
        RemoteViews remoteViews = new RemoteViews("com.google.android.googlequicksearchbox", R.layout.chronometer_notif_content);
        remoteViews.setChronometerCountDown(R.id.chronometer, true);
        long b = this.f94705a.mo26870b();
        C47884r rVar = uVar.f123988k;
        if (rVar == null) {
            rVar = C47884r.f123965g;
        }
        C47883q qVar = rVar.f123971e;
        if (qVar == null) {
            qVar = C47883q.f123958f;
        }
        remoteViews.setChronometer(R.id.chronometer, this.f94705a.mo26871c() - (b - qVar.f123962c), "%s", true);
        remoteViews.setTextViewText(R.id.state, uVar.f123980c == 7 ? (String) uVar.f123981d : BuildConfig.FLAVOR);
        return remoteViews;
    }
}

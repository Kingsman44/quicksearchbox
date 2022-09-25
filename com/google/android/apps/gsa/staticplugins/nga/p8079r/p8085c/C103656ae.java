package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80090ae;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80091af;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81126cb;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81127cc;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81128cd;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.ae */
/* compiled from: PG */
public final class C103656ae implements C103651a {

    /* renamed from: a */
    public static final C58974d f288733a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f288734b;

    /* renamed from: c */
    public final C86124t f288735c;

    /* renamed from: d */
    public final NotificationManager f288736d;

    /* renamed from: e */
    public final C58833ax f288737e;

    /* renamed from: f */
    public final C81128cd f288738f;

    public C103656ae(NotificationManager notificationManager, Context context, C86124t tVar, C81128cd cdVar, C58833ax axVar) {
        this.f288736d = notificationManager;
        this.f288734b = context;
        this.f288735c = tVar;
        this.f288738f = cdVar;
        this.f288737e = axVar;
    }

    /* renamed from: b */
    public final PendingIntent mo93824b(String str) {
        PendingIntent a = C147798a.m240895a(this.f288734b, 0, new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        a.getClass();
        return a;
    }

    /* renamed from: c */
    public final C1839z mo93825c(int i, int i2, PendingIntent pendingIntent) {
        C1839z a = C89095d.m144923a(this.f288734b, (String) null);
        a.mo5015d(16, false);
        a.f5685e = C1839z.m5037c(this.f288734b.getString(i));
        a.f5686f = C1839z.m5037c(this.f288734b.getString(i2));
        a.f5690j = 2;
        C1837x xVar = new C1837x();
        xVar.f5669a = C1839z.m5037c(this.f288734b.getString(i2));
        a.mo5022k(xVar);
        a.f5679J.icon = R.drawable.opa_logo;
        a.f5687g = pendingIntent;
        return a;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C47633f fVar;
        if (bnVar.f219917a == 36) {
            int a = C80090ae.m128083a(((C80091af) bnVar.f219918b).f219788b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i != 1) {
                if (i == 2) {
                    if (!this.f288735c.mo79746e(C90110fh.f250678bh) || !this.f288735c.mo79746e(C90126fx.f251205eS)) {
                        C58976aa aaVar = C58975e.f156826a;
                        fVar = C47633f.m84733g(C60856cj.m92900i(false));
                    } else {
                        fVar = C47633f.m84733g(C60922j.m93044g(this.f288738f.f222251a.mo46042d(), C81127cc.f222250a, C60826bg.f164896a)).mo51516i(new C103653ab(this), C60826bg.f164896a);
                    }
                    C60856cj.m92911t(fVar, C47810es.m84974n(new C103655ad()), C60826bg.f164896a);
                }
            } else if (this.f288735c.mo79746e(C90126fx.f251050bW)) {
                C60856cj.m92911t(C60922j.m93044g(this.f288738f.f222251a.mo46042d(), C81126cb.f222249a, C60826bg.f164896a), new C103654ac(this), C60826bg.f164896a);
            }
            return C60856cj.m92900i(C80275dd.f220288c);
        }
        C59104x d = f288733a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HfSettingsNotifHandler");
        ((C58970a) ((C58970a) d).mo56372aa(21628)).mo56386p("Invalid request, skipping sending the notification.");
        return C60856cj.m92899h(new IllegalArgumentException("HandsfreeSettingsDeprecationNotificationRequest is not populated."));
    }
}

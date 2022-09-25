package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83744c;
import com.google.android.apps.gsa.opa.smartspace.C83796l;
import com.google.android.apps.gsa.opa.smartspace.C83801q;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50709au;
import com.google.assistant.p3886c.C50710av;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.h */
/* compiled from: PG */
public final class C110695h implements C83796l {

    /* renamed from: a */
    public static final C59071e f308452a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.h");

    /* renamed from: b */
    private final C91189au f308453b;

    /* renamed from: c */
    private final Context f308454c;

    /* renamed from: d */
    private final C60888db f308455d;

    public C110695h(Context context, C91189au auVar, C60888db dbVar) {
        this.f308454c = context;
        this.f308453b = auVar;
        this.f308455d = dbVar;
    }

    /* renamed from: b */
    private final PendingIntent m184405b(Intent intent, C50701am amVar, String str) {
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.smartspace.SmartspaceTrampolineActivity")).addFlags(402653184);
        Context context = this.f308454c;
        int i = amVar.f131953N + 1000000;
        intent.putExtra("EXTRA_GUARD_FLAG", "fKgFlIyrPSgS7zcayDoI");
        if (str != null) {
            intent.setIdentifier(str);
        }
        return PendingIntent.getActivity(context, i, intent, 201326592);
    }

    /* renamed from: c */
    private final C60870cx m184406c(C83802r rVar, C50710av avVar) {
        int a = C50709au.m85889a(avVar.f131967b);
        if (a == 0 || a == 1) {
            return C60856cj.m92900i(rVar);
        }
        return C47633f.m84733g(this.f308453b.mo85418e(Uri.parse(avVar.f131968c), 7)).mo51515h(new C110666f(rVar), this.f308455d).mo51513e(Exception.class, new C110685g(rVar), this.f308455d);
    }

    /* renamed from: a */
    public final C60870cx mo77189a(C50738bc bcVar) {
        int i = bcVar.f132035b;
        if (i == 6) {
            Intent intent = new Intent();
            intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_EXTRA_QUERY", bcVar.f132035b == 6 ? (String) bcVar.f132036c : BuildConfig.FLAVOR);
            C50701am a = C50701am.m85887a(bcVar.f132040g);
            if (a == null) {
                a = C50701am.UNKNOWN;
            }
            intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_TYPE_EXTRA", a.f131953N);
            C50701am a2 = C50701am.m85887a(bcVar.f132040g);
            if (a2 == null) {
                a2 = C50701am.UNKNOWN;
            }
            PendingIntent b = m184405b(intent, a2, bcVar.f132038e);
            C83801q e = C83802r.m133487e();
            C83744c cVar = (C83744c) e;
            cVar.f228273c = C58833ax.m90834k(bcVar);
            cVar.f228271a = C58833ax.m90834k(b);
            C83802r a3 = e.mo77069a();
            C50710av avVar = bcVar.f132039f;
            if (avVar == null) {
                avVar = C50710av.f131964d;
            }
            return m184406c(a3, avVar);
        } else if (i != 7 && i != 8) {
            return C60856cj.m92899h(new IllegalStateException("No chips content"));
        } else {
            C58976aa aaVar = C58975e.f156826a;
            Intent intent2 = new Intent();
            intent2.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_EXTRA", bcVar.toByteArray());
            C50701am a4 = C50701am.m85887a(bcVar.f132040g);
            if (a4 == null) {
                a4 = C50701am.UNKNOWN;
            }
            intent2.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_TYPE_EXTRA", a4.f131953N);
            C50701am a5 = C50701am.m85887a(bcVar.f132040g);
            if (a5 == null) {
                a5 = C50701am.UNKNOWN;
            }
            PendingIntent b2 = m184405b(intent2, a5, bcVar.f132038e);
            C83801q e2 = C83802r.m133487e();
            C83744c cVar2 = (C83744c) e2;
            cVar2.f228273c = C58833ax.m90834k(bcVar);
            cVar2.f228271a = C58833ax.m90834k(b2);
            C83802r a6 = e2.mo77069a();
            C50710av avVar2 = bcVar.f132039f;
            if (avVar2 == null) {
                avVar2 = C50710av.f131964d;
            }
            return m184406c(a6, avVar2);
        }
    }
}

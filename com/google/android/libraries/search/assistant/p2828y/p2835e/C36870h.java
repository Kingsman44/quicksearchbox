package com.google.android.libraries.search.assistant.p2828y.p2835e;

import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3917i.p3918a.C51262be;
import com.google.assistant.p3897e.p3917i.p3918a.C51264bg;
import com.google.assistant.p3897e.p3917i.p3918a.C51265bh;
import com.google.assistant.p3897e.p3917i.p3918a.C51269bl;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.assistant.y.e.h */
/* compiled from: PG */
public final class C36870h {

    /* renamed from: a */
    public static final C59071e f96017a = C59071e.m91332i("com.google.android.libraries.search.assistant.y.e.h");

    /* renamed from: b */
    private final Context f96018b;

    /* renamed from: c */
    private final C46877q f96019c;

    /* renamed from: d */
    private final ScheduledExecutorService f96020d;

    /* renamed from: e */
    private final Executor f96021e;

    public C36870h(C46877q qVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f96018b = context;
        this.f96019c = qVar;
        this.f96020d = scheduledExecutorService;
        this.f96021e = executor;
    }

    /* renamed from: c */
    private final boolean m65560c() {
        return this.f96018b.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* renamed from: a */
    public final C60870cx mo40429a(C36866d dVar) {
        Uri uri;
        TelephonyManager telephonyManager = (TelephonyManager) C39239a.m68666a(this.f96018b, C39226b.TAG_CLASSIC_ASSISTANT).getSystemService("phone");
        if (telephonyManager == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C51265bh bhVar = (C51265bh) C51270bm.f133476f.createBuilder();
        if (telephonyManager.getSimState() == 1) {
            C51269bl blVar = C51269bl.SIM_STATE_ABSENT;
            bhVar.copyOnWrite();
            C51270bm bmVar = (C51270bm) bhVar.instance;
            bmVar.f133480c = Integer.valueOf(blVar.f133475f);
            bmVar.f133479b = 3;
            return C60856cj.m92900i(C58833ax.m90834k((C51270bm) bhVar.build()));
        } else if (telephonyManager.getSimState() != 5) {
            C51269bl blVar2 = C51269bl.INVALID_SIM_STATE;
            bhVar.copyOnWrite();
            C51270bm bmVar2 = (C51270bm) bhVar.instance;
            bmVar2.f133480c = Integer.valueOf(blVar2.f133475f);
            bmVar2.f133479b = 3;
            return C60856cj.m92900i(C58833ax.m90834k((C51270bm) bhVar.build()));
        } else {
            C51262be beVar = (C51262be) C51264bg.f133454g.createBuilder();
            try {
                String simOperator = telephonyManager.getSimOperator();
                if (!TextUtils.isEmpty(simOperator)) {
                    beVar.mo53564c(Integer.parseInt(simOperator));
                }
            } catch (SecurityException e) {
                ((C59052c) ((C59052c) ((C59052c) f96017a.mo56226d()).mo56382g(e)).mo56372aa(52373)).mo56386p("SecurityException when reading MCCMNC");
            } catch (NumberFormatException e2) {
                ((C59052c) ((C59052c) ((C59052c) f96017a.mo56226d()).mo56382g(e2)).mo56372aa(52374)).mo56386p("Unexpected MCCMNC number");
            }
            try {
                String simOperatorName = telephonyManager.getSimOperatorName();
                if (!TextUtils.isEmpty(simOperatorName)) {
                    beVar.mo53565d(simOperatorName);
                }
            } catch (SecurityException e3) {
                ((C59052c) ((C59052c) ((C59052c) f96017a.mo56226d()).mo56382g(e3)).mo56372aa(52372)).mo56386p("SecurityException when reading SPN value");
            }
            if (dVar.mo40425a()) {
                try {
                    String groupIdLevel1 = telephonyManager.getGroupIdLevel1();
                    if (!TextUtils.isEmpty(groupIdLevel1)) {
                        beVar.mo53563b(groupIdLevel1);
                    }
                } catch (SecurityException e4) {
                    ((C59052c) ((C59052c) ((C59052c) f96017a.mo56226d()).mo56382g(e4)).mo56372aa(52371)).mo56386p("SecurityException when reading GID1 value");
                }
            }
            try {
                if (telephonyManager.isNetworkRoaming()) {
                    beVar.copyOnWrite();
                    C51264bg bgVar = (C51264bg) beVar.instance;
                    bgVar.f133461f = 1;
                    bgVar.f133456a |= 2;
                } else {
                    beVar.copyOnWrite();
                    C51264bg bgVar2 = (C51264bg) beVar.instance;
                    bgVar2.f133461f = 2;
                    bgVar2.f133456a |= 2;
                }
            } catch (SecurityException e5) {
                ((C59052c) ((C59052c) ((C59052c) f96017a.mo56226d()).mo56382g(e5)).mo56372aa(52370)).mo56386p("SecurityException when reading isNetworkRoaming");
                beVar.copyOnWrite();
                C51264bg bgVar3 = (C51264bg) beVar.instance;
                bgVar3.f133461f = 0;
                bgVar3.f133456a = 2 | bgVar3.f133456a;
            }
            C46877q qVar = this.f96019c;
            if (m65560c()) {
                uri = Telephony.Carriers.CONTENT_URI;
            } else {
                uri = Uri.parse("content://telephony/carriers/");
            }
            return C47633f.m84733g(qVar.mo50872b(Uri.withAppendedPath(uri, "preferapn"), new String[]{mo40430b()}, (String) null, (String[]) null, (String) null).f121591a.mo57272e(C47810es.m84970j(new C36867e(this)), this.f96020d).mo57275g()).mo51515h(new C36868f(beVar, bhVar), this.f96021e).mo51513e(Exception.class, C36869g.f96016a, C60826bg.f164896a);
        }
    }

    /* renamed from: b */
    public final String mo40430b() {
        m65560c();
        return "apn";
    }
}

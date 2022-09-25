package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a.C131847h;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131866i;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10029e.C131875a;
import com.google.android.gms.common.api.C143843o;
import com.google.android.gms.location.C144876ag;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37165c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.u */
/* compiled from: PG */
public final class C131921u implements C47102r {

    /* renamed from: a */
    public static final C59071e f360205a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.automation.routines.receiver.u");

    /* renamed from: b */
    public final Context f360206b;

    /* renamed from: c */
    public final C46325t f360207c;

    /* renamed from: d */
    public final C46175b f360208d;

    /* renamed from: e */
    public final Executor f360209e;

    /* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.u$a */
    /* compiled from: PG */
    interface C131922a {
        /* renamed from: bo */
        C131847h mo110347bo();

        /* renamed from: bp */
        C131875a mo110348bp();

        /* renamed from: fJ */
        C37165c mo110349fJ();

        /* renamed from: g */
        C131866i mo110350g();
    }

    public C131921u(Context context, C46325t tVar, C46175b bVar, Executor executor) {
        this.f360206b = context;
        this.f360207c = tVar;
        this.f360208d = bVar;
        this.f360209e = executor;
    }

    /* renamed from: c */
    private static C60870cx m214371c(String str) {
        InternalError internalError = new InternalError(str);
        C59104x c = f360205a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "RoutineGeofenceListener");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(internalError)).mo56372aa(39466)).mo56384n();
        return C60856cj.m92899h(internalError);
    }

    /* renamed from: a */
    public final C131922a mo110346a(AccountId accountId) {
        return (C131922a) C47245e.m84045a(this.f360206b, C131922a.class, accountId);
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        C59104x b = f360205a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "RoutineGeofenceListener");
        ((C59052c) ((C59052c) b).mo56372aa(39469)).mo56386p("#onReceive(Info)");
        C144876ag a = C144876ag.m235472a(intent);
        if (a == null) {
            return m214371c("Invalid intent");
        }
        if (a.mo120370b()) {
            Object[] objArr = new Object[1];
            int i2 = a.f391823a;
            switch (i2) {
                case 1000:
                    str = "GEOFENCE_NOT_AVAILABLE";
                    break;
                case 1001:
                    str = "GEOFENCE_TOO_MANY_GEOFENCES";
                    break;
                case 1002:
                    str = "GEOFENCE_TOO_MANY_PENDING_INTENTS";
                    break;
                case 1004:
                    str = "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
                    break;
                default:
                    str = C143843o.m233808a(i2);
                    break;
            }
            objArr[0] = str;
            return m214371c(String.format("Failed to receive geofencing event: %s", objArr));
        }
        int i3 = a.f391824b;
        if (i3 == 4 || i3 == 2) {
            List list = a.f391825c;
            if (list == null || list.isEmpty()) {
                return m214371c("No geofences triggered");
            }
            return C47633f.m84733g(C60856cj.m92906o((List) Collection.EL.stream(list).map(new C131911k(this)).collect(C58370cn.f155946a))).mo51515h(C131910j.f360185a, this.f360209e);
        }
        return m214371c(String.format("Invalid geofence transition type: %s", new Object[]{Integer.valueOf(i3)}));
    }
}

package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a.C131847h;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10025c.C131857f;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131870m;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131871n;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131874q;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3861at.afy;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.m */
/* compiled from: PG */
public final /* synthetic */ class C131913m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131921u f360189a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f360190b;

    /* renamed from: c */
    public final /* synthetic */ ParcelableGeofence f360191c;

    public /* synthetic */ C131913m(C131921u uVar, AccountId accountId, ParcelableGeofence parcelableGeofence) {
        this.f360189a = uVar;
        this.f360190b = accountId;
        this.f360191c = parcelableGeofence;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C131921u uVar = this.f360189a;
        AccountId accountId = this.f360190b;
        ParcelableGeofence parcelableGeofence = this.f360191c;
        afy afy = (afy) obj;
        if (!parcelableGeofence.f391867a.contains("#routines_standalone#")) {
            optional = Optional.empty();
        } else {
            C131870m mVar = (C131870m) C131871n.f360106g.createBuilder();
            float f = parcelableGeofence.f391872f;
            mVar.copyOnWrite();
            C131871n nVar = (C131871n) mVar.instance;
            nVar.f360108a |= 1;
            nVar.f360109b = f;
            C62910ar j = C62948a.m95459j((long) parcelableGeofence.f391874h);
            mVar.copyOnWrite();
            C131871n nVar2 = (C131871n) mVar.instance;
            j.getClass();
            nVar2.f360111d = j;
            nVar2.f360108a |= 4;
            C62910ar j2 = C62948a.m95459j((long) parcelableGeofence.f391875i);
            mVar.copyOnWrite();
            C131871n nVar3 = (C131871n) mVar.instance;
            j2.getClass();
            nVar3.f360112e = j2;
            nVar3.f360108a |= 8;
            mVar.copyOnWrite();
            C131871n nVar4 = (C131871n) mVar.instance;
            nVar4.f360108a |= 16;
            int i = 0;
            nVar4.f360113f = false;
            C131871n nVar5 = (C131871n) mVar.build();
            String str = parcelableGeofence.f391867a;
            int indexOf = str.indexOf("#routines_standalone#");
            C58838bb.m90880o(indexOf > 0, "The Geofence ID '%s' does not contain the standalone delimiter '%s' at valid index (%s)", str, "#routines_standalone#", Integer.valueOf(indexOf));
            int i2 = indexOf + 21;
            int indexOf2 = str.indexOf("@", i2);
            C58838bb.m90880o(indexOf2 > i2, "The Geofence ID '%s' does not contain the standalone params delimiter '%s' at valid index (%s)", str, "@", Integer.valueOf(indexOf2));
            String substring = str.substring(indexOf2 + 1);
            C58838bb.m90866a(substring, "Geofence ID substring for standalone app geofence parameters cannot be null");
            int indexOf3 = substring.indexOf("#", 0);
            while (indexOf3 >= i) {
                String substring2 = substring.substring(i, indexOf3);
                C58838bb.m90879n(C131857f.m214334c(substring2), "Non-integer parameter '%s' in Geofence ID substring for standalone app geofence parameters '%s'", substring2, substring);
                i = indexOf3 + 1;
                indexOf3 = substring.indexOf("#", i);
            }
            String substring3 = substring.substring(i);
            C58838bb.m90879n(C131857f.m214334c(substring3), "Non-integer parameter '%s' in Geofence ID substring for standalone app geofence parameters '%s'", substring3, substring);
            C131870m mVar2 = (C131870m) nVar5.toBuilder();
            C62910ar k = C62948a.m95460k(Long.parseLong(substring));
            mVar2.copyOnWrite();
            C131871n nVar6 = (C131871n) mVar2.instance;
            k.getClass();
            nVar6.f360110c = k;
            nVar6.f360108a |= 2;
            optional = Optional.m71637of((C131871n) mVar2.build());
        }
        C131847h bo = uVar.mo110346a(accountId).mo110347bo();
        if (afy.f129191b.isEmpty() || bo.f360070d || !bo.f360069c) {
            C59104x d = C131921u.f360205a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RoutineGeofenceListener");
            ((C59052c) ((C59052c) d).mo56372aa(39470)).mo56386p("Skipping geofence re-registration");
            return C60856cj.m92900i(C131874q.f360119c);
        }
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(new C131915o(uVar, accountId, afy, optional)), uVar.f360209e)).mo51513e(Throwable.class, C131916p.f360198a, uVar.f360209e);
    }
}

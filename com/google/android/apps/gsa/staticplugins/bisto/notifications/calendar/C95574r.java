package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.content.ContentValues;
import android.provider.CalendarContract;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.r */
/* compiled from: PG */
public final /* synthetic */ class C95574r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95577u f267458a;

    public /* synthetic */ C95574r(C95577u uVar) {
        this.f267458a = uVar;
    }

    public final void run() {
        C95577u uVar = this.f267458a;
        C58480gp e = C58485gu.m89837e();
        long b = uVar.f267468e.mo26870b();
        for (C95565i iVar : uVar.f267471h.mo89505d(b - C95577u.f267463c, b)) {
            if (iVar.mo89461a() == 0 && uVar.mo89515e(iVar.mo89467f(), iVar.mo89465e())) {
                C95571o oVar = uVar.f267471h;
                long d = iVar.mo89464d();
                ContentValues contentValues = new ContentValues();
                contentValues.put("state", 1);
                int update = oVar.f267454b.update(CalendarContract.CalendarAlerts.CONTENT_URI, contentValues, String.format("%s = ? AND %s = ?", new Object[]{"_id", "state"}), new String[]{String.valueOf(d), "0"});
                if (update > 1) {
                    C59104x d2 = C95571o.f267453a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "CalendarContractWrapper");
                    ((C59052c) ((C59052c) d2).mo56372aa(16141)).mo56388r("More than one entry is updated in CalendarAlerts for id = %d", d);
                }
                if (update > 0) {
                    AnnounceableEvent g = iVar.mo89504g();
                    e.mo55395g(uVar.mo89511a(g, Long.valueOf(iVar.mo89462b())));
                    uVar.mo89514d(g);
                } else {
                    C59104x d3 = C95577u.f267461a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "CalendarManager");
                    ((C59052c) ((C59052c) d3).mo56372aa(16157)).mo56388r("Failed to set alert id=%d to fired state.", iVar.mo89464d());
                }
            }
        }
        uVar.mo89512b(e.mo55394f());
    }
}

package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.database.Cursor;
import android.provider.CalendarContract;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.q */
/* compiled from: PG */
public final /* synthetic */ class C95573q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95577u f267457a;

    public /* synthetic */ C95573q(C95577u uVar) {
        this.f267457a = uVar;
    }

    public final void run() {
        Cursor query;
        C95577u uVar = this.f267457a;
        HashSet hashSet = new HashSet();
        C58976aa aaVar = C58975e.f156826a;
        C95571o oVar = uVar.f267471h;
        ArrayList<C95567k> arrayList = new ArrayList<>();
        try {
            query = oVar.f267454b.query(CalendarContract.Calendars.CONTENT_URI, new String[]{"account_name"}, (String) null, (String[]) null, (String) null);
            while (query != null) {
                if (!query.moveToNext()) {
                    break;
                }
                arrayList.add(new C95560d(C95571o.m158230c(query, "account_name")));
            }
            if (query != null) {
                query.close();
            }
        } catch (RuntimeException e) {
            C59104x d = C95571o.f267453a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CalendarContractWrapper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(16138)).mo56386p("Error getting calendar info.");
        } catch (Throwable th) {
            C95564h.m158199a(th, th);
        }
        for (C95567k a : arrayList) {
            String a2 = a.mo89476a();
            if (!C58837ba.m90859h(a2)) {
                hashSet.add(a2);
            }
        }
        uVar.f267473j.addAll(hashSet);
        long b = uVar.f267468e.mo26870b();
        for (C95565i iVar : uVar.f267471h.mo89505d(b - C95577u.f267462b, b)) {
            if (uVar.mo89515e(iVar.mo89467f(), iVar.mo89465e())) {
                uVar.mo89514d(iVar.mo89504g());
            }
        }
        return;
        throw th;
    }
}

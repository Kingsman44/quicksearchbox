package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58704ox;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.p */
/* compiled from: PG */
public final /* synthetic */ class C95572p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95577u f267455a;

    /* renamed from: b */
    public final /* synthetic */ long f267456b;

    public /* synthetic */ C95572p(C95577u uVar, long j) {
        this.f267455a = uVar;
        this.f267456b = j;
    }

    public final void run() {
        Cursor query;
        Throwable th;
        C95577u uVar = this.f267455a;
        long j = this.f267456b;
        uVar.f267472i.remove(Long.valueOf(j));
        C58480gp e = C58485gu.m89837e();
        C95571o oVar = uVar.f267471h;
        ArrayList<C95569m> arrayList = new ArrayList<>();
        try {
            Uri.Builder buildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
            ContentUris.appendId(buildUpon, j);
            ContentUris.appendId(buildUpon, j);
            String format = String.format("%s = ?", new Object[]{"begin"});
            String[] strArr = {String.valueOf(j)};
            query = oVar.f267454b.query(buildUpon.build(), (String[]) C58704ox.m90448a(new String[]{"_id", "event_id", "begin"}, C95568l.m158212k(), String.class), format, strArr, (String) null);
            while (query != null) {
                if (!query.moveToNext()) {
                    break;
                }
                long b = C95571o.m158229b(query, "event_id");
                arrayList.add(new C95562f(C95571o.m158229b(query, "_id"), b, C95571o.m158229b(query, "begin"), C95568l.m158211j(b, query)));
            }
            if (query != null) {
                query.close();
            }
        } catch (RuntimeException e2) {
            C59104x d = C95571o.f267453a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CalendarContractWrapper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(16139)).mo56386p("Error getting instance info.");
        } catch (Throwable th2) {
            C95564h.m158199a(th, th2);
        }
        for (C95569m mVar : arrayList) {
            if (uVar.mo89515e(mVar.mo89495d(), mVar.mo89494c())) {
                C95568l d2 = mVar.mo89495d();
                e.mo55395g(uVar.mo89511a(AnnounceableEvent.m158167g(mVar.mo89492a(), mVar.mo89493b(), d2.mo89484e(), d2.mo89482c(), d2.mo89483d(), mVar.mo89494c()), (Long) null));
            }
        }
        uVar.mo89512b(e.mo55394f());
        return;
        throw th;
    }
}

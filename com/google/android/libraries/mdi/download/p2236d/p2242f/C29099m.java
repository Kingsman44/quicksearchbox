package com.google.android.libraries.mdi.download.p2236d.p2242f;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29324dh;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29329dm;
import com.google.android.libraries.mdi.download.C29330dn;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29333dq;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29662ie;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42792p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.p4433bz.p4437b.C57907l;
import com.google.p4433bz.p4437b.C57909n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.mdi.download.d.f.m */
/* compiled from: PG */
public final class C29099m {
    /* renamed from: a */
    public static long m54005a(C29334dr drVar) {
        if (drVar.f79509k == 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(drVar.f79509k);
    }

    /* renamed from: b */
    public static Uri m54006b(Context context, C58833ax axVar, C29328dl dlVar, C29334dr drVar) {
        Uri.Builder buildUpon = m54007c(context, axVar, drVar).buildUpon();
        if (dlVar.f79486o.isEmpty()) {
            String str = dlVar.f79474c;
            buildUpon.appendPath(str.substring(str.lastIndexOf("/") + 1));
        } else {
            for (String str2 : dlVar.f79486o.split("/", -1)) {
                if (!str2.isEmpty()) {
                    buildUpon.appendPath(str2);
                }
            }
        }
        return buildUpon.build();
    }

    /* renamed from: c */
    public static Uri m54007c(Context context, C58833ax axVar, C29334dr drVar) {
        String str;
        if (!drVar.f79520v.isEmpty()) {
            str = drVar.f79520v;
        } else {
            str = drVar.f79501c;
        }
        int a = C29332dp.m54217a(drVar.f79507i);
        if (a == 0) {
            a = 1;
        }
        return C29090d.m53981b(context, axVar).buildUpon().appendPath(C29090d.m53985f(a)).build().buildUpon().appendPath(str).build();
    }

    /* renamed from: d */
    public static C29334dr m54008d(C29334dr drVar, long j) {
        C29330dn dnVar = drVar.f79500b;
        if (dnVar == null) {
            dnVar = C29330dn.f79488g;
        }
        C29329dm dmVar = (C29329dm) dnVar.toBuilder();
        dmVar.copyOnWrite();
        C29330dn dnVar2 = (C29330dn) dmVar.instance;
        dnVar2.f79490a |= 1;
        dnVar2.f79491b = j;
        C29330dn dnVar3 = (C29330dn) dmVar.build();
        C29333dq dqVar = (C29333dq) drVar.toBuilder();
        dqVar.copyOnWrite();
        C29334dr drVar2 = (C29334dr) dqVar.instance;
        dnVar3.getClass();
        drVar2.f79500b = dnVar3;
        drVar2.f79499a |= 1;
        return (C29334dr) dqVar.build();
    }

    /* renamed from: e */
    public static String m54009e(C29328dl dlVar) {
        return m54011g(dlVar) ? dlVar.f79479h : dlVar.f79477f;
    }

    /* renamed from: f */
    public static void m54010f(Context context, C58833ax axVar, C29334dr drVar, C42813k kVar) {
        Uri c = m54007c(context, axVar, drVar);
        if (kVar.mo45894h(c)) {
            C42792p pVar = new C42792p();
            pVar.f112057a = true;
            Void voidR = (Void) kVar.mo45889c(c, pVar);
        }
    }

    /* renamed from: g */
    public static boolean m54011g(C29328dl dlVar) {
        if ((dlVar.f79472a & 32) == 0) {
            return false;
        }
        C57909n nVar = dlVar.f79478g;
        if (nVar == null) {
            nVar = C57909n.f154891b;
        }
        for (C57907l lVar : nVar.f154893a) {
            if (lVar.f154889a == 4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m54012h(long j, C29662ie ieVar) {
        return j <= ieVar.mo34498a();
    }

    /* renamed from: i */
    public static boolean m54013i(C29328dl dlVar) {
        return m54016l(dlVar, new C58759qy("inlinefile"));
    }

    /* renamed from: j */
    public static boolean m54014j(C29334dr drVar) {
        if (!drVar.f79511m) {
            return false;
        }
        for (C29328dl dlVar : drVar.f79512n) {
            int a = C29324dh.m54215a(dlVar.f79483l);
            if (a != 0 && a == 2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m54015k(C29328dl dlVar) {
        return m54016l(dlVar, C58528ij.m90011K("file", "asset"));
    }

    /* renamed from: l */
    private static boolean m54016l(C29328dl dlVar, C58528ij ijVar) {
        if ((dlVar.f79472a & 2) != 0) {
            int indexOf = dlVar.f79474c.indexOf(58);
            C58838bb.m90887v(indexOf >= 0, "Invalid url: %s", dlVar.f79474c);
            String substring = dlVar.f79474c.substring(0, indexOf);
            C58800sl lA = ijVar.iterator();
            while (lA.hasNext()) {
                if (C58890d.m90990e(substring, (String) lA.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}

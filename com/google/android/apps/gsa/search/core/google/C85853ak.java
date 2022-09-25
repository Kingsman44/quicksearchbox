package com.google.android.apps.gsa.search.core.google;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.gms.appdatasearch.C142787ac;
import com.google.android.libraries.gcoreclient.p1753c.C21451a;
import com.google.android.libraries.gcoreclient.p1753c.C21479b;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21453aa;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21472t;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21473u;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.google.ak */
/* compiled from: PG */
public final class C85853ak implements C85852aj {

    /* renamed from: a */
    private static final C59071e f232137a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.ak");

    /* renamed from: b */
    private final Context f232138b;

    /* renamed from: c */
    private final C84425ag f232139c;

    /* renamed from: d */
    private final C21473u f232140d;

    public C85853ak(Context context, C84425ag agVar) {
        this.f232138b = context;
        this.f232139c = agVar;
        C21472t tVar = new C21472t();
        C142787ac acVar = tVar.f59912a;
        acVar.f387579c = true;
        acVar.f387577a = true;
        tVar.mo26951b(new C21453aa("name"));
        tVar.mo26951b(new C21453aa("package_name"));
        tVar.mo26951b(new C21453aa("last_update_millis"));
        this.f232140d = tVar.mo26950a();
    }

    /* renamed from: a */
    public final List mo79487a() {
        long j;
        int i;
        long j2;
        C21479b h = this.f232139c.mo78001h(BuildConfig.FLAVOR, "com.google.android.gms", new String[]{"apps"}, 1000, this.f232140d);
        ArrayList arrayList = new ArrayList();
        if (h == null || h.mo26945a() == 0) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            C21451a b = h.mo26953b();
            while (b.hasNext()) {
                C21454b bVar = (C21454b) b.next();
                String h2 = bVar.f59905a.mo117712h("package_name");
                try {
                    PackageInfo packageInfo = this.f232138b.getPackageManager().getPackageInfo(h2, 0);
                    j2 = packageInfo.lastUpdateTime;
                    try {
                        i = packageInfo.versionCode;
                        j = j2;
                    } catch (PackageManager.NameNotFoundException e) {
                        e = e;
                        C59104x d = f232137a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "IcingAppLookupImpl");
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7853)).mo56389s("Failed to get PackageInfo for Package Name %s.", h2);
                        j = j2;
                        i = 0;
                        arrayList.add(new C86066h(bVar.f59905a.mo117712h("name"), h2, i, j));
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    e = e2;
                    j2 = 0;
                    C59104x d2 = f232137a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "IcingAppLookupImpl");
                    ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(7853)).mo56389s("Failed to get PackageInfo for Package Name %s.", h2);
                    j = j2;
                    i = 0;
                    arrayList.add(new C86066h(bVar.f59905a.mo117712h("name"), h2, i, j));
                }
                arrayList.add(new C86066h(bVar.f59905a.mo117712h("name"), h2, i, j));
            }
        }
        return arrayList;
    }
}

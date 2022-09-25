package com.google.android.apps.gsa.searchbox.p6942a;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.gms.appdatasearch.C142805b;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.p10735a.C142779i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143848t;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.searchbox.a.a */
/* compiled from: PG */
public final class C88532a extends C90888av {

    /* renamed from: b */
    private static final C59071e f239267b = C59071e.m91332i("com.google.android.apps.gsa.searchbox.a.a");

    /* renamed from: a */
    public final UsageInfo f239268a;

    /* renamed from: c */
    private final Context f239269c;

    public C88532a(Context context, UsageInfo usageInfo) {
        super("IcingUsageReport", 2, 8);
        this.f239269c = context;
        this.f239268a = usageInfo;
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        C143848t tVar = new C143848t(this.f239269c);
        tVar.mo119296c(C142805b.f387602b);
        C143851w a = tVar.mo119294a();
        ConnectionResult c = a.mo119130c(2, TimeUnit.SECONDS);
        if (c.mo119068b()) {
            try {
                Status status = (Status) a.mo119159d(new C142779i(a, new UsageInfo[]{this.f239268a})).mo117316a();
                if (!status.mo119097c()) {
                    C59104x c2 = f239267b.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "IcingUsageReportRunnabl");
                    ((C59052c) ((C59052c) c2).mo56372aa(9896)).mo56389s("Failed to report usage: %s", status);
                }
            } finally {
                a.mo119132g();
            }
        } else {
            C59104x c3 = f239267b.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "IcingUsageReportRunnabl");
            ((C59052c) ((C59052c) c3).mo56372aa(9897)).mo56389s("Failed to connect when reporting usage: %s", c);
        }
    }
}

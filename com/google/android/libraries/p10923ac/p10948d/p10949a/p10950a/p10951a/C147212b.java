package com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a;

import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.mdh.C145030g;
import com.google.android.gms.mdh.C145076j;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncSubPolicy;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21645j;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21646k;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21649n;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21650o;
import com.google.android.libraries.p10923ac.p10924a.C146759b;
import com.google.android.libraries.p10923ac.p10924a.C146761d;
import com.google.android.libraries.p10923ac.p10924a.C146765h;
import com.google.android.libraries.p10923ac.p10924a.C146768k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.ac.d.a.a.a.b */
/* compiled from: PG */
public final class C147212b {
    /* renamed from: a */
    public static final C21646k m240067a(C146765h hVar) {
        C146759b bVar = (C146759b) hVar;
        int i = bVar.f396284a;
        if (i == 1) {
            return C21645j.m40759a(SyncPolicy.m235678a());
        }
        if (i != 2) {
            return new C21646k(SyncPolicy.f392029b);
        }
        C145030g a = SyncPolicy.m235678a();
        SyncSubPolicy syncSubPolicy = m240068b(bVar.f396287d).f60000a;
        SyncSubPolicy syncSubPolicy2 = a.f392052e;
        boolean z = false;
        C143919bh.m233960c(syncSubPolicy2 == null || !syncSubPolicy2.mo120542a(syncSubPolicy), "Sync policy is more eager than sync policy with listener");
        a.f392051d = syncSubPolicy;
        a.f392048a = 2;
        SyncSubPolicy syncSubPolicy3 = m240068b(bVar.f396288e).f60000a;
        C143919bh.m233960c(!syncSubPolicy3.mo120542a(a.f392051d), "Sync policy is more eager than sync policy with listener");
        a.f392052e = syncSubPolicy3;
        a.f392048a = 2;
        SyncSubPolicy syncSubPolicy4 = m240068b(bVar.f396285b).f60000a;
        SyncSubPolicy syncSubPolicy5 = a.f392050c;
        if (syncSubPolicy5 == null || !syncSubPolicy5.mo120542a(syncSubPolicy4)) {
            z = true;
        }
        C143919bh.m233960c(z, "Sync policy is more eager than sync policy with listener");
        a.f392049b = syncSubPolicy4;
        a.f392048a = 2;
        SyncSubPolicy syncSubPolicy6 = m240068b(bVar.f396286c).f60000a;
        C143919bh.m233960c(true ^ syncSubPolicy6.mo120542a(a.f392049b), "Sync policy is more eager than sync policy with listener");
        a.f392050c = syncSubPolicy6;
        a.f392048a = 2;
        Integer num = bVar.f396289f;
        if (num != null) {
            a.f392053f = num;
            a.f392048a = 2;
        }
        return C21645j.m40759a(a);
    }

    /* renamed from: b */
    private static final C21650o m240068b(C146768k kVar) {
        C146761d dVar = (C146761d) kVar;
        if (!dVar.f396293a) {
            C145076j jVar = new C145076j();
            jVar.f392139a = false;
            jVar.f392140b = 0;
            return C21649n.m40760a(jVar);
        }
        C145076j jVar2 = new C145076j();
        int i = dVar.f396294b;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        jVar2.f392139a = true;
        jVar2.f392140b = (int) timeUnit.toSeconds((long) i);
        return C21649n.m40760a(jVar2);
    }
}

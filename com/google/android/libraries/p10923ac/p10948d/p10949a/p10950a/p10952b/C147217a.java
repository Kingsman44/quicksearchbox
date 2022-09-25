package com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10952b;

import android.os.Parcelable;
import com.google.android.gms.mdh.C145024a;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21638c;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21641f;
import com.google.android.libraries.p10923ac.p10947c.C147199a;
import com.google.android.libraries.p10923ac.p10947c.C147204f;
import com.google.android.libraries.p10923ac.p10947c.C147206h;
import com.google.android.libraries.p10923ac.p10947c.C147207i;
import com.google.protobuf.C62917ay;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.ac.d.a.a.b.a */
/* compiled from: PG */
public final class C147217a {
    /* renamed from: a */
    public static final C21638c m240073a(C147204f fVar) {
        if (fVar == null) {
            return null;
        }
        Parcelable.Creator creator = LatestFootprintFilter.CREATOR;
        ArrayList arrayList = new ArrayList();
        for (C147207i iVar : ((C147199a) fVar).f397414a) {
            C145024a.m235681b(iVar.mo124019b(), iVar.mo124018a(), arrayList);
        }
        return new C21638c(C145024a.m235680a(arrayList));
    }

    /* renamed from: b */
    public static final C147206h m240074b(C21641f fVar, C62917ay ayVar) {
        if (fVar == null) {
            return null;
        }
        MdhFootprint mdhFootprint = fVar.f59994a;
        return new C147206h(mdhFootprint.f392020a, mdhFootprint.f392021b, mdhFootprint.f392022c, ayVar);
    }
}

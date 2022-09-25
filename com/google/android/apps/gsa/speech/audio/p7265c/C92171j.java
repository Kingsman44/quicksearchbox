package com.google.android.apps.gsa.speech.audio.p7265c;

import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.audio.c.j */
/* compiled from: PG */
public final class C92171j {

    /* renamed from: a */
    private static final C59071e f256957a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.c.j");

    /* renamed from: b */
    private final C68214a f256958b;

    /* renamed from: c */
    private final C90021c f256959c;

    public C92171j(C68214a aVar, C90021c cVar) {
        this.f256958b = aVar;
        this.f256959c = cVar;
    }

    /* renamed from: a */
    public final boolean mo86834a() {
        int a = (int) this.f256959c.mo79743a(C90014bt.f247263dp);
        C84516aa aaVar = (C84516aa) this.f256958b.mo27525b();
        switch (a) {
            case 0:
                return false;
            case 1:
                boolean isDeviceLocked = aaVar.f230023b.isDeviceLocked();
                C58976aa aaVar2 = C58975e.f156826a;
                return isDeviceLocked;
            case 2:
                return !aaVar.mo78230d();
            case 3:
                boolean isDeviceLocked2 = aaVar.f230023b.isDeviceLocked();
                C58976aa aaVar3 = C58975e.f156826a;
                return isDeviceLocked2 && !aaVar.mo78230d();
            case 4:
                boolean isDeviceLocked3 = aaVar.f230023b.isDeviceLocked();
                C58976aa aaVar4 = C58975e.f156826a;
                return isDeviceLocked3 || !aaVar.mo78230d();
            case 5:
            case 6:
            case 7:
                return true;
            default:
                C59052c cVar = (C59052c) f256957a.mo56225c();
                cVar.mo56378ag(C58975e.f156826a, "NewEarconPolicy");
                ((C59052c) cVar.mo56372aa(12158)).mo56387q("Invalid mode value: %d", a);
                return false;
        }
    }
}

package com.google.android.libraries.search.p3047m.p3051c;

import android.os.Build;
import com.google.android.libraries.search.integrations.p3018c.C38509h;
import com.google.android.libraries.search.p3047m.p3048a.C39217a;
import com.google.android.libraries.search.p3047m.p3051c.p3053b.C39238a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59700co;
import com.google.common.p4552o.C59703cr;
import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.m.c.a */
/* compiled from: PG */
public final class C39230a implements C39217a {

    /* renamed from: a */
    private final C59700co f103353a;

    /* renamed from: b */
    private final Set f103354b;

    public C39230a(C59700co coVar, Set set) {
        this.f103353a = coVar;
        this.f103354b = set;
    }

    /* renamed from: a */
    public final void mo41729a(String str, String str2, C59703cr crVar, String str3, Integer num) {
        char c;
        C39230a aVar = this;
        String str4 = str;
        String str5 = str2;
        C59703cr crVar2 = crVar;
        String str6 = str3;
        boolean z = true;
        if (!C39237b.f103373a.containsKey(str5)) {
            c = 1;
        } else {
            c = !((C58528ij) C39237b.f103373a.get(str5)).contains(str4) ? (char) 2 : 3;
        }
        if (c == 3) {
            return;
        }
        if (str4.equals("android:bluetooth_connect") && str5 == null) {
            return;
        }
        if (str4.equals("android:read_contacts") && str5 == null && str6 != null && str6.contains("com.google.android.gms")) {
            return;
        }
        if (str4.equals("android:record_audio") && str5 == null && str6 != null && str6.equals("Sound trigger phrase recognition.")) {
            return;
        }
        if (str4.equals("android:record_audio") && str5 == null && str6 != null && Build.VERSION.SDK_INT == 30 && (str6.equals("Legacy AppOpsManager.startOpNoThrow call") || str6.equals("Legacy AppOpsManager.noteOp call"))) {
            return;
        }
        if (!str4.equals("android:system_alert_window") || str5 != null || crVar2 != C59703cr.SYNC) {
            for (C39238a aVar2 : aVar.f103354b) {
                C59700co coVar = aVar.f103353a;
                if (!crVar2.equals(C59703cr.ASYNC) || !coVar.equals(C59700co.INTERACTOR)) {
                    C61301b bVar = new C61301b(C61284a.NO_USER_DATA, str4);
                    C61301b bVar2 = new C61301b(C61284a.NON_TEXTUAL_INTERACTION_USER_DATA, str5);
                    C61301b bVar3 = new C61301b(C61284a.NO_USER_DATA, crVar.name());
                    C61284a aVar3 = C61284a.NO_USER_DATA;
                    C61301b bVar4 = new C61301b(aVar3, c != z ? "ERROR_ATTRIBUTION_ID_IS_NOT_MAPPED_TO_PERMISSION" : "ERROR_ATTRIBUTION_ID_DOESNT_EXIST");
                    C61301b bVar5 = new C61301b(aVar3, coVar.name());
                    C61301b bVar6 = new C61301b(C61284a.NON_TEXTUAL_INTERACTION_USER_DATA, aVar2.f103375b.mo41732a(str6, num, coVar));
                    C59052c cVar = (C59052c) ((C59052c) C39238a.f103374a.mo56225c()).mo56381f(C38509h.f101868a);
                    cVar.mo56380ai(C58979ad.FULL);
                    ((C59052c) cVar.mo56372aa(53204)).mo56362O("VIOLATION IN PERMISSION USAGE - op %s\nattributionTag %s\nopType %s\nresult %s\nagsaProcess %s\nmessage %s", bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
                    aVar = this;
                    z = true;
                }
            }
        }
    }
}

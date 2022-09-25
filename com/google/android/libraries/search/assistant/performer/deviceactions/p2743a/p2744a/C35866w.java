package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.app.PendingIntent;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import androidx.core.p097i.C1970e;
import androidx.slice.C4110i;
import androidx.slice.Slice;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.apps.tiktok.dataservice.C46740bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52112fr;
import com.google.assistant.p3897e.p3921j.C52114ft;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.w */
/* compiled from: PG */
public final class C35866w {

    /* renamed from: a */
    public static final C59071e f93973a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.w");

    /* renamed from: b */
    private final C60887da f93974b;

    /* renamed from: c */
    private final AudioManager f93975c;

    public C35866w(AudioManager audioManager, C60887da daVar) {
        this.f93975c = audioManager;
        this.f93974b = daVar;
    }

    /* renamed from: b */
    public final boolean mo39873b(AudioManager audioManager, C63490p pVar, int i) {
        int a = C35864u.m64259a(pVar.name());
        if (!C35787a.f93746b.contains(pVar)) {
            return false;
        }
        audioManager.adjustStreamVolume(a, i, 0);
        return true;
    }

    /* renamed from: c */
    public final boolean mo39874c(C35841bc bcVar, C63490p pVar, int i) {
        if (mo39873b(this.f93975c, pVar, i)) {
            ((C59052c) ((C59052c) f93973a.mo56224b()).mo56372aa(51919)).mo56386p("Successfully mute/unmute.");
            return true;
        } else if (i == -100) {
            return m64266d(bcVar, 7, 3, C59203do.f157270a);
        } else {
            if (i != 100) {
                ((C59052c) ((C59052c) f93973a.mo56225c()).mo56372aa(51918)).mo56352E("Error mute/unmute stream volume, setting = %s, direction = %d.", pVar.name(), i);
                return false;
            } else if (this.f93975c.getStreamVolume(C35864u.m64259a(pVar.name())) == 0) {
                return m64266d(bcVar, 5, 1, C59203do.f157270a);
            } else {
                return true;
            }
        }
    }

    /* renamed from: d */
    public static boolean m64266d(C35841bc bcVar, int i, int i2, double d) {
        int i3;
        int i4;
        int i5;
        C1970e d2;
        C1970e d3;
        C35841bc bcVar2 = bcVar;
        Slice slice = bcVar2.f93925f;
        if (slice == null) {
            i3 = -1;
        } else {
            i3 = new C4110i(bcVar2.f93921b, slice).mo8613b();
        }
        if (i3 == -1) {
            return false;
        }
        Slice slice2 = bcVar2.f93925f;
        if (slice2 == null || (d3 = new C4110i(bcVar2.f93921b, slice2).mo8615d()) == null) {
            i4 = -1;
        } else {
            i4 = ((Integer) d3.f5888a).intValue();
        }
        Slice slice3 = bcVar2.f93925f;
        if (slice3 == null || (d2 = new C4110i(bcVar2.f93921b, slice3).mo8615d()) == null) {
            i5 = -1;
        } else {
            i5 = ((Integer) d2.f5889b).intValue();
        }
        if (i4 == -1 || i5 == -1 || i5 - i4 <= 0) {
            return false;
        }
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        int f = C35864u.m64264f(i6, i7, C35864u.m64263e(i6, i7, d, i8, i9, i10), i8, i9, i10);
        if (f == -1) {
            return false;
        }
        Slice slice4 = bcVar2.f93925f;
        if (slice4 == null) {
            ((C59052c) ((C59052c) C35841bc.f93920a.mo56226d()).mo56372aa(51974)).mo56386p("Cannot set slider setting, no slice.");
            return false;
        }
        PendingIntent c = new C4110i(bcVar2.f93921b, slice4).mo8614c();
        if (c != null) {
            return bcVar.mo39865c(c, new Intent().putExtra("android.app.slice.extra.RANGE_VALUE", f));
        }
        ((C59052c) ((C59052c) C35841bc.f93920a.mo56226d()).mo56372aa(51973)).mo56386p("Cannot set slider setting, no Pending Intent.");
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo39872a(C35862s sVar, C52115fu fuVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C35862s sVar2 = sVar;
        C52115fu fuVar2 = fuVar;
        int i = fuVar2.f136755a;
        if ((i & 2) != 0) {
            int i2 = fuVar2.f136757c;
            int b = C52112fr.m86508b(i2);
            int i3 = 1;
            if (b == 0) {
                b = 1;
            }
            switch (b - 1) {
                case 1:
                    return sVar.mo39870c("1");
                case 2:
                    return sVar.mo39870c("0");
                case 3:
                    return C60922j.m93045h(sVar.mo39869b(), C47810es.m84966f(new C35856m(sVar)), sVar2.f93957e);
                case 4:
                case 5:
                    break;
                case 6:
                    if ((i & 32) != 0) {
                        return sVar.mo39870c(Integer.toString(fuVar2.f136761g));
                    }
                    break;
                default:
                    C59052c cVar = (C59052c) ((C59052c) f93973a.mo56226d()).mo56372aa(51912);
                    int b2 = C52112fr.m86508b(fuVar2.f136757c);
                    if (b2 != 0) {
                        i3 = b2;
                    }
                    cVar.mo56389s("Unsupported change type %s", C52112fr.m86507a(i3));
                    return C60856cj.m92900i(false);
            }
            int b3 = C52112fr.m86508b(i2);
            int i4 = b3 == 0 ? 1 : b3;
            int a = C52114ft.m86509a(fuVar2.f136759e);
            int i5 = a == 0 ? 1 : a;
            double d = fuVar2.f136758d;
            Uri c = C35864u.m64261c(sVar2.f93955c);
            if (c == null) {
                ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51872)).mo56386p("Null uri when querying range min value.");
                cxVar = C60856cj.m92900i(-1);
            } else {
                cxVar = C60846c.m92878g(sVar.mo39868a(c).f121591a.mo57272e(C47810es.m84970j(new C35848e(sVar)), sVar2.f93956d).mo57275g(), C46740bx.class, C35849f.f93939a, C60826bg.f164896a);
            }
            C60870cx cxVar4 = cxVar;
            Uri c2 = C35864u.m64261c(sVar2.f93955c);
            if (c2 == null) {
                ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51871)).mo56386p("Null uri when querying range min value.");
                cxVar2 = C60856cj.m92900i(-1);
            } else {
                cxVar2 = C60846c.m92878g(sVar.mo39868a(c2).f121591a.mo57272e(C47810es.m84970j(new C35851h(sVar)), sVar2.f93956d).mo57275g(), C46740bx.class, C35855l.f93946a, C60826bg.f164896a);
            }
            C60870cx cxVar5 = cxVar2;
            Uri c3 = C35864u.m64261c(sVar2.f93955c);
            if (c3 == null) {
                ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51870)).mo56386p("Null uri when querying range current value.");
                cxVar3 = C60856cj.m92900i(-1);
            } else {
                cxVar3 = C60846c.m92878g(sVar.mo39868a(c3).f121591a.mo57272e(C47810es.m84970j(new C35861r(sVar)), sVar2.f93956d).mo57275g(), C46740bx.class, C35838b.f93916a, C60826bg.f164896a);
            }
            C60870cx cxVar6 = cxVar3;
            return C60856cj.m92893b(cxVar4, cxVar5, cxVar6).mo57335b(C47810es.m84965e(new C35865v(cxVar4, cxVar5, cxVar6, sVar, i4, i5, d)), this.f93974b);
        }
        throw new C35471g("ModiySettingArgs does not have change.");
    }
}

package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.android.libraries.social.populous.p3296e.p3298b.C42418ao;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42419ap;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42421ar;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42430i;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4535g.C59203do;
import java.util.Map;

/* renamed from: com.google.android.libraries.social.populous.e.c.v */
/* compiled from: PG */
public final class C42495v {

    /* renamed from: a */
    public static final /* synthetic */ int f111435a = 0;

    /* renamed from: b */
    private static final Map f111436b;

    /* renamed from: c */
    private static final C58485gu f111437c;

    /* renamed from: d */
    private static final C58485gu f111438d;

    /* renamed from: e */
    private C58485gu f111439e;

    /* renamed from: f */
    private C58485gu f111440f;

    /* renamed from: g */
    private final C42473ax f111441g;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C42419ap.TIMES_CONTACTED, C42477d.f111417a);
        gzVar.mo55429h(C42419ap.SECONDS_SINCE_LAST_TIME_CONTACTED, C42494u.f111434a);
        gzVar.mo55429h(C42419ap.IS_SECONDARY_GOOGLE_ACCOUNT, C42478e.f111418a);
        gzVar.mo55429h(C42419ap.FIELD_TIMES_USED, C42479f.f111419a);
        gzVar.mo55429h(C42419ap.FIELD_SECONDS_SINCE_LAST_TIME_USED, C42480g.f111420a);
        gzVar.mo55429h(C42419ap.IS_CONTACT_STARRED, C42481h.f111421a);
        gzVar.mo55429h(C42419ap.HAS_POSTAL_ADDRESS, C42482i.f111422a);
        gzVar.mo55429h(C42419ap.HAS_NICKNAME, C42483j.f111423a);
        gzVar.mo55429h(C42419ap.HAS_BIRTHDAY, C42484k.f111424a);
        gzVar.mo55429h(C42419ap.HAS_CUSTOM_RINGTONE, C42485l.f111425a);
        gzVar.mo55429h(C42419ap.HAS_AVATAR, C42486m.f111426a);
        gzVar.mo55429h(C42419ap.IS_SENT_TO_VOICEMAIL, C42487n.f111427a);
        gzVar.mo55429h(C42419ap.IS_PINNED, C42488o.f111428a);
        gzVar.mo55429h(C42419ap.PINNED_POSITION, C42489p.f111429a);
        gzVar.mo55429h(C42419ap.NUM_COMMUNICATION_CHANNELS, C42490q.f111430a);
        gzVar.mo55429h(C42419ap.NUM_RAW_CONTACTS, C42491r.f111431a);
        gzVar.mo55429h(C42419ap.FIELD_IS_PRIMARY, C42492s.f111432a);
        gzVar.mo55429h(C42419ap.FIELD_IS_SUPER_PRIMARY, C42493t.f111433a);
        f111436b = gzVar.mo55427f(true);
        C42430i iVar = new C42430i();
        iVar.mo45442c(C42419ap.TIMES_CONTACTED);
        iVar.mo45443d(1.5d);
        iVar.mo45441b(0.25d);
        f111437c = C58485gu.m89846n(iVar.mo45440a());
        C42430i iVar2 = new C42430i();
        iVar2.mo45442c(C42419ap.FIELD_TIMES_USED);
        iVar2.mo45443d(1.5d);
        iVar2.mo45441b(0.25d);
        f111438d = C58485gu.m89846n(iVar2.mo45440a());
    }

    protected C42495v(long j, String str, C58485gu guVar) {
        if (guVar == null || guVar.isEmpty()) {
            this.f111439e = f111437c;
            this.f111440f = f111438d;
        } else {
            C58480gp e = C58485gu.m89837e();
            C58480gp e2 = C58485gu.m89837e();
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C42421ar arVar = (C42421ar) guVar.get(i2);
                if (arVar.mo45446c().f111260t) {
                    e.mo55395g(arVar);
                } else {
                    e2.mo55395g(arVar);
                }
            }
            C58485gu f = e.mo55394f();
            this.f111439e = f;
            if (f.isEmpty()) {
                this.f111439e = f111437c;
            }
            C58485gu f2 = e2.mo55394f();
            this.f111440f = f2;
            if (f2.isEmpty()) {
                this.f111440f = f111438d;
            }
        }
        this.f111441g = new C42498y(j, str);
    }

    /* renamed from: a */
    public static double m74905a(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            return 1.0d;
        }
        return C59203do.f157270a;
    }

    /* renamed from: b */
    public static double m74906b(Integer num) {
        return num == null ? C59203do.f157270a : num.doubleValue();
    }

    /* renamed from: c */
    public final double mo45515c(C42418ao aoVar) {
        double d;
        C58485gu guVar = this.f111439e;
        int i = ((C58724pq) guVar).f156474d;
        double d2 = 0.0d;
        for (int i2 = 0; i2 < i; i2++) {
            C42421ar arVar = (C42421ar) guVar.get(i2);
            double a = ((C42474ay) f111436b.get(arVar.mo45446c())).mo45514a(aoVar, this.f111441g);
            double b = arVar.mo45445b();
            double a2 = arVar.mo45444a();
            if (a == C59203do.f157270a) {
                d = 0.0d;
            } else {
                d = b * Math.pow(a, a2);
            }
            d2 += d;
        }
        return d2;
    }
}

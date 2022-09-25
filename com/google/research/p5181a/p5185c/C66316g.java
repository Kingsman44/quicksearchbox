package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.research.a.c.g */
/* compiled from: PG */
public abstract class C66316g {

    /* renamed from: j */
    C66323n f180329j;

    /* renamed from: k */
    protected final Map f180330k;

    public C66316g() {
        HashMap hashMap = new HashMap();
        this.f180330k = hashMap;
        hashMap.put(mo59509d(), true);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.research.p5181a.p5185c.C66316g m96951o(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1759465079: goto L_0x0071;
                case -1462077706: goto L_0x0067;
                case -600286442: goto L_0x005c;
                case -600259761: goto L_0x0052;
                case 231045441: goto L_0x0048;
                case 798733742: goto L_0x003d;
                case 1128652520: goto L_0x0033;
                case 1209446567: goto L_0x0029;
                case 1230062828: goto L_0x001f;
                case 1395605682: goto L_0x0015;
                case 1987523306: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x007b
        L_0x0009:
            java.lang.String r0 = "lat_lng_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 9
            goto L_0x007c
        L_0x0015:
            java.lang.String r0 = "feature_aggregator"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 4
            goto L_0x007c
        L_0x001f:
            java.lang.String r0 = "place_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 7
            goto L_0x007c
        L_0x0029:
            java.lang.String r0 = "headset_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 6
            goto L_0x007c
        L_0x0033:
            java.lang.String r0 = "app_usage_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 1
            goto L_0x007c
        L_0x003d:
            java.lang.String r0 = "foreground_time_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 10
            goto L_0x007c
        L_0x0048:
            java.lang.String r0 = "day_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 3
            goto L_0x007c
        L_0x0052:
            java.lang.String r0 = "dl_usage_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 2
            goto L_0x007c
        L_0x005c:
            java.lang.String r0 = "public_place_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 8
            goto L_0x007c
        L_0x0067:
            java.lang.String r0 = "app_launch_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 0
            goto L_0x007c
        L_0x0071:
            java.lang.String r0 = "hour_extractor"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007b
            r1 = 5
            goto L_0x007c
        L_0x007b:
            r1 = -1
        L_0x007c:
            switch(r1) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00b7;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00ab;
                case 4: goto L_0x00a5;
                case 5: goto L_0x009f;
                case 6: goto L_0x0099;
                case 7: goto L_0x0093;
                case 8: goto L_0x008d;
                case 9: goto L_0x0087;
                case 10: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            r1 = 0
            return r1
        L_0x0081:
            com.google.research.a.c.h r1 = new com.google.research.a.c.h
            r1.<init>()
            return r1
        L_0x0087:
            com.google.research.a.c.k r1 = new com.google.research.a.c.k
            r1.<init>()
            return r1
        L_0x008d:
            com.google.research.a.c.m r1 = new com.google.research.a.c.m
            r1.<init>()
            return r1
        L_0x0093:
            com.google.research.a.c.l r1 = new com.google.research.a.c.l
            r1.<init>()
            return r1
        L_0x0099:
            com.google.research.a.c.i r1 = new com.google.research.a.c.i
            r1.<init>()
            return r1
        L_0x009f:
            com.google.research.a.c.j r1 = new com.google.research.a.c.j
            r1.<init>()
            return r1
        L_0x00a5:
            com.google.research.a.c.f r1 = new com.google.research.a.c.f
            r1.<init>()
            return r1
        L_0x00ab:
            com.google.research.a.c.d r1 = new com.google.research.a.c.d
            r1.<init>()
            return r1
        L_0x00b1:
            com.google.research.a.c.e r1 = new com.google.research.a.c.e
            r1.<init>()
            return r1
        L_0x00b7:
            com.google.research.a.c.c r1 = new com.google.research.a.c.c
            r1.<init>()
            return r1
        L_0x00bd:
            com.google.research.a.c.a r1 = new com.google.research.a.c.a
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.research.p5181a.p5185c.C66316g.m96951o(java.lang.String):com.google.research.a.c.g");
    }

    /* renamed from: q */
    public static String m96952q(C66316g gVar) {
        if ((gVar instanceof C66310a) && !(gVar instanceof C66312c)) {
            return "app_launch_extractor";
        }
        if (gVar instanceof C66312c) {
            return "app_usage_extractor";
        }
        if (gVar instanceof C66314e) {
            return "dl_usage_extractor";
        }
        if (gVar instanceof C66313d) {
            return "day_extractor";
        }
        if (gVar instanceof C66315f) {
            return "feature_aggregator";
        }
        if (gVar instanceof C66318i) {
            return "headset_extractor";
        }
        if (gVar instanceof C66319j) {
            return "hour_extractor";
        }
        if (gVar instanceof C66321l) {
            return "place_extractor";
        }
        if (gVar instanceof C66322m) {
            return "public_place_extractor";
        }
        if (gVar instanceof C66320k) {
            return "lat_lng_extractor";
        }
        if (gVar instanceof C66317h) {
            return "foreground_time_extractor";
        }
        return null;
    }

    /* renamed from: s */
    public static String m96953s(C66316g gVar) {
        String q = m96952q(gVar);
        if (q != null) {
            return q;
        }
        return null;
    }

    /* renamed from: a */
    public abstract int mo59505a();

    /* renamed from: b */
    public abstract C66316g clone();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C66343o mo59507c(C66278a aVar, C66376a aVar2);

    /* renamed from: d */
    public abstract String mo59509d();

    /* renamed from: i */
    public void mo59514i(DataInputStream dataInputStream) {
    }

    /* renamed from: k */
    public void mo59516k(DataOutputStream dataOutputStream) {
    }

    /* renamed from: l */
    public void mo59526l(C66323n nVar) {
        this.f180329j = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo59524m(boolean z) {
        this.f180330k.put(mo59509d(), Boolean.valueOf(z));
    }

    /* renamed from: p */
    public final C66343o mo59527p(C66278a aVar, C66376a aVar2) {
        C66343o c = mo59507c(aVar, aVar2);
        boolean z = false;
        int i = 0;
        loop0:
        while (true) {
            if (i >= c.f180407a) {
                z = true;
                break;
            }
            int i2 = 0;
            while (true) {
                int i3 = c.f180408b;
                if (i2 >= i3) {
                    break;
                } else if (Math.abs(c.f180409c[(i3 * i) + i2]) > 1.0E-9d) {
                    break loop0;
                } else {
                    i2++;
                }
            }
            i++;
        }
        mo59524m(z);
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo59528r(Integer num) {
        C66323n nVar = this.f180329j;
        if (nVar != null) {
            nVar.mo59523j(this, num.intValue());
        }
    }
}

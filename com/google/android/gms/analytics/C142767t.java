package com.google.android.gms.analytics;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.internal.C142712ai;
import com.google.android.gms.analytics.internal.C142715al;
import com.google.android.gms.analytics.internal.C142718ao;
import com.google.android.gms.analytics.internal.C142720aq;
import com.google.android.gms.analytics.internal.C142721ar;
import com.google.android.gms.analytics.internal.C142722as;
import com.google.android.gms.analytics.internal.C142731ba;
import com.google.android.gms.analytics.internal.C142738h;
import com.google.android.gms.analytics.internal.C142742l;
import com.google.android.gms.analytics.internal.C142750t;
import com.google.android.gms.analytics.p10733a.C142680a;
import com.google.android.gms.analytics.p10733a.C142685f;
import com.google.android.gms.common.internal.C143919bh;
import com.google.common.p4535g.C59203do;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.t */
/* compiled from: PG */
public final class C142767t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f387404a;

    /* renamed from: b */
    final /* synthetic */ String f387405b;

    /* renamed from: c */
    final /* synthetic */ long f387406c;

    /* renamed from: d */
    final /* synthetic */ boolean f387407d;

    /* renamed from: e */
    final /* synthetic */ boolean f387408e;

    /* renamed from: f */
    final /* synthetic */ String f387409f;

    /* renamed from: g */
    final /* synthetic */ C142769v f387410g;

    public C142767t(C142769v vVar, Map map, String str, long j, boolean z, boolean z2, String str2) {
        this.f387410g = vVar;
        this.f387404a = map;
        this.f387405b = str;
        this.f387406c = j;
        this.f387407d = z;
        this.f387408e = z2;
        this.f387409f = str2;
    }

    public final void run() {
        double d;
        Map map = this.f387404a;
        C142698e a = this.f387410g.f387328e.mo117541a();
        C143919bh.m233965h("getClientId can not be called from the main thread");
        String b = a.f387167a.mo117546f().mo117491b();
        if (b != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", b);
        }
        String str = (String) this.f387404a.get("sf");
        if (str != null) {
            try {
                d = Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                d = 100.0d;
            }
            if (C142731ba.m231607g(d, (String) this.f387404a.get("cid"))) {
                this.f387410g.mo117536i(3, "Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d), (Object) null, (Object) null);
                return;
            }
        }
        this.f387410g.f387328e.mo117543c();
        this.f387404a.remove("ate");
        this.f387404a.remove("adid");
        C142750t e = this.f387410g.f387328e.mo117545e();
        e.mo117537k();
        C142680a aVar = e.f387374a;
        C142731ba.m231604d(this.f387404a, "an", aVar.f387169a);
        C142731ba.m231604d(this.f387404a, "av", aVar.f387170b);
        C142731ba.m231604d(this.f387404a, "aid", aVar.f387171c);
        C142731ba.m231604d(this.f387404a, "aiid", aVar.f387172d);
        this.f387404a.put("v", "1");
        this.f387404a.put("_v", C142738h.f387331b);
        C142731ba.m231604d(this.f387404a, "ul", this.f387410g.f387328e.f387339g.mo117503b().f387186a);
        Map map2 = this.f387404a;
        C142712ai aiVar = this.f387410g.f387328e.f387339g;
        aiVar.mo117537k();
        C142685f b2 = aiVar.mo117503b();
        C142731ba.m231604d(map2, "sr", b2.f387187b + "x" + b2.f387188c);
        if (!this.f387405b.equals("transaction") && !this.f387405b.equals("item")) {
            C142720aq aqVar = this.f387410g.f387413c;
            synchronized (aqVar.f387296c) {
                long currentTimeMillis = System.currentTimeMillis();
                double d2 = aqVar.f387294a;
                if (d2 < 60.0d) {
                    double d3 = (double) (currentTimeMillis - aqVar.f387295b);
                    Double.isNaN(d3);
                    double d4 = d3 / 2000.0d;
                    if (d4 > C59203do.f157270a) {
                        d2 = Math.min(60.0d, d2 + d4);
                        aqVar.f387294a = d2;
                    }
                }
                aqVar.f387295b = currentTimeMillis;
                if (d2 >= 1.0d) {
                    aqVar.f387294a = d2 - 4.0d;
                } else {
                    String str2 = "Excessive " + aqVar.f387297d + " detected; call ignored.";
                    C142722as asVar = C142722as.f387299a;
                    if (asVar != null) {
                        asVar.mo117536i(5, str2, (Object) null, (Object) null, (Object) null);
                    } else if (C142721ar.m231570b()) {
                        Log.w((String) C142715al.f387255b.mo117506a(), str2);
                    }
                    C142709af afVar = C142721ar.f387298a;
                    this.f387410g.f387328e.mo117548h().mo117510c(this.f387404a, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
            }
        }
        long a2 = C142731ba.m231601a((String) this.f387404a.get("ht"));
        if (a2 == 0) {
            a2 = this.f387406c;
        }
        long j = a2;
        if (this.f387407d) {
            this.f387410g.f387328e.mo117548h().mo117536i(4, "Dry run enabled. Would have sent hit", new C142718ao(this.f387410g, this.f387404a, j, this.f387408e), (Object) null, (Object) null);
            return;
        }
        String str3 = (String) this.f387404a.get("cid");
        HashMap hashMap = new HashMap();
        C142731ba.m231605e(hashMap, "uid", this.f387404a);
        C142731ba.m231605e(hashMap, "an", this.f387404a);
        C142731ba.m231605e(hashMap, "aid", this.f387404a);
        C142731ba.m231605e(hashMap, "av", this.f387404a);
        C142731ba.m231605e(hashMap, "aiid", this.f387404a);
        C143919bh.m233958a(str3);
        this.f387404a.put("_s", String.valueOf(this.f387410g.f387328e.mo117544d().mo117530b(new C142742l(str3, this.f387409f, !TextUtils.isEmpty((CharSequence) this.f387404a.get("adid")), hashMap))));
        this.f387410g.f387328e.mo117544d().mo117531c(new C142718ao(this.f387410g, this.f387404a, j, this.f387408e));
    }
}

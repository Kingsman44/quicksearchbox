package com.google.p4017at.p4060h.p4075e.p4076a.p4077a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.h.e.a.a.b */
/* compiled from: PG */
public final class C54265b implements C61373ao {

    /* renamed from: a */
    public static final C31164au f142479a = C31164au.m58092b("google.internal.mothership.weatherapp.v1.WeatherAppService.");

    /* renamed from: b */
    public static final C61372an f142480b = new C54264a();

    /* renamed from: c */
    public static final C54265b f142481c = new C54265b();

    /* renamed from: f */
    private static final C31164au f142482f = C31164au.m58092b("google.internal.mothership.weatherapp.v1.WeatherAppService/");

    /* renamed from: g */
    private static final C31164au f142483g = C31164au.m58092b("weatherapp-pa.googleapis.com");

    /* renamed from: d */
    public final C58485gu f142484d;

    /* renamed from: e */
    public final C58528ij f142485e;

    /* renamed from: h */
    private final C58495hd f142486h;

    static {
        C31164au.m58092b("google.internal.mothership.weatherapp.v1.WeatherAppService");
    }

    private C54265b() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("weatherapp-pa.googleapis.com");
        this.f142484d = e.mo55394f();
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c("https://www.googleapis.com/auth/mothership_search");
        this.f142485e = ihVar.mo55486f();
        C61372an anVar = f142480b;
        new C58759qy(anVar);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GetWeatherApp", anVar);
        this.f142486h = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f142483g;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f142482f.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f142486h.containsKey(substring)) {
            return (C61372an) this.f142486h.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}

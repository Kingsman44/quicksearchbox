package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10082b.C132610b;
import com.google.assistant.p3994s.p3995a.C53232gg;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.co */
/* compiled from: PG */
public final class C124117co {

    /* renamed from: a */
    private final boolean f342795a;

    /* renamed from: b */
    private final boolean f342796b;

    /* renamed from: c */
    private final C62910ar f342797c;

    /* renamed from: d */
    private final boolean f342798d;

    /* renamed from: e */
    private final C62910ar f342799e;

    /* renamed from: f */
    private final C132610b f342800f;

    /* renamed from: g */
    private final C58974d f342801g;

    /* renamed from: h */
    private final boolean f342802h;

    public C124117co(C132610b bVar, C130603a aVar, C62910ar arVar, boolean z, boolean z2, boolean z3, C62910ar arVar2, boolean z4) {
        this.f342795a = z;
        this.f342796b = z2;
        this.f342798d = z3;
        this.f342799e = arVar2;
        this.f342802h = z4;
        this.f342797c = arVar;
        this.f342800f = bVar;
        this.f342801g = aVar.mo109740b(this);
    }

    /* renamed from: a */
    public final boolean mo106294a(C53245gt gtVar, C53245gt gtVar2, Instant instant) {
        boolean z;
        if (!((gtVar.f139567a & 8) == 0 || (gtVar2.f139567a & 8) == 0)) {
            C63042fg fgVar = gtVar.f139572f;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            Instant e = C62950b.m95474e(fgVar);
            C63042fg fgVar2 = gtVar2.f139572f;
            if (fgVar2 == null) {
                fgVar2 = C63042fg.f170152c;
            }
            Instant e2 = C62950b.m95474e(fgVar2);
            C53232gg a = C53232gg.m86789a(gtVar.f139568b);
            if (a == null) {
                a = C53232gg.UNKNOWN;
            }
            C53232gg a2 = C53232gg.m86789a(gtVar2.f139568b);
            if (a2 == null) {
                a2 = C53232gg.UNKNOWN;
            }
            e.toEpochMilli();
            int i = a.f139522g;
            e2.toEpochMilli();
            int i2 = a2.f139522g;
            if (this.f342798d && (a.equals(C53232gg.FLIGHT_LANDING) || a2.equals(C53232gg.FLIGHT_LANDING))) {
                if (!a.equals(C53232gg.FLIGHT_LANDING)) {
                    z = e2.plus(Duration.ofSeconds(this.f342799e.f169860a)).isAfter(e);
                } else if (a2.equals(C53232gg.FLIGHT_LANDING) || a2.equals(C53232gg.WEATHER_WIDGET)) {
                    z = e.isBefore(e2);
                } else {
                    z = e.plus(Duration.ofSeconds(this.f342799e.f169860a)).isBefore(e2);
                }
                if (!z) {
                    ((C58970a) ((C58970a) this.f342801g.mo56226d()).mo56372aa(35425)).mo56386p("Do not override weather after comparing weather from flight landing and other sources.");
                }
                return z;
            } else if (!e.isBefore(e2)) {
                ((C58970a) ((C58970a) this.f342801g.mo56226d()).mo56372aa(35424)).mo56386p("Receive stale weather!");
                return false;
            }
        }
        if (this.f342802h) {
            C53232gg a3 = C53232gg.m86789a(gtVar.f139568b);
            if (a3 == null) {
                a3 = C53232gg.UNKNOWN;
            }
            if (a3.equals(C53232gg.WEATHER_WIDGET)) {
                C63042fg fgVar3 = gtVar.f139572f;
                if (fgVar3 == null) {
                    fgVar3 = C63042fg.f170152c;
                }
                C63042fg f = C62953e.m95481f(fgVar3, this.f342797c);
                if (C62953e.m95476a(f, C62950b.m95472c(instant)) < 0) {
                    ((C58970a) ((C58970a) this.f342801g.mo56226d()).mo56372aa(35421)).mo56388r("Weather widget data expired: expiration time seconds=%d", f.f170154a);
                    this.f342800f.f361909b.mo41677K("expired");
                }
                this.f342800f.f361909b.mo41677K("fresh");
            }
        } else if (this.f342795a && this.f342796b) {
            C53232gg a4 = C53232gg.m86789a(gtVar.f139568b);
            if (a4 == null) {
                a4 = C53232gg.UNKNOWN;
            }
            if (a4.equals(C53232gg.WEATHER_WIDGET)) {
                C63042fg fgVar4 = gtVar.f139572f;
                if (fgVar4 == null) {
                    fgVar4 = C63042fg.f170152c;
                }
                C63042fg f2 = C62953e.m95481f(fgVar4, this.f342797c);
                if (C62953e.m95476a(f2, C62950b.m95472c(instant)) < 0) {
                    ((C58970a) ((C58970a) this.f342801g.mo56226d()).mo56372aa(35422)).mo56388r("Weather widget data expired: expiration time seconds=%d", f2.f170154a);
                    this.f342800f.f361909b.mo41677K("expired");
                    return true;
                }
                this.f342800f.f361909b.mo41677K("fresh");
                C53232gg a5 = C53232gg.m86789a(gtVar2.f139568b);
                if (a5 == null) {
                    a5 = C53232gg.UNKNOWN;
                }
                return a5.equals(C53232gg.WEATHER_WIDGET);
            }
        }
        return true;
    }
}

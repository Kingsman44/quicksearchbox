package com.google.android.libraries.p11016ak.p11019c;

import com.google.android.libraries.p11016ak.C147620aa;
import com.google.android.libraries.p11016ak.C147702d;
import com.google.android.libraries.p11016ak.C147724f;
import com.google.android.libraries.p11016ak.C147743y;
import com.google.android.libraries.p11016ak.p11018b.C147634c;
import com.google.android.libraries.p11016ak.p11019c.p11020a.C147637a;
import com.google.android.libraries.p11016ak.p11019c.p11020a.C147644h;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ScheduledExecutorService;
import p5285d.p5290b.p5291a.p5292a.C68209v;

/* renamed from: com.google.android.libraries.ak.c.u */
/* compiled from: PG */
final class C147697u implements C147637a {

    /* renamed from: a */
    public static final C59071e f398596a = C59071e.m91332i("com.google.android.libraries.ak.c.u");

    /* renamed from: b */
    public final C147636a f398597b;

    /* renamed from: c */
    public final C147634c f398598c;

    /* renamed from: d */
    public final C147644h f398599d;

    /* renamed from: e */
    private final C147620aa f398600e;

    /* renamed from: f */
    private final ScheduledExecutorService f398601f;

    public C147697u(C147620aa aaVar, C147743y yVar, String str, C68209v vVar, ScheduledExecutorService scheduledExecutorService, C147634c cVar, C147644h hVar) {
        this.f398600e = aaVar;
        this.f398597b = new C147636a(yVar, aaVar, str, vVar);
        this.f398601f = scheduledExecutorService;
        this.f398598c = cVar;
        this.f398599d = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo124385a(C147702d dVar) {
        return C147693q.m240768a(this.f398600e.f398437b, new C147694r(this, dVar), this.f398601f);
    }

    /* renamed from: b */
    public final boolean mo124422b(C147702d dVar) {
        if (dVar.f398615a) {
            return true;
        }
        int b = C147724f.m240801b(this.f398600e.f398445j);
        return b != 0 && b == 4;
    }
}

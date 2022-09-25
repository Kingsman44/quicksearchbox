package com.google.android.apps.gsa.sidekick.main.p7203f;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.p489g.C9299q;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C8142xb;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.r */
/* compiled from: PG */
public final class C91388r {

    /* renamed from: a */
    public static final C59071e f254962a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.f.r");

    /* renamed from: b */
    public final EnumMap f254963b = new EnumMap(C8142xb.class);

    /* renamed from: c */
    public final Object f254964c = new Object();

    /* renamed from: d */
    public final C91387q f254965d = new C91387q(this);

    /* renamed from: e */
    public final C21370a f254966e;

    /* renamed from: f */
    public final C69464a f254967f;

    /* renamed from: g */
    private final C86124t f254968g;

    public C91388r(C21370a aVar, C86124t tVar, C69464a aVar2) {
        this.f254966e = aVar;
        this.f254968g = tVar;
        this.f254967f = aVar2;
    }

    /* renamed from: a */
    public final int mo85709a() {
        long seconds;
        long b = this.f254966e.mo26870b();
        long millis = TimeUnit.MINUTES.toMillis(this.f254968g.mo79743a(C90010bp.f246988bd));
        if (mo85710b()) {
            seconds = TimeUnit.MILLISECONDS.toSeconds(b + millis);
        } else {
            seconds = TimeUnit.MILLISECONDS.toSeconds(this.f254965d.mo85707a().f32284c + millis);
        }
        return (int) seconds;
    }

    /* renamed from: b */
    public final boolean mo85710b() {
        int a = (int) this.f254968g.mo79743a(C90010bp.f246988bd);
        C9299q a2 = this.f254965d.mo85707a();
        long j = a2.f32283b;
        if (j >= 0) {
            if (a2.f32284c < j) {
                return true;
            }
            long b = this.f254966e.mo26870b() - a2.f32284c;
            return b >= 0 && b <= TimeUnit.MINUTES.toMillis((long) a);
        }
    }
}

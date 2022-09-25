package com.google.android.libraries.kids.platform.kidonboarding;

import androidx.lifecycle.C2358bf;
import com.google.android.libraries.kids.p1982a.p1985c.p1986a.C24036d;
import com.google.android.libraries.kids.platform.kidonboarding.p1988b.C24043c;
import com.google.apps.tiktok.coroutines.p3632a.C46595ad;
import com.google.apps.tiktok.lifecycle.p3682a.C47415a;
import com.google.p4109av.p4114c.p4115a.p4116a.C54617j;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71571du;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class KidOnboardingViewModel extends C2358bf {

    /* renamed from: a */
    public final C24036d f65693a;

    /* renamed from: b */
    public final C71571du f65694b;

    /* renamed from: c */
    public final C47415a f65695c;

    /* renamed from: d */
    private final C71422aw f65696d;

    /* renamed from: e */
    private final C69464a f65697e;

    /* renamed from: f */
    private final C69464a f65698f;

    /* renamed from: g */
    private final C69464a f65699g;

    public KidOnboardingViewModel(C71422aw awVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C24036d dVar) {
        C69664n.m101061g(awVar, "backgroundScope");
        this.f65696d = awVar;
        this.f65697e = aVar;
        this.f65698f = aVar2;
        this.f65699g = aVar3;
        this.f65693a = dVar;
        C47415a aVar4 = new C47415a();
        this.f65695c = aVar4;
        this.f65694b = C46595ad.m83090a(aVar4.mo51258a(), awVar, new C24060q(this, (C69577g) null));
    }

    /* renamed from: a */
    public final C24043c mo29432a(C54618k kVar) {
        int i = kVar.f143393b;
        int b = C54617j.m87506b(i);
        int i2 = b - 1;
        if (b != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    Object b2 = this.f65698f.mo17428b();
                    C69664n.m101060f(b2, "profileCreationFlowProvider.get()");
                    return (C24043c) b2;
                } else if (i2 == 2) {
                    Object b3 = this.f65699g.mo17428b();
                    C69664n.m101060f(b3, "profileUpgradeFlowProvider.get()");
                    return (C24043c) b3;
                } else if (i2 != 3) {
                    int b4 = C54617j.m87506b(i);
                    C54617j.m87505a(b4);
                    throw new IllegalArgumentException("Invalid flow type ".concat(C54617j.m87505a(b4)));
                }
            }
            Object b5 = this.f65697e.mo17428b();
            C69664n.m101060f(b5, "accountCreationFlowProvider.get()");
            return (C24043c) b5;
        }
        throw null;
    }
}

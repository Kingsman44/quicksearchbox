package com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger;

import com.google.p375ai.p378b.C8178yk;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.a */
/* compiled from: PG */
public final class C91859a extends C91861c {

    /* renamed from: a */
    public C8178yk f256176a;

    /* renamed from: b */
    public String f256177b;

    /* renamed from: c */
    public C57057b f256178c;

    /* renamed from: d */
    public C54806z f256179d;

    /* renamed from: e */
    public int f256180e;

    /* renamed from: f */
    public int f256181f;

    /* renamed from: g */
    private boolean f256182g;

    /* renamed from: h */
    private byte f256183h;

    /* renamed from: a */
    public final C91862d mo86371a() {
        C8178yk ykVar;
        int i;
        if (this.f256183h == 1 && (ykVar = this.f256176a) != null && (i = this.f256180e) != 0) {
            return new C91860b(ykVar, i, this.f256177b, this.f256178c, this.f256179d, this.f256181f, this.f256182g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f256176a == null) {
            sb.append(" veInfo");
        }
        if (this.f256180e == 0) {
            sb.append(" userInteraction");
        }
        if (this.f256183h == 0) {
            sb.append(" useClickTrackingCgi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo86372b(boolean z) {
        this.f256182g = z;
        this.f256183h = 1;
    }
}

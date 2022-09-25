package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import androidx.core.p097i.C1970e;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.e */
/* compiled from: PG */
final class C104640e extends C104625dl {

    /* renamed from: a */
    public C9270n f291352a;

    /* renamed from: b */
    public C7718hj f291353b;

    /* renamed from: c */
    public C1970e f291354c;

    /* renamed from: d */
    public C7718hj f291355d;

    /* renamed from: e */
    private int f291356e;

    /* renamed from: f */
    private byte f291357f;

    /* renamed from: a */
    public final C104626dm mo94278a() {
        C9270n nVar;
        C7718hj hjVar;
        if (this.f291357f == 1 && (nVar = this.f291352a) != null && (hjVar = this.f291353b) != null) {
            return new C104663f(nVar, hjVar, this.f291354c, this.f291355d, this.f291356e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f291352a == null) {
            sb.append(" cardData");
        }
        if (this.f291353b == null) {
            sb.append(" loggingEntry");
        }
        if (this.f291357f == 0) {
            sb.append(" groupIndex");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo94279b(int i) {
        this.f291356e = i;
        this.f291357f = 1;
    }
}

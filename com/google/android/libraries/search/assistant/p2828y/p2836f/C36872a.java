package com.google.android.libraries.search.assistant.p2828y.p2836f;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a */
/* compiled from: PG */
public final class C36872a extends C36905d {

    /* renamed from: a */
    public C58528ij f96026a;

    /* renamed from: b */
    public C58528ij f96027b;

    /* renamed from: c */
    public C58528ij f96028c;

    /* renamed from: d */
    private boolean f96029d;

    /* renamed from: e */
    private byte f96030e;

    /* renamed from: a */
    public final C36906e mo40432a() {
        C58528ij ijVar;
        C58528ij ijVar2;
        C58528ij ijVar3;
        if (this.f96030e == 1 && (ijVar = this.f96026a) != null && (ijVar2 = this.f96027b) != null && (ijVar3 = this.f96028c) != null) {
            return new C36903b(this.f96029d, ijVar, ijVar2, ijVar3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f96030e == 0) {
            sb.append(" useClockAppSelectionDataServiceInPortmon");
        }
        if (this.f96026a == null) {
            sb.append(" supportedAlarmAndroidIntents");
        }
        if (this.f96027b == null) {
            sb.append(" supportedTimerAndroidIntents");
        }
        if (this.f96028c == null) {
            sb.append(" versionedClockApps");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo40433b(boolean z) {
        this.f96029d = z;
        this.f96030e = 1;
    }
}

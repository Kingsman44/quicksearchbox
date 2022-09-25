package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.i */
/* compiled from: PG */
final class C82223i extends C82218d {

    /* renamed from: a */
    private boolean f224705a;

    /* renamed from: b */
    private boolean f224706b;

    /* renamed from: c */
    private byte f224707c;

    public C82223i() {
    }

    public C82223i(C82219e eVar) {
        C82224j jVar = (C82224j) eVar;
        this.f224705a = jVar.f224708a;
        this.f224706b = jVar.f224709b;
        this.f224707c = 3;
    }

    /* renamed from: a */
    public final C82219e mo75559a() {
        if (this.f224707c == 3) {
            return new C82224j(this.f224705a, this.f224706b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f224707c & 1) == 0) {
            sb.append(" assistUiAttached");
        }
        if ((this.f224707c & 2) == 0) {
            sb.append(" inputPlateRendered");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75560b(boolean z) {
        this.f224705a = z;
        this.f224707c = (byte) (this.f224707c | 1);
    }

    /* renamed from: c */
    public final void mo75561c(boolean z) {
        this.f224706b = z;
        this.f224707c = (byte) (this.f224707c | 2);
    }
}

package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.u */
/* compiled from: PG */
final class C78495u extends C78463ee {

    /* renamed from: a */
    private boolean f216175a;

    /* renamed from: b */
    private boolean f216176b;

    /* renamed from: c */
    private C78391bn f216177c;

    /* renamed from: d */
    private byte f216178d;

    /* renamed from: a */
    public final C78464ef mo73380a() {
        C78391bn bnVar;
        if (this.f216178d == 3 && (bnVar = this.f216177c) != null) {
            return new C78496v(this.f216175a, this.f216176b, bnVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f216178d & 1) == 0) {
            sb.append(" shouldFetchContent");
        }
        if ((this.f216178d & 2) == 0) {
            sb.append(" proceedToNotListeningStage");
        }
        if (this.f216177c == null) {
            sb.append(" baseStageInput");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo73381b(C78391bn bnVar) {
        if (bnVar != null) {
            this.f216177c = bnVar;
            return;
        }
        throw new NullPointerException("Null baseStageInput");
    }

    /* renamed from: c */
    public final void mo73382c(boolean z) {
        this.f216176b = z;
        this.f216178d = (byte) (this.f216178d | 2);
    }

    /* renamed from: d */
    public final void mo73383d(boolean z) {
        this.f216175a = z;
        this.f216178d = (byte) (this.f216178d | 1);
    }
}

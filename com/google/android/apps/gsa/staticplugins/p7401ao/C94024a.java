package com.google.android.apps.gsa.staticplugins.p7401ao;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;

/* renamed from: com.google.android.apps.gsa.staticplugins.ao.a */
/* compiled from: PG */
final class C94024a implements C90991b {

    /* renamed from: a */
    public final long f262649a;

    /* renamed from: b */
    public final long f262650b;

    /* renamed from: c */
    public final C118575h f262651c;

    /* renamed from: d */
    public boolean f262652d = false;

    /* renamed from: e */
    public long f262653e = 0;

    public C94024a(long j, long j2, C118575h hVar) {
        this.f262649a = j;
        this.f262650b = j2;
        this.f262651c = hVar == null ? C118575h.UNKNOWN_WORKLOAD : hVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C94024a) && ((C94024a) obj).f262649a == this.f262649a) {
            return true;
        }
        return false;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85281e((Object) null).mo85293t("downloadId=%d isCompleted=%s totalSizeInBytes=%d", C90752i.m148230d(Long.valueOf(this.f262649a)), C90752i.m148228b(Boolean.valueOf(this.f262652d)), C90752i.m148230d(Long.valueOf(this.f262653e)));
    }

    public final int hashCode() {
        return Long.valueOf(this.f262649a).hashCode();
    }
}

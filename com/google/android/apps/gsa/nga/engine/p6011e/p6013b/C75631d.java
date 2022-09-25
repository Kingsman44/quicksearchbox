package com.google.android.apps.gsa.nga.engine.p6011e.p6013b;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.e.b.d */
/* compiled from: PG */
public final class C75631d implements C75157e {

    /* renamed from: a */
    private final C87594r f209952a;

    /* renamed from: b */
    private PlaybackStatus f209953b;

    public C75631d(C87594r rVar) {
        this.f209952a = rVar;
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
    }

    /* renamed from: b */
    public final synchronized void mo71138b(bl blVar) {
        if (blVar == bl.a) {
            this.f209953b = this.f209952a.mo81727f();
        } else if (blVar == bl.c) {
            this.f209953b = null;
        }
    }

    /* renamed from: c */
    public final synchronized Optional mo71766c() {
        return Optional.ofNullable(this.f209953b);
    }
}

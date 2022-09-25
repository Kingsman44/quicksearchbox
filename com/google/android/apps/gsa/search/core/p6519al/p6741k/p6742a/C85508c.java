package com.google.android.apps.gsa.search.core.p6519al.p6741k.p6742a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85515b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.k.a.c */
/* compiled from: PG */
public final class C85508c extends C86731k {

    /* renamed from: c */
    private final long f231351c;

    public C85508c(long j) {
        super("audio", "audio::releaseAudioForSession", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_VOICE);
        this.f231351c = j;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85515b) obj).mo79028c(this.f231351c);
        return C118826c.f331423b;
    }
}

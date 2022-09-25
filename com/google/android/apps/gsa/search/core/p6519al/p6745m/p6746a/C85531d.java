package com.google.android.apps.gsa.search.core.p6519al.p6745m.p6746a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6745m.C85527a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.m.a.d */
/* compiled from: PG */
public final class C85531d extends C86731k {

    /* renamed from: c */
    private final String f231368c;

    public C85531d(String str) {
        super("audioplayer", "audioplayer::releaseMediaSession", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231368c = str;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85527a) obj).mo79046d(this.f231368c);
        return C118826c.f331423b;
    }
}

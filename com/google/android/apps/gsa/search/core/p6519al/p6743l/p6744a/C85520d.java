package com.google.android.apps.gsa.search.core.p6519al.p6743l.p6744a;

import com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.l.a.d */
/* compiled from: PG */
public final class C85520d extends C86731k {

    /* renamed from: c */
    private final String f231361c;

    /* renamed from: d */
    private final boolean f231362d;

    public C85520d(String str, boolean z) {
        super("audiomessage", "audiomessage::playNudgeTts", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f231361c = str;
        this.f231362d = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85516a) obj).mo79035a(this.f231361c, this.f231362d);
    }
}

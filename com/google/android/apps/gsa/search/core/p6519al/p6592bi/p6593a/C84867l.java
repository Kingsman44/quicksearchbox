package com.google.android.apps.gsa.search.core.p6519al.p6592bi.p6593a;

import com.google.android.apps.gsa.search.core.p6519al.p6592bi.C84855a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bi.a.l */
/* compiled from: PG */
public final class C84867l extends C86731k {

    /* renamed from: c */
    private final HotwordResult f230536c;

    /* renamed from: d */
    private final long f230537d;

    public C84867l(HotwordResult hotwordResult, long j) {
        super("microdetection", "microdetection::populatePreambleForQuery", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230536c = hotwordResult;
        this.f230537d = j;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84855a) obj).mo78541i(this.f230536c, this.f230537d);
    }
}

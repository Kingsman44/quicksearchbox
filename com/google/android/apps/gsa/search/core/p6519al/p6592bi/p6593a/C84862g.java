package com.google.android.apps.gsa.search.core.p6519al.p6592bi.p6593a;

import com.google.android.apps.gsa.search.core.p6519al.p6592bi.C84855a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bi.a.g */
/* compiled from: PG */
public final class C84862g extends C86731k {

    /* renamed from: c */
    private final HotwordResult f230534c;

    public C84862g(HotwordResult hotwordResult) {
        super("microdetection", "microdetection::onHotwordRejectedAfterDsp", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230534c = hotwordResult;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84855a) obj).mo78538f(this.f230534c);
    }
}

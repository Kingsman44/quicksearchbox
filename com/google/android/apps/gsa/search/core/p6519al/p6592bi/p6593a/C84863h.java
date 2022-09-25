package com.google.android.apps.gsa.search.core.p6519al.p6592bi.p6593a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6592bi.C84855a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bi.a.h */
/* compiled from: PG */
public final class C84863h extends C86731k {

    /* renamed from: c */
    private final HotwordResult f230535c;

    public C84863h(HotwordResult hotwordResult) {
        super("microdetection", "microdetection::onHotwordResult", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230535c = hotwordResult;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84855a) obj).mo78545m(this.f230535c);
        return C118826c.f331423b;
    }
}

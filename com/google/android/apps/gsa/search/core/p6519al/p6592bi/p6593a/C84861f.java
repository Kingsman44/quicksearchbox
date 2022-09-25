package com.google.android.apps.gsa.search.core.p6519al.p6592bi.p6593a;

import com.google.android.apps.gsa.search.core.p6519al.p6592bi.C84855a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bi.a.f */
/* compiled from: PG */
public final class C84861f extends C86731k {

    /* renamed from: c */
    private final HotwordDetectedEventData f230533c;

    public C84861f(HotwordDetectedEventData hotwordDetectedEventData) {
        super("microdetection", "microdetection::onHotwordDetectedInInteractor", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230533c = hotwordDetectedEventData;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84855a) obj).mo78537e(this.f230533c);
    }
}

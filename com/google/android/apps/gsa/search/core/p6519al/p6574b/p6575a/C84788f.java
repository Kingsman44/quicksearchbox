package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.util.PromptSegment;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.f */
/* compiled from: PG */
public final class C84788f extends C86731k {

    /* renamed from: c */
    private final PromptSegment f230449c;

    /* renamed from: d */
    private final String f230450d;

    /* renamed from: e */
    private final boolean f230451e;

    public C84788f(PromptSegment promptSegment, String str, boolean z) {
        super("actions", "actions::createShowDisplaySegmentEventData", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230449c = promptSegment;
        this.f230450d = str;
        this.f230451e = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78486e(this.f230449c, this.f230450d, this.f230451e);
    }
}

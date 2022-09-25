package com.google.android.apps.gsa.search.core.p6519al.p6709dk.p6710a;

import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85379a;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85385b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.p7294j.C92431a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dk.a.c */
/* compiled from: PG */
public final class C85382c extends C86731k {

    /* renamed from: c */
    private final Query f231175c;

    /* renamed from: d */
    private final C85379a f231176d;

    /* renamed from: e */
    private final C58833ax f231177e;

    /* renamed from: f */
    private final C92431a f231178f;

    public C85382c(Query query, C85379a aVar, C58833ax axVar, C92431a aVar2) {
        super("transcription", "transcription::startTranscription", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f231175c = query;
        this.f231176d = aVar;
        this.f231177e = axVar;
        this.f231178f = aVar2;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85385b) obj).mo78909c(this.f231175c, this.f231176d, this.f231177e, this.f231178f);
    }
}

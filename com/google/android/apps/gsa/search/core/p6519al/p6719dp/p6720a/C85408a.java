package com.google.android.apps.gsa.search.core.p6519al.p6719dp.p6720a;

import com.google.android.apps.gsa.search.core.p6519al.p6719dp.C85407a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8792g.C117676a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dp.a.a */
/* compiled from: PG */
public final class C85408a extends C86731k {

    /* renamed from: c */
    private final C92473f f231205c;

    /* renamed from: d */
    private final C117676a f231206d;

    public C85408a(C117676a aVar, C92473f fVar) {
        super("voice_access", "voice_access::startListening", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f231206d = aVar;
        this.f231205c = fVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85407a) obj).mo78925c(this.f231206d, this.f231205c);
    }
}

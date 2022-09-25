package com.google.android.apps.gsa.search.core.p6519al.p6711dl.p6712a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85386a;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dl.a.c */
/* compiled from: PG */
public final class C85389c extends C86731k {

    /* renamed from: c */
    private final String f231181c;

    /* renamed from: d */
    private final Query f231182d;

    /* renamed from: e */
    private final C90606n f231183e;

    /* renamed from: f */
    private final TtsRequest f231184f;

    /* renamed from: g */
    private final boolean f231185g;

    /* renamed from: h */
    private final boolean f231186h;

    /* renamed from: i */
    private final String f231187i;

    /* renamed from: l */
    private final C85386a f231188l;

    /* renamed from: m */
    private final int f231189m;

    public C85389c(int i, String str, Query query, C90606n nVar, TtsRequest ttsRequest, boolean z, boolean z2, String str2, C85386a aVar) {
        super("tts", "tts::startTtsPlayback", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_VOICE);
        this.f231189m = i;
        this.f231181c = str;
        this.f231182d = query;
        this.f231183e = nVar;
        this.f231184f = ttsRequest;
        this.f231185g = z;
        this.f231186h = z2;
        this.f231187i = str2;
        this.f231188l = aVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85392b) obj).mo78915d(this.f231189m, this.f231181c, this.f231182d, this.f231183e, this.f231184f, this.f231185g, this.f231186h, this.f231187i, this.f231188l);
        return C118826c.f331423b;
    }
}

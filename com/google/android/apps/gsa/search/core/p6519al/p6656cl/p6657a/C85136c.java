package com.google.android.apps.gsa.search.core.p6519al.p6656cl.p6657a;

import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84332u;
import com.google.android.apps.gsa.search.core.p6519al.p6656cl.C85133a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.cl.a.c */
/* compiled from: PG */
public final class C85136c extends C86731k {

    /* renamed from: c */
    private final C84295m f230856c;

    /* renamed from: d */
    private final C89061q f230857d;

    /* renamed from: e */
    private final C92439c f230858e;

    /* renamed from: f */
    private final C84332u f230859f;

    /* renamed from: g */
    private final boolean f230860g;

    /* renamed from: h */
    private final C68214a f230861h;

    public C85136c(C84295m mVar, C89061q qVar, C92439c cVar, C84332u uVar, boolean z, C68214a aVar) {
        super("s3connection", "s3connection::legacyStartNetworkRecognitionFullParams", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_VOICE);
        this.f230856c = mVar;
        this.f230857d = qVar;
        this.f230858e = cVar;
        this.f230859f = uVar;
        this.f230860g = z;
        this.f230861h = aVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85133a) obj).mo78730d(this.f230856c, this.f230857d, this.f230858e, this.f230859f, this.f230860g, this.f230861h);
    }
}

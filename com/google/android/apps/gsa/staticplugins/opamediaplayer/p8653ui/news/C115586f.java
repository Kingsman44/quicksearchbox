package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a.C115142a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115468l;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.p1886a.C22946k;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import dagger.p5294a.C68221g;
import java.util.HashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.f */
/* compiled from: PG */
public final class C115586f implements C22946k {

    /* renamed from: a */
    private final C69464a f320655a;

    /* renamed from: b */
    private final C69464a f320656b;

    /* renamed from: c */
    private final C69464a f320657c;

    /* renamed from: d */
    private final C69464a f320658d;

    /* renamed from: e */
    private final C69464a f320659e;

    /* renamed from: f */
    private final C69464a f320660f;

    public C115586f(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6) {
        this.f320655a = aVar;
        this.f320656b = aVar2;
        this.f320657c = aVar3;
        this.f320658d = aVar4;
        this.f320659e = aVar5;
        this.f320660f = aVar6;
    }

    /* renamed from: a */
    public final C23115k mo28317a() {
        return new C23115k(new HashMap());
    }

    /* renamed from: b */
    public final /* synthetic */ C22939d mo28318b(C22945j jVar) {
        C115468l lVar = new C115468l(jVar);
        C115142a aVar = (C115142a) this.f320656b.mo17428b();
        return new MediaItemInfoPageRenderer(jVar, new C115574au(jVar), (Context) ((C68221g) this.f320655a).f184583a, lVar, (C21370a) this.f320657c.mo17428b(), (C58833ax) ((C68221g) this.f320658d).f184583a, (C22871g) this.f320659e.mo17428b(), (C115620ah) this.f320660f.mo17428b());
    }
}

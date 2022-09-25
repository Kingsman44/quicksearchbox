package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6225y.p6226a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78264n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78810l;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.C78850a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6225y.p6227b.C78894a;
import com.google.android.apps.gsa.nga.engine.warmactions.C79566g;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128541f;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128542g;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.y.a.h */
/* compiled from: PG */
public final class C78892h implements C78728n, C78264n {

    /* renamed from: a */
    public static final C59071e f217087a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.y.a.h");

    /* renamed from: b */
    public static final C58528ij f217088b = C58528ij.m90011K(C78810l.NO_SESSION, C78810l.SUPPRESSED_UI_SESSION);

    /* renamed from: c */
    public static final C128543h f217089c;

    /* renamed from: d */
    public final C78894a f217090d;

    /* renamed from: e */
    private final C78253d f217091e;

    /* renamed from: f */
    private final C83358h f217092f;

    /* renamed from: g */
    private final C83358h f217093g;

    /* renamed from: h */
    private final C22871g f217094h;

    /* renamed from: i */
    private final C78850a f217095i;

    /* renamed from: j */
    private final C83358h f217096j;

    /* renamed from: k */
    private final C83358h f217097k;

    /* renamed from: l */
    private final C83363m f217098l = new C83363m();

    /* renamed from: m */
    private final C83357g f217099m = new C83361k(C79566g.m127644c(C79569ab.f218316f), C78263m.class);

    static {
        C128542g gVar = (C128542g) C128543h.f353464i.createBuilder();
        C128541f fVar = C128541f.NOT_LISTENING;
        gVar.copyOnWrite();
        C128543h hVar = (C128543h) gVar.instance;
        hVar.f353467b = fVar.f353463f;
        hVar.f353466a |= 1;
        f217089c = (C128543h) gVar.build();
    }

    public C78892h(C78253d dVar, C83358h hVar, C83358h hVar2, C22871g gVar, C78850a aVar, C78894a aVar2, C83358h hVar3, C83358h hVar4) {
        this.f217091e = dVar;
        this.f217092f = hVar;
        this.f217093g = hVar2;
        this.f217094h = gVar;
        this.f217095i = aVar;
        this.f217090d = aVar2;
        this.f217096j = hVar3;
        this.f217097k = hVar4;
    }

    /* renamed from: a */
    public final void mo73250a(C79566g gVar) {
        C83349aj.m132647b(this.f217094h, this.f217099m, gVar, "warmActionsState");
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f217098l.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        C83363m mVar = this.f217098l;
        C83358h g = C83349aj.m132652g(this.f217091e.mo73219s(), this.f217099m, this.f217092f, this.f217093g, this.f217096j, this.f217097k, C78885a.f217080a);
        C78850a aVar = this.f217095i;
        Objects.requireNonNull(aVar);
        mVar.mo76663c(g, new C78886b(aVar));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}

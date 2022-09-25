package com.google.android.apps.gsa.staticplugins.p7714cv;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7720d.C98736d;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c.C98998i;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7741d.C99017b;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7742e.C99038b;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7745d.C99085b;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7748f.C99133d;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7750h.C99174d;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7752j.C99213q;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7754k.C99215b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.k */
/* compiled from: PG */
public final class C99219k extends C86734a implements C85107a {

    /* renamed from: a */
    public final C98998i f277570a;

    /* renamed from: b */
    public final C99017b f277571b;

    /* renamed from: c */
    public final C99038b f277572c;

    /* renamed from: f */
    public final C99133d f277573f;

    /* renamed from: g */
    public final C98736d f277574g;

    /* renamed from: h */
    public final C68214a f277575h;

    /* renamed from: i */
    public final C99174d f277576i;

    /* renamed from: j */
    public final C99213q f277577j;

    /* renamed from: k */
    public final C99215b f277578k;

    /* renamed from: l */
    public final C99085b f277579l;

    /* renamed from: m */
    public final C22871g f277580m;

    /* renamed from: n */
    private final C22871g f277581n;

    public C99219k(C98998i iVar, C99017b bVar, C99038b bVar2, C99085b bVar3, C99133d dVar, C98736d dVar2, C68214a aVar, C99174d dVar3, C99213q qVar, C99215b bVar4, C22871g gVar, C22871g gVar2) {
        super(C118575h.WORKER_RECOGNIZER, "recognizer");
        this.f277575h = aVar;
        this.f277570a = iVar;
        this.f277571b = bVar;
        this.f277572c = bVar2;
        this.f277579l = bVar3;
        this.f277573f = dVar;
        this.f277580m = gVar;
        this.f277574g = dVar2;
        this.f277581n = gVar2;
        this.f277576i = dVar3;
        this.f277577j = qVar;
        this.f277578k = bVar4;
    }

    /* renamed from: a */
    public final C60870cx mo78713a(C89356b bVar, Query query, C89061q qVar, C85422c cVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28202b("createAnbuFetcherForVoiceSearch", new C98753g(this, bVar, query, qVar, cVar, vVar, axVar));
    }

    /* renamed from: b */
    public final C60870cx mo78714b(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28201a("createCarEmbeddedVoiceSearchFetcher", new C98717c(this, bVar, query, qVar, vVar, axVar));
    }

    /* renamed from: c */
    public final C60870cx mo78715c(C89356b bVar, Query query, C85422c cVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28201a("createCarHybridOrEmbeddedVoiceSearchFetcher", new C98732d(this, bVar, query, vVar, cVar, axVar));
    }

    /* renamed from: d */
    public final C60870cx mo78716d(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28201a("createCarNetworkVoiceSearchFetcher", new C98745f(this, bVar, query, qVar, vVar, axVar));
    }

    /* renamed from: e */
    public final C60870cx mo78717e(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28201a("createContinuousMatchVoiceSearchFetcher", new C98737e(this, bVar, query, qVar, vVar, axVar));
    }

    /* renamed from: f */
    public final C60870cx mo78718f(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28201a("createEmbeddedPushToTalkVoiceSearchFetcher", new C98773h(this, bVar, query, qVar, vVar, axVar));
    }

    /* renamed from: g */
    public final C60870cx mo78719g(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28201a("createEmbeddedVoiceSearchFetcher", new C98714b(this, bVar, query, qVar, vVar, axVar));
    }

    /* renamed from: h */
    public final C60870cx mo78720h(C89356b bVar, Query query, C85422c cVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28201a("createHybridOrEmbeddedVoiceSearchFetcher", new C99218j(this, bVar, query, vVar, cVar, axVar));
    }

    /* renamed from: i */
    public final C60870cx mo78721i(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28201a("createNetworkVoiceSearchFetcher", new C98707a(this, bVar, query, qVar, vVar, axVar));
    }

    /* renamed from: j */
    public final C60870cx mo78722j(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        return this.f277581n.mo28201a("createPushToTalkVoiceSearchFetcher", new C98786i(this, bVar, query, qVar, vVar, axVar));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}

package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.af */
/* compiled from: PG */
public final class C127302af extends C68247h {

    /* renamed from: a */
    private final C68283d f350594a;

    public C127302af(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C127302af.class), aVar);
        this.f350594a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        String str;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            str = (String) Collection.EL.stream(((C18496n) optional.get()).f52441b).filter(C127297aa.f350588a).map(C127298ab.f350589a).findFirst().orElseThrow(C127299ac.f350590a);
        } else {
            ((C59052c) ((C59052c) C127300ad.f350591a.mo56226d()).mo56372aa(37287)).mo56386p("Search Handover service not available, using default search params");
            str = "Mozilla/5.0 (Linux; Android 6.0.99; Build/NYC; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/52.0.2743.99 Mobile Safari/537.36 GSA/11.35.7.23.arm64 OpaScreenful/0";
        }
        return C60856cj.m92900i(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f350594a.mo60297gq();
    }
}

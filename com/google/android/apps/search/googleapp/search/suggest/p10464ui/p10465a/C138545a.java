package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10465a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138550ae;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62944bx;
import com.google.protobuf.C63033ey;
import com.google.protobuf.C63077o;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.a.a */
/* compiled from: PG */
public final class C138545a {

    /* renamed from: a */
    public final C46401p f376822a;

    /* renamed from: b */
    public final C46401p f376823b;

    /* renamed from: c */
    public final C46401p f376824c;

    /* renamed from: d */
    public final C46401p f376825d;

    /* renamed from: e */
    public final C46401p f376826e;

    /* renamed from: f */
    public final C46401p f376827f;

    /* renamed from: g */
    private final C62921ba f376828g;

    /* renamed from: h */
    private final C46401p f376829h;

    public C138545a(InstanceStateStoreFactory instanceStateStoreFactory, InstanceStateStoreFactory instanceStateStoreFactory2, InstanceStateStoreFactory instanceStateStoreFactory3, InstanceStateStoreFactory instanceStateStoreFactory4, InstanceStateStoreFactory instanceStateStoreFactory5, InstanceStateStoreFactory instanceStateStoreFactory6, C62921ba baVar) {
        C69664n.m101061g(instanceStateStoreFactory, "entryPointCacheFactory");
        C69664n.m101061g(instanceStateStoreFactory2, "stringInstanceStateStoreFactory");
        C69664n.m101061g(instanceStateStoreFactory3, "intInstanceStateStoreFactory");
        C69664n.m101061g(instanceStateStoreFactory4, "refinementSuggestionsCacheFactory");
        C69664n.m101061g(instanceStateStoreFactory5, "boolInstanceStateStoreFactory");
        C69664n.m101061g(instanceStateStoreFactory6, "suggestionsDeletingInProgressCacheFactory");
        C69664n.m101061g(baVar, "extensionRegistry");
        this.f376828g = baVar;
        this.f376822a = instanceStateStoreFactory.mo50325a("entry_point", C138550ae.f376838c);
        this.f376823b = instanceStateStoreFactory2.mo50325a("search_query", C63033ey.f170139b);
        this.f376824c = instanceStateStoreFactory3.mo50325a("cursor_position", C62944bx.f169980b);
        this.f376825d = instanceStateStoreFactory4.mo50325a("refinement_suggestions", C8575bc.f29690g);
        this.f376829h = instanceStateStoreFactory2.mo50325a("corpus_type", C63033ey.f170139b);
        this.f376826e = instanceStateStoreFactory5.mo50325a("location_notification", C63077o.f170228b);
        this.f376827f = instanceStateStoreFactory6.mo50325a("suggestions_deleting_in_progress", C62912at.f169862a);
    }

    /* renamed from: a */
    public final int mo114312a() {
        C62944bx bxVar;
        C46370ah a = this.f376824c.mo50378a(C62912at.f169862a);
        if (a == null || (bxVar = (C62944bx) a.f121384a) == null) {
            return 0;
        }
        return bxVar.f169982a;
    }

    /* renamed from: b */
    public final C139704d mo114313b() {
        C138550ae aeVar;
        C46370ah a = this.f376822a.mo50378a(C62912at.f169862a);
        C139704d dVar = null;
        if (!(a == null || (aeVar = (C138550ae) a.f121384a) == null || (dVar = C139704d.m227141a(aeVar.f376841b)) != null)) {
            dVar = C139704d.UNKNOWN;
        }
        return dVar == null ? C139704d.UNKNOWN : dVar;
    }

    /* renamed from: c */
    public final String mo114314c() {
        C63033ey eyVar;
        C46370ah a = this.f376829h.mo50378a(C62912at.f169862a);
        String str = null;
        if (!(a == null || (eyVar = (C63033ey) a.f121384a) == null)) {
            str = eyVar.f170141a;
        }
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: d */
    public final String mo114315d() {
        C63033ey eyVar;
        C46370ah a = this.f376823b.mo50378a(C62912at.f169862a);
        String str = null;
        if (!(a == null || (eyVar = (C63033ey) a.f121384a) == null)) {
            str = eyVar.f170141a;
        }
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: e */
    public final void mo114316e(ProtoParsers.ParcelableProto parcelableProto) {
        C69664n.m101061g(parcelableProto, "input");
        MessageLite a = parcelableProto.mo58938a(C138030av.f375536m, this.f376828g.mo58829b());
        C69664n.m101060f(a, "input.getMessage(Suggest…gistry.getUnmodifiable())");
        this.f376827f.mo50382e((C138030av) a);
    }

    /* renamed from: f */
    public final void mo114317f(String str) {
        C69664n.m101061g(str, "corpusType");
        this.f376829h.mo50381d(C62912at.f169862a, C63033ey.m95859a(str));
    }

    /* renamed from: g */
    public final void mo114318g(C8575bc bcVar) {
        this.f376825d.mo50381d(C62912at.f169862a, bcVar);
    }

    /* renamed from: h */
    public final boolean mo114319h() {
        C63077o oVar;
        C46370ah a = this.f376826e.mo50378a(C62912at.f169862a);
        if (a == null || (oVar = (C63077o) a.f121384a) == null) {
            return false;
        }
        return oVar.f170230a;
    }
}

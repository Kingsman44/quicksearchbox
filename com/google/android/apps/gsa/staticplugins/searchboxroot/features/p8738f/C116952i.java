package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8738f;

import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.f.i */
/* compiled from: PG */
public final /* synthetic */ class C116952i implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f324682a;

    public /* synthetic */ C116952i(C58490gz gzVar) {
        this.f324682a = gzVar;
    }

    public final void accept(Object obj, Object obj2) {
        String str = (String) obj;
        try {
            this.f324682a.mo55429h(C48580an.m85240a(str), Integer.valueOf(Integer.parseInt((String) obj2)));
        } catch (IllegalArgumentException e) {
            C59104x c = C116953j.f324683a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "gmn.RankParsers");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(32524)).mo56389s("Could not load SuggestionType: %s", str);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

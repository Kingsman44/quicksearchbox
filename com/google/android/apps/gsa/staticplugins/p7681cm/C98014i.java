package com.google.android.apps.gsa.staticplugins.p7681cm;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8509s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.i */
/* compiled from: PG */
public final /* synthetic */ class C98014i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C98015j f273678a;

    public /* synthetic */ C98014i(C98015j jVar) {
        this.f273678a = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C8509s sVar;
        String str = (String) obj;
        try {
            sVar = (C8509s) C62942bv.parseFrom((C62942bv) C8509s.f29522b, C90772bp.m148288O(this.f273678a.f273680b, R.raw.default_search_languages), C62921ba.m95368a());
        } catch (C62974ct e) {
            C59104x c = C98015j.f273679a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DiscLangSummaryCtrl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30368)).mo56386p("Cannot read default languages from resources.");
            sVar = C8509s.f29522b;
        }
        return (String) Collection.EL.stream(sVar.f29524a).filter(new C98010e(str)).map(C98011f.f273674a).findFirst().orElse(BuildConfig.FLAVOR);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import com.google.android.apps.gsa.nga.engine.p5978b.p5989g.C75289x;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78111c;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128099bu;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128100bv;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.t */
/* compiled from: PG */
public final /* synthetic */ class C78143t implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C78143t f215168a = new C78143t();

    private /* synthetic */ C78143t() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Optional optional = (Optional) obj2;
        Optional h = ((C78111c) obj).mo73074a().mo71464h();
        if (!h.isPresent()) {
            return C128100bv.f352463c;
        }
        if (!optional.isPresent()) {
            return C128100bv.f352463c;
        }
        if (!((C75289x) optional.get()).mo71642a().b().equals(h.get())) {
            return C128100bv.f352463c;
        }
        C128099bu buVar = (C128099bu) C128100bv.f352463c.createBuilder();
        String b = ((C75289x) optional.get()).mo71643b();
        buVar.copyOnWrite();
        C128100bv bvVar = (C128100bv) buVar.instance;
        b.getClass();
        bvVar.f352465a |= 1;
        bvVar.f352466b = b;
        return (C128100bv) buVar.build();
    }
}

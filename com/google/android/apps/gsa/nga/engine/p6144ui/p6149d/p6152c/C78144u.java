package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78111c;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128083be;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128084bf;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.u */
/* compiled from: PG */
public final /* synthetic */ class C78144u implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C78144u f215169a = new C78144u();

    private /* synthetic */ C78144u() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        bl blVar = bl.a;
        C83016y yVar = C83016y.UNKNOWN;
        int ordinal = ((C78111c) obj).mo73074a().mo71458b().ordinal();
        if (ordinal != 0 && ordinal != 1) {
            return C128084bf.f352418c;
        }
        C128083be beVar = (C128083be) C128084bf.f352418c.createBuilder();
        beVar.copyOnWrite();
        C128084bf bfVar = (C128084bf) beVar.instance;
        bfVar.f352420a = 1 | bfVar.f352420a;
        bfVar.f352421b = floatValue;
        return (C128084bf) beVar.build();
    }
}

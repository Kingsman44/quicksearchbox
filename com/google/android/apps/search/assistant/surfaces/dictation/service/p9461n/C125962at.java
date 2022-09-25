package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.ak;
import com.google.android.apps.gsa.nga.api.a.al;
import com.google.android.apps.gsa.nga.api.a.cl;
import com.google.android.apps.gsa.nga.api.a.cm;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.at */
/* compiled from: PG */
public final /* synthetic */ class C125962at implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C126038bc f347182a;

    public /* synthetic */ C125962at(C126038bc bcVar) {
        this.f347182a = bcVar;
    }

    public final Object get() {
        String g = this.f347182a.f347358d.mo107273g(R.string.assistant_keyboard_spell_it_out_tip_text, new Object[0]);
        ak createBuilder = al.i.createBuilder();
        cl createBuilder2 = cm.d.createBuilder();
        createBuilder2.copyOnWrite();
        g.getClass();
        createBuilder2.instance.a = g;
        createBuilder2.copyOnWrite();
        createBuilder2.instance.b = true;
        createBuilder.copyOnWrite();
        cm build = createBuilder2.build();
        build.getClass();
        createBuilder.instance.h = build;
        return createBuilder.build();
    }
}

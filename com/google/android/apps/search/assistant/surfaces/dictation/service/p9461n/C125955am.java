package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.ak;
import com.google.android.apps.gsa.nga.api.a.al;
import com.google.android.apps.gsa.nga.api.a.cl;
import com.google.android.apps.gsa.nga.api.a.cm;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.am */
/* compiled from: PG */
public final /* synthetic */ class C125955am implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C126038bc f347175a;

    public /* synthetic */ C125955am(C126038bc bcVar) {
        this.f347175a = bcVar;
    }

    public final Object get() {
        C126054bs bsVar = this.f347175a.f347358d;
        ak createBuilder = al.i.createBuilder();
        cl createBuilder2 = cm.d.createBuilder();
        String g = bsVar.mo107273g(R.string.assistant_keyboard_overlay_learning_center_education_tip_text, new Object[0]);
        createBuilder2.copyOnWrite();
        g.getClass();
        createBuilder2.instance.a = g;
        createBuilder2.copyOnWrite();
        createBuilder2.instance.b = true;
        createBuilder.copyOnWrite();
        cm build = createBuilder2.build();
        build.getClass();
        createBuilder.instance.g = build;
        return createBuilder.build();
    }
}
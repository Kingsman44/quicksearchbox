package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.ac */
/* compiled from: PG */
public final /* synthetic */ class C10316ac implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C10325al f34962a;

    /* renamed from: b */
    public final /* synthetic */ List f34963b;

    public /* synthetic */ C10316ac(C10325al alVar, List list) {
        this.f34962a = alVar;
        this.f34963b = list;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        return (C58485gu) Collection.EL.stream(this.f34963b).map(new C10352j(this.f34962a, (C58495hd) obj)).collect(C58370cn.f155946a);
    }
}

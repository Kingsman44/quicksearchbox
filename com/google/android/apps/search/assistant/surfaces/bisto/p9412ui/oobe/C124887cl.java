package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.cl */
/* compiled from: PG */
public final /* synthetic */ class C124887cl implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124888cm f344574a;

    /* renamed from: b */
    public final /* synthetic */ C44581b f344575b;

    public /* synthetic */ C124887cl(C124888cm cmVar, C44581b bVar) {
        this.f344574a = cmVar;
        this.f344575b = bVar;
    }

    public final void accept(Object obj) {
        C124888cm cmVar = this.f344574a;
        C44581b bVar = this.f344575b;
        bVar.f1347a.f1326g = cmVar.f344576a.f344580c.getString(R.string.assistant_bisto_unsupported_locale_message, (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

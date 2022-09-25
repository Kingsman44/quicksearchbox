package com.google.android.apps.search.fedora.p10107j.p10109b;

import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.apps.search.fedora.p10094c.C132739n;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.fedora.j.b.m */
/* compiled from: PG */
public final /* synthetic */ class C132988m implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C132988m f362683a = new C132988m();

    private /* synthetic */ C132988m() {
    }

    public final void accept(Object obj) {
        C132739n nVar = (C132739n) obj;
        C59071e eVar = C133001z.f362708a;
        C58976aa aaVar = C58975e.f156826a;
        EkhoWriter ekhoWriter = (EkhoWriter) nVar.f362177d.get();
        if (ekhoWriter != null) {
            EkhoWriter.nativeClearAsync(ekhoWriter.f54364a.get());
            ((C133072j) nVar.f362175b.mo17428b()).mo110963a("Fedora.EkhoWriter.NumClearCache");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.gsa.staticplugins.p7681cm.p7683b;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.integrations.p3015b.p3016a.C38497c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.b.d */
/* compiled from: PG */
public final /* synthetic */ class C97971d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97975h f273557a;

    public /* synthetic */ C97971d(C97975h hVar) {
        this.f273557a = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C97975h hVar = this.f273557a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        return hVar.f273563c.mo28209i(((C38497c) optional.get()).mo41445a(), "Preferences summary: wrap language data in optional", C97970c.f273556a);
    }
}

package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.ab */
/* compiled from: PG */
public final /* synthetic */ class C10315ab implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ String f34961a;

    public /* synthetic */ C10315ab(String str) {
        this.f34961a = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        return Collection.EL.stream((List) obj).filter(new C10364v(this.f34961a)).findFirst();
    }
}

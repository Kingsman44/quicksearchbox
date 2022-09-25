package com.google.android.libraries.search.assistant.performer.p2753e;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.e.j */
/* compiled from: PG */
public final /* synthetic */ class C35997j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35998k f94192a;

    public /* synthetic */ C35997j(C35998k kVar) {
        this.f94192a = kVar;
    }

    public final C60870cx apply(Object obj) {
        C35998k kVar = this.f94192a;
        if (((C35989b) obj) != C35989b.DONE) {
            return C60856cj.m92899h(new Exception("Failed to download photos."));
        }
        return C60856cj.m92900i(kVar.mo39921b());
    }
}

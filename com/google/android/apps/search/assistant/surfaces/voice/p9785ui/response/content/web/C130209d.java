package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import com.google.android.libraries.web.contrib.logging.C43712o;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.d */
/* compiled from: PG */
public final class C130209d implements C43712o {

    /* renamed from: a */
    private static final C59071e f356968a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.d");

    /* renamed from: b */
    private final C130208c f356969b;

    public C130209d(C130208c cVar) {
        this.f356969b = cVar;
    }

    /* renamed from: a */
    public final C43713p mo32339a(C43367l lVar) {
        C59052c cVar = (C59052c) ((C59052c) f356968a.mo56224b()).mo56372aa(38771);
        C43366k a = C43366k.m76517a(lVar.f113299e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        cVar.mo56387q("Assistant webview loadRequest trigger type :%s.", a.f113292i);
        C43366k a2 = C43366k.m76517a(lVar.f113299e);
        if (a2 == null) {
            a2 = C43366k.UNSPECIFIED;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 1) {
            return this.f356969b.mo109575a();
        }
        if (ordinal != 2) {
            return null;
        }
        return this.f356969b.mo109575a();
    }
}

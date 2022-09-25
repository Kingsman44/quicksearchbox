package com.google.android.apps.search.assistant.platform.p9141h.p9165i;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10036m;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121146d;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.h.i.c */
/* compiled from: PG */
public final class C121150c implements C43019v {

    /* renamed from: a */
    public final C10036m f336621a;

    /* renamed from: b */
    private final C71422aw f336622b;

    public C121150c(C71422aw awVar, C10036m mVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(mVar, "agsaClassicQuickPhrasesSettingsDataStore");
        this.f336622b = awVar;
        this.f336621a = mVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        C69664n.m101061g((C121146d) messageLite, "message");
        return C71663i.m104692e(this.f336622b, (C71424ay) null, new C121149b(this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}

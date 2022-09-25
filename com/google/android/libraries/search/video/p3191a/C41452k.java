package com.google.android.libraries.search.video.p3191a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.search.video.a.k */
/* compiled from: PG */
public final class C41452k {

    /* renamed from: a */
    public static final C59071e f108263a = C59071e.m91332i("com.google.android.libraries.search.video.a.k");

    /* renamed from: b */
    public final AtomicReference f108264b = new AtomicReference();

    /* renamed from: a */
    public final C41450i mo43981a() {
        C41450i iVar = (C41450i) this.f108264b.get();
        if (iVar != null) {
            return iVar;
        }
        ((C59052c) ((C59052c) f108263a.mo56225c()).mo56372aa(53890)).mo56386p("videoOptions is not yet initialized! VideoInitializer.init() has to be called before the video library can be used");
        return C41450i.f108261a;
    }
}

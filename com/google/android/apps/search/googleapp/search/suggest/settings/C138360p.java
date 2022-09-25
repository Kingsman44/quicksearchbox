package com.google.android.apps.search.googleapp.search.suggest.settings;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.settings.p */
/* compiled from: PG */
public final class C138360p {

    /* renamed from: a */
    public final C42876ab f376419a;

    /* renamed from: b */
    public final C46778cv f376420b;

    /* renamed from: c */
    private final C46723bg f376421c;

    public C138360p(C42876ab abVar, C46723bg bgVar, C46778cv cvVar) {
        this.f376419a = abVar;
        this.f376421c = bgVar;
        this.f376420b = cvVar;
    }

    /* renamed from: a */
    public final C46689ag mo114247a() {
        return new C46719bc(this.f376421c, new C138357m(this), "OFFLINE_SUGGEST_SETTING_DATA_SOURCE");
    }
}

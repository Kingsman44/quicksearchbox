package com.google.android.apps.gsa.staticplugins.nga;

import com.google.android.apps.gsa.nga.api.cd;
import com.google.common.base.C58833ax;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.d */
/* compiled from: PG */
public final class C103018d implements cd {

    /* renamed from: a */
    private static final Duration f287609a = Duration.ofSeconds(10);

    /* renamed from: b */
    private final C58247c f287610b;

    public C103018d() {
        C58254i iVar = new C58254i();
        iVar.mo54823g(1);
        iVar.mo54822f(f287609a.toMillis(), TimeUnit.MILLISECONDS);
        this.f287610b = iVar.mo54817a();
    }

    /* renamed from: a */
    public final C58833ax mo93562a() {
        return C58833ax.m90833j((String) ((C58206am) this.f287610b).f155647a.mo54792f(1));
    }

    /* renamed from: b */
    public final void mo93563b(String str) {
        ((C58206am) this.f287610b).f155647a.put(1, str);
    }
}

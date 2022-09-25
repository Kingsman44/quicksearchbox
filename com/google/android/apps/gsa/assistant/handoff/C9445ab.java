package com.google.android.apps.gsa.assistant.handoff;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.ab */
/* compiled from: PG */
public final /* synthetic */ class C9445ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86054o f32860a;

    /* renamed from: b */
    public final /* synthetic */ Intent f32861b;

    public /* synthetic */ C9445ab(C86054o oVar, Intent intent) {
        this.f32860a = oVar;
        this.f32861b = intent;
    }

    public final Object apply(Object obj) {
        return new C9447ad(this.f32860a, this.f32861b, (Uri) obj);
    }
}

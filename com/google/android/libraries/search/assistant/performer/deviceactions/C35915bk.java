package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.bk */
/* compiled from: PG */
public final /* synthetic */ class C35915bk implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35916bl f94059a;

    /* renamed from: b */
    public final /* synthetic */ boolean f94060b;

    public /* synthetic */ C35915bk(C35916bl blVar, boolean z) {
        this.f94059a = blVar;
        this.f94060b = z;
    }

    public final Object apply(Object obj) {
        C35916bl blVar = this.f94059a;
        boolean z = this.f94060b;
        blVar.f94063c.sendBroadcast((Intent) obj);
        return z ? C36180b.f94545b : C36180b.f94544a;
    }
}

package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.bg */
/* compiled from: PG */
public final /* synthetic */ class C35911bg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35916bl f94054a;

    /* renamed from: b */
    public final /* synthetic */ boolean f94055b;

    public /* synthetic */ C35911bg(C35916bl blVar, boolean z) {
        this.f94054a = blVar;
        this.f94055b = z;
    }

    public final C60870cx apply(Object obj) {
        C35916bl blVar = this.f94054a;
        Intent intent = (Intent) obj;
        if (this.f94055b) {
            intent.addFlags(32768);
        }
        intent.addFlags(268435456);
        return blVar.f94062b.mo20101f(intent);
    }
}

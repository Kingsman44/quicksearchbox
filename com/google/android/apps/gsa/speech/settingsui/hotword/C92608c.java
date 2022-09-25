package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.speech.settingsui.hotword.p7315a.C92570a;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7315a.C92571b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.c */
/* compiled from: PG */
public final /* synthetic */ class C92608c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f258451a;

    public /* synthetic */ C92608c(boolean z) {
        this.f258451a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f258451a;
        C92570a aVar = (C92570a) ((C92571b) obj).toBuilder();
        aVar.copyOnWrite();
        C92571b bVar = (C92571b) aVar.instance;
        bVar.f258330a |= 1;
        bVar.f258331b = z;
        return (C92571b) aVar.build();
    }
}

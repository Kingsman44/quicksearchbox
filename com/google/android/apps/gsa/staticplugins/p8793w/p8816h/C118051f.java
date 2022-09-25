package com.google.android.apps.gsa.staticplugins.p8793w.p8816h;

import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.f */
/* compiled from: PG */
public final /* synthetic */ class C118051f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117886ai f327634a;

    public /* synthetic */ C118051f(C117886ai aiVar) {
        this.f327634a = aiVar;
    }

    public final C60870cx apply(Object obj) {
        C117886ai aiVar = this.f327634a;
        if (((Boolean) obj).booleanValue()) {
            return aiVar.f327194h.mo77888b(aiVar.f327196j, new TtsRequest(aiVar.f327195i.getString(R.string.cold_boot_system_now_ready_tts), false), C117903c.f327257a);
        }
        return aiVar.f327194h.mo77887a(aiVar.f327196j, new TtsRequest(aiVar.f327195i.getString(R.string.cold_boot_system_now_ready_tts), false), C117908d.f327268a);
    }
}

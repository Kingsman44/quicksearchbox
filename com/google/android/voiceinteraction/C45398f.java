package com.google.android.voiceinteraction;

import com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.DspModelInformation;
import com.google.android.voiceinteraction.p3559a.C45368d;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.voiceinteraction.f */
/* compiled from: PG */
public final /* synthetic */ class C45398f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ DspModelInformation f118768a;

    /* renamed from: b */
    public final /* synthetic */ String f118769b;

    public /* synthetic */ C45398f(DspModelInformation dspModelInformation, String str) {
        this.f118768a = dspModelInformation;
        this.f118769b = str;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        DspModelInformation dspModelInformation = this.f118768a;
        String str = this.f118769b;
        C45368d dVar = (C45368d) obj;
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        return dVar.mo49455a() == dspModelInformation.mo23833a() && dVar.mo49459e().equals(Locale.forLanguageTag(str));
    }
}

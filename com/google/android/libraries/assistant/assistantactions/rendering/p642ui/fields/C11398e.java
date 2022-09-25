package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.e */
/* compiled from: PG */
final class C11398e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AudioRecorderField f37137a;

    public C11398e(AudioRecorderField audioRecorderField) {
        this.f37137a = audioRecorderField;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) AudioRecorderField.f36893a.mo56225c()).mo56382g(th)).mo56372aa(43193)).mo56386p("Get audio duration failed");
        this.f37137a.f36900b.post(new C11397d(this));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f37137a.f36905g = ((Integer) obj).intValue();
        AudioRecorderField audioRecorderField = this.f37137a;
        audioRecorderField.f36905g = ((audioRecorderField.f36905g + 999) / 1000) * 1000;
        audioRecorderField.f36900b.post(new C11394c(this));
    }
}

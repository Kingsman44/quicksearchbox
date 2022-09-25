package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.v */
/* compiled from: PG */
public class C92627v extends C92614i {

    /* renamed from: f */
    private final C92486a f258531f;

    public C92627v(String str, String str2, C92597d dVar, C92602a aVar, C89994f fVar, C92486a aVar2, C92518d dVar2, C91022f fVar2, C86124t tVar, C42876ab abVar, C60887da daVar, C9325m mVar) {
        super(str, str2, dVar, aVar, fVar, aVar2, dVar2, fVar2, tVar, abVar, daVar, mVar);
        this.f258531f = aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo87389e(boolean z, EventForDump eventForDump) {
        super.mo87389e(z, eventForDump);
        this.f258531f.mo87237k(z, eventForDump);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        super.mo17602gS(fVar);
        fVar.mo85279c("Opa=").mo85276a(C90752i.m148229c("true"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo87392h() {
        return 5;
    }
}

package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import android.view.contentcapture.DataShareRequest;
import com.google.android.apps.search.assistant.libraries.p8942a.C119204b;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C119191c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ DataShareRequest f332399a;

    public /* synthetic */ C119191c(DataShareRequest dataShareRequest) {
        this.f332399a = dataShareRequest;
    }

    public final void accept(Object obj) {
        DataShareRequest dataShareRequest = this.f332399a;
        C59071e eVar = C119202n.f332431a;
        dataShareRequest.getLocusId();
        ((C119204b) obj).mo104242a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

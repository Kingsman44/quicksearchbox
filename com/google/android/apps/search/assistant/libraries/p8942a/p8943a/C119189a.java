package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import android.view.contentcapture.DataShareRequest;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C119189a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C119202n f332391a;

    /* renamed from: b */
    public final /* synthetic */ DataShareRequest f332392b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f332393c;

    public /* synthetic */ C119189a(C119202n nVar, DataShareRequest dataShareRequest, MessageLite messageLite) {
        this.f332391a = nVar;
        this.f332392b = dataShareRequest;
        this.f332393c = messageLite;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C119202n nVar = this.f332391a;
        DataShareRequest dataShareRequest = this.f332392b;
        MessageLite messageLite = this.f332393c;
        nVar.f332443l.shareData(dataShareRequest, nVar.f332438g, new C119197i(dataShareRequest.getLocusId(), messageLite, cVar));
        return "SerializedContentCaptureManager shareData";
    }
}

package com.google.android.libraries.lens.sdk.intent.p2048a;

import android.os.Bundle;
import com.google.android.libraries.lens.sdk.p2045c.C24917b;
import com.google.android.libraries.lens.sdk.p2045c.C24928m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.sdk.intent.a.b */
/* compiled from: PG */
public final class C24939b implements C24928m {

    /* renamed from: a */
    private static final C58974d f68062a = C58974d.m91135i("LensSessionProcessor");

    /* renamed from: b */
    private final C24938a f68063b;

    /* renamed from: c */
    private Consumer f68064c;

    /* renamed from: d */
    private long f68065d;

    public C24939b(C24938a aVar) {
        this.f68063b = aVar;
    }

    /* renamed from: a */
    public final void mo30142a(C24917b bVar, Bundle bundle) {
        C58974d dVar = f68062a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(48938)).mo56386p("process");
        String string = bundle.getString("EventType");
        if (string == null) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(48941)).mo56386p("KEY_EVENT_TYPE not found in bundle");
        } else if (bundle.getBundle("Payload") == null) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(48940)).mo56386p("KEY_PAYLOAD not found in bundle");
        } else {
            if (((string.hashCode() == -1671950784 && string.equals("StartStreaming")) ? (char) 0 : 65535) != 0) {
                ((C58970a) ((C58970a) dVar.mo56225c()).mo56372aa(48939)).mo56389s("unrecognized event type: %s", string);
                return;
            }
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(48942)).mo56386p("processEventTypeStartStreaming");
            this.f68063b.mo30155a();
        }
    }

    /* renamed from: b */
    public final void mo30143b(Consumer consumer) {
        this.f68064c = consumer;
        Bundle bundle = new Bundle();
        bundle.putLong("SessionId", this.f68065d);
        Bundle bundle2 = new Bundle();
        bundle2.putString("SessionType", "SessionTypeLens");
        bundle2.putString("EventType", "SessionStarted");
        bundle2.putBundle("Payload", bundle);
        Consumer consumer2 = this.f68064c;
        if (consumer2 != null) {
            consumer2.accept(bundle2);
        }
    }

    /* renamed from: c */
    public final void mo30144c(long j) {
        this.f68065d = j;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo30145d() {
    }
}

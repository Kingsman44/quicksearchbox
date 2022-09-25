package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import android.os.Build;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataShareRequest;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.MessageLite;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C119195g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C119202n f332403a;

    /* renamed from: b */
    public final /* synthetic */ DataShareRequest f332404b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f332405c;

    public /* synthetic */ C119195g(C119202n nVar, DataShareRequest dataShareRequest, MessageLite messageLite) {
        this.f332403a = nVar;
        this.f332404b = dataShareRequest;
        this.f332405c = messageLite;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Optional optional;
        C119202n nVar = this.f332403a;
        DataShareRequest dataShareRequest = this.f332404b;
        MessageLite messageLite = this.f332405c;
        if (Build.VERSION.SDK_INT < 30) {
            ((C59052c) ((C59052c) C119202n.f332431a.mo56225c()).mo56372aa(34349)).mo56386p("Failed to pass preliminary check: R+ version is required");
            optional = Optional.m71637of(C119207d.FAILED_OS_VERSION);
        } else {
            nVar.f332443l = (ContentCaptureManager) nVar.f332437f.getSystemService(ContentCaptureManager.class);
            ContentCaptureManager contentCaptureManager = nVar.f332443l;
            if (contentCaptureManager == null) {
                ((C59052c) ((C59052c) C119202n.f332431a.mo56225c()).mo56372aa(34348)).mo56386p("Failed to pass preliminary check: ContentCaptureManager is null");
                optional = Optional.m71637of(C119207d.FAILED_CONTENT_CAPTURE_MANAGER_IS_NULL);
            } else if (!contentCaptureManager.isContentCaptureEnabled()) {
                ((C59052c) ((C59052c) C119202n.f332431a.mo56225c()).mo56372aa(34347)).mo56386p("Failed to pass preliminary check: content capture is disabled");
                optional = Optional.m71637of(C119207d.FAILED_CONTENT_CAPTURE_MANAGER_NOT_ENABLED);
            } else {
                optional = Optional.empty();
            }
        }
        if (optional.isPresent()) {
            return C60856cj.m92900i((C119207d) optional.get());
        }
        C60870cx a = C2169h.m6027a(new C119189a(nVar, dataShareRequest, messageLite));
        if (!nVar.f332440i) {
            return a;
        }
        C47633f j = C47633f.m84733g(a).mo51517j(C119202n.f332433c.getSeconds(), TimeUnit.SECONDS, nVar.f332438g);
        C119192d dVar = C119192d.f332400a;
        return C60846c.m92878g(j, TimeoutException.class, C47810es.m84963c(dVar), nVar.f332438g);
    }
}

package com.google.android.apps.gsa.smartspace.p7258b;

import android.os.Build;
import android.view.contentcapture.ContentCaptureManager;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.MessageLite;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.smartspace.b.c */
/* compiled from: PG */
public final /* synthetic */ class C92060c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C92070m f256655a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f256656b;

    /* renamed from: c */
    public final /* synthetic */ String f256657c;

    public /* synthetic */ C92060c(C92070m mVar, MessageLite messageLite, String str) {
        this.f256655a = mVar;
        this.f256656b = messageLite;
        this.f256657c = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C92070m mVar = this.f256655a;
        MessageLite messageLite = this.f256656b;
        String str = this.f256657c;
        if (Build.VERSION.SDK_INT < 30) {
            ((C58970a) ((C58970a) mVar.f256684a.mo56224b()).mo56372aa(12006)).mo56386p("skipping aiaiConnect because OS version < R");
            return C118826c.f331423b;
        }
        ContentCaptureManager contentCaptureManager = (ContentCaptureManager) mVar.f256686c.getSystemService(ContentCaptureManager.class);
        if (contentCaptureManager == null) {
            ((C58970a) ((C58970a) mVar.f256684a.mo56225c()).mo56372aa(12004)).mo56386p("ContentCaptureManager is null");
            mVar.mo86735h(C131177b.CONTENT_CAPTURE_MANAGER_IS_NULL, str);
            if (!mVar.f256685b) {
                mVar.f256685b = true;
                ((C58970a) ((C58970a) mVar.f256684a.mo56224b()).mo56372aa(12005)).mo56386p("Schedule an one off task to resend the card");
                mVar.f256687d.mo29165e(new C92067j(mVar), 30, TimeUnit.SECONDS);
            }
            return C118826c.f331423b;
        } else if (!contentCaptureManager.isContentCaptureEnabled()) {
            ((C58970a) ((C58970a) mVar.f256684a.mo56225c()).mo56372aa(12003)).mo56386p("ContentCaptureManager is not enabled");
            mVar.mo86735h(C131177b.CONTENT_CAPTURE_MANAGER_NOT_ENABLED, str);
            return C118826c.f331423b;
        } else {
            C92062e eVar = new C92062e(mVar, str, messageLite);
            if (messageLite instanceof C50819dp) {
                mVar.mo86733f((C50819dp) messageLite, str);
            }
            return C2169h.m6027a(new C92063f(mVar, messageLite, contentCaptureManager, str, eVar));
        }
    }
}

package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c;

import android.content.Context;
import android.content.LocusId;
import android.os.Build;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataShareRequest;
import com.google.android.apps.search.assistant.libraries.p8942a.C119206c;
import com.google.android.apps.search.assistant.verticals.ambient.p9905c.C130586e;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130886a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.c.h */
/* compiled from: PG */
public final class C130582h implements C130586e {

    /* renamed from: a */
    public final C58974d f357664a;

    /* renamed from: b */
    public final C60888db f357665b;

    /* renamed from: c */
    private final Context f357666c;

    /* renamed from: d */
    private final C130886a f357667d;

    /* renamed from: e */
    private final C130895ag f357668e;

    /* renamed from: f */
    private final C119206c f357669f;

    /* renamed from: g */
    private final boolean f357670g;

    /* renamed from: h */
    private final C47632e f357671h = new C47632e();

    public C130582h(C130603a aVar, Context context, C60888db dbVar, C130886a aVar2, C130895ag agVar, C119206c cVar, boolean z) {
        this.f357664a = aVar.mo109740b(this);
        this.f357666c = context;
        this.f357665b = dbVar;
        this.f357667d = aVar2;
        this.f357668e = agVar;
        this.f357669f = cVar;
        this.f357670g = z;
    }

    /* renamed from: e */
    private final void m212936e(C50819dp dpVar, String str) {
        this.f357668e.mo109915am(dpVar, str);
        this.f357667d.mo109860b(dpVar);
    }

    /* renamed from: f */
    private final boolean m212937f(ContentCaptureManager contentCaptureManager, String str) {
        if (contentCaptureManager == null) {
            ((C58970a) ((C58970a) this.f357664a.mo56226d()).mo56372aa(38935)).mo56386p("ContentCaptureManager is null");
            mo109733c(C131177b.CONTENT_CAPTURE_MANAGER_IS_NULL, str);
            return false;
        } else if (contentCaptureManager.isContentCaptureEnabled()) {
            return true;
        } else {
            ((C58970a) ((C58970a) this.f357664a.mo56226d()).mo56372aa(38934)).mo56386p("ContentCaptureManager is not enabled");
            mo109733c(C131177b.CONTENT_CAPTURE_MANAGER_NOT_ENABLED, str);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo109731a() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return m212937f((ContentCaptureManager) this.f357666c.getSystemService(ContentCaptureManager.class), "unknown");
    }

    /* renamed from: c */
    public final void mo109733c(C131177b bVar, String str) {
        this.f357668e.mo109916an("AA-TNG", bVar, str);
    }

    /* renamed from: d */
    public final void mo109734d(C131177b bVar, String str, int i) {
        this.f357668e.mo109895aD(bVar, str, i);
    }

    /* renamed from: b */
    public final C60870cx mo109732b(MessageLite messageLite, String str) {
        if (this.f357670g) {
            if (Build.VERSION.SDK_INT < 30) {
                ((C58970a) ((C58970a) this.f357664a.mo56224b()).mo56372aa(38927)).mo56386p("skipping aiaiConnect because OS version < R");
                return C60866ct.f164955a;
            }
            mo109733c(C131177b.TOTAL_REQUEST_SEND, str);
            C130578d dVar = new C130578d(this, str, messageLite);
            if (messageLite instanceof C50819dp) {
                m212936e((C50819dp) messageLite, str);
            }
            return C47633f.m84733g(this.f357669f.mo104239a(new DataShareRequest(new LocusId(str), "application/x-binary"), messageLite)).mo51516i(new C130579e(this, str, dVar), this.f357665b);
        } else if (Build.VERSION.SDK_INT < 30) {
            return C60866ct.f164955a;
        } else {
            mo109733c(C131177b.TOTAL_REQUEST_SEND, str);
            ContentCaptureManager contentCaptureManager = (ContentCaptureManager) this.f357666c.getSystemService(ContentCaptureManager.class);
            if (!m212937f(contentCaptureManager, str)) {
                return C60866ct.f164955a;
            }
            if (messageLite instanceof C50819dp) {
                m212936e((C50819dp) messageLite, str);
            }
            return this.f357671h.mo51512b(new C130580f(this, messageLite, str, contentCaptureManager), this.f357665b);
        }
    }
}

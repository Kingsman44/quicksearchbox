package com.google.android.apps.search.assistant.verticals.p10036c;

import android.view.contentcapture.ContentCaptureManager;
import androidx.p104d.p105a.C2169h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.c.d */
/* compiled from: PG */
public final /* synthetic */ class C131938d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131943i f360247a;

    public /* synthetic */ C131938d(C131943i iVar) {
        this.f360247a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C131943i iVar = this.f360247a;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            return C60856cj.m92900i(false);
        }
        ContentCaptureManager contentCaptureManager = ((C131942h) iVar.f360255d).f360251a;
        if (contentCaptureManager == null) {
            ((C58970a) ((C58970a) C131943i.f360252a.mo56224b()).mo56372aa(39614)).mo56386p("ContentCaptureManager null, AiAi not available.");
            return C60856cj.m92900i(false);
        } else if (contentCaptureManager.isContentCaptureEnabled()) {
            return C2169h.m6027a(new C131939e(iVar));
        } else {
            ((C58970a) ((C58970a) C131943i.f360252a.mo56224b()).mo56372aa(39613)).mo56386p("ContentCaptureManager not enabled.");
            return C60856cj.m92900i(false);
        }
    }
}

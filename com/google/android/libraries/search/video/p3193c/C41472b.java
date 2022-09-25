package com.google.android.libraries.search.video.p3193c;

import android.view.accessibility.AccessibilityManager;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.video.c.b */
/* compiled from: PG */
public final /* synthetic */ class C41472b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C41474d f108333a;

    public /* synthetic */ C41472b(C41474d dVar) {
        this.f108333a = dVar;
    }

    public final Object apply(Object obj) {
        C41474d dVar = this.f108333a;
        if (!((Boolean) obj).booleanValue()) {
            ((C59052c) ((C59052c) C41474d.f108335a.mo56224b()).mo56372aa(53893)).mo56386p("No network connection or not meet the requirements of user setting.");
            return false;
        }
        AccessibilityManager accessibilityManager = dVar.f108336b;
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || !dVar.f108336b.isTouchExplorationEnabled()) {
            return true;
        }
        ((C59052c) ((C59052c) C41474d.f108335a.mo56224b()).mo56372aa(53892)).mo56386p("YouTube does not allow muted autoplay for devices where touch exploration is enabled, so we will not play YouTube or 3P videos.");
        return false;
    }
}

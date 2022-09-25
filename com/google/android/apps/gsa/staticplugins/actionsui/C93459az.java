package com.google.android.apps.gsa.staticplugins.actionsui;

import com.google.android.apps.gsa.search.shared.actions.PermissionPuntAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.az */
/* compiled from: PG */
public final class C93459az extends C93479bg {
    public C93459az(C88512f fVar, C58833ax axVar) {
        super(fVar, axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo82048k() {
        super.mo82048k();
        PermissionPuntAction permissionPuntAction = (PermissionPuntAction) this.f239226b;
        if (!permissionPuntAction.f236012i && permissionPuntAction.f236011h) {
            C88509c cVar = this.f239227c;
            cVar.getClass();
            ((C93458ay) cVar).mo87771v(permissionPuntAction.f236009f);
            ((PermissionPuntAction) this.f239226b).f236012i = true;
        }
    }
}

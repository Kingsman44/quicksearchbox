package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.actions.C87420h;
import com.google.android.apps.gsa.search.shared.actions.PermissionPuntAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.ay */
/* compiled from: PG */
public final class C93458ay extends C93477be implements C91078e, C93478bf {

    /* renamed from: e */
    private final C87420h f260836e;

    public C93458ay(Context context, C87420h hVar) {
        super(context, "PuntCard");
        this.f260836e = hVar;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        C88507a aVar = this.f239232a;
        aVar.getClass();
        PermissionPuntAction permissionPuntAction = (PermissionPuntAction) ((C93459az) aVar).f239226b;
        HashSet hashSet = new HashSet(permissionPuntAction.f236009f);
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 0) {
                hashSet.remove(strArr[i]);
            }
        }
        if (hashSet.isEmpty()) {
            C88507a aVar2 = this.f239232a;
            aVar2.getClass();
            ((C93459az) aVar2).mo82041aq().mo65089a(permissionPuntAction.f236010g);
        }
    }

    /* renamed from: v */
    public final void mo87771v(Collection collection) {
        C87420h hVar = this.f260836e;
        if (hVar != null) {
            hVar.mo81195a().mo81047ju((String[]) collection.toArray(new String[collection.size()]), 3, this);
        }
    }
}

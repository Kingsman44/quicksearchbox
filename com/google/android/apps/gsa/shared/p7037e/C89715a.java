package com.google.android.apps.gsa.shared.p7037e;

import android.content.pm.ShortcutInfo;
import com.google.common.base.C58817ah;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.e.a */
/* compiled from: PG */
public final /* synthetic */ class C89715a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f242867a;

    public /* synthetic */ C89715a(String str) {
        this.f242867a = str;
    }

    public final Object apply(Object obj) {
        boolean z;
        String str = this.f242867a;
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            if (shortcutInfo.getId().equals(C89720f.m146113c(str)) && shortcutInfo.isEnabled()) {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}

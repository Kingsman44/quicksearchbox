package com.google.android.apps.gsa.shared.p7038f.p7039a;

import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.os.Process;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.f.a.d */
/* compiled from: PG */
public final /* synthetic */ class C89744d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C89746f f242922a;

    /* renamed from: b */
    public final /* synthetic */ LauncherApps.ShortcutQuery f242923b;

    public /* synthetic */ C89744d(C89746f fVar, LauncherApps.ShortcutQuery shortcutQuery) {
        this.f242922a = fVar;
        this.f242923b = shortcutQuery;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C89746f fVar = this.f242922a;
        List<ShortcutInfo> shortcuts = fVar.f242926b.getShortcuts(this.f242923b, Process.myUserHandle());
        if (shortcuts == null) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89842j(shortcuts);
    }
}

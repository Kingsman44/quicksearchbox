package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9893a;

import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.os.Process;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.a.c */
/* compiled from: PG */
public final /* synthetic */ class C130410c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C130414g f357360a;

    /* renamed from: b */
    public final /* synthetic */ LauncherApps.ShortcutQuery f357361b;

    public /* synthetic */ C130410c(C130414g gVar, LauncherApps.ShortcutQuery shortcutQuery) {
        this.f357360a = gVar;
        this.f357361b = shortcutQuery;
    }

    public final Object call() {
        C130414g gVar = this.f357360a;
        try {
            List<ShortcutInfo> shortcuts = gVar.f357367b.getShortcuts(this.f357361b, Process.myUserHandle());
            if (shortcuts == null) {
                return C58485gu.m89845m();
            }
            return C58485gu.m89842j(shortcuts);
        } catch (IllegalStateException unused) {
            ((C58970a) ((C58970a) C130414g.f357366a.mo56226d()).mo56372aa(39433)).mo56386p("Shortcuts are being requested when the user is locked or not running.");
            return C58485gu.m89845m();
        }
    }
}

package com.google.android.libraries.gsa.conversation.clientop.p1847g;

import android.content.ActivityNotFoundException;
import android.content.pm.LauncherApps;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.g.i */
/* compiled from: PG */
public final class C22504i {

    /* renamed from: a */
    private static final C59071e f62100a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.clientop.g.i");

    /* renamed from: b */
    private final C68214a f62101b;

    public C22504i(C68214a aVar) {
        this.f62101b = aVar;
    }

    /* renamed from: a */
    public final C52070ec mo27633a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Unable to open provider: shortcut id or package name was not provided.");
        }
        if (this.f62101b.mo27525b() == null) {
            C52235kf kfVar = C52235kf.FAILED_PRECONDITION;
            return C22402a.m41822b(kfVar, "Unable to open provider: shortcut '" + str + "' for package '" + str2 + "' could not be launched by LauncherApps. LauncherApps handle could not be obtained.");
        }
        try {
            if (!((LauncherApps) this.f62101b.mo27525b()).hasShortcutHostPermission()) {
                C52235kf kfVar2 = C52235kf.PERMISSION_DENIED;
                return C22402a.m41822b(kfVar2, "Unable to open provider: shortcut '" + str + "' for package '" + str2 + "' could not be launched by LauncherApps. Performer does not have permissions to launch shortcuts.");
            }
            ((C59052c) ((C59052c) f62100a.mo56224b()).mo56372aa(48309)).mo56354G("Launching shortcut: %s for package %s", str, str2);
            ((LauncherApps) this.f62101b.mo27525b()).startShortcut(str2, str, (Rect) null, (Bundle) null, Process.myUserHandle());
            return C22402a.f61893a;
        } catch (IllegalStateException unused) {
            C52235kf kfVar3 = C52235kf.INVALID_ARGUMENT;
            return C22402a.m41822b(kfVar3, "Unable to open provider: shortcut '" + str + "' for package '" + str2 + "' could not be launched by LauncherApps. The user is locked or not running.");
        } catch (ActivityNotFoundException unused2) {
            C52235kf kfVar4 = C52235kf.INVALID_ARGUMENT;
            return C22402a.m41822b(kfVar4, "Unable to open provider: shortcut '" + str + "' for package '" + str2 + "' could not be launched by LauncherApps. Target activity was not found.");
        }
    }
}

package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.content.ActivityNotFoundException;
import android.content.pm.LauncherApps;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.be */
/* compiled from: PG */
public final class C35843be {

    /* renamed from: a */
    private static final C59071e f93931a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.be");

    /* renamed from: b */
    private final LauncherApps f93932b;

    public C35843be(LauncherApps launcherApps) {
        this.f93932b = launcherApps;
    }

    /* renamed from: a */
    public final C52070ec mo39867a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Unable to open provider: shortcut id or package name was not provided.");
        }
        try {
            if (!this.f93932b.hasShortcutHostPermission()) {
                C52235kf kfVar = C52235kf.PERMISSION_DENIED;
                return C36180b.m64579c(kfVar, "Unable to open provider: shortcut '" + str + "' for package '" + str2 + "' could not be launched by LauncherApps. Performer does not have permissions to launch shortcuts.");
            }
            ((C59052c) ((C59052c) f93931a.mo56224b()).mo56372aa(51975)).mo56354G("Launching shortcut: %s for package %s", str, str2);
            this.f93932b.startShortcut(str2, str, (Rect) null, (Bundle) null, Process.myUserHandle());
            return C36180b.f94544a;
        } catch (IllegalStateException unused) {
            C52235kf kfVar2 = C52235kf.INVALID_ARGUMENT;
            return C36180b.m64579c(kfVar2, "Unable to open provider: shortcut '" + str + "' for package '" + str2 + "' could not be launched by LauncherApps. The user is locked or not running.");
        } catch (ActivityNotFoundException unused2) {
            C52235kf kfVar3 = C52235kf.INVALID_ARGUMENT;
            return C36180b.m64579c(kfVar3, "Unable to open provider: shortcut '" + str + "' for package '" + str2 + "' could not be launched by LauncherApps. Target activity was not found.");
        }
    }
}

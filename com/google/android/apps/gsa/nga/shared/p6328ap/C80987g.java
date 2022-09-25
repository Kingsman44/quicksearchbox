package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33508b;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33510d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.g */
/* compiled from: PG */
public final class C80987g {

    /* renamed from: a */
    private static final C58974d f222002a = C58974d.m91134h("AssistantForeground");

    /* renamed from: b */
    private final Optional f222003b;

    /* renamed from: c */
    private final Context f222004c;

    public C80987g(Context context) {
        this.f222004c = context;
        this.f222003b = Optional.ofNullable((ActivityManager) context.getSystemService(ActivityManager.class));
    }

    /* renamed from: c */
    public static Optional m128859c(Optional optional) {
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        ComponentName componentName = ((ActivityManager.RunningTaskInfo) optional.get()).topActivity;
        if (componentName != null) {
            return Optional.m71637of(componentName);
        }
        ((C58970a) ((C58970a) f222002a.mo56226d()).mo56372aa(6544)).mo56386p("ComponentName for the foreground activity is null.");
        return Optional.empty();
    }

    /* renamed from: a */
    public final C80985e mo74765a(String str) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            ResolveInfo resolveActivity = this.f222004c.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                ((C58970a) ((C58970a) f222002a.mo56224b()).mo56372aa(6541)).mo56389s("Get launcher package: %s", resolveActivity.activityInfo.packageName);
            }
            if (resolveActivity == null) {
                ((C58970a) ((C58970a) f222002a.mo56226d()).mo56372aa(6542)).mo56386p("Getting launcher as null");
                return C80985e.UNKNOWN;
            } else if (str.equals(resolveActivity.activityInfo.packageName)) {
                return C80985e.IN_FOREGROUND;
            } else {
                return C80985e.NOT_IN_FOREGROUND;
            }
        } catch (RuntimeException e) {
            ((C58970a) ((C58970a) f222002a.mo56226d()).mo56372aa(6543)).mo56389s("Exception at getting launcher: %s", e.getMessage());
            return C80985e.UNKNOWN;
        }
    }

    /* renamed from: b */
    public final C80985e mo74766b() {
        if (mo74770g()) {
            return C80985e.NOT_IN_FOREGROUND;
        }
        return (C80985e) mo74767d().map(new C80971a(this)).orElse(C80985e.UNKNOWN);
    }

    /* renamed from: d */
    public final Optional mo74767d() {
        return m128859c(mo74768e()).map(C80983c.f221996a);
    }

    /* renamed from: e */
    public final Optional mo74768e() {
        List f = mo74769f(2);
        int i = 0;
        while (i < f.size()) {
            ComponentName componentName = ((ActivityManager.RunningTaskInfo) f.get(i)).topActivity;
            if (componentName != null) {
                C58974d dVar = C33510d.f89661a;
                if (C33508b.m62100a(componentName)) {
                    i++;
                }
            }
            return Optional.m71637of((ActivityManager.RunningTaskInfo) f.get(i));
        }
        return Optional.empty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final List mo74769f(int i) {
        if (this.f222003b.isEmpty()) {
            ((C58970a) ((C58970a) f222002a.mo56226d()).mo56372aa(6546)).mo56386p("Could not get an instance of ActivityManager.");
            return C58485gu.m89845m();
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f222003b.get()).getRunningTasks(i);
            if (!runningTasks.isEmpty()) {
                return runningTasks;
            }
            ((C58970a) ((C58970a) f222002a.mo56226d()).mo56372aa(6545)).mo56386p("ActivityManager returned no foreground tasks.");
            return C58485gu.m89845m();
        } catch (RuntimeException unused) {
            return C58485gu.m89845m();
        }
    }

    /* renamed from: g */
    public final boolean mo74770g() {
        return ((Boolean) m128859c(Collection.EL.stream(mo74769f(1)).findFirst()).map(C80976b.f221978a).orElse(false)).booleanValue();
    }
}

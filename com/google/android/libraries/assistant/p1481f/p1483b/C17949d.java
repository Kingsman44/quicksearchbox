package com.google.android.libraries.assistant.p1481f.p1483b;

import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.os.Process;
import android.os.UserHandle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.f.b.d */
/* compiled from: PG */
public final class C17949d {

    /* renamed from: a */
    public static final C59071e f51403a = C59071e.m91332i("com.google.android.libraries.assistant.f.b.d");

    /* renamed from: b */
    public final Context f51404b;

    /* renamed from: c */
    public final C68214a f51405c;

    /* renamed from: d */
    public final Executor f51406d;

    public C17949d(Context context, C68214a aVar, Executor executor) {
        this.f51404b = context;
        this.f51405c = aVar;
        this.f51406d = executor;
    }

    /* renamed from: c */
    public static String m35136c(ShortcutInfo shortcutInfo) {
        return !TextUtils.isEmpty(shortcutInfo.getShortLabel()) ? shortcutInfo.getShortLabel().toString() : BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public final C58485gu mo23500a(String str) {
        C58485gu b = mo23501b(str);
        C58480gp e = C58485gu.m89837e();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            e.mo55395g(m35136c((ShortcutInfo) b.get(i)));
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public final C58485gu mo23501b(String str) {
        C58485gu guVar;
        if (this.f51405c.mo27525b() == null) {
            ((C59052c) ((C59052c) f51403a.mo56226d()).mo56372aa(46926)).mo56386p("LauncherApps not available.");
            return C58485gu.m89845m();
        }
        LauncherApps launcherApps = (LauncherApps) this.f51405c.mo27525b();
        if (!launcherApps.hasShortcutHostPermission()) {
            ((C59052c) ((C59052c) f51403a.mo56226d()).mo56372aa(46925)).mo56386p("No Shortcut Host Permission.");
            guVar = C58485gu.m89845m();
        } else {
            UserHandle myUserHandle = Process.myUserHandle();
            if (myUserHandle == null) {
                ((C59052c) ((C59052c) f51403a.mo56226d()).mo56372aa(46924)).mo56386p("UserHandle is missing.");
                guVar = C58485gu.m89845m();
            } else {
                try {
                    List<ShortcutInfo> shortcuts = launcherApps.getShortcuts(new LauncherApps.ShortcutQuery().setPackage(str).setQueryFlags(11), myUserHandle);
                    guVar = shortcuts == null ? C58485gu.m89845m() : C58485gu.m89842j(shortcuts);
                } catch (IllegalStateException unused) {
                    ((C59052c) ((C59052c) f51403a.mo56226d()).mo56372aa(46923)).mo56386p("Failed to query Shortcut API.");
                    guVar = C58485gu.m89845m();
                }
            }
        }
        if (guVar.isEmpty()) {
            return guVar;
        }
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) guVar.get(i);
            String id = shortcutInfo.getId();
            String str2 = shortcutInfo.getPackage();
            if (((str2.hashCode() == -1547699361 && str2.equals("com.whatsapp")) ? (char) 0 : 65535) == 0 && (id.endsWith("@s.whatsapp.net") || id.endsWith("@g.us"))) {
                arrayList.add(shortcutInfo);
            }
        }
        return C58485gu.m89842j(arrayList);
    }
}

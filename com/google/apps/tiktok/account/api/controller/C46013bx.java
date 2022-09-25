package com.google.apps.tiktok.account.api.controller;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.google.apps.tiktok.account.p3616e.p3622e.C46351b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.account.api.controller.bx */
/* compiled from: PG */
public abstract class C46013bx {

    /* renamed from: a */
    private static final C59071e f120861a = C59071e.m91332i("com.google.apps.tiktok.account.api.controller.bx");

    /* renamed from: d */
    public static C46012bw m82200d() {
        C46010bu buVar = new C46010bu();
        buVar.mo50148c(false);
        buVar.mo50147b().mo55395g(C46351b.class);
        buVar.f120853a = null;
        return buVar;
    }

    /* renamed from: e */
    public static C46012bw m82201e(Activity activity) {
        if (!m82204h()) {
            Intent intent = activity.getIntent();
            Set<String> categories = intent.getCategories();
            ComponentName callingActivity = activity.getCallingActivity();
            if ((categories == null || categories.isEmpty()) && ((callingActivity == null || activity.getPackageName().equals(callingActivity.getPackageName())) && (intent.getFlags() & 268435456) == 0 && intent.getData() == null && intent.getClipData() == null && intent.getType() == null)) {
                ((C59052c) ((C59052c) f120861a.mo56226d()).mo56372aa(54685)).mo56389s("External config used on invalid activity: %s", activity.getClass());
            }
        }
        C46012bw d = m82200d();
        d.mo50148c(true);
        return d;
    }

    /* renamed from: f */
    public static C46012bw m82202f(Activity activity) {
        if (!m82204h()) {
            Intent intent = activity.getIntent();
            if (!intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & 268468224) == 0 && intent.getExtras() != null && !intent.getExtras().isEmpty()) {
                ((C59052c) ((C59052c) f120861a.mo56226d()).mo56372aa(54686)).mo56389s("Launcher config used on invalid activity: %s", activity.getClass());
            }
        }
        C46012bw d = m82200d();
        d.mo50148c(true);
        return d;
    }

    /* renamed from: g */
    public static C46012bw m82203g() {
        C46012bw d = m82200d();
        d.mo50148c(true);
        return d;
    }

    /* renamed from: h */
    private static boolean m82204h() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    /* renamed from: a */
    public abstract C58485gu mo50149a();

    /* renamed from: b */
    public abstract C58485gu mo50150b();

    /* renamed from: c */
    public abstract boolean mo50151c();
}

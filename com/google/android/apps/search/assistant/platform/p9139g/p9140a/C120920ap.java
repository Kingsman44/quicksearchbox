package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.ap */
/* compiled from: PG */
public abstract class C120920ap {
    /* renamed from: a */
    public abstract Context mo104965a();

    /* renamed from: b */
    public abstract C120921aq mo104966b();

    /* renamed from: c */
    public final C120921aq mo104967c() {
        ApplicationInfo applicationInfo;
        if (mo104970f().isEmpty()) {
            mo104975k(new C120924at(mo104965a()));
        }
        if (mo104968d().isPresent()) {
            mo104978n(((ComponentName) mo104968d().get()).getPackageName());
        }
        if (!mo104972h().isEmpty()) {
            if (mo104969e().isEmpty() || ((String) mo104969e().get()).isEmpty()) {
                String h = mo104972h();
                PackageManager packageManager = mo104965a().getPackageManager();
                try {
                    applicationInfo = packageManager.getApplicationInfo(h, 0);
                } catch (PackageManager.NameNotFoundException e) {
                    ((C59052c) ((C59052c) ((C59052c) C120921aq.f336210a.mo56226d()).mo56382g(e)).mo56372aa(35652)).mo56389s("Could not find application label for widget provider package %s", h);
                    applicationInfo = null;
                }
                mo104974j(applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo).toString() : BuildConfig.FLAVOR);
            }
            if (mo104971g().isEmpty() || ((String) mo104971g().get()).isEmpty()) {
                mo104977m((String) mo104969e().get());
            }
            return mo104966b();
        }
        throw new IllegalStateException("Either packageName or componentName should be specified");
    }

    /* renamed from: d */
    public abstract Optional mo104968d();

    /* renamed from: e */
    public abstract Optional mo104969e();

    /* renamed from: f */
    public abstract Optional mo104970f();

    /* renamed from: g */
    public abstract Optional mo104971g();

    /* renamed from: h */
    public abstract String mo104972h();

    /* renamed from: i */
    public abstract void mo104973i(ComponentName componentName);

    /* renamed from: j */
    public abstract void mo104974j(String str);

    /* renamed from: k */
    public abstract void mo104975k(C120924at atVar);

    /* renamed from: l */
    public abstract void mo104976l(boolean z);

    /* renamed from: m */
    public abstract void mo104977m(String str);

    /* renamed from: n */
    public abstract void mo104978n(String str);

    /* renamed from: o */
    public abstract void mo104979o(boolean z);
}

package com.google.apps.tiktok.tracing.contrib.p3708i.p3711b;

import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.C44548d;
import com.google.apps.tiktok.tracing.C47525ak;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.b.a */
/* compiled from: PG */
public final /* synthetic */ class C47693a implements C44548d {

    /* renamed from: a */
    public final /* synthetic */ C47694b f123647a;

    /* renamed from: b */
    public final /* synthetic */ BottomNavigationView f123648b;

    /* renamed from: c */
    public final /* synthetic */ C44548d f123649c;

    public /* synthetic */ C47693a(C47694b bVar, BottomNavigationView bottomNavigationView, C44548d dVar) {
        this.f123647a = bVar;
        this.f123648b = bottomNavigationView;
        this.f123649c = dVar;
    }

    /* renamed from: a */
    public final boolean mo48238a(MenuItem menuItem) {
        C47694b bVar = this.f123647a;
        BottomNavigationView bottomNavigationView = this.f123648b;
        C44548d dVar = this.f123649c;
        if (!C47525ak.m84586a(bottomNavigationView.getContext())) {
            return false;
        }
        if (C47831fm.m85027v()) {
            return dVar.mo48238a(menuItem);
        }
        C47538ax c = bVar.f123650a.mo51613c("bottom navigation item selected");
        try {
            boolean a = dVar.mo48238a(menuItem);
            if (c == null) {
                return a;
            }
            c.close();
            return a;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}

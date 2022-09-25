package com.google.apps.tiktok.tracing.contrib.p3704f.p3705a;

import android.view.MenuItem;
import com.google.android.material.navigation.C44825l;
import com.google.android.material.navigation.NavigationBarView;
import com.google.apps.tiktok.tracing.C47525ak;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C47664a implements C44825l {

    /* renamed from: a */
    public final /* synthetic */ C47665b f123613a;

    /* renamed from: b */
    public final /* synthetic */ NavigationBarView f123614b;

    /* renamed from: c */
    public final /* synthetic */ C44825l f123615c;

    public /* synthetic */ C47664a(C47665b bVar, NavigationBarView navigationBarView, C44825l lVar) {
        this.f123613a = bVar;
        this.f123614b = navigationBarView;
        this.f123615c = lVar;
    }

    /* renamed from: a */
    public final boolean mo48238a(MenuItem menuItem) {
        C47665b bVar = this.f123613a;
        NavigationBarView navigationBarView = this.f123614b;
        C44825l lVar = this.f123615c;
        if (!C47525ak.m84586a(navigationBarView.getContext())) {
            return false;
        }
        if (C47831fm.m85027v()) {
            return lVar.mo48238a(menuItem);
        }
        C47538ax c = bVar.f123616a.mo51613c("[NavigationBarFragmentPeer] Navigation bar item tapped");
        try {
            boolean a = lVar.mo48238a(menuItem);
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

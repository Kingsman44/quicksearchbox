package com.google.android.libraries.search.video.players.internal;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.view.Window;
import com.google.apps.tiktok.inject.p3657c.C47215a;

/* renamed from: com.google.android.libraries.search.video.players.internal.b */
/* compiled from: PG */
public final class C41576b extends C0167am {

    /* renamed from: j */
    private C47215a f108691j;

    public final View findViewById(int i) {
        return getWindow().findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo44131j(C47215a aVar) {
        this.f108691j = aVar;
        attachBaseContext(aVar.mo51121p());
    }

    public final void onBackPressed() {
    }

    public final Window getWindow() {
        C47215a aVar = this.f108691j;
        aVar.getClass();
        return aVar.mo51123r();
    }

    /* renamed from: jw */
    public final FragmentManager mo545jw() {
        C47215a aVar = this.f108691j;
        aVar.getClass();
        return aVar.mo51122q();
    }
}

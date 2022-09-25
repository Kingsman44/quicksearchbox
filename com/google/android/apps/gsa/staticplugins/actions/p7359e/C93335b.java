package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.b */
/* compiled from: PG */
final class C93335b implements C93358y {

    /* renamed from: a */
    final /* synthetic */ String f260311a;

    /* renamed from: b */
    final /* synthetic */ String f260312b;

    /* renamed from: c */
    final /* synthetic */ C93336c f260313c;

    public C93335b(C93336c cVar, String str, String str2) {
        this.f260313c = cVar;
        this.f260311a = str;
        this.f260312b = str2;
    }

    /* renamed from: a */
    public final int mo87641a() {
        return 0;
    }

    /* renamed from: b */
    public final C93333aa mo87642b() {
        return this.f260313c.f260314a;
    }

    /* renamed from: c */
    public final C93333aa mo87643c() {
        return this.f260313c.f260315b;
    }

    /* renamed from: d */
    public final Object[] mo87644d(Resources resources) {
        return new Object[]{this.f260311a, this.f260312b, resources.getString(R.string.spoken_cancel_command_tts)};
    }
}

package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.z */
/* compiled from: PG */
public final /* synthetic */ class C76341z implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76291ab f211432a;

    /* renamed from: b */
    public final /* synthetic */ Locale f211433b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f211434c;

    public /* synthetic */ C76341z(C76291ab abVar, Locale locale, Bitmap bitmap) {
        this.f211432a = abVar;
        this.f211433b = locale;
        this.f211434c = bitmap;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76291ab abVar = this.f211432a;
        Locale locale = this.f211433b;
        Bitmap bitmap = this.f211434c;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            abVar.mo72161c(locale);
            return C118826c.f331422a;
        }
        Uri uri = (Uri) optional.get();
        C76303an anVar = abVar.f211326d;
        anVar.mo72162b(anVar.f211348d.mo75121a(locale).getString(R.string.nga_screenshot_taken_title, new Object[0]), new C76301al(anVar, locale, uri, bitmap));
        abVar.f211325c.mo71240g(uri);
        return C118826c.f331422a;
    }
}

package com.google.android.libraries.componentview.p1699f;

import android.net.Uri;
import com.google.android.libraries.componentview.services.application.NavigationParams;
import com.google.common.base.C58817ah;
import java.util.Locale;

/* renamed from: com.google.android.libraries.componentview.f.i */
/* compiled from: PG */
public final /* synthetic */ class C20521i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C20524l f57646a;

    /* renamed from: b */
    public final /* synthetic */ String f57647b;

    /* renamed from: c */
    public final /* synthetic */ boolean f57648c;

    /* renamed from: d */
    public final /* synthetic */ Uri f57649d;

    public /* synthetic */ C20521i(C20524l lVar, String str, boolean z, Uri uri) {
        this.f57646a = lVar;
        this.f57647b = str;
        this.f57648c = z;
        this.f57649d = uri;
    }

    public final Object apply(Object obj) {
        boolean z;
        C20524l lVar = this.f57646a;
        String str = this.f57647b;
        boolean z2 = this.f57648c;
        Uri uri = this.f57649d;
        String str2 = (String) obj;
        if (str == null || ((!str.endsWith(str2.toLowerCase(Locale.US)) && !str.endsWith("www.google.com".toLowerCase(Locale.US))) || !z2)) {
            lVar.f57655a.mo21039a(uri.toString(), NavigationParams.m38563c().mo25555a());
            lVar.mo25441c();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

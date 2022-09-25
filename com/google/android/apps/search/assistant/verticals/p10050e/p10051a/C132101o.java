package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60812at;
import java.io.BufferedInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.o */
/* compiled from: PG */
public final /* synthetic */ class C132101o implements C60803ak {

    /* renamed from: a */
    public final /* synthetic */ C132105s f360489a;

    /* renamed from: b */
    public final /* synthetic */ Uri f360490b;

    public /* synthetic */ C132101o(C132105s sVar, Uri uri) {
        this.f360489a = sVar;
        this.f360490b = uri;
    }

    /* renamed from: a */
    public final Object mo23284a(C60812at atVar) {
        C132105s sVar = this.f360489a;
        BufferedInputStream bufferedInputStream = new BufferedInputStream((InputStream) sVar.f360497c.mo45889c(this.f360490b, new C42790n()));
        atVar.mo57268a(bufferedInputStream, sVar.f360498d);
        return bufferedInputStream;
    }
}

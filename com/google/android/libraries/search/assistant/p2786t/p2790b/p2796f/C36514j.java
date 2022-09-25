package com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f;

import android.net.Uri;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2797g.C36526b;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.assistant.t.b.f.j */
/* compiled from: PG */
public final /* synthetic */ class C36514j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36524t f95284a;

    /* renamed from: b */
    public final /* synthetic */ String f95285b;

    /* renamed from: c */
    public final /* synthetic */ Uri f95286c;

    public /* synthetic */ C36514j(C36524t tVar, String str, Uri uri) {
        this.f95284a = tVar;
        this.f95285b = str;
        this.f95286c = uri;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C36524t tVar = this.f95284a;
        String str = this.f95285b;
        Uri uri = this.f95286c;
        C47558bi a = C47831fm.m85006a("NotificationParser#copyAudioContent");
        try {
            C36526b.m65065a(tVar.f95298b, uri, new File(tVar.f95298b.getCacheDir(), str));
            a.close();
            return C60866ct.f164955a;
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C36524t.f95297a.mo56226d()).mo56382g(e)).mo56372aa(51493)).mo56386p("Failed to copy audio content");
            C60870cx h = C60856cj.m92899h(e);
            a.close();
            return h;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}

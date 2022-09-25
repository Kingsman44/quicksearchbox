package com.google.android.libraries.p579ar.faceviewer.utils;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.io.File;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.android.libraries.ar.faceviewer.utils.a */
/* compiled from: PG */
public final /* synthetic */ class C10668a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ CronetEngine f35587a;

    /* renamed from: b */
    public final /* synthetic */ String f35588b;

    /* renamed from: c */
    public final /* synthetic */ File f35589c;

    /* renamed from: d */
    public final /* synthetic */ Executor f35590d;

    public /* synthetic */ C10668a(CronetEngine cronetEngine, String str, File file, Executor executor) {
        this.f35587a = cronetEngine;
        this.f35588b = str;
        this.f35589c = file;
        this.f35590d = executor;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        CronetEngine cronetEngine = this.f35587a;
        String str = this.f35588b;
        File file = this.f35589c;
        cronetEngine.newUrlRequestBuilder(str, new C10669b(cVar, file), this.f35590d).build().start();
        String absolutePath = file.getAbsolutePath();
        return "UrlRequest to file: " + absolutePath + " for: " + str;
    }
}

package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.p579ar.faceviewer.runtime.RuntimeJni;
import com.google.p363ad.p364a.C6682f;
import com.google.research.xeno.effect.AssetDownloader;
import java.util.Locale;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.z */
/* compiled from: PG */
public final /* synthetic */ class C10625z implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ AssetDownloader f35498a;

    /* renamed from: b */
    public final /* synthetic */ String f35499b;

    /* renamed from: c */
    public final /* synthetic */ C6682f f35500c;

    /* renamed from: d */
    public final /* synthetic */ Locale f35501d;

    public /* synthetic */ C10625z(AssetDownloader assetDownloader, String str, C6682f fVar, Locale locale) {
        this.f35498a = assetDownloader;
        this.f35499b = str;
        this.f35500c = fVar;
        this.f35501d = locale;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        AssetDownloader assetDownloader = this.f35498a;
        String str = this.f35499b;
        C6682f fVar = this.f35500c;
        Locale locale = this.f35501d;
        int i = C10581ab.f35401b;
        String country = locale.getCountry();
        String language = locale.getLanguage();
        RuntimeJni.m25660a(assetDownloader, str, fVar, country + ":" + language, new C10616q(cVar, C10580aa.f35400a));
        return "FaceViewerRuntime.create";
    }
}

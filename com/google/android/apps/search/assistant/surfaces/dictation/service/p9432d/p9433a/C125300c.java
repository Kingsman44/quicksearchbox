package com.google.android.apps.search.assistant.surfaces.dictation.service.p9432d.p9433a;

import android.net.Uri;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.c */
/* compiled from: PG */
public final /* synthetic */ class C125300c implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f345654a;

    /* renamed from: b */
    public final /* synthetic */ String f345655b;

    /* renamed from: c */
    public final /* synthetic */ Locale f345656c;

    public /* synthetic */ C125300c(String str, String str2, Locale locale) {
        this.f345654a = str;
        this.f345655b = str2;
        this.f345656c = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f345654a;
        String str2 = this.f345655b;
        Locale locale = this.f345656c;
        Uri uri = (Uri) obj;
        C59052c cVar = (C59052c) C125311n.f345675a.mo56224b();
        cVar.mo56374ac(1, TimeUnit.MINUTES);
        ((C59052c) cVar.mo56372aa(36486)).mo56360M("Found %s in file group %s for %s at URI: %s [SD]", C126290c.m206496a(str), C126290c.m206496a(str2), locale, C126290c.m206496a(uri));
        return uri;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

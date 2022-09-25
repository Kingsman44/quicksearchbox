package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9275c.C122212a;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.by */
/* compiled from: PG */
public final /* synthetic */ class C122266by implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122272cd f339036a;

    /* renamed from: b */
    public final /* synthetic */ C17036ac f339037b;

    /* renamed from: c */
    public final /* synthetic */ C17044ak f339038c;

    public /* synthetic */ C122266by(C122272cd cdVar, C17036ac acVar, C17044ak akVar) {
        this.f339036a = cdVar;
        this.f339037b = acVar;
        this.f339038c = akVar;
    }

    public final C60870cx apply(Object obj) {
        C122272cd cdVar = this.f339036a;
        C17036ac acVar = this.f339037b;
        C17044ak akVar = this.f339038c;
        String str = (String) obj;
        String str2 = acVar.f49644c;
        if (cdVar.f339052d.isEmpty()) {
            return cdVar.mo105582b(akVar, str);
        }
        C60870cx a = ((C122212a) cdVar.f339052d.get()).mo105573a();
        C122267bz bzVar = new C122267bz(cdVar, str, akVar);
        return C60922j.m93045h(a, C47810es.m84966f(bzVar), cdVar.f339050b);
    }
}

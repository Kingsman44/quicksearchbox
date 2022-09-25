package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.cb */
/* compiled from: PG */
public final /* synthetic */ class C122270cb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122272cd f339046a;

    /* renamed from: b */
    public final /* synthetic */ String f339047b;

    /* renamed from: c */
    public final /* synthetic */ C17036ac f339048c;

    public /* synthetic */ C122270cb(C122272cd cdVar, String str, C17036ac acVar) {
        this.f339046a = cdVar;
        this.f339047b = str;
        this.f339048c = acVar;
    }

    public final C60870cx apply(Object obj) {
        C122272cd cdVar = this.f339046a;
        String str = this.f339047b;
        C17036ac acVar = this.f339048c;
        C58833ax axVar = (C58833ax) obj;
        C28804cs f = C28805ct.m53747f();
        f.mo34449c(str);
        f.mo34448b(axVar);
        C60870cx c = cdVar.f339051c.mo105550c(f.mo34447a(), Locale.forLanguageTag(acVar.f49644c));
        C122269ca caVar = new C122269ca(str, axVar, acVar);
        return C60922j.m93044g(c, C47810es.m84963c(caVar), cdVar.f339050b);
    }
}

package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C18803ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18820at f52943a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f52944b;

    /* renamed from: c */
    public final /* synthetic */ List f52945c;

    public /* synthetic */ C18803ac(C18820at atVar, ComponentName componentName, List list) {
        this.f52943a = atVar;
        this.f52944b = componentName;
        this.f52945c = list;
    }

    public final Object apply(Object obj) {
        C18820at atVar = this.f52943a;
        ComponentName componentName = this.f52944b;
        List list = this.f52945c;
        Void voidR = (Void) obj;
        int f = atVar.mo24170f();
        Optional a = atVar.f52979h.mo24193a();
        atVar.mo24172h(componentName, f, (String) a.orElse(BuildConfig.FLAVOR));
        return atVar.mo24171g(componentName, list, f, (String) a.orElse(BuildConfig.FLAVOR));
    }
}

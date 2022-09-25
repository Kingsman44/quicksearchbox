package com.google.android.apps.gsa.p8867w.p8872c;

import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e.C13973a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e.C13975b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.c.b */
/* compiled from: PG */
public final /* synthetic */ class C118751b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118752c f331238a;

    public /* synthetic */ C118751b(C118752c cVar) {
        this.f331238a = cVar;
    }

    public final Object call() {
        C118752c cVar = this.f331238a;
        C13973a aVar = (C13973a) C13975b.f42550c.createBuilder();
        String string = ((SharedPreferences) cVar.f331239a.mo17428b()).getString("opa_android_sticky_media_app", BuildConfig.FLAVOR);
        aVar.copyOnWrite();
        C13975b bVar = (C13975b) aVar.instance;
        string.getClass();
        bVar.f42552a |= 1;
        bVar.f42553b = string;
        return (C13975b) aVar.build();
    }
}

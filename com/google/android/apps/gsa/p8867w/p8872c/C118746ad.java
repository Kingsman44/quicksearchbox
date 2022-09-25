package com.google.android.apps.gsa.p8867w.p8872c;

import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.media.p1053d.p1059d.C14001a;
import com.google.android.libraries.assistant.auto.tng.media.p1053d.p1059d.C14002b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.c.ad */
/* compiled from: PG */
public final /* synthetic */ class C118746ad implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118747ae f331231a;

    public /* synthetic */ C118746ad(C118747ae aeVar) {
        this.f331231a = aeVar;
    }

    public final Object call() {
        C118747ae aeVar = this.f331231a;
        C14001a aVar = (C14001a) C14002b.f42599c.createBuilder();
        String string = ((SharedPreferences) aeVar.f331232a.mo17428b()).getString("opa_on_auto_sticky_media_app", BuildConfig.FLAVOR);
        aVar.copyOnWrite();
        C14002b bVar = (C14002b) aVar.instance;
        string.getClass();
        bVar.f42601a |= 1;
        bVar.f42602b = string;
        return (C14002b) aVar.build();
    }
}

package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127746g;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a.C127767c;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a.C127773i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.y */
/* compiled from: PG */
public final /* synthetic */ class C127808y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C127809z f351773a;

    public /* synthetic */ C127808y(C127809z zVar) {
        this.f351773a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C127809z zVar = this.f351773a;
        if (!((C127746g) obj).equals(C127746g.MODE_OVERAPP_USER_INPUT_PLATE)) {
            return C60856cj.m92900i(Optional.empty());
        }
        C127773i iVar = zVar.f351774a;
        Locale locale = Locale.US;
        C60870cx a = iVar.f351704e.mo109114a();
        C127767c cVar = new C127767c(iVar, locale);
        return C60922j.m93045h(a, C47810es.m84966f(cVar), iVar.f351703d);
    }
}

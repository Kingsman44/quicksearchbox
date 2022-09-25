package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127746g;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9645c.C127777a;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9645c.C127782f;
import com.google.android.libraries.search.assistant.p2714o.p2715a.C34913n;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.v */
/* compiled from: PG */
public final /* synthetic */ class C127805v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C127809z f351770a;

    public /* synthetic */ C127805v(C127809z zVar) {
        this.f351770a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C127809z zVar = this.f351770a;
        if (!((C127746g) obj).equals(C127746g.MODE_OVERAPP_USER_INPUT_PLATE)) {
            return C60856cj.m92900i(Optional.empty());
        }
        C127782f fVar = zVar.f351776c;
        Locale locale = Locale.US;
        C60870cx a = fVar.f351730d.mo108181a();
        C60870cx f = ((C34913n) fVar.f351728b).mo39623a();
        return C47638k.m84753d(f, a).mo51521b(new C127777a(fVar, a, f, locale), fVar.f351731e);
    }
}

package com.google.android.apps.gsa.search.core.p6519al.p6628by.p6629a;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.by.a.c */
/* compiled from: PG */
public final class C85039c extends C86731k {

    /* renamed from: c */
    private final Intent f230706c;

    public C85039c(Intent intent) {
        super("podcastplayer", "podcastplayer::handlePlayEpisodeInBackgroundRequestIntent", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230706c = intent;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85043g) obj).mo78665b(this.f230706c);
        return C118826c.f331423b;
    }
}

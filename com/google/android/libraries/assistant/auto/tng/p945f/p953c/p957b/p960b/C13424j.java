package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import android.media.MediaPlayer;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.j */
/* compiled from: PG */
public final /* synthetic */ class C13424j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C13426l f41240a;

    public /* synthetic */ C13424j(C13426l lVar) {
        this.f41240a = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C13426l lVar = this.f41240a;
        MediaPlayer mediaPlayer = lVar.f41245c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            lVar.f41245c = null;
        }
        return C60866ct.f164955a;
    }
}

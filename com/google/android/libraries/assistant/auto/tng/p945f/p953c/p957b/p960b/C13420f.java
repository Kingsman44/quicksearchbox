package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import android.media.MediaPlayer;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.f */
/* compiled from: PG */
public final /* synthetic */ class C13420f implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C2164c f41229a;

    public /* synthetic */ C13420f(C2164c cVar) {
        this.f41229a = cVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C2164c cVar = this.f41229a;
        ((C59052c) ((C59052c) C13426l.f41243a.mo56226d()).mo56372aa(44804)).mo56393w("MediaPlayer onError what=%d, extra=%d", i, i2);
        cVar.mo5438c();
        return true;
    }
}

package com.google.android.apps.search.pronunciationlearning.p10628a;

import android.media.AudioTrack;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.search.pronunciationlearning.a.e */
/* compiled from: PG */
public final /* synthetic */ class C141298e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141305l f383603a;

    /* renamed from: b */
    public final /* synthetic */ int f383604b;

    public /* synthetic */ C141298e(C141305l lVar, int i) {
        this.f383603a = lVar;
        this.f383604b = i;
    }

    public final void run() {
        C141305l lVar = this.f383603a;
        int i = this.f383604b;
        Map map = lVar.f383617d;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C60870cx cxVar = (C60870cx) lVar.f383617d.get(valueOf);
            cxVar.getClass();
            cxVar.cancel(true);
            lVar.f383617d.remove(valueOf);
        }
        C141307n nVar = (C141307n) lVar.f383616c;
        AudioTrack audioTrack = nVar.f383625c;
        if (audioTrack != null) {
            audioTrack.release();
            nVar.f383625c = null;
        }
    }
}

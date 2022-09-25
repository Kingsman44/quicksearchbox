package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.media.MediaPlayer;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.al */
/* compiled from: PG */
public final /* synthetic */ class C93133al implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259774a;

    /* renamed from: b */
    public final /* synthetic */ boolean f259775b;

    public /* synthetic */ C93133al(C93150bb bbVar, boolean z) {
        this.f259774a = bbVar;
        this.f259775b = z;
    }

    public final Object apply(Object obj) {
        C93150bb bbVar = this.f259774a;
        boolean z = this.f259775b;
        List list = (List) obj;
        MediaPlayer mediaPlayer = bbVar.f259811l;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            bbVar.f259811l = null;
        }
        if (bbVar.f259806g.mo79746e(C90025cd.f248159q)) {
            bbVar.mo87559j(C88244um.MULTI_MEDIA_MESSAGE_NOTIFICATION_PLAYBACK_DONE);
        }
        return z ? C22402a.f61894b : C22402a.f61893a;
    }
}

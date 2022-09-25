package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.warmactions.p6254f.C79564a;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Arrays;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.aa */
/* compiled from: PG */
public final class C79645aa implements C79688bq {

    /* renamed from: a */
    public static final C58974d f218462a = C58974d.m91136j();

    /* renamed from: b */
    static final C58495hd f218463b = C58495hd.m89897k(Arrays.asList(new Map.Entry[]{Map.CC.entry("play", C79564a.PLAY), Map.CC.entry("resume", C79564a.PLAY), Map.CC.entry("pause", C79564a.PAUSE), Map.CC.entry("stop", C79564a.STOP), Map.CC.entry("next", C79564a.NEXT), Map.CC.entry("previous", C79564a.PREVIOUS), Map.CC.entry("volume_up", C79564a.VOLUME_UP), Map.CC.entry("volume_down", C79564a.VOLUME_DOWN), Map.CC.entry("en/pause_the_music", C79564a.PAUSE), Map.CC.entry("en/skip_the_song", C79564a.NEXT), Map.CC.entry("en/stop_the_music", C79564a.STOP), Map.CC.entry("en/turn_up_the_volume", C79564a.VOLUME_UP), Map.CC.entry("en/turn_down_the_volume", C79564a.VOLUME_DOWN)}));

    /* renamed from: c */
    public final C68214a f218464c;

    /* renamed from: d */
    public final C91142g f218465d;

    /* renamed from: e */
    private final C22871g f218466e;

    public C79645aa(C91142g gVar, C68214a aVar, C90821bm bmVar) {
        this.f218465d = gVar;
        this.f218464c = aVar;
        this.f218466e = bmVar.mo85163a(C79717z.class);
    }

    /* renamed from: b */
    public final boolean mo74176b(C79690bs bsVar) {
        return false;
    }

    /* renamed from: h */
    public final C60870cx mo74177h(C79690bs bsVar) {
        return this.f218466e.mo28201a("[NGA][WA] Media query execution", new C79716y(this, bsVar));
    }
}

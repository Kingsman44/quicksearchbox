package com.google.android.apps.gsa.staticplugins.p7613bw;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.p128m.p129a.C2399d;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6588bg.C84839a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55160ib;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bw.f */
/* compiled from: PG */
public final class C97309f extends C86734a implements C84839a {

    /* renamed from: a */
    public static final C59071e f271747a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bw.f");

    /* renamed from: b */
    public static final C55160ib f271748b = C55160ib.INVALID_COMMAND;

    /* renamed from: c */
    public final C86124t f271749c;

    /* renamed from: f */
    public final C22871g f271750f;

    /* renamed from: g */
    final C87594r f271751g;

    /* renamed from: h */
    final C97304a f271752h;

    /* renamed from: i */
    final BroadcastReceiver f271753i = new C97308e(this);

    /* renamed from: j */
    private final Context f271754j;

    /* renamed from: k */
    private final C22871g f271755k;

    /* renamed from: l */
    private final C68214a f271756l;

    public C97309f(Context context, C86124t tVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C68214a aVar) {
        super(C118575h.WORKER_MEDIA_CONTROL, "mediacontrol");
        this.f271754j = context;
        this.f271749c = tVar;
        this.f271750f = gVar;
        this.f271755k = gVar2;
        this.f271756l = aVar;
        this.f271752h = new C97310g();
        this.f271751g = new C87594r(context, gVar3, gVar2);
        gVar2.mo28212l("MediaControlWorker.start", new C97306c(this, C2399d.m6419a(context)));
    }

    /* renamed from: a */
    public final C60870cx mo78523a() {
        PlaybackStatus f = this.f271751g.mo81727f();
        if (f != null) {
            f.f236616m = this.f271752h;
        }
        C87541c cVar = (C87541c) this.f271756l.mo27525b();
        if (cVar != null) {
            synchronized (cVar.f236439a) {
                cVar.f236450l = f;
            }
        }
        return C60856cj.m92900i(f);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f271755k.mo28212l("MediaControlWorker.dispose", new C97305b(this, C2399d.m6419a(this.f271754j)));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}

package com.google.android.apps.gsa.p8889z.p8890a;

import android.media.MediaPlayer;
import android.os.ConditionVariable;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a.C107810g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.z.a.e */
/* compiled from: PG */
public abstract class C118842e {

    /* renamed from: a */
    public static final C59071e f331457a = C59071e.m91332i("com.google.android.apps.gsa.z.a.e");

    /* renamed from: b */
    public boolean f331458b;

    /* renamed from: c */
    final ConditionVariable f331459c = new ConditionVariable();

    /* renamed from: d */
    final ConditionVariable f331460d = new ConditionVariable();

    /* renamed from: e */
    public final C118843f f331461e;

    /* renamed from: f */
    public final C90929bz f331462f;

    /* renamed from: g */
    protected MediaPlayer f331463g;

    /* renamed from: h */
    public volatile boolean f331464h;

    /* renamed from: i */
    public double f331465i;

    /* renamed from: j */
    public MediaPlayer.OnCompletionListener f331466j;

    /* renamed from: k */
    public C118841d f331467k;

    /* renamed from: l */
    public C107810g f331468l;

    /* renamed from: m */
    private final C68214a f331469m;

    /* renamed from: n */
    private volatile C90908be f331470n;

    public C118842e(C118843f fVar, C90929bz bzVar, C68214a aVar) {
        this.f331461e = fVar;
        this.f331462f = bzVar;
        this.f331469m = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo104033a();

    /* renamed from: b */
    public final void mo104034b() {
        try {
            this.f331463g.stop();
        } catch (IllegalStateException unused) {
        }
        this.f331463g.release();
        this.f331461e.mo71752m();
        if (this.f331470n != null) {
            this.f331462f.mo85139d(this.f331470n);
        }
    }

    /* renamed from: c */
    public final void mo104035c(C90908be beVar) {
        C89949q.m146523g(405);
        ((C89859i) this.f331469m.mo27525b()).mo83702b(C89849ae.TTS_PLAY_STARTED);
        this.f331470n = beVar;
        this.f331459c.open();
    }
}

package com.google.android.apps.gsa.nga.engine.viss;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.nga.api.C74682ab;
import com.google.android.apps.gsa.nga.p5887c.C74745a;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80970b;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80997q;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;

/* compiled from: PG */
public class NgaService extends C89286c {

    /* renamed from: a */
    public static final C58974d f217912a = C58974d.m91136j();

    /* renamed from: A */
    public C68214a f217913A;

    /* renamed from: B */
    public C68214a f217914B;

    /* renamed from: C */
    public C68214a f217915C;

    /* renamed from: D */
    public C68214a f217916D;

    /* renamed from: E */
    public C68214a f217917E;

    /* renamed from: F */
    public C68214a f217918F;

    /* renamed from: G */
    public C68214a f217919G;

    /* renamed from: H */
    public C68214a f217920H;

    /* renamed from: I */
    public C68214a f217921I;

    /* renamed from: J */
    public C68214a f217922J;

    /* renamed from: K */
    public final Object f217923K = new Object();

    /* renamed from: L */
    public C80997q f217924L;

    /* renamed from: M */
    private final C74682ab f217925M = new C79378h(this);

    /* renamed from: b */
    public C68214a f217926b;

    /* renamed from: c */
    public C68214a f217927c;

    /* renamed from: d */
    public C68214a f217928d;

    /* renamed from: e */
    public C68214a f217929e;

    /* renamed from: f */
    public C68214a f217930f;

    /* renamed from: g */
    public C68214a f217931g;

    /* renamed from: h */
    public C68214a f217932h;

    /* renamed from: i */
    public C68214a f217933i;

    /* renamed from: j */
    public C68214a f217934j;

    /* renamed from: k */
    public C68214a f217935k;

    /* renamed from: l */
    public C68214a f217936l;

    /* renamed from: m */
    public C68214a f217937m;

    /* renamed from: n */
    public C68214a f217938n;

    /* renamed from: o */
    public C68214a f217939o;

    /* renamed from: p */
    public C68214a f217940p;

    /* renamed from: q */
    public C68214a f217941q;

    /* renamed from: r */
    public C68214a f217942r;

    /* renamed from: s */
    public C68214a f217943s;

    /* renamed from: t */
    public C68214a f217944t;

    /* renamed from: u */
    public C68214a f217945u;

    /* renamed from: v */
    public C68214a f217946v;

    /* renamed from: w */
    public C68214a f217947w;

    /* renamed from: x */
    public C68214a f217948x;

    /* renamed from: y */
    public C68214a f217949y;

    /* renamed from: z */
    public C68214a f217950z;

    public final IBinder onBind(Intent intent) {
        return this.f217925M;
    }

    public final void onCreate() {
        C74507e.m120466b(8);
        super.onCreate();
        C79380j jVar = (C79380j) C74745a.m120861a(this);
        if (jVar == null) {
            stopSelf();
        } else {
            jVar.mo73999pU(this);
        }
    }

    public final boolean onUnbind(Intent intent) {
        synchronized (this.f217923K) {
            C80997q qVar = this.f217924L;
            if (qVar != null) {
                ((C80970b) this.f217931g.mo27525b()).mo74744e(qVar);
                this.f217924L = null;
            }
        }
        return super.onUnbind(intent);
    }
}

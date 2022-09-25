package com.google.android.libraries.lens.p1995c.p1996a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.C84203c;
import com.google.android.apps.gsa.publicsearch.C84205e;
import com.google.android.apps.gsa.publicsearch.C84209i;
import com.google.android.apps.gsa.publicsearch.C84211k;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87740bv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87953js;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87955ju;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88187sj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88188sk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88189sl;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.lens.c.a.s */
/* compiled from: PG */
public final class C24091s extends C84211k implements ServiceConnection, C24083k {

    /* renamed from: a */
    public final Executor f65792a = new C24090r(new Handler(Looper.getMainLooper()));

    /* renamed from: b */
    public final Context f65793b;

    /* renamed from: c */
    public final C24082j f65794c;

    /* renamed from: d */
    public int f65795d = 1;

    /* renamed from: e */
    public int f65796e;

    /* renamed from: f */
    public C87955ju f65797f;

    /* renamed from: g */
    public C87953js f65798g;

    /* renamed from: h */
    public C84205e f65799h;

    /* renamed from: i */
    public C84209i f65800i;

    /* renamed from: j */
    public int f65801j = 1;

    /* renamed from: k */
    private final Executor f65802k;

    /* renamed from: l */
    private final C24076d f65803l;

    public C24091s(Context context, C24082j jVar, C24076d dVar) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C24087o.f65786a);
        this.f65793b = context;
        this.f65794c = jVar;
        this.f65803l = dVar;
        this.f65802k = newSingleThreadExecutor;
    }

    /* renamed from: j */
    public static boolean m44726j(int i) {
        return i == 2;
    }

    /* renamed from: k */
    public static boolean m44727k(int i) {
        return i == 3 || i == 4 || i == 5 || i == 7 || i == 8;
    }

    /* renamed from: l */
    public static boolean m44728l(int i) {
        return i == 5 || i == 8;
    }

    /* renamed from: n */
    private static boolean m44729n(int i) {
        return i == 6 || i == 7 || i == 8;
    }

    /* renamed from: o */
    private static boolean m44730o(int i) {
        return i == 5;
    }

    /* renamed from: a */
    public final int mo29479a() {
        C24092t.m44741a();
        C24092t.m44742b(m44728l(this.f65795d), "Attempted to use lensServiceSession before ready.");
        return this.f65796e;
    }

    /* renamed from: b */
    public final void mo29480b(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        C24092t.m44741a();
        C24092t.m44742b(mo29483f(), "Attempted to use lensServiceSession before ready.");
        C84209i iVar = this.f65800i;
        C24092t.m44743c(iVar);
        iVar.mo77672f(bArr, systemParcelableWrapper);
    }

    /* renamed from: c */
    public final void mo29481c() {
        C24092t.m44741a();
        C24092t.m44742b(mo29483f(), "Attempted to handover when not ready.");
        C87740bv bvVar = (C87740bv) C87741bw.f237477c.createBuilder();
        C87739bu buVar = C87739bu.STOP_CLIENT;
        bvVar.copyOnWrite();
        C87741bw bwVar = (C87741bw) bvVar.instance;
        bwVar.f237480b = buVar.f237476dL;
        bwVar.f237479a |= 1;
        C62940bt btVar = C88187sj.f238397a;
        C88188sk skVar = (C88188sk) C88189sl.f238398c.createBuilder();
        skVar.copyOnWrite();
        C88189sl slVar = (C88189sl) skVar.instance;
        slVar.f238400a |= 1;
        slVar.f238401b = true;
        bvVar.mo58885m(btVar, (C88189sl) skVar.build());
        C87741bw bwVar2 = (C87741bw) bvVar.build();
        try {
            C84209i iVar = this.f65800i;
            C24092t.m44743c(iVar);
            iVar.mo77671e(bwVar2.toByteArray());
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", e);
        }
        this.f65801j = 12;
        mo29493i(8);
    }

    /* renamed from: d */
    public final boolean mo29482d() {
        C24092t.m44741a();
        return m44729n(this.f65795d);
    }

    /* renamed from: e */
    public final void mo29491e(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        Executor executor = this.f65792a;
        ((C24090r) executor).f65791a.post(new C24088p(this, bArr, systemParcelableWrapper));
    }

    /* renamed from: f */
    public final boolean mo29483f() {
        C24092t.m44741a();
        return m44730o(this.f65795d);
    }

    /* renamed from: g */
    public final int mo29484g() {
        C24092t.m44741a();
        boolean z = true;
        if (!mo29483f() && !mo29482d()) {
            z = false;
        }
        C24092t.m44742b(z, "Attempted to use ServerFlags before ready or dead.");
        return this.f65801j;
    }

    /* renamed from: h */
    public final void mo29492h() {
        C24092t.m44741a();
        if (this.f65800i == null) {
            this.f65801j = 11;
            mo29493i(7);
            return;
        }
        this.f65801j = 11;
        mo29493i(8);
    }

    /* renamed from: i */
    public final void mo29493i(int i) {
        C24092t.m44741a();
        Log.d("LensServiceConnImpl", String.format("Transitioning from state %s to %s.", new Object[]{Integer.valueOf(this.f65795d), Integer.valueOf(i)}));
        int i2 = this.f65795d;
        this.f65795d = i;
        if (m44730o(i) && !m44730o(i2)) {
            C24082j jVar = this.f65794c;
            C24092t.m44741a();
            ((C24081i) jVar).mo29474c();
        }
        if (m44729n(i) && !m44729n(i2)) {
            C24082j jVar2 = this.f65794c;
            C24092t.m44741a();
            ((C24081i) jVar2).mo29474c();
        }
    }

    /* renamed from: m */
    public final void mo29494m() {
        C24092t.m44741a();
        int i = this.f65795d;
        if (m44726j(i) || m44727k(i)) {
            Log.d("LensServiceConnImpl", "Skipping bind because the service is already bound.");
            return;
        }
        mo29493i(2);
        this.f65803l.mo29470a(new C24089q(this));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C84205e eVar;
        C24092t.m44741a();
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            eVar = queryLocalInterface instanceof C84205e ? (C84205e) queryLocalInterface : new C84203c(iBinder);
        }
        this.f65799h = eVar;
        this.f65802k.execute(new C24086n(this, eVar));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C24092t.m44741a();
        this.f65801j = 11;
        mo29493i(7);
    }
}

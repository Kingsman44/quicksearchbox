package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.media.C0268e;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0320v;
import android.text.TextUtils;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.as */
/* compiled from: PG */
final class C18819as extends C0268e {

    /* renamed from: c */
    public final List f52967c;

    /* renamed from: d */
    public int f52968d;

    /* renamed from: e */
    final /* synthetic */ C18820at f52969e;

    /* renamed from: f */
    private boolean f52970f = false;

    /* renamed from: g */
    private boolean f52971g = false;

    public C18819as(C18820at atVar, int i, List list) {
        this.f52969e = atVar;
        this.f52968d = i;
        this.f52967c = list;
    }

    /* renamed from: a */
    public final void mo839a() {
        long j;
        if (!this.f52969e.f52978g.isPresent()) {
            ((C59052c) ((C59052c) C18820at.f52972a.mo56226d()).mo56372aa(47402)).mo56389s("#onConnected() No mediaBrowserCompat %s", this.f52969e.f52973b);
            return;
        }
        MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) this.f52969e.f52978g.get();
        if (!mediaBrowserCompat.mo805i() || mediaBrowserCompat.mo798b() == null) {
            ((C59052c) ((C59052c) C18820at.f52972a.mo56224b()).mo56372aa(47400)).mo56352E("#onConnected() NULL session token received, reconnecting to %s, retry #%d", this.f52969e.f52973b, this.f52968d);
            mo24164d(mediaBrowserCompat, 50, true);
            return;
        }
        ((C59052c) ((C59052c) C18820at.f52972a.mo56224b()).mo56372aa(47401)).mo56359L("#onConnected() isConnected %b hasConnectedBefore %b for %s", Boolean.valueOf(mediaBrowserCompat.mo805i()), Boolean.valueOf(this.f52970f), this.f52969e.f52973b);
        if (!this.f52971g) {
            this.f52971g = true;
            try {
                Context context = this.f52969e.f52974c;
                mediaBrowserCompat.getClass();
                C0320v vVar = new C0320v(context, mediaBrowserCompat.mo798b());
                this.f52969e.f52980i = Optional.m71637of(vVar);
                vVar.mo1040h(new C18817aq(this, vVar), (Handler) null);
            } catch (IllegalArgumentException | IllegalStateException e) {
                ((C59052c) ((C59052c) ((C59052c) C18820at.f52972a.mo56226d()).mo56382g(e)).mo56372aa(47397)).mo56389s("Event log: Failed to create MediaControllerCompat from token of MediaBrowserCompat %s", this.f52969e.f52973b);
            }
        }
        if (!this.f52970f || !((Boolean) this.f52969e.f52986o.mo17428b()).booleanValue()) {
            C18820at atVar = this.f52969e;
            C18830bc bcVar = atVar.f52975d;
            ComponentName componentName = atVar.f52973b;
            C58485gu j2 = C58485gu.m89842j(this.f52967c);
            C18889dh dhVar = (C18889dh) bcVar.f53031a.mo17428b();
            C18832be beVar = new C18832be(mediaBrowserCompat, componentName, j2, (C60888db) bcVar.f53032b.mo17428b(), C62950b.m95473d((C62910ar) bcVar.f53033c.mo17428b()), C62950b.m95473d((C62910ar) bcVar.f53034d.mo17428b()), C58485gu.m89842j(((C65603f) bcVar.f53035e.mo17428b()).f178307a), ((Boolean) bcVar.f53036f.mo17428b()).booleanValue(), ((Long) bcVar.f53037g.mo17428b()).longValue());
            try {
                beVar.f53055r = Optional.m71637of(beVar.f53039b.mo799c());
                Bundle a = beVar.f53039b.mo797a();
                String str = (String) beVar.f53055r.get();
                ((C59052c) ((C59052c) C18832be.f53038a.mo56224b()).mo56372aa(47443)).mo56359L("Media tree root ID {%s} for %s bundle %s", str, beVar.f53040c, a);
                if (beVar.f53039b.mo805i() && a != null) {
                    beVar.f53051n = Optional.m71637of(a);
                }
                if (TextUtils.isEmpty(str)) {
                    C58495hd hdVar = C58729pv.f156485a;
                    beVar.f53054q = C60856cj.m92900i(C18831bd.m36258f(hdVar, hdVar, hdVar, Optional.empty(), 15, "Root node null or empty."));
                } else {
                    beVar.f53054q = C2169h.m6027a(new C18825ay(beVar, str));
                }
            } catch (IllegalStateException e2) {
                ((C59052c) ((C59052c) ((C59052c) C18832be.f53038a.mo56225c()).mo56382g(e2)).mo56372aa(47444)).mo56386p("MediaBrowserCompat is not connected");
                beVar.f53054q = C60856cj.m92899h(e2);
            }
            atVar.f52982k = Optional.m71637of(beVar);
            C60870cx cxVar = ((C18832be) this.f52969e.f52982k.get()).f53054q;
            C18818ar arVar = new C18818ar(this);
            C60856cj.m92911t(cxVar, C47810es.m84974n(arVar), this.f52969e.f52977f);
            if (this.f52969e.f52973b.getPackageName().equals("com.spotify.music")) {
                j = C62950b.m95473d((C62910ar) this.f52969e.f52989r.mo17428b()).toMillis();
            } else {
                j = C62950b.m95473d((C62910ar) this.f52969e.f52988q.mo17428b()).toMillis();
            }
            this.f52969e.f52976e.postDelayed(new C18816ap(this, mediaBrowserCompat), j);
            this.f52970f = true;
        }
    }

    /* renamed from: b */
    public final void mo840b() {
        ((C59052c) ((C59052c) C18820at.f52972a.mo56226d()).mo56372aa(47403)).mo56389s("#onConnectionFailed() %s", this.f52969e.f52973b);
        this.f52969e.mo24173i(4, "Connection Failed.");
        this.f52969e.mo24167c(false);
    }

    /* renamed from: c */
    public final void mo841c() {
        ((C59052c) ((C59052c) C18820at.f52972a.mo56226d()).mo56372aa(47404)).mo56389s("#onConnectionSuspended() %s", this.f52969e.f52973b);
        this.f52969e.mo24173i(5, "Connection Suspended.");
        this.f52969e.mo24167c(false);
    }

    /* renamed from: d */
    public final void mo24164d(MediaBrowserCompat mediaBrowserCompat, long j, boolean z) {
        Runnable runnable;
        int i = this.f52968d + 1;
        this.f52968d = i;
        if (((long) i) < ((Long) this.f52969e.f52990s.mo17428b()).longValue()) {
            if (mediaBrowserCompat.mo805i()) {
                mediaBrowserCompat.mo801e();
            }
            if (!((Boolean) this.f52969e.f52984m.mo17428b()).booleanValue() || (!this.f52969e.f52973b.getPackageName().equals("com.spotify.music") && !this.f52969e.f52973b.getPackageName().equals("com.pandora.android"))) {
                runnable = new C18815ao(this, mediaBrowserCompat);
            } else {
                runnable = new C18814an(this);
            }
            this.f52969e.f52976e.postDelayed(runnable, j);
            return;
        }
        ((C59052c) ((C59052c) C18820at.f52972a.mo56226d()).mo56372aa(47405)).mo56387q("Retry connection #%d exceed limits.", this.f52968d);
        if (z) {
            ((C59052c) ((C59052c) C18820at.f52972a.mo56224b()).mo56372aa(47406)).mo56389s("Early exit due to retry limit reached for %s", this.f52969e.f52973b);
            this.f52969e.mo24173i(12, String.format("PCP exceeds retry limits {%s} for connecting to {%s}.", new Object[]{this.f52969e.f52990s.mo17428b(), this.f52969e.f52973b.getPackageName()}));
            this.f52969e.mo24167c(false);
        }
    }
}

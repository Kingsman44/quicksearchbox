package com.google.android.apps.search.transcription.p10670f;

import android.app.AppOpsManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.google.android.apps.search.transcription.p10665a.C141739e;
import com.google.android.apps.search.transcription.p10666b.C141747f;
import com.google.android.apps.search.transcription.p10666b.C141754m;
import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.search.transcription.f.au */
/* compiled from: PG */
final class C141802au implements C141787af, C141848bp {

    /* renamed from: a */
    public final AtomicBoolean f384822a = new AtomicBoolean(false);

    /* renamed from: b */
    final /* synthetic */ C141803av f384823b;

    /* renamed from: c */
    private final AtomicBoolean f384824c = new AtomicBoolean(false);

    /* renamed from: d */
    private final AtomicBoolean f384825d = new AtomicBoolean(false);

    /* renamed from: e */
    private final AtomicBoolean f384826e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicReference f384827f = new AtomicReference();

    /* renamed from: g */
    private long f384828g;

    public C141802au(C141803av avVar) {
        this.f384823b = avVar;
    }

    /* renamed from: q */
    private final void m230070q(int i) {
        DesugarAtomicReference.getAndUpdate(this.f384827f, new C141801at(this, i));
    }

    /* renamed from: a */
    public final void mo116727a() {
        this.f384822a.set(false);
        this.f384823b.f384836h.mo116727a();
        if (this.f384823b.f384832d.mo26871c() >= this.f384828g + ((long) this.f384823b.f384834f.mo116820b()) && (this.f384823b.f384834f.mo116820b() > 0 || !this.f384823b.f384834f.mo116836r())) {
            this.f384823b.f384837i.mo116720d();
        }
        if (this.f384823b.f384834f.mo116821c() > 0 && this.f384823b.f384834f.mo116836r()) {
            m230070q(this.f384823b.f384834f.mo116821c());
        }
    }

    /* renamed from: b */
    public final void mo116728b(C141760s sVar) {
        ((C59052c) ((C59052c) C141803av.f384829a.mo56226d()).mo56372aa(41872)).mo56352E("#onError space %s code %d!", sVar.f384731a.mo116704c(), sVar.f384731a.mo116703a());
        if (!this.f384824c.compareAndSet(false, true)) {
            ((C59052c) ((C59052c) C141803av.f384829a.mo56226d()).mo56372aa(41873)).mo56386p("#onError already finished - ignoring");
            return;
        }
        this.f384823b.f384837i.mo116720d();
        if (this.f384823b.mo116757e()) {
            int d = sVar.f384731a.mo116705d();
            if (d == 0) {
                throw null;
            } else if (d == 2) {
                C141739e eVar = this.f384823b.f384831c;
                if (eVar.f384717a.compareAndSet(false, true)) {
                    eVar.f384718b.mo116699a(R.raw.no_input);
                }
            } else {
                C141739e eVar2 = this.f384823b.f384831c;
                if (eVar2.f384717a.compareAndSet(false, true)) {
                    eVar2.f384718b.mo116699a(R.raw.failure);
                }
            }
        }
        this.f384823b.f384836h.mo116728b(sVar);
    }

    /* renamed from: c */
    public final void mo116729c(C141760s sVar) {
        ((C59052c) ((C59052c) C141803av.f384829a.mo56224b()).mo56372aa(41874)).mo56386p("#onFallback");
        this.f384823b.f384836h.mo116729c(sVar);
    }

    /* renamed from: d */
    public final void mo116730d() {
    }

    /* renamed from: e */
    public final void mo116731e(C141806ay ayVar) {
        if (this.f384824c.get()) {
            ((C59052c) ((C59052c) C141803av.f384829a.mo56226d()).mo56372aa(41881)).mo56386p("#onPartialResults already finished - ignoring");
        } else {
            this.f384823b.f384836h.mo116731e(ayVar);
        }
    }

    /* renamed from: f */
    public final void mo116732f() {
        if (!this.f384825d.get()) {
            ((C59052c) ((C59052c) C141803av.f384829a.mo56226d()).mo56372aa(41884)).mo56386p("#onRecognitionFinished no speech - erroring");
            mo116728b(new C141754m());
        } else if (!this.f384824c.compareAndSet(false, true)) {
            ((C59052c) ((C59052c) C141803av.f384829a.mo56226d()).mo56372aa(41883)).mo56386p("#onRecognitionFinished already finished - ignoring");
        } else {
            this.f384823b.f384837i.mo116720d();
            if (this.f384823b.mo116757e()) {
                C141739e eVar = this.f384823b.f384831c;
                if (eVar.f384717a.compareAndSet(false, true)) {
                    eVar.f384718b.mo116699a(R.raw.success);
                }
            }
            this.f384823b.f384836h.mo116732f();
        }
    }

    /* renamed from: g */
    public final void mo116733g(C141921o oVar) {
        if (!this.f384824c.get()) {
            if (!C141803av.m230087d(oVar)) {
                this.f384825d.set(true);
            }
            if (!C141803av.m230087d(oVar) || this.f384823b.f384834f.mo116836r()) {
                this.f384823b.f384836h.mo116733g(oVar);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) C141803av.f384829a.mo56226d()).mo56372aa(41886)).mo56386p("#onResults already finished - ignoring");
    }

    /* renamed from: h */
    public final void mo116734h(C67087ko koVar) {
        this.f384823b.f384836h.mo116734h(koVar);
    }

    /* renamed from: i */
    public final void mo116735i() {
        this.f384822a.set(true);
        this.f384823b.f384836h.mo116735i();
        if (this.f384823b.f384834f.mo116821c() > 0) {
            DesugarAtomicReference.getAndUpdate(this.f384827f, C141798aq.f384817a);
        }
    }

    /* renamed from: j */
    public final void mo116740j(Uri uri) {
        if (!this.f384823b.f384834f.mo116826h().isPresent() || !Uri.EMPTY.equals(uri)) {
            this.f384823b.f384835g.mo116740j(uri);
            return;
        }
        ((C59052c) ((C59052c) C141803av.f384829a.mo56226d()).mo56372aa(41870)).mo56386p("#onAudioRecordingCreated failed");
        mo116728b(new C141747f());
    }

    /* renamed from: k */
    public final void mo116741k() {
        this.f384823b.f384835g.mo116741k();
    }

    /* renamed from: l */
    public final void mo116742l() {
        this.f384826e.set(false);
        this.f384823b.f384835g.mo116742l();
    }

    /* renamed from: m */
    public final void mo116743m() {
        this.f384823b.f384835g.mo116743m();
    }

    /* renamed from: n */
    public final void mo116744n() {
        this.f384826e.set(true);
        if (!this.f384823b.f384834f.mo116827i().isPresent() && !this.f384823b.f384834f.mo116824f().isEmpty() && Build.VERSION.SDK_INT == 30) {
            mo116753p();
        }
        this.f384828g = this.f384823b.f384832d.mo26871c();
        if (this.f384823b.mo116757e()) {
            C141739e eVar = this.f384823b.f384831c;
            if (!eVar.f384717a.get()) {
                eVar.f384718b.mo116699a(R.raw.open);
            }
        }
        this.f384823b.f384835g.mo116744n();
        if (this.f384823b.f384834f.mo116820b() > 0) {
            this.f384823b.f384833e.mo29164d(C47810es.m84977q(new C141797ap(this)), (long) this.f384823b.f384834f.mo116820b(), TimeUnit.MILLISECONDS);
        }
        if (this.f384823b.f384834f.mo116821c() > 0) {
            m230070q(this.f384823b.f384834f.mo116821c());
        }
    }

    /* renamed from: o */
    public final void mo116745o(int i) {
        this.f384823b.f384835g.mo116745o(i);
    }

    /* renamed from: p */
    public final void mo116753p() {
        if (this.f384826e.get()) {
            ((AppOpsManager) this.f384823b.f384830b.getSystemService(AppOpsManager.class)).noteProxyOp((String) Objects.requireNonNull(AppOpsManager.permissionToOp("android.permission.RECORD_AUDIO")), this.f384823b.f384830b.getPackageName(), Process.myUid(), C39227c.m68658b(((C141808b) this.f384823b.f384834f.mo116824f().get()).mo116761c()), (String) null);
            if (((C141808b) this.f384823b.f384834f.mo116824f().get()).mo116760a() >= 0) {
                C141803av avVar = this.f384823b;
                ((AppOpsManager) C39239a.m68666a(avVar.f384830b, ((C141808b) avVar.f384834f.mo116824f().get()).mo116761c()).getSystemService(AppOpsManager.class)).noteProxyOp((String) Objects.requireNonNull(AppOpsManager.permissionToOp("android.permission.RECORD_AUDIO")), this.f384823b.f384834f.mo116832n(), ((C141808b) this.f384823b.f384834f.mo116824f().get()).mo116760a(), (String) null, String.valueOf(this.f384823b.f384834f.mo116832n()).concat(" is using voice-recognition"));
            }
            this.f384823b.f384833e.mo29164d(new C141799ar(this), 1, TimeUnit.SECONDS);
        }
    }
}

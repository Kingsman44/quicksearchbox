package com.google.android.apps.gsa.nga.engine.p6273z;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p6243v.C79358h;
import com.google.android.apps.gsa.nga.engine.recognition.C77495a;
import com.google.android.apps.gsa.nga.engine.recognition.C77553af;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.engine.recognition.C77570aw;
import com.google.android.apps.gsa.nga.engine.recognition.C77623f;
import com.google.android.apps.gsa.nga.engine.recognition.C77674j;
import com.google.android.apps.gsa.nga.engine.recognition.C77891w;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.apps.gsa.nga.shared.p6407v.p6408a.C82211am;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82434fa;
import com.google.android.libraries.p1635au.C19567d;
import com.google.speech.recognizer.p5233a.C67464l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.z.p */
/* compiled from: PG */
public final class C80045p implements C79358h, C77553af {

    /* renamed from: a */
    private final C83305i f219650a;

    /* renamed from: b */
    private final AtomicReference f219651b = new AtomicReference(C80044o.NOT_IN_LIFECYCLE);

    /* renamed from: c */
    private final AtomicBoolean f219652c = new AtomicBoolean(false);

    /* renamed from: d */
    private final AtomicReference f219653d = new AtomicReference("UNKNOWN");

    /* renamed from: e */
    private final C82211am f219654e;

    public C80045p(C82211am amVar, C83305i iVar) {
        this.f219654e = amVar;
        this.f219650a = iVar;
    }

    /* renamed from: a */
    public final void mo73590a(boolean z) {
        this.f219652c.set(false);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo72619c(C67464l lVar, ac acVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo72620e(C77557aj ajVar) {
    }

    /* renamed from: f */
    public final void mo72621f(C77570aw awVar) {
    }

    /* renamed from: g */
    public final void mo73591g() {
        this.f219652c.set(true);
    }

    /* renamed from: gG */
    public final void mo72714gG(C77623f fVar) {
    }

    /* renamed from: gK */
    public final void mo72622gK(C77891w wVar) {
        this.f219653d.set(((C77674j) wVar).f213954a.name());
        this.f219651b.set(this.f219652c.get() ? C80044o.IN_LIFECYCLE : C80044o.NOT_IN_LIFECYCLE);
    }

    /* renamed from: h */
    public final void mo74282h(C77495a aVar) {
        C83305i iVar = this.f219650a;
        String str = (String) this.f219653d.get();
        if (str != null) {
            String name = ((C80044o) this.f219651b.get()).name();
            if (name != null) {
                String name2 = aVar.name();
                if (name2 != null) {
                    iVar.mo75579d(new C82434fa("NGA_SPEECH_NOT_RECOGNIZED2", str, name, name2));
                    C82211am amVar = this.f219654e;
                    ((C19567d) ((C83311if) amVar.f224681a.mo27525b()).f227108j.mo6453a()).mo24822a(1, amVar.f224682b, amVar.f224683c);
                    return;
                }
                throw new NullPointerException("Null timeoutType");
            }
            throw new NullPointerException("Null lifecycleStateOnInvocation");
        }
        throw new NullPointerException("Null speechRecognizer");
    }
}

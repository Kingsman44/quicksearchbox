package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.animation.C147768a;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147774g;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.C147790p;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.MicHandler */
/* compiled from: PG */
final class MicHandler {

    /* renamed from: a */
    public static final Duration f214923a = Duration.ofMillis(300);

    /* renamed from: b */
    public static final Duration f214924b = Duration.ofMillis(500);

    /* renamed from: c */
    public final C2391v f214925c;

    /* renamed from: d */
    public final LogoView f214926d;

    /* renamed from: e */
    public final C22871g f214927e;

    /* renamed from: f */
    public final C75158f f214928f;

    /* renamed from: g */
    public final C91142g f214929g;

    /* renamed from: h */
    public final C78075n f214930h;

    /* renamed from: i */
    public final C75155d f214931i = new C78056bb(this);

    /* renamed from: j */
    public final C2376g f214932j = new C2376g() {
        /* renamed from: gV */
        public final void mo3520gV(C2391v vVar) {
            MicHandler micHandler = MicHandler.this;
            micHandler.f214928f.mo71506b(micHandler.f214931i);
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            vVar.getLifecycle().mo5791c(MicHandler.this.f214932j);
            MicHandler micHandler = MicHandler.this;
            micHandler.f214928f.mo71507c(micHandler.f214931i);
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    };

    /* renamed from: k */
    public final C147785k f214933k;

    public MicHandler(C2391v vVar, LogoView logoView, C147783f fVar, C22871g gVar, C75158f fVar2, C91142g gVar2, C78075n nVar) {
        this.f214925c = vVar;
        this.f214926d = logoView;
        this.f214927e = gVar;
        this.f214928f = fVar2;
        this.f214929g = gVar2;
        this.f214930h = nVar;
        C147770c cVar = new C147770c(new C78051ax(logoView));
        C147794t b = C147794t.m240888b(0.0f, 1.0f);
        b.f398763c = new C147790p(0.0f, 1.0f);
        C147768a a = cVar.mo124447a(b);
        C147770c cVar2 = new C147770c(new C78052ay(logoView));
        C147794t b2 = C147794t.m240888b(0.0f, 1.0f);
        b2.f398763c = new C147790p(0.0f, 1.0f);
        this.f214933k = fVar.mo124458a(C147774g.m240858a(a, cVar2.mo124447a(b2)));
    }
}

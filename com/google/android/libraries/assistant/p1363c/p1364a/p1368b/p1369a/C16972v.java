package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import android.app.PendingIntent;
import android.net.Uri;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.media3.common.C2576ac;
import androidx.media3.common.C2590aq;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.p145h.C3035ar;
import androidx.media3.exoplayer.p145h.C3124s;
import androidx.media3.exoplayer.p145h.C3127v;
import androidx.media3.p174ui.C3652p;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16940c;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16942e;
import com.google.android.libraries.assistant.p1363c.p1364a.p1368b.C16946a;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16980d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16984h;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16990n;
import com.google.android.p10890h.p10891a.p10892a.C146555j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3702d.C47656q;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.v */
/* compiled from: PG */
public final class C16972v implements C16946a {

    /* renamed from: a */
    public static final C59071e f49570a = C59071e.m91332i("com.google.android.libraries.assistant.c.a.b.a.v");

    /* renamed from: b */
    public final Executor f49571b;

    /* renamed from: c */
    public final C60887da f49572c;

    /* renamed from: d */
    public final C47656q f49573d;

    /* renamed from: e */
    public final C16976z f49574e;

    /* renamed from: f */
    public final C16950ac f49575f;

    /* renamed from: g */
    public C2759ad f49576g;

    /* renamed from: h */
    public C146555j f49577h;

    /* renamed from: i */
    public C16954d f49578i;

    /* renamed from: j */
    public C3652p f49579j;

    /* renamed from: k */
    public C16940c f49580k;

    /* renamed from: l */
    public C16942e f49581l;

    /* renamed from: m */
    public C16990n f49582m;

    /* renamed from: n */
    private final Executor f49583n;

    /* renamed from: o */
    private final C69464a f49584o;

    public C16972v(Executor executor, C60887da daVar, C69464a aVar, C16976z zVar, C47656q qVar, C16950ac acVar) {
        this.f49571b = executor;
        this.f49583n = new C60904dr(executor);
        this.f49572c = daVar;
        this.f49574e = zVar;
        this.f49573d = qVar;
        this.f49575f = acVar;
        this.f49584o = aVar;
    }

    /* renamed from: a */
    public final synchronized void mo23133a(C16940c cVar, MediaSessionCompat mediaSessionCompat, C16942e eVar) {
        this.f49580k = cVar;
        this.f49581l = eVar;
        if (cVar.mo23121g().isPresent()) {
            this.f49574e.f49595c = (PendingIntent) cVar.mo23121g().get();
        }
        C16950ac acVar = this.f49575f;
        C62910ar e = cVar.mo23119e();
        C16958h hVar = new C16958h(this);
        if (e.equals(C62948a.f169987b) || C62948a.m95450a(e, C16950ac.f49527a) >= 0) {
            acVar.f49530c = e;
        } else {
            acVar.f49530c = C16950ac.f49527a;
        }
        acVar.f49529b = hVar;
        mo23165h(new C16959i(this, cVar, mediaSessionCompat, eVar));
    }

    /* renamed from: b */
    public final void mo23134b(C16984h hVar) {
        ArrayList arrayList = new ArrayList();
        this.f49580k.mo23128n();
        Optional empty = Optional.empty();
        ArrayList arrayList2 = new ArrayList();
        for (C16980d dVar : hVar.f49617a) {
            C3124s sVar = new C3124s();
            C3035ar arVar = (C3035ar) this.f49584o.mo17428b();
            arVar.getClass();
            sVar.f9156d = arVar;
            C2576ac acVar = new C2576ac();
            acVar.mo6083b(dVar.f49603a);
            acVar.f7107e = dVar;
            sVar.f9155c = acVar.mo6082a();
            for (String b : dVar.f49605c) {
                C2576ac acVar2 = new C2576ac();
                acVar2.mo6083b(b);
                sVar.mo7109a(acVar2.mo6082a());
            }
            C2576ac acVar3 = new C2576ac();
            acVar3.mo6083b(dVar.f49603a);
            sVar.mo7109a(acVar3.mo6082a());
            for (String b2 : dVar.f49606d) {
                C2576ac acVar4 = new C2576ac();
                acVar4.mo6083b(b2);
                sVar.mo7109a(acVar4.mo6082a());
            }
            C2601a.m6831c(sVar.f9154b > 0, "Must add at least one source to the concatenation.");
            if (sVar.f9155c == null) {
                sVar.f9155c = C2590aq.m6794a(Uri.EMPTY);
            }
            arrayList2.add(new C3127v(sVar.f9155c, sVar.f9153a.mo55394f()));
        }
        arrayList.addAll((Collection) empty.orElse(arrayList2));
        mo23165h(new C16955e(this, arrayList, hVar));
    }

    /* renamed from: c */
    public final void mo23135c(C16984h hVar) {
        mo23165h(new C16962l(this, hVar));
    }

    /* renamed from: d */
    public final void mo23136d() {
        mo23165h(new C16964n(this));
    }

    /* renamed from: e */
    public final void mo23137e() {
        mo23165h(new C16961k(this));
    }

    /* renamed from: f */
    public final synchronized void mo23138f() {
        this.f49580k.mo23123i();
        this.f49575f.mo23142a();
        mo23165h(new C16960j(this));
    }

    /* renamed from: g */
    public final void mo23139g(C62910ar arVar) {
        mo23165h(new C16957g(this, arVar));
    }

    /* renamed from: h */
    public final void mo23165h(Runnable runnable) {
        this.f49572c.execute(C47810es.m84977q(runnable));
    }

    /* renamed from: i */
    public final void mo23166i() {
        C60870cx b = this.f49572c.mo19399b(C47810es.m84978r(new C16965o(this)));
        C16971u uVar = new C16971u(this);
        C60856cj.m92911t(b, C47810es.m84974n(uVar), this.f49583n);
    }
}

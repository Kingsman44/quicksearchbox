package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import android.content.Context;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p747c.p753d.C12151a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.speech.recognizer.p5233a.C67451at;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.k */
/* compiled from: PG */
final class C12127k implements C57974a {

    /* renamed from: a */
    public final Executor f38763a;

    /* renamed from: b */
    public final C57974a f38764b;

    /* renamed from: c */
    public final C12116a f38765c;

    /* renamed from: d */
    public final C60870cx f38766d;

    /* renamed from: e */
    public C2164c f38767e;

    /* renamed from: f */
    public boolean f38768f = false;

    /* renamed from: g */
    public boolean f38769g = false;

    public C12127k(C57974a aVar, C67451at atVar, int i, int i2, Context context, Executor executor, Executor executor2) {
        C67451at atVar2 = atVar;
        Executor executor3 = executor;
        this.f38763a = new C60904dr(executor3);
        this.f38764b = aVar;
        this.f38766d = C2169h.m6027a(new C12119c(this));
        C12126j jVar = new C12126j(this, aVar);
        ArrayList arrayList = new ArrayList(Arrays.asList(C12133q.values()));
        Collection.EL.removeIf(arrayList, new C12130n(atVar));
        Collection.EL.removeIf(arrayList, new C12132p(i2));
        Collection.EL.removeIf(arrayList, new C12131o(i));
        if (arrayList.isEmpty()) {
            aVar.mo20340gR(new C12151a("Not valid encoding found.", 2));
        }
        if (arrayList.size() > 1) {
            ((C59052c) ((C59052c) C12128l.f38770a.mo56226d()).mo56372aa(44043)).mo56360M("For configuration encoding={%s}, sampleRate={%d}, channelCount={%d} multiple valid encodings were found: {%s}", atVar.name(), Integer.valueOf(i2), Integer.valueOf(i), arrayList);
        }
        C12133q qVar = (C12133q) arrayList.get(0);
        if (atVar2 == C67451at.OGG_OPUS) {
            this.f38765c = new C12135s(qVar, jVar, context, executor2);
        } else {
            this.f38765c = new C12117aa(qVar, jVar, executor3);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C12120d dVar = new C12120d(this, (C12115d) obj);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(dVar), this.f38763a), "#onNext processing failed", new Object[0]);
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        this.f38764b.mo20338d(cVar);
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C12121e eVar = new C12121e(this, z);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(eVar), this.f38763a), "#onEnd processing failed", new Object[0]);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C12122f fVar = new C12122f(this, th);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(fVar), this.f38763a), "#onFailure processing failed", new Object[0]);
    }
}

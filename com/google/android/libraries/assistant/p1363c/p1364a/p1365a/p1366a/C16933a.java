package com.google.android.libraries.assistant.p1363c.p1364a.p1365a.p1366a;

import android.support.p031v4.media.session.C0286ac;
import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16940c;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16941d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16942e;
import com.google.android.libraries.assistant.p1363c.p1364a.p1368b.C16946a;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16978b;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16982f;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16984h;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16985i;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16986j;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16990n;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62910ar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.libraries.assistant.c.a.a.a.a */
/* compiled from: PG */
public final class C16933a implements C16941d, C16942e {

    /* renamed from: b */
    private static final C16986j f49476b;

    /* renamed from: a */
    public final C16940c f49477a;

    /* renamed from: c */
    private final C16946a f49478c;

    /* renamed from: d */
    private final List f49479d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private MediaSessionCompat f49480e;

    /* renamed from: f */
    private final C16935c f49481f;

    static {
        C16985i iVar = (C16985i) C16986j.f49619b.createBuilder();
        iVar.copyOnWrite();
        ((C16986j) iVar.instance).f49621a = 0;
        f49476b = (C16986j) iVar.build();
    }

    public C16933a(C16940c cVar, MediaSessionCompat mediaSessionCompat, C16946a aVar, C16935c cVar2) {
        this.f49480e = mediaSessionCompat;
        this.f49477a = cVar;
        this.f49478c = aVar;
        this.f49481f = cVar2;
    }

    /* renamed from: a */
    public final synchronized MediaSessionCompat.Token mo23091a() {
        MediaSessionCompat mediaSessionCompat = this.f49480e;
        if (mediaSessionCompat == null) {
            return null;
        }
        return ((C0286ac) mediaSessionCompat.f982b).f1014b;
    }

    /* renamed from: b */
    public final synchronized C16986j mo23092b(C16984h hVar) {
        C58838bb.m90869d(hVar != null, "playRequest is null");
        this.f49478c.mo23135c(hVar);
        return f49476b;
    }

    /* renamed from: c */
    public final synchronized C16986j mo23093c() {
        this.f49478c.mo23136d();
        return f49476b;
    }

    /* renamed from: d */
    public final synchronized C16986j mo23094d() {
        this.f49478c.mo23137e();
        return f49476b;
    }

    /* renamed from: e */
    public final synchronized C16986j mo23095e(C16984h hVar) {
        C58838bb.m90869d(hVar != null, "playRequest is null");
        this.f49478c.mo23134b(hVar);
        return f49476b;
    }

    /* renamed from: f */
    public final synchronized C16986j mo23096f(C62910ar arVar) {
        this.f49478c.mo23139g(arVar);
        return f49476b;
    }

    /* renamed from: g */
    public final void mo23097g(C16942e eVar) {
        this.f49479d.add(eVar);
    }

    /* renamed from: h */
    public final synchronized void mo23098h() {
        C16935c cVar = this.f49481f;
        cVar.f49483a.f49488a.remove(cVar.f49484b.mo23123i());
        this.f49480e.mo871c();
        this.f49480e = null;
        this.f49478c.mo23138f();
    }

    /* renamed from: i */
    public final void mo23099i(C16978b bVar) {
        for (C16942e i : this.f49479d) {
            i.mo23099i(bVar);
        }
    }

    /* renamed from: j */
    public final void mo23100j(C16982f fVar) {
        for (C16942e j : this.f49479d) {
            j.mo23100j(fVar);
        }
    }

    /* renamed from: k */
    public final void mo23101k(C16988l lVar) {
        for (C16942e k : this.f49479d) {
            k.mo23101k(lVar);
        }
    }

    /* renamed from: l */
    public final void mo23102l(C16990n nVar) {
        for (C16942e l : this.f49479d) {
            l.mo23102l(nVar);
        }
    }

    /* renamed from: m */
    public final synchronized void mo23103m() {
        this.f49480e.mo874f(this.f49477a.mo23117c());
        this.f49478c.mo23133a(this.f49477a, this.f49480e, this);
    }

    public final String toString() {
        String obj = this.f49477a.toString();
        String obj2 = this.f49478c.toString();
        String obj3 = this.f49481f.toString();
        String obj4 = this.f49479d.toString();
        String valueOf = String.valueOf(this.f49480e);
        return "AmpImpl{configuration=" + obj + ", mediaSession=" + obj2 + ", mediaStateCallback=" + obj3 + ", listeners=" + obj4 + ", mediaSessionCompat=" + valueOf + "}";
    }
}

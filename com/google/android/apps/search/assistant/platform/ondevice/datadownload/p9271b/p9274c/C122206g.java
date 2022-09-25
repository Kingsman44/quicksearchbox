package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9274c;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.C122175aw;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.C122177ay;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.C122179b;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.C122209ba;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.C122210bb;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122183d;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122185f;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122192m;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122196q;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17136an;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17157t;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.android.libraries.mdi.download.C29668l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import p3186j$.util.Optional;
import p5488io.grpc.C70148al;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.c.g */
/* compiled from: PG */
public final class C122206g extends C122192m {

    /* renamed from: a */
    private final C122210bb f338909a;

    /* renamed from: b */
    private final C122179b f338910b;

    /* renamed from: c */
    private final C60887da f338911c;

    /* renamed from: d */
    private final boolean f338912d;

    public C122206g(C122210bb bbVar, C122179b bVar, C60887da daVar, boolean z) {
        this.f338909a = bbVar;
        this.f338910b = bVar;
        this.f338911c = daVar;
        this.f338912d = z;
    }

    /* renamed from: b */
    public final void mo105563b(C122183d dVar, C70862aj ajVar) {
        C70148al m = C70148al.m102135m();
        Optional g = C17136an.m34272g(dVar.f338873b);
        C122179b bVar = this.f338910b;
        C28804cs f = C28805ct.m53747f();
        f.mo34449c(dVar.f338872a);
        ((C29663j) f).f80314b = C58833ax.m90833j(g.orElse(null));
        C60870cx c = bVar.mo105550c(f.mo34447a(), Locale.forLanguageTag(dVar.f338874c));
        C122200a aVar = C122200a.f338903a;
        C17157t.m34306b(m, C60922j.m93044g(c, C47810es.m84963c(aVar), this.f338911c), ajVar, this.f338911c, this.f338912d);
    }

    /* renamed from: c */
    public final void mo105564c(C122185f fVar, C70862aj ajVar) {
        C70148al m = C70148al.m102135m();
        Optional g = C17136an.m34272g(fVar.f338881e);
        Optional filter = Optional.m71637of(fVar.f338880d).filter(C122204e.f338907a);
        C122179b bVar = this.f338910b;
        C28806cu h = C28807cv.m53759h();
        C29668l lVar = (C29668l) h;
        lVar.f80326b = C58833ax.m90833j(g.orElse(null));
        h.mo34460d(fVar.f338877a);
        h.mo34459c(fVar.f338879c);
        lVar.f80325a = C58833ax.m90833j(filter.orElse(null));
        C60870cx d = bVar.mo105551d(h.mo34462f(), Locale.forLanguageTag(fVar.f338878b));
        C122205f fVar2 = C122205f.f338908a;
        C17157t.m34306b(m, C60922j.m93044g(d, C47810es.m84963c(fVar2), this.f338911c), ajVar, this.f338911c, this.f338912d);
    }

    /* renamed from: d */
    public final void mo105565d(C29690f fVar, C70862aj ajVar) {
        C70148al m = C70148al.m102135m();
        C60870cx a = this.f338909a.mo105569a(fVar);
        C122201b bVar = C122201b.f338904a;
        C17157t.m34306b(m, C60922j.m93044g(a, C47810es.m84963c(bVar), this.f338911c), ajVar, this.f338911c, this.f338912d);
    }

    /* renamed from: e */
    public final void mo105566e(C122185f fVar, C70862aj ajVar) {
        C70148al m = C70148al.m102135m();
        Optional g = C17136an.m34272g(fVar.f338881e);
        Optional filter = Optional.m71637of(fVar.f338880d).filter(C122202c.f338905a);
        C122179b bVar = this.f338910b;
        C28806cu h = C28807cv.m53759h();
        C29668l lVar = (C29668l) h;
        lVar.f80326b = C58833ax.m90833j(g.orElse(null));
        h.mo34460d(fVar.f338877a);
        h.mo34459c(fVar.f338879c);
        lVar.f80325a = C58833ax.m90833j(filter.orElse(null));
        C60870cx e = bVar.mo105552e(h.mo34462f(), Locale.forLanguageTag(fVar.f338878b));
        C122203d dVar = C122203d.f338906a;
        C17157t.m34306b(m, C60922j.m93044g(e, C47810es.m84963c(dVar), this.f338911c), ajVar, this.f338911c, this.f338912d);
    }

    /* renamed from: f */
    public final void mo105567f(C122196q qVar, C70862aj ajVar) {
        C70148al m = C70148al.m102135m();
        C122210bb bbVar = this.f338909a;
        C122175aw awVar = new C122175aw(bbVar, qVar.f338899a);
        C17157t.m34306b(m, C60856cj.m92904m(C47810es.m84978r(awVar), bbVar.f338916a), ajVar, this.f338911c, this.f338912d);
    }

    /* renamed from: g */
    public final void mo105568g(C48773e eVar, C70862aj ajVar) {
        C70148al m = C70148al.m102135m();
        C122210bb bbVar = this.f338909a;
        C28708an anVar = eVar.f126205f;
        if (anVar == null) {
            anVar = C28708an.f77994l;
        }
        C28708an d = C17136an.m34269d(anVar);
        C122177ay ayVar = new C122177ay(bbVar, C17136an.m34277l(d), eVar);
        C60870cx m2 = C60856cj.m92904m(C47810es.m84978r(ayVar), bbVar.f338916a);
        C122209ba baVar = new C122209ba(anVar, d);
        C17157t.m34306b(m, C60922j.m93044g(m2, C47810es.m84963c(baVar), bbVar.f338917b), ajVar, this.f338911c, this.f338912d);
    }
}

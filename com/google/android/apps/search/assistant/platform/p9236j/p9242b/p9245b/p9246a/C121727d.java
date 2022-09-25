package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2631g.C33882a;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p3186j$.time.Instant;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.a.d */
/* compiled from: PG */
public final class C121727d implements C33882a {

    /* renamed from: a */
    public final C60950i f337771a;

    /* renamed from: b */
    public final ReentrantLock f337772b = new ReentrantLock();

    /* renamed from: c */
    public C121725b f337773c;

    /* renamed from: d */
    private final C71422aw f337774d;

    public C121727d(C121738o oVar, C71422aw awVar, C60950i iVar) {
        C69664n.m101061g(oVar, "resource");
        C69664n.m101061g(iVar, "timeSource");
        this.f337774d = awVar;
        this.f337771a = iVar;
        this.f337773c = new C121725b(oVar.f337802a, oVar.f337803b, oVar.f337804c, oVar.f337805d, C69496am.f185918a);
        C71594u.m104517d(C71536cm.m104384b(oVar.f337807f, new C121724a(this, (C69577g) null)), awVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final String mo39109a() {
        ReentrantLock reentrantLock = this.f337772b;
        reentrantLock.lock();
        try {
            C121725b bVar = this.f337773c;
            reentrantLock.unlock();
            StringBuilder sb = new StringBuilder();
            C33514d dVar = bVar.f337764a;
            new StringBuilder("sessionId = ").append(dVar);
            sb.append("sessionId = ".concat(String.valueOf(dVar.f89676a)));
            sb.append(10);
            boolean z = bVar.f337765b;
            sb.append("needsAssistData = " + z);
            sb.append(10);
            boolean z2 = bVar.f337766c;
            sb.append("needsScreenshot = " + z2);
            sb.append(10);
            boolean z3 = bVar.f337767d;
            sb.append("needsDirectAction = " + z3);
            sb.append("\nEvents:\n");
            for (C121726c cVar : bVar.f337768e) {
                Instant instant = cVar.f337769a;
                C121728e eVar = cVar.f337770b;
                sb.append("  @" + instant + ": " + eVar);
                sb.append(10);
            }
            return sb.toString();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

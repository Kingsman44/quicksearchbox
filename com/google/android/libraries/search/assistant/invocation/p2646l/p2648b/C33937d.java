package com.google.android.libraries.search.assistant.invocation.p2646l.p2648b;

import com.google.android.libraries.search.assistant.invocation.p2631g.C33882a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.locks.ReentrantLock;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.l.b.d */
/* compiled from: PG */
public final class C33937d implements C33882a {

    /* renamed from: a */
    private static final C59071e f90512a = C59071e.m91331h();

    /* renamed from: b */
    private final C33939f f90513b;

    /* renamed from: c */
    private final ReentrantLock f90514c = new ReentrantLock();

    public C33937d(C33939f fVar) {
        C69664n.m101061g(fVar, "eventsProvider");
        this.f90513b = fVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final String mo39109a() {
        C59052c cVar = (C59052c) f90512a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.MediaCxt.Tracker");
        cVar.mo56379ah(new C59094n(51307));
        cVar.mo56386p("Start dumping the state.");
        ReentrantLock reentrantLock = this.f90514c;
        reentrantLock.lock();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Events:");
            sb.append(10);
            for (C33938e obj : this.f90513b.mo39060c()) {
                sb.append(obj.toString());
                sb.append(10);
            }
            String sb2 = sb.toString();
            reentrantLock.unlock();
            C59052c cVar2 = (C59052c) f90512a.mo56224b();
            cVar2.mo56378ag(C58975e.f156826a, "INV.MediaCxt.Tracker");
            cVar2.mo56379ah(new C59094n(51308));
            cVar2.mo56386p("Done dumping the state.");
            return sb2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

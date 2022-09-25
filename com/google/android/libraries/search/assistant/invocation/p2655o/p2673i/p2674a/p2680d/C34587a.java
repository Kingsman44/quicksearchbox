package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2680d;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.p2641k.p2644c.C33925a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34455a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34551b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34564c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34586d;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.d.a */
/* compiled from: PG */
public final class C34587a implements C33925a {

    /* renamed from: a */
    private static final ZoneId f91887a = ZoneId.systemDefault();

    /* renamed from: b */
    private final C21370a f91888b;

    /* renamed from: c */
    private final String f91889c = "Hotword Triggering";

    /* renamed from: d */
    private final C34586d f91890d;

    public C34587a(C34586d dVar, C21370a aVar) {
        C69664n.m101061g(dVar, "store");
        C69664n.m101061g(aVar, "clock");
        this.f91890d = dVar;
        this.f91888b = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo39134a(C69577g gVar) {
        String str;
        C34586d dVar = this.f91890d;
        ReentrantReadWriteLock.ReadLock readLock = dVar.f91883a.readLock();
        readLock.lock();
        try {
            C69469c cVar = new C69469c(10);
            cVar.addAll(dVar.f91884b);
            C34455a aVar = new C34455a(C69540x.m100943a(cVar), dVar.f91885c);
            readLock.unlock();
            List<C34551b> list = aVar.f91557a;
            boolean z = aVar.f91558b;
            StringBuilder sb = new StringBuilder();
            if (z) {
                str = "Showing the last " + list.size() + " entries:";
            } else if (list.isEmpty()) {
                str = "<no entries yet>";
            } else if (list.size() == 1) {
                str = "Showing the only entry:";
            } else {
                str = "Showing all " + list.size() + " entries:";
            }
            ZonedDateTime atZone = Instant.ofEpochMilli(this.f91888b.mo26870b()).atZone(f91887a);
            new StringBuilder("  Current timestamp: ").append(atZone);
            sb.append("  Current timestamp: ".concat(String.valueOf(atZone)));
            sb.append(10);
            sb.append("  ".concat(str));
            sb.append(10);
            for (C34551b bVar : list) {
                ZonedDateTime atZone2 = bVar.f91803a.atZone(f91887a);
                new StringBuilder("    @ ").append(atZone2);
                sb.append("    @ ".concat(String.valueOf(atZone2)));
                sb.append(10);
                C34564c cVar2 = bVar.f91804b;
                new StringBuilder("      ").append(cVar2);
                sb.append("      ".concat(cVar2.toString()));
                sb.append(10);
            }
            return sb.toString();
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final String mo39135b() {
        return this.f91889c;
    }
}

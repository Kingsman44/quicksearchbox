package com.google.assistant.p3838ao.p3839a.p3848h;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3838ao.p3839a.p3841b.C49432a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.h.d */
/* compiled from: PG */
public final class C49649d {

    /* renamed from: a */
    private static final C58974d f128144a = C58974d.m91136j();

    /* renamed from: b */
    private final C60950i f128145b;

    /* renamed from: c */
    private final C49655j f128146c = new C49655j();

    /* renamed from: d */
    private final Map f128147d = new HashMap();

    /* renamed from: e */
    private volatile String f128148e = BuildConfig.FLAVOR;

    public C49649d(C60950i iVar) {
        this.f128145b = iVar;
    }

    /* renamed from: c */
    private final synchronized void m85623c(String str) {
        C49647b bVar = (C49647b) this.f128147d.get(str);
        if (bVar == null) {
            bVar = new C49647b(this.f128145b);
            this.f128147d.put(str, bVar);
        }
        Instant a = bVar.f128141b.mo57444a();
        if (bVar.f128142c.isEmpty() || !a.minus(C49647b.f128140a).isBefore(((C49646a) bVar.f128142c.getLast()).f128138a)) {
            Deque deque = bVar.f128142c;
            C49646a aVar = new C49646a(a);
            aVar.mo53294a(a);
            deque.addLast(aVar);
        } else {
            ((C49646a) bVar.f128142c.getLast()).mo53294a(a);
        }
        if (bVar.f128142c.size() > 40) {
            bVar.f128142c.removeFirst();
        }
    }

    /* renamed from: a */
    public final Optional mo53295a() {
        return this.f128148e.isEmpty() ? Optional.empty() : Optional.m71637of(this.f128148e);
    }

    /* renamed from: b */
    public final synchronized void mo53296b(C49432a aVar) {
        String str = aVar.f127689a;
        if (str.isEmpty()) {
            ((C58970a) ((C58970a) f128144a.mo56226d()).mo56372aa(54848)).mo56386p("Ignoring AppForegroundChangeEvent with an empty package.");
            return;
        }
        if (!this.f128148e.equals(str)) {
            m85623c(str);
            if (!this.f128148e.isEmpty()) {
                this.f128146c.mo53318b(this.f128148e);
            }
        }
        this.f128148e = str;
    }
}

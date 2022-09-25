package com.google.android.libraries.lens.view.p2067ak;

import com.google.android.libraries.lens.view.p2096f.C25806i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60860cn;
import com.google.common.util.concurrent.C60861co;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.lens.view.ak.bt */
/* compiled from: PG */
public final class C25241bt {

    /* renamed from: a */
    public static final C58974d f68692a = C58974d.m91135i("PDSWrapper");

    /* renamed from: b */
    public final C60870cx f68693b;

    /* renamed from: c */
    public final List f68694c = new ArrayList();

    /* renamed from: d */
    public MessageLite f68695d;

    /* renamed from: e */
    public int f68696e = 0;

    /* renamed from: f */
    private final C42876ab f68697f;

    /* renamed from: g */
    private final MessageLite f68698g;

    /* renamed from: h */
    private final Executor f68699h;

    public C25241bt(C42876ab abVar, MessageLite messageLite, Executor executor, Executor executor2) {
        this.f68697f = abVar;
        this.f68698g = messageLite;
        this.f68699h = C25806i.m47612a(executor2);
        C60870cx g = C60922j.m93044g(abVar.mo46042d(), C47810es.m84963c(new C25237bp(this)), executor2);
        this.f68693b = g;
        C60856cj.m92911t(g, C47810es.m84974n(new C25238bq()), executor);
    }

    /* renamed from: a */
    public static MessageLite m46627a(MessageLite messageLite, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            messageLite = ((C25240bs) it.next()).mo30341a(messageLite);
        }
        return messageLite;
    }

    /* renamed from: d */
    private final synchronized MessageLite m46628d() {
        return m46627a(this.f68698g, this.f68694c);
    }

    /* renamed from: b */
    public final MessageLite mo30362b(boolean z) {
        MessageLite messageLite;
        synchronized (this) {
            MessageLite messageLite2 = this.f68695d;
            if (messageLite2 != null) {
                return messageLite2;
            }
            if (z) {
                ((C58970a) ((C58970a) f68692a.mo56226d()).mo56372aa(49832)).mo56386p("Attempt to read proto before initialized; returning default");
                MessageLite d = m46628d();
                return d;
            } else if (!C19559g.m37305d(Thread.currentThread())) {
                C58970a aVar = (C58970a) f68692a.mo56225c();
                aVar.mo56380ai(C58979ad.FULL);
                ((C58970a) aVar.mo56372aa(49831)).mo56386p("Attempt to read non-default proto from background before initialized, returning default");
                MessageLite d2 = m46628d();
                return d2;
            } else {
                try {
                    ((C58970a) ((C58970a) f68692a.mo56224b()).mo56372aa(49830)).mo56386p("Attempting to read proto before initialized, please don't deadlock!");
                    C58838bb.m90884s(!Thread.holdsLock(this), "attempting to block on future while lock is held");
                    int i = C60861co.f164952a;
                    C60861co.m92916b(C60860cn.f164951a, this.f68693b, IOException.class);
                    synchronized (this) {
                        messageLite = this.f68695d;
                        C58838bb.m90866a(messageLite, "memoryProto still unset after load complete");
                    }
                    return messageLite;
                } catch (IOException e) {
                    throw new IllegalStateException("Error reading proto", e);
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo30363c(C25240bs bsVar) {
        MessageLite messageLite = this.f68695d;
        if (messageLite == null) {
            C58970a aVar = (C58970a) f68692a.mo56226d();
            aVar.mo56380ai(C58979ad.FULL);
            ((C58970a) aVar.mo56372aa(49833)).mo56386p("Updating proto before initialized");
            this.f68694c.add(bsVar);
            return;
        }
        this.f68695d = bsVar.mo30341a(messageLite);
        this.f68696e++;
        AtomicReference atomicReference = new AtomicReference();
        C60856cj.m92911t(this.f68697f.mo46039a(new C25236bo(bsVar, atomicReference), C60826bg.f164896a), C47810es.m84974n(new C25239br(this, atomicReference)), this.f68699h);
    }
}

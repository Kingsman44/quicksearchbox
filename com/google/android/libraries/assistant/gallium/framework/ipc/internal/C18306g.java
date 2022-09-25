package com.google.android.libraries.assistant.gallium.framework.ipc.internal;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5127o.C65647ab;
import com.google.protos.p5127o.C65648ac;
import com.google.protos.p5127o.C65652ag;
import com.google.protos.p5127o.C65653ah;
import com.google.protos.p5127o.C65696v;
import com.google.protos.p5127o.C65697w;
import com.google.protos.p5127o.C65699y;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.internal.g */
/* compiled from: PG */
public final class C18306g {

    /* renamed from: a */
    public static final C59071e f51940a = C59071e.m91332i("com.google.android.libraries.assistant.gallium.framework.ipc.internal.g");

    /* renamed from: b */
    public final AtomicLong f51941b = new AtomicLong();

    /* renamed from: c */
    public final Map f51942c = new ConcurrentHashMap();

    /* renamed from: d */
    public final C18300a f51943d;

    /* renamed from: e */
    public final Executor f51944e;

    /* renamed from: f */
    public C18305f f51945f;

    /* renamed from: g */
    public final JavaToCppLinkImpl f51946g;

    public C18306g(JavaToCppLinkImpl javaToCppLinkImpl, C18300a aVar, Executor executor) {
        this.f51946g = javaToCppLinkImpl;
        this.f51943d = aVar;
        this.f51944e = executor;
        aVar.mo23764b(new C18303d(this));
    }

    /* renamed from: a */
    public final void mo23770a(C65699y yVar, long j) {
        C65647ab abVar = (C65647ab) C65648ac.f178380e.createBuilder();
        abVar.copyOnWrite();
        C65648ac acVar = (C65648ac) abVar.instance;
        acVar.f178382a |= 8;
        acVar.f178385d = j;
        C65652ag agVar = (C65652ag) C65653ah.f178394c.createBuilder();
        C65696v vVar = (C65696v) C65697w.f178495c.createBuilder();
        vVar.copyOnWrite();
        C65697w wVar = (C65697w) vVar.instance;
        yVar.getClass();
        wVar.f178498b = yVar;
        wVar.f178497a = 2;
        agVar.copyOnWrite();
        C65653ah ahVar = (C65653ah) agVar.instance;
        C65697w wVar2 = (C65697w) vVar.build();
        wVar2.getClass();
        ahVar.f178397b = wVar2;
        ahVar.f178396a |= 1;
        abVar.copyOnWrite();
        C65648ac acVar2 = (C65648ac) abVar.instance;
        C65653ah ahVar2 = (C65653ah) agVar.build();
        ahVar2.getClass();
        acVar2.f178384c = ahVar2;
        acVar2.f178383b = 2;
        try {
            this.f51946g.mo23766a((C65648ac) abVar.build());
        } catch (C18218av e) {
            ((C59052c) ((C59052c) f51940a.mo56226d()).mo56372aa(47084)).mo56389s("Failed to send status to C++: %s", e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo23771b(C18305f fVar) {
        if (this.f51945f == null) {
            this.f51945f = fVar;
            return;
        }
        throw new IllegalStateException("Request handler already set.");
    }
}

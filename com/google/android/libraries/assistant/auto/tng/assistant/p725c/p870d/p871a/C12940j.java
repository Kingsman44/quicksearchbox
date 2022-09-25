package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.android.apps.gsa.staticplugins.p8793w.p8802c.C117847x;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.j */
/* compiled from: PG */
final class C12940j {

    /* renamed from: a */
    public final C12093d f40272a;

    /* renamed from: b */
    public final Optional f40273b;

    /* renamed from: c */
    public final C12154a f40274c;

    /* renamed from: d */
    public final C16850a f40275d;

    /* renamed from: e */
    public final ScheduledExecutorService f40276e;

    /* renamed from: f */
    public final C15481g f40277f;

    /* renamed from: g */
    public final C69464a f40278g;

    /* renamed from: h */
    public final C69464a f40279h;

    /* renamed from: i */
    public final C117847x f40280i;

    public C12940j(C12093d dVar, Optional optional, C12154a aVar, C16850a aVar2, C117847x xVar, ScheduledExecutorService scheduledExecutorService, C15481g gVar, C69464a aVar3, C69464a aVar4) {
        this.f40272a = dVar;
        this.f40273b = optional;
        this.f40274c = aVar;
        this.f40275d = aVar2;
        this.f40280i = xVar;
        this.f40276e = scheduledExecutorService;
        this.f40277f = gVar;
        this.f40278g = aVar3;
        this.f40279h = aVar4;
    }

    /* renamed from: a */
    public static boolean m29184a(C12986d dVar) {
        C12991i iVar = dVar.f40370d;
        if (iVar == null) {
            iVar = C12991i.f40380k;
        }
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        return a.equals(C12989g.AUTO_EMBEDDED);
    }
}

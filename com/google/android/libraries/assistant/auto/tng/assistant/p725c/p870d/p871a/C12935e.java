package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.common.p903e.C13235a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.e */
/* compiled from: PG */
final class C12935e {

    /* renamed from: a */
    public static final C59071e f40255a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.e");

    /* renamed from: b */
    public final C12093d f40256b;

    /* renamed from: c */
    public final Optional f40257c;

    /* renamed from: d */
    public final Optional f40258d;

    /* renamed from: e */
    public final Optional f40259e;

    /* renamed from: f */
    public final Optional f40260f;

    /* renamed from: g */
    public final C15481g f40261g;

    /* renamed from: h */
    public final ScheduledExecutorService f40262h;

    public C12935e(C12093d dVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, C15481g gVar, ScheduledExecutorService scheduledExecutorService) {
        this.f40256b = dVar;
        this.f40257c = optional;
        this.f40258d = optional2;
        this.f40259e = optional3;
        this.f40260f = optional4;
        this.f40261g = gVar;
        this.f40262h = scheduledExecutorService;
    }

    /* renamed from: b */
    public static boolean m29179b(C12986d dVar) {
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

    /* renamed from: a */
    public final Optional mo20853a() {
        if (this.f40257c.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(((C13235a) this.f40257c.get()).mo20985b());
    }

    /* renamed from: c */
    public final boolean mo20854c() {
        return this.f40257c.isPresent() && ((C13235a) this.f40257c.get()).mo20988e();
    }
}

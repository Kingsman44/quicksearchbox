package com.google.android.libraries.search.p2904c.p2928g;

import com.google.android.libraries.search.p2904c.p2916e.C37559f;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.search.c.g.d */
/* compiled from: PG */
public final class C37619d {

    /* renamed from: a */
    public static final C59071e f99962a = C59071e.m91332i("com.google.android.libraries.search.c.g.d");

    /* renamed from: b */
    public final int f99963b;

    /* renamed from: c */
    public final C58833ax f99964c;

    /* renamed from: d */
    public final C58833ax f99965d;

    /* renamed from: e */
    public final C38281b f99966e;

    /* renamed from: f */
    public final AtomicBoolean f99967f = new AtomicBoolean(false);

    /* renamed from: g */
    public final C58833ax f99968g;

    /* renamed from: h */
    public final C58833ax f99969h;

    /* renamed from: i */
    private final Executor f99970i;

    /* renamed from: j */
    private final AtomicBoolean f99971j = new AtomicBoolean(false);

    public C37619d(int i, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C38281b bVar, Executor executor) {
        C58838bb.m90884s(axVar.mo56113h() ^ axVar2.mo56113h(), "Only one WriteableAudioBuffer implementation can be present.");
        this.f99969h = axVar;
        this.f99968g = axVar2;
        this.f99966e = bVar;
        this.f99963b = i;
        this.f99964c = axVar3;
        this.f99965d = axVar4;
        this.f99970i = executor;
    }

    /* renamed from: a */
    public final C58833ax mo41032a() {
        return this.f99968g.mo56106b(C37617b.f99959a);
    }

    /* renamed from: b */
    public final void mo41033b(C37559f fVar) {
        if (this.f99971j.compareAndSet(false, true)) {
            C58976aa aaVar = C58975e.f156826a;
            C37618c cVar = new C37618c(this, fVar);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(cVar), this.f99970i), "Audio buffering failed", new Object[0]);
        }
    }
}

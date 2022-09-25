package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p837d.C12758a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.k */
/* compiled from: PG */
final class C12844k {

    /* renamed from: a */
    public static final C59071e f40077a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.k");

    /* renamed from: b */
    public final C12758a f40078b;

    /* renamed from: c */
    public final Executor f40079c;

    /* renamed from: d */
    public final Executor f40080d;

    /* renamed from: e */
    public final CopyOnWriteArrayList f40081e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public final C21370a f40082f;

    /* renamed from: g */
    public boolean f40083g = false;

    /* renamed from: h */
    public Optional f40084h = Optional.empty();

    public C12844k(C12758a aVar, Executor executor, C21370a aVar2) {
        this.f40078b = aVar;
        this.f40079c = executor;
        this.f40082f = aVar2;
        this.f40080d = new C60904dr(executor);
    }
}

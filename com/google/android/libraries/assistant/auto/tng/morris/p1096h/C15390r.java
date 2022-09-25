package com.google.android.libraries.assistant.auto.tng.morris.p1096h;

import com.google.android.libraries.p1730f.C21370a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.h.r */
/* compiled from: PG */
public final class C15390r {

    /* renamed from: a */
    public static final List f46171a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public static final List f46172b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    public static final List f46173c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d */
    public final C21370a f46174d;

    /* renamed from: e */
    public volatile long f46175e;

    /* renamed from: f */
    public volatile long f46176f;

    /* renamed from: g */
    public volatile long f46177g;

    /* renamed from: h */
    private volatile long f46178h;

    public C15390r(C21370a aVar) {
        this.f46174d = aVar;
    }

    /* renamed from: a */
    public final void mo22279a() {
        f46173c.add(Long.valueOf(this.f46174d.mo26870b() - this.f46177g));
    }

    /* renamed from: b */
    public final void mo22280b() {
        this.f46178h = this.f46174d.mo26870b();
        f46172b.add(Long.valueOf(this.f46178h - this.f46176f));
    }

    /* renamed from: c */
    public final void mo22281c() {
        this.f46175e = this.f46174d.mo26870b();
    }
}

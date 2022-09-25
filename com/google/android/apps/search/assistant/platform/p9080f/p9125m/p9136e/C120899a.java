package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9136e;

import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.e.a */
/* compiled from: PG */
public final class C120899a implements C120816a {

    /* renamed from: a */
    final /* synthetic */ C120816a f336126a;

    /* renamed from: b */
    final /* synthetic */ C120900b f336127b;

    public C120899a(C120900b bVar, C120816a aVar) {
        this.f336127b = bVar;
        this.f336126a = aVar;
    }

    /* renamed from: a */
    public final void mo104868a(C67087ko koVar) {
        int a = C120900b.m200078a(koVar);
        if (a == 2) {
            if (!this.f336127b.f336128a.getAndSet(true)) {
                a = 2;
            } else {
                return;
            }
        }
        if (a == 3) {
            if (!this.f336127b.f336129b.getAndSet(true)) {
                a = 3;
            } else {
                return;
            }
        }
        if (a == 5) {
            if (!this.f336127b.f336130c.getAndSet(true)) {
                a = 5;
            } else {
                return;
            }
        }
        if ((a != 8 && a != 9) || !this.f336127b.f336131d.getAndSet(true)) {
            this.f336126a.mo104868a(koVar);
        }
    }
}

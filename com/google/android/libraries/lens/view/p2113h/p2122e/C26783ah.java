package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.google.android.libraries.lens.view.p2113h.p2114a.C26661v;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.h.e.ah */
/* compiled from: PG */
public final class C26783ah {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f72970a;

    public C26783ah(C26784ai aiVar) {
        this.f72970a = aiVar;
    }

    /* renamed from: b */
    public final void mo32147b() {
        this.f72970a.mo32156z(true);
    }

    /* renamed from: a */
    public final void mo32146a(C58833ax axVar) {
        long j;
        C26784ai aiVar = this.f72970a;
        if (aiVar.f72996X == 0) {
            if (aiVar.f72997Y) {
                j = (long) C26784ai.f72972b;
            } else {
                j = aiVar.f72990R.mo26873e() - this.f72970a.f72991S;
            }
            aiVar.f72996X = j;
        }
        if (axVar.mo56113h()) {
            this.f72970a.f73030v.mo31932b(((Float) axVar.mo56107c()).floatValue());
        }
        this.f72970a.f73025q.mo31953b();
        C26661v vVar = this.f72970a.f73033y;
        long c = vVar.f72695b.mo26871c();
        synchronized (vVar.f72694a) {
            if (vVar.f72696c.size() <= vVar.f72698e) {
                long j2 = vVar.f72697d;
                if (c > j2) {
                    vVar.f72696c.add(Integer.valueOf((int) Math.min(c - j2, 2147483647L)));
                }
            }
            vVar.f72697d = c;
        }
    }
}

package com.google.android.apps.gsa.sidekick.main.trigger;

import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C8173yf;
import com.google.p375ai.p378b.C8174yg;
import com.google.protobuf.C62963cj;
import java.util.EnumSet;

/* renamed from: com.google.android.apps.gsa.sidekick.main.trigger.b */
/* compiled from: PG */
public final class C91625b implements Comparable {

    /* renamed from: a */
    public final String f255556a;

    /* renamed from: b */
    public final C7805kp f255557b;

    /* renamed from: c */
    public final int f255558c = 1;

    /* renamed from: d */
    public final boolean f255559d;

    /* renamed from: e */
    public final float f255560e;

    public C91625b(C8174yg ygVar, C7805kp kpVar, float f) {
        boolean contains = EnumSet.copyOf(new C62963cj(ygVar.f28722b, C8174yg.f28718c)).contains(C8173yf.NEARING_LOCATION);
        this.f255556a = TriggerConditionEvaluator.m149891a(kpVar);
        this.f255557b = kpVar;
        this.f255559d = contains;
        this.f255560e = f;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.f255560e, ((C91625b) obj).f255560e);
    }
}

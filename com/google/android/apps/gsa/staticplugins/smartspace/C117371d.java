package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.gsa.smartspace.C92116l;
import com.google.android.apps.gsa.smartspace.C92129x;
import com.google.android.apps.gsa.smartspace.C92130y;
import com.google.assistant.p3886c.C50794cr;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.d */
/* compiled from: PG */
public final /* synthetic */ class C117371d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C50794cr f325833a;

    /* renamed from: b */
    public final /* synthetic */ int f325834b;

    public /* synthetic */ C117371d(C50794cr crVar, int i) {
        this.f325833a = crVar;
        this.f325834b = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C50794cr crVar = this.f325833a;
        int i = this.f325834b;
        C92130y yVar = (C92130y) obj;
        int a = C92116l.m151154a(yVar.f256861a);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != crVar.f132222T) {
            return false;
        }
        int a2 = C92129x.m151227a(yVar.f256862b);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 == i;
    }
}

package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl;

import android.support.p033v7.p040e.C0422d;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.e */
/* compiled from: PG */
public final class C128969e extends C0422d {

    /* renamed from: a */
    final /* synthetic */ C128970f f354370a;

    /* renamed from: b */
    final /* synthetic */ C58485gu f354371b;

    public C128969e(C128970f fVar, C58485gu guVar) {
        this.f354370a = fVar;
        this.f354371b = guVar;
    }

    /* renamed from: a */
    public final int mo1379a() {
        return this.f354371b.size();
    }

    /* renamed from: b */
    public final int mo1380b() {
        return this.f354370a.f354377f.size();
    }

    /* renamed from: d */
    public final boolean mo1382d(int i, int i2) {
        return C69664n.m101066l(this.f354370a.f354377f.get(i), this.f354371b.get(i2));
    }

    /* renamed from: e */
    public final boolean mo1383e(int i, int i2) {
        Object obj = this.f354370a.f354377f.get(i);
        C69664n.m101060f(obj, "field[oldPos]");
        C51992gr grVar = (C51992gr) obj;
        Object obj2 = this.f354371b.get(i2);
        C69664n.m101060f(obj2, "value[newPos]");
        C51992gr grVar2 = (C51992gr) obj2;
        if ((grVar.f136447a & 1) == 0 || (grVar2.f136447a & 1) == 0) {
            return C69664n.m101066l(grVar.f136451e, grVar2.f136451e);
        }
        return C69664n.m101066l(grVar.f136448b, grVar2.f136448b);
    }
}

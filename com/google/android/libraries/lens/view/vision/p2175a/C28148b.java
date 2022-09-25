package com.google.android.libraries.lens.view.vision.p2175a;

import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.vision.C28177s;
import com.google.android.libraries.lens.view.vision.C28179u;
import com.google.lens.p4707j.C62416at;
import com.google.lens.p4707j.C62417au;
import com.google.lens.p4707j.C62424ba;
import com.google.lens.p4707j.C62425bb;
import com.google.lens.p4707j.C62555fx;
import com.google.lens.p4707j.C62561gc;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58121a;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58122b;

/* renamed from: com.google.android.libraries.lens.view.vision.a.b */
/* compiled from: PG */
public final class C28148b {
    /* renamed from: a */
    public static C62424ba m52458a() {
        C62424ba baVar = (C62424ba) C62425bb.f168506e.createBuilder();
        baVar.copyOnWrite();
        C62425bb bbVar = (C62425bb) baVar.instance;
        bbVar.f168511d = 0;
        bbVar.f168508a |= 1;
        return baVar;
    }

    /* renamed from: b */
    public static C62561gc m52459b(C28179u uVar, int i, int i2) {
        int i3;
        if (uVar.mo33683y()) {
            i3 = 2;
        } else {
            i3 = uVar.mo33667j() == C25349y.PLANAR_GLEAM ? uVar.mo33680v() ? 4 : 3 : 1;
        }
        C62555fx fxVar = (C62555fx) C62561gc.f168901g.createBuilder();
        fxVar.copyOnWrite();
        C62561gc gcVar = (C62561gc) fxVar.instance;
        gcVar.f168904b = i3 - 1;
        gcVar.f168903a = 1 | gcVar.f168903a;
        C58121a b = C28177s.m52623b(uVar, i, i2);
        fxVar.copyOnWrite();
        C62561gc gcVar2 = (C62561gc) fxVar.instance;
        C58122b bVar = (C58122b) b.build();
        bVar.getClass();
        gcVar2.f168905c = bVar;
        gcVar2.f168903a |= 2;
        if (i3 == 4 && uVar.mo33676s().mo56113h()) {
            float floatValue = ((Float) uVar.mo33676s().mo56107c()).floatValue();
            fxVar.copyOnWrite();
            C62561gc gcVar3 = (C62561gc) fxVar.instance;
            gcVar3.f168903a |= 16;
            gcVar3.f168908f = floatValue;
        }
        return (C62561gc) fxVar.build();
    }

    /* renamed from: c */
    public static C62417au m52460c(int i) {
        C62416at atVar = (C62416at) C62417au.f168485e.createBuilder();
        atVar.copyOnWrite();
        C62417au auVar = (C62417au) atVar.instance;
        auVar.f168490d = 0;
        auVar.f168487a |= 1;
        atVar.copyOnWrite();
        C62417au auVar2 = (C62417au) atVar.instance;
        auVar2.f168489c = Integer.valueOf(i - 1);
        auVar2.f168488b = 3;
        return (C62417au) atVar.build();
    }
}

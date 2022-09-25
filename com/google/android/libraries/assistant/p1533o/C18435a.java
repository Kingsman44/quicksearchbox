package com.google.android.libraries.assistant.p1533o;

import com.google.android.libraries.assistant.p1533o.p1534a.C18436a;
import com.google.android.libraries.assistant.p1533o.p1534a.C18437b;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62939bs;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.assistant.o.a */
/* compiled from: PG */
public abstract class C18435a {
    /* renamed from: a */
    public static C18435a m35909a(int i, int i2, String str) {
        C18436a aVar = (C18436a) C18437b.f52327e.createBuilder();
        aVar.copyOnWrite();
        C18437b bVar = (C18437b) aVar.instance;
        bVar.f52329a |= 1;
        bVar.f52330b = i;
        aVar.copyOnWrite();
        C18437b bVar2 = (C18437b) aVar.instance;
        bVar2.f52329a |= 2;
        bVar2.f52331c = i2;
        aVar.copyOnWrite();
        C18437b bVar3 = (C18437b) aVar.instance;
        str.getClass();
        bVar3.f52329a |= 4;
        bVar3.f52332d = str;
        return new C18488f((C18437b) aVar.build());
    }

    /* renamed from: c */
    public static boolean m35910c(C62917ay ayVar) {
        C62939bs bsVar = ((C62940bt) ayVar).f169971d;
        return !bsVar.f169966d && bsVar.f169965c == C63066gd.ENUM;
    }

    /* renamed from: b */
    public abstract C18437b mo23985b();
}

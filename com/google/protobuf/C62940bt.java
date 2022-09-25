package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.protobuf.bt */
/* compiled from: PG */
public final class C62940bt extends C62917ay {

    /* renamed from: a */
    final MessageLite f169968a;

    /* renamed from: b */
    public final Object f169969b;

    /* renamed from: c */
    final MessageLite f169970c;

    /* renamed from: d */
    public final C62939bs f169971d;

    public C62940bt(MessageLite messageLite, Object obj, MessageLite messageLite2, C62939bs bsVar) {
        if (messageLite == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        } else if (bsVar.f169965c == C63066gd.MESSAGE && messageLite2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else {
            this.f169968a = messageLite;
            this.f169969b = obj;
            this.f169970c = messageLite2;
            this.f169971d = bsVar;
        }
    }

    /* renamed from: a */
    public final int mo58810a() {
        return this.f169971d.f169964b;
    }

    /* renamed from: b */
    public final MessageLite mo58811b() {
        return this.f169970c;
    }

    /* renamed from: c */
    public final Object mo58889c(Object obj) {
        C62939bs bsVar = this.f169971d;
        if (!bsVar.f169966d) {
            return mo58890d(obj);
        }
        if (bsVar.f169965c.f170203s != C63067ge.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object d : (List) obj) {
            arrayList.add(mo58890d(d));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final Object mo58890d(Object obj) {
        return this.f169971d.f169965c.f170203s == C63067ge.ENUM ? this.f169971d.f169963a.mo23993a(((Integer) obj).intValue()) : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Object mo58891e(Object obj) {
        return this.f169971d.f169965c.f170203s == C63067ge.ENUM ? Integer.valueOf(((C62957cd) obj).getNumber()) : obj;
    }
}

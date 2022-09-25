package com.bumptech.glide.load.p293a.p294a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.a.a.h */
/* compiled from: PG */
final class C5646h {

    /* renamed from: a */
    private final C5645g f17016a = new C5645g((Object) null);

    /* renamed from: b */
    private final Map f17017b = new HashMap();

    /* renamed from: d */
    private static void m14658d(C5645g gVar) {
        C5645g gVar2 = gVar.f17015d;
        gVar2.f17014c = gVar.f17014c;
        gVar.f17014c.f17015d = gVar2;
    }

    /* renamed from: e */
    private static void m14659e(C5645g gVar) {
        gVar.f17014c.f17015d = gVar;
        gVar.f17015d.f17014c = gVar;
    }

    /* renamed from: a */
    public final Object mo12120a(C5653o oVar) {
        C5645g gVar = (C5645g) this.f17017b.get(oVar);
        if (gVar == null) {
            gVar = new C5645g(oVar);
            this.f17017b.put(oVar, gVar);
        } else {
            oVar.mo12124a();
        }
        m14658d(gVar);
        C5645g gVar2 = this.f17016a;
        gVar.f17015d = gVar2;
        gVar.f17014c = gVar2.f17014c;
        m14659e(gVar);
        return gVar.mo12119b();
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.bumptech.glide.load.a.a.o, java.lang.Object] */
    /* renamed from: b */
    public final Object mo12121b() {
        for (C5645g gVar = this.f17016a.f17015d; !gVar.equals(this.f17016a); gVar = gVar.f17015d) {
            Object b = gVar.mo12119b();
            if (b != null) {
                return b;
            }
            m14658d(gVar);
            this.f17017b.remove(gVar.f17012a);
            gVar.f17012a.mo12124a();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo12122c(C5653o oVar, Object obj) {
        C5645g gVar = (C5645g) this.f17017b.get(oVar);
        if (gVar == null) {
            gVar = new C5645g(oVar);
            m14658d(gVar);
            C5645g gVar2 = this.f17016a;
            gVar.f17015d = gVar2.f17015d;
            gVar.f17014c = gVar2;
            m14659e(gVar);
            this.f17017b.put(oVar, gVar);
        } else {
            oVar.mo12124a();
        }
        if (gVar.f17013b == null) {
            gVar.f17013b = new ArrayList();
        }
        gVar.f17013b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C5645g gVar = this.f17016a.f17014c;
        boolean z = false;
        while (!gVar.equals(this.f17016a)) {
            sb.append('{');
            sb.append(gVar.f17012a);
            sb.append(':');
            sb.append(gVar.mo12118a());
            sb.append("}, ");
            gVar = gVar.f17014c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}

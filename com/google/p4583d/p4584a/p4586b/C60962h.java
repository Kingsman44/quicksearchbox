package com.google.p4583d.p4584a.p4586b;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60987n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.d.a.b.h */
/* compiled from: PG */
final class C60962h extends C60980g {

    /* renamed from: a */
    final boolean f165077a;

    /* renamed from: b */
    final boolean f165078b;

    /* renamed from: c */
    final /* synthetic */ C60963i f165079c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60962h(C60963i iVar, boolean z, boolean z2) {
        super("log");
        this.f165079c = iVar;
        this.f165077a = z;
        this.f165078b = z2;
    }

    /* renamed from: a */
    public final C60987n mo57451a(C61012g gVar, List list) {
        C61013h.m93266h("log", 1, list);
        if (list.size() == 1) {
            this.f165079c.f165080a.mo120937a(3, gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57475i(), Collections.emptyList(), this.f165077a, this.f165078b);
            return f165114f;
        }
        int b = C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue());
        int i = b != 2 ? b != 3 ? b != 5 ? b != 6 ? 3 : 2 : 5 : 1 : 4;
        String i2 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57475i();
        if (list.size() == 2) {
            this.f165079c.f165080a.mo120937a(i, i2, Collections.emptyList(), this.f165077a, this.f165078b);
            return f165114f;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
            arrayList.add(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(i3)).mo57475i());
        }
        this.f165079c.f165080a.mo120937a(i, i2, arrayList, this.f165077a, this.f165078b);
        return f165114f;
    }
}

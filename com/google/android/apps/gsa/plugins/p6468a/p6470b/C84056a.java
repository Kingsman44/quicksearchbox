package com.google.android.apps.gsa.plugins.p6468a.p6470b;

import android.util.Base64;
import com.google.p4154bc.p4155a.p4156a.C55424a;
import com.google.p4154bc.p4155a.p4156a.C55425b;
import com.google.p4154bc.p4155a.p4156a.C55427d;
import com.google.p4154bc.p4155a.p4156a.C55428e;
import com.google.p4500cm.p4515c.p4516a.p4517a.C58175a;
import com.google.p4500cm.p4515c.p4516a.p4517a.C58176b;

/* renamed from: com.google.android.apps.gsa.plugins.a.b.a */
/* compiled from: PG */
public final class C84056a {
    /* renamed from: a */
    public static String m133952a(String str) {
        C55424a aVar = (C55424a) C55428e.f146245c.createBuilder();
        C55425b bVar = (C55425b) C55427d.f146241c.createBuilder();
        bVar.copyOnWrite();
        C55427d dVar = (C55427d) bVar.instance;
        dVar.f146244b = 4;
        dVar.f146243a |= 1;
        C55427d dVar2 = (C55427d) bVar.build();
        aVar.copyOnWrite();
        C55428e eVar = (C55428e) aVar.instance;
        dVar2.getClass();
        eVar.f146248b = dVar2;
        eVar.f146247a |= 1;
        C55428e eVar2 = (C55428e) aVar.build();
        C58175a aVar2 = (C58175a) C58176b.f155530c.createBuilder();
        aVar2.copyOnWrite();
        C58176b bVar2 = (C58176b) aVar2.instance;
        eVar2.getClass();
        bVar2.f155533b = eVar2;
        bVar2.f155532a |= 1;
        return String.format("%s&gmm=%s", new Object[]{str, Base64.encodeToString(((C58176b) aVar2.build()).toByteArray(), 11)});
    }
}

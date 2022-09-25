package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C17030b;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17035ab;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17043aj;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.assistant.c.b.f.n */
/* compiled from: PG */
final class C17151n implements C17145h {

    /* renamed from: a */
    public final C58881cr f49850a;

    /* renamed from: b */
    public final C17144g f49851b;

    /* renamed from: c */
    public final C17144g f49852c;

    /* renamed from: d */
    private final C60950i f49853d;

    /* renamed from: e */
    private final C58881cr f49854e;

    /* renamed from: f */
    private final HashMap f49855f = new HashMap();

    public C17151n(C58881cr crVar, C60950i iVar, C58881cr crVar2, C17144g gVar, C17144g gVar2) {
        this.f49850a = C58886cw.m90973a(crVar);
        this.f49853d = iVar;
        this.f49854e = crVar2;
        this.f49851b = gVar;
        this.f49852c = gVar2;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo23209a(C17030b bVar, String str) {
        String c = bVar.mo23171c();
        C17122a aVar = new C17122a(c, str);
        C17150m mVar = (C17150m) this.f49855f.get(aVar);
        Instant a = this.f49853d.mo57444a();
        if (mVar == null || Duration.between(mVar.mo23202b(), a).compareTo((Duration) this.f49854e.mo6453a()) >= 0) {
            C17043aj ajVar = (C17043aj) C17044ak.f49650c.createBuilder();
            C17035ab a2 = bVar.mo23169a();
            a2.copyOnWrite();
            C17036ac acVar = (C17036ac) a2.instance;
            C17036ac acVar2 = C17036ac.f49640d;
            acVar.f49642a |= 2;
            acVar.f49644c = str;
            ajVar.copyOnWrite();
            C17044ak akVar = (C17044ak) ajVar.instance;
            C17036ac acVar3 = (C17036ac) a2.build();
            acVar3.getClass();
            akVar.f49653b = acVar3;
            akVar.f49652a |= 1;
            C17139b bVar2 = new C17139b(new C46423aj(new C17147j(this, (C17044ak) ajVar.build(), c, str), C60826bg.f164896a), a);
            this.f49855f.put(aVar, bVar2);
            return bVar2.f49829a.mo50395b();
        }
        return mVar.mo23201a().mo50395b();
    }
}

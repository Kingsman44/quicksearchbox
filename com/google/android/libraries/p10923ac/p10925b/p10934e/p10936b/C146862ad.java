package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146820q;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146853aw;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147077av;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147264u;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.b.ad */
/* compiled from: PG */
public final class C146862ad extends C68247h {

    /* renamed from: a */
    private final C68283d f396435a;

    /* renamed from: c */
    private final C68283d f396436c;

    /* renamed from: d */
    private final C68283d f396437d;

    public C146862ad(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C146862ad.class), aVar);
        this.f396435a = C68236af.m98549d(dVar);
        this.f396436c = C68236af.m98549d(dVar2);
        this.f396437d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C146853aw awVar = (C146853aw) list.get(0);
        C58485gu guVar = (C58485gu) list.get(1);
        C146878g gVar = (C146878g) list.get(2);
        C147077av a = awVar.mo123767a().mo123903a();
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList(awVar.mo123774h());
            Collections.sort(arrayList, C146877f.f396474a);
            C58801sm G = C58485gu.m89842j(arrayList).listIterator(0);
            while (G.hasNext()) {
                C146820q qVar = (C146820q) G.next();
                C58838bb.m90866a(qVar.mo123712a(), "Server state must have assigned timestamps!");
                C63088z a2 = C146877f.m239376a(qVar.mo123714c());
                if (qVar.mo123713b() == null) {
                    hashMap.remove(a2);
                } else {
                    hashMap.put(a2, qVar);
                }
            }
            Objects.requireNonNull(hashMap);
            C146875d dVar = new C146875d(hashMap);
            a.close();
            ((C147264u) gVar.f396478a.mo17428b()).getClass();
            C68214a a3 = C68219e.m98518a(((C68226l) gVar.f396479b).f184585a);
            a3.getClass();
            C68214a a4 = C68219e.m98518a(((C68226l) gVar.f396480c).f184585a);
            a4.getClass();
            C146877f fVar = new C146877f(dVar, a3, a4);
            Objects.requireNonNull(fVar);
            return C60856cj.m92900i(C58485gu.m89842j(C58597ky.m90217h(guVar, new C146896y(fVar))));
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396435a.mo60297gq(), this.f396436c.mo60297gq(), this.f396437d.mo60297gq());
    }
}

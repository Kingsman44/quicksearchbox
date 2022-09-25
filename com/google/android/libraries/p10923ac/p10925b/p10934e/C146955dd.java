package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146811h;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64066dv;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.dd */
/* compiled from: PG */
public final class C146955dd extends C68247h {

    /* renamed from: a */
    private final C68283d f396694a;

    /* renamed from: c */
    private final C68283d f396695c;

    /* renamed from: d */
    private final C68283d f396696d;

    public C146955dd(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C146955dd.class), aVar);
        this.f396694a = C68236af.m98549d(dVar);
        this.f396695c = C68236af.m98549d(dVar2);
        this.f396696d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C64066dv dvVar;
        List list = (List) obj;
        Long l = null;
        Long l2 = null;
        int i = 0;
        boolean z = false;
        while (true) {
            boolean z2 = false;
            for (C147112i e : ((C147116m) list.get(2)).mo123935c((Account) list.get(0), (C64098p) list.get(1))) {
                C64095m e2 = e.mo123926e();
                if (e2.f173285a == 2) {
                    dvVar = (C64066dv) e2.f173286b;
                } else {
                    dvVar = C64066dv.f173213e;
                }
                i = Math.min(i + dvVar.f173216b, 1000);
                if (z || (dvVar.f173215a & 2) == 0) {
                    l2 = null;
                    z = true;
                } else {
                    long j = dvVar.f173217c;
                    if (l2 != null) {
                        j = Math.max(l2.longValue(), j);
                    }
                    l2 = Long.valueOf(j);
                    z = false;
                }
                if (z2 || (dvVar.f173215a & 4) == 0) {
                    l = null;
                    z2 = true;
                } else {
                    long j2 = dvVar.f173218d;
                    if (l != null) {
                        j2 = Math.min(l.longValue(), j2);
                    }
                    l = Long.valueOf(j2);
                }
            }
            return C60856cj.m92900i(new C146811h(i, l, l2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396694a.mo60297gq(), this.f396695c.mo60297gq(), this.f396696d.mo60297gq());
    }
}

package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83898bd;
import com.google.android.apps.gsa.opaonboarding.C83899be;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.az */
/* compiled from: PG */
public final class C94182az extends C83869ac {

    /* renamed from: a */
    private final C94299ex f263143a;

    /* renamed from: b */
    private final C94278ec f263144b;

    /* renamed from: c */
    private final C68214a f263145c;

    public C94182az(C94278ec ecVar, C94299ex exVar, C68214a aVar) {
        this.f263143a = exVar;
        this.f263144b = ecVar;
        this.f263145c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        C83898bd j = C83899be.m133634j();
        j.mo77289f(this.f263143a.mo88438a());
        j.mo77291h((this.f263143a.mo88439b() && this.f263143a.f263511d) || this.f263143a.mo88438a());
        C83923j a = this.f263144b.mo88402a();
        ArrayList arrayList = new ArrayList();
        for (C83917d dVar : a.f228573b) {
            arrayList.add(dVar.f228555b);
        }
        j.mo77286c(C58485gu.m89842j(arrayList));
        j.mo77285b(AvocadoUtils.m155381e(this.f263144b.mo88402a().f228573b));
        j.mo77288e(true);
        j.mo77290g(this.f263143a.f263510c);
        return j.mo77284a().getClass();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        C89849ae aeVar;
        C94299ex exVar = this.f263143a;
        boolean z = true;
        if (!exVar.f263511d && !exVar.mo88438a()) {
            z = false;
        }
        if (!z) {
            if (this.f263143a.f263508a == 3) {
                aeVar = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_EXIT;
            } else {
                aeVar = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FAILED;
            }
            ((C89859i) this.f263145c.mo27525b()).mo83702b(aeVar);
        }
        return z;
    }
}

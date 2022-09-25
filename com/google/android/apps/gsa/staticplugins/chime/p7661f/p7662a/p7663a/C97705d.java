package com.google.android.apps.gsa.staticplugins.chime.p7661f.p7662a.p7663a;

import androidx.work.C4632m;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.staticplugins.chime.p7661f.C97700a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.f.a.a.d */
/* compiled from: PG */
public final class C97705d implements C46575i {

    /* renamed from: a */
    public static final C59071e f272819a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.f.a.a.d");

    /* renamed from: b */
    public final C86124t f272820b;

    /* renamed from: c */
    public final C60888db f272821c;

    /* renamed from: d */
    public final C46578l f272822d;

    /* renamed from: e */
    public final C83807w f272823e;

    /* renamed from: f */
    public final C97700a f272824f;

    /* renamed from: g */
    private final C22871g f272825g;

    public C97705d(C97700a aVar, C86124t tVar, C22871g gVar, C60888db dbVar, C46578l lVar, C83807w wVar) {
        this.f272824f = aVar;
        this.f272820b = tVar;
        this.f272825g = gVar;
        this.f272821c = dbVar;
        this.f272822d = lVar;
        this.f272823e = wVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        this.f272823e.mo77192a(C118569b.SMARTSPACE_CHIME_REGISTRATION_TRIGGER, 1);
        if (this.f272820b.mo79746e(C89985ax.f246736s)) {
            return this.f272825g.mo28201a("#registerUser", new C97703b(this));
        }
        return C60856cj.m92900i(new C4645z(C4632m.f14549a));
    }
}

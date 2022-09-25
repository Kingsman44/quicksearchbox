package com.google.android.gms.gmscompliance.p10800a.p10801a;

import android.content.Context;
import com.google.android.gms.gmscompliance.C144266b;
import com.google.android.gms.gmscompliance.p10800a.C144264d;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10803b.C144234b;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10803b.C144237e;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10804c.C144251m;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10805d.C144253a;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10806e.C144259e;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.gmscompliance.a.a.f */
/* compiled from: PG */
public class C144260f implements C144264d {

    /* renamed from: a */
    public static final C144253a f390715a = new C144253a("InternalGmsDCC");

    /* renamed from: b */
    public final Executor f390716b;

    /* renamed from: c */
    public final C144237e f390717c;

    /* renamed from: d */
    public final C144251m f390718d;

    public C144260f(C144266b bVar, Context context, Executor executor, C144237e eVar, C21370a aVar) {
        C144251m mVar = new C144251m(executor, new C144234b(eVar, executor), bVar, new C144259e(context, aVar), false, false);
        this.f390716b = executor;
        this.f390717c = eVar;
        this.f390718d = mVar;
    }

    /* renamed from: a */
    public final C146006ab mo119790a() {
        C146010af afVar = new C146010af();
        this.f390716b.execute(new C144227a(this, afVar));
        return afVar.f394698a;
    }
}

package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b.C112189o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.research.p5181a.p5186d.C66333e;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bl */
/* compiled from: PG */
public final class C112344bl {

    /* renamed from: a */
    private static final C59071e f311735a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bl");

    /* renamed from: b */
    private final C112189o f311736b;

    /* renamed from: c */
    private final C86124t f311737c;

    /* renamed from: d */
    private final ActivityManager.MemoryInfo f311738d;

    public C112344bl(Context context, C112189o oVar, C86124t tVar) {
        this.f311736b = oVar;
        this.f311737c = tVar;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f311738d = memoryInfo;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            return;
        }
        C59104x c = f311735a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ReflectEnsembleCreat");
        ((C59052c) ((C59052c) c).mo56372aa(27715)).mo56386p("ActivityManager is null!");
    }

    /* renamed from: b */
    private static int m186206b(double d, long j, long j2) {
        long j3;
        if (j2 < j) {
            C59104x c = f311735a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReflectEnsembleCreat");
            ((C59052c) ((C59052c) c).mo56372aa(27712)).mo56350C("Invalid range [%d, %d]", j, j2);
            j3 = 0;
        } else {
            j3 = j2 - j;
        }
        double d2 = (double) j3;
        Double.isNaN(d2);
        return ((int) j) + ((int) (d * d2));
    }

    /* renamed from: a */
    public final C112341bi mo99509a(List list, C22871g gVar) {
        C66333e.f180360a = this.f311737c.mo79747m(C90063do.f249563fr);
        C112341bi biVar = new C112341bi(gVar);
        C58485gu a = this.f311736b.mo99464a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C48668ac acVar = (C48668ac) a.get(i);
            Optional findAny = Collection.EL.stream(list).filter(new C112342bj(acVar)).findAny();
            if (!findAny.isPresent()) {
                double d = (double) this.f311738d.totalMem;
                Double.isNaN(d);
                double min = Math.min(1.0d, d / 8.589934592E9d);
                C58976aa aaVar = C58975e.f156826a;
                long j = this.f311738d.totalMem;
                int b = m186206b(min, this.f311737c.mo79743a(C90063do.f249557fl), this.f311737c.mo79743a(C90063do.f249555fj));
                int b2 = m186206b(min, this.f311737c.mo79743a(C90063do.f249556fk), this.f311737c.mo79743a(C90063do.f249554fi));
                int b3 = m186206b(min, this.f311737c.mo79743a(C90063do.f249561fp), this.f311737c.mo79743a(C90063do.f249559fn));
                double d2 = min;
                int i2 = b3;
                int b4 = m186206b(d2, this.f311737c.mo79743a(C90063do.f249560fo), this.f311737c.mo79743a(C90063do.f249558fm));
                C48668ac acVar2 = C48668ac.UNSPECIFIED_REFLECTION_PREDICTOR;
                int ordinal = acVar.ordinal();
                if (ordinal == 1) {
                    findAny = Optional.m71637of(new C112372f(acVar, i2, b4, (float) this.f311737c.mo79747m(C90063do.f249562fq)));
                } else if (ordinal == 2) {
                    findAny = Optional.m71637of(new C112359c());
                } else if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
                    findAny = Optional.m71637of(new C112372f(acVar, b, b2, (float) this.f311737c.mo79747m(C90063do.f249562fq)));
                } else {
                    C59104x c = f311735a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ReflectEnsembleCreat");
                    ((C59052c) ((C59052c) c).mo56372aa(27714)).mo56389s("Unexpected predictor: %s", acVar.name());
                    findAny = Optional.empty();
                }
            }
            findAny.ifPresent(new C112343bk(biVar));
        }
        return biVar;
    }
}

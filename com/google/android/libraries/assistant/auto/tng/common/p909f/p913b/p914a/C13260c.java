package com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p914a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.C13257a;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13261a;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13262b;
import com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a;
import com.google.android.libraries.search.assistant.p2497ab.C32371am;
import com.google.android.libraries.search.assistant.p2497ab.C32376ar;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.b.a.c */
/* compiled from: PG */
public final class C13260c implements C13257a {

    /* renamed from: b */
    private static final C65753ak f40939b = C65753ak.TNG_ASSISTANT_TOP_CONTACTS;

    /* renamed from: a */
    public final Context f40940a;

    /* renamed from: c */
    private final C38469m f40941c;

    /* renamed from: d */
    private final C60888db f40942d;

    public C13260c(Context context, C38469m mVar, C60888db dbVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(mVar, "gellerAccessor");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        this.f40940a = context;
        this.f40941c = mVar;
        this.f40942d = dbVar;
    }

    /* renamed from: a */
    public static final C58485gu m29521a(List list, int i) {
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C32371am amVar = (C32371am) it.next();
            C13261a aVar = (C13261a) C13262b.f40943e.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C69664n.m101061g(aVar, "builder");
            String str = amVar.f86784c;
            C69664n.m101060f(str, "it.name");
            C69664n.m101061g(str, "value");
            aVar.copyOnWrite();
            C13262b bVar = (C13262b) aVar.instance;
            str.getClass();
            bVar.f40945a |= 1;
            bVar.f40946b = str;
            double d = amVar.f86785d;
            aVar.copyOnWrite();
            C13262b bVar2 = (C13262b) aVar.instance;
            bVar2.f40945a |= 2;
            bVar2.f40947c = d;
            String str2 = amVar.f86783b;
            C69664n.m101060f(str2, "it.contactId");
            C69664n.m101061g(str2, "value");
            aVar.copyOnWrite();
            C13262b bVar3 = (C13262b) aVar.instance;
            str2.getClass();
            bVar3.f40945a |= 4;
            bVar3.f40948d = str2;
            C62942bv build = aVar.build();
            C69664n.m101060f(build, "_builder.build()");
            arrayList.add((C13262b) build);
        }
        return C58479go.m89810b(C69540x.m100838T(arrayList, i));
    }

    /* renamed from: f */
    private final C60870cx m29522f(int i, int i2) {
        if (!C13315a.m29571a("android.permission.READ_CONTACTS", this.f40940a)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        int i3 = i - 1;
        if (i3 != 1) {
            if (i3 != 2) {
                if (!C13315a.m29571a("android.permission.READ_SMS", this.f40940a) || !C13315a.m29571a("android.permission.READ_CALL_LOG", this.f40940a)) {
                    return C60856cj.m92900i(C58485gu.m89845m());
                }
            } else if (!C13315a.m29571a("android.permission.READ_SMS", this.f40940a)) {
                return C60856cj.m92900i(C58485gu.m89845m());
            }
        } else if (!C13315a.m29571a("android.permission.READ_CALL_LOG", this.f40940a)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return C60922j.m93044g(this.f40941c.mo41433d(f40939b, (String) null, C63662ac.f172144a, 1, C32376ar.f86796d), C47810es.m84963c(new C13259b(i, i2)), this.f40942d);
    }

    /* renamed from: b */
    public final C60870cx mo20997b(int i) {
        return m29522f(1, i);
    }

    /* renamed from: c */
    public final C60870cx mo20998c(int i) {
        if (!C13315a.m29571a("android.permission.READ_CONTACTS", this.f40940a)) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        C60870cx d = this.f40941c.mo41433d(f40939b, (String) null, C63662ac.f172144a, 1, C32376ar.f86796d);
        C13258a aVar = new C13258a(this, i);
        return C60922j.m93044g(d, C47810es.m84963c(aVar), this.f40942d);
    }

    /* renamed from: d */
    public final C60870cx mo20999d(int i) {
        return m29522f(2, i);
    }

    /* renamed from: e */
    public final C60870cx mo21000e(int i) {
        return m29522f(3, i);
    }
}

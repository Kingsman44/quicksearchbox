package com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10187b.C134267a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.c.k */
/* compiled from: PG */
public final class C134279k {

    /* renamed from: a */
    public static final C59071e f365782a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.feedback.a.c.k");

    /* renamed from: b */
    public final Executor f365783b;

    /* renamed from: c */
    private final C69464a f365784c;

    /* renamed from: d */
    private final C69464a f365785d;

    public C134279k(C69464a aVar, C69464a aVar2, C69464a aVar3, Executor executor) {
        this.f365784c = aVar;
        this.f365785d = new C134277i(aVar2, aVar3);
        this.f365783b = executor;
    }

    /* renamed from: a */
    public final C47633f mo111672a(C134267a aVar) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (C134270b a : (Set) this.f365784c.mo17428b()) {
            try {
                stringBuffer.append(aVar.mo111670a(a.mo111669a()));
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f365782a.mo56226d()).mo56382g(e)).mo56372aa(40343)).mo56386p("Error while getting value of debuggable");
                i++;
            }
        }
        if (i > 0) {
            stringBuffer.append("Failed to write debuggables: ");
            stringBuffer.append(i);
            stringBuffer.append(10);
        }
        return C47636i.m84743b((C58485gu) Collection.EL.stream(((Map) this.f365785d.mo17428b()).entrySet()).map(new C134272d(this, aVar, stringBuffer)).collect(C58370cn.f155946a)).mo51518a(C134273e.f365775a, this.f365783b).mo51515h(new C134278j(stringBuffer), this.f365783b);
    }

    /* renamed from: b */
    public final C60870cx mo111673b(boolean z) {
        C134267a aVar;
        if (z) {
            aVar = C134267a.f365768b;
        } else {
            aVar = C134267a.f365767a;
        }
        return mo111672a(aVar).mo51515h(C134271c.f365771a, this.f365783b);
    }
}

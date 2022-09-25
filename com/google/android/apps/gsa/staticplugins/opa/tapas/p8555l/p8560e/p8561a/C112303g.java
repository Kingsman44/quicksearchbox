package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a;

import com.google.research.p5181a.p5183b.p5184a.C66307h;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.g */
/* compiled from: PG */
public final class C112303g {

    /* renamed from: a */
    public long f311648a = 0;

    /* renamed from: b */
    public int f311649b = 0;

    /* renamed from: c */
    public long f311650c = 0;

    /* renamed from: d */
    public int f311651d = 0;

    /* renamed from: e */
    public long f311652e = 0;

    /* renamed from: f */
    public Map f311653f = new HashMap();

    /* renamed from: g */
    public final Map f311654g = new HashMap();

    /* renamed from: a */
    public static C112303g m186164a(C66376a aVar) {
        C112303g gVar = new C112303g();
        if (aVar.mo59463f() == 1) {
            gVar.f311649b = 1;
            gVar.f311650c = aVar.mo59458a();
            gVar.f311648a = aVar.mo59467j().mo59503c();
        } else if (C112305i.m186166b(aVar) && C112305i.m186165a(aVar) != -1) {
            String b = aVar.mo59466i().mo59479b();
            String k = ((C66307h) aVar.mo59466i().mo59480c().get(C112305i.m186165a(aVar))).mo59491k();
            gVar.f311649b = 1;
            gVar.f311650c = aVar.mo59458a();
            gVar.f311648a = aVar.mo59467j().mo59503c();
            gVar.f311651d = 1;
            gVar.f311652e = aVar.mo59467j().mo59503c();
            gVar.f311654g.put(b, 1);
            HashMap hashMap = new HashMap();
            C112304h hVar = new C112304h();
            hVar.f311656b = 1;
            hVar.f311655a = aVar.mo59467j().mo59503c();
            hVar.f311657c.put(b, 1);
            hashMap.put(k, hVar);
            gVar.f311653f = hashMap;
        }
        return gVar;
    }
}

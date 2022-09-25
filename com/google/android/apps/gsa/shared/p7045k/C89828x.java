package com.google.android.apps.gsa.shared.p7045k;

import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7045k.p7047b.C89800c;
import com.google.android.apps.gsa.shared.p7045k.p7047b.C89805h;
import com.google.android.apps.gsa.shared.p7045k.p7047b.C89806i;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.net.URL;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.shared.k.x */
/* compiled from: PG */
public final /* synthetic */ class C89828x implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C89795ac f243145a;

    /* renamed from: b */
    public final /* synthetic */ boolean f243146b;

    /* renamed from: c */
    public final /* synthetic */ URL f243147c;

    public /* synthetic */ C89828x(C89795ac acVar, boolean z, URL url) {
        this.f243145a = acVar;
        this.f243146b = z;
        this.f243147c = url;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C89795ac acVar = this.f243145a;
        boolean z = this.f243146b;
        URL url = this.f243147c;
        if (z) {
            C89806i iVar = new C89806i();
            iVar.f243089b.put("Content-Type", "application/json");
            iVar.f243089b.put("Origin", "https://www.google.com");
            return ((C89805h) acVar.f243052c.mo27525b()).mo83661a(iVar, url, false, (C89800c) null, 30);
        }
        C89019aq c = C89020ar.m144758c();
        c.f241236b = url;
        c.mo82990b("Content-Type", "application/json");
        c.mo82990b("Origin", "https://www.google.com");
        c.f241245k = 30;
        C89020ar.m144761h(5000);
        c.f241246l = 5000;
        C89020ar.m144761h(5000);
        c.f241247m = 5000;
        C89020ar a = c.mo82989a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", "E8C28D3C");
        ByteBuffer.wrap(jSONObject.toString().getBytes(C90772bp.f253863a));
        return ((C89012aj) acVar.f243051b.mo27525b()).mo27495f(a, C89009ag.f241207b, ((C89012aj) acVar.f243051b.mo27525b()).mo27510b(C89066v.f241382a));
    }
}

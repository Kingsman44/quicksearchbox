package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7045k.p7047b.C89800c;
import com.google.android.apps.gsa.shared.p7045k.p7047b.C89805h;
import com.google.android.apps.gsa.shared.p7045k.p7047b.C89806i;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import java.net.URL;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cs */
/* compiled from: PG */
public final /* synthetic */ class C94240cs implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263344a;

    /* renamed from: b */
    public final /* synthetic */ boolean f263345b;

    /* renamed from: c */
    public final /* synthetic */ String f263346c;

    /* renamed from: d */
    public final /* synthetic */ String f263347d;

    public /* synthetic */ C94240cs(C94256dh dhVar, boolean z, String str, String str2) {
        this.f263344a = dhVar;
        this.f263345b = z;
        this.f263346c = str;
        this.f263347d = str2;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C94256dh dhVar = this.f263344a;
        boolean z = this.f263345b;
        String str = this.f263346c;
        String str2 = this.f263347d;
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14329)).mo56386p("#makeVerifyAccountRequest");
        URL url = new URL(str);
        if (z) {
            C89806i iVar = new C89806i();
            iVar.f243089b.put("Content-Type", "application/json");
            iVar.f243089b.put("Origin", "https://www.google.com");
            return ((C89805h) dhVar.f263391f.mo27525b()).mo83661a(iVar, url, true, new C89800c(C94256dh.m155536f(str2, dhVar.f263394i.e()), "application/json"), 75);
        }
        C89019aq d = C89020ar.m144759d();
        d.f241236b = url;
        d.mo82990b("Content-Type", "application/json");
        d.mo82990b("Origin", "https://www.google.com");
        d.f241245k = 75;
        C89020ar.m144761h(5000);
        d.f241246l = 5000;
        C89020ar.m144761h(5000);
        d.f241247m = 5000;
        C89020ar a = d.mo82989a();
        C89068x a2 = C89009ag.m144715a(ByteBuffer.wrap(C94256dh.m155536f(str2, dhVar.f263394i.e()).getBytes(C90772bp.f253863a)), dhVar.f263390e.mo27509a());
        C89012aj ajVar = dhVar.f263390e;
        return ajVar.mo27495f(a, a2, ajVar.mo27510b(C89066v.f241382a));
    }
}

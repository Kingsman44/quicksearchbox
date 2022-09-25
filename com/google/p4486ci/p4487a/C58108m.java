package com.google.p4486ci.p4487a;

import com.google.common.base.C58837ba;
import com.google.common.base.C58893dc;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60908dv;
import java.util.concurrent.Executors;

/* renamed from: com.google.ci.a.m */
/* compiled from: PG */
final class C58108m implements C58114s {

    /* renamed from: a */
    public static final char[] f155325a = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

    /* renamed from: b */
    public final String f155326b;

    /* renamed from: c */
    public final String f155327c = "POST";

    /* renamed from: d */
    public final C58100e f155328d;

    /* renamed from: e */
    public final String f155329e;

    /* renamed from: f */
    public final C58097b f155330f;

    /* renamed from: g */
    public C58118w f155331g;

    /* renamed from: h */
    public int f155332h;

    /* renamed from: i */
    private int f155333i;

    /* renamed from: a */
    public final C60870cx mo54658a() {
        C58106k kVar = new C58106k(this);
        C60908dv dvVar = new C60908dv();
        dvVar.mo57410b("Scotty-Uploader-MultipartTransfer-%d");
        C60887da a = C60895di.m92995a(Executors.newSingleThreadExecutor(C60908dv.m93015a(dvVar)));
        C60870cx b = a.mo19399b(kVar);
        a.shutdown();
        return b;
    }

    /* renamed from: b */
    public final synchronized void mo54666b() {
        boolean z = true;
        if (1 != this.f155333i) {
            z = false;
        }
        C58893dc.m90997b(z);
    }

    /* renamed from: c */
    public final String mo54660c() {
        return null;
    }

    /* renamed from: f */
    public final synchronized void mo54663f(C58118w wVar, int i) {
        this.f155331g = wVar;
        this.f155332h = 1048576;
    }

    public C58108m(String str, C58100e eVar, C58097b bVar, String str2) {
        str.getClass();
        bVar.getClass();
        this.f155326b = str;
        this.f155328d = eVar;
        this.f155329e = C58837ba.m90858g(str2);
        this.f155330f = bVar;
        this.f155333i = 1;
    }
}

package com.google.android.apps.gsa.shared.logger;

import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.libraries.gsa.p1864f.p1867b.C22814a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60474rf;
import com.google.common.p4552o.C60475rg;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.shared.logger.e */
/* compiled from: PG */
public class C89886e {

    /* renamed from: b */
    protected final C90456c f246281b;

    /* renamed from: c */
    public int f246282c = 0;

    /* renamed from: d */
    public String f246283d;

    /* renamed from: e */
    public C89956x f246284e;

    /* renamed from: f */
    protected C59796fx f246285f;

    /* renamed from: g */
    protected Throwable f246286g;

    /* renamed from: h */
    public boolean f246287h = true;

    public C89886e(C90456c cVar) {
        cVar.getClass();
        this.f246281b = cVar;
    }

    /* renamed from: e */
    private static void m146364e(C90456c cVar, C89956x xVar, int i, C59796fx fxVar, Throwable th) {
        Throwable cause = cVar.mo79845c().getCause();
        while (cause != null && !(cause instanceof C90456c)) {
            cause = cause.getCause();
        }
        if (cause != null) {
            m146364e((C90456c) cause, xVar, 0, (C59796fx) null, (Throwable) null);
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        int b = cVar.mo79844b();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = b;
        if (xVar != null) {
            C89949q.m146519c(tzVar, xVar);
        }
        C59753ej a = C22814a.m42629a(cVar.mo79843a(), th);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        a.getClass();
        ufVar2.f164076J = a;
        ufVar2.f164146b |= 8192;
        if (i != 0) {
            C60474rf rfVar = (C60474rf) C60475rg.f163673c.createBuilder();
            rfVar.copyOnWrite();
            C60475rg rgVar = (C60475rg) rfVar.instance;
            rgVar.f163675a |= 1;
            rgVar.f163676b = i;
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            C60475rg rgVar2 = (C60475rg) rfVar.build();
            rgVar2.getClass();
            ufVar3.f164265t = rgVar2;
            ufVar3.f164093a |= 4096;
        }
        if (fxVar != null) {
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164138as = fxVar;
            ufVar4.f164249d |= 65536;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: a */
    public void mo83721a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo83723b() {
        m146364e(this.f246281b, this.f246284e, this.f246282c, this.f246285f, this.f246286g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo83724c() {
        if (this.f246287h) {
            String str = this.f246283d;
            if (str == null) {
                str = this.f246281b.mo79845c().getMessage();
            }
            String str2 = str;
            C90456c cVar = this.f246281b;
            ((C59052c) ((C59052c) C89911f.f246338a.mo56226d()).mo56372aa(10679)).mo56360M("reportError [type: %d, code: %d, bug: %d]: %s", Integer.valueOf(cVar.mo79844b()), Integer.valueOf(cVar.mo79843a()), Integer.valueOf(this.f246282c), str2);
        }
    }

    /* renamed from: d */
    public final void mo83725d(long j) {
        this.f246284e = new C89956x(j, 0);
    }
}

package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58838bb;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.aa.as */
/* compiled from: PG */
public class C89021as {

    /* renamed from: a */
    private final C90457d f241275a;

    /* renamed from: b */
    private final C89022at f241276b;

    /* renamed from: c */
    private final C89013ak f241277c;

    /* renamed from: d */
    private final C89068x f241278d;

    public C89021as(C90457d dVar) {
        dVar.getClass();
        this.f241275a = dVar;
        this.f241276b = null;
        this.f241277c = null;
        this.f241278d = null;
    }

    /* renamed from: b */
    public C89068x mo82997b() {
        C90457d dVar = this.f241275a;
        if (dVar == null) {
            C89013ak akVar = this.f241277c;
            if (akVar == null) {
                C89068x xVar = this.f241278d;
                xVar.getClass();
                return xVar;
            }
            throw akVar;
        }
        throw dVar;
    }

    /* renamed from: c */
    public C89021as mo82998c(List list) {
        return new C89021as(this, list);
    }

    /* renamed from: g */
    public final C89022at mo82999g() {
        C90457d dVar = this.f241275a;
        if (dVar == null) {
            C89022at atVar = this.f241276b;
            atVar.getClass();
            return atVar;
        }
        throw dVar;
    }

    public C89021as(C89013ak akVar) {
        akVar.getClass();
        this.f241275a = null;
        this.f241276b = akVar.mo82984e();
        this.f241277c = akVar;
        this.f241278d = null;
    }

    public C89021as(C89021as asVar, List list) {
        asVar.f241276b.getClass();
        C58838bb.m90868c(!list.isEmpty());
        this.f241275a = asVar.f241275a;
        C89022at atVar = asVar.f241276b;
        C89022at atVar2 = new C89022at(atVar.f241279a, atVar.f241280b, atVar.f241281c, list);
        this.f241276b = atVar2;
        if (asVar.f241277c == null) {
            this.f241277c = null;
        } else {
            this.f241277c = new C89013ak(atVar2);
        }
        this.f241278d = asVar.f241278d;
    }

    public C89021as(C89022at atVar, C89068x xVar) {
        this.f241275a = null;
        atVar.getClass();
        this.f241276b = atVar;
        this.f241277c = null;
        xVar.getClass();
        this.f241278d = xVar;
    }
}

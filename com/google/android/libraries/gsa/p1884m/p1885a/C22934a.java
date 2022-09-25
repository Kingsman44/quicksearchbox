package com.google.android.libraries.gsa.p1884m.p1885a;

import android.text.TextUtils;
import com.google.p375ai.p378b.C7812kw;
import com.google.p375ai.p378b.C7814ky;
import com.google.p375ai.p378b.C7817la;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C7822lf;
import com.google.p375ai.p378b.C8145xe;
import com.google.p375ai.p378b.C8150xj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.m.a.a */
/* compiled from: PG */
public final class C22934a {

    /* renamed from: a */
    public int f63112a;

    /* renamed from: b */
    private final C7817la f63113b;

    /* renamed from: c */
    private final List f63114c;

    /* renamed from: d */
    private C7822lf f63115d;

    /* renamed from: e */
    private String f63116e;

    /* renamed from: f */
    private C8150xj f63117f;

    /* renamed from: g */
    private int f63118g;

    /* renamed from: h */
    private int f63119h;

    /* renamed from: i */
    private boolean f63120i;

    /* renamed from: j */
    private boolean f63121j;

    /* renamed from: k */
    private int f63122k;

    public C22934a(C7817la laVar) {
        this.f63115d = null;
        this.f63116e = " · ";
        this.f63117f = null;
        this.f63122k = 1;
        this.f63113b = laVar;
        this.f63114c = new ArrayList();
    }

    /* renamed from: a */
    public final C7818lb mo28281a() {
        C7812kw kwVar = (C7812kw) C7818lb.f27416n.createBuilder();
        String str = this.f63116e;
        kwVar.copyOnWrite();
        C7818lb lbVar = (C7818lb) kwVar.instance;
        str.getClass();
        lbVar.f27418a |= 8;
        lbVar.f27423f = str;
        C7817la laVar = this.f63113b;
        kwVar.copyOnWrite();
        C7818lb lbVar2 = (C7818lb) kwVar.instance;
        lbVar2.f27420c = laVar.f27415aP;
        lbVar2.f27418a |= 1;
        int i = this.f63112a;
        if (i != 0) {
            kwVar.copyOnWrite();
            C7818lb lbVar3 = (C7818lb) kwVar.instance;
            lbVar3.f27418a |= 2;
            lbVar3.f27421d = i;
        }
        boolean z = this.f63120i;
        kwVar.copyOnWrite();
        C7818lb lbVar4 = (C7818lb) kwVar.instance;
        lbVar4.f27418a |= 256;
        lbVar4.f27428k = z;
        boolean z2 = this.f63121j;
        kwVar.copyOnWrite();
        C7818lb lbVar5 = (C7818lb) kwVar.instance;
        lbVar5.f27418a |= 512;
        lbVar5.f27429l = z2;
        kwVar.mo16970a(this.f63114c);
        int i2 = this.f63122k;
        kwVar.copyOnWrite();
        C7818lb lbVar6 = (C7818lb) kwVar.instance;
        int i3 = i2 - 1;
        if (i2 != 0) {
            lbVar6.f27422e = i3;
            lbVar6.f27418a |= 4;
            int i4 = this.f63118g;
            kwVar.copyOnWrite();
            C7818lb lbVar7 = (C7818lb) kwVar.instance;
            lbVar7.f27418a |= 64;
            lbVar7.f27426i = i4;
            int i5 = this.f63119h;
            kwVar.copyOnWrite();
            C7818lb lbVar8 = (C7818lb) kwVar.instance;
            lbVar8.f27418a |= 128;
            lbVar8.f27427j = i5;
            C8150xj xjVar = this.f63117f;
            if (xjVar != null) {
                kwVar.copyOnWrite();
                C7818lb lbVar9 = (C7818lb) kwVar.instance;
                lbVar9.f27425h = xjVar;
                lbVar9.f27418a |= 32;
            }
            C7822lf lfVar = this.f63115d;
            if (lfVar != null) {
                kwVar.copyOnWrite();
                C7818lb lbVar10 = (C7818lb) kwVar.instance;
                lbVar10.f27430m = lfVar;
                lbVar10.f27418a |= 1024;
            }
            return (C7818lb) kwVar.build();
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo28282b(C8150xj xjVar) {
        if (xjVar != null) {
            this.f63114c.add(C22935b.m42917a(xjVar));
        }
    }

    /* renamed from: c */
    public final void mo28283c(String str) {
        if (!TextUtils.isEmpty(str)) {
            List list = this.f63114c;
            C8145xe xeVar = (C8145xe) C8150xj.f28657d.createBuilder();
            xeVar.copyOnWrite();
            C8150xj xjVar = (C8150xj) xeVar.instance;
            str.getClass();
            xjVar.f28659a |= 1;
            xjVar.f28660b = str;
            list.add(C22935b.m42917a((C8150xj) xeVar.build()));
        }
    }

    public C22934a(C7818lb lbVar, C7817la laVar) {
        C8150xj xjVar;
        C7822lf lfVar = null;
        this.f63115d = null;
        this.f63116e = " · ";
        this.f63117f = null;
        int i = 1;
        this.f63122k = 1;
        this.f63112a = lbVar.f27421d;
        int a = C7814ky.m22857a(lbVar.f27422e);
        this.f63122k = a != 0 ? a : i;
        this.f63118g = lbVar.f27426i;
        this.f63119h = lbVar.f27427j;
        if ((lbVar.f27418a & 32) != 0) {
            xjVar = lbVar.f27425h;
            if (xjVar == null) {
                xjVar = C8150xj.f28657d;
            }
        } else {
            xjVar = null;
        }
        this.f63117f = xjVar;
        this.f63113b = laVar;
        this.f63120i = lbVar.f27428k;
        this.f63121j = lbVar.f27429l;
        ArrayList arrayList = new ArrayList(lbVar.f27419b.size());
        this.f63114c = arrayList;
        if ((lbVar.f27418a & 1024) != 0 && (lfVar = lbVar.f27430m) == null) {
            lfVar = C7822lf.f27432k;
        }
        this.f63115d = lfVar;
        if ((lbVar.f27418a & 8) != 0) {
            this.f63116e = lbVar.f27423f;
        }
        arrayList.addAll(lbVar.f27419b);
    }
}

package com.google.android.apps.gsa.shared.logger.p7055e.p7056a;

import com.google.android.apps.gsa.shared.logger.p7055e.C89909c;
import com.google.android.libraries.gsa.p1864f.p1867b.C22814a;
import com.google.common.p4522b.C58461fx;
import com.google.common.p4522b.C58691ok;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C59787fo;
import com.google.common.p4552o.C59788fp;
import com.google.common.p4552o.C59789fq;
import com.google.common.p4552o.C59791fs;
import com.google.common.p4552o.C59792ft;

/* renamed from: com.google.android.apps.gsa.shared.logger.e.a.c */
/* compiled from: PG */
public final class C89902c implements C89909c {

    /* renamed from: a */
    private final C89901b f246316a;

    /* renamed from: b */
    private final Object f246317b = new Object();

    /* renamed from: c */
    private int f246318c;

    /* renamed from: d */
    private int f246319d;

    /* renamed from: e */
    private int f246320e;

    /* renamed from: f */
    private final C58461fx f246321f = new C58461fx();

    public C89902c(C89901b bVar) {
        this.f246316a = bVar;
        this.f246318c = 0;
        this.f246319d = 0;
        this.f246320e = 0;
    }

    /* renamed from: f */
    private final C59792ft m146400f() {
        C59789fq fqVar = (C59789fq) C59792ft.f161561h.createBuilder();
        C59791fs fsVar = ((C89888a) this.f246316a).f246289b;
        fqVar.copyOnWrite();
        C59792ft ftVar = (C59792ft) fqVar.instance;
        ftVar.f161564b = fsVar.f161560e;
        ftVar.f161563a |= 2;
        String str = ((C89888a) this.f246316a).f246288a;
        fqVar.copyOnWrite();
        C59792ft ftVar2 = (C59792ft) fqVar.instance;
        ftVar2.f161563a |= 4;
        ftVar2.f161565c = str;
        synchronized (this.f246317b) {
            int i = this.f246318c;
            fqVar.copyOnWrite();
            C59792ft ftVar3 = (C59792ft) fqVar.instance;
            ftVar3.f161563a |= 8;
            ftVar3.f161566d = i;
            int i2 = this.f246319d;
            fqVar.copyOnWrite();
            C59792ft ftVar4 = (C59792ft) fqVar.instance;
            ftVar4.f161563a |= 32;
            ftVar4.f161568f = i2;
            int i3 = this.f246320e;
            fqVar.copyOnWrite();
            C59792ft ftVar5 = (C59792ft) fqVar.instance;
            ftVar5.f161563a |= 16;
            ftVar5.f161567e = i3;
            for (C58691ok okVar : this.f246321f.mo54975m()) {
                C59787fo foVar = (C59787fo) C59788fp.f161549d.createBuilder();
                C59753ej ejVar = (C59753ej) okVar.mo55768b();
                foVar.copyOnWrite();
                C59788fp fpVar = (C59788fp) foVar.instance;
                ejVar.getClass();
                fpVar.f161552b = ejVar;
                fpVar.f161551a |= 1;
                int a = okVar.mo55767a();
                foVar.copyOnWrite();
                C59788fp fpVar2 = (C59788fp) foVar.instance;
                fpVar2.f161551a |= 2;
                fpVar2.f161553c = a;
                fqVar.mo57056a((C59788fp) foVar.build());
            }
        }
        return (C59792ft) fqVar.build();
    }

    /* renamed from: a */
    public final C59792ft mo83743a() {
        return m146400f();
    }

    /* renamed from: b */
    public final C59792ft mo83744b() {
        C59792ft f = m146400f();
        synchronized (this.f246317b) {
            this.f246318c = 0;
            this.f246319d = 0;
            this.f246320e = 0;
            this.f246321f.clear();
        }
        return f;
    }

    /* renamed from: c */
    public final void mo83745c(Throwable th) {
        C59753ej b = C22814a.m42630b((C59752ei) C59753ej.f161449e.createBuilder(), th, 5, 10);
        synchronized (this.f246317b) {
            this.f246319d++;
            this.f246321f.mo54931lF(b, 1);
        }
    }

    /* renamed from: d */
    public final void mo83746d() {
        synchronized (this.f246317b) {
            this.f246318c++;
        }
    }

    /* renamed from: e */
    public final void mo83747e() {
        synchronized (this.f246317b) {
            this.f246320e++;
        }
    }
}

package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import androidx.p060c.C0977g;
import androidx.p060c.C0979i;
import com.google.android.apps.p489g.C9127c;
import com.google.android.apps.p489g.C9136d;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7973qv;
import com.google.p375ai.p378b.C8144xd;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.cv */
/* compiled from: PG */
final class C98121cv extends C98045a {

    /* renamed from: a */
    public boolean f273984a;

    /* renamed from: b */
    public final Set f273985b = new C0979i(0);

    /* renamed from: c */
    public final Map f273986c = new C0977g();

    /* renamed from: d */
    private final C98127i f273987d;

    public C98121cv(C98127i iVar) {
        this.f273987d = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77745a(C7718hj hjVar) {
        int a;
        if (!hjVar.f26946R && hjVar.f26949U && (a = C8144xd.m22956a(hjVar.f26929A)) != 0 && a == 2 && (hjVar.f26955a & 4) != 0) {
            Set set = this.f273985b;
            C7669fo foVar = hjVar.f26968i;
            if (foVar == null) {
                foVar = C7669fo.f26633e;
            }
            set.remove(foVar);
            C9127c cVar = (C9127c) C9136d.f31448d.createBuilder();
            C7669fo foVar2 = hjVar.f26968i;
            if (foVar2 == null) {
                foVar2 = C7669fo.f26633e;
            }
            cVar.copyOnWrite();
            C9136d dVar = (C9136d) cVar.instance;
            foVar2.getClass();
            dVar.f31451b = foVar2;
            dVar.f31450a |= 1;
            if ((hjVar.f26955a & 32) != 0) {
                C7973qv qvVar = hjVar.f26971l;
                if (qvVar == null) {
                    qvVar = C7973qv.f28001c;
                }
                cVar.copyOnWrite();
                C9136d dVar2 = (C9136d) cVar.instance;
                qvVar.getClass();
                dVar2.f31452c = qvVar;
                dVar2.f31450a = 2 | dVar2.f31450a;
            }
            Map map = this.f273986c;
            C7669fo foVar3 = hjVar.f26968i;
            if (foVar3 == null) {
                foVar3 = C7669fo.f26633e;
            }
            map.put(foVar3, (C9136d) cVar.build());
            this.f273984a = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo86659k() {
        this.f273985b.clear();
        this.f273985b.addAll(this.f273987d.mo90982a().keySet());
    }
}

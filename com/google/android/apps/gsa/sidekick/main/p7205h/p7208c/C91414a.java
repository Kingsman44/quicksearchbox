package com.google.android.apps.gsa.sidekick.main.p7205h.p7208c;

import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91859a;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91861c;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91862d;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91903a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91904b;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91909g;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91910h;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.common.base.C58838bb;
import com.google.p375ai.p378b.C7573c;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* renamed from: com.google.android.apps.gsa.sidekick.main.h.c.a */
/* compiled from: PG */
public final class C91414a {

    /* renamed from: a */
    private final C91910h f255018a;

    /* renamed from: b */
    private final C91866h f255019b;

    /* renamed from: c */
    private final C86106b f255020c;

    /* renamed from: d */
    private final C8142xb f255021d;

    /* renamed from: e */
    private final C86124t f255022e;

    /* renamed from: f */
    private final C91647a f255023f;

    /* renamed from: g */
    private final C7681g f255024g;

    /* renamed from: h */
    private final boolean f255025h;

    /* renamed from: i */
    private final C7718hj f255026i;

    /* renamed from: j */
    private final C7718hj f255027j;

    /* renamed from: k */
    private final C7718hj f255028k;

    /* renamed from: l */
    private final C7708h f255029l;

    /* renamed from: m */
    private final C8178yk f255030m;

    /* renamed from: n */
    private final int f255031n;

    /* renamed from: o */
    private final int f255032o;

    /* renamed from: p */
    private final int f255033p;

    public C91414a(C91910h hVar, C91866h hVar2, C86106b bVar, C86124t tVar, C91647a aVar, C7681g gVar, C7718hj hjVar, C7718hj hjVar2, C7718hj hjVar3, int i, int i2, int i3, C8178yk ykVar) {
        this.f255018a = hVar;
        this.f255019b = hVar2;
        this.f255020c = bVar;
        this.f255022e = tVar;
        this.f255023f = aVar;
        this.f255021d = aVar.mo85966a();
        this.f255024g = gVar;
        this.f255026i = hjVar;
        this.f255027j = hjVar2;
        this.f255028k = hjVar3;
        this.f255031n = i;
        this.f255032o = i2;
        this.f255033p = i3;
        boolean z = true;
        boolean z2 = false;
        C7709ha haVar = null;
        if (hjVar != null) {
            C7708h c = C91978bb.m150937c(hjVar, gVar, new C7681g[0]);
            this.f255029l = c;
            this.f255025h = c == null ? false : z;
        } else {
            this.f255029l = null;
            C58838bb.m90869d(gVar == C7681g.STREAM_SCROLL ? true : z2, "Only STREAM_SCROLL action supports no logging entry");
            this.f255025h = true;
        }
        if (ykVar == null || hjVar == null) {
            this.f255030m = null;
            return;
        }
        if ((hjVar.f26955a & 64) != 0 && (haVar = hjVar.f26972m) == null) {
            haVar = C7709ha.f26910f;
        }
        this.f255030m = hVar2.mo86389b(ykVar, haVar);
    }

    /* renamed from: a */
    public final void mo85761a(int i) {
        C7718hj hjVar;
        C91909g gVar;
        C7709ha haVar;
        if (Math.abs(i) > 10) {
            if (this.f255025h) {
                C91904b bVar = new C91904b();
                bVar.f256310g = Integer.valueOf(i);
                C7718hj hjVar2 = this.f255026i;
                if (hjVar2 != null) {
                    gVar = this.f255018a.mo86565b(hjVar2, this.f255024g);
                    int i2 = this.f255031n;
                    C7709ha haVar2 = null;
                    bVar.f256304a = i2 >= 0 ? Integer.valueOf(i2) : null;
                    int i3 = this.f255033p;
                    bVar.f256305b = i3 >= 0 ? Integer.valueOf(i3) : null;
                    bVar.f256306c = i3 >= 0 ? Integer.valueOf(i3) : null;
                    int i4 = this.f255032o;
                    bVar.f256307d = i4 >= 0 ? Integer.valueOf(i4) : null;
                    C7718hj hjVar3 = this.f255028k;
                    if (hjVar3 == null) {
                        haVar = null;
                    } else {
                        haVar = hjVar3.f26972m;
                        if (haVar == null) {
                            haVar = C7709ha.f26910f;
                        }
                    }
                    bVar.f256308e = haVar;
                    C7718hj hjVar4 = this.f255027j;
                    if (hjVar4 != null && (haVar2 = hjVar4.f26972m) == null) {
                        haVar2 = C7709ha.f26910f;
                    }
                    bVar.f256309f = haVar2;
                } else {
                    C91910h hVar = this.f255018a;
                    C7681g gVar2 = this.f255024g;
                    C7573c cVar = (C7573c) C7708h.f26894n.createBuilder();
                    cVar.copyOnWrite();
                    C7708h hVar2 = (C7708h) cVar.instance;
                    hVar2.f26897b = gVar2.f26835cv;
                    hVar2.f26896a |= 1;
                    gVar = hVar.mo86564a();
                    C91903a aVar = (C91903a) gVar;
                    aVar.f256281a = (C7708h) cVar.build();
                    aVar.f256285e = C7718hj.f26927af;
                }
                gVar.mo86547k(bVar.mo86554a());
                gVar.mo86548l(this.f255023f.mo85966a());
                this.f255023f.mo85967b(gVar.mo86537a());
            }
            C8178yk ykVar = this.f255030m;
            if (ykVar != null && (hjVar = this.f255026i) != null) {
                C57057b c = this.f255019b.mo86390c(hjVar, this.f255021d, this.f255022e);
                String b = this.f255020c.mo79727b();
                C91861c i5 = C91862d.m150515i(ykVar, 22);
                C91859a aVar2 = (C91859a) i5;
                aVar2.f256177b = b;
                aVar2.f256178c = c;
                i5.mo86371a().mo86383h();
            }
        }
    }
}

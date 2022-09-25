package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1297i;

import android.os.Build;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.C12393a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.C16462a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5195a.C66448c;
import com.google.speech.p5195a.C66449d;
import com.google.speech.p5195a.p5196a.C66421a;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5218j.C67048jc;
import com.google.speech.p5218j.C67085km;
import com.google.speech.p5224k.p5225a.C67230h;
import com.google.speech.p5224k.p5225a.C67231i;
import com.google.speech.p5224k.p5225a.C67239q;
import com.google.speech.p5224k.p5225a.C67240r;
import com.google.speech.p5224k.p5225a.C67242t;
import com.google.speech.p5224k.p5225a.C67243u;
import com.google.speech.p5224k.p5225a.C67244v;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.i.h */
/* compiled from: PG */
public final class C16590h extends C68247h {

    /* renamed from: a */
    private final C68283d f48638a;

    /* renamed from: c */
    private final C68283d f48639c;

    /* renamed from: d */
    private final C68283d f48640d;

    /* renamed from: e */
    private final C69464a f48641e;

    /* renamed from: f */
    private final C68283d f48642f;

    /* renamed from: g */
    private final C69464a f48643g;

    /* renamed from: h */
    private final C69464a f48644h;

    /* renamed from: i */
    private final C69464a f48645i;

    /* renamed from: j */
    private final C69464a f48646j;

    /* renamed from: k */
    private final C69464a f48647k;

    public C16590h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C69464a aVar3, C68283d dVar4, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8) {
        super(aVar2, new C68277d(C16590h.class), aVar);
        this.f48638a = C68236af.m98549d(dVar);
        this.f48639c = C68236af.m98549d(dVar2);
        this.f48640d = C68236af.m98549d(dVar3);
        this.f48641e = aVar3;
        this.f48642f = C68236af.m98549d(dVar4);
        this.f48643g = aVar4;
        this.f48644h = aVar5;
        this.f48645i = aVar6;
        this.f48646j = aVar7;
        this.f48647k = aVar8;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C12991i iVar = (C12991i) list.get(0);
        C12393a aVar = (C12393a) list.get(1);
        C15481g gVar = (C15481g) list.get(2);
        C69464a aVar2 = this.f48641e;
        List list2 = (List) list.get(3);
        C69464a aVar3 = this.f48643g;
        C69464a aVar4 = this.f48644h;
        C69464a aVar5 = this.f48645i;
        C69464a aVar6 = this.f48646j;
        C69464a aVar7 = this.f48647k;
        C67239q qVar = (C67239q) C67244v.f182771s.createBuilder();
        int intValue = ((Long) aVar7.mo17428b()).intValue();
        qVar.copyOnWrite();
        C67244v vVar = (C67244v) qVar.instance;
        vVar.f182774a |= 2;
        vVar.f182777d = intValue;
        qVar.copyOnWrite();
        C67244v vVar2 = (C67244v) qVar.instance;
        vVar2.f182774a |= 8;
        vVar2.f182779f = true;
        qVar.copyOnWrite();
        C67244v vVar3 = (C67244v) qVar.instance;
        vVar3.f182774a |= 33554432;
        vVar3.f182786m = true;
        if (!((Boolean) aVar4.mo17428b()).booleanValue()) {
            qVar.copyOnWrite();
            C67244v vVar4 = (C67244v) qVar.instance;
            vVar4.f182774a |= 64;
            vVar4.f182781h = true;
            qVar.copyOnWrite();
            C67244v vVar5 = (C67244v) qVar.instance;
            vVar5.f182774a |= 32;
            vVar5.f182780g = true;
        }
        qVar.copyOnWrite();
        C67244v vVar6 = (C67244v) qVar.instance;
        vVar6.f182774a |= C89885b.HTTP_VALUE;
        vVar6.f182785l = true;
        if (((Boolean) aVar2.mo17428b()).booleanValue()) {
            qVar.copyOnWrite();
            C67244v vVar7 = (C67244v) qVar.instance;
            vVar7.f182774a |= C89885b.S3REQUEST_VALUE;
            vVar7.f182784k = true;
            C66448c cVar = (C66448c) C66449d.f180680d.createBuilder();
            cVar.copyOnWrite();
            C66449d dVar = (C66449d) cVar.instance;
            dVar.f180682a |= 1;
            dVar.f180683b = 250;
            cVar.copyOnWrite();
            C66449d dVar2 = (C66449d) cVar.instance;
            dVar2.f180682a |= 2;
            dVar2.f180684c = 1;
            C66449d dVar3 = (C66449d) cVar.build();
            qVar.copyOnWrite();
            C67244v vVar8 = (C67244v) qVar.instance;
            dVar3.getClass();
            vVar8.f182778e = dVar3;
            vVar8.f182774a |= 4;
        }
        boolean booleanValue = ((Boolean) aVar3.mo17428b()).booleanValue();
        if (booleanValue) {
            qVar.copyOnWrite();
            C67244v vVar9 = (C67244v) qVar.instance;
            vVar9.f182775b |= 8;
            vVar9.f182789p = false;
        }
        if (((Boolean) aVar5.mo17428b()).booleanValue()) {
            qVar.copyOnWrite();
            C67244v vVar10 = (C67244v) qVar.instance;
            vVar10.f182775b |= 64;
            vVar10.f182790q = false;
        }
        if (aVar.mo20571a().mo56113h()) {
            C67242t tVar = C67242t.HOTWORD;
            C13901e eVar = (C13901e) aVar.mo20571a().mo56107c();
            C67230h hVar = (C67230h) C67231i.f182719l.createBuilder();
            if (!iVar.f40384c) {
                tVar = C67242t.HOTWORD_BARGE_IN_ERASED_PREAMBLE;
            } else if ((eVar.f42332a & 1) != 0) {
                tVar = C67242t.SEAMLESS_HOTWORD_BEEP;
                qVar.copyOnWrite();
                C67244v vVar11 = (C67244v) qVar.instance;
                vVar11.f182775b |= 8;
                vVar11.f182789p = true;
            }
            C67240r rVar = (C67240r) C67243u.f182767c.createBuilder();
            rVar.copyOnWrite();
            C67243u uVar = (C67243u) rVar.instance;
            uVar.f182770b = tVar.f182766u;
            uVar.f182769a |= 1;
            C67243u uVar2 = (C67243u) rVar.build();
            qVar.copyOnWrite();
            C67244v vVar12 = (C67244v) qVar.instance;
            uVar2.getClass();
            vVar12.f182787n = uVar2;
            vVar12.f182774a |= 536870912;
            if ((eVar.f42332a & 4) != 0) {
                C67048jc jcVar = ((C13901e) aVar.mo20571a().mo56107c()).f42335d;
                if (jcVar == null) {
                    jcVar = C67048jc.f182253h;
                }
                if ((jcVar.f182255a & 64) != 0) {
                    String str = jcVar.f182261g;
                    hVar.copyOnWrite();
                    C67231i iVar2 = (C67231i) hVar.instance;
                    str.getClass();
                    iVar2.f182721a |= 1;
                    iVar2.f182722b = str;
                }
                if ((jcVar.f182255a & 4) != 0) {
                    float f = jcVar.f182258d;
                    hVar.copyOnWrite();
                    C67231i iVar3 = (C67231i) hVar.instance;
                    iVar3.f182721a |= 2;
                    iVar3.f182723c = f;
                }
                if ((jcVar.f182255a & 8) != 0) {
                    boolean z = jcVar.f182259e;
                    hVar.copyOnWrite();
                    C67231i iVar4 = (C67231i) hVar.instance;
                    iVar4.f182721a |= 64;
                    iVar4.f182728h = z;
                }
                if ((jcVar.f182255a & 2) != 0) {
                    hVar.mo59779a(jcVar.f182257c);
                }
            }
            if ((eVar.f42332a & 64) != 0) {
                C67085km kmVar = eVar.f42339h;
                if (kmVar == null) {
                    kmVar = C67085km.f182360e;
                }
                if ((kmVar.f182362a & 1) != 0) {
                    boolean z2 = kmVar.f182363b;
                    hVar.copyOnWrite();
                    C67231i iVar5 = (C67231i) hVar.instance;
                    iVar5.f182721a |= 8192;
                    iVar5.f182729i = z2;
                }
                if ((kmVar.f182362a & 2) != 0) {
                    float f2 = kmVar.f182364c;
                    hVar.copyOnWrite();
                    C67231i iVar6 = (C67231i) hVar.instance;
                    iVar6.f182721a |= 16384;
                    iVar6.f182730j = f2;
                }
                if ((kmVar.f182362a & 4) != 0) {
                    int i = kmVar.f182365d;
                    hVar.copyOnWrite();
                    C67231i iVar7 = (C67231i) hVar.instance;
                    iVar7.f182721a |= 32768;
                    iVar7.f182731k = i;
                }
            }
            C67231i iVar8 = (C67231i) hVar.build();
            qVar.copyOnWrite();
            C67244v vVar13 = (C67244v) qVar.instance;
            iVar8.getClass();
            vVar13.f182788o = iVar8;
            vVar13.f182774a |= 1073741824;
        } else {
            if (booleanValue) {
                C67240r rVar2 = (C67240r) C67243u.f182767c.createBuilder();
                C67242t tVar2 = C67242t.NO_PREAMBLE;
                rVar2.copyOnWrite();
                C67243u uVar3 = (C67243u) rVar2.instance;
                uVar3.f182770b = tVar2.f182766u;
                uVar3.f182769a |= 1;
                qVar.copyOnWrite();
                C67244v vVar14 = (C67244v) qVar.instance;
                C67243u uVar4 = (C67243u) rVar2.build();
                uVar4.getClass();
                vVar14.f182787n = uVar4;
                vVar14.f182774a |= 536870912;
            }
            if (((Boolean) aVar6.mo17428b()).booleanValue()) {
                C67230h hVar2 = (C67230h) C67231i.f182719l.createBuilder();
                hVar2.mo59779a(Build.BRAND);
                C67231i iVar9 = (C67231i) hVar2.build();
                qVar.copyOnWrite();
                C67244v vVar15 = (C67244v) qVar.instance;
                iVar9.getClass();
                vVar15.f182788o = iVar9;
                vVar15.f182774a |= 1073741824;
            }
        }
        if (!list2.isEmpty()) {
            C66422b bVar = ((C67244v) qVar.instance).f182776c;
            if (bVar == null) {
                bVar = C66422b.f180605k;
            }
            C66421a aVar8 = (C66421a) bVar.toBuilder();
            Objects.requireNonNull(aVar8);
            Collection.EL.forEach(list2, new C16583a(aVar8));
            C66422b bVar2 = (C66422b) aVar8.build();
            qVar.copyOnWrite();
            C67244v vVar16 = (C67244v) qVar.instance;
            bVar2.getClass();
            vVar16.f182776c = bVar2;
            vVar16.f182774a |= 1;
        }
        if (booleanValue) {
            qVar.copyOnWrite();
            C67244v vVar17 = (C67244v) qVar.instance;
            vVar17.f182774a |= 1024;
            vVar17.f182782i = 0;
            qVar.copyOnWrite();
            C67244v vVar18 = (C67244v) qVar.instance;
            vVar18.f182775b |= 128;
            vVar18.f182791r = false;
        }
        gVar.mo22352b(C37179a.f97523bp);
        return C60856cj.m92900i(new C16462a(C58833ax.m90834k((C67244v) qVar.build()), C67244v.f182772t));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48638a.mo60297gq(), this.f48639c.mo60297gq(), this.f48640d.mo60297gq(), this.f48642f.mo60297gq());
    }
}

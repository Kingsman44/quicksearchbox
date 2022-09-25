package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6104b.p6105a;

import android.media.AudioManager;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5913am.p5915b.C74869a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a.C80531b;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a.C80532c;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a.C80533d;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a.C80534e;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a.C80536g;
import com.google.android.apps.gsa.nga.shared.p6339f.C81027b;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.C90731ao;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37918a;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37932e;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37933f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.b.a.e */
/* compiled from: PG */
public final class C77507e extends C79356f implements C74869a, C37918a {

    /* renamed from: a */
    public final C81027b f213566a;

    /* renamed from: b */
    private final AudioManager f213567b;

    /* renamed from: c */
    private final C37933f f213568c;

    /* renamed from: d */
    private final C81459h f213569d;

    /* renamed from: e */
    private C80536g f213570e = C80536g.f221076c;

    public C77507e(AudioManager audioManager, C79359i iVar, C37933f fVar, C81465n nVar, C81027b bVar, C22871g gVar) {
        super(iVar);
        this.f213567b = audioManager;
        this.f213568c = fVar;
        this.f213566a = bVar;
        this.f213569d = nVar.mo75095b(gVar, C77503a.f213562a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71137a(C75077bo boVar, C75077bo boVar2) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: d */
    public final synchronized void mo41152d(C37932e eVar) {
        C80536g gVar;
        C80536g gVar2 = this.f213570e;
        C58485gu guVar = (C58485gu) Collection.EL.stream(eVar.f100544a).filter(C77504b.f213563a).map(C77505c.f213564a).filter(new C77506d(this)).collect(C58370cn.f155946a);
        if (!guVar.isEmpty()) {
            C80534e eVar2 = (C80534e) C80536g.f221076c.createBuilder();
            C80532c cVar = (C80532c) C80533d.f221073b.createBuilder();
            cVar.copyOnWrite();
            C80533d dVar = (C80533d) cVar.instance;
            C62961ch chVar = dVar.f221075a;
            if (!chVar.mo58948c()) {
                dVar.f221075a = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) guVar, (List) dVar.f221075a);
            C80533d dVar2 = (C80533d) cVar.build();
            eVar2.copyOnWrite();
            C80536g gVar3 = (C80536g) eVar2.instance;
            dVar2.getClass();
            gVar3.f221079b = dVar2;
            gVar3.f221078a = 4;
            gVar = (C80536g) eVar2.build();
        } else {
            C80534e eVar3 = (C80534e) C80536g.f221076c.createBuilder();
            C80531b bVar = C80531b.f221071a;
            eVar3.copyOnWrite();
            C80536g gVar4 = (C80536g) eVar3.instance;
            bVar.getClass();
            gVar4.f221079b = bVar;
            gVar4.f221078a = 1;
            gVar = (C80536g) eVar3.build();
        }
        if (!gVar.equals(gVar2)) {
            this.f213570e = gVar;
            this.f213569d.mo75090a(gVar);
        }
    }

    /* renamed from: e */
    public final boolean mo71258e() {
        return !C90731ao.m148193c(this.f213567b);
    }

    /* renamed from: g */
    public final synchronized boolean mo71259g() {
        return this.f213570e.f221078a == 4;
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        this.f213568c.mo41156a(this);
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final synchronized C60870cx mo71203i() {
        this.f213568c.mo41157b(this);
        this.f213570e = C80536g.f221076c;
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "MicExclusiveCheckerImpl";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 39;
    }
}

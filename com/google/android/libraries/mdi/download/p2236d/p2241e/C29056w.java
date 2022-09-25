package com.google.android.libraries.mdi.download.p2236d.p2241e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.p2246f.C29404a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4566l.C60121am;
import com.google.common.p4552o.p4566l.C60122an;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.p4552o.p4566l.C60127as;
import com.google.common.p4552o.p4566l.C60128at;
import com.google.common.p4552o.p4566l.C60129au;
import com.google.common.p4552o.p4566l.C60130av;
import com.google.common.p4552o.p4566l.C60132ax;
import com.google.common.p4552o.p4566l.C60134az;
import com.google.common.p4552o.p4566l.C60136ba;
import com.google.common.p4552o.p4566l.C60137bb;
import com.google.common.p4552o.p4566l.C60138bc;
import com.google.common.p4552o.p4566l.C60139bd;
import com.google.common.p4552o.p4566l.C60146bk;
import com.google.common.p4552o.p4566l.C60147bl;
import com.google.common.p4552o.p4566l.C60152bq;
import com.google.common.p4552o.p4566l.C60153br;
import com.google.common.p4552o.p4566l.C60179cq;
import com.google.common.p4552o.p4566l.C60180cr;
import com.google.common.p4552o.p4566l.C60184cv;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.d.e.w */
/* compiled from: PG */
public final class C29056w implements C29037d {

    /* renamed from: a */
    public C58833ax f78861a = C58836b.f156633a;

    /* renamed from: b */
    private final Context f78862b;

    /* renamed from: c */
    private final String f78863c;

    /* renamed from: d */
    private final C28787cb f78864d;

    /* renamed from: e */
    private final C29044k f78865e;

    /* renamed from: f */
    private final C29404a f78866f;

    public C29056w(Context context, C29404a aVar, C29044k kVar, C28787cb cbVar) {
        this.f78862b = context;
        this.f78866f = aVar;
        this.f78863c = context.getPackageName();
        this.f78865e = kVar;
        this.f78864d = cbVar;
    }

    /* renamed from: n */
    private final C60870cx m53958n(int i, C60930r rVar, int i2) {
        C60870cx a = this.f78865e.mo34558a((long) i2, this.f78861a);
        C29048o oVar = new C29048o(this, rVar, i, i2);
        return C60922j.m93045h(a, C47810es.m84966f(oVar), C60826bg.f164896a);
    }

    /* renamed from: o */
    private final void m53959o(int i, C60129au auVar, long j) {
        C60179cq cqVar = (C60179cq) C60180cr.f162803f.createBuilder();
        cqVar.copyOnWrite();
        C60180cr crVar = (C60180cr) cqVar.instance;
        crVar.f162805a |= 1;
        crVar.f162806b = false;
        mo34559m(i, auVar, j, (C60180cr) cqVar.build());
    }

    /* renamed from: p */
    private final void m53960p(int i, C60129au auVar, long j) {
        C60870cx a = this.f78865e.mo34558a(j, this.f78861a);
        C29055v vVar = new C29055v(this, i, auVar, j);
        C60856cj.m92911t(a, C47810es.m84974n(vVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo34536a(C60930r rVar) {
        return m53958n(1046, new C29051r(rVar), this.f78864d.mo34428h());
    }

    /* renamed from: b */
    public final C60870cx mo34537b(C60930r rVar) {
        return m53958n(1058, new C29047n(rVar), this.f78864d.mo34432l());
    }

    /* renamed from: c */
    public final C60870cx mo34538c(C60930r rVar) {
        return m53958n(1057, new C29050q(rVar), this.f78864d.mo34435o());
    }

    /* renamed from: d */
    public final void mo34539d(C60132ax axVar) {
        long i = (long) this.f78864d.mo34429i();
        if (C29045l.m53929a(i)) {
            C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
            auVar.copyOnWrite();
            C60130av avVar = (C60130av) auVar.instance;
            axVar.getClass();
            avVar.f162649u = axVar;
            avVar.f162631c |= 4;
            m53959o(1075, auVar, i);
        }
    }

    /* renamed from: e */
    public final void mo34540e(C60126ar arVar, C60134az azVar) {
        C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
        auVar.copyOnWrite();
        C60130av avVar = (C60130av) auVar.instance;
        arVar.getClass();
        avVar.f162632d = arVar;
        avVar.f162629a |= 256;
        auVar.copyOnWrite();
        C60130av avVar2 = (C60130av) auVar.instance;
        azVar.getClass();
        avVar2.f162650v = azVar;
        avVar2.f162631c |= 8;
        m53960p(1082, auVar, (long) this.f78864d.mo34430j());
    }

    /* renamed from: f */
    public final void mo34541f(C60126ar arVar) {
        C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
        C60152bq bqVar = (C60152bq) C60153br.f162726c.createBuilder();
        bqVar.copyOnWrite();
        C60153br brVar = (C60153br) bqVar.instance;
        arVar.getClass();
        brVar.f162729b = arVar;
        brVar.f162728a |= 1;
        auVar.copyOnWrite();
        C60130av avVar = (C60130av) auVar.instance;
        C60153br brVar2 = (C60153br) bqVar.build();
        brVar2.getClass();
        avVar.f162647s = brVar2;
        avVar.f162631c |= 1;
        m53960p(1071, auVar, (long) this.f78864d.mo34430j());
    }

    /* renamed from: g */
    public final void mo34542g(int i, int i2) {
        m53959o(i, (C60129au) C60130av.f162627x.createBuilder(), (long) i2);
    }

    /* renamed from: h */
    public final void mo34543h(int i) {
        m53960p(i, (C60129au) C60130av.f162627x.createBuilder(), (long) this.f78864d.mo34430j());
    }

    /* renamed from: i */
    public final void mo34544i(int i, String str, int i2, long j, String str2) {
        C60125aq aqVar = (C60125aq) C60126ar.f162612j.createBuilder();
        aqVar.copyOnWrite();
        C60126ar arVar = (C60126ar) aqVar.instance;
        str.getClass();
        arVar.f162614a |= 1;
        arVar.f162615b = str;
        aqVar.copyOnWrite();
        C60126ar arVar2 = (C60126ar) aqVar.instance;
        arVar2.f162614a |= 2;
        arVar2.f162616c = i2;
        aqVar.copyOnWrite();
        C60126ar arVar3 = (C60126ar) aqVar.instance;
        arVar3.f162614a |= 64;
        arVar3.f162621h = j;
        aqVar.copyOnWrite();
        C60126ar arVar4 = (C60126ar) aqVar.instance;
        str2.getClass();
        arVar4.f162614a |= 128;
        arVar4.f162622i = str2;
        C60126ar arVar5 = (C60126ar) aqVar.build();
        C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
        auVar.copyOnWrite();
        C60130av avVar = (C60130av) auVar.instance;
        arVar5.getClass();
        avVar.f162632d = arVar5;
        avVar.f162629a |= 256;
        m53960p(i, auVar, (long) this.f78864d.mo34430j());
    }

    /* renamed from: j */
    public final void mo34545j(int i, int i2) {
        C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
        C60138bc bcVar = (C60138bc) C60139bd.f162679d.createBuilder();
        bcVar.copyOnWrite();
        C60139bd bdVar = (C60139bd) bcVar.instance;
        bdVar.f162681a |= 2;
        bdVar.f162683c = i2;
        bcVar.copyOnWrite();
        C60139bd bdVar2 = (C60139bd) bcVar.instance;
        bdVar2.f162682b = i - 2;
        bdVar2.f162681a |= 1;
        auVar.copyOnWrite();
        C60130av avVar = (C60130av) auVar.instance;
        C60139bd bdVar3 = (C60139bd) bcVar.build();
        bdVar3.getClass();
        avVar.f162642n = bdVar3;
        avVar.f162630b |= 32768;
        m53960p(1053, auVar, (long) this.f78864d.mo34430j());
    }

    /* renamed from: k */
    public final void mo34546k(int i, C60126ar arVar) {
        C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
        C60136ba baVar = (C60136ba) C60137bb.f162674d.createBuilder();
        baVar.copyOnWrite();
        C60137bb bbVar = (C60137bb) baVar.instance;
        bbVar.f162677b = C60184cv.m92533a(i);
        bbVar.f162676a |= 1;
        baVar.copyOnWrite();
        C60137bb bbVar2 = (C60137bb) baVar.instance;
        arVar.getClass();
        bbVar2.f162678c = arVar;
        bbVar2.f162676a |= 2;
        auVar.copyOnWrite();
        C60130av avVar = (C60130av) auVar.instance;
        C60137bb bbVar3 = (C60137bb) baVar.build();
        bbVar3.getClass();
        avVar.f162646r = bbVar3;
        avVar.f162630b |= LinearLayoutManager.INVALID_OFFSET;
        m53960p(1070, auVar, (long) this.f78864d.mo34430j());
    }

    /* renamed from: l */
    public final void mo34547l(C60126ar arVar, int i, long j, long j2, String str, int i2) {
        C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
        C60146bk bkVar = (C60146bk) C60147bl.f162705h.createBuilder();
        bkVar.copyOnWrite();
        C60147bl blVar = (C60147bl) bkVar.instance;
        arVar.getClass();
        blVar.f162708b = arVar;
        blVar.f162707a |= 1;
        bkVar.copyOnWrite();
        C60147bl blVar2 = (C60147bl) bkVar.instance;
        blVar2.f162709c = i - 2;
        blVar2.f162707a |= 2;
        bkVar.copyOnWrite();
        C60147bl blVar3 = (C60147bl) bkVar.instance;
        blVar3.f162707a |= 4;
        blVar3.f162710d = j;
        bkVar.copyOnWrite();
        C60147bl blVar4 = (C60147bl) bkVar.instance;
        blVar4.f162707a |= 8;
        blVar4.f162711e = j2;
        bkVar.copyOnWrite();
        C60147bl blVar5 = (C60147bl) bkVar.instance;
        str.getClass();
        blVar5.f162707a |= 16;
        blVar5.f162712f = str;
        bkVar.copyOnWrite();
        C60147bl blVar6 = (C60147bl) bkVar.instance;
        blVar6.f162707a |= 32;
        blVar6.f162713g = i2;
        auVar.copyOnWrite();
        C60130av avVar = (C60130av) auVar.instance;
        C60147bl blVar7 = (C60147bl) bkVar.build();
        blVar7.getClass();
        avVar.f162645q = blVar7;
        avVar.f162630b |= 4194304;
        m53960p(1068, auVar, (long) this.f78864d.mo34430j());
    }

    /* renamed from: m */
    public final void mo34559m(int i, C60129au auVar, long j, C60180cr crVar) {
        auVar.copyOnWrite();
        C60130av avVar = (C60130av) auVar.instance;
        C60130av avVar2 = C60130av.f162627x;
        avVar.f162629a |= 524288;
        avVar.f162634f = j;
        C60127as asVar = (C60127as) C60128at.f162623c.createBuilder();
        boolean z = this.f78862b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null;
        asVar.copyOnWrite();
        C60128at atVar = (C60128at) asVar.instance;
        atVar.f162625a |= 1;
        atVar.f162626b = z;
        auVar.copyOnWrite();
        C60130av avVar3 = (C60130av) auVar.instance;
        C60128at atVar2 = (C60128at) asVar.build();
        atVar2.getClass();
        avVar3.f162639k = atVar2;
        avVar3.f162630b |= 128;
        C60121am amVar = (C60121am) C60122an.f162600d.createBuilder();
        String str = this.f78863c;
        amVar.copyOnWrite();
        C60122an anVar = (C60122an) amVar.instance;
        str.getClass();
        anVar.f162602a |= 2;
        anVar.f162604c = str;
        amVar.copyOnWrite();
        C60122an anVar2 = (C60122an) amVar.instance;
        anVar2.f162602a = 1 | anVar2.f162602a;
        anVar2.f162603b = 427807852;
        auVar.copyOnWrite();
        C60130av avVar4 = (C60130av) auVar.instance;
        C60122an anVar3 = (C60122an) amVar.build();
        anVar3.getClass();
        avVar4.f162644p = anVar3;
        avVar4.f162630b |= 524288;
        auVar.copyOnWrite();
        C60130av avVar5 = (C60130av) auVar.instance;
        crVar.getClass();
        avVar5.f162635g = crVar;
        avVar5.f162629a |= 1048576;
        this.f78866f.mo34707a(auVar.build(), i - 2);
    }
}

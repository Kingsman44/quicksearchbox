package com.google.android.apps.search.googleapp.discover.channels.p10180a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.googleapp.discover.channels.C134124am;
import com.google.android.apps.search.googleapp.discover.channels.C134139ba;
import com.google.android.apps.search.googleapp.discover.channels.C134149bk;
import com.google.android.apps.search.googleapp.discover.channels.C134150bl;
import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134724d;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134757h;
import com.google.android.libraries.silk.p3205a.p3217f.C41720a;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4027c.p4028a.p4029a.C53822a;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56686b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56690f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56692h;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57060ab;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57110y;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57196b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57254bi;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57314do;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.a.d */
/* compiled from: PG */
public final class C134108d implements C41720a {

    /* renamed from: a */
    private final C134139ba f365308a;

    /* renamed from: b */
    private final C134124am f365309b;

    /* renamed from: c */
    private final Context f365310c;

    /* renamed from: d */
    private final C46723bg f365311d;

    /* renamed from: e */
    private final C134724d f365312e;

    /* renamed from: f */
    private final boolean f365313f;

    public C134108d(C134139ba baVar, C134124am amVar, Context context, C46723bg bgVar, C134724d dVar, boolean z) {
        this.f365308a = baVar;
        this.f365309b = amVar;
        this.f365310c = context;
        this.f365311d = bgVar;
        this.f365312e = dVar;
        this.f365313f = z;
    }

    /* renamed from: a */
    public final C60870cx mo44318a(C56686b bVar) {
        C134149bk bkVar = (C134149bk) C134150bl.f365436c.createBuilder();
        String str = bVar.f151308a;
        bkVar.copyOnWrite();
        C134150bl blVar = (C134150bl) bkVar.instance;
        str.getClass();
        blVar.f365438a |= 1;
        blVar.f365439b = str;
        return C47633f.m84733g(this.f365311d.mo50750c(this.f365308a.mo111577a((C134150bl) bkVar.build()), C46788de.DONT_CARE)).mo51516i(C134107c.f365307a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo44319b(C56690f fVar) {
        C53842b bVar;
        C57110y yVar = (C57110y) C57060ab.f152318h.createBuilder();
        C53822a aVar = (C53822a) C53842b.f141313k.createBuilder();
        String str = fVar.f151317a;
        aVar.copyOnWrite();
        str.getClass();
        ((C53842b) aVar.instance).f141318d = str;
        String str2 = fVar.f151318b;
        aVar.copyOnWrite();
        str2.getClass();
        ((C53842b) aVar.instance).f141317c = str2;
        C57314do doVar = (C57314do) C57315dp.f152986c.createBuilder();
        C62940bt btVar = C57196b.f152703b;
        C57196b bVar2 = fVar.f151320d;
        if (bVar2 == null) {
            bVar2 = C57196b.f152702a;
        }
        doVar.mo58885m(btVar, bVar2);
        aVar.copyOnWrite();
        C57315dp dpVar = (C57315dp) doVar.build();
        dpVar.getClass();
        ((C53842b) aVar.instance).f141321g = dpVar;
        yVar.copyOnWrite();
        C57060ab abVar = (C57060ab) yVar.instance;
        C53842b bVar3 = (C53842b) aVar.build();
        bVar3.getClass();
        abVar.f152322c = bVar3;
        abVar.f152321b = 3;
        int a = C57254bi.m88285a(fVar.f151319c);
        if (a == 0) {
            a = 1;
        }
        yVar.copyOnWrite();
        C57060ab abVar2 = (C57060ab) yVar.instance;
        abVar2.f152320a |= 16;
        abVar2.f152325f = a - 1;
        if (!fVar.f151321e.isEmpty()) {
            String str3 = fVar.f151321e;
            yVar.copyOnWrite();
            C57060ab abVar3 = (C57060ab) yVar.instance;
            str3.getClass();
            abVar3.f152320a |= 32;
            abVar3.f152326g = str3;
        }
        Intent a2 = this.f365309b.mo111575a((C57060ab) yVar.build());
        if (this.f365313f) {
            a2.putExtra("source", "and.gsa.tng.minus1");
        }
        C134724d dVar = this.f365312e;
        C57060ab abVar4 = (C57060ab) yVar.instance;
        if (abVar4.f152321b == 3) {
            bVar = (C53842b) abVar4.f152322c;
        } else {
            bVar = C53842b.f141313k;
        }
        C57315dp dpVar2 = bVar.f141321g;
        if (dpVar2 == null) {
            dpVar2 = C57315dp.f152986c;
        }
        dVar.mo111914b(new C134757h(dpVar2, C134699b.CHANNEL));
        C47810es.m84979s(this.f365310c, a2);
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo44320c(C56692h hVar) {
        C134149bk bkVar = (C134149bk) C134150bl.f365436c.createBuilder();
        String str = hVar.f151325a;
        bkVar.copyOnWrite();
        C134150bl blVar = (C134150bl) bkVar.instance;
        str.getClass();
        blVar.f365438a |= 1;
        blVar.f365439b = str;
        C134150bl blVar2 = (C134150bl) bkVar.build();
        if (hVar.f151326b) {
            return C47633f.m84733g(this.f365308a.mo111578b(blVar2));
        }
        return C47633f.m84733g(this.f365308a.mo111579c(blVar2));
    }
}

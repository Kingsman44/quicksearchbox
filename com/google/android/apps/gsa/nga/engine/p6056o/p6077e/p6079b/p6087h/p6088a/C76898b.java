package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p5913am.p5926l.p5927a.C74927h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80392e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80316bk;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80317bl;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80348e;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.h.a.b */
/* compiled from: PG */
public final /* synthetic */ class C76898b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76899c f212353a;

    /* renamed from: b */
    public final /* synthetic */ Optional f212354b;

    public /* synthetic */ C76898b(C76899c cVar, Optional optional) {
        this.f212353a = cVar;
        this.f212354b = optional;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76899c cVar = this.f212353a;
        Optional optional = this.f212354b;
        if (!((Boolean) obj).booleanValue()) {
            return C80401n.f220656k;
        }
        C18100a aVar = (C18100a) optional.get();
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C80392e eVar = (C80392e) C80394g.f220645c.createBuilder();
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        Optional empty = Optional.empty();
        Optional empty2 = Optional.empty();
        Optional empty3 = Optional.empty();
        C80316bk bkVar = (C80316bk) C80317bl.f220400f.createBuilder();
        String d = aVar.mo23590d();
        bkVar.copyOnWrite();
        d.getClass();
        ((C80317bl) bkVar.instance).f220402a = d;
        C80348e b = C74927h.m121138b(aVar.f51574a);
        bkVar.copyOnWrite();
        b.getClass();
        ((C80317bl) bkVar.instance).f220403b = b;
        String str = (String) empty.orElse(BuildConfig.FLAVOR);
        bkVar.copyOnWrite();
        str.getClass();
        ((C80317bl) bkVar.instance).f220404c = str;
        String str2 = (String) empty2.orElse(BuildConfig.FLAVOR);
        bkVar.copyOnWrite();
        str2.getClass();
        ((C80317bl) bkVar.instance).f220405d = str2;
        int intValue = ((Integer) empty3.orElse(0)).intValue();
        bkVar.copyOnWrite();
        ((C80317bl) bkVar.instance).f220406e = intValue;
        C80317bl blVar = (C80317bl) bkVar.build();
        aoVar.copyOnWrite();
        C80295aq aqVar = (C80295aq) aoVar.instance;
        blVar.getClass();
        aqVar.f220360b = blVar;
        aqVar.f220359a = 10;
        eVar.copyOnWrite();
        C80394g gVar = (C80394g) eVar.instance;
        C80295aq aqVar2 = (C80295aq) aoVar.build();
        aqVar2.getClass();
        gVar.f220648b = aqVar2;
        gVar.f220647a = 2;
        lVar.mo74317i(eVar);
        C58485gu c = cVar.mo72332c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            lVar.mo74319k(((Integer) c.get(i)).intValue());
        }
        return (C80401n) lVar.build();
    }
}

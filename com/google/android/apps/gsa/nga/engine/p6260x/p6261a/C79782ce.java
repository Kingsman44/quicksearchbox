package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew;
import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aen;
import com.google.common.p4552o.aex;
import com.google.common.p4552o.agh;
import com.google.common.p4552o.ahg;
import com.google.speech.p5218j.C66911ea;
import com.google.speech.p5218j.C66913ec;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.ce */
/* compiled from: PG */
final class C79782ce {

    /* renamed from: a */
    String f218725a;

    /* renamed from: b */
    String f218726b;

    /* renamed from: c */
    final aen f218727c = ((aen) ahg.f158704D.createBuilder());

    /* renamed from: d */
    C19087s f218728d = ((C19087s) C19088t.f53533p.createBuilder());

    /* renamed from: e */
    final C60320od f218729e = ((C60320od) C60321oe.f163224i.createBuilder());

    /* renamed from: f */
    final C66911ea f218730f = ((C66911ea) C66913ec.f181884n.createBuilder());

    /* renamed from: g */
    long f218731g = 0;

    /* renamed from: h */
    long f218732h = 0;

    /* renamed from: i */
    long f218733i = 0;

    /* renamed from: j */
    int f218734j = 0;

    /* renamed from: k */
    String f218735k = BuildConfig.FLAVOR;

    /* renamed from: l */
    C82907ew f218736l = null;

    /* renamed from: m */
    final Map f218737m = new HashMap();

    public C79782ce(String str) {
        this.f218725a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aex mo74226a(C82889ee eeVar) {
        C83320io ioVar = eeVar.f226102g;
        if (ioVar == null) {
            ioVar = C83320io.f227132d;
        }
        String str = ioVar.f227135b;
        aex aex = (aex) this.f218737m.get(str);
        if (aex != null) {
            return aex;
        }
        aex aex2 = (aex) agh.f158629l.createBuilder();
        aex2.copyOnWrite();
        agh agh = (agh) aex2.instance;
        str.getClass();
        agh.f158631a |= 1;
        agh.f158632b = str;
        this.f218737m.put(str, aex2);
        return aex2;
    }
}

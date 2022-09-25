package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80310be;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80311bf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80312bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80315bj;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.s */
/* compiled from: PG */
public final /* synthetic */ class C76975s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76976t f212494a;

    /* renamed from: b */
    public final /* synthetic */ C80399l f212495b;

    public /* synthetic */ C76975s(C76976t tVar, C80399l lVar) {
        this.f212494a = tVar;
        this.f212495b = lVar;
    }

    public final void accept(Object obj) {
        C76976t tVar = this.f212494a;
        C80399l lVar = this.f212495b;
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        C80310be beVar = (C80310be) C80315bj.f220396c.createBuilder();
        C80311bf bfVar = (C80311bf) C80312bg.f220391b.createBuilder();
        String uri = ((Uri) obj).toString();
        bfVar.copyOnWrite();
        uri.getClass();
        ((C80312bg) bfVar.instance).f220393a = uri;
        beVar.copyOnWrite();
        C80315bj bjVar = (C80315bj) beVar.instance;
        C80312bg bgVar = (C80312bg) bfVar.build();
        bgVar.getClass();
        bjVar.f220399b = bgVar;
        bjVar.f220398a = 2;
        C80315bj bjVar2 = (C80315bj) beVar.build();
        aoVar.copyOnWrite();
        C80295aq aqVar = (C80295aq) aoVar.instance;
        bjVar2.getClass();
        aqVar.f220360b = bjVar2;
        aqVar.f220359a = 12;
        C81442m.m129555q(lVar, aoVar);
        C81442m.m129557s(lVar, t.r(tVar.f212496a.getString(R.string.nga_screenshot_deleted)));
        lVar.mo74319k(23108);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

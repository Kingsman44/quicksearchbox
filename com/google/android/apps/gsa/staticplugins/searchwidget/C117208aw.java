package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60459qv;
import com.google.common.p4552o.C60460qw;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.aw */
/* compiled from: PG */
public final /* synthetic */ class C117208aw implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C60548tz f325371a;

    /* renamed from: b */
    public final /* synthetic */ C60459qv f325372b;

    public /* synthetic */ C117208aw(C60548tz tzVar, C60459qv qvVar) {
        this.f325371a = tzVar;
        this.f325372b = qvVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C60548tz tzVar = this.f325371a;
        C60459qv qvVar = this.f325372b;
        ((C59052c) ((C59052c) ((C59052c) C117233ba.f325424a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(32741)).mo56386p("Unable to load Search Widget Disabled Timestamp.");
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        C60460qw qwVar = (C60460qw) qvVar.build();
        C60555uf ufVar2 = C60555uf.f164065cO;
        qwVar.getClass();
        ufVar.f164139at = qwVar;
        ufVar.f164249d |= C89885b.S3REQUEST_VALUE;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}

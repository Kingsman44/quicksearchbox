package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6995aq.C89261d;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60459qv;
import com.google.common.p4552o.C60460qw;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.av */
/* compiled from: PG */
public final /* synthetic */ class C117207av implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C60459qv f325369a;

    /* renamed from: b */
    public final /* synthetic */ C60548tz f325370b;

    public /* synthetic */ C117207av(C60459qv qvVar, C60548tz tzVar) {
        this.f325369a = qvVar;
        this.f325370b = tzVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C60459qv qvVar = this.f325369a;
        C60548tz tzVar = this.f325370b;
        C89261d dVar = (C89261d) obj;
        if ((dVar.f242035a & 1) != 0) {
            long j = dVar.f242036b;
            qvVar.copyOnWrite();
            C60460qw qwVar = (C60460qw) qvVar.instance;
            C60460qw qwVar2 = C60460qw.f163615i;
            qwVar.f163617a |= 64;
            qwVar.f163623g = j;
        }
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        C60460qw qwVar3 = (C60460qw) qvVar.build();
        C60555uf ufVar2 = C60555uf.f164065cO;
        qwVar3.getClass();
        ufVar.f164139at = qwVar3;
        ufVar.f164249d |= C89885b.S3REQUEST_VALUE;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}

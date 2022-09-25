package com.google.android.apps.gsa.staticplugins.chime.p7656a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91660i;
import com.google.android.apps.gsa.staticplugins.chime.C97735q;
import com.google.android.apps.gsa.staticplugins.chime.p7658c.C97671b;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56973i;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57000j;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.a.f */
/* compiled from: PG */
public final class C97649f implements C97645b {

    /* renamed from: a */
    private static final C59071e f272727a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.a.f");

    /* renamed from: b */
    private final C91660i f272728b;

    /* renamed from: c */
    private final C97671b f272729c;

    /* renamed from: d */
    private final Context f272730d;

    /* renamed from: e */
    private final C84486a f272731e;

    public C97649f(Context context, C91660i iVar, C84486a aVar, Map map) {
        this.f272730d = context;
        this.f272728b = iVar;
        this.f272731e = aVar;
        this.f272729c = (C97671b) map.get(C56973i.SEARCH_ACTION);
    }

    /* renamed from: a */
    public final void mo90782a(C29827r rVar, C56975k kVar, boolean z) {
        if (!this.f272731e.mo78207n()) {
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.SEARCH_FROM_NOTIFICATION_START;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            String d = C97735q.m162007d(rVar);
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            d.getClass();
            cbVar.f160123d |= C89885b.NOW_VALUE;
            cbVar.f160116ba = d;
            C57000j jVar = C97735q.m162005b(rVar).f152041d;
            if (jVar == null) {
                jVar = C57000j.f152155i;
            }
            C60220t tVar = jVar.f152159c;
            if (tVar == null) {
                tVar = C60220t.f162931e;
            }
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            tVar.getClass();
            cbVar2.f160088aZ = tVar;
            cbVar2.f160123d |= 1048576;
            fVar.f246203c = (C59687cb) ajVar.build();
            this.f272728b.mo86068a(C89851ag.SEARCH_FROM_NOTIFICATION, fVar.mo83699a(), C89849ae.SEARCH_FROM_NOTIFICATION_TIMEOUT);
        }
        if (z) {
            if (Build.VERSION.SDK_INT < 31) {
                this.f272730d.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
            C97671b bVar = this.f272729c;
            if (bVar == null) {
                ((C59052c) ((C59052c) f272727a.mo56226d()).mo56372aa(18969)).mo56386p("Attempted to handle SearchAction, but there is no intent provider.");
            } else {
                this.f272730d.startActivity(bVar.mo90789a(rVar, kVar));
            }
        }
    }
}

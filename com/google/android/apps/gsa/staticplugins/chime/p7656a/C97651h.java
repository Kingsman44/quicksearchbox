package com.google.android.apps.gsa.staticplugins.chime.p7656a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e;
import com.google.android.apps.gsa.staticplugins.chime.C97735q;
import com.google.android.apps.gsa.staticplugins.chime.p7658c.C97671b;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56973i;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57000j;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.a.h */
/* compiled from: PG */
public final class C97651h implements C97645b {

    /* renamed from: a */
    private static final C59071e f272732a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.a.h");

    /* renamed from: b */
    private final Context f272733b;

    /* renamed from: c */
    private final C91656e f272734c;

    /* renamed from: d */
    private final C89859i f272735d;

    /* renamed from: e */
    private final C68214a f272736e;

    /* renamed from: f */
    private final C97671b f272737f;

    public C97651h(Context context, C91656e eVar, C89859i iVar, C68214a aVar, Map map) {
        this.f272733b = context;
        this.f272734c = eVar;
        this.f272735d = iVar;
        this.f272736e = aVar;
        this.f272737f = (C97671b) map.get(C56973i.DISCOVER_PINNED_CONTENT_ACTION);
    }

    /* renamed from: a */
    public final void mo90782a(C29827r rVar, C56975k kVar, boolean z) {
        if (kVar.f152093b != 9) {
            C59104x d = f272732a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DiscoverPinnedContent");
            ((C59052c) ((C59052c) d).mo56372aa(18971)).mo56386p("Attempted to handle DiscoverPinnedContentAction, but the action doesn't exist.");
            int i = C90755l.f253831a;
        } else if (this.f272737f == null) {
            C59104x d2 = f272732a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "DiscoverPinnedContent");
            ((C59052c) ((C59052c) d2).mo56372aa(18970)).mo56386p("Attempted to handle DiscoverPinnedContentAction, but thei intentProvider is null.");
            int i2 = C90755l.f253831a;
        } else {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            String d3 = C97735q.m162007d(rVar);
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            d3.getClass();
            cbVar.f160123d |= C89885b.NOW_VALUE;
            cbVar.f160116ba = d3;
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
            C59687cb cbVar3 = (C59687cb) ajVar.build();
            if (((C84486a) this.f272736e.mo27525b()).mo78205l()) {
                C89856f fVar = new C89856f();
                fVar.f246201a = C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START;
                fVar.f246203c = cbVar3;
                this.f272735d.mo74236a(fVar.mo83699a());
            } else {
                this.f272734c.mo86046k(cbVar3);
            }
            if (z) {
                this.f272733b.startActivity(this.f272737f.mo90789a(rVar, kVar));
            }
        }
    }
}

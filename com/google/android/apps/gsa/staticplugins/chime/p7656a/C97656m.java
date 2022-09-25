package com.google.android.apps.gsa.staticplugins.chime.p7656a;

import android.content.Context;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.p6974ae.C89100i;
import com.google.android.apps.gsa.shared.p6974ae.C89101j;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91660i;
import com.google.android.apps.gsa.sidekick.shared.p7242k.C91754b;
import com.google.android.apps.gsa.staticplugins.chime.C97735q;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7682ga;
import com.google.p375ai.p378b.C7973qv;
import com.google.p4283bv.p4345d.C57041t;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56968d;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57000j;
import com.google.p4283bv.p4354e.p4356b.C57052a;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.a.m */
/* compiled from: PG */
final class C97656m implements C97645b {

    /* renamed from: a */
    private static final C59071e f272740a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.a.m");

    /* renamed from: b */
    private final Context f272741b;

    /* renamed from: c */
    private final C91660i f272742c;

    /* renamed from: d */
    private final C90021c f272743d;

    public C97656m(Context context, C91660i iVar, C90021c cVar) {
        this.f272741b = context;
        this.f272742c = iVar;
        this.f272743d = cVar;
    }

    /* renamed from: a */
    public final void mo90782a(C29827r rVar, C56975k kVar, boolean z) {
        C63088z zVar;
        C89100i iVar;
        try {
            if (kVar.f152093b == 6) {
                zVar = (C63088z) kVar.f152094c;
            } else {
                zVar = C63088z.f170246b;
            }
            C89101j jVar = (C89101j) C62942bv.parseFrom((C62942bv) C89101j.f241530c, zVar, C62921ba.m95368a());
            int i = jVar.f241532a;
            int i2 = i != 0 ? i != 1 ? 0 : 1 : 2;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                Context context = this.f272741b;
                if (i == 1) {
                    iVar = (C89100i) jVar.f241533b;
                } else {
                    iVar = C89100i.f241524c;
                }
                C89856f fVar = new C89856f();
                fVar.f246201a = C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START;
                if (rVar.mo35054c() != null) {
                    C56968d b = C97735q.m162005b(rVar);
                    C57000j jVar2 = b.f152041d;
                    if (jVar2 == null) {
                        jVar2 = C57000j.f152155i;
                    }
                    if ((jVar2.f152157a & 2) != 0) {
                        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                        C57000j jVar3 = b.f152041d;
                        if (jVar3 == null) {
                            jVar3 = C57000j.f152155i;
                        }
                        C60220t tVar = jVar3.f152159c;
                        if (tVar == null) {
                            tVar = C60220t.f162931e;
                        }
                        ajVar.copyOnWrite();
                        C59687cb cbVar = (C59687cb) ajVar.instance;
                        tVar.getClass();
                        cbVar.f160088aZ = tVar;
                        cbVar.f160123d |= 1048576;
                        fVar.f246203c = (C59687cb) ajVar.build();
                    }
                }
                this.f272742c.mo86068a(C89851ag.NOW_FEED_LAUNCH_FROM_NOTIFICATION, fVar.mo83699a(), C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_TIMEOUT);
                C91754b bVar = new C91754b(context);
                bVar.f255887k = true;
                bVar.f255880d = 0;
                C7669fo foVar = iVar.f241526a;
                if (foVar == null) {
                    foVar = C7669fo.f26633e;
                }
                bVar.f255889m = foVar;
                C7682ga gaVar = iVar.f241527b;
                if (gaVar == null) {
                    gaVar = C7682ga.f26836d;
                }
                C56968d b2 = C97735q.m162005b(rVar);
                C57000j jVar4 = b2.f152041d;
                if (jVar4 == null) {
                    jVar4 = C57000j.f152155i;
                }
                C57057b bVar2 = jVar4.f152164h;
                if (bVar2 == null) {
                    bVar2 = C57057b.f152311e;
                }
                C57052a aVar = (C57052a) bVar2.toBuilder();
                C57000j jVar5 = b2.f152041d;
                if (jVar5 == null) {
                    jVar5 = C57000j.f152155i;
                }
                C7669fo foVar2 = jVar5.f152158b;
                if (foVar2 == null) {
                    foVar2 = C7669fo.f26633e;
                }
                aVar.copyOnWrite();
                C57057b bVar3 = (C57057b) aVar.instance;
                foVar2.getClass();
                bVar3.f152314b = foVar2;
                bVar3.f152313a = 1 | bVar3.f152313a;
                if (this.f272743d.mo79746e(C90010bp.f246945aN)) {
                    C57000j jVar6 = b2.f152041d;
                    if (jVar6 == null) {
                        jVar6 = C57000j.f152155i;
                    }
                    C57041t tVar2 = jVar6.f152160d;
                    if (tVar2 == null) {
                        tVar2 = C57041t.f152278e;
                    }
                    C7973qv qvVar = tVar2.f152282c;
                    if (qvVar == null) {
                        qvVar = C7973qv.f28001c;
                    }
                    aVar.copyOnWrite();
                    C57057b bVar4 = (C57057b) aVar.instance;
                    qvVar.getClass();
                    bVar4.f152315c = qvVar;
                    bVar4.f152313a |= 2;
                }
                bVar.f255884h = gaVar;
                bVar.f255885i = (C57057b) aVar.build();
                context.startActivity(bVar.mo86242a());
            } else if (i3 == 1) {
                C59104x d = f272740a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OpaqueNotiActionHandler");
                ((C59052c) ((C59052c) d).mo56372aa(18974)).mo56386p("There was no action present.");
                int i4 = C90755l.f253831a;
            }
        } catch (C62974ct unused) {
            C59104x d2 = f272740a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "OpaqueNotiActionHandler");
            ((C59052c) ((C59052c) d2).mo56372aa(18973)).mo56386p("Proto did not parse.");
            int i5 = C90755l.f253831a;
        }
    }
}

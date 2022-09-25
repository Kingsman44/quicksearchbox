package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.p9446a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.dictation.h;
import com.google.android.apps.gsa.nga.engine.dictation.i;
import com.google.android.apps.gsa.nga.engine.dictation.k;
import com.google.android.apps.gsa.nga.engine.dictation.l;
import com.google.android.apps.gsa.nga.engine.dictation.n;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125141do;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125037c;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125038d;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125521a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125751p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.C125723b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9481b.C126319a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58880cq;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.a.g */
/* compiled from: PG */
public final /* synthetic */ class C125719g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125721i f346497a;

    /* renamed from: b */
    public final /* synthetic */ String f346498b;

    /* renamed from: c */
    public final /* synthetic */ List f346499c;

    public /* synthetic */ C125719g(C125721i iVar, String str, List list) {
        this.f346497a = iVar;
        this.f346498b = str;
        this.f346499c = list;
    }

    public final C60870cx apply(Object obj) {
        C125721i iVar = this.f346497a;
        String str = this.f346498b;
        List list = this.f346499c;
        k createBuilder = l.d.createBuilder();
        createBuilder.copyOnWrite();
        str.getClass();
        createBuilder.instance.a = str;
        boolean b = iVar.f346506f.mo107181b(iVar.f346503c);
        createBuilder.copyOnWrite();
        createBuilder.instance.b = b;
        boolean a = iVar.f346506f.mo107180a(iVar.f346503c);
        createBuilder.copyOnWrite();
        createBuilder.instance.c = a;
        n a2 = ((C125723b) obj).mo107091a(createBuilder.build());
        h hVar = h.a;
        i iVar2 = a2.a;
        if (iVar2 == null) {
            iVar2 = i.g;
        }
        h a3 = h.a(iVar2.a);
        if (a3 == null) {
            a3 = h.f;
        }
        int ordinal = a3.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i iVar3 = a2.a;
                String str2 = (iVar3 == null ? i.g : iVar3).d;
                if (iVar3 == null) {
                    iVar3 = i.g;
                }
                int i = iVar3.b;
                Optional findAny = Collection.EL.stream(C125721i.m205704b(list)).filter(new C125715c(str2)).findAny();
                if (findAny.isPresent()) {
                    C58485gu o = C58485gu.m89847o(C126319a.m206548c(C58880cq.m90966b(((C125040f) findAny.get()).f344979a, i)), C125721i.m205703a(((C125040f) findAny.get()).f344979a, str2, C58485gu.m89845m(), h.b, true, true));
                    C125037c cVar = (C125037c) C125038d.f344972d.createBuilder();
                    h hVar2 = h.b;
                    cVar.copyOnWrite();
                    ((C125038d) cVar.instance).f344974a = hVar2.getNumber();
                    cVar.copyOnWrite();
                    ((C125038d) cVar.instance).f344975b = true;
                    cVar.copyOnWrite();
                    ((C125038d) cVar.instance).f344976c = true;
                    return C60856cj.m92900i(new C125751p(C125034a.TRIGGER_VOICE, o, new C125521a((C125038d) cVar.build())));
                }
                return C60922j.m93044g(iVar.f346505e.mo107219a(str2), C47810es.m84963c(new C125716d(i, str2)), iVar.f346508h);
            } else if (ordinal == 2) {
                i iVar4 = a2.a;
                if (iVar4 == null) {
                    iVar4 = i.g;
                }
                int i2 = iVar4.c;
                C58485gu b2 = C125721i.m205704b(list);
                if (i2 > b2.size()) {
                    return C60856cj.m92900i(new C125751p(C125034a.TRIGGER_VOICE, C58485gu.m89845m(), C125721i.f346502b));
                }
                C125040f fVar = (C125040f) b2.get(i2 - 1);
                C125143dq dqVar = fVar.f344982d;
                if (dqVar == null) {
                    dqVar = C125143dq.f345221c;
                }
                C125141do doVar = dqVar.f345224b;
                if (doVar == null) {
                    doVar = C125141do.f345217c;
                }
                C58485gu o2 = C58485gu.m89847o(C126319a.m206548c(fVar.f344979a), C125721i.m205703a(fVar.f344979a, doVar.f345219a, C58485gu.m89845m(), h.c, true, fVar.f344981c));
                C125037c cVar2 = (C125037c) C125038d.f344972d.createBuilder();
                h hVar3 = h.c;
                cVar2.copyOnWrite();
                ((C125038d) cVar2.instance).f344974a = hVar3.getNumber();
                boolean z = fVar.f344981c;
                cVar2.copyOnWrite();
                ((C125038d) cVar2.instance).f344975b = z;
                cVar2.copyOnWrite();
                ((C125038d) cVar2.instance).f344976c = true;
                return C60856cj.m92900i(new C125751p(C125034a.TRIGGER_VOICE, o2, new C125521a((C125038d) cVar2.build())));
            } else if (ordinal == 3) {
                i iVar5 = a2.a;
                String str3 = (iVar5 == null ? i.g : iVar5).e;
                if (iVar5 == null) {
                    iVar5 = i.g;
                }
                C58485gu o3 = C58485gu.m89847o(C126319a.m206548c(C58880cq.m90966b(str3, iVar5.b)), C125721i.m205703a(str3, BuildConfig.FLAVOR, C58485gu.m89845m(), h.d, false, false));
                C125037c cVar3 = (C125037c) C125038d.f344972d.createBuilder();
                h hVar4 = h.d;
                cVar3.copyOnWrite();
                ((C125038d) cVar3.instance).f344974a = hVar4.getNumber();
                cVar3.copyOnWrite();
                ((C125038d) cVar3.instance).f344975b = false;
                cVar3.copyOnWrite();
                ((C125038d) cVar3.instance).f344976c = false;
                return C60856cj.m92900i(new C125751p(C125034a.TRIGGER_VOICE, o3, new C125521a((C125038d) cVar3.build())));
            } else if (ordinal == 4) {
                i iVar6 = a2.a;
                String str4 = (iVar6 == null ? i.g : iVar6).f;
                if (iVar6 == null) {
                    iVar6 = i.g;
                }
                return C60922j.m93044g(iVar.f346505e.mo107221c(str4), C47810es.m84963c(new C125718f(iVar6.b)), iVar.f346508h);
            } else if (ordinal != 5) {
                return C60856cj.m92900i(new C125751p(C125034a.TRIGGER_VOICE, C58485gu.m89845m(), C125721i.f346502b));
            }
        }
        return C60856cj.m92900i(new C125751p(C125034a.TRIGGER_VOICE, C58485gu.m89845m(), C125721i.f346502b));
    }
}

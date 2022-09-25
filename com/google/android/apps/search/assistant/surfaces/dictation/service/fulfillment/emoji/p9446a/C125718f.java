package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.p9446a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.dictation.h;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125147du;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125037c;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125038d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125521a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125751p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9481b.C126319a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58880cq;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.a.f */
/* compiled from: PG */
public final /* synthetic */ class C125718f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f346496a;

    public /* synthetic */ C125718f(int i) {
        this.f346496a = i;
    }

    public final Object apply(Object obj) {
        List list;
        int i = this.f346496a;
        C125147du duVar = (C125147du) obj;
        C59071e eVar = C125721i.f346501a;
        if (duVar.f345230a.isEmpty()) {
            return new C125751p(C125034a.TRIGGER_VOICE, C58485gu.m89845m(), C125721i.f346502b);
        }
        String str = (String) duVar.f345230a.get(0);
        if (duVar.f345230a.size() > 1) {
            C62971cq cqVar = duVar.f345230a;
            list = cqVar.subList(1, cqVar.size());
        } else {
            list = C58485gu.m89845m();
        }
        C58485gu o = C58485gu.m89847o(C126319a.m206548c(C58880cq.m90966b(str, i)), C125721i.m205703a(str, BuildConfig.FLAVOR, list, h.e, false, false));
        C125037c cVar = (C125037c) C125038d.f344972d.createBuilder();
        h hVar = h.e;
        cVar.copyOnWrite();
        ((C125038d) cVar.instance).f344974a = hVar.getNumber();
        cVar.copyOnWrite();
        ((C125038d) cVar.instance).f344975b = false;
        cVar.copyOnWrite();
        ((C125038d) cVar.instance).f344976c = false;
        return new C125751p(C125034a.TRIGGER_VOICE, o, new C125521a((C125038d) cVar.build()));
    }
}

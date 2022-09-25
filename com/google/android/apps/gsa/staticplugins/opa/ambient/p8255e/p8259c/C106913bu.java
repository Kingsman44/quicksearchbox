package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.libraries.p1635au.C19567d;
import com.google.assistant.p3886c.C50690ab;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bu */
/* compiled from: PG */
public final /* synthetic */ class C106913bu implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106878am f297820a;

    public /* synthetic */ C106913bu(C106878am amVar) {
        this.f297820a = amVar;
    }

    public final Object apply(Object obj) {
        int length;
        C106878am amVar = this.f297820a;
        C58485gu guVar = (C58485gu) obj;
        ((C58970a) ((C58970a) amVar.f297775c.mo56224b()).mo56372aa(23370)).mo56386p("#dedupFirstItems");
        IdentityHashMap identityHashMap = new IdentityHashMap();
        IdentityHashMap identityHashMap2 = (IdentityHashMap) Collection.EL.stream(guVar).collect(Collector.CC.m71775of(C106875aj.f297770a, new C106876ak(amVar), C106877al.f297772a, new Collector.Characteristics[0]));
        if (identityHashMap2.size() < 2) {
            ((C58970a) ((C58970a) amVar.f297775c.mo56226d()).mo56372aa(23375)).mo56386p("Too few media items with image content.");
        } else {
            for (int i = 0; i < guVar.size() - 1; i++) {
                C106868ac acVar = (C106868ac) guVar.get(i);
                if (identityHashMap.containsKey(acVar)) {
                    acVar.mo95708i();
                } else {
                    Bitmap bitmap = (Bitmap) identityHashMap2.get(acVar);
                    for (int i2 = i + 1; i2 < guVar.size(); i2++) {
                        C106868ac acVar2 = (C106868ac) guVar.get(i2);
                        Bitmap bitmap2 = (Bitmap) identityHashMap2.get(acVar2);
                        if (!(bitmap == null || bitmap2 == null)) {
                            byte[] a = C106878am.m177637a(bitmap);
                            byte[] a2 = C106878am.m177637a(bitmap2);
                            float f = 0.0f;
                            int i3 = 0;
                            while (true) {
                                length = a.length;
                                if (i3 >= length) {
                                    break;
                                }
                                int i4 = a[i3] - a2[i3];
                                f += (float) (i4 * i4);
                                i3++;
                            }
                            if (f / ((float) length) < 1000.0f) {
                                acVar.mo95708i();
                                acVar2.mo95708i();
                                List list = (List) identityHashMap.get(acVar);
                                if (list == null) {
                                    identityHashMap.put(acVar, new ArrayList(Collections.singletonList(acVar2)));
                                } else {
                                    list.add(acVar2);
                                }
                                identityHashMap.put(acVar2, new ArrayList());
                            } else {
                                acVar.mo95708i();
                                acVar2.mo95708i();
                            }
                        }
                    }
                }
            }
        }
        ((C19567d) amVar.f297774b.f102889bT.mo6453a()).mo24822a(1, Integer.valueOf((int) Collection.EL.stream(identityHashMap.values()).mapToLong(C106874ai.f297769a).sum()));
        C106868ac acVar3 = (C106868ac) guVar.get(0);
        return (!amVar.f297773a.mo79746e(C90017bw.f248032i) || !C50690ab.MEDIA_SESSION.equals(acVar3.mo95702c())) ? guVar : (C58485gu) Collection.EL.stream(guVar).filter(new C106873ah((Set) Collection.EL.stream((List) Map.EL.getOrDefault(identityHashMap, acVar3, new ArrayList())).limit(amVar.f297773a.mo79743a(C90017bw.f247981bq)).collect(Collector.CC.m71775of(C106870ae.f297765a, C106871af.f297766a, C106872ag.f297767a, new Collector.Characteristics[0])))).collect(C58370cn.f155946a);
    }
}

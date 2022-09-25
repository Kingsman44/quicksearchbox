package com.google.android.libraries.search.integrations.p3015b.p3016a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38494c;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38495d;
import com.google.android.libraries.storage.protostore.C42882ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.p4184bj.p4204d.p4205a.C56011c;
import com.google.p4184bj.p4204d.p4205a.p4208c.C56013b;
import com.google.p4184bj.p4204d.p4205a.p4208c.C56014c;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4874ap.p4877b.p4878a.C63695f;
import com.google.protos.p4874ap.p4877b.p4878a.C63696g;
import com.google.protos.p4874ap.p4877b.p4878a.C63697h;
import com.google.protos.p4874ap.p4877b.p4878a.C63698i;
import com.google.protos.p4874ap.p4877b.p4878a.C63699j;
import com.google.protos.p4874ap.p4877b.p4878a.C63700k;
import com.google.protos.p4874ap.p4877b.p4878a.C63709t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.integrations.b.a.e */
/* compiled from: PG */
public final class C38499e implements C42882ah {

    /* renamed from: a */
    public static final /* synthetic */ int f101854a = 0;

    /* renamed from: b */
    private static final C63698i f101855b;

    /* renamed from: c */
    private final C21370a f101856c;

    static {
        C63695f fVar = (C63695f) C63698i.f172221d.createBuilder();
        fVar.copyOnWrite();
        C63698i iVar = (C63698i) fVar.instance;
        iVar.f172224b = 78;
        iVar.f172223a |= 1;
        f101855b = (C63698i) fVar.build();
    }

    public C38499e(C21370a aVar) {
        this.f101856c = aVar;
    }

    /* renamed from: f */
    private static boolean m67741f(C63698i iVar) {
        C56014c cVar;
        int a = C56011c.m87882a(iVar.f172224b);
        if (a == 0 || a != 79) {
            return true;
        }
        C63697h hVar = iVar.f172225c;
        if (hVar == null) {
            hVar = C63697h.f172217c;
        }
        if (hVar.f172219a == 3) {
            cVar = (C56014c) hVar.f172220b;
        } else {
            cVar = C56014c.f149175c;
        }
        return (cVar.f149177a == 3 ? (String) cVar.f149178b : BuildConfig.FLAVOR).isEmpty();
    }

    /* renamed from: g */
    private static boolean m67742g(C63709t tVar) {
        return Collection.EL.stream(tVar.f172249b).anyMatch(C38498d.f101853a);
    }

    /* renamed from: a */
    public final C58485gu mo41366a() {
        return C58485gu.m89846n(f101855b);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C58495hd mo41367b(List list, MessageLite messageLite) {
        C38495d dVar = (C38495d) messageLite;
        HashMap hashMap = new HashMap();
        C63699j jVar = (C63699j) C63700k.f172226e.createBuilder();
        jVar.copyOnWrite();
        C63700k kVar = (C63700k) jVar.instance;
        kVar.f172229b = 2;
        kVar.f172230c = 0;
        C63700k kVar2 = (C63700k) jVar.build();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63709t tVar = (C63709t) it.next();
            C63698i iVar = tVar.f172248a;
            if (iVar == null) {
                iVar = C63698i.f172221d;
            }
            if (!m67741f(iVar) && !m67742g(tVar)) {
                C63698i iVar2 = tVar.f172248a;
                if (iVar2 == null) {
                    iVar2 = C63698i.f172221d;
                }
                if (!hashMap.containsKey(iVar2)) {
                    C63698i iVar3 = tVar.f172248a;
                    if (iVar3 == null) {
                        iVar3 = C63698i.f172221d;
                    }
                    hashMap.put(iVar3, C58833ax.m90834k(kVar2));
                }
            }
        }
        if (!dVar.f101851c.isEmpty()) {
            String str = dVar.f101851c;
            C63695f fVar = (C63695f) C63698i.f172221d.createBuilder();
            fVar.copyOnWrite();
            C63698i iVar4 = (C63698i) fVar.instance;
            iVar4.f172224b = 78;
            iVar4.f172223a |= 1;
            C63696g gVar = (C63696g) C63697h.f172217c.createBuilder();
            C56013b bVar = (C56013b) C56014c.f149175c.createBuilder();
            bVar.copyOnWrite();
            C56014c cVar = (C56014c) bVar.instance;
            str.getClass();
            cVar.f149177a = 3;
            cVar.f149178b = str;
            C56014c cVar2 = (C56014c) bVar.build();
            gVar.copyOnWrite();
            C63697h hVar = (C63697h) gVar.instance;
            cVar2.getClass();
            hVar.f172220b = cVar2;
            hVar.f172219a = 3;
            C63697h hVar2 = (C63697h) gVar.build();
            fVar.copyOnWrite();
            C63698i iVar5 = (C63698i) fVar.instance;
            hVar2.getClass();
            iVar5.f172225c = hVar2;
            iVar5.f172223a |= 2;
            C63699j jVar2 = (C63699j) C63700k.f172226e.createBuilder();
            jVar2.copyOnWrite();
            C63700k kVar3 = (C63700k) jVar2.instance;
            kVar3.f172229b = 2;
            kVar3.f172230c = 1;
            hashMap.put((C63698i) fVar.build(), C58833ax.m90834k((C63700k) jVar2.build()));
        }
        return C58495hd.m89898l(hashMap);
    }

    /* renamed from: c */
    public final /* synthetic */ C63088z mo41368c(MessageLite messageLite) {
        return ((C38495d) messageLite).f101850b;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ MessageLite mo41369d(MessageLite messageLite, C63088z zVar) {
        C38494c cVar = (C38494c) ((C38495d) messageLite).toBuilder();
        cVar.copyOnWrite();
        C38495d dVar = (C38495d) cVar.instance;
        zVar.getClass();
        dVar.f101849a |= 1;
        dVar.f101850b = zVar;
        return (C38495d) cVar.build();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ MessageLite mo41370e(MessageLite messageLite, List list) {
        C56014c cVar;
        C38494c cVar2 = (C38494c) ((C38495d) messageLite).toBuilder();
        cVar2.copyOnWrite();
        C38495d dVar = (C38495d) cVar2.instance;
        dVar.f101849a &= -3;
        dVar.f101851c = C38495d.f101847e.f101851c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63709t tVar = (C63709t) it.next();
            C63698i iVar = tVar.f172248a;
            if (iVar == null) {
                iVar = C63698i.f172221d;
            }
            if (!m67741f(iVar) && !m67742g(tVar)) {
                C63698i iVar2 = tVar.f172248a;
                if (iVar2 == null) {
                    iVar2 = C63698i.f172221d;
                }
                C63697h hVar = iVar2.f172225c;
                if (hVar == null) {
                    hVar = C63697h.f172217c;
                }
                if (hVar.f172219a == 3) {
                    cVar = (C56014c) hVar.f172220b;
                } else {
                    cVar = C56014c.f149175c;
                }
                String str = cVar.f149177a == 3 ? (String) cVar.f149178b : BuildConfig.FLAVOR;
                cVar2.copyOnWrite();
                C38495d dVar2 = (C38495d) cVar2.instance;
                str.getClass();
                dVar2.f101849a |= 2;
                dVar2.f101851c = str;
            }
        }
        C63042fg i = C62953e.m95484i(this.f101856c.mo26870b());
        cVar2.copyOnWrite();
        C38495d dVar3 = (C38495d) cVar2.instance;
        i.getClass();
        dVar3.f101852d = i;
        dVar3.f101849a |= 4;
        return (C38495d) cVar2.build();
    }
}

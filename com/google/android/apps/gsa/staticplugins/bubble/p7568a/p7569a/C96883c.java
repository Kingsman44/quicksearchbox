package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a;

import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96980c;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96981d;
import com.google.android.libraries.storage.protostore.C42882ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4184bj.p4204d.p4205a.C56011c;
import com.google.p4184bj.p4204d.p4205a.p4207b.C56009a;
import com.google.p4184bj.p4204d.p4205a.p4207b.C56010b;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4877b.p4878a.C63695f;
import com.google.protos.p4874ap.p4877b.p4878a.C63696g;
import com.google.protos.p4874ap.p4877b.p4878a.C63697h;
import com.google.protos.p4874ap.p4877b.p4878a.C63698i;
import com.google.protos.p4874ap.p4877b.p4878a.C63699j;
import com.google.protos.p4874ap.p4877b.p4878a.C63700k;
import com.google.protos.p4874ap.p4877b.p4878a.C63709t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.c */
/* compiled from: PG */
public final class C96883c implements C42882ah {

    /* renamed from: a */
    private static final C59071e f270863a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.a.a.c");

    /* renamed from: b */
    private static final C63698i f270864b;

    static {
        C63695f fVar = (C63695f) C63698i.f172221d.createBuilder();
        fVar.copyOnWrite();
        C63698i iVar = (C63698i) fVar.instance;
        iVar.f172224b = 69;
        iVar.f172223a |= 1;
        f270864b = (C63698i) fVar.build();
    }

    /* renamed from: a */
    public final C58485gu mo41366a() {
        return C58485gu.m89846n(f270864b);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C58495hd mo41367b(List list, MessageLite messageLite) {
        C58490gz gzVar = new C58490gz(4);
        HashSet hashSet = new HashSet();
        for (C96981d dVar : ((C96882b) messageLite).f270857b) {
            C63695f fVar = (C63695f) C63698i.f172221d.createBuilder();
            fVar.copyOnWrite();
            C63698i iVar = (C63698i) fVar.instance;
            iVar.f172224b = 69;
            iVar.f172223a |= 1;
            C63696g gVar = (C63696g) C63697h.f172217c.createBuilder();
            C56009a aVar = (C56009a) C56010b.f149170c.createBuilder();
            C63088z zVar = dVar.f271033b;
            aVar.copyOnWrite();
            C56010b bVar = (C56010b) aVar.instance;
            zVar.getClass();
            bVar.f149172a = 1;
            bVar.f149173b = zVar;
            gVar.copyOnWrite();
            C63697h hVar = (C63697h) gVar.instance;
            C56010b bVar2 = (C56010b) aVar.build();
            bVar2.getClass();
            hVar.f172220b = bVar2;
            hVar.f172219a = 2;
            fVar.copyOnWrite();
            C63698i iVar2 = (C63698i) fVar.instance;
            C63697h hVar2 = (C63697h) gVar.build();
            hVar2.getClass();
            iVar2.f172225c = hVar2;
            iVar2.f172223a |= 2;
            C63698i iVar3 = (C63698i) fVar.build();
            hashSet.add(iVar3);
            C63699j jVar = (C63699j) C63700k.f172226e.createBuilder();
            jVar.copyOnWrite();
            C63700k kVar = (C63700k) jVar.instance;
            kVar.f172229b = 2;
            kVar.f172230c = 1;
            gzVar.mo55429h(iVar3, C58833ax.m90834k((C63700k) jVar.build()));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63709t tVar = (C63709t) it.next();
            C63698i iVar4 = tVar.f172248a;
            if (iVar4 == null) {
                iVar4 = C63698i.f172221d;
            }
            if (!hashSet.contains(iVar4)) {
                C63698i iVar5 = tVar.f172248a;
                if (iVar5 == null) {
                    iVar5 = C63698i.f172221d;
                }
                gzVar.mo55429h(iVar5, C58836b.f156633a);
            }
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: c */
    public final /* synthetic */ C63088z mo41368c(MessageLite messageLite) {
        return ((C96882b) messageLite).f270861f;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ MessageLite mo41369d(MessageLite messageLite, C63088z zVar) {
        C96874a aVar = (C96874a) ((C96882b) messageLite).toBuilder();
        aVar.copyOnWrite();
        C96882b bVar = (C96882b) aVar.instance;
        zVar.getClass();
        bVar.f270856a |= 2;
        bVar.f270861f = zVar;
        return (C96882b) aVar.build();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ MessageLite mo41370e(MessageLite messageLite, List list) {
        C56010b bVar;
        C56010b bVar2;
        C63088z zVar;
        C96874a aVar = (C96874a) ((C96882b) messageLite).toBuilder();
        aVar.copyOnWrite();
        ((C96882b) aVar.instance).f270857b = C96882b.emptyProtobufList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63709t tVar = (C63709t) it.next();
            C63698i iVar = tVar.f172248a;
            if (iVar == null) {
                iVar = C63698i.f172221d;
            }
            int a = C56011c.m87882a(iVar.f172224b);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            if (a - 1 != 69) {
                C59104x d = f270863a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ProtoDataLams");
                C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(18314);
                C63698i iVar2 = tVar.f172248a;
                if (iVar2 == null) {
                    iVar2 = C63698i.f172221d;
                }
                int a2 = C56011c.m87882a(iVar2.f172224b);
                if (a2 != 0) {
                    i = a2;
                }
                cVar.mo56387q("Ignoring unexpected setting: %d", i - 1);
            } else {
                C63698i iVar3 = tVar.f172248a;
                if (iVar3 == null) {
                    iVar3 = C63698i.f172221d;
                }
                C63697h hVar = iVar3.f172225c;
                if (hVar == null) {
                    hVar = C63697h.f172217c;
                }
                if (hVar.f172219a == 2) {
                    bVar = (C56010b) hVar.f172220b;
                } else {
                    bVar = C56010b.f149170c;
                }
                if (bVar.f149172a == 1) {
                    C96980c cVar2 = (C96980c) C96981d.f271030c.createBuilder();
                    C63698i iVar4 = tVar.f172248a;
                    if (iVar4 == null) {
                        iVar4 = C63698i.f172221d;
                    }
                    C63697h hVar2 = iVar4.f172225c;
                    if (hVar2 == null) {
                        hVar2 = C63697h.f172217c;
                    }
                    if (hVar2.f172219a == 2) {
                        bVar2 = (C56010b) hVar2.f172220b;
                    } else {
                        bVar2 = C56010b.f149170c;
                    }
                    if (bVar2.f149172a == 1) {
                        zVar = (C63088z) bVar2.f149173b;
                    } else {
                        zVar = C63088z.f170246b;
                    }
                    cVar2.copyOnWrite();
                    C96981d dVar = (C96981d) cVar2.instance;
                    zVar.getClass();
                    dVar.f271032a = 1 | dVar.f271032a;
                    dVar.f271033b = zVar;
                    C96981d dVar2 = (C96981d) cVar2.build();
                    aVar.copyOnWrite();
                    C96882b bVar3 = (C96882b) aVar.instance;
                    dVar2.getClass();
                    bVar3.mo90367a();
                    bVar3.f270857b.add(dVar2);
                }
            }
        }
        return (C96882b) aVar.build();
    }
}

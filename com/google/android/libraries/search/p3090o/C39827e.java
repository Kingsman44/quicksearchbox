package com.google.android.libraries.search.p3090o;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42882ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.p4184bj.p4204d.p4205a.C56011c;
import com.google.p4184bj.p4204d.p4205a.p4209d.C56016b;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4877b.p4878a.C63695f;
import com.google.protos.p4874ap.p4877b.p4878a.C63698i;
import com.google.protos.p4874ap.p4877b.p4878a.C63699j;
import com.google.protos.p4874ap.p4877b.p4878a.C63700k;
import com.google.protos.p4874ap.p4877b.p4878a.C63709t;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.o.e */
/* compiled from: PG */
public final class C39827e implements C42882ah {

    /* renamed from: b */
    public static final /* synthetic */ int f104728b = 0;

    /* renamed from: c */
    private static final C63698i f104729c;

    /* renamed from: a */
    public final C21370a f104730a;

    static {
        C63695f fVar = (C63695f) C63698i.f172221d.createBuilder();
        fVar.copyOnWrite();
        C63698i iVar = (C63698i) fVar.instance;
        iVar.f172224b = 13;
        iVar.f172223a |= 1;
        f104729c = (C63698i) fVar.build();
    }

    public C39827e(C21370a aVar) {
        this.f104730a = aVar;
    }

    /* renamed from: a */
    public final C58485gu mo41366a() {
        return C58485gu.m89846n(f104729c);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C58495hd mo41367b(List list, MessageLite messageLite) {
        C39824b bVar = (C39824b) messageLite;
        C58490gz gzVar = new C58490gz(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63698i iVar = ((C63709t) it.next()).f172248a;
            if (iVar == null) {
                iVar = C63698i.f172221d;
            }
            gzVar.mo55429h(iVar, C58836b.f156633a);
        }
        C56016b a = C56016b.m87883a(bVar.f104723c);
        if (a == null) {
            a = C56016b.UNSPECIFIED_TEMPERATURE_UNIT;
        }
        if (a != C56016b.UNSPECIFIED_TEMPERATURE_UNIT) {
            C63698i iVar2 = f104729c;
            C63699j jVar = (C63699j) C63700k.f172226e.createBuilder();
            int i = a.f149184d;
            jVar.copyOnWrite();
            C63700k kVar = (C63700k) jVar.instance;
            kVar.f172229b = 2;
            kVar.f172230c = Integer.valueOf(i);
            gzVar.mo55429h(iVar2, C58833ax.m90834k((C63700k) jVar.build()));
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: c */
    public final /* synthetic */ C63088z mo41368c(MessageLite messageLite) {
        return ((C39824b) messageLite).f104722b;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ MessageLite mo41369d(MessageLite messageLite, C63088z zVar) {
        C39823a aVar = (C39823a) ((C39824b) messageLite).toBuilder();
        aVar.copyOnWrite();
        C39824b bVar = (C39824b) aVar.instance;
        zVar.getClass();
        bVar.f104721a |= 1;
        bVar.f104722b = zVar;
        return (C39824b) aVar.build();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ MessageLite mo41370e(MessageLite messageLite, List list) {
        C39823a aVar = (C39823a) ((C39824b) messageLite).toBuilder();
        aVar.copyOnWrite();
        C39824b bVar = (C39824b) aVar.instance;
        bVar.f104721a &= -3;
        bVar.f104723c = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63709t tVar = (C63709t) it.next();
            C63698i iVar = tVar.f172248a;
            if (iVar == null) {
                iVar = C63698i.f172221d;
            }
            int a = C56011c.m87882a(iVar.f172224b);
            if (a != 0 && a == 14) {
                Collection.EL.stream(tVar.f172249b).map(C39825c.f104725a).findFirst().ifPresent(new C39826d(this, aVar));
            }
        }
        return (C39824b) aVar.build();
    }
}

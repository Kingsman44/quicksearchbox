package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.w */
/* compiled from: PG */
public final class C134605w {

    /* renamed from: a */
    public final C134557av f366558a;

    public C134605w(C134557av avVar) {
        this.f366558a = avVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C134558aw mo111836a() {
        C62942bv build = this.f366558a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134558aw) build;
    }

    /* renamed from: b */
    public final void mo111837b(C63042fg fgVar) {
        C69664n.m101061g(fgVar, "value");
        C134557av avVar = this.f366558a;
        avVar.copyOnWrite();
        C134558aw awVar = (C134558aw) avVar.instance;
        C134558aw awVar2 = C134558aw.f366443h;
        fgVar.getClass();
        awVar.f366447c = fgVar;
        awVar.f366445a |= 2;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo111838c(Iterable iterable) {
        C134557av avVar = this.f366558a;
        avVar.copyOnWrite();
        C134558aw awVar = (C134558aw) avVar.instance;
        C134558aw awVar2 = C134558aw.f366443h;
        C62971cq cqVar = awVar.f366449e;
        if (!cqVar.mo58948c()) {
            awVar.f366449e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) awVar.f366449e);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo111839d() {
        List unmodifiableList = Collections.unmodifiableList(((C134558aw) this.f366558a.instance).f366449e);
        C69664n.m101060f(unmodifiableList, "_builder.getStreamStructuresList()");
        new C62883b(unmodifiableList);
    }
}

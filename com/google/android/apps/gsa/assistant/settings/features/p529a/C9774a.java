package com.google.android.apps.gsa.assistant.settings.features.p529a;

import com.google.android.apps.gsa.assistant.settings.features.p529a.p531b.C9778a;
import com.google.android.apps.gsa.assistant.settings.features.p529a.p531b.C9779b;
import com.google.android.apps.gsa.nga.api.bq;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3897e.p3929l.p3930a.C52694b;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.MessageLite;
import com.google.protos.p5129p.p5131b.C65849r;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.a.a */
/* compiled from: PG */
public final /* synthetic */ class C9774a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C9780c f33744a;

    public /* synthetic */ C9774a(C9780c cVar) {
        this.f33744a = cVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C52694b bVar;
        C52694b bVar2;
        C9780c cVar = this.f33744a;
        Optional findFirst = Collection.EL.stream((C58485gu) obj).findFirst();
        if (!findFirst.isEmpty() && ((C65849r) findFirst.get()).f179004a == 13) {
            if (cVar.f33753c == null) {
                cVar.f33753c = new AtomicBoolean(false);
            }
            if (cVar.f33754d == null) {
                cVar.f33754d = new AtomicBoolean(false);
            }
            AtomicBoolean atomicBoolean = cVar.f33753c;
            C65849r rVar = (C65849r) findFirst.get();
            if (rVar.f179004a == 13) {
                bVar = (C52694b) rVar.f179005b;
            } else {
                bVar = C52694b.f138336c;
            }
            atomicBoolean.set(bVar.f138338a);
            AtomicBoolean atomicBoolean2 = cVar.f33754d;
            C65849r rVar2 = (C65849r) findFirst.get();
            if (rVar2.f179004a == 13) {
                bVar2 = (C52694b) rVar2.f179005b;
            } else {
                bVar2 = C52694b.f138336c;
            }
            atomicBoolean2.set(bVar2.f138339b);
            if (cVar.f33752b.isPresent()) {
                C9778a aVar = (C9778a) C9779b.f33746d.createBuilder();
                boolean z = cVar.f33753c.get();
                aVar.copyOnWrite();
                C9779b bVar3 = (C9779b) aVar.instance;
                bVar3.f33748a |= 1;
                bVar3.f33749b = z;
                boolean z2 = cVar.f33754d.get();
                aVar.copyOnWrite();
                C9779b bVar4 = (C9779b) aVar.instance;
                bVar4.f33748a |= 2;
                bVar4.f33750c = z2;
                ((bq) cVar.f33752b.get()).c(new ProtoLiteParcelable((MessageLite) (C9779b) aVar.build()));
            }
        }
    }
}

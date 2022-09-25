package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81495m;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81475j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.aj */
/* compiled from: PG */
final class C77686aj extends C81495m {

    /* renamed from: a */
    public volatile C77687ak f213972a;

    public C77686aj(C77687ak akVar) {
        this.f213972a = akVar;
    }

    /* renamed from: a */
    public final void mo72775a(byte[] bArr) {
        C77687ak akVar = this.f213972a;
        if (akVar != null) {
            try {
                akVar.f213979g.mo28212l("[NGA] process S3Event", new C77683ag(akVar, (C81475j) C62942bv.parseFrom((C62942bv) C81475j.f222893c, bArr, C77687ak.f213974b.f214119a)));
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) C77687ak.f213973a.mo56225c()).mo56382g(e)).mo56372aa(4392)).mo56386p("Unable to parse S3Event");
            }
        }
    }
}

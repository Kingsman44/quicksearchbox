package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.c.a.a;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80549d;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.speech.audio.C92199j;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.p590as.p591a.C10770d;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62964ck;
import com.google.protos.p4985f.p4988b.p4990b.C64746l;
import com.google.protos.p4985f.p4988b.p4990b.C64747m;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.bg */
/* compiled from: PG */
public final /* synthetic */ class C93023bg implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93029bm f259483a;

    /* renamed from: b */
    public final /* synthetic */ C64747m f259484b;

    public /* synthetic */ C93023bg(C93029bm bmVar, C64747m mVar) {
        this.f259483a = bmVar;
        this.f259484b = mVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58833ax axVar;
        int i;
        int i2;
        C93029bm bmVar = this.f259483a;
        C64747m mVar = this.f259484b;
        C58833ax axVar2 = (C58833ax) obj;
        if (!axVar2.mo56113h()) {
            ((C58970a) ((C58970a) C93029bm.f259491a.mo56224b()).mo56372aa(13222)).mo56386p("performSliceAudioForNga: recording is missing");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNAVAILABLE, (String) null));
        }
        C80547b bVar = (C80547b) axVar2.mo56107c();
        C93020bd bdVar = bmVar.f259496f;
        int i3 = mVar.f175512a;
        if (i3 > 0 || mVar.f175513b > 0) {
            C92989a aVar = new C92989a();
            aVar.mo87512b(i3);
            aVar.mo87513c(mVar.f175513b);
            axVar = C58833ax.m90834k(aVar.mo87511a());
        } else {
            C80549d dVar = bVar.f221097f;
            if (dVar == null) {
                dVar = C80549d.f221098d;
            }
            C62964ck ckVar = dVar.f221102c;
            if (!ckVar.isEmpty() && (i = mVar.f175514c) < (i2 = mVar.f175515d) && i < ckVar.size() && i2 < ckVar.size() - 1) {
                int a = (int) bdVar.f259476a.mo79743a(C90126fx.f251571lN);
                int a2 = (int) bdVar.f259476a.mo79743a(C90126fx.f251570lM);
                C80549d dVar2 = bVar.f221097f;
                if (dVar2 == null) {
                    dVar2 = C80549d.f221098d;
                }
                int i4 = (int) (dVar2.f221101b / 1000);
                long a3 = dVar2.f221102c.mo58927a(mVar.f175514c);
                long a4 = dVar2.f221102c.mo58927a(mVar.f175515d + 1);
                C92989a aVar2 = new C92989a();
                aVar2.mo87512b(Math.max(0, (((int) a3) + i4) - a));
                aVar2.mo87513c(i4 + ((int) a4) + a2);
                axVar = C58833ax.m90834k(aVar2.mo87511a());
            } else {
                axVar = C58836b.f156633a;
            }
        }
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.FAILED_PRECONDITION, (String) null));
        }
        C58833ax axVar3 = C58836b.f156633a;
        C64746l lVar = mVar.f175516e;
        if (lVar == null) {
            lVar = C64746l.f175506b;
        }
        if (!lVar.f175508a.isEmpty()) {
            axVar3 = C58833ax.m90834k(C10770d.OGGOPUS);
        }
        C92199j b = bmVar.mo87525b(((C93019bc) axVar.mo56107c()).mo87520a(), ((C93019bc) axVar.mo56107c()).mo87521b(), new a(bVar.f221094c, bVar.f221095d, bVar.f221093b.mo59174N()), axVar3);
        if (b != null) {
            return bmVar.mo87526d(mVar, b);
        }
        ((C58970a) ((C58970a) C93029bm.f259491a.mo56225c()).mo56372aa(13221)).mo56386p("insert audio slice failed.");
        return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNKNOWN, (String) null));
    }
}

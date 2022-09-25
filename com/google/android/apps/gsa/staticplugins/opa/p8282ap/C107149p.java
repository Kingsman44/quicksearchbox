package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52216jn;
import com.google.assistant.p3897e.p3921j.C52217jo;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.p */
/* compiled from: PG */
public final /* synthetic */ class C107149p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C107156w f298256a;

    /* renamed from: b */
    public final /* synthetic */ List f298257b;

    public /* synthetic */ C107149p(C107156w wVar, List list) {
        this.f298256a = wVar;
        this.f298257b = list;
    }

    public final Object apply(Object obj) {
        C107156w wVar = this.f298256a;
        List list = this.f298257b;
        C118826c cVar = (C118826c) obj;
        if (wVar.mo95809c() == 3) {
            return C22402a.m41822b(C52235kf.CANCELLED, "Photo download is cancelled.");
        }
        C58833ax e = wVar.mo95810e();
        if (!e.mo56113h()) {
            return C22402a.m41822b(C52235kf.UNKNOWN, "Failed to download photos.");
        }
        if (((ArrayList) e.mo56107c()).size() != list.size()) {
            return C22402a.m41822b(C52235kf.UNKNOWN, "Unable to download some photos.");
        }
        C52216jn jnVar = (C52216jn) C52217jo.f137027b.createBuilder();
        ArrayList arrayList = (ArrayList) e.mo56107c();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String uri = ((Uri) arrayList.get(i)).toString();
            jnVar.copyOnWrite();
            C52217jo joVar = (C52217jo) jnVar.instance;
            uri.getClass();
            C62971cq cqVar = joVar.f137029a;
            if (!cqVar.mo58948c()) {
                joVar.f137029a = C62942bv.mutableCopy(cqVar);
            }
            joVar.f137029a.add(uri);
        }
        return C22402a.m41821a("download_photos_result", "assistant.api.client_op.DownloadPhotosResult", jnVar.build());
    }
}

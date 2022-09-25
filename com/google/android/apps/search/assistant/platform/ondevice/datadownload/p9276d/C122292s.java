package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17064i;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.s */
/* compiled from: PG */
public final /* synthetic */ class C122292s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122297x f339122a;

    /* renamed from: b */
    public final /* synthetic */ C17036ac f339123b;

    /* renamed from: c */
    public final /* synthetic */ C17064i f339124c;

    public /* synthetic */ C122292s(C122297x xVar, C17036ac acVar, C17064i iVar) {
        this.f339122a = xVar;
        this.f339123b = acVar;
        this.f339124c = iVar;
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar;
        String str;
        C122297x xVar = this.f339122a;
        C17036ac acVar = this.f339123b;
        C17064i iVar = this.f339124c;
        String str2 = (String) obj;
        String str3 = acVar.f49644c;
        if (!iVar.f49677c.isEmpty()) {
            if ((iVar.f49675a & 8) != 0) {
                C28716av avVar = iVar.f49679e;
                if (avVar == null) {
                    avVar = C28716av.f78018d;
                }
                axVar = C58833ax.m90834k(avVar);
            } else {
                axVar = C58836b.f156633a;
            }
            C58833ax axVar2 = axVar;
            if (iVar.f49677c.isEmpty()) {
                str = str2;
            } else {
                str = iVar.f49677c;
            }
            return C47633f.m84733g(xVar.f339132c.mo105583a()).mo51516i(new C122291r(xVar, str2, new C122279f(str, iVar.f49678d), axVar2, acVar), xVar.f339131b);
        }
        throw new C70761fa(Status.f186906d.withDescription("The notification title parameter was missing in the gRPC request."), (C70334de) null, true);
    }
}

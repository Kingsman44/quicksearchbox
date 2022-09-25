package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protos.p4850an.p4851a.p4852a.C63325i;
import com.google.protos.p4850an.p4851a.p4852a.C63327k;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.c.q */
/* compiled from: PG */
public final /* synthetic */ class C123162q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123163r f340833a;

    /* renamed from: b */
    public final /* synthetic */ List f340834b;

    /* renamed from: c */
    public final /* synthetic */ String f340835c;

    public /* synthetic */ C123162q(C123163r rVar, List list, String str) {
        this.f340833a = rVar;
        this.f340834b = list;
        this.f340835c = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C123163r rVar = this.f340833a;
        List list = this.f340834b;
        String str = this.f340835c;
        C58495hd hdVar = (C58495hd) Collection.EL.stream(list).collect(C58370cn.m89403c(C123159n.f340830a, C123160o.f340831a, C123161p.f340832a));
        rVar.mo105899c("arc_fulfillment_orchestrator", list);
        rVar.mo105899c("resource_loader_spec", list);
        InputStream inputStream = (InputStream) rVar.f340837b.mo45889c(Uri.parse(str), new C42790n());
        int i = 0;
        try {
            C63327k kVar = (C63327k) C62942bv.parseFrom((C62942bv) C63327k.f171155c, inputStream, C62921ba.m95368a());
            if (inputStream != null) {
                inputStream.close();
            }
            C63325i iVar = (C63325i) kVar.toBuilder();
            iVar.copyOnWrite();
            ((C63327k) iVar.instance).mo59205a().clear();
            if (!Collections.unmodifiableMap(kVar.f171157a).containsKey("portable_assistant_spec") && hdVar.containsKey("portable_assistant_spec")) {
                iVar.mo59204a("portable_assistant_spec", (String) hdVar.get("portable_assistant_spec"));
            }
            for (Map.Entry entry : Collections.unmodifiableMap(kVar.f171157a).entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) hdVar.get(((String) entry.getValue()).replace('/', ':'));
                if (str3 == null) {
                    i++;
                    rVar.f340845j.mo105746b("pop_resource_miss", str2);
                    ((C59052c) ((C59052c) C123163r.f340836a.mo56225c()).mo56372aa(35092)).mo56389s("%s resource has not been found in the files map", str2);
                } else {
                    iVar.mo59204a(str2, str3);
                }
            }
            if (rVar.f340842g || i > 0) {
                rVar.f340845j.mo105746b("pop_resource_miss_count", Integer.toString(i));
            }
            if (i > 0) {
                rVar.f340842g = true;
            }
            return C60856cj.m92900i((C63327k) iVar.build());
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}

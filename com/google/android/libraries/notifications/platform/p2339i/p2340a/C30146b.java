package com.google.android.libraries.notifications.platform.p2339i.p2340a;

import com.google.android.libraries.notifications.platform.p2310d.C30080c;
import com.google.android.libraries.notifications.platform.p2310d.C30081d;
import com.google.android.libraries.notifications.platform.p2310d.C30083f;
import com.google.android.libraries.notifications.platform.p2310d.C30084g;
import com.google.android.libraries.notifications.platform.p2310d.C30086i;
import com.google.android.libraries.notifications.platform.p2310d.C30087j;
import com.google.android.libraries.notifications.platform.p2310d.C30088k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61531o;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.notifications.platform.i.a.b */
/* compiled from: PG */
final class C30146b implements C30083f {

    /* renamed from: a */
    private final C61531o f81520a;

    public C30146b(C61531o oVar) {
        this.f81520a = oVar;
    }

    /* renamed from: a */
    public final C30088k mo35484a(C30086i iVar) {
        try {
            C61363ae aeVar = new C61363ae();
            String url = ((C30080c) iVar).f81402a.toString();
            url.getClass();
            aeVar.f165930a = url;
            for (Map.Entry entry : ((C30080c) iVar).f81404c.entrySet()) {
                for (String a : (List) entry.getValue()) {
                    aeVar.mo57932a(C61362ad.m93870b(((C30084g) entry.getKey()).mo35458a()), a);
                }
            }
            byte[] bArr = ((C30080c) iVar).f81405d;
            if (bArr != null) {
                aeVar.mo57934c(((C30080c) iVar).f81403b, (ByteBuffer) ByteBuffer.allocateDirect(bArr.length).put(bArr).position(0));
                aeVar.mo57933b("POST");
            } else {
                aeVar.mo57933b("GET");
            }
            return (C30088k) C60922j.m93044g(this.f81520a.mo42484a(new C61365ag(aeVar)), C47810es.m84963c(C30145a.f81519a), C60826bg.f164896a).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C30087j g = C30088k.m55906g();
            ((C30081d) g).f81409d = e;
            return g.mo35486f();
        } catch (ExecutionException e2) {
            C30087j g2 = C30088k.m55906g();
            ((C30081d) g2).f81409d = e2;
            return g2.mo35486f();
        }
    }
}

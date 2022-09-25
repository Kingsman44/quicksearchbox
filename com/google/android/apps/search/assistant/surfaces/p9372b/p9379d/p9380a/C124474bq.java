package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import androidx.p104d.p105a.C2164c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bq */
/* compiled from: PG */
final class C124474bq implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C124475br f343501a;

    public C124474bq(C124475br brVar) {
        this.f343501a = brVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f343501a.mo106431e();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C124475br brVar = this.f343501a;
        C124467bj bjVar = new C124467bj(brVar, th);
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(bjVar), brVar.f343503b);
        C124473bp bpVar = new C124473bp();
        C60856cj.m92911t(l, C47810es.m84974n(bpVar), brVar.f343507f);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C124455az azVar;
        String str;
        C124460bc bcVar = (C124460bc) obj;
        int i = bcVar.f343477a;
        int i2 = 0;
        char c = 3;
        if (i == 1) {
            C124475br brVar = this.f343501a;
            C124459bb bbVar = (C124459bb) bcVar.f343478b;
            C59052c cVar = (C59052c) ((C59052c) C124475br.f343502a.mo56224b()).mo56372aa(37063);
            int i3 = bbVar.f343472b;
            if (i3 == 0) {
                i2 = 1;
            } else if (i3 == 1) {
                i2 = 2;
            } else if (i3 == 2) {
                i2 = 3;
            }
            cVar.mo56387q("Received response of type=%s", i2 - 1);
            C124477bt a = C124477bt.m203948a(bbVar.f343474d);
            if (a == null) {
                a = C124477bt.UNRECOGNIZED;
            }
            Optional.ofNullable((C2164c) brVar.f343506e.get(a)).ifPresent(new C124469bl(bbVar));
            brVar.f343506e.remove(a);
            return;
        }
        C124475br brVar2 = this.f343501a;
        if (i == 2) {
            azVar = (C124455az) bcVar.f343478b;
        } else {
            azVar = C124455az.f343464c;
        }
        C59052c cVar2 = (C59052c) ((C59052c) C124475br.f343502a.mo56224b()).mo56372aa(37064);
        int i4 = azVar.f343466a;
        if (i4 == 0) {
            c = 1;
        } else if (i4 == 1) {
            c = 2;
        } else if (i4 != 2) {
            if (i4 != 3) {
                c = 5;
                if (i4 != 4) {
                    c = i4 != 5 ? (char) 0 : 6;
                }
            } else {
                c = 4;
            }
        }
        switch (c) {
            case 1:
                str = "EVENT_NOT_SET";
                break;
            case 2:
                str = "INTERACTION_STATE_UPDATE_EVENT";
                break;
            case 3:
                str = "ASSISTANT_STATE_UPDATE_EVENT";
                break;
            case 4:
                str = "TRANSCRIPTION_STATE_UPDATE_EVENT";
                break;
            case 5:
                str = "AUDIO_LEVEL_UPDATE";
                break;
            case 6:
                str = "INTERACTION_COMPLETED_EVENT";
                break;
            default:
                str = "null";
                break;
        }
        if (c != 0) {
            cVar2.mo56389s("Received event of type=%s", str);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(new C124468bk(brVar2, azVar)), brVar2.f343503b), "Failed to notify event", new Object[0]);
            return;
        }
        throw null;
    }
}

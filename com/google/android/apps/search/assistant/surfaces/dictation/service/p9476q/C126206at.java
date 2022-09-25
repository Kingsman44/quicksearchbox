package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125063ar;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125127da;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125129dc;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125135di;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.at */
/* compiled from: PG */
final class C126206at implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C126208av f347741a;

    public C126206at(C126208av avVar) {
        this.f347741a = avVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C47558bi a = C47831fm.m85006a("SD.OrationResponse.Completed");
        try {
            this.f347741a.f347764m.mo5437b((Object) null);
            this.f347741a.mo107461d(C126207au.FINISHED_NORMALLY, (Throwable) null);
            a.close();
            return;
        } catch (Throwable th) {
            C126205as.m206403a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C47558bi a = C47831fm.m85006a("SD.OrationResponse.Error");
        try {
            this.f347741a.f347764m.mo5437b((Object) null);
            this.f347741a.mo107461d(C126207au.KEYBOARD_RPC_ERROR, th);
            a.close();
            return;
        } catch (Throwable th2) {
            C126205as.m206403a(th, th2);
        }
        throw th;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C125129dc dcVar;
        C125127da daVar;
        C125063ar arVar;
        C125135di diVar = (C125135di) obj;
        int i = diVar.f345209a;
        int i2 = i != 0 ? i != 1 ? i != 3 ? i != 4 ? 0 : 3 : 2 : 1 : 4;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C47558bi a = C47831fm.m85006a("SD.OrationResponse.Init");
            try {
                C126208av avVar = this.f347741a;
                if (diVar.f345209a == 1) {
                    dcVar = (C125129dc) diVar.f345210b;
                } else {
                    dcVar = C125129dc.f345195c;
                }
                avVar.mo107459b("Handling init params", new C126188ab(avVar, dcVar));
                a.close();
                return;
            } catch (Throwable th) {
                C126205as.m206403a(th, th);
            }
        } else if (i3 == 1) {
            C47558bi a2 = C47831fm.m85006a("SD.OrationResponse.Final");
            try {
                C126208av avVar2 = this.f347741a;
                if (diVar.f345209a == 3) {
                    daVar = (C125127da) diVar.f345210b;
                } else {
                    daVar = C125127da.f345192b;
                }
                avVar2.mo107459b("Handling final params", new C126193ag(avVar2, daVar));
                a2.close();
                return;
            } catch (Throwable th2) {
                C126205as.m206403a(th, th2);
            }
        } else if (i3 == 2) {
            C47558bi a3 = C47831fm.m85006a("SD.OrationResponse.Context");
            try {
                C126208av avVar3 = this.f347741a;
                if (diVar.f345209a == 4) {
                    arVar = (C125063ar) diVar.f345210b;
                } else {
                    arVar = C125063ar.f345037b;
                }
                avVar3.mo107459b("Handling context update", new C126195ai(avVar3, arVar));
                a3.close();
                return;
            } catch (Throwable th3) {
                C126205as.m206403a(th, th3);
            }
        } else if (i3 == 3) {
            ((C59052c) ((C59052c) C126208av.f347752a.mo56226d()).mo56372aa(36902)).mo56386p("Ignoring a malformed OrationResponse [SD]");
            return;
        } else {
            return;
        }
        throw th;
        throw th;
        throw th;
    }
}

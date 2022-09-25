package com.google.apps.tiktok.p3633d.p3634a;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.google.apps.tiktok.d.a.h */
/* compiled from: PG */
public final /* synthetic */ class C46670h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46677o f121937a;

    public /* synthetic */ C46670h(C46677o oVar) {
        this.f121937a = oVar;
    }

    public final Object apply(Object obj) {
        C46677o oVar = this.f121937a;
        Throwable th = (Throwable) obj;
        if (!oVar.mo50698b().contains(C46667e.TEXT)) {
            return C46675m.f121943k;
        }
        if (oVar.mo50699c()) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            C46663a aVar = new C46663a();
            aVar.mo50684b(true);
            aVar.mo50686d(C46667e.TEXT);
            aVar.f121916a = C63088z.m96143E(stringWriter.toString());
            return aVar.mo50683a();
        }
        StringBuilder sb = new StringBuilder();
        C46674l.m83158b(sb, th);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("Caused by: ");
            C46674l.m83158b(sb, cause);
        }
        C46663a aVar2 = new C46663a();
        aVar2.mo50684b(false);
        aVar2.mo50686d(C46667e.TEXT);
        aVar2.f121916a = C63088z.m96143E(sb.toString());
        return aVar2.mo50683a();
    }
}

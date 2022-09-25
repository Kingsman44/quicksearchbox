package com.google.android.libraries.search.silk.p3162a.p3179q;

import android.content.Intent;
import com.google.android.libraries.silk.p3205a.p3235x.C41738a;
import com.google.android.libraries.silk.p3205a.p3235x.C41739b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56840e;

/* renamed from: com.google.android.libraries.search.silk.a.q.d */
/* compiled from: PG */
public final class C40629d implements C41739b {

    /* renamed from: a */
    private final C40633h f106630a;

    public C40629d(C40633h hVar) {
        this.f106630a = hVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo42573a() {
        return C41738a.m73193a();
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo42574b() {
        return C41738a.m73194b();
    }

    /* renamed from: c */
    public final C60870cx mo42575c(C56840e eVar) {
        C40633h hVar = this.f106630a;
        int i = eVar.f151650a;
        if ((i & 8) != 0) {
            C40631f fVar = new C40631f(hVar, eVar);
            return C60856cj.m92905n(C47810es.m84965e(fVar), hVar.f106638c);
        } else if ((i & 4) == 0 && (i & 2) == 0) {
            return C40633h.m70397b("invalid_content", "empty or default instance of showShareSheetRequest passed to showShareSheet. This is not supported.");
        } else {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(268435456);
            int i2 = eVar.f151650a;
            if ((i2 & 4) != 0) {
                intent.putExtra("android.intent.extra.TEXT", eVar.f151653d).setType("text/plain");
            } else if ((i2 & 2) != 0) {
                intent.putExtra("android.intent.extra.TEXT", eVar.f151652c).setType("text/plain");
            }
            hVar.f106637b.startActivity(C40633h.m70396a(intent, eVar.f151651b));
            return C60856cj.m92900i(C40633h.f106636a);
        }
    }
}

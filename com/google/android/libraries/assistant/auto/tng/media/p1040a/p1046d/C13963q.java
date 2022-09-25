package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.support.p031v4.media.session.C0315q;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.p742a.C12110b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.q */
/* compiled from: PG */
public final /* synthetic */ class C13963q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13968v f42517a;

    /* renamed from: b */
    public final /* synthetic */ String f42518b;

    /* renamed from: c */
    public final /* synthetic */ C0315q f42519c;

    /* renamed from: d */
    public final /* synthetic */ String f42520d;

    public /* synthetic */ C13963q(C13968v vVar, String str, C0315q qVar, String str2) {
        this.f42517a = vVar;
        this.f42518b = str;
        this.f42519c = qVar;
        this.f42520d = str2;
    }

    public final C60870cx apply(Object obj) {
        C13968v vVar = this.f42517a;
        String str = this.f42518b;
        C0315q qVar = this.f42519c;
        String str2 = this.f42520d;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h() || !(((C12110b) axVar.mo56107c()).mo20416f().getState() == 2 || ((C12110b) axVar.mo56107c()).mo20416f().getState() == 1)) {
            if (!((Boolean) vVar.f42535i.mo17428b()).booleanValue() || (str != null && str.equals("com.android.bluetooth"))) {
                qVar.mo1018c();
            }
            if ("media.PAUSE".equals(str2)) {
                vVar.f42537k.mo21358b(C37179a.f97596dI);
            }
            qVar.mo1017b();
            if (((Boolean) vVar.f42534h.mo17428b()).booleanValue() || "media.PAUSE".equals(str2)) {
                C60870cx b = vVar.mo21375b(str);
                C13967u uVar = new C13967u(qVar);
                return C60922j.m93044g(b, C47810es.m84963c(uVar), vVar.f42530d);
            } else if ("media.STOP".equals(str2)) {
                vVar.f42537k.mo21358b(C37179a.f97595dH);
                qVar.mo1031p();
            }
        }
        return C60856cj.m92900i(0);
    }
}

package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.dd */
/* compiled from: PG */
public final class C106950dd implements C106869ad {

    /* renamed from: a */
    private final Context f297901a;

    /* renamed from: b */
    private final C58974d f297902b;

    /* renamed from: c */
    private final C83564a f297903c;

    /* renamed from: d */
    private final C106964r f297904d;

    /* renamed from: e */
    private final C14626qe f297905e;

    public C106950dd(Context context, C106964r rVar, C83564a aVar, C14626qe qeVar) {
        this.f297901a = context;
        this.f297902b = aVar.mo76901b(this);
        this.f297903c = aVar;
        this.f297904d = rVar;
        this.f297905e = qeVar;
    }

    /* renamed from: a */
    public final C58833ax mo95711a(C52560wg wgVar, C50690ab abVar) {
        if (!C14626qe.YOUTUBE_PREMIUM_USER.equals(this.f297905e) || !C50690ab.POTTER.equals(abVar)) {
            if (!C14626qe.YOUTUBE_PREMIUM_USER.equals(this.f297905e) && C50690ab.MBS.equals(abVar)) {
                C58970a aVar = (C58970a) ((C58970a) this.f297902b.mo56226d()).mo56372aa(23425);
                C52568wo woVar = wgVar.f137950f;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                aVar.mo56389s("Non-premium user should not have MBS result: %s", woVar.f137998e);
            }
            if (!this.f297904d.mo95723b(wgVar, abVar)) {
                return C58836b.f156633a;
            }
            return C58833ax.m90834k(new C106942cw(this.f297901a, this.f297903c, wgVar, abVar, this.f297905e));
        }
        C58970a aVar2 = (C58970a) ((C58970a) this.f297902b.mo56224b()).mo56372aa(23426);
        C52568wo woVar2 = wgVar.f137950f;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        aVar2.mo56389s("Potter result %s ignored for YTM premium user", woVar2.f137998e);
        return C58836b.f156633a;
    }
}

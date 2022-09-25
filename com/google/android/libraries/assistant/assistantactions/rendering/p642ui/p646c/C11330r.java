package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Date;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.r */
/* compiled from: PG */
public final class C11330r {

    /* renamed from: a */
    public final String f36805a;

    /* renamed from: b */
    public final C58833ax f36806b;

    /* renamed from: c */
    public final long f36807c;

    /* renamed from: d */
    public final boolean f36808d;

    public C11330r(String str, C52393qb qbVar, boolean z) {
        this.f36805a = str;
        this.f36807c = C11306d.m26903c(qbVar, str);
        this.f36808d = z;
        this.f36806b = C58836b.f156633a;
    }

    public C11330r(String str, C52397qf qfVar, boolean z) {
        this.f36805a = str;
        C58833ax k = C58833ax.m90834k(qfVar);
        this.f36806b = k;
        this.f36808d = z;
        if ((((C52397qf) k.mo56107c()).f137493a & 2) != 0) {
            C52393qb qbVar = ((C52397qf) k.mo56107c()).f137501i;
            this.f36807c = C11306d.m26903c(qbVar == null ? C52393qb.f137479e : qbVar, str);
            return;
        }
        this.f36807c = new Date().getTime();
    }
}

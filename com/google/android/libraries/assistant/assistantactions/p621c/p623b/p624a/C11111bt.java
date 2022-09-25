package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.content.Context;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11203a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11204b;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11207b;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.C52513un;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.bt */
/* compiled from: PG */
public final class C11111bt implements C11204b {
    /* renamed from: a */
    public final C58833ax mo19603a(Context context, C52081en enVar, C11054a aVar) {
        C58833ax b = C11207b.m26563b(enVar);
        if (!b.mo56113h()) {
            return C58836b.f156633a;
        }
        C58833ax a = C11207b.m26562a((C51805du) b.mo56107c());
        C58833ax c = C11207b.m26564c((C51805du) b.mo56107c());
        if (!a.mo56113h() || (((C52492tt) a.mo56107c()).f137805a & 1) == 0 || (((C52492tt) a.mo56107c()).f137805a & 2) == 0) {
            return C58836b.f156633a;
        }
        C51953ff ffVar = ((C52492tt) a.mo56107c()).f137806b;
        if (ffVar == null) {
            ffVar = C51953ff.f136315l;
        }
        C51936ep a2 = C51936ep.m86435a(ffVar.f136323g);
        if (a2 == null) {
            a2 = C51936ep.DEFAULT;
        }
        if (a2 != C51936ep.TELL_MY_FAMILY) {
            return C58836b.f156633a;
        }
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        if (c.mo56113h()) {
            ffVar = C11222q.m26607d((C52513un) c.mo56107c(), ffVar);
        }
        return C58833ax.m90834k(C11208c.m26566b(C58597ky.m90212c(C11209d.m26580j(ffVar)), C58733pz.f156496a, exVar));
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo19605d(Context context, C52081en enVar, C11054a aVar) {
        return C11203a.m26543a(this, context, enVar, aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo19606e(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar, C11054a aVar) {
        return C11203a.m26544b(this, context, ffVar, uhVar, exVar);
    }

    /* renamed from: f */
    public final /* synthetic */ C58833ax mo19607f(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar) {
        return C58836b.f156633a;
    }
}

package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p625b;

import android.content.Context;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11203a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11204b;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19050h;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.b.a */
/* compiled from: PG */
public final class C11136a implements C11204b {
    /* renamed from: a */
    public final /* synthetic */ C58833ax mo19603a(Context context, C52081en enVar, C11054a aVar) {
        return C58836b.f156633a;
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
    public final C58833ax mo19607f(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar) {
        if ((ffVar.f136317a & 32) != 0) {
            C51936ep a = C51936ep.m86435a(ffVar.f136323g);
            if (a == null) {
                a = C51936ep.DEFAULT;
            }
            if (a == C51936ep.DEFAULT) {
                return C58833ax.m90834k(C11208c.m26566b(new ArrayList(), C58733pz.f156496a, C19050h.m36504a(context, exVar, uhVar)));
            }
        }
        return C58836b.f156633a;
    }
}

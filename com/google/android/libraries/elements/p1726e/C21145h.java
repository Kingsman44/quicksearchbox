package com.google.android.libraries.elements.p1726e;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.C21233ac;
import com.google.android.libraries.elements.interfaces.C21281bx;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.p1727f.C21160i;
import com.google.common.base.C58833ax;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.e.h */
/* compiled from: PG */
public final class C21145h {

    /* renamed from: a */
    private static final C21233ac f59310a = new C21144g();

    /* renamed from: b */
    private static final C21281bx f59311b = new C21281bx();

    /* renamed from: c */
    private static final C21281bx f59312c = new C21281bx();

    /* renamed from: d */
    private static final C21281bx f59313d = new C21281bx();

    /* renamed from: a */
    public static C21160i m39711a(C58833ax axVar, Context context, C69464a aVar, C58833ax axVar2) {
        if (((Boolean) axVar.mo56109e(false)).booleanValue()) {
            return (C21160i) f59312c.mo26774a(new C21141d(context, aVar, axVar2));
        }
        throw new IllegalStateException("Creating DebuggerCallback when debugger is disabled");
    }

    /* renamed from: b */
    public static DebuggerClient m39712b(C58833ax axVar, String str, C69464a aVar, Context context) {
        if (((Boolean) axVar.mo56109e(false)).booleanValue()) {
            return (DebuggerClient) f59313d.mo26774a(new C21140c(str, context, aVar));
        }
        throw new IllegalStateException("Creating DebuggerClient when debugger is disabled");
    }

    /* renamed from: c */
    public static C21233ac m39713c(C58833ax axVar, C69464a aVar) {
        if (!((Boolean) axVar.mo56109e(false)).booleanValue()) {
            return f59310a;
        }
        return (C21233ac) aVar.mo17428b();
    }

    /* renamed from: d */
    public static UnifiedTemplateResolver m39714d(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, String str, C69464a aVar, C58833ax axVar5, C58833ax axVar6) {
        return (UnifiedTemplateResolver) f59311b.mo26774a(new C21143f(axVar, axVar2, axVar3, str, axVar4, aVar, axVar5, axVar6));
    }

    /* renamed from: e */
    public static String m39715e(C58833ax axVar) {
        return String.valueOf((String) axVar.mo56109e("localhost")).concat(":5001");
    }
}

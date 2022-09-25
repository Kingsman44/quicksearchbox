package com.google.android.libraries.assistant.assistantactions.p621c;

import android.content.Context;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11204b;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.d */
/* compiled from: PG */
public final class C11227d implements C11055a {

    /* renamed from: a */
    public static final C59071e f36635a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.d");

    /* renamed from: b */
    public final Context f36636b;

    /* renamed from: c */
    public final Map f36637c;

    /* renamed from: d */
    public final C11054a f36638d;

    public C11227d(Context context, C11054a aVar, Map map) {
        this.f36636b = context;
        this.f36638d = aVar;
        this.f36637c = map;
    }

    /* renamed from: a */
    public final C60870cx mo19525a(C52081en enVar) {
        ((C59052c) ((C59052c) f36635a.mo56224b()).mo56372aa(42852)).mo56386p("trying to assist locally");
        ArrayList arrayList = new ArrayList();
        for (C11204b d : this.f36637c.values()) {
            arrayList.add(d.mo19605d(this.f36636b, enVar, this.f36638d));
        }
        return C60856cj.m92894c(arrayList).mo57335b(new C11223c(arrayList), C60826bg.f164896a);
    }
}

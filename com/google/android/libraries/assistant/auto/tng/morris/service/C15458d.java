package com.google.android.libraries.assistant.auto.tng.morris.service;

import android.app.Service;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14173n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15140b;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15157s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.service.d */
/* compiled from: PG */
public final class C15458d {

    /* renamed from: a */
    public static final C59071e f46359a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.service.d");

    /* renamed from: b */
    public final Context f46360b;

    /* renamed from: c */
    public final Service f46361c;

    /* renamed from: d */
    public final C86124t f46362d;

    /* renamed from: e */
    public final C14113an f46363e;

    /* renamed from: f */
    public final C14115ap f46364f;

    /* renamed from: g */
    public final C14647d f46365g;

    /* renamed from: h */
    public final C69464a f46366h;

    /* renamed from: i */
    public final C14173n f46367i;

    /* renamed from: j */
    public final C15140b f46368j;

    /* renamed from: k */
    public final C15157s f46369k;

    /* renamed from: l */
    public boolean f46370l;

    /* renamed from: m */
    public C14499lm f46371m = C14499lm.f43848e;

    /* renamed from: n */
    private final Context f46372n;

    public C15458d(Service service, Context context, C86124t tVar, C14113an anVar, C14115ap apVar, C14647d dVar, C69464a aVar, C14173n nVar) {
        this.f46360b = context;
        this.f46361c = service;
        this.f46362d = tVar;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                context = context.createDisplayContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(2038, (Bundle) null);
            } catch (RuntimeException e) {
                C59104x c = f46359a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.Service");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45907)).mo56386p("Exception in createWindowContext");
            }
        }
        this.f46372n = context;
        this.f46363e = anVar;
        this.f46364f = apVar;
        this.f46365g = dVar;
        this.f46368j = new C15140b(context);
        this.f46369k = new C15157s(context);
        this.f46366h = aVar;
        this.f46367i = nVar;
    }
}

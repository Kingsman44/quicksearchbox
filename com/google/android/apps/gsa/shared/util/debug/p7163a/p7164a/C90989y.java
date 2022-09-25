package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.android.libraries.gsa.monet.shared.p1894d.C23105h;
import com.google.common.p4552o.C59760eq;
import com.google.common.p4552o.C59761er;
import com.google.common.p4552o.C59786fn;
import com.google.protobuf.MessageLite;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.y */
/* compiled from: PG */
public final class C90989y extends C90983s {
    public C90989y(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        C59786fn fnVar = (C59786fn) messageLite;
        this.f254188a.mo85258b(fnVar.f161542b);
        this.f254188a.mo85261e();
        this.f254188a.mo85257a(String.format(Locale.US, "Type: %s", new Object[]{fnVar.f161543c}));
        this.f254188a.mo85257a(String.format(Locale.US, "Is renderer bound: %s", new Object[]{Boolean.valueOf(fnVar.f161544d)}));
        this.f254188a.mo85257a(String.format(Locale.US, "Renderer class: %s", new Object[]{fnVar.f161546f}));
        C90972h.m148593d("Children", fnVar.f161545e, this.f254188a);
        C90974j jVar = this.f254188a;
        C23105h a = C23105h.m43285a(fnVar.f161548h);
        if (a == null) {
            a = C23105h.UNINITIALIZED_BOOTSTRAPPABLE;
        }
        jVar.mo85257a("Init state: ".concat(String.valueOf(a.name())));
        if ((fnVar.f161541a & 32) != 0) {
            C59761er erVar = fnVar.f161547g;
            if (erVar == null) {
                erVar = C59761er.f161468f;
            }
            this.f254188a.mo85258b("View");
            this.f254188a.mo85261e();
            this.f254188a.mo85257a(String.format(Locale.US, "X: %s", new Object[]{Long.valueOf(erVar.f161470a)}));
            this.f254188a.mo85257a(String.format(Locale.US, "Y: %s", new Object[]{Long.valueOf(erVar.f161471b)}));
            this.f254188a.mo85257a(String.format(Locale.US, "Height: %s", new Object[]{Long.valueOf(erVar.f161472c)}));
            this.f254188a.mo85257a(String.format(Locale.US, "Width: %s", new Object[]{Long.valueOf(erVar.f161473d)}));
            C90974j jVar2 = this.f254188a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = C59760eq.m92501a(erVar.f161474e);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            objArr[0] = i != 0 ? i != 1 ? "GONE" : "INVISIBLE" : "VISIBLE";
            jVar2.mo85257a(String.format(locale, "Is visible: %s", objArr));
            this.f254188a.mo85260d();
        }
        this.f254188a.mo85260d();
    }
}

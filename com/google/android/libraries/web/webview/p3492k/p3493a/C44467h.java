package com.google.android.libraries.web.webview.p3492k.p3493a;

import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.webview.contrib.requestintercept.C44380a;
import com.google.android.libraries.web.webview.contrib.requestintercept.C44381b;
import java.io.IOException;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.webview.k.a.h */
/* compiled from: PG */
final class C44467h extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C44381b f115580a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44467h(C44381b bVar) {
        super(1);
        this.f115580a = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        IOException iOException = (IOException) obj;
        C69664n.m101061g(iOException, "it");
        C44381b bVar = this.f115580a;
        C44380a aVar = bVar.f115388b;
        if (aVar != null) {
            return aVar.mo47274b(iOException);
        }
        C44380a aVar2 = bVar.f115387a;
        if (aVar2 != null) {
            return aVar2.mo47274b(iOException);
        }
        return C43363h.f113275f;
    }
}

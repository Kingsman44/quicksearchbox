package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8629c;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21247aq;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.c.e */
/* compiled from: PG */
public final /* synthetic */ class C114611e implements C21247aq {

    /* renamed from: a */
    public final /* synthetic */ C114613g f317912a;

    /* renamed from: b */
    public final /* synthetic */ C114610d f317913b;

    /* renamed from: c */
    public final /* synthetic */ C28293k f317914c;

    /* renamed from: d */
    public final /* synthetic */ String f317915d;

    public /* synthetic */ C114611e(C114613g gVar, C114610d dVar, C28293k kVar, String str) {
        this.f317912a = gVar;
        this.f317913b = dVar;
        this.f317914c = kVar;
        this.f317915d = str;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25924a(View view, View view2) {
        C114613g gVar = this.f317912a;
        C114610d dVar = this.f317913b;
        C28293k kVar = this.f317914c;
        String str = this.f317915d;
        C28257a aVar = (C28257a) kVar;
        C28292j jVar = aVar.f76908a;
        if (jVar == null || dVar.f317911b.get(new C114607a(((C60214n) jVar.f76973a.instance).f162918c, str)) == null) {
            gVar.f317921a.mo101570e(kVar, dVar.f317910a);
            C28292j jVar2 = aVar.f76908a;
            if (jVar2 != null) {
                dVar.f317911b.put(new C114607a(((C60214n) jVar2.f76973a.instance).f162918c, str), kVar);
            }
        }
    }
}

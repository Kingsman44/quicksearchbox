package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.c.g */
/* compiled from: PG */
public final /* synthetic */ class C15675g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15677i f46798a;

    /* renamed from: b */
    public final /* synthetic */ String f46799b;

    public /* synthetic */ C15675g(C15677i iVar, String str) {
        this.f46798a = iVar;
        this.f46799b = str;
    }

    public final C60870cx apply(Object obj) {
        C15677i iVar = this.f46798a;
        String str = this.f46799b;
        if (!((Boolean) obj).booleanValue()) {
            ((C59052c) ((C59052c) C15677i.f46801a.mo56224b()).mo56372aa(46253)).mo56386p("personal result bit is false");
            return iVar.mo22502a(str);
        }
        ((C59052c) ((C59052c) C15677i.f46801a.mo56224b()).mo56372aa(46252)).mo56386p("personal result bit is true");
        return C60856cj.m92900i(false);
    }
}

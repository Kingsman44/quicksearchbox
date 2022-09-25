package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.shared.p7148ui.C90657bb;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109459e;
import com.google.assistant.p3897e.p3921j.C51805du;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gp */
/* compiled from: PG */
public final class C108381gp extends C90657bb {

    /* renamed from: a */
    private final C108244bo f301445a;

    /* renamed from: b */
    private final String f301446b;

    /* renamed from: c */
    private final String f301447c;

    public C108381gp(String str, String str2, C108244bo boVar) {
        this.f301445a = boVar;
        this.f301446b = str;
        this.f301447c = str2;
    }

    /* renamed from: a */
    public final void mo84949a(CompoundButton compoundButton, boolean z) {
        String str;
        if (z) {
            str = this.f301446b;
        } else {
            str = this.f301447c;
        }
        C51805du a = C109459e.m182156a(str);
        C108244bo boVar = this.f301445a;
        boVar.getClass();
        boVar.f301102a.f301881a.mo97441aC(a.toByteArray());
    }
}

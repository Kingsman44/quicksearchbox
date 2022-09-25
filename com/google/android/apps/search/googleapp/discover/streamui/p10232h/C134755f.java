package com.google.android.apps.search.googleapp.discover.streamui.p10232h;

import android.util.Base64;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.h.f */
/* compiled from: PG */
public class C134755f {

    /* renamed from: a */
    private final C57315dp f366923a;

    /* renamed from: b */
    public final String f366924b;

    /* renamed from: c */
    public final String f366925c;

    public C134755f(String str, C57315dp dpVar) {
        this.f366924b = str;
        this.f366923a = dpVar;
        if (dpVar != null) {
            String encodeToString = Base64.encodeToString(dpVar.toByteArray(), 0);
            C69664n.m101060f(encodeToString, "encodeToString(this.toByteArray(), Base64.DEFAULT)");
            str = str + "_" + encodeToString;
        }
        this.f366925c = str;
    }
}

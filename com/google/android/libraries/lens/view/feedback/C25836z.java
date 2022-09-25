package com.google.android.libraries.lens.view.feedback;

import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.lens.view.feedback.z */
/* compiled from: PG */
public final class C25836z {

    /* renamed from: a */
    public static final C59071e f70191a = C59071e.m91332i("com.google.android.libraries.lens.view.feedback.z");

    /* renamed from: b */
    public final C47477n f70192b;

    /* renamed from: c */
    public final C58833ax f70193c;

    public C25836z(C47477n nVar, C58833ax axVar) {
        this.f70192b = nVar;
        this.f70193c = axVar;
    }

    /* renamed from: a */
    public static void m47672a(C47474k kVar, String str, String str2, boolean z) {
        C46663a aVar = new C46663a();
        aVar.mo50686d(C46667e.KEY_VALUE);
        aVar.mo50684b(z);
        aVar.f121916a = C63088z.m96143E(str2);
        kVar.mo51333f(str, aVar.mo50683a());
    }

    /* renamed from: b */
    public static void m47673b(C47474k kVar, C58495hd hdVar, String str) {
        if (hdVar.containsKey(str)) {
            kVar.mo51333f(str, (C46669g) hdVar.get(str));
        }
    }
}

package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93543au;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.j */
/* compiled from: PG */
public abstract class C93518j implements C93514f {

    /* renamed from: a */
    private static final C59071e f261137a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.modular.a.j");

    /* renamed from: b */
    private final BroadcastReceiver f261138b = new C93517i(this);

    /* renamed from: c */
    public C93543au f261139c;

    /* renamed from: d */
    private boolean f261140d = false;

    /* renamed from: d */
    public abstract IntentFilter mo87926d();

    /* renamed from: h */
    public final void mo87932h(C93543au auVar, Context context) {
        IntentFilter d;
        this.f261139c = auVar;
        if (!this.f261140d && (d = mo87926d()) != null) {
            context.registerReceiver(this.f261138b, d);
            this.f261140d = true;
        }
    }

    /* renamed from: j */
    public final void mo87933j(Context context) {
        if (this.f261140d) {
            this.f261140d = false;
            try {
                context.unregisterReceiver(this.f261138b);
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f261137a.mo56226d()).mo56382g(e)).mo56372aa(13761)).mo56386p("Receiver not registered.");
            }
        }
    }
}

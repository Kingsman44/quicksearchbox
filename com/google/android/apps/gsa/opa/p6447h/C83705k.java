package com.google.android.apps.gsa.opa.p6447h;

import android.app.Presentation;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.C81921a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.opa.h.k */
/* compiled from: PG */
public final class C83705k {

    /* renamed from: a */
    public static final C59071e f228155a = C59071e.m91332i("com.google.android.apps.gsa.opa.h.k");

    /* renamed from: b */
    public final DisplayManager f228156b;

    /* renamed from: c */
    Presentation f228157c;

    /* renamed from: d */
    private final C83695a f228158d;

    /* renamed from: e */
    private final DisplayManager.DisplayListener f228159e = new C83704j(this);

    public C83705k(Context context, C83695a aVar) {
        this.f228158d = aVar;
        this.f228156b = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: a */
    public final void mo77028a() {
        if (mo77030c()) {
            DisplayManager displayManager = this.f228156b;
            if (displayManager != null) {
                displayManager.unregisterDisplayListener(this.f228159e);
            }
            Presentation presentation = this.f228157c;
            if (presentation != null) {
                presentation.dismiss();
                C59104x b = f228155a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SeDisCtrl");
                ((C59052c) ((C59052c) b).mo56372aa(6807)).mo56386p("Presentation dismissed");
            }
        }
    }

    /* renamed from: b */
    public final void mo77029b() {
        if (!C81921a.m130165c(this.f228156b)) {
            C59104x b = f228155a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SeDisCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(6809)).mo56386p("Dflt dspl not off, skip show");
            return;
        }
        if (this.f228157c == null) {
            Presentation a = this.f228158d.mo75402a();
            if (a != null) {
                this.f228157c = a;
            } else {
                return;
            }
        }
        if (!this.f228157c.isShowing()) {
            Window window = this.f228157c.getWindow();
            if (window != null) {
                window.addFlags(C89885b.NOW_VALUE);
                window.addFlags(524288);
            }
            this.f228157c.show();
            DisplayManager displayManager = this.f228156b;
            if (displayManager != null) {
                displayManager.registerDisplayListener(this.f228159e, new Handler(Looper.getMainLooper()));
            }
            C59104x b2 = f228155a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SeDisCtrl");
            ((C59052c) ((C59052c) b2).mo56372aa(6808)).mo56386p("Presentation shown");
        }
    }

    /* renamed from: c */
    public final boolean mo77030c() {
        Presentation presentation = this.f228157c;
        return presentation != null && presentation.isShowing();
    }
}

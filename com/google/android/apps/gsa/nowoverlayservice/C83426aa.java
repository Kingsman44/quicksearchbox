package com.google.android.apps.gsa.nowoverlayservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ViewSwitcher;
import com.google.android.libraries.search.logging.p3043f.C39193b;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.aa */
/* compiled from: PG */
final class C83426aa extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C83553y f227400a;

    public C83426aa(C83553y yVar) {
        this.f227400a = yVar;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Rect sourceBounds = intent.getSourceBounds();
        if (TextUtils.equals(action, "com.google.nexuslauncher.FAST_TEXT_SEARCH")) {
            setResultCode(-1);
            if (intent.getBooleanExtra("use_fade_animation", false)) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("use_fade_animation", true);
                setResultExtras(bundle);
            }
            if (this.f227400a.f62656aC == 1) {
                C83553y yVar = this.f227400a;
                yVar.f227854y = true;
                yVar.f227841l.f227561l = true;
                if (yVar.f227855z) {
                    yVar.f227855z = false;
                    yVar.f227798N.setBackground(yVar.mo76883b());
                }
                this.f227400a.mo76881H();
                String a = C39193b.m68624a(intent);
                if (a == null) {
                    a = true != intent.getBooleanExtra("use_fade_animation", false) ? "and.gsa.launcher.gtab" : "and.gsa.launcher.homescreen.fallback";
                }
                ViewSwitcher viewSwitcher = this.f227400a.f227790F;
                viewSwitcher.getClass();
                viewSwitcher.setDisplayedChild(1);
                viewSwitcher.post(new C83555z(this, intent, sourceBounds, a));
            }
        }
    }
}

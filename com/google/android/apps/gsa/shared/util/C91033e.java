package com.google.android.apps.gsa.shared.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.util.e */
/* compiled from: PG */
public final class C91033e extends ContextWrapper {

    /* renamed from: a */
    private static final C59071e f254279a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.e");

    /* renamed from: b */
    private View.OnAttachStateChangeListener f254280b;

    /* renamed from: c */
    private Activity f254281c;

    public C91033e(Context context) {
        super(context);
        C58838bb.m90884s(!(context instanceof Activity), "Expected an application context");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85311a(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            r0 = 0
            if (r3 == 0) goto L_0x0018
            android.content.Context r1 = r3.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0018
            android.view.ViewParent r3 = r3.getParent()
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L_0x0016
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0016:
            r3 = r0
            goto L_0x0000
        L_0x0018:
            if (r3 == 0) goto L_0x0020
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0020:
            r2.f254281c = r0
            if (r0 == 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            r3.dispatchConfigurationChanged(r0)
            android.app.Activity r3 = r2.f254281c
            boolean r0 = r3 instanceof android.support.p033v7.app.C0395p
            if (r0 == 0) goto L_0x0040
            android.support.v7.app.p r3 = (android.support.p033v7.app.C0395p) r3
            android.support.v7.app.v r3 = r3.mo1322k()
            r3.mo1195y()
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.C91033e.mo85311a(android.view.View):void");
    }

    /* renamed from: b */
    public final void mo85312b(View view) {
        if (this.f254280b != null) {
            ((C59052c) ((C59052c) f254279a.mo56226d()).mo56372aa(11307)).mo56386p("AttachedActivityContext: Unexpected view!=null");
        }
        C90961d dVar = new C90961d(this);
        this.f254280b = dVar;
        view.addOnAttachStateChangeListener(dVar);
    }

    public final Object getSystemService(String str) {
        if (this.f254281c == null || (!str.equals("window") && !str.equals("layout_inflater"))) {
            return super.getSystemService(str);
        }
        return this.f254281c.getSystemService(str);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f254281c;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            super.startActivity(intent);
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        Activity activity = this.f254281c;
        if (activity != null) {
            activity.startActivity(intent, bundle);
        } else {
            super.startActivity(intent, bundle);
        }
    }
}

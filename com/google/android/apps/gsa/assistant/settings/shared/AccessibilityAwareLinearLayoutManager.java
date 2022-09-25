package com.google.android.apps.gsa.assistant.settings.shared;

import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public abstract class AccessibilityAwareLinearLayoutManager extends LinearLayoutManager {
    public AccessibilityAwareLinearLayoutManager(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo64796a(View view, int i);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.AccessibilityAwareLinearLayoutManager.onInitializeAccessibilityNodeInfoForItem(android.support.v7.widget.fw, android.support.v7.widget.ge, android.view.View, androidx.core.j.a.k):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onInitializeAccessibilityNodeInfoForItem(android.support.p033v7.widget.C0661fw r1, android.support.p033v7.widget.C0670ge r2, android.view.View r3, androidx.core.p098j.p099a.C1991k r4) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.AccessibilityAwareLinearLayoutManager.onInitializeAccessibilityNodeInfoForItem(android.support.v7.widget.fw, android.support.v7.widget.ge, android.view.View, androidx.core.j.a.k):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.shared.AccessibilityAwareLinearLayoutManager.onInitializeAccessibilityNodeInfoForItem(android.support.v7.widget.fw, android.support.v7.widget.ge, android.view.View, androidx.core.j.a.k):void");
    }

    public final boolean performAccessibilityActionForItem(C0661fw fwVar, C0670ge geVar, View view, int i, Bundle bundle) {
        if (i == R.id.a11y_action_reorder_down) {
            mo64796a(view, 1);
            return true;
        } else if (i != R.id.a11y_action_reorder_up) {
            return super.performAccessibilityActionForItem(fwVar, geVar, view, i, bundle);
        } else {
            mo64796a(view, -1);
            return true;
        }
    }
}

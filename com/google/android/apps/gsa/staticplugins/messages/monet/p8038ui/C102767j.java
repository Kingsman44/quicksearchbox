package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23204ai;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.j */
/* compiled from: PG */
final class C102767j extends C23204ai {

    /* renamed from: a */
    final /* synthetic */ C102768k f286877a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102767j(C102768k kVar, ViewGroup viewGroup) {
        super(viewGroup);
        this.f286877a = kVar;
    }

    /* renamed from: a */
    public final void mo28670a(int i, C22939d dVar) {
        super.mo28670a(i, dVar);
        View il = dVar.mo28297il();
        if (il instanceof MessageCardView) {
            MessageCardView messageCardView = (MessageCardView) il;
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f286877a.f286878a.getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                obtain.setClassName(getClass().getName());
                obtain.setPackageName(this.f286877a.f286878a.getPackageName());
                obtain.getText().add(messageCardView.mo93415a());
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }
}

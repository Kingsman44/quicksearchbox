package com.google.android.libraries.web.contrib.contextmenu.internal;

import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.FragmentManager;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43445e;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.internal.a */
/* compiled from: PG */
public final /* synthetic */ class C43455a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ContextMenuWebFragmentObserver f113528a;

    public /* synthetic */ C43455a(ContextMenuWebFragmentObserver contextMenuWebFragmentObserver) {
        this.f113528a = contextMenuWebFragmentObserver;
    }

    public final void accept(Object obj) {
        C0260w a;
        ContextMenuWebFragmentObserver contextMenuWebFragmentObserver = this.f113528a;
        C43446f fVar = (C43446f) obj;
        C43445e a2 = C43445e.m76673a(fVar.f113501b);
        if (a2 == null) {
            a2 = C43445e.UNKNOWN;
        }
        if (!a2.equals(C43445e.UNKNOWN) && (a = contextMenuWebFragmentObserver.f113527b.mo46525a(fVar)) != null) {
            FragmentManager childFragmentManager = contextMenuWebFragmentObserver.f113526a.getChildFragmentManager();
            if (childFragmentManager.f634a.mo671c("context_menu") == null) {
                a.showNow(childFragmentManager, "context_menu");
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

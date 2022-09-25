package com.google.android.libraries.web.contrib.contextmenu.internal.p3366b;

import android.os.Bundle;
import android.os.Message;
import android.view.ContextMenu;
import android.view.View;
import android.webkit.WebView;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43443c;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43445e;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.internal.b.a */
/* compiled from: PG */
public final class C43459a implements View.OnCreateContextMenuListener {

    /* renamed from: a */
    private final Consumer f113531a;

    public C43459a(Consumer consumer) {
        this.f113531a = consumer;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C58838bb.m90884s(view instanceof WebView, "Context Menu listener not registered on a WebView.");
        WebView webView = (WebView) view;
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        C43445e eVar = (C43445e) C43460b.f113532a.get(Integer.valueOf(hitTestResult.getType()));
        if (eVar == null) {
            eVar = C43445e.UNKNOWN;
        }
        String g = C58837ba.m90858g(hitTestResult.getExtra());
        Message obtainMessage = webView.getHandler().obtainMessage();
        webView.requestFocusNodeHref(obtainMessage);
        Bundle data = obtainMessage.getData();
        String g2 = C58837ba.m90858g(data.getString("title"));
        String g3 = C58837ba.m90858g(data.getString("url"));
        if (eVar == C43445e.IMAGE_LINK && g3.isEmpty()) {
            eVar = C43445e.IMAGE;
        }
        C43443c cVar = (C43443c) C43446f.f113498i.createBuilder();
        switch (eVar.ordinal()) {
            case 1:
                cVar.copyOnWrite();
                C43446f fVar = (C43446f) cVar.instance;
                fVar.f113500a |= 4;
                fVar.f113503d = g;
                cVar.copyOnWrite();
                C43446f fVar2 = (C43446f) cVar.instance;
                fVar2.f113500a |= 64;
                fVar2.f113507h = g2;
                break;
            case 2:
                cVar.copyOnWrite();
                C43446f fVar3 = (C43446f) cVar.instance;
                fVar3.f113500a |= 2;
                fVar3.f113502c = g;
                break;
            case 3:
                cVar.copyOnWrite();
                C43446f fVar4 = (C43446f) cVar.instance;
                fVar4.f113500a |= 2;
                fVar4.f113502c = g;
                cVar.copyOnWrite();
                C43446f fVar5 = (C43446f) cVar.instance;
                fVar5.f113500a |= 4;
                fVar5.f113503d = g3;
                break;
            case 4:
                cVar.copyOnWrite();
                C43446f fVar6 = (C43446f) cVar.instance;
                fVar6.f113500a |= 8;
                fVar6.f113504e = g;
                break;
            case 5:
                cVar.copyOnWrite();
                C43446f fVar7 = (C43446f) cVar.instance;
                fVar7.f113500a |= 16;
                fVar7.f113505f = g;
                break;
            case 6:
                cVar.copyOnWrite();
                C43446f fVar8 = (C43446f) cVar.instance;
                fVar8.f113500a |= 32;
                fVar8.f113506g = g;
                break;
        }
        cVar.copyOnWrite();
        C43446f fVar9 = (C43446f) cVar.instance;
        fVar9.f113501b = eVar.f113497h;
        fVar9.f113500a |= 1;
        this.f113531a.accept((C43446f) cVar.build());
    }
}

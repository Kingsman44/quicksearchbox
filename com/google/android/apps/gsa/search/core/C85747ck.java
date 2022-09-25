package com.google.android.apps.gsa.search.core;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.search.core.p6519al.p6568ax.C84756a;
import com.google.android.apps.gsa.search.core.service.C86640bg;
import com.google.android.apps.gsa.search.core.webview.C87265k;
import com.google.android.apps.gsa.search.core.webview.C87267m;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88210tf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88211tg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88212th;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.webview.C118117ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.ck */
/* compiled from: PG */
public final class C85747ck extends C85676c {

    /* renamed from: i */
    private static final C59071e f231829i = C59071e.m91332i("com.google.android.apps.gsa.search.core.ck");

    /* renamed from: e */
    public final C87265k f231830e;

    /* renamed from: f */
    public final C86640bg f231831f;

    /* renamed from: g */
    public final C87267m f231832g;

    /* renamed from: h */
    public C118117ag f231833h;

    /* renamed from: j */
    private final C68214a f231834j;

    /* renamed from: k */
    private final C22871g f231835k;

    /* renamed from: l */
    private Query f231836l;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C85747ck(com.google.android.apps.gsa.search.core.webview.C87265k r17, com.google.android.apps.gsa.p8852u.C118575h r18, com.google.android.apps.gsa.search.core.webview.C87277w r19, com.google.android.libraries.gsa.p1876k.C22871g r20, dagger.C68214a r21, android.content.Context r22, com.google.android.apps.gsa.search.core.google.C85923cq r23, dagger.C68214a r24, dagger.C68214a r25, dagger.C68214a r26, dagger.C68214a r27, com.google.android.libraries.p1730f.C21370a r28, com.google.android.apps.gsa.p8885y.C118827a r29, com.google.android.apps.gsa.shared.util.p7184t.C91097g r30, com.google.android.apps.gsa.search.core.C85751co r31) {
        /*
            r16 = this;
            r15 = r16
            r14 = r17
            r13 = r20
            com.google.android.apps.gsa.search.core.ch r3 = new com.google.android.apps.gsa.search.core.ch
            r3.<init>(r13, r14)
            android.content.pm.PackageManager r5 = r22.getPackageManager()
            r0 = r16
            r1 = r18
            r2 = r19
            r4 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r17
            r15.f231830e = r0
            com.google.android.apps.gsa.search.core.service.bg r1 = r17.mo80888l()
            r15.f231831f = r1
            r1 = r20
            r15.f231835k = r1
            r1 = r21
            r15.f231834j = r1
            com.google.android.apps.gsa.search.core.webview.m r0 = r17.mo80889m()
            r15.f231832g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.C85747ck.<init>(com.google.android.apps.gsa.search.core.webview.k, com.google.android.apps.gsa.u.h, com.google.android.apps.gsa.search.core.webview.w, com.google.android.libraries.gsa.k.g, dagger.a, android.content.Context, com.google.android.apps.gsa.search.core.google.cq, dagger.a, dagger.a, dagger.a, dagger.a, com.google.android.libraries.f.a, com.google.android.apps.gsa.y.a, com.google.android.apps.gsa.shared.util.t.g, com.google.android.apps.gsa.search.core.co):void");
    }

    /* renamed from: d */
    private final synchronized Query m137786d() {
        return this.f231836l;
    }

    /* renamed from: c */
    public final synchronized void mo79401c(Query query) {
        this.f231836l = query;
        this.f231832g.mo80906c();
    }

    @JavascriptInterface
    public boolean hasHomescreenShortcut(String str) {
        mo79206a(C118569b.JS_EXT_HAS_HOMESCREEN_SHORTCUT_CALL_COUNT);
        C59104x d = f231829i.mo56226d();
        d.mo56378ag(C58975e.f156826a, "JavascriptExtensions");
        ((C59052c) ((C59052c) d).mo56372aa(7518)).mo56386p("Homescreen Shortcuts APIs are not enabled.");
        return false;
    }

    @JavascriptInterface
    public void installHomescreenShortcut(String str, String str2, String str3, String str4) {
        mo79206a(C118569b.JS_EXT_INSTALL_HOMESCREEN_SHORTCUT_CALL_COUNT);
        C59104x d = f231829i.mo56226d();
        d.mo56378ag(C58975e.f156826a, "JavascriptExtensions");
        ((C59052c) ((C59052c) d).mo56372aa(7511)).mo56386p("Homescreen Shortcuts APIs are not enabled.");
    }

    @JavascriptInterface
    public void openImageViewer(String str) {
        mo79206a(C118569b.JS_EXT_OPEN_IMAGE_VIEWER_CALL_COUNT);
        C84756a aVar = (C84756a) this.f231834j.mo27525b();
        if (aVar != null) {
            aVar.mo78462a(str);
        }
    }

    @JavascriptInterface
    public void prewarmImageViewer() {
        mo79206a(C118569b.JS_EXT_PREWARM_IMAGE_VIEWER_CALL_COUNT);
        C84756a aVar = (C84756a) this.f231834j.mo27525b();
        if (aVar != null) {
            aVar.mo78463b();
        }
    }

    @JavascriptInterface
    public String registerReceiver(String str, String str2) {
        mo79206a(C118569b.JS_EXT_REGISTER_RECEIVER_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f231612b.mo80921a()) {
                return null;
            }
            return this.f231832g.mo80904a(str, str2);
        } catch (Throwable th) {
            C59104x c = f231829i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JavascriptExtensions");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7509)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void replaceSearchBoxText(String str) {
        mo79206a(C118569b.JS_EXT_REPLACE_SEARCH_BOX_CALL_COUNT);
        C88211tg tgVar = (C88211tg) C88212th.f238439c.createBuilder();
        tgVar.copyOnWrite();
        C88212th thVar = (C88212th) tgVar.instance;
        str.getClass();
        thVar.f238441a |= 1;
        thVar.f238442b = str;
        C87684al alVar = new C87684al(C88244um.REPLACE_SEARCH_BOX_TEXT);
        alVar.mo81965b(C88210tf.f238438a, (C88212th) tgVar.build());
        this.f231835k.mo28212l("Send service event", new C85745ci(this, alVar.mo81964a()));
    }

    @JavascriptInterface
    public void restoreWebpageScrollPosition(boolean z) {
        C118117ag agVar;
        mo79206a(C118569b.JS_EXT_RESTORE_WEBPAGE_SCROLL_POSITION_CALL_COUNT);
        if (z && (agVar = this.f231833h) != null) {
            agVar.f327772b.f327838s.mo80903z(agVar.f327771a);
        }
    }

    @JavascriptInterface
    public void sendGenericClientEvent(String str) {
        if (m137786d() != null) {
            super.sendGenericClientEvent(str);
            return;
        }
        C59104x d = f231829i.mo56226d();
        d.mo56378ag(C58975e.f156826a, "JavascriptExtensions");
        ((C59052c) ((C59052c) d).mo56372aa(7512)).mo56386p("sendGenericClientEvent called for null query");
    }

    @JavascriptInterface
    public void setNativeUiState(int i, int i2) {
        mo79206a(C118569b.JS_EXT_SET_NATIVE_UI_STATE_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            Query d = m137786d();
            if (d == null) {
                C59104x d2 = f231829i.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "JavascriptExtensions");
                ((C59052c) ((C59052c) d2).mo56372aa(7514)).mo56386p("setNativeUiState called for null query");
            } else if (!d.mo84416cw()) {
                this.f231835k.mo28212l("Set native UI state", new C85746cj(this, d, i, i2));
            }
        } catch (Throwable th) {
            C59104x c = f231829i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JavascriptExtensions");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7515)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public boolean unregisterReceiver(String str) {
        mo79206a(C118569b.JS_EXT_UNREGISTER_RECEIVER_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f231612b.mo80921a()) {
                return false;
            }
            return this.f231832g.mo80907d(str);
        } catch (Throwable th) {
            C59104x c = f231829i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JavascriptExtensions");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7520)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void updateHomescreenShortcut(String str, String str2, String str3, String str4) {
        mo79206a(C118569b.JS_EXT_UPDATE_HOMESCREEN_SHORTCUT_CALL_COUNT);
        C59104x d = f231829i.mo56226d();
        d.mo56378ag(C58975e.f156826a, "JavascriptExtensions");
        ((C59052c) ((C59052c) d).mo56372aa(7517)).mo56386p("Homescreen shortcut APIs are not enabled.");
    }
}
